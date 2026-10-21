import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class mc_2 implements MouseListener {
   final JLabel m;
   final Color x;
   final W8 t;
   final Color e;
   final mi_2 Z;

   mc_2(mi_2 var1, JLabel var2, Color var3, W8 var4, Color var5) {
      this.Z = var1;
      this.m = var2;
      this.x = var3;
      this.t = var4;
      this.e = var5;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      ((JLabel)com.c.c(208309602693273010L).get(this)).setBackground((Color)com.c.c(445031052821050371L).get(this));
      ((W8)com.c.c(162297733928999063L).get(this)).setBackground((Color)com.c.c(445031052821050371L).get(this));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      ((JLabel)com.c.c(208309602693273010L).get(this)).setBackground((Color)com.c.c(483002961962271330L).get(this));
      ((W8)com.c.c(162297733928999063L).get(this)).setBackground((Color)com.c.c(483002961962271330L).get(this));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 3) {
      }
   }
}





