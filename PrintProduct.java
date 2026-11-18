/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
  
      // Method to print total product sales
    public void PrintTotalProductSales(Product product) {

        System.out.println(
            "TOTAL PRODUCT SALES: "
            + product.GetTotalProductsSold()
        );
    }

    // Method to print average product sales
    public void PrintAverageProductSales(Product product) {

        System.out.printf(
            "AVERAGE PRODUCT SALES: %.0f%n",
            product.GetAverageProductsSold()
        );
    }

    // Method to print the most popular product
    public void PrintMostPopularProduct(Product product) {

        System.out.println(
            "MOST POPULAR PRODUCT: "
            + product.GetMostPopularProduct()
            + " (" + product.GetMostPopularProductTotal() + ")"
        );
    }
}
