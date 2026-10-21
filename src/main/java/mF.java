import java.awt.Point;

class mF implements Runnable {
   final x2 c;

   mF(x2 var1) {
      this.c = var1;
   }

   @Override
   public void run() {
      String var10000 = Vn_2.C();
      Point var2 = ((Vn_2)com.c.c(296940250323823662L).get(com.c.c(494534573427285740L).get(this))).getMousePosition();
      String var1 = var10000;
      if (var1 == null) {
         if (var2 != null) {
            return;
         }

         com.c.c(506848354576877670L).setInt(com.c.c(296940250323823662L).get(com.c.c(494534573427285740L).get(this)), -1);
         com.c.c(244753811008757660L).setInt(com.c.c(296940250323823662L).get(com.c.c(494534573427285740L).get(this)), -1);
      }

      ((Vn_2)com.c.c(296940250323823662L).get(com.c.c(494534573427285740L).get(this))).repaint();
   }
}





