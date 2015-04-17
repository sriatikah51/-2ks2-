/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author ASPIRE V5
 */
public class Transaksi {
    private int harga;
    private Barang barang;
    private Customer namaCustomer;
    private Penjual namaPenjual;

    
    public int getHarga() {
        return harga;
    }

    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    
    public Barang getBarang() {
        return barang;
    }

    
    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    
    public Customer getNamaCustomer() {
        return namaCustomer;
    }

    
    public void setNamaCustomer(Customer namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    
    public Penjual getNamaPenjual() {
        return namaPenjual;
    }

    
    public void setNamaPenjual(Penjual namaPenjual) {
        this.namaPenjual = namaPenjual;
    }
}
