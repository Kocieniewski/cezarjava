package org.example;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner wejscie = new Scanner(System.in);
      SzyfrCezara szyfr = new SzyfrCezara();

      System.out.print("Tekst do zaszyfrowania: ");
      String tekst = wejscie.nextLine();

      System.out.print("Klucz (liczba całkowita): ");
      int klucz = wejscie.nextInt();

      System.out.println("Zaszyfrowany tekst: " + szyfr.zaszyfruj(tekst, klucz));

      wejscie.close();

   }
}