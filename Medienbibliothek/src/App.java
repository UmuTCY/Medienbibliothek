import java.util.*;

public class App {

    private static Medienbibliothek bib = new Medienbibliothek();

    public static void main(String[] args) {

        ausgabe();

    }

        public static void ausgabe() {
            Scanner scan = new Scanner(System.in);
            int auswahl;


            do {
                System.out.println(" 1 - Eingabe VHS \n 2 - Eingabe Cartridge \n 3 - Eingabe Buch \n 4 - Alle Medien ausgeben \n 5 - Bestimmtes Medium ausgeben \n 6 - Medium löschen \n 7 - Programm beenden");
                auswahl = scan.nextInt();
                scan.nextLine();
                if (auswahl == 1) {
                    VHS neuVHS = new VHS();
                    neuVHS.eingabe();
                    bib.medienHinzufuegen(neuVHS);
                }else if(auswahl == 2){
                    Cartridge neuCartridge = new Cartridge();
                    neuCartridge.eingabe();
                    bib.medienHinzufuegen(neuCartridge);
                }else if(auswahl == 3){
                    Buch neuBuch = new Buch();
                    neuBuch.eingabe();
                    bib.medienHinzufuegen(neuBuch);
                }else if(auswahl == 4){
                    bib.alleMedienAusgeben();
                }else if(auswahl == 5){
                    ausgabeMedium();
                }else if(auswahl == 6){
                    mediumLoeschen();
                }else if(auswahl == 7){
                    System.out.println("Auf Wiedersehen! ");
                }else{
                    System.out.println("Bitte wählen sie zwischen 1 - 7");
                }
            }while(auswahl != 7);

        }


        public static void ausgabeMedium(){
            Scanner scan = new Scanner(System.in);
            int eingabe;

            do{
                System.out.println("Welches Medium wollen sie ausgeben 1 - VHS, 2 - Cartridge, 3 - Buch");
                eingabe = scan.nextInt();
                scan.nextLine();
                if(eingabe == 1){
                    bib.zeigeVHS();
                }else if(eingabe == 2){
                    bib.zeigeCartridge();
                }else if(eingabe == 3){
                    bib.zeigeBuch();
                }else{
                    System.out.println("Ungültige eingabe. ");
                }

            }while(eingabe < 1 || eingabe > 3);
        }

        public static void mediumLoeschen(){
           Scanner scan = new Scanner(System.in);
            System.out.println("Geben sie den Titel des Mediums ein das Sie löschen möchten: ");
            String titel = scan.nextLine();

            boolean entfernt = bib.medienEntfernen(titel);
            if(!entfernt){
                System.out.println("Das Medium konnte nicht gefunden werden: ");
            }
        }

    }
