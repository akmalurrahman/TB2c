/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;

import java.util.Scanner;

public abstract class IdentitasRuangKelas implements InterfaceRuangKelas {	
	
	
	AdminKelas data = new AdminKelas();
	Scanner scan = new Scanner(System.in);
	
	
		public void InputIdentitasRuangKelas(){
			
	        
	        //System.out.println("Masukan Nama Ruangan yang akan Anda gunakan : ");
	        //data.setNamaRuang(scan.nextLine());
	       
	        //System.out.println("Masukan Lokasi Ruangan yang akan Anda gunakan : ");
	        //data.setLokasiRuang(scan.nextLine());
	        
	        //System.out.println("Masukan Pengguna Program Studi/Fakultas : ");
	        //data.setProgramStudi_Fakultas(scan.nextLine());
		}

		void OutputIdentitasRuangKelas(){
			
		System.out.println("== Identitas Ruangan Kelas ==");
	    System.out.println("Ruang Kelas : " + data.getNamaRuang());
	    System.out.println("Gedung : " + data.getLokasiRuang());
	    System.out.println("Jurusan : " + data.getProgramStudi_Fakultas());
	    
		}


}

