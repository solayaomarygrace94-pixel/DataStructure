/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FruitPriceSorter;

/**
 *
 * @author Computer Lab 3
 */

public class BubbleSort {

    public static void sort(Product[] products) {

        for (int i = 0; i < products.length - 1; i++) {

            for (int j = 0; j < products.length - 1 - i; j++) {

                // Compare the quantity of Product objects
                if (products[j].getQuantity() > products[j + 1].getQuantity()) {

                    // Swap the Product objects
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
}
