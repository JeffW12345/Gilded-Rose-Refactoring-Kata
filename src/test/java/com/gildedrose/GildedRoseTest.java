package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {


    @Test
    void does_AgedBrieQualityCalc_Work_Where_Existing_Val_Under_Fifty(){
        Item agedBrie = new Item("Aged brie", 10, 49);
        new CalcQualityAgedBrie().setQualityScore(agedBrie);
        assertEquals(50, agedBrie.quality);
    }
    @Test
    void does_AgedBrieQualityCalc_Work_Where_Existing_Val_Fifty(){
        Item agedBrie = new Item("Aged brie", 10, 50);
        new CalcQualityAgedBrie().setQualityScore(agedBrie);
        assertEquals(50, agedBrie.quality);
    }
    @Test
    void does_AgedBrieQualityCalc_Work_Where_Existing_Val_Over_Fifty(){
        Item agedBrie = new Item("Aged brie", 10, 51);
        new CalcQualityAgedBrie().setQualityScore(agedBrie);
        assertEquals(51, agedBrie.quality);
    }

    @Test
    void does_BackstageTicketsQualityCalc_Increment_Quality_By_Two_If_Less_Than_11_Days_Left(){
        Item ticket = new Item("ticket", 10, 10);
        new CalcQualityBackstageTickets().setQualityScore(ticket);
        assertEquals(12, ticket.quality);
    }

    @Test
    void does_BackstageTicketsQualityCalc_Increment_Quality_By_Three_If_Less_Than_6_Days_Left(){
        Item ticket = new Item("ticket", 5, 10);
        new CalcQualityBackstageTickets().setQualityScore(ticket);
        assertEquals(13, ticket.quality);
    }

    @Test
    void does_BackstageTicketsQualityCalc_Increment_Quality_Go_To_Zero_If_Sell_By_Date_Less_Than_One(){
        Item ticket = new Item("ticket", 0, 10);
        new CalcQualityBackstageTickets().setQualityScore(ticket);
        assertEquals(0, ticket.quality);
    }

    @Test
    void does_BackstageTicketsQualityCalc_Not_Change_Quality_If_More_Than_Ten_Days_Left(){
    Item ticket = new Item("ticket", 11, 11);
    new CalcQualityBackstageTickets().setQualityScore(ticket);
    assertEquals(11, ticket.quality);
    }

    @Test
    void does_BackstageTicketsQualityCalc_Not_Increment_If_Quality_Already_Above_49(){
        Item ticket = new Item("ticket", 5, 50);
        new CalcQualityBackstageTickets().setQualityScore(ticket);
        assertEquals(50, ticket.quality);
    }
    @Test
    void does_Standard_Calc_New_SellBy_Decrement_The_Sell_By_One(){
        Item ticket = new Item("ticket", 1, 50);
        new CalcSellInStandard().setSellIn(ticket);
        assertEquals(0, ticket.sellIn);
    }

    @Test
    void does_Standard_Quality_Calc_Decrement_By_Two_If_Sell_By_Date_Passed(){
        Item ticket = new Item("ticket", -1, 10);
        new CalcQualityStandard().setQualityScore(ticket);
        assertEquals(8, ticket.quality);
    }

    @Test

    void does_Update_Quality_All_Method_Update_List_Items(){
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

        Items products = new Items(items.length);
        products.itemsList = items;
        products.updateQualityAll();
        assertEquals(19, items[0].quality);
    }

    @Test

    void does_Update_Sell_By_Date_All_Method_Update_List_Items(){
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

        Items products = new Items(items.length);
        products.itemsList = items;
        products.updateSellByAll();
        assertEquals(9, items[0].sellIn);
    }

}
