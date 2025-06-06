/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8;

/**
 *
 * @author KOSMAS
 */
public class Siswa {
    private String nama;
    private String nis;
    private String kelas;
    private double matematika;
    private double inggris;
    private double ekonomi;

    public Siswa(String nama, String nis, String kelas, double matematika, double inggris, double ekonomi) {
        this.nama = nama;
        this.nis = nis;
        this.kelas = kelas;
        this.matematika = matematika;
        this.inggris = inggris;
        this.ekonomi = ekonomi;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getMatematika() {
        return matematika;
    }

    public void setMatematika(double matematika) {
        this.matematika = matematika;
    }

    public double getInggris() {
        return inggris;
    }

    public void setInggris(double inggris) {
        this.inggris = inggris;
    }

    public double getEkonomi() {
        return ekonomi;
    }

    public void setEkonomi(double ekonomi) {
        this.ekonomi = ekonomi;
    }
}
