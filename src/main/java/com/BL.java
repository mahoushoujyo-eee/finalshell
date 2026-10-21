package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

class BL extends MouseAdapter {
   final JComponent j;
   final wQ_3 l;

   BL(wQ_3 var1, JComponent var2) {
      this.l = var1;
      this.j = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = EY.G();
      boolean var10000 = this.l.l();
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

            var10000 = this.j.isEnabled();
         }

         if (!var10000) {
            return;
         }

         var3 = this;
      }

      var3.l.exportAsDrag(this.j, var1, this.l.getSourceActions(this.j));
   }
}





