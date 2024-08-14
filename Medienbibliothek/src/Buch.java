import java.util.*;
public class Buch extends Medium{

    private String autor;
    private int seitenanzahl;
    private String genre;

    public Buch(String titel, double wert, String standort, String autor, int seitenanzahl, String genre){
        super(titel,wert,standort);
        this.autor = autor;
        this.seitenanzahl = seitenanzahl;
        this.genre = genre;
    }

    public Buch(){

    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getSeitenanzahl(){
        return this.seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl){
        this.seitenanzahl = seitenanzahl;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void eingabe(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Biite geben sie den Titel ein: ");
        String titel = scan.nextLine();
        setTitel(titel);

        System.out.println("Geben sie den Wert ein: ");
        double wert = scan.nextDouble();
        setWert(wert);
        scan.nextLine();

        System.out.println("Geben sie den Standort ein: ");
        String standort = scan.nextLine();
        setStandort(standort);

        System.out.println("Geben sie den Autor ein: ");
        this.autor = scan.nextLine();

        System.out.println("Geben sie die Seitenanzahl ein: ");
        this.seitenanzahl = scan.nextInt();
        scan.nextLine();

        System.out.println("Geben sie das Genre ein: ");
        this.genre = scan.nextLine();

    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("[Buch:] " + ", Autor: " + getAutor() + ", Seitenanzahl: " + getSeitenanzahl() + ", Genre: " + getGenre());
    }


}
