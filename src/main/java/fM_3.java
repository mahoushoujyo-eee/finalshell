import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class fM_3 implements MouseListener {
   final Jx_2 i;

   fM_3(Jx_2 var1) {
      this.i = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         Yj_2 var2 = new Yj_2(
            (Jx_2)com.c.c(399794680803283247L).get(this),
            (DT)com.c.c(622126560416402693L).get(com.c.c(399794680803283247L).get(this)),
            (fr_4)com.c.c(344912960350819457L).get(com.c.c(399794680803283247L).get(this))
         );
         var2.show((DT)com.c.c(622126560416402693L).get(com.c.c(399794680803283247L).get(this)), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      ((DT)com.c.c(622126560416402693L).get(com.c.c(399794680803283247L).get(this))).clearSelection();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





