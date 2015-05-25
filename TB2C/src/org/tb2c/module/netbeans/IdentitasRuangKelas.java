/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tb2c.module.netbeans;



public class IdentitasRuangKelas extends AdminKelas{	
	
	
		public void InputIdentitasRuangKelas(){
			
	        
	        System.out.println("Masukan Nama Ruangan yang akan Anda gunakan : ");
	        setNamaRuang(scan.nextLine());
	       
	        System.out.println("Masukan Lokasi Ruangan yang akan Anda gunakan : ");
	        setLokasiRuang(scan.nextLine());
	        
	        System.out.println("Masukan Pengguna Program Studi/Fakultas : ");
	        setProgramStudi_Fakultas(scan.nextLine());
		}

		void OutputIdentitasRuangKelas(){
			
		System.out.println("== Identitas Ruangan Kelas ==");
                System.out.println("Ruang Kelas : " + getNamaRuang());
                System.out.println("Gedung : " + getLokasiRuang());
                System.out.println("Jurusan : " + getProgramStudi_Fakultas());
	    
		}


}

