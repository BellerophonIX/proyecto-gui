import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ProyectoGUI extends JFrame {
    private JButton mostrarInfoBtn;
    
    public ProyectoGUI() {
        super("Proyecto GUI");
        
        mostrarInfoBtn = new JButton("316291820");
        mostrarInfoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarInformacion();
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(mostrarInfoBtn);
        
        add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void mostrarInformacion() {
        JFrame infoFrame = new JFrame("Información Personal");
        infoFrame.setLayout(new GridLayout(5, 2));
        
        infoFrame.add(new JLabel("Nombre:"));
        infoFrame.add(new JLabel("Morales Hernández Alfonso Josué"));
        
        infoFrame.add(new JLabel("Número de Cuenta:"));
        infoFrame.add(new JLabel("316291820"));
        
        infoFrame.add(new JLabel("Fecha de Nacimiento:"));
        infoFrame.add(new JLabel("25 de Mayo del 2000"));
        
        infoFrame.add(new JLabel("Dirección:"));
        infoFrame.add(new JLabel("Santa Cruz, San isidro Ixhuapetec"));
        
        ImageIcon icono = new ImageIcon("c:/Users/Usuario/Documents/ESCUELA/POO/3038.jpg");
        JLabel fotoLabel = new JLabel(icono);
        infoFrame.add(fotoLabel);
        
        infoFrame.pack();
        infoFrame.setLocationRelativeTo(null);
        infoFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProyectoGUI();
            }
        });
    }
}
