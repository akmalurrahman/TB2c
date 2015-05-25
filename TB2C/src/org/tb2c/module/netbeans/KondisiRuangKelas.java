/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;


public class KondisiRuangKelas extends IdentitasRuangKelas {
	

	
	void InputKondisiRuangKelas(){
		
		System.out.println("Masukkan panjang ruangan : ");
	        setPanjangRuang(scan.nextInt());
	        
	        System.out.println("Masukkan lebar ruangan :  ");
	        setLebarRuang(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah kursi dalam suatu ruangan : ");
	        setJumlahKursi(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah pintu dalam suatu ruangan : ");
	        setJumlahPintu(scan.nextInt()); 
	        
	        System.out.println("Masukkan jumlah jendela dalam ruangan : ");
	        setJumlahJendela(scan.nextInt());
	        
	        
	}
	void AnalysisKondisiRuangKelas(){
			if (getPanjangRuang() < getLebarRuang()){
	          System.out.println("Angka yang Anda masukkan Salah");
	      } 
	      
			else if (getPanjangRuang() == getLebarRuang()){
	        System.out.println("Tidak ada ruangan yang berbentuk persegi panjang");
	      }
	      
			if (RasioLuas() >= 0.5){
	          System.out.println(" Ruangan kelas telah memenuhi Standard ");
	      }
	      
			else if (RasioLuas() <= 0.5){
	          System.out.println(" Ruang kelas tidak memenuhi Standard ");
	      }
	      
			if (getJumlahPintu() >= 2){
	          System.out.println(" Jumlah pintu telah memenuhi Standard ");
	      }
	          
			else if(getJumlahPintu() <= 2){
	          System.out.println(" Jumlah pintu tidak memenuhi Standard ");
	      }
	      
			if (getJumlahJendela() >= 1){
	          System.out.println(" Jumlah Jendela sesuai ");
	      }
	      
			else if (getJumlahJendela() == 0){
	          System.out.println(" Jumlah Jendela tidak memenuhi Standard ");
			}
		}
	
	void OutputKondisiRuangKelas(){
             System.out.println("== Kondisi Ruang Kelas ==");
             System.out.println("Jumlah kursi didalam kelas : " + getJumlahKursi());
	     System.out.println("Jumlah Pintu pada kelas : " + getJumlahPintu());
	     System.out.println("Jumlah Jendela pada kelas : " + getJumlahJendela());
	     System.out.println("Luas Ruang : " + LuasRuang());
	     System.out.println("Rasio Ruang : "+ RasioLuas());    
	}
	    	 
}

