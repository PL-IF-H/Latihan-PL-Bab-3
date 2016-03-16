/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingkai_lukisan;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author auliaselma
 */
public class Bingkai_lukisan {
Scanner in=new Scanner(System.in);
   String id,nama,jenis,harga,diskon,tanggal;
   int kel,panjang,lebar;
  public void display(){
      
      System.out.print("Masukkan ID   :");
      id=in.next();
      in.nextLine();
      System.out.print("Masukkan nama :");
      id=in.next();
      in.nextLine();
      System.out.print("Masukkan tanggal pemesanan    :");
      id=in.next();
      in.nextLine();
  }
   
  //overload
  public int hitungkel(){
        kel = 2 * (panjang + lebar);
        return kel;
    }
  
}
