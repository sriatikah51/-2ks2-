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
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stok stok1=new Stok();
        stok1.setStok(100);
        
        Barang barang1=new Barang();
        barang1.setJudulBuku("Firdaus Mimpi");
        barang1.setPenerbit("Gramedia");
        barang1.setPengarang("Agnes Jessica");            
        barang1.setStok(stok1);
        
        Customer customer1=new Customer();
        try {
            customer1.setNama("sri");
        }catch (Exception e){
            System.out.println ("terjadi error: "+e.getMessage());
        }
        
        Penjual penjual1=new Penjual();
        try{
            penjual1.setNama("intan");
        } catch (Exception e){
            System.out.println ("terjadi error: "+e.getMessage());
        }
        
        
        Transaksi transaksi1=new Transaksi();
        transaksi1.setBarang(barang1);
        try{
            transaksi1.setHarga(25000);
        }catch (Exception e){
            System.out.println ("terjadi error: harus berupa angka saja");
        }
        
        transaksi1.setNamaCustomer(customer1);
        transaksi1.setNamaPenjual(penjual1);
        
        cetakTransaksi(transaksi1);
             
        
        // TODO code application logic here
    }
    
    static void cetakTransaksi (Transaksi transaksi){
    System.out.println("Nama buku : "+transaksi.getBarang().getJudulBuku());
    System.out.println("Pengarang : "+transaksi.getBarang().getPengarang());
    System.out.println("Penerbit : "+transaksi.getBarang().getPenerbit());
    System.out.println("Harga : "+transaksi.getHarga());
    System.out.println("Nama Penjual : "+transaksi.getNamaPenjual().getNama());
    System.out.println("Nama Pembeli : "+transaksi.getNamaCustomer().getNama());
}
    
}
