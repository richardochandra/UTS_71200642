package org.rplbo.utsnota;

public class BukuTulis extends Barang{
    private String merk;

    public BukuTulis(String kodebarang,int harga,int berat,String deskripsi,String merk) {
        this.merk = merk;
        this.setDeskripsi(deskripsi);
        this.setKodebarang(kodebarang);
        this.setHarga(harga);
        this.setBerat(berat);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }
    public void getInformasi(){
        System.out.println("Kode : "+getKodebarang());
        System.out.println("Harga : "+getHarga());
        System.out.println("Berat : "+getBerat());
        System.out.println("Deskripsi : "+getDeskripsi());
        System.out.println("Merk : "+getMerk());
        System.out.println("-----------------------------------------");
    }

}
