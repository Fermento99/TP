package blocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceElementTest {

    @Test
        /* package */ void testTotalValue1() {
        InvoiceElement test = new InvoiceElement("jablko", 3.89, .08, 4);
        assertEquals(15.56, test.totalValue());
    }

    @Test
        /* package */ void testTotalValue2() {
        InvoiceElement test = new InvoiceElement("cegla", .99, .23, 100);
        assertEquals(99, test.totalValue());
    }

    @Test
        /* package */ void testTotalValue3() {
        InvoiceElement test = new InvoiceElement("kolo", 57.70, .02, 2);
        assertEquals(115.4, test.totalValue());
    }

    @Test
        /* package */ void testTotalTax1() {
        InvoiceElement test = new InvoiceElement("jablko", 3.89, .08, 4);
        assertEquals(1.24, test.totalTax());
    }

    @Test
        /* package */ void testTotalTax2() {
        InvoiceElement test = new InvoiceElement("cegla", .99, .23, 100);
        assertEquals(22.77, test.totalTax());
    }

    @Test
        /* package */ void testTotalTax3() {
        InvoiceElement test = new InvoiceElement("kolo", 57.70, .02, 2);
        assertEquals(2.30, test.totalTax());
    }
}