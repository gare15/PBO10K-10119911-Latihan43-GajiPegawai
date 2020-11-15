/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911latihan43;

/**
 *
 * @author 
 * Nama : Mochamad Tegar
 * NIM : 10119911
 * Kelas : IF 10K
 */
public class PBO10119911Latihan43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai pgw = new GajiPegawai();
        String nama, alamat;
        int uangTransport, uangTunjangan, gajiPokok, totalGaji;

        System.out.println("###Data Gaji Karyawan PT. KAKATU###");
        System.out.println("-----------------------------------");

        pgw.setNama("Rizki Adam Kurniawan");
        pgw.setAlamat("Jalan Semar dlm 4 No 72/66");
        pgw.setUangTransport(250000);
        pgw.setUangTunjangan(300000);
        pgw.setGajiPokok(4500000);

        nama = pgw.getNama();
        alamat = pgw.getAlamat();
        uangTransport = pgw.getUangTransport();
        uangTunjangan = pgw.getUangTunjangan();
        gajiPokok = pgw.getGajiPokok();
        totalGaji = pgw.totalGaji(uangTunjangan,uangTransport,gajiPokok);
        pgw.tampilData(nama,alamat,uangTunjangan, uangTransport, gajiPokok, totalGaji);
    }
    
}
