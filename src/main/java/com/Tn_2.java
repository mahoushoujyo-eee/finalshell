package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class Tn_2 extends MouseAdapter {
   final com.k3_2 W;

   Tn_2(com.k3_2 var1) {
      this.W = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var2 = com.k3_2.L();
      boolean var10000 = this.O(var1);
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         this.W.q();
      }

      this.W.o();
   }

   private boolean O(MouseEvent var1) {
      int[] var2 = com.k3_2.L();
      boolean var10000 = SwingUtilities.isLeftMouseButton(var1);
      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = com.FN.N(this.W).contains(var1.getPoint());
      }

      return var2 == null ? var10000 : var10000;
   }
}





