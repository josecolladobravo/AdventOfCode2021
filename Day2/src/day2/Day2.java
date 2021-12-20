/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day2;

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
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> vectorForward = new ArrayList<>();
        ArrayList<Integer> vectorDown = new ArrayList<>();
        ArrayList<Integer> vectorUp = new ArrayList<>();
        char primerCaracter = ' ';
        char ultimoCaracter = ' ';
        int numero = 0;
        int numeroNegativo = 0; //ejercicio 2
        int sumaVerticalGlobal = 0; //ejercicio 2
        int sumaVerticalParcial = 0; //ejercicio 2

        //carga de datos
        var archivo = new File("datos.txt");
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine(); //lee la primera linea
            primerCaracter = lectura.charAt(0);//obtiene el primer caracter de la línea, así identifico que si es 'forward, up o down'
            ultimoCaracter = lectura.charAt(lectura.length() - 1);//obtiene el último caracter de la línea, ya que necesito el número para después operar con él
            numero = Character.getNumericValue(ultimoCaracter);//transformor el 'char' de la línea anterior a 'int' para poder insertarlo en el ArrayList

            switch (primerCaracter) {
                case 'f':
                    vectorForward.add(numero);
                    sumaVerticalGlobal = numero * sumaVerticalParcial; //ejercicio 2
                    break;
                case 'd':
                    vectorDown.add(numero);
                    sumaVerticalParcial += numero; //ejercicio 2
                    break;
                case 'u':
                    vectorUp.add(numero);
                    numeroNegativo = numero * -1; //ejercicio 2
                    sumaVerticalParcial += numeroNegativo; //ejercicio 2
                    break;
            }

            while (lectura != null) { //lee hasta la última línea

                lectura = entrada.readLine();
                if (lectura == null) //cuando esté en la última línea se sale y deja de leer e insertar
                {
                    break;
                }
                primerCaracter = lectura.charAt(0);
                ultimoCaracter = lectura.charAt(lectura.length() - 1);
                numero = Character.getNumericValue(ultimoCaracter);

                switch (primerCaracter) {
                    case 'f':
                        vectorForward.add(numero); 
                        sumaVerticalGlobal += numero * sumaVerticalParcial; //ejercicio 2
                        break;
                    case 'd':
                        vectorDown.add(numero);
                        sumaVerticalParcial += numero; //ejercicio 2
                        break;
                    case 'u':
                        vectorUp.add(numero);
                        numeroNegativo = numero * -1; //ejercicio 2
                        sumaVerticalParcial += numeroNegativo; //ejercicio 2
                        break;
                }
            }

            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        //ejercicio 1
        int sumaForward = 0;
        int sumaDown = 0;
        int sumaUp = 0;
        int totalVertical = 0;

        for (int i = 0; i < vectorForward.size(); i++) {
            sumaForward += vectorForward.get(i);
        }

        for (int i = 0; i < vectorDown.size(); i++) {
            sumaDown += vectorDown.get(i);
        }

        for (int i = 0; i < vectorUp.size(); i++) {
            sumaUp += vectorUp.get(i);
        }

        sumaUp = sumaUp * -1;
        totalVertical = sumaUp + sumaDown;

        System.out.println("La respuesta es : " + totalVertical * sumaForward);

        //ejercicio 2
        System.out.println("La respuesta dos del día dos es : " + sumaForward*sumaVerticalGlobal);
    }

}
