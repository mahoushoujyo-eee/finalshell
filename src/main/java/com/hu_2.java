package com;

import java.awt.Component;
import java.awt.Container;

class Hu_2 implements Runnable {
   final com.BX N;
   final wf_4 D;

   Hu_2(wf_4 var1, com.BX var2) {
      this.D = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      String[] var10000 = com.BX.B();
      Hd_2 var2 = this.N.D();
      String[] var1 = var10000;
      var10000 = var2;
      if (var1 == null) {
         if (com.FN.l((Component)var2)) {
            return;
         }

         var10000 = var2.getSelectedComponent();
      }

      label32: {
         Object var3 = var10000;
         if (var1 == null) {
            if (!var3.isFocusable()) {
               boolean var5 = var3 instanceof Container;
               if (var1 != null) {
                  return;
               }

               if (!var5) {
                  break label32;
               }

               boolean var6 = com.FN.v((Container)var3);
               if (var1 != null) {
                  return;
               }

               if (!var6) {
                  break label32;
               }
            }

            var2.transferFocus();
         }

         if (var1 == null) {
            return;
         }
      }

      var2.requestFocusInWindow();
   }
}





