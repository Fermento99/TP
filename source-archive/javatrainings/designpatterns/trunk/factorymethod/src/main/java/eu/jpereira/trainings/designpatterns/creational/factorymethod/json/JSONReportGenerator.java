package eu.jpereira.trainings.designpatterns.creational.factorymethod.json;

import eu.jpereira.trainings.designpatterns.creational.factorymethod.Report;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.ReportGenerator;

public class JSONReportGenerator extends ReportGenerator {
    @Override
    protected Report instantiateReport() {
        return new JSONReport();
    }
}