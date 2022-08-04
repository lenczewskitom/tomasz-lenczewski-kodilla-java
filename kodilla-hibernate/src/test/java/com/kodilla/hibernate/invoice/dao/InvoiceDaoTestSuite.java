package com.kodilla.hibernate.invoice.dao;

import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product bike = new Product("Bike");
        Product car = new Product("Car");

        Item item1 = new Item(bike, new BigDecimal(1000),2);
        Item item2 = new Item(car, new BigDecimal(20000), 1);
        Item item3 = new Item(bike, new BigDecimal(1500), 3);

        Invoice invoice = new Invoice("13/21122022");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When

        productDao.save(bike);
        productDao.save(car);
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
