import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class kT_3 implements AWTEventListener {
   final FK F;
   private static final long a;

   kT_3(FK var1) {
      this.F = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      String[] var2 = FK.i();
      AWTEvent var10000 = var1;
      if (var2 == null) {
         if (!(var1 instanceof MouseEvent)) {
            return;
         }

         var10000 = var1;
      }

      label50: {
         MouseEvent var3 = (MouseEvent)var10000;
         int var7 = var3.getID();
         if (var2 == null) {
            if (var7 != (int)a) {
               return;
            }

            var10000 = (AWTEvent)var1.getSource();
            if (var2 != null) {
               break label50;
            }

            var7 = var10000 instanceof Component;
         }

         if (var7 == 0) {
            return;
         }

         var10000 = (AWTEvent)var3.getSource();
      }

      Component var4 = (Component)var10000;
      Window var5 = SwingUtilities.getWindowAncestor(var4);
      Window var6 = SwingUtilities.getWindowAncestor((tq_4)com.c.c(618427502576624312L).get(com.c.c(578836127842838180L).get(this)));
      var10000 = var5;
      if (var2 == null) {
         if (var5 == null) {
            return;
         }

         var10000 = var4;
      }

      boolean var10 = var10000.equals((Dv_2)com.c.c(334241381080505095L).get(com.c.c(578836127842838180L).get(this)));
      if (var2 == null) {
         if (var10) {
            return;
         }

         var10 = var5.equals(var6);
      }

      if (!var10) {
      }
   }

   static {
      long var0 = 1894109234482483448L;
      long var10002 = 6868018269075116301L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





