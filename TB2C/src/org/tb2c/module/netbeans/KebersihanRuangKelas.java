/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

public class KebersihanRuangKelas extends LingkunganRuangKelas{
	
		
	
	void InputKebersihanRuangKelas(){
		
		 	System.out.println("Masukkan kondisi sirkulasi udara dalam ruangan : (baik/tidak baik) ");
		 	setSirkulasiUdara(scan.nextLine());
	       
		 	System.out.println("Masukkan nilai pencahayaan dalam ruangan : ");
		 	setNilaiPencahayaan(scan.nextInt());
	       
		 	System.out.println("Masukkan nilai kelembapan dalam ruangan : ");
		 	setKelembapan(scan.nextInt());
	       
		 	System.out.println("Masukkan suhu dalam ruangan : ");
		 	setSuhu(scan.nextInt());
	   }
	   
	 void AnalysisKebersihanRuangKelas(){
		 String SirkulasiUdara = "Lancar";
		 
		 if (SirkulasiUdara.equals(getSirkualasiUdara())){
			 System.out.println("Sirkulasi udara di dalam ruangan sudah sesuai Standard");
		 }
		 else{
			 System.out.println("Sirkulasi udara di dalam ruangan belum sesuai Standard");
		 }

	       if( getNilaiPencahayaan()<=350 == getNilaiPencahayaan()>=250){
	           System.out.println("Nilai pencahayaan ruangan sudah sesuai Standard ");
	       }
	       
	        else{
	           System.out.println(" Niali pencahayaan ruangan tidak sesuai Standard ");
	       }
	       
	        if( getKelembapan()<=80 == getKelembapan()>=70){
	           System.out.println("Kelembapan ruangan sudah sesuai Standard ");
	       }
	       
	        else{
	           System.out.println("Kelembapan ruangan belum sesuai Standard ");
	       }
	        
	        if( getSuhu()<=35 == getSuhu()>=25){
	           System.out.println("Kebersihan ruangan sudah sesuai Standard ");
	       }
	       
	        else {
	           System.out.println("Kebersihan ruangan belum sesuai Standard ");
	       }
	   }
	 
	 void OutputKebersihanRuangKelas(){
		 System.out.println("== Kebersihan Ruang Kelas ==");
		 System.out.println("Sirkulasi Udara : " + getSirkualasiUdara());
		 System.out.println("Nilai Pencahayaan : " + getNilaiPencahayaan());
		 System.out.println("Kelembapan : " + getKelembapan());
		 System.out.println("Suhu : " + getSuhu());
	 }
	 
}


