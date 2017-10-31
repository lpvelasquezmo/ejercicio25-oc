/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // salida de mensaje y captura de datos:
//        //siempre sera String asi que hy que pasar las variables con integer.Parse.Int ("
//        String name = JOptionPane.showInputDialog(null,"What is your name?");
//        int choice = JOptionPane.showConfirmDialog(null,"Do you like cake"+ name+ "?");
//        if (choice == JOptionPane.YES_OPTION){
//            JOptionPane.showMessageDialog(null, "of course! Who doesn't?");
//            
//        }else {
//            JOptionPane.showMessageDialog(null, "We'll have to agree to disagree.");
//        }
        
        //base de los componentes_:  con el setDefaultcloseoper...("Aqui va la funcoion que quiereo que la ventana haga ")
        JFrame fram = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("game_arrow_3919.png");
        fram.setIconImage (icon);
        //permite visualizar un boton (antes de visible):
        
//           JButton button1= new JButton();
//            button1.setText(("cLICK ME"));
//            button1.setBackground(Color.MAGENTA);
//            fram.add(button1);
//            
//            
//           JButton button2= new JButton();
//           button2.setText(("cLICK ME"));
//         //  button2.setIcon(new ImageIcon ("joy_icon-icons.com_67806.png"));
//            button2.setBackground(Color.BLUE);
//            fram.add(button2);
//            
//          //  fram.setLayout(new FlowLayout()); aparecen varios botones distribuidos vertical
//            fram.setLayout(new GridLayout (3,2) ); //crear filas y columnas  para botones y aparecen varios
//        
//            fram.setLayout(new BorderLayout ());
//            fram.add(new JButton ("norte"),BorderLayout.NORTH);
//             fram.add(new JButton ("este"),BorderLayout.EAST);
//              fram.add(new JButton ("sur"),BorderLayout.SOUTH);
//               fram.add(new JButton ("west"),BorderLayout.WEST);
//             fram.add(new JButton ("center"),BorderLayout.CENTER);

            
            // MAIN PHONE BOTONES
            JPanel centerPanel = new JPanel (new GridLayout (4,3));
            for (int i = 1; i <= 9; i++){
                centerPanel.add(new JButton (""+i));
              }
            centerPanel.add(new JButton("*"));
            centerPanel.add(new JButton("0"));
            centerPanel.add(new JButton("#"));
            fram.add(centerPanel, BorderLayout.CENTER);
           
            
            
            // SPUTH STARTUS PANEL
            JPanel southPanel = new JPanel ( new FlowLayout ());
            southPanel.add(new JLabel ("Number to dial:"));
            southPanel.add(new JTextField(10));
            fram.add(southPanel,BorderLayout.SOUTH );
            
            
        JPanel pane1 = (JPanel) fram.getContentPane();
        pane1.setBackground(Color.red);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setTitle ("lina");
        fram.setSize(new Dimension (300,120));
       fram.setResizable(true);
       // centro de la pantalla:
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       fram.setLocation(dim.width/2-fram.getSize().width/2, dim.height/2-fram.getSize().height/2);
              fram.setVisible(true);

    }
    
}
