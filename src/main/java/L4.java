import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class L4 extends JScrollPane {
   final xl_2 S;

   L4(xl_2 var1, Component var2) {
      super(var2);
      this.S = var1;
   }

   @Override
   public void paint(Graphics var1) {
      Component[] var3 = this.getComponents();
      boolean var10000 = F6.i();
      Component[] var4 = var3;
      boolean var2 = var10000;
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





