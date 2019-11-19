package eu.jpereira.trainings.designpatterns.creational.builder;

import eu.jpereira.trainings.designpatterns.creational.builder.model.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.builder.xml.XMLReportBodyBuilder;

public interface ReportBodyBuilder {
    ReportBodyBuilder setCustomerName(String customerName);
    ReportBodyBuilder setCustomerPhone(String phoneNumber);
    ReportBodyBuilder withItems();
    ReportBodyBuilder newItem(String name, int quantity, double price);
    ReportBody getReportBody();
}
