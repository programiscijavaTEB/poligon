import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main extends JFrame {

	public static void main(String[] args) {
		Main main = new Main();
		main.add(new Canva());
		main.setSize(700, 1200);
		main.setVisible(true);

	}

	public static int[] odczytX() throws FileNotFoundException {
		File file = new File("C:\\Users\\Slawek\\Desktop\\Programowanko\\polygon.txt");
		Scanner in = new Scanner(file);
		int x1[] = new int[4];
		int i = 0;
		while (in.hasNextLine()) {
			x1[i] = in.nextInt();
			i++;
		}
		return x1;
	}
	public static int[] odczytY() throws FileNotFoundException {
		File file = new File("C:\\Users\\Slawek\\Desktop\\Programowanko\\polygonY.txt");
		Scanner in = new Scanner(file);
		int y1[] = new int[4];
		int i = 0;
		while (in.hasNextLine()) {
			y1[i] = in.nextInt();
			i++;
		}
		return y1;
	}

}

class Canva extends Canvas {

	public void paint(Graphics g) {

		g.setColor(Color.blue);

		try {
			g.drawPolygon(Main.odczytX(), Main.odczytY(), 4);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("podaj ilosc kolumn");
//		int pion = scanner.nextInt();
//		System.out.println("podaj ilosc wierszy");
//		int poziom = scanner.nextInt();
//
//		g.setColor(Color.blue);
//
//		int x1, x2, y1, y2;
//		for (int i = 0; i < pion-1; i++) { 
//			x1 = (500 / pion ) * (i+1);			
//			x2 = (500 / pion ) * (i+1);		
//			y1 = 0;							
//			y2 = 500;						
//			g.drawLine(x1, y1, x2, y2);		
//		}
//		for (int j = 0; j < poziom-1; j++) {
//			x1 = 0;
//			x2 = 500;
//			y1 = (500 / poziom ) * (j+1);
//			y2 = (500 / poziom ) * (j+1);
//			g.drawLine(x1, y1, x2, y2);
//		}
