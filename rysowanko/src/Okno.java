import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Okno extends JFrame {

	public static void main(String[] args) {

		Okno ok = new Okno();
		ok.setTitle("rysowanko");
		ok.setSize(700, 700);
		ok.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ok.add(new Canva());
		ok.setVisible(true);

	}
}

class Canva extends Canvas {
	public void paint(Graphics g) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("podaj wspolrzedne poczatkowe");
//		int x1 = scanner.nextInt();
//		int y1 = scanner.nextInt();
//		System.out.println("podaj wspolrzedne koncowe");
//		int x2 = scanner.nextInt();
//		int y2 = scanner.nextInt();

		g.setColor(Color.yellow);
		g.fillRoundRect(10, 10, 150, 150, 50, 150);

		g.setColor(Color.pink);
		g.fillOval(100, 100, 120, 150);

		g.setColor(Color.blue);
		g.drawLine(10, 10, 500, 500);
//		g.drawLine(x1, y1, x2, y2);

		Font font = new Font("TimesRoman", Font.BOLD, 36);
		g.setFont(font);
		g.setColor(Color.red);
		g.drawString("Wow! such java! wow! wow!", 60, 200);

	}

}
