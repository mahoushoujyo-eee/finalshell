package com;

import java.awt.event.KeyEvent;

class We_2 implements com.Wc_2 {
   final com.kC_3 S;

   We_2(com.kC_3 var1) {
      this.S = var1;
   }

   @Override
   public void j(KeyEvent var1) {
      int[] var2;
      int var10000;
      label57: {
         label61: {
            var2 = com.k3_2.L();
            var10000 = com.kC_3.O(this.S);
            if (var2 != null) {
               if (var10000 != 0) {
                  var10000 = GR.rI.J(var1);
                  if (var2 == null) {
                     break label57;
                  }

                  if (var10000 != 0) {
                     break label61;
                  }
               }

               var10000 = com.kC_3.E(this.S);
            }

            if (var2 != null) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = GR.lx.J(var1);
            }

            if (var2 == null) {
               break label57;
            }

            if (var10000 == 0) {
               return;
            }
         }

         var10000 = this.S.z();
      }

      int var3;
      label38: {
         var3 = var10000;
         if (var2 != null) {
            if (var3 != -1) {
               break label38;
            }

            this.S.Y(0);
         }

         if (var2 != null) {
            return;
         }
      }

      int var5;
      label30: {
         var4 = this.S;
         var5 = var3;
         int var10002 = this.S.p() - 1;
         if (var2 != null) {
            if (var3 >= var10002) {
               var5 = 0;
               break label30;
            }

            var5 = var3;
            var10002 = 1;
         }

         var5 += var10002;
      }

      var4.Y(var5);
   }
}





