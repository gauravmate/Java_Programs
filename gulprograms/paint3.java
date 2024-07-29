package gulprograms;

import java.awt.*;

class MyFrame2 extends Frame {
  @Override
  public void paint(Graphics g) {
    int xpoint[] = { 30, 200, 30, 200, 30 };
    int ypoint[] = { 30, 200, 20, 200, 30 };
    int numberpoint = 5;
    g.drawPolygon(xpoint, ypoint, numberpoint);
    g.fillPolygon(xpoint, ypoint, numberpoint);
    g.drawArc(10, 40, 70, 70, 0, 95);

  }
}

public class paint3 {
  public static void main(String[] args) {
    MyFrame1 f = new MyFrame1();
    f.setSize(500, 500);
    f.setVisible(true);

  }
}
