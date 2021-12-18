/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Josec
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        ArrayList<Integer> vector = new ArrayList<>();

        var archivo = new File("datos.txt");
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine(); //lee la primera linea
            try {
                vector.add(Integer.parseInt(lectura));
            } catch (NumberFormatException e) {
                e.printStackTrace(System.out);
            }
            while (lectura != null) { //lee hasta la última línea
                //System.out.println("lectura: " + lectura);
                lectura = entrada.readLine();

                try {
                    vector.add(Integer.parseInt(lectura));
                } catch (NumberFormatException e) {
                    //e.printStackTrace(System.out);
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        

        //ejercicio 1
        int contador = 0;
        for (int i = 1; i < vector.size(); i++) {
            
                
            if(vector.get(i)>vector.get(i-1)){
                contador++;
            }
        }
        
        System.out.println("El número de incrementos es: " + contador);



        //ejercicio 2
        var contador2 = 0;
        ArrayList<Integer> vectorSuma = new ArrayList<>();
        var suma = 0;
        for (int i = 2; i < vector.size(); i++) { //va desde 0 hasta 1999

            suma = vector.get(i - 2) + vector.get(i - 1) + vector.get(i);
            vectorSuma.add(suma);
        }

        for (int i = 1; i < vectorSuma.size(); i++) {

            if (vectorSuma.get(i) > vectorSuma.get(i - 1)) {
                contador2++;
            }
        }
        System.out.println("El número de incrementos es: " + contador2);
    }
}
