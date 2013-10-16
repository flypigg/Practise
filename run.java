import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class run extends JApplet {
	public void init(){
		Container cp=getContentPane();
		CBox pa=new CBox();
		pa.setBackground(Color.cyan);
		cp.add(pa,BorderLayout.CENTER);
	}
}
class CBox extends JPanel implements Runnable {
	int x,y;
	Font f=new Font("consolas",Font.BOLD,24);
	Thread th1=null;
	public CBox(){
		th1=new Thread(this); th1.start();
	}
	public void run(){
		x=getWidth();
		y=getHeight()/2;
		while (true) {
			x=x-5;
			if (x==0) {
				x=getSize().width;
			}
			repaint();
			try	{th1.sleep(500);}
			catch (InterruptedException e) {
				
			}
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setFont(f);
		g2.drawString("Java Now",x,y);
	}
}