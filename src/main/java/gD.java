import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class gD extends MouseAdapter {
   final Yg_2 H;
   private static final long a;

   private gD(Yg_2 var1) {
      this.H = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      String[] var2 = aM.s();
      if (var2 == null) {
         if (var1.getModifiers() != (int)a) {
            com.c.c(580065085137498223L).setBoolean(com.c.c(394340410247477610L).get(this), true);
         }

         ((Yg_2)com.c.c(394340410247477610L).get(this)).repaint();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.c.c(580065085137498223L).setBoolean(com.c.c(394340410247477610L).get(this), false);
      ((Yg_2)com.c.c(394340410247477610L).get(this)).repaint();
   }

   gD(Yg_2 var1, kO_3 var2) {
      this(var1);
   }

   static {
      long var0 = 7755986918984966462L;
      long var10002 = 574520850945728814L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





