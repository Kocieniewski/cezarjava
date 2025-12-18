package org.example;

public class SzyfrCezara {

   private static final int ROZMIAR_ALFABETU = 26;

   public String zaszyfruj(String tekst, int klucz) {
      char[] wynik = new char[tekst.length()];
      int przesuniecie = klucz % ROZMIAR_ALFABETU;

      for (int i = 0; i < tekst.length(); i++) {
         char znak = tekst.charAt(i);

         if (Character.isWhitespace(znak)) {
            wynik[i] = znak;
            continue;
         }

         int kod = znak + przesuniecie;

         kod = (kod > 'z') ? kod - ROZMIAR_ALFABETU : kod;
         kod = (kod < 'a') ? kod + ROZMIAR_ALFABETU : kod;

         wynik[i] = (char) kod;
      }

      return new String(wynik);
   }

}
