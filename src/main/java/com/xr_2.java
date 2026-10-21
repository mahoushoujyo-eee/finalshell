package com;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class Xr_2 implements TreeSelectionListener {
   final com.kD_3 N;

   Xr_2(com.kD_3 var1) {
      this.N = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      com.kD_3 var3;
      label24: {
         int[] var2 = com.kD_3.u();
         int var10000 = com.kD_3.j(this.N);
         if (var2 == null) {
            if (var10000 == 0) {
               return;
            }

            var3 = this.N;
            if (var2 != null) {
               break label24;
            }

            var10000 = com.kD_3.E(this.N).getSelectionCount();
         }

         if (var10000 <= 0) {
            return;
         }

         var3 = this.N;
      }

      var3.v(com.kD_3.E(this.N).N());
   }
}





