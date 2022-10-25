/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class Bank {
 
 int SaldoSaya;
 int total;
 Bank (int saldo){
 SaldoSaya = saldo ;
 }
    void GetSaldo (){
    System.out.println ("Selamat datang di bank BCA");
    System.out.println (" Saldo saat ini : Rp "+ SaldoSaya );
 }
    void simpanUang (int simpan) {
    total = simpan + SaldoSaya;
    System.out.println ("Simpan uang : Rp"+ simpan);
    System.out.println ("Saldo saat ini : Rp "+ total);
 }
    void AmbilUang ( int ambil) {
    int jumlah = total - ambil;
    System.out.println ("Ambil uang : Rp"+ ambil);
    System.out.println ("Saldo saat ini : Rp "+ jumlah);
}
}
