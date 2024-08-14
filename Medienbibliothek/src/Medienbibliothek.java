import java.util.*;

public class Medienbibliothek {

    private ArrayList<Medium> medienliste;

    public Medienbibliothek(){
        this.medienliste = new ArrayList<>();
    }

    public void medienHinzufuegen(Medium m){
        this.medienliste.add(m);
    }

    public void alleMedienAusgeben(){
        for(Medium m : medienliste){
            System.out.println("------------------------------------------------------------------------------------");
            m.anzeigen();
        }
    }

    public void zeigeVHS(){
        for(Medium m : medienliste){
            if(m instanceof VHS){
                m.anzeigen();
            }
        }
    }

    public void zeigeCartridge(){
        for(Medium m : medienliste){
            if(m instanceof Cartridge){
                m.anzeigen();
            }
        }
    }

    public void zeigeBuch(){
        for(Medium m : medienliste){
            if(m instanceof Buch){
                m.anzeigen();
            }
        }
    }

    public boolean medienEntfernen(String titel){
        for(Medium m : medienliste){
            if(m.getTitel().equalsIgnoreCase(titel)){
                medienliste.remove(m);
                System.out.println("Medium: " + titel + " wurde entfernt. ");
                return true;
            }
        }
        System.out.println("Kein Medium mit dem Titel " + titel + " gefunden");
        return false;
    }

}
