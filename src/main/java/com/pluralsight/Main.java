package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<DealershipVehicales> dealershipVehicles;
    private static final FileManager fileManager = new FileManager("Dealership1Vehicles.csv");

    public static void main(String[] args) {

        dealershipVehicles = fileManager.getDealershipVehiclesFromFile();
        MainMenu();

    }

    private static void MainMenu() {

        Scanner scanner = new Scanner(System.in);

        //Dealership d = new Dealership(.getDealershipName(), .getDealershipAddress , .getDealershipPhone );

        String MainMenu = "Welcome to" + d.getDealershipName + " Dealership \n" +
                "(S) Search for Vehicle " + "(L) List All Vehicles \n" +
                "(A) Add a Vehicle " + "(R) Remove a Vehicle \n" + "(Q) Quit";

        String option;

        do {

            System.out.println(MainMenu);
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("S")) {

                SearchForVehicle();

            }
            else if (option.equalsIgnoreCase("L")) {

                ListAllVehicles();

            }
            else if (option.equalsIgnoreCase("A")) {

                AddAVehicles();

            } else if (option.equalsIgnoreCase("R")) {

                RemoveAVehicle();

            }
            else {
                System.out.println("No Menu option matches this input please try again");
                MainMenu();
            }

        } while (!option.equalsIgnoreCase("Q"));

    }

    private static void SearchForVehicle() {

       String SearchForVehicleMenu = "Search for a " + d.getDealershipName + " Vehicle By: \n" +
               "(1) Price Range " + "(2) Make and Model \n" +
               "(3) Year Range " + "(4) Color \n" +
               "(5) Mileage Range " + "(6) Vehicle Type \n" +
               "(B) Back To Main Menu " + "(Q) Quit";

        String option;

        do {
            System.out.println(SearchForVehicleMenu);
            option = scanner.nextLine();

           if (option.equalsIgnoreCase("1")) {

        } else if (option.equalsIgnoreCase("2")) {

        } else if (option.equalsIgnoreCase("3")) {

        } else if (option.equalsIgnoreCase("4")) {

        } else if (option.equalsIgnoreCase("5")) {

        } else if (option.equalsIgnoreCase("6")) {

        } else if (option.equalsIgnoreCase("B")) {

        } else {
            System.out.println("Ummm... I don't know how to search that up try again or ask Google.");
        }
    } while (!option.equalsIgnoreCase("Q"));

    }

    private static void ListAllVehicles(){

        String ListAllVehiclesMenu = "The " + d.getDealershipName + " Dealership Vehicle List \n" +
                "Sort By: \n" +
                "(1) Oldest Vehicle " + "(2) Newest Vehicle \n" +
                "(3) Lowest Price " + "(4) Highest Price \n" +
                "(5) Lowest Mileage  " + "(6) Highest Mileage \n" +
                "(B) Back To Main Menu " + "(Q) Quit";

        String option;

        do {
            System.out.println(ListAllVehiclesMenu);
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("1")) {

            } else if (option.equalsIgnoreCase("2")) {

            } else if (option.equalsIgnoreCase("3")) {

            } else if (option.equalsIgnoreCase("4")) {

            } else if (option.equalsIgnoreCase("5")) {

            } else if (option.equalsIgnoreCase("6")) {

            } else if (option.equalsIgnoreCase("B")) {

            } else {
                System.out.println("Ummm... I don't know how to search that up try again or ask Google.");
            }
        } while (!option.equalsIgnoreCase("Q"));


    }

    private static void AddAVehicles(){

        System.out.println("Add A Vehicle\n" + "(C) Cancel");

    }

    private static void RemoveAVehicle(){

    }


}
