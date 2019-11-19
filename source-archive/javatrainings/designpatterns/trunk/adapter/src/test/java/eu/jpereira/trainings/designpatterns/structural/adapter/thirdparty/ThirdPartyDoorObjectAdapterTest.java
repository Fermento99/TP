package eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty;

import eu.jpereira.trainings.designpatterns.structural.adapter.DoorTest;
import eu.jpereira.trainings.designpatterns.structural.adapter.model.Door;

public class ThirdPartyDoorObjectAdapterTest extends DoorTest {
    @Override
    protected Door createDoorUnderTest() {
        return new ThirdPartyDoorObjectAdapter();
    }
    @Override
    protected String getDefaultDoorCode() {
        return ThirdPartyDoor.DEFAULT_CODE;
    }
}
