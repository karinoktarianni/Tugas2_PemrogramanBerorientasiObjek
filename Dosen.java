public class Dosen extends Elemen {
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk(){
        return jamSibuk;
    }

    public void cetak(){
        System.out.println(nama + " adalah seorang dosen dengan jam sibuk" + jamSibuk);
    
    }
    
}
