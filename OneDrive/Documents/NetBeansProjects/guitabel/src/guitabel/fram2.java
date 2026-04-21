/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitabel;

/**
 *
 * @author anako
 */
// Frame1.java
/// Frame2.java
import javax.swing.*;
import javax.swing.table.*;
public class fram2 extends JFrame {
    public fram2() {
        setTitle("Frame Yang Dipanggil");
        setSize(500, 350);
        setLayout(null);

        add(new JLabel("NIM")).setBounds(50, 60, 120, 25);
        JTextField tfNIM = new JTextField(); tfNIM.setBounds(200, 60, 200, 25); add(tfNIM);

        add(new JLabel("Nama Mahasiswa")).setBounds(50, 100, 120, 25);
        JTextField tfNama = new JTextField(); tfNama.setBounds(200, 100, 200, 25); add(tfNama);

        String[] col = {"No", "NIM", "Nama"};
        DefaultTableModel model = new DefaultTableModel(col, 0);
        JTable tabel = new JTable(model);
        JScrollPane sp = new JScrollPane(tabel); sp.setBounds(30, 150, 420, 120); add(sp);

        JButton btnTambah = new JButton("Tambah");
        btnTambah.setBounds(200, 130, 100, 25); add(btnTambah);
        btnTambah.addActionListener(e -> {
            model.addRow(new Object[]{model.getRowCount()+1, tfNIM.getText(), tfNama.getText()});
        });

        setVisible(true);
    }
}