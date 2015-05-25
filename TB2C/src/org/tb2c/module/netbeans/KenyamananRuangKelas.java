/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;


public class KenyamananRuangKelas extends KebersihanRuangKelas {
	
	
	
	
	void InputKenyamananRuangKelas(){
		 
		 
		 
             System.out.println("Kondisi kebisingan di dalam kelas : ");
	     setKebisingan(scan.nextLine());
	       
	     System.out.println("Kondisi aroma di dalam/di luar kelas : ");
	     setBau(scan.nextLine());
	       
	     System.out.println("Kondisi kaca jendela di dalam/di luar kelas  : ");
	     setKebocoran(scan.nextLine());
	       
	     System.out.println("Kondisi Kerusakan di dalam kelas : ");
	     setKerusakan(scan.nextLine());
	     
	     System.out.println("Kondisi keausan di dalam kelas : ");
	     setKeausan(scan.nextLine());
	 }
	
	 void AnalysisKenyamananRuangKelas(){
		 String Kebisingan = "Tidak Bising";
		 String Bau = "Tidak Bau";
		 String Kebocoran = "Tidak Bocor";
		 String Kerusakan = "Tidak Rusak";
		 String Keausan = "Tidak Aus";
		 
		 if(Kebisingan.equals(getKebisingan())){
			 System.out.println("Sudah Sesuai");
	       }
	       else{
	           System.out.println("Belum Sesuai");
	       }
		 if(Bau.equals(getBau())){
			 System.out.println("Sudah Sesuai ");
		 }
		 else{
			 System.out.println("Belum Sesuai ");
		 }
		 if(Kebocoran.equals(getKebocoran())){
			 System.out.println("Sudah Sesuai");
		 }
		 else{
			 System.out.println("Belum Sesuai");
		 }
		 if(Kerusakan.equals(getKerusakan())){
			 System.out.println("Sudah Sesuai");
		 }
		 else{
			 System.out.println("Belum Sesuai");
		 }
		 if(Keausan.equals(getKeausan())){
			 System.out.println("Sudah Sesuai");
		 }
		 else{
			 System.out.println("Belum Sesuai");
		 }
	 }
	 
	 void OutputKenyamanRuangKelas(){
		 System.out.println("== Kenyamanan Ruang Kelas ==");
		 System.out.println("Kebisingan : " + getKebisingan());
		 System.out.println("Aroma : " + getBau());
		 System.out.println("Kebocoran : " + getKebocoran());
		 System.out.println("Kerusakan : " + getKerusakan());
		 System.out.println("Keausan : " + getKeausan());
	 }
}
	 
	 
	   