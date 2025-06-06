/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author KOSMAS
 */
public class SiswaController {
    private List<Siswa> daftarSiswa;
    private DefaultTableModel tableModel;

    public SiswaController(DefaultTableModel tableModel) {
        this.daftarSiswa = new ArrayList<>();
        this.tableModel = tableModel;
    }

    public void tambahSiswa(String nama, String nis, String kelas, 
                           String strMatematika, String strInggris, String strEkonomi) {
        try {
            // Validasi input angka
            double matematika = Double.parseDouble(strMatematika);
            double inggris = Double.parseDouble(strInggris);
            double ekonomi = Double.parseDouble(strEkonomi);

            // Validasi nilai tidak negatif
            if (matematika < 0 || inggris < 0 || ekonomi < 0) {
                throw new IllegalArgumentException("Nilai tidak boleh negatif");
            }

            Siswa siswa = new Siswa(nama, nis, kelas, matematika, inggris, ekonomi);
            daftarSiswa.add(siswa);
            updateTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "Error: Masukkan nilai dengan angka untuk Matematika, B.Inggris, dan Ekonomi", 
                "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, 
                e.getMessage(), 
                "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void hapusSiswa(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < daftarSiswa.size()) {
            daftarSiswa.remove(rowIndex);
            updateTable();
        }
    }

    private void updateTable() {
        // Clear table
        tableModel.setRowCount(0);

        // Populate table with data
        for (Siswa siswa : daftarSiswa) {
            Object[] rowData = {
                siswa.getNama(),
                siswa.getNis(),
                siswa.getKelas(),
                siswa.getMatematika(),
                siswa.getInggris(),
                siswa.getEkonomi()
            };
            tableModel.addRow(rowData);
        }
    }

    public void clearForm(javax.swing.JTextField... fields) {
        for (javax.swing.JTextField field : fields) {
            field.setText("");
        }
    }
}
