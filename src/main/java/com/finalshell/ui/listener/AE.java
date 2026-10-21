package com.finalshell.ui.listener;

import com.finalshell.core.EY;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class AE extends MouseAdapter {
   public final JComponent k;
   public final com.finalshell.core.G_2 l;

   public AE(com.finalshell.core.G_2 var1, JComponent var2) {
      this.l = var1;
      this.k = var2;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = EY.G();
      boolean var10000 = this.l.I();
      if (var2 != 0) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isLeftMouseButton(var1);
      }

      label33: {
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var3 = this;
            if (var2 == 0) {
               break label33;
            }

            var10000 = this.k.isEnabled();
         }

         if (!var10000) {
            return;
         }

         var3 = this;
      }

      var3.l.exportAsDrag(this.k, var1, this.l.getSourceActions(this.k));
   }
}





