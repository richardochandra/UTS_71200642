package org.rplbo.utsnota;

public class Pulpen extends Barang {
    private String warna;

    public Pulpen(String kodebarang, int harga, int berat, String deskripsi,String warna) {
        this.warna = warna;
        this.setDeskripsi(deskripsi);
        this.setKodebarang(kodebarang);
        this.setHarga(harga);
        this.setBerat(berat);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void getInformasi() {
        System.out.println("Kode : " + getKodebarang());
        System.out.println("Harga : " + getHarga());
        System.out.println("Berat : " + getBerat());
        System.out.println("Deskripsi : " + getDeskripsi());
        System.out.println("Warna : " + getWarna());
        System.out.println("-----------------------------------------");
    }
}
