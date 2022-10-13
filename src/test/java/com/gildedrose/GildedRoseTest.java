package com.gildedrose;

import com.gildedrose.updatableitem.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    private Item agedBrie;
    private Item ticket;
    private Item sulfuras;
    private Item standard;
    private UpdatableItem updatableItem;

    @Test

    void does_Brie_Quality_Increment_By_One_If_Under_50(){
        agedBrie = new Item("Brie", 10, 10);
        updatableItem = new AgedBrie(agedBrie);
        updatableItem.update();
        assertEquals(11, agedBrie.quality);
    }
    @Test
    void does_Brie_Sellin_Decrement_By_One(){
        agedBrie = new Item("Brie", 10, 10);
        updatableItem = new AgedBrie(agedBrie);
        updatableItem.update();
        assertEquals(9, agedBrie.sellIn);
    }

    @Test
    void does_Ticket_Quality_Increment_By_One_If_Quality_Below_50_And_Sellin_Above_10(){
        ticket = new Item("Ticket", 11, 10);
        updatableItem = new BackstageTickets(ticket);
        updatableItem.update();
        assertEquals(11, ticket.quality);
    }
    @Test
    void does_Ticket_Quality_Increment_By_Two_If_Quality_Below_50_And_Sellin_Less_Than_11_But_Above_5(){
        ticket = new Item("Ticket", 10, 10);
        updatableItem = new BackstageTickets(ticket);
        updatableItem.update();
        assertEquals(12, ticket.quality);
    }
    @Test
    void does_Ticket_Quality_Increment_By_Three_If_Quality_Below_50_And_Sellin_Less_Than_6(){
        ticket = new Item("Ticket", 5, 10);
        updatableItem = new BackstageTickets(ticket);
        updatableItem.update();
        assertEquals(13, ticket.quality);
    }

    @Test
    void does_Ticket_Sellin_Decrement_By_One(){
        ticket = new Item("Ticket", 5, 10);
        updatableItem = new BackstageTickets(ticket);
        updatableItem.update();
        assertEquals(4, ticket.sellIn);
    }

    @Test
    void is_Ticket_Quality_Set_To_Zero_If_Sellin_Less_Than_Zero(){
        ticket = new Item("Ticket", -1, 10);
        updatableItem = new BackstageTickets(ticket);
        updatableItem.update();
        assertEquals(0, ticket.quality);
    }

    @Test
    void are_There_No_Quality_Changes_To_Sulfuras(){
        sulfuras = new Item("Surfuras", 20, 20);
        updatableItem = new Sulfuras(sulfuras);
        updatableItem.update();
        assertEquals(20, sulfuras.quality);
    }
    @Test
    void are_There_No_Sellin_Changes_To_Sulfana(){
        sulfuras = new Item("Surfuras", 20, 20);
        updatableItem = new Sulfuras(sulfuras);
        updatableItem.update();
        assertEquals(20, sulfuras.sellIn);
    }

    @Test
    void do_Standard_Products_Quality_Decrement_By_1_If_Sellin_Above_Zero(){
        standard = new Item("Standard", 11, 10);
        updatableItem = new StandardRules(standard);
        updatableItem.update();
        assertEquals(9, standard.quality);
    }
    @Test
    void do_Standard_Products_Quality_Decrement_By_Two_If_Sellin_Below_One(){
        standard = new Item("Standard", 0, 10);
        updatableItem = new StandardRules(standard);
        updatableItem.update();
        assertEquals(8, standard.quality);
    }

    @Test
    void do_Standard_Products_Sellin_Decrement_By_One(){
        standard = new Item("Standard", 10, 10);
        updatableItem = new StandardRules(standard);
        updatableItem.update();
        assertEquals(9, standard.sellIn);
    }

}
