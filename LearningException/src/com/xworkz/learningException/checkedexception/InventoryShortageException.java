package com.xworkz.learningException.checkedexception;

public class InventoryShortageException extends Exception {

    private final String itemSku;
    private final int availableStock;

    public InventoryShortageException(String itemSku, int availableStock, String message) {
        super(message);
        this.itemSku = itemSku;
        this.availableStock = availableStock;
    }


    public String getItemSku() { return itemSku; }
    public int getAvailableStock() { return availableStock; }
}