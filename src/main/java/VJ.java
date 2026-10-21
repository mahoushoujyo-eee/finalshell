import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class VJ extends JScrollPane {
   final F6 G;

   VJ(F6 var1, Component var2) {
      super(var2);
      this.G = var1;
   }

   @Override
   public void paint(Graphics var1) {
      boolean var10000 = F6.i();
      Component[] var3 = this.getComponents();
      boolean var2 = var10000;
      Component[] var4 = var3;
      int var5 = var3.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            Component var7 = var4[var6];
            if (!var2) {
               break;
            }

            if (var2) {
               if (var7 instanceof JViewport) {
                  JViewport var8 = (JViewport)var7;
                  var8.setOpaque(false);
               }

               var6++;
            }

            if (var2) {
               continue;
            }
         }

         super.paint(var1);
         break;
      }
   }
}





