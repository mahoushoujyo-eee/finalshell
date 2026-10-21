package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.KC3;
import java.awt.event.KeyEvent;

public class EC3 extends Wc2{
   final KC3 I;

   EC3(KC3 var1) {
      this.I = var1;
   }

   @Override
   public void j(KeyEvent var1) {
      int[] var2;
      int var10000;
      label57: {
         label61: {
            var2 = K32.L$arrint();
            var10000 = (KC3.O$boolean(this.I)) ? 1 : 0;
            if (var2 != null) {
               if (var10000 != 0) {
                  var10000 = (GR.rp.J(var1)) ? 1 : 0;
                  if (var2 == null) {
                     break label57;
                  }

                  if (var10000 != 0) {
                     break label61;
                  }
               }

               var10000 = KC3.E(this.I);
            }

            if (var2 != null) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = (GR.rF.J(var1)) ? 1 : 0;
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





