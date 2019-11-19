package eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty;

import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.CodeMismatchException;
import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.IncorrectDoorCodeException;
import eu.jpereira.trainings.designpatterns.structural.adapter.model.Door;
import eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty.exceptions.CannotChangeCodeForUnlockedDoor;
import eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty.exceptions.CannotChangeStateOfLockedDoor;
import eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty.exceptions.CannotUnlockDoorException;

public class ThirdPartyDoorAdapter extends ThirdPartyDoor implements Door {
    @Override
    public void open(String code) throws IncorrectDoorCodeException {
        try {
            unlock(code);
            setState(DoorState.OPEN);
        } catch(CannotUnlockDoorException ex) {
            throw new IncorrectDoorCodeException(ex);
        } catch(CannotChangeStateOfLockedDoor ex) {
            throw new IncorrectDoorCodeException(ex);
        }
    }

    @Override
    public void close() {
        try {
            setState(DoorState.CLOSED);
            lock();
        } catch(CannotChangeStateOfLockedDoor ignored) { }
    }

    @Override
    public boolean isOpen() {
        if(getState()==DoorState.OPEN)
            return true;
        return false;
    }

    @Override
    public void changeCode(String oldCode, String newCode, String newCodeConfirmation) throws IncorrectDoorCodeException, CodeMismatchException {
        if(!newCode.equals(newCodeConfirmation))
            throw new CodeMismatchException();
        try {
            unlock(oldCode);
            setNewLockCode(newCode);
        } catch(CannotUnlockDoorException ex) {
            throw new IncorrectDoorCodeException(ex);
        } catch(CannotChangeCodeForUnlockedDoor ignored) { }
    }

    @Override
    public boolean testCode(String code) {
        try {
            unlock(code);
        } catch(CannotUnlockDoorException ex) {
            return false;
        } finally {
            lock();
            return true;
        }
    }
}
