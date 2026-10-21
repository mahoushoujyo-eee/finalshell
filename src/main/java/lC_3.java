import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class lC_3 implements MouseListener {
   final y1_2 f;
   private static final long a;

   lC_3(y1_2 var1) {
      this.f = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      label16: {
         String[] var10000 = F8.y();
         long var3 = System.currentTimeMillis() - com.c.c(126803268638211778L).getLong(com.c.c(175824513233244249L).get(this));
         String[] var2 = var10000;
         if (var2 == null) {
            if (var3 <= a) {
               break label16;
            }

            com.c.c(436558571101672386L).setBoolean(com.c.c(175824513233244249L).get(this), false);
         }

         if (var2 == null) {
            return;
         }
      }

      com.c.c(436558571101672386L).setBoolean(com.c.c(175824513233244249L).get(this), true);
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

   static {
      long var0 = 7839792761209487226L;
      long var10002 = 7839792761209487232L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





