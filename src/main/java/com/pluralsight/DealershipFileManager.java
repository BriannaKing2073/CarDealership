package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class DealershipFileManager {


    private String fileName;


    //Constructor
    public void FileManager(String fileName) {
        this.fileName = fileName;
    }

    //Getter and Setter
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<DealershipVehicles> getDealershipVehiclesFromFile(){

        ArrayList<DealershipVehicles> result = new ArrayList<DealershipVehicles>();

        try{

            FileReader fileReader = new FileReader(fileName);

            //read through every line in the file, and for each line create a transaction, and then
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String thisLine;

            while ((thisLine = bufferedReader.readLine()) != null) {

                // System.out.println(thisLine);

                DealershipVehicles createdDealershipVehicles = getDealshipVehiclesFromEncodedString(thisLine);

                result.add(createdDealershipVehicles);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("There was an error reading from the file.");
        }
        //Collections.sort(numbers.getDate);

        return result;
    }

    private DealshipVehicles getDealshipVehiclesFromEncodedString(String encodedDealshipVehicles) {

        String[] temp = encodedDealshipVehicles.split(Pattern.quote("|"));
        //Use only to view errors System.out.println(encodedTransaction);
        if (encodedDealshipVehicles.equalsIgnoreCase(temp[0] = String"")){
            String dealershipName = temp[0].trim();
            String dealershipAddress = temp[1].trim();
            String dealershipPhone = temp[2].trim();


            DealshipVehicles result = new DealshipVehicles(dealershipName, dealershipAddress, dealershipPhone);
        }
        else if (encodedDealshipVehicles.equalsIgnoreCase(temp[0] = int)) {
            int vin = temp[0].trim();
            int year = temp[1].trim();


        }


        return result;
    }

    //updateDealshipVehiclesFile
    public void updateDealshipVehiclesFile(DealshipVehicles newDealshipVehicles){

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(newDealshipVehicles.getEncodedDealshipVehiclesString());
            System.out.println("Your new DealshipVehicles is complete.DealshipVehicles have been updated.");

        }catch (IOException e){
            System.out.println("An error has been encountered: " + e.getMessage());
        }
    }


}
