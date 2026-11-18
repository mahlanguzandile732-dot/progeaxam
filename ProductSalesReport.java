/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ProductSalesReport {

    private static Product productReport;

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Single-dimensional array storing product names
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array storing monthly sales
        int[][] sales = new int[3][3];

        // Single-dimensional array storing total sales per product
        int[] productTotals = new int[3];

        int totalSales = 0;
        double averageSales;
        int highestSales = 0;
        int popularProduct = 0;

        // Enter sales information for each product
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(
                    "Enter number of sales for month "
                    + (j + 1) + " for " + products[i]
                    + " mattress: "
                );

                sales[i][j] = input.nextInt();

                // Add sales for the current product
                productTotals[i] += sales[i][j];

                // Add sales to overall total
                totalSales += sales[i][j];
            }

            System.out.println();
        }

        // Calculate the average sales per monthly entry
        averageSales = (double) totalSales / 9;

        // Find the most popular product using total sales
        for (int i = 0; i < products.length; i++) {

            if (productTotals[i] > highestSales) {

                highestSales = productTotals[i];

                popularProduct = i;
            }
        }

        // Display the sales report
        PrintProduct printer = new PrintProduct();
        printer.PrintTotalProductSales(productReport);

System.out.println();
System.out.println("PRODUCT SALES REPORT - 2026");

System.out.println("****************************************");

printer.PrintTotalProductSales(productReport);

printer.PrintAverageProductSales(productReport);

printer.PrintMostPopularProduct(productReport);

System.out.println("****************************************");
    }
    
	}
