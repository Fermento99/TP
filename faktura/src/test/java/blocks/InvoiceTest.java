package blocks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    @Test
        /* package */ void testTotalValue1() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item1", 14.90, 0.05, 16));
        testTab.add(new InvoiceElement("item2", 357, 0.23, 100));
        testTab.add(new InvoiceElement("item3", 23.47, 0.08, 3));
        Invoice test = new Invoice("", 1, new Client(), testTab);
        assertEquals(36008.81, test.totalValue());
    }

    @Test
        /* package */ void testTotalValue2() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item4", 14, 0.05, 5));
        testTab.add(new InvoiceElement("item5", .01, 0.23, 83));
        testTab.add(new InvoiceElement("item6", 43, 0.08, 14));
        testTab.add(new InvoiceElement("item7", 5.99, 0.05, 58));
        Invoice test = new Invoice("", 1, new Client(), testTab);
        assertEquals(1020.25, test.totalValue());
    }

    @Test
        /* package */ void testTotalValue3() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item8", 500, 0.02, 2));
        testTab.add(new InvoiceElement("item9", 10.01, 0.07, 25));
        Invoice test = new Invoice("", 1, new Client(), testTab);
        assertEquals(1250.25, test.totalValue());
    }

    @Test
        /* package */ void testTotalTax1() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item1", 14.90, 0.05, 16));
        testTab.add(new InvoiceElement("item2", 357, 0.23, 100));
        testTab.add(new InvoiceElement("item3", 23.47, 0.08, 3));
        Invoice test = new Invoice("", 1, new Client(), testTab);
        assertEquals(8228.54, test.totalTax());
    }

    @Test
        /* package */ void testTotalTax2() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item4", 14, 0.05, 5));
        testTab.add(new InvoiceElement("item5", .01, 0.23, 83));
        testTab.add(new InvoiceElement("item6", 43, 0.08, 14));
        testTab.add(new InvoiceElement("item7", 5.99, 0.05, 58));
        Invoice test = new Invoice("", 1, new Client(), testTab);
        assertEquals(69.22, test.totalTax());
    }

    @Test
        /* package */ void testTotalTax3() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item8", 500, 0.02, 2));
        testTab.add(new InvoiceElement("item9", 10.01, 0.07, 25));
        Invoice test = new Invoice("", 1, new Client(), testTab);
        assertEquals(37.51, test.totalTax());
    }

}