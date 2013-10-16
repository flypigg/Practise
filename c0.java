import java.awt.*;
import javax.swing.*;
import java.awt.font.*;

public class c0 {
     public static void main(String[] args) {
          ThreadFrame frame=new ThreadFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
     }
}
class ThreadFrame extends JFrame {
     public ThreadFrame(){
          setTitle("ThreadFrame");
          setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
          ThreadComponent component=new ThreadComponent();
          add(component);
     }
     public static final int DEFAULT_WIDTH=400;
     public static final int DEFAULT_HEIGHT=200;
}
class ThreadComponent extends Component implements Runnable {
     String name="Java Now!";int x,y;
     Font f=new Font("TimesRoman",Font.BOLD,24);
     Thread th1=null;
     public ThreadComponent(){
          th1=new Thread(this);
          th1.start();
     }
     public void run(){
          x=getWidth();
          y=getHeight()/2;
          while (true) {
               x=x-5;
               if (x==0) 
                    x=getSize().width;
                    repaint();
                    try{
                         th1.sleep(500);
                    }
                    catch (InterruptedException e) {
                         
                    }
               
          }
     }
     public void paintComponent(Graphics g){
         // super.paintComponent(g);
          Graphics2D g2=(Graphics2D)g;
          g2.setFont(f);
          g2.drawString(name,x,y);
     }
}