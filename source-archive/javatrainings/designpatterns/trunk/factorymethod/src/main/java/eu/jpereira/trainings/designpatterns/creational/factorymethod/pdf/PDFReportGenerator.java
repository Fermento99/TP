package eu.jpereira.trainings.designpatterns.creational.factorymethod.pdf;

import eu.jpereira.trainings.designpatterns.creational.factorymethod.Report;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.ReportGenerator;

public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected Report instantiateReport() {
        return new PDFReport();
    }
}
