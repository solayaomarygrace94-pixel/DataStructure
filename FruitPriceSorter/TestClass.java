/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FruitPriceSorter;

/**
 *
 * @author Computer Lab 3
 */
class TestClass {
    
public static void main(String[] args) {

        // Create at least 8 Fruit objects
        Fruit[] fruits = {
            new Fruit("F001", "Apple", 45.50),
            new Fruit("F002", "Banana", 25.00),
            new Fruit("F003", "Mango", 60.75),
            new Fruit("F004", "Orange", 35.25),
            new Fruit("F005", "Grapes", 80.00),
            new Fruit("F006", "Watermelon", 120.50),
            new Fruit("F007", "Pineapple", 95.75),
            new Fruit("F008", "Strawberry", 150.00)
        };

        // Display fruits before sorting
        System.out.println("========================================");
        System.out.println("        FRUITS BEFORE SORTING");
        System.out.println("========================================");

        displayFruits(fruits);

        // Sort fruits based on price
        SortingAlgorithm.sort(fruits);

        // Display fruits after sorting
        System.out.println("\n========================================");
        System.out.println("        FRUITS AFTER SORTING");
        System.out.println("========================================");

        displayFruits(fruits);

        // Display Top 3 cheapest fruits
        System.out.println("\n========================================");
        System.out.println("        TOP 3 CHEAPEST FRUITS");
        System.out.println("========================================");

        int topCount = Math.min(3, fruits.length);

        for (int i = 0; i < topCount; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
    }

    // Method to display all fruits
    public static void displayFruits(Fruit[] fruits) {

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
    

   
}