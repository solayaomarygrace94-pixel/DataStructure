/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FruitPriceSorter;

/**
 *
 * @author Computer Lab 3
 */
class SortingAlgorithm {
    public static void sort(Fruit[] fruits) {

        for (int i = 0; i < fruits.length - 1; i++) {

            for (int j = 0; j < fruits.length - 1 - i; j++) {

                // Compare the price of the Fruit objects
                if (fruits[j].getPrice() > fruits[j + 1].getPrice()) {

                    // Swap the Fruit objects
                    Fruit temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
        }
    }
}
