public class Mahasiswa extends Elemen {
    private int sks;

    public Mahasiswa (String nama, int sks){
        super(nama);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk(){
        return jamSibuk;
    }

    public void cetak(){
        System.out.println(nama + " adalah seorang mahasiswa dengan jam sibuk " + jamSibuk);
    }
}
