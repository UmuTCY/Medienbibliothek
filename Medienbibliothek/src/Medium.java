public class Medium {

    private String titel;
    private double wert;
    private String standort;

    public Medium(String titel, double wert, String standort){
        this.titel = titel;
        this.wert = wert;
        this.standort = standort;
    }

    public Medium(){

    }

    public String getTitel(){
        return this.titel;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public double getWert(){
        return this.wert;
    }

    public void setWert(double wert){
        this.wert = wert;
    }

    public String getStandort(){
        return this.standort;
    }

    public void setStandort(String standort){
        this.standort = standort;
    }

    public void anzeigen(){
        System.out.println("Titel: " + getTitel() + ", Wert: " + getWert() + ", Standort: " + getStandort());
    }
}
