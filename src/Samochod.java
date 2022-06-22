public class Samochod {
    private String marka;
    private int poj_baku;
    private int predkosc_max;
    private float zuzycie_paliwa;

    // Konstruktory

    public Samochod() {
        System.out.println("konstruktor samochod");
        this.marka = "Nieznana";
        this.poj_baku = 0;
        this.predkosc_max = 0;
        this.zuzycie_paliwa = 0.0F;
    }

    public Samochod(String marka, int poj_baku, int predkosc_max, float zuzycie_paliwa) {
        this.marka = marka;
        this.poj_baku = poj_baku;
        this.predkosc_max = predkosc_max;
        this.zuzycie_paliwa = zuzycie_paliwa;
    }

    // metody

    public void jedz(float jakSzybko, float jakDaleko){

        System.out.println("Auto porusza sie z predkoscia: " + jakSzybko +"Km/h");
        System.out.println("Zakladajac ze zaczynamy poroz z pelnym bakiem.");

        if(jakSzybko > this.predkosc_max)
            System.out.println("Auto nie moze pojechac z ta predkoscia, maksymalna predkosc dla pojazdu to: "+ this.predkosc_max);
        else if (jakSzybko == this.predkosc_max) {

            float tankowanie = (int) (jakDaleko/100 * this.zuzycie_paliwa/poj_baku)-1;

            if(tankowanie > (int)tankowanie){
                tankowanie =  tankowanie +1;
                System.out.println("Aby przejechac droge: " + jakDaleko + "Km potrzeba: "+jakDaleko/100*zuzycie_paliwa+ "L. paliwa");
                System.out.println("I trzeba bedzie tankowac: " + (int)tankowanie +  " razy");
            }
            else{
                System.out.println("Aby przejechac droge: " + jakDaleko + "Km potrzeba: "+jakDaleko/100*zuzycie_paliwa+ "L. paliwa");
                System.out.println("I trzeba bedzie tankowac: " + (int)tankowanie +  " razy");}
        }
        else {

            float tankowanie =  (jakDaleko/100 * this.zuzycie_paliwa/poj_baku)-1;
            if(tankowanie > (int)tankowanie){
                tankowanie =  tankowanie +1;
                System.out.println("Aby przejechac droge: " + jakDaleko + "Km potrzeba: "+jakDaleko/100*zuzycie_paliwa+ "L. paliwa");
                System.out.println("Trzeba bedzie tankowac: " + (int)tankowanie +  " razy");
            }
            else{
                System.out.println("Aby przejechac droge: " + jakDaleko + " potrzeba: "+jakDaleko/100*zuzycie_paliwa+ "L. paliwa");
                System.out.println("Trzeba bedzie tankowac: " + (int)tankowanie +  " razy");}
        }
        System.out.println();

    }

    public void wypisz(){
        System.out.println("Marka: " + this.marka);
        System.out.println("Pojemnosc baku: " + this.poj_baku);
        System.out.println("Predkosc max: " + this.predkosc_max);
        System.out.println("Spalanie: " + this.zuzycie_paliwa + "100/Km");
        System.out.println();
    }

    // gettery i Settery

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPoj_baku() {
        return poj_baku;
    }

    public void setPoj_baku(int poj_baku) {
        this.poj_baku = poj_baku;
    }

    public int getPredkosc_max() {
        return predkosc_max;
    }

    public void setPredkosc_max(int predkosc_max) {
        this.predkosc_max = predkosc_max;
    }

    public float getZuzycie_paliwa() {
        return zuzycie_paliwa;
    }

    public void setZuzycie_paliwa(float zuzycie_paliwa) {
        this.zuzycie_paliwa = zuzycie_paliwa;
    }
}
