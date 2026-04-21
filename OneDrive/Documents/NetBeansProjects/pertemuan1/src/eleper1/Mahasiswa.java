/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleper1;

public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    void tampilData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}

class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "Aditya Rahman P";
        mhs1.nim = "241011400631";
        mhs1.jurusan = "Teknik Informatika";

        mhs1.tampilData();
    }
}
