package com;

import java.awt.event.KeyEvent;

class eC_3 implements com.Wc_2 {
   final com.kC_3 I;

   eC_3(com.kC_3 var1) {
      this.I = var1;
   }

   @Override
   public void j(KeyEvent var1) {
      int[] var2;
      int var10000;
      label57: {
         label61: {
            var2 = com.k3_2.L();
            var10000 = com.kC_3.O(this.I);
            if (var2 != null) {
               if (var10000 != 0) {
                  var10000 = GR.rp.J(var1);
                  if (var2 == null) {
                     break label57;
                  }

                  if (var10000 != 0) {
                     break label61;
                  }
               }

               var10000 = com.kC_3.E(this.I);
            }

            if (var2 != null) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = GR.rF.J(var1);
            }

            if (var2 == null) {
               break label57;
            }

            if (var10000 == 0) {
               return;
            }
         }

         var10000 = this.I.z();
      }

      int var3;
      label38: {
         var3 = var10000;
         if (var2 != null) {
            if (var3 != -1) {
               break label38;
            }

            this.I.Y(this.I.p() - 1);
         }

         if (var2 != null) {
            return;
         }
      }

      int var4;
      label30: {
         var4 = var3;
         if (var2 != null) {
            if (var3 > 0) {
               var4 = var3 - 1;
               break label30;
            }

            var4 = this.I.p();
         }

         var4 -= 1;
      }

      this.I.Y(var4);
   }
}





