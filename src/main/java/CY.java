import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class CY implements MouseMotionListener {
   final tq_4 L;

   CY(tq_4 var1) {
      this.L = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      String[] var10000 = FK.i();
      Point var3 = var1.getPoint();
      String[] var2 = var10000;
      if (var3 != null) {
         com.c.c(458852233453534750L).setInt(com.c.c(547565734661310786L).get(this), ((tq_4)com.c.c(547565734661310786L).get(this)).rowAtPoint(var3));
      }

      tq_4 var4 = (tq_4)com.c.c(547565734661310786L).get(this);
      if (var2 == null) {
         if (com.c.c(410066848429556838L).getInt(var4) != com.c.c(458852233453534750L).getInt(com.c.c(547565734661310786L).get(this))) {
            ((tq_4)com.c.c(547565734661310786L).get(this)).repaint();
         }

         var4 = (tq_4)com.c.c(547565734661310786L).get(this);
      }

      com.c.c(410066848429556838L).setInt(var4, com.c.c(458852233453534750L).getInt(com.c.c(547565734661310786L).get(this)));
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }
}





