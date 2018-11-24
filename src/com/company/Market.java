package com.company;

public class Market {

    String marketName;

    public Item[] items;

    public int itemsLength;



    public Market() {

    }

    public Market(String marketName, Item[] items) {

        this.marketName = marketName;
        this.items = items;
    }

    public void addItem(Item item) {

        items[itemsLength] = item;

        itemsLength++;

    }

    void displayItems() {

        System.out.println(marketName);

        for (int i = 0; i < itemsLength; i++) {

            if (items[i] != null) {

                items[i].printDetail();
            }
        }

    }
}