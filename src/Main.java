public class Main {
    public static void main(String[] args) {
        Samochod nieznany = new Samochod();
        nieznany.wypisz();
        Samochod corsa = new Samochod("Opel", 45, 195, 11.2F);
        corsa.wypisz();
        corsa.jedz(130,756);


        Kabriolet mustang = new Kabriolet("Ford",61,267,13.7F);
        mustang.wypisz();
        mustang.otworz_dach();
        mustang.jedz(180,1458);
        mustang.zamknij_dach();
        mustang.jedz(180,1458);

    }
}