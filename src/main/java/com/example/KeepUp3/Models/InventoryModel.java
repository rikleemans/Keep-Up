package com.example.KeepUp3.Models;

public class InventoryModel {
    public String id;
    public String name;
    public String amount;
    public String date;

    public InventoryModel(String id, String name, String amount, String date )
    {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public InventoryModel(){
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return id;
    }
    public String getAmount() {
        return id;
    }
    public String getDate() {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setAmount (String amount) {
        this.amount = amount;
    }
    public void setDate (String date) {
        this.date = date;
    }
}
