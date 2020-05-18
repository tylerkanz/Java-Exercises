//Exercise 4.17 (Gas Mileage)
 // Author: Tyler Kanz

package com.kcook.mileage;
 
import java.util.Scanner;
 

public class GasMileage {
 
        public GasMileage(){
        }
         
        public void displayMilesPerGallon(){
             
            Scanner input = new Scanner (System.in);
             
            int miles;
            int gallons;
            int totalMiles;
            int totalGallons;
            double milesPerGallon;
             
            totalMiles = 0;
            totalGallons = 0;
             
            System.out.println("Enter mile driven or -1 to quit");
            miles = input.nextInt();
             
            System.out.println("Enter gallons of gas or press -1 to quit");
            gallons = input.nextInt();
             
            while (miles != -1 & gallons != -1){
                 
                totalMiles = totalMiles + miles;
                totalGallons = totalGallons + gallons;
                 
                System.out.println("Enter mile driven or -1 to quit");
                miles = input.nextInt();
                 
                System.out.println("Enter gallons of gas or press -1 to quit");
                gallons = input.nextInt();
                 
            }
             
            if(miles != 0 && gallons != 0){
                 
                milesPerGallon = (double)totalMiles / totalGallons;
                System.out.println("Miles per gallon used is: " + milesPerGallon);
            }
            else{
                System.out.println("No miles or gallons entered");
            }
             
        }
         
    }