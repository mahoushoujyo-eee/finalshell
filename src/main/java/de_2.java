import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class De_2 implements MouseListener {
   final JLabel E;
   final Color o;
   final W8 n;
   final Color R;
   final Jx_2 v;

   De_2(Jx_2 var1, JLabel var2, Color var3, W8 var4, Color var5) {
      this.v = var1;
      this.E = var2;
      this.o = var3;
      this.n = var4;
      this.R = var5;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      ((JLabel)com.c.c(385868733796893978L).get(this)).setBackground((Color)com.c.c(508221385277235441L).get(this));
      ((W8)com.c.c(624058539802525530L).get(this)).setBackground((Color)com.c.c(508221385277235441L).get(this));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      ((JLabel)com.c.c(385868733796893978L).get(this)).setBackground((Color)com.c.c(324514963951660760L).get(this));
      ((W8)com.c.c(624058539802525530L).get(this)).setBackground((Color)com.c.c(324514963951660760L).get(this));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 3) {
      }
   }
}





