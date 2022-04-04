package org.rplbo.utsnota;

public class KertasHVS extends Barang{
    private int gram;

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public KertasHVS(String kodebarang,int harga,int berat,String deskripsi,int gram) {
        this.gram = gram;
        this.setDeskripsi(deskripsi);
        this.setKodebarang(kodebarang);
        this.setHarga(harga);
        this.setBerat(berat);
    }
    public void getInformasi(){
        System.out.println("Kode : "+getKodebarang());
        System.out.println("Harga : "+getHarga());
        System.out.println("Berat : "+getBerat());
        System.out.println("Deskripsi : "+getDeskripsi());
        System.out.println("Gram : "+getGram());
        System.out.println("-----------------------------------------");
    }
}
