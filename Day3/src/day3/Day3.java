package day3;

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
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> tasaGamma = new ArrayList<>();
        ArrayList<Integer> tasaEpsilon = new ArrayList<>();

        ArrayList<Integer> columna1 = new ArrayList<>();
        ArrayList<Integer> columna2 = new ArrayList<>();
        ArrayList<Integer> columna3 = new ArrayList<>();
        ArrayList<Integer> columna4 = new ArrayList<>();
        ArrayList<Integer> columna5 = new ArrayList<>();
        ArrayList<Integer> columna6 = new ArrayList<>();
        ArrayList<Integer> columna7 = new ArrayList<>();
        ArrayList<Integer> columna8 = new ArrayList<>();
        ArrayList<Integer> columna9 = new ArrayList<>();
        ArrayList<Integer> columna10 = new ArrayList<>();
        ArrayList<Integer> columna11 = new ArrayList<>();
        ArrayList<Integer> columna12 = new ArrayList<>();

        char primerCaracter = ' ';
        char segundoCaracter = ' ';
        char terceroCaracter = ' ';
        char cuartoCaracter = ' ';
        char quintoCaracter = ' ';
        char sextoCaracter = ' ';
        char septimoCaracter = ' ';
        char octavoCaracter = ' ';
        char novenoCaracter = ' ';
        char decimoCaracter = ' ';
        char undecimoCaracter = ' ';
        char duodecimoCaracter = ' ';

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int numero5 = 0;
        int numero6 = 0;
        int numero7 = 0;
        int numero8 = 0;
        int numero9 = 0;
        int numero10 = 0;
        int numero11 = 0;
        int numero12 = 0;

        var archivo = new File("datos.txt");
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine(); //lee la primera linea

            primerCaracter = lectura.charAt(0);
            segundoCaracter = lectura.charAt(1);
            terceroCaracter = lectura.charAt(2);
            cuartoCaracter = lectura.charAt(3);
            quintoCaracter = lectura.charAt(4);
            sextoCaracter = lectura.charAt(5);
            septimoCaracter = lectura.charAt(6);
            octavoCaracter = lectura.charAt(7);
            novenoCaracter = lectura.charAt(8);
            decimoCaracter = lectura.charAt(9);
            undecimoCaracter = lectura.charAt(10);
            duodecimoCaracter = lectura.charAt(11);

            numero1 = Character.getNumericValue(primerCaracter);
            numero2 = Character.getNumericValue(segundoCaracter);
            numero3 = Character.getNumericValue(terceroCaracter);
            numero4 = Character.getNumericValue(cuartoCaracter);
            numero5 = Character.getNumericValue(quintoCaracter);
            numero6 = Character.getNumericValue(sextoCaracter);
            numero7 = Character.getNumericValue(septimoCaracter);
            numero8 = Character.getNumericValue(octavoCaracter);
            numero9 = Character.getNumericValue(novenoCaracter);
            numero10 = Character.getNumericValue(decimoCaracter);
            numero11 = Character.getNumericValue(undecimoCaracter);
            numero12 = Character.getNumericValue(duodecimoCaracter);

            switch (numero1) {
                case 0:
                    columna1.add(numero1);
                    break;
                case 1:
                    columna1.add(numero1);
                    break;
            }
            switch (numero2) {
                case 0:
                    columna2.add(numero2);
                    break;
                case 1:
                    columna2.add(numero2);
                    break;
            }
            switch (numero3) {
                case 0:
                    columna3.add(numero3);
                    break;
                case 1:
                    columna3.add(numero3);
                    break;
            }
            switch (numero4) {
                case 0:
                    columna4.add(numero4);
                    break;
                case 1:
                    columna4.add(numero4);
                    break;
            }
            switch (numero5) {
                case 0:
                    columna5.add(numero5);
                    break;
                case 1:
                    columna5.add(numero5);
                    break;
            }
            switch (numero6) {
                case 0:
                    columna6.add(numero6);
                    break;
                case 1:
                    columna6.add(numero6);
                    break;
            }
            switch (numero7) {
                case 0:
                    columna7.add(numero7);
                    break;
                case 1:
                    columna7.add(numero7);
                    break;
            }
            switch (numero8) {
                case 0:
                    columna8.add(numero8);
                    break;
                case 1:
                    columna8.add(numero8);
                    break;
            }
            switch (numero9) {
                case 0:
                    columna9.add(numero9);
                    break;
                case 1:
                    columna9.add(numero9);
                    break;
            }
            switch (numero10) {
                case 0:
                    columna10.add(numero10);
                    break;
                case 1:
                    columna10.add(numero10);
                    break;
            }
            switch (numero11) {
                case 0:
                    columna11.add(numero11);
                    break;
                case 1:
                    columna11.add(numero11);
                    break;
            }
            switch (numero12) {
                case 0:
                    columna12.add(numero12);
                    break;
                case 1:
                    columna12.add(numero12);
                    break;
            }

            while (lectura != null) { //lee hasta la última línea

                lectura = entrada.readLine();

                if (lectura == null) //cuando esté en la última línea se sale y deja de leer e insertar
                {
                    break;
                }

                primerCaracter = lectura.charAt(0);
                segundoCaracter = lectura.charAt(1);
                terceroCaracter = lectura.charAt(2);
                cuartoCaracter = lectura.charAt(3);
                quintoCaracter = lectura.charAt(4);
                sextoCaracter = lectura.charAt(5);
                septimoCaracter = lectura.charAt(6);
                octavoCaracter = lectura.charAt(7);
                novenoCaracter = lectura.charAt(8);
                decimoCaracter = lectura.charAt(9);
                undecimoCaracter = lectura.charAt(10);
                duodecimoCaracter = lectura.charAt(11);

                numero1 = Character.getNumericValue(primerCaracter);
                numero2 = Character.getNumericValue(segundoCaracter);
                numero3 = Character.getNumericValue(terceroCaracter);
                numero4 = Character.getNumericValue(cuartoCaracter);
                numero5 = Character.getNumericValue(quintoCaracter);
                numero6 = Character.getNumericValue(sextoCaracter);
                numero7 = Character.getNumericValue(septimoCaracter);
                numero8 = Character.getNumericValue(octavoCaracter);
                numero9 = Character.getNumericValue(novenoCaracter);
                numero10 = Character.getNumericValue(decimoCaracter);
                numero11 = Character.getNumericValue(undecimoCaracter);
                numero12 = Character.getNumericValue(duodecimoCaracter);

                switch (numero1) {
                    case 0:
                        columna1.add(numero1);
                        break;
                    case 1:
                        columna1.add(numero1);
                        break;
                }
                switch (numero2) {
                    case 0:
                        columna2.add(numero2);
                        break;
                    case 1:
                        columna2.add(numero2);
                        break;
                }
                switch (numero3) {
                    case 0:
                        columna3.add(numero3);
                        break;
                    case 1:
                        columna3.add(numero3);
                        break;
                }
                switch (numero4) {
                    case 0:
                        columna4.add(numero4);
                        break;
                    case 1:
                        columna4.add(numero4);
                        break;
                }
                switch (numero5) {
                    case 0:
                        columna5.add(numero5);
                        break;
                    case 1:
                        columna5.add(numero5);
                        break;
                }
                switch (numero6) {
                    case 0:
                        columna6.add(numero6);
                        break;
                    case 1:
                        columna6.add(numero6);
                        break;
                }
                switch (numero7) {
                    case 0:
                        columna7.add(numero7);
                        break;
                    case 1:
                        columna7.add(numero7);
                        break;
                }
                switch (numero8) {
                    case 0:
                        columna8.add(numero8);
                        break;
                    case 1:
                        columna8.add(numero8);
                        break;
                }
                switch (numero9) {
                    case 0:
                        columna9.add(numero9);
                        break;
                    case 1:
                        columna9.add(numero9);
                        break;
                }
                switch (numero10) {
                    case 0:
                        columna10.add(numero10);
                        break;
                    case 1:
                        columna10.add(numero10);
                        break;
                }
                switch (numero11) {
                    case 0:
                        columna11.add(numero11);
                        break;
                    case 1:
                        columna11.add(numero11);
                        break;
                }
                switch (numero12) {
                    case 0:
                        columna12.add(numero12);
                        break;
                    case 1:
                        columna12.add(numero12);
                        break;
                }

            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        int contador11 = 0;
        int contador12 = 0;
        int contador13 = 0;
        int contador14 = 0;
        int contador15 = 0;
        int contador16 = 0;
        int contador17 = 0;
        int contador18 = 0;
        int contador19 = 0;
        int contador110 = 0;
        int contador111 = 0;
        int contador112 = 0;
        int contador01 = 0;
        int contador02 = 0;
        int contador03 = 0;
        int contador04 = 0;
        int contador05 = 0;
        int contador06 = 0;
        int contador07 = 0;
        int contador08 = 0;
        int contador09 = 0;
        int contador010 = 0;
        int contador011 = 0;
        int contador012 = 0;

        for (int i = 0; i < columna1.size(); i++) {
            if (columna1.get(i) == 0) {
                contador01++;
            } else {
                contador11++;
            }
        }

        for (int i = 0; i < columna2.size(); i++) {
            if (columna2.get(i) == 0) {
                contador02++;
            } else {
                contador12++;
            }
        }

        for (int i = 0; i < columna3.size(); i++) {
            if (columna3.get(i) == 0) {
                contador03++;
            } else {
                contador13++;
            }
        }

        for (int i = 0; i < columna4.size(); i++) {
            if (columna4.get(i) == 0) {
                contador04++;
            } else {
                contador14++;
            }
        }

        for (int i = 0; i < columna5.size(); i++) {
            if (columna5.get(i) == 0) {
                contador05++;
            } else {
                contador15++;
            }
        }

        for (int i = 0; i < columna6.size(); i++) {
            if (columna6.get(i) == 0) {
                contador06++;
            } else {
                contador16++;
            }
        }

        for (int i = 0; i < columna7.size(); i++) {
            if (columna7.get(i) == 0) {
                contador07++;
            } else {
                contador17++;
            }
        }

        for (int i = 0; i < columna8.size(); i++) {
            if (columna8.get(i) == 0) {
                contador08++;
            } else {
                contador18++;
            }
        }

        for (int i = 0; i < columna9.size(); i++) {
            if (columna9.get(i) == 0) {
                contador09++;
            } else {
                contador19++;
            }
        }

        for (int i = 0; i < columna10.size(); i++) {
            if (columna10.get(i) == 0) {
                contador010++;
            } else {
                contador110++;
            }
        }

        for (int i = 0; i < columna11.size(); i++) {
            if (columna11.get(i) == 0) {
                contador011++;
            } else {
                contador111++;
            }
        }

        for (int i = 0; i < columna12.size(); i++) {
            if (columna12.get(i) == 0) {
                contador012++;
            } else {
                contador112++;
            }
        }

        if (contador01 > contador11) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }

        if (contador02 > contador12) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador03 > contador13) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador04 > contador14) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador05 > contador15) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador06 > contador16) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador07 > contador17) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador08 > contador18) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador09 > contador19) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador010 > contador110) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador011 > contador111) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }
        if (contador012 > contador112) {
            tasaGamma.add(0);
            tasaEpsilon.add(1);
        } else {
            tasaGamma.add(1);
            tasaEpsilon.add(0);
        }

        
        System.out.println("Vector gamma : " + tasaGamma.toString());
        System.out.println("Vector gamma : " + tasaEpsilon.toString());
        
        
        
        int valorGamma = 1565;
        int valorEpsilon = 2530;
        
        int consumoDeEnergia = valorGamma * valorEpsilon;
        
        System.out.println("El consumo de energia es de : " + consumoDeEnergia);
    }

}
