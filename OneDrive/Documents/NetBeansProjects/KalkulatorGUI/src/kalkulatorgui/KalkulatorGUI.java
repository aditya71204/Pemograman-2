package kalkulatorgui;

import javax.swing.*;
import java.awt.event.*;

public class KalkulatorGUI extends JFrame {

    JLabel lblAngka1, lblAngka2, lblHasil;
    JTextField txtAngka1, txtAngka2, txtHasil;
    JButton btnTambah, btnHapus, btnExit;

    public KalkulatorGUI() {

        setTitle("Program Penjumlahan");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label
        lblAngka1 = new JLabel("Angka Pertama");
        lblAngka1.setBounds(30,30,100,25);
        add(lblAngka1);

        lblAngka2 = new JLabel("Angka Kedua");
        lblAngka2.setBounds(30,70,100,25);
        add(lblAngka2);

        lblHasil = new JLabel("Hasil");
        lblHasil.setBounds(30,110,100,25);
        add(lblHasil);

        // TextField
        txtAngka1 = new JTextField();
        txtAngka1.setBounds(150,30,150,25);
        add(txtAngka1);

        txtAngka2 = new JTextField();
        txtAngka2.setBounds(150,70,150,25);
        add(txtAngka2);

        txtHasil = new JTextField();
        txtHasil.setBounds(150,110,150,25);
        txtHasil.setEditable(false);
        add(txtHasil);

        // Button
        btnTambah = new JButton("Tambah");
        btnTambah.setBounds(30,170,90,30);
        add(btnTambah);

        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(140,170,90,30);
        add(btnHapus);

        btnExit = new JButton("Exit");
        btnExit.setBounds(250,170,90,30);
        add(btnExit);

        // Event Tambah
        btnTambah.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    int a = Integer.parseInt(txtAngka1.getText());
                    int b = Integer.parseInt(txtAngka2.getText());
                    int hasil = a + b;
                    txtHasil.setText(String.valueOf(hasil));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka!");
                }
            }
        });

        // Event Hapus
        btnHapus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtAngka1.setText("");
                txtAngka2.setText("");
                txtHasil.setText("");
            }
        });

        // Event Exit
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        KalkulatorGUI form = new KalkulatorGUI();
        form.setVisible(true);
    }
}