/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FruitPriceSorter;

/**
 *
 * @author Computer Lab 3
 */
public class Fruit {

   
    private String fruitId;
    private String name;
    private double price;

    public Fruit(String fruitId, String name, double price) {
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
    }

    public String getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    
}


