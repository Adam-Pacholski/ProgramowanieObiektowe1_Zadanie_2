public class Kabriolet extends Samochod{
    private boolean dach_otwarty;


    // konstruktory
    public Kabriolet() {
        System.out.println("konstruktor kabriolet");
        this.dach_otwarty = false;
    }

    public Kabriolet(String marka, int poj_baku, int predkosc_max, float zuzycie_paliwa) {
        super(marka, poj_baku, predkosc_max, zuzycie_paliwa);
        this.dach_otwarty = false;
    }

    // metody

    @Override
    public void jedz(float jakSzybko, float jakDaleko){
            float temp = getZuzycie_paliwa();
        if (dach_otwarty == true) {
                setZuzycie_paliwa(getZuzycie_paliwa()*(1+0.15F));
            System.out.println("Z otwartym dachem:");
            }
        else
            System.out.println("Z zamknietym dachem");
     super.jedz(jakSzybko, jakDaleko);
        setZuzycie_paliwa(temp);
    }

    public void otworz_dach(){
        this.dach_otwarty = true;
    }
    public void zamknij_dach(){
        this.dach_otwarty = false;
    }
    // gettery i settery
}
