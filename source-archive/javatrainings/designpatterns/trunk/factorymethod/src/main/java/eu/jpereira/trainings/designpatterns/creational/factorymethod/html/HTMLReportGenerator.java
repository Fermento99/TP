package eu.jpereira.trainings.designpatterns.creational.factorymethod.html;

import eu.jpereira.trainings.designpatterns.creational.factorymethod.Report;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.ReportGenerator;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected Report instantiateReport() {
        return new HTMLReport();
    }
}
