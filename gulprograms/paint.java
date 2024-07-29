package gulprograms;

import java.awt.*;


class MyFrame extends Frame {
  @Override
  public void paint(Graphics g) {
    setBackground(Color.PINK);
    g.drawLine(50, 200, 170, 200);
    g.drawRect(50, 150, 150, 150);
    //g.fillRect(50, 200, 150, 200);
    g.drawOval(20, 30, 90, 90);
    g.drawRoundRect(190, 100, 100, 50, 15, 15);
    //g.fillOval(20, 20, 90, 90);

      super.paint(g);
  }
}

 
public class paint {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
