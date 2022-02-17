package com.mrmindteam.syriancards.models;

public class Order {
    private int id;
    private String card_name;
    private String card_type;
    private int quantity;
    private String date;
    private int status;

    public Order(int id, String card_name, String card_type, int quantity, String date, int status) {
        this.id = id;
        this.card_name = card_name;
        this.card_type = card_type;
        this.quantity = quantity;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCard_name() {
        return card_name;
    }

    public String getCard_type() {
        return card_type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }
}
