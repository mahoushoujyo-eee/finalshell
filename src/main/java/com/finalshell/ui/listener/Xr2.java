package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KD3;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class Xr2 implements TreeSelectionListener {
   final KD3 N;

   Xr2(KD3 var1) {
      this.N = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      KD3 var3;
      label24: {
         int[] var2 = KD3.u();
         int var10000 = KD3.j(this.N);
         if (var2 == null) {
            if (var10000 == 0) {
               return;
            }

            var3 = this.N;
            if (var2 != null) {
               break label24;
            }

            var10000 = KD3.E(this.N).getSelectionCount();
         }

         if (var10000 <= 0) {
            return;
         }

         var3 = this.N;
      }

      var3.v(KD3.E(this.N).N());
   }
}





