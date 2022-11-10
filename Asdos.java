public class Asdos extends Mahasiswa{
    private int jamAsdos;

    public Asdos(String nama, int sks, int jamAsdos){
        super(nama, sks);
        jamSibuk = jamSibuk + jamAsdos;

    }

    public int getJamSibuk(){
        return jamSibuk;
    }

    public void cetak(){
        System.out.println(nama + " adalah seorang asdos dengan jam sibuk " + jamSibuk);
    }
    
}
