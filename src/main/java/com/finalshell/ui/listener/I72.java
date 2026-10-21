package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KD3;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class I72 extends MouseAdapter {
   final KD3 Y;

   I72(KD3 var1) {
      this.Y = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int[] var2 = KD3.u();
      int var10000 = var1.getClickCount();
      if (var2 == null) {
         if (var10000 != 2) {
            return;
         }

         var10000 = KD3.j(this.Y);
      }

      label33: {
         if (var2 == null) {
            if (var10000 == 0) {
               return;
            }

            var3 = this.Y;
            if (var2 != null) {
               break label33;
            }

            var10000 = KD3.E(this.Y).getSelectionCount();
         }

         if (var10000 <= 0) {
            return;
         }

         var3 = this.Y;
      }

      var3.v(KD3.E(this.Y).N());
   }
}





