/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package eu.jpereira.trainings.designpatterns.creational.factorymethod;

import static org.junit.Assert.*;

import eu.jpereira.trainings.designpatterns.creational.factorymethod.html.HTMLReportGenerator;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.json.JSONReportGenerator;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.pdf.PDFReportGenerator;
import eu.jpereira.trainings.designpatterns.creational.factorymethod.xml.XMLReportGenerator;
import org.junit.Test;

public class ReportGeneratorTest extends AbstractReportingTest{

	@Test
	public void testCreateJSONReport() {
		ReportData reportData = createDummyReportData();
		ReportGenerator generator = new JSONReportGenerator();
		Report generatedReport = generator.generateReport(reportData);
		assertEquals("JSON Report. Name: "+reportData.getName(), generatedReport.getReportContent());
	}
	
	
	@Test
	public void testCreateXMLReport() {
		ReportData reportData = createDummyReportData();
		ReportGenerator generator = new XMLReportGenerator();
		Report generatedReport = generator.generateReport(reportData);
		assertEquals("XML Report. Name: "+reportData.getName(), generatedReport.getReportContent());
	}
	
	@Test
	public void testCreateHTMLReport() {
		ReportData reportData = createDummyReportData();
		ReportGenerator generator = new HTMLReportGenerator();
		Report generatedReport = generator.generateReport(reportData);
		assertEquals("HTML Report. Name: "+reportData.getName(), generatedReport.getReportContent());
	}
	
	@Test
	public void testCreatePDFReport() {
		ReportData reportData = createDummyReportData();
		ReportGenerator generator = new PDFReportGenerator();
		Report generatedReport = generator.generateReport(reportData);
		assertEquals("PDF Report. Name: "+reportData.getName(), generatedReport.getReportContent());
	}
}
