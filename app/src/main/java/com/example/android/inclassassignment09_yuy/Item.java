package com.example.android.inclassassignment09_yuy;

public class Item {
    private String name;
    private int number;
    private boolean isInStock;

    public Item() {
    }

    public Item(String name, int number, boolean isInStock) {
        this.name = name;
        this.number = number;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String toString(){
        return "Item{"+"name='"+name+'\''+", number='"+number+'\''+", isInStock="+isInStock+'}';
    }
}

