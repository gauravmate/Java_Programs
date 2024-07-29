package gulprograms;

import java.awt.*;

class MyFrame1 extends Frame {
  @Override
  public void paint(Graphics g) {
    Font f=new Font("arial", Font.BOLD, Font.ITALIC);
    int x[]={500,600,500};
    int y[]={500,500,600};
    int n=3;
    g.setFont(f);
    g.drawPolygon(x, y, n);
    g.setColor(Color.orange);
    g.fillPolygon(x, y, n);
    g.setColor(Color.orange);
    g.fillRect(100, 100, 400, 400);
    g.fillRect(100, 100, 400, 400);
    g.setColor(Color.red);
    g.drawLine(100, 100, 500, 500);
    g.drawArc(100, 100, 800, 810, 180, -90);
    

  
      super.paint(g);
  }
}

 
public class paint2 {
    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
