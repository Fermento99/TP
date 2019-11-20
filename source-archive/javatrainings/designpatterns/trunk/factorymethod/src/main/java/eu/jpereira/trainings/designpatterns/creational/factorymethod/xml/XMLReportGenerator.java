package eu.jpereira.trainings.designpatterns.creational.factorymethod.xml;

import eu.jpereira.trainings.designpatterns.creational.factorymethod.Report;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.ReportGenerator;

public class XMLReportGenerator extends ReportGenerator {
    @Override
    protected Report instantiateReport() {
        return new XMLReport();
    }
}
