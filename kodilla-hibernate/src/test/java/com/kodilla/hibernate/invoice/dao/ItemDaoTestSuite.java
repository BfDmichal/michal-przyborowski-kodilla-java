package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemDaoTestSuite {
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testSuite(){
        //Given
        Product product = new Product("orange");
        productDao.save(product);
        Invoice invoice = new Invoice("1");
        Item item = new Item(product,new BigDecimal(2),4,new BigDecimal(4),invoice);
        Item item1 = new Item(product,new BigDecimal(5),8,new BigDecimal(1),invoice);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        //When
        invoiceDao.save(invoice);
        //Then
        Assert.assertNotEquals(0,invoice.getId());
        Assert.assertNotEquals(0,item.getId());
        Assert.assertNotEquals(0,item1.getId());
        //CleanUp
        productDao.deleteById(product.getId());
        invoiceDao.deleteById(invoice.getId());
    }
}