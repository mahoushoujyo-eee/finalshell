package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class i7_2 extends MouseAdapter {
   final com.kD_3 Y;

   i7_2(com.kD_3 var1) {
      this.Y = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int[] var2 = com.kD_3.u();
      int var10000 = var1.getClickCount();
      if (var2 == null) {
         if (var10000 != 2) {
            return;
         }

         var10000 = com.kD_3.j(this.Y);
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

            var10000 = com.kD_3.E(this.Y).getSelectionCount();
         }

         if (var10000 <= 0) {
            return;
         }

         var3 = this.Y;
      }

      var3.v(com.kD_3.E(this.Y).N());
   }
}





