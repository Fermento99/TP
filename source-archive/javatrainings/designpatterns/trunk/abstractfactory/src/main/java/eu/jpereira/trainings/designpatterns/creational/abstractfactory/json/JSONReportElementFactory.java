package eu.jpereira.trainings.designpatterns.creational.abstractfactory.json;

import eu.jpereira.trainings.designpatterns.creational.abstractfactory.AbstractReportElementFactory;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFooter;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportHeader;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.json.JSONReportBody;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.json.JSONReportFooter;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.json.JSONReportHeader;

public class JSONReportElementFactory extends AbstractReportElementFactory {
    @Override
    public ReportBody createReportBody() {
        return new JSONReportBody();

    }
    @Override
    public ReportFooter createReportFooter() {
        return new JSONReportFooter();

    }
    @Override
    public ReportHeader createReportHeader() {
        return new JSONReportHeader();
    }
}
