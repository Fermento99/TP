package eu.jpereira.trainings.designpatterns.structural.facade;

import eu.jpereira.trainings.designpatterns.structural.facade.model.Book;
import eu.jpereira.trainings.designpatterns.structural.facade.model.Customer;
import eu.jpereira.trainings.designpatterns.structural.facade.model.DispatchReceipt;
import eu.jpereira.trainings.designpatterns.structural.facade.model.Order;
import eu.jpereira.trainings.designpatterns.structural.facade.service.*;

public class DefaultBookstoreFacade implements BookstoreFacade {
    BookDBService bookDB;
    CustomerDBService customerDB;
    CustomerNotificationService customerNotification;
    OrderingService orderingService;
    WharehouseService wharehouseService;
    @Override
    public void placeOrder(String customerId, String isbn) {
        Customer client = customerDB.findCustomerById(customerId);
        Book book = bookDB.findBookByISBN(isbn);
        Order order = orderingService.createOrder(client, book);
        DispatchReceipt receipt = wharehouseService.dispatch(order);
        customerNotification.notifyClient(order);
        customerNotification.notifyClient(receipt);
    }

    public void setBookDB(BookDBService bookDB) {
        this.bookDB = bookDB;
    }

    public void setCustomerDB(CustomerDBService customerDB) {
        this.customerDB = customerDB;
    }

    public void setCustomerNotification(CustomerNotificationService customerNotification) {
        this.customerNotification = customerNotification;
    }

    public void setOrderingService(OrderingService orderingService) {
        this.orderingService = orderingService;
    }

    public void setWarehouseService(WharehouseService wharehouseService) {
        this.wharehouseService = wharehouseService;
    }
}
