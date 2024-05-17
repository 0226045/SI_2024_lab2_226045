package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Item> createList(Item... items){
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void noExceptionTest(){
        Item item1=new Item();
        Item item2=new Item();

        item1.setName(null);
        item1.setBarcode("0123");
        item1.setPrice(40);

        item2.setName(null);
        item2.setBarcode("123");
        item2.setPrice(40);

        assertTrue(SILab2.checkCart(createList(item1, item2), 100));

        Item onlyItem=new Item();

        onlyItem.setName("oneItem");
        onlyItem.setBarcode("1234");
        onlyItem.setPrice(4000);
        onlyItem.setDiscount(0.1F);

        assertFalse(SILab2.checkCart(createList(onlyItem), 100));
    }
    @Test
    void exceptionTest(){
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null,100));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));


        Item onlyItem = new Item();
        onlyItem.setBarcode("-1");

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(createList(onlyItem),100));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        onlyItem.setBarcode(null);

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(createList(onlyItem),100));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }
}