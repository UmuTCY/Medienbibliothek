import java.util.*;
public class VHS extends Medium {

    private double spieldauer;
    private String filmqualitaet;

    public VHS(String titel, double wert, String standort, double spieldauer, String filmqualitaet){
        super(titel, wert, standort);
        this.spieldauer = spieldauer;
        this.filmqualitaet = filmqualitaet;
    }

    public VHS(){

    }

    public double getSpieldauer(){
        return this.spieldauer;
    }

    public void setSpieldauer(double spieldauer){
        this.spieldauer = spieldauer;
    }

    public String getFilmqualitaet(){
        return this.filmqualitaet;
    }

    public void setFilmqualitaet(String filmqualitaet){
        this.filmqualitaet = filmqualitaet;
    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("[VHS:] " + ", Spieldauer: " + getSpieldauer() + ", Filmqualitaet: " + getFilmqualitaet());

    }

    public void eingabe(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben sie den Titel ein: ");
        String titel = scan.nextLine();
        setTitel(titel);

        System.out.println("Geben sie den Wert ein: ");
        double wert = scan.nextDouble();
        scan.nextLine();
        setWert(wert);

        System.out.println("Geben sie den Standort ein: ");
        String standort = scan.nextLine();
        setStandort(standort);

        System.out.println("Geben sie die Spieldauer ein: ");
        this.spieldauer = scan.nextDouble();
        scan.nextLine();

        System.out.println("Geben sie die Filmqualität ein: ");
        this.filmqualitaet = scan.nextLine();

    }
}
