

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JLabel label1 = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();
	private ImageIcon batterie = new ImageIcon("Battery.png");
	private ImageIcon wifi = new ImageIcon("wifi.png");

	private JButton bouton = new JButton("Home");
	private JTextField texte = new JTextField();
//	BufferedImage  batterie;

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		MainFrame frame = new MainFrame();
		frame.setVisible(true);


	}

	public MainFrame(){
		//taille de la fenetre et layout
		setSize(400, 600);
		setLayout(null);
		
		//panel 1 nord avec label
		add(panel1).setBounds(0, 0, 400, 25);
//		label1.setLayout(new FlowLayout());
		panel1.setBackground(Color.BLACK);
//		panel1.add(label1);		
		label1.setOpaque(true);
		label1.setLayout(new FlowLayout());
		//ajout de l'image
		add(label1, batterie.getImage());
		label1.setIcon(batterie);
//		label1.setIcon(wifi);
//		label1.add(bouton);

		
		add(panel2).setBounds(0, 25, 25, 475);
		panel2.setBackground(Color.BLACK);

		add(panel3).setBounds(360, 25, 25, 475);
		panel3.setBackground(Color.BLACK);

		add(panel4).setBounds(0, 500, 400, 200);
		panel4.setBackground(Color.BLACK);
		panel4.setLayout(new FlowLayout());
		panel4.add(bouton);

	}



//	public class AjoutImage extends JPanel {
//		public AjoutImage(String string) {
//			try {
//
//				File input = new File("E:/Batterytest.png");
//				batterie = ImageIO.read(input);
//			} catch (IOException ie) {
//				System.out.println("Error:"+ie.getMessage());
//			}
//		}
//		try {
//
//			File input = new File("E:/wifi.png");
//			batterie = ImageIO.read(input);
//		} catch (IOException ie) {
//			System.out.println("Error:"+ie.getMessage());
//		}
//	}
		
//		try {
//
//			File input = new File("E:/Battery.png");
//			image = ImageIO.read(input);
//		} catch (IOException ie) {
//			System.out.println("Error:"+ie.getMessage());
//		}
//	}
//		// cette méthode c'est elle qui va afficher l'image
//		public void paint(Graphics g) {
//			g.drawImage( batterie, 0, 0, null);
//		}
//	}
}