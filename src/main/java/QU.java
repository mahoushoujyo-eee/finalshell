import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class QU extends JScrollPane {
   QU(Component var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public void paint(Graphics var1) {
      com.ky_4[] var10000 = yT_3.c();
      Component[] var3 = this.getComponents();
      com.ky_4[] var2 = var10000;
      Component[] var4 = var3;
      int var5 = var3.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            Component var7 = var4[var6];
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               if (var7 instanceof JViewport) {
                  JViewport var8 = (JViewport)var7;
                  var8.setOpaque(false);
               }

               var6++;
            }

            if (var2 != null) {
               continue;
            }
         }

         super.paint(var1);
         break;
      }
   }
}





