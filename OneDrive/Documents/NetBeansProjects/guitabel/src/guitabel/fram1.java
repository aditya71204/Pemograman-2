/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guitabel;

// Frame1.java
import javax.swing.*;
public class fram1 extends JFrame {
    public fram1() {
        setTitle("Frame Utama");
        setSize(500, 200);
        setLayout(null);

        JButton btnPanggil = new JButton("PANGGIL FRAME");
        btnPanggil.setBounds(150, 80, 180, 30);
        add(btnPanggil);

        btnPanggil.addActionListener(e -> {
            fram2 f2 = new fram2();
            f2.setVisible(true);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) { new fram1(); }
}