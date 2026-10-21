import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class t_2 extends JLabel {
   RenderingHints z;

   public t_2(String var1) {
      super(var1);
      this.setFont((Font)com.c.c(164046876459002055L).get(null));
      com.c.c(340954326888131361L).set(this, new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB));
      this.setOpaque(false);
      this.setHorizontalAlignment(0);
      this.setForeground((Color)com.c.c(503018106388102479L).get(null));
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
   }

   public RenderingHints P() {
      return (RenderingHints)com.c.c(340954326888131361L).get(this);
   }

   public void C(RenderingHints var1) {
      com.c.c(340954326888131361L).set(this, var1);
   }
}





