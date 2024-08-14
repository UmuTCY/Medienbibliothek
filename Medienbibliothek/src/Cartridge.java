import java.util.Scanner;

public class Cartridge extends Medium {

    private boolean vollstaendigesSet;
    private String entwicklerstudio;
    private Konsolentyp konsolentyp;

    public Cartridge(String titel, double wert, String standort, boolean vollstaendigesSet, String entwicklerstudio, Konsolentyp konsolentyp){
        super(titel, wert, standort);
        this.vollstaendigesSet = vollstaendigesSet;
        this.entwicklerstudio = entwicklerstudio;
        this.konsolentyp = konsolentyp;

    }

    public Cartridge(){

    }

    public boolean getVollstaendigesSet(){
        return this.vollstaendigesSet;
    }

    public void setVollstaendigesSet(boolean vollstaendigesSet){
        this.vollstaendigesSet = vollstaendigesSet;
    }

    public String getEntwicklerstudio(){
        return this.entwicklerstudio;
    }

    public void setEntwicklerstudio(String entwicklerstudio){
        this.entwicklerstudio = entwicklerstudio;
    }

    public Konsolentyp getKonsolentyp(){
        return this.konsolentyp;
    }

    public void setKonsolentyp(Konsolentyp konsolentyp){
        this.konsolentyp = konsolentyp;
    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("[Cartridge:] " + ", VollstaendigesSet: " + getVollstaendigesSet() + ", Entwicklerstudio: " + getEntwicklerstudio() + ", Konsolentyp: " + getKonsolentyp());

    }

    public void eingabe() {
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

        System.out.println("Ist es ein vollständiges Set? y - ja, n - nein");
        String eingabe = scan.nextLine();
        setVollstaendigesSet(eingabe.equalsIgnoreCase("y"));

        System.out.println("Geben sie das Entwicklerstudio ein: ");
        String entwicklerstudio = scan.nextLine();
        setEntwicklerstudio(entwicklerstudio);

        System.out.println("Wählen sie den Konsolentyp: 1:N64, 2:WiiU, 3:Wii, 4:Sega_Megadrive, 5:DreiDS, 6:GBA, 7:NES ");
        int auswahl = scan.nextInt();
        scan.nextLine();
        Konsolentyp konsolentyp = Konsolentyp.values()[auswahl -1];
        setKonsolentyp(konsolentyp);


    }


}
