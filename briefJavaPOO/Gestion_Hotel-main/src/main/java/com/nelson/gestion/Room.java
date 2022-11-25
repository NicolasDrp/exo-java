package com.nelson.gestion;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int id;
    private int category;
    private int capacity;
    private int price;

    private List<Options> options = new ArrayList<>();

    public Room(int id, int category, int capacity, int price){
        this.category = category;
        this.capacity = capacity;
        this.price = price;
        this.id = id;
    }

    public void addOptions(Options options){
        this.options.add(options);
    }

    public List<Options> getOptions(){
        return options;
    }

    public int getCategory(){
        return category;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getPrice(){
        return price;
    }

    public int getId(){
        return id;
    }

}
