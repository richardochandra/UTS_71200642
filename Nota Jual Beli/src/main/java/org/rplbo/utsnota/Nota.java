package org.rplbo.utsnota;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota, String notelppembeli, String  namapembeli ,Item items) {
        this.nonota = nonota;
        this.notelppembeli = notelppembeli;
        this.items = items;
        this.namapembeli = namapembeli;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public String getNamapembeli() {
        return namapembeli;
    }
    public void tampilNota(){
        int buku=0;
        int pulpen=0;
        int hvs=0;
        System.out.println("NOTA PEMBELIAN");
        System.out.println("No Nota: "+getNonota());
        System.out.println("Nama Pembeli: "+getNamapembeli());
        System.out.println("Telp Pembeli: "+getNotelppembeli());
        System.out.println("Tgl: "+ DateTimeFormatter.ofPattern("EEE MMM D HH:mm:ss").format(LocalDateTime.now())+ " WIB "+ LocalDateTime.now().getYear());
        System.out.println("===================================");
        for (BukuTulis i: items.getBktulis()) {
            buku+=i.getHarga();
            i.getInformasi();
        }
        System.out.println("Sub Total : "+buku);
        System.out.println("===========================================");
        for (KertasHVS k: items.getKrhvs()) {
            hvs+=k.getHarga();
            k.getInformasi();
        }
        System.out.println("Sub Total : "+hvs);
        System.out.println("===========================================");
        for (Pulpen j: items.getPen()){
            pulpen+=j.getHarga();
            j.getInformasi();
        }
        System.out.println("Sub Total : "+pulpen);
        System.out.println("===========================================");
    }
    public int hitungTotalBayar(){
    int total = 0;
        for (BukuTulis i: items.getBktulis()) {
            total+=i.getHarga();
        }
        for (Pulpen j: items.getPen()) {
            total+=j.getHarga();
        }
        for (KertasHVS k: items.getKrhvs()) {
            total+=k.getHarga();
        }
        return total;
    }
}
