package com.company;

import java.util.Scanner;

public class Zad {
        public static void main(String[] args) {
    // write your code here
                System.out.println("Podaj liczbę ");
                Scanner sc = new Scanner(System.in);

                int suma = 4;
                int liczba = 1;

                do    {
                        liczba = sc.nextInt();
                        suma+=liczba;
                } while (liczba != 0);

                System.out.println("Suma tych liczb to: "+suma);

}
}
