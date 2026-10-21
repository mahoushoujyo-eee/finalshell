package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.KC3;
import java.awt.event.KeyEvent;

public class We2_2 extends Wc2{
   final KC3 S;

   We2_2(KC3 var1) {
      this.S = var1;
   }

   @Override
   public void j(KeyEvent var1) {
      int[] var2;
      int var10000;
      label57: {
         label61: {
            var2 = K32.L$arrint();
            var10000 = (KC3.O$boolean(this.S)) ? 1 : 0;
            if (var2 != null) {
               if (var10000 != 0) {
                  var10000 = (GR.rI.J(var1)) ? 1 : 0;
                  if (var2 == null) {
                     break label57;
                  }

                  if (var10000 != 0) {
                     break label61;
                  }
               }

               var10000 = KC3.E(this.S);
            }

            if (var2 != null) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = (GR.lx.J(var1)) ? 1 : 0;
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





