/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metode;

/**
 * @author Hendri Ardiansyah
 */
public class Metode {
    public String nim, nama;
    private float uts, uas;

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public float getUts() {
        return uts;
    }

    public float getUas() {
        return uas;
    }

    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }
}