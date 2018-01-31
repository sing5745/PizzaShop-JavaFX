/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza_Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pizzashop.CombosController;
import pizzashop.DipsController;
import pizzashop.MakeOwn;
import pizzashop.SidesController;
import pizzashop.SpecialsController;

/**
 *
 * @author inder
 */
public class PizzaFiles {

    public static String finalP = "";
    
    public static void writeToFileSpecials(ArrayList<Pizza> pizza) {
        try {
            //Identify the file
            File myFile = new File("SpecialsPizza.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

            bw.write("           Pizza Hunger        ");
            bw.newLine();
            bw.write("        5152 SquareOne Dr.     ");
            bw.newLine();
            bw.write("         Mississauga, ON       ");
            bw.newLine();
            bw.write("            L5R 2C9            ");
            bw.newLine();
            bw.write("*********************************");
            bw.newLine();

            for (Pizza p : pizza) {
                String[] parts = p.toFileString().split("\\|");

                bw.write(" Pizza Size " + parts[0]);
                bw.write(("                   " + parts[1]));
                bw.newLine();
                for (int i = 2; i < parts.length; i++) {
                    bw.write("   >" + parts[i]);
                    bw.newLine();
                }
                bw.newLine();
            }
            //to file string method used
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writeToFileCombos(ArrayList<Combos> combos) {
        try {
            //Identify the file
            File myFile = new File("Combos.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

           
                for (Combos c : combos) {
                String[] parts = c.toFileString().split("\\|");

                bw.newLine();
                bw.write(parts[0] + "            " + parts[2]);
                bw.newLine();
                bw.write((" **" + parts[1]));
                bw.newLine();
                if (Integer.parseInt(parts[3]) > 0) {
                    bw.write(" **Size " + parts[3]);
                    bw.newLine();
                   
                    if (parts.length>4) {
                        for (String s : parts[4].split(",")) {
                            bw.write("   >" + s);
                            bw.newLine();
                        }
                    }//if
                }
            }
            
            //to file string method used
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writeToFileCreateOwn(ArrayList<Pizza> pizza) {
        try {
            //Identify the file
            File myFile = new File("CustomPizza.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

            for (Pizza p : pizza) {
                bw.write(p.toString());
                bw.newLine();

            }
            //to file string method used
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writeToFileSides(ArrayList<Sides> side) {
        try {
            //Identify the file
            File myFile = new File("Sides.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

            for (Sides s : side) {
                String[] parts = s.toFileSideString().split("\\|");

                bw.write("Side: " + parts[0]);
                bw.write((" Price: " + parts[1]));
                bw.newLine();

            }
            //to file string method used
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writeToFileDips(ArrayList<String> dips) {
        try {
            //Identify the file
            File myFile = new File("Dips.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

            bw.write("Dips & Drinks");
            bw.newLine();
            for (String s : dips) {
                String[] parts = s.split(",");

                for (int i = 0; i < parts.length; i++) {
                    bw.write("  >" + parts[i]);
                    bw.newLine();

                }
            }

            //to file string method used
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void initReceipt(){
        try {
            //Identify the file
            File myFile = new File("Reciept.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile(),false);
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

           bw.write("           Pizza Hunger        ");
            bw.newLine();
            bw.write("        5152 SquareOne Dr.     ");
            bw.newLine();
            bw.write("         Mississauga, ON       ");
            bw.newLine();
            bw.write("            L5R 2C9            ");
            bw.newLine();
            bw.write("*********************************");
            bw.newLine();


            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }//init

    public static void printR(ArrayList<String> dips, ArrayList<Pizza> pizza, ArrayList<Pizza> pizza2,ArrayList<Sides> side,ArrayList<Combos> combos) {
        try {
            //Identify the file
            File myFile = new File("Reciept.txt");
            //Check if file exists.
            if (!myFile.exists()) {
                //If the file doesn't exist, create file.
                myFile.createNewFile();
            }
            //Open the file for writing
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            //Write to the file

           /* bw.write("           Pizza Hunger        ");
            bw.newLine();
            bw.write("        5152 SquareOne Dr.     ");
            bw.newLine();
            bw.write("         Mississauga, ON       ");
            bw.newLine();
            bw.write("            L5R 2C9            ");
            bw.newLine();
            bw.write("*********************************");
            bw.newLine();*/

            
            if (pizza != null) {
                bw.write("*****Specials*********");
                bw.newLine();
                for (Pizza p : pizza) {
                    String[] parts = p.toFileString().split("\\|");

                   
                    bw.write("Pizza Size " + parts[0]);
                    bw.write(("                    " + parts[1]));
                    bw.newLine();
                    for (int i = 2; i < parts.length; i++) {
                        bw.write("   >" + parts[i]);
                        bw.newLine();
                    }
                    bw.newLine();
                }
            }
            
            
            if (pizza2 != null) {
                bw.write("****Custom*********");
                bw.newLine();
                for (Pizza p : pizza2) {
                    String[] parts = p.toFileString().split("\\|");

                    bw.write("Pizza Size " + parts[0]);
                    bw.write(("                    " + parts[1]));
                    bw.newLine();
                    for (int i = 2; i < parts.length; i++) {
                        bw.write("   >" + parts[i]);
                        bw.newLine();
                    }
                    bw.newLine();
                }
            }
            
            if (dips != null) {
                bw.write("****Dips & Drinks*********");
                
                bw.write(("                    " + DipsController.fpDips));
                bw.newLine();
                
                for (String s : dips) {
                    String[] parts = s.split(",");

                    for (int i = 0; i < parts.length; i++) {
                        bw.write("  >" + parts[i]);
                        bw.newLine();

                    }
                }
            }
            
            if (side !=null)
            {
                bw.write("****Sides*********");
                bw.newLine();
                for (Sides s : side) {
                    String[] parts = s.toFileSideString().split("\\|");

                    bw.write(" >" + parts[0] + "   " + parts[1]);
                    
                    bw.newLine();

            }
            }
            
            if (combos != null) {
                bw.write("****Combos*********");
                for (Combos c : combos) {
                    String[] parts = c.toFileString().split("\\|");

                    bw.newLine();
                    bw.write(parts[0] + "            " + parts[2]);
                    bw.newLine();
                    bw.write((" **" + parts[1]));
                    bw.newLine();
                    if (Integer.parseInt(parts[3]) > 0) {
                        bw.write(" **Size " + parts[3]);
                        bw.newLine();

                        if (parts.length > 4) {
                            for (String s : parts[4].split(",")) {
                                bw.write("   >" + s);
                                bw.newLine();
                            }
                        }//if
                    }
                }
            }

            
            
            
            if (SpecialsController.fpSpecials != 0 && MakeOwn.fpMakeOwn != 0
                    && CombosController.fpCombos != 0
                    && DipsController.fpDips != 0 && SidesController.fpSides != 0) {

                bw.write("********************************");
                bw.newLine();
                double d = SpecialsController.fpSpecials + MakeOwn.fpMakeOwn + CombosController.fpCombos
                        + DipsController.fpDips + SidesController.fpSides;
                bw.write(" Subtotal     " + String.format("%.2f", d));
                double tax = d * 0.13;
                bw.newLine();
                bw.write(" HST         " + String.format("%.2f", tax));
                bw.newLine();
                bw.write(" Total      " + String.format("%.2f", tax + d));
                finalP = String.format("%.2f", tax + d);
            }
            
            
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    
    
    
    
    
    
    
    
}
