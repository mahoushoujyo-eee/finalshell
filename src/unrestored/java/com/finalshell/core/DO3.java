package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.Ks4;

public class DO3 extends DA3 {
   public final Ks4 F;

   public DO3(Ks4 var1) {
      this.F = var1;
   }

   @Override
   public void q(K32 var1) {
      this.F.H(this.F.y.indexOf(var1), true);
   }

   @Override
   public void A(K32 var1) {
      Ks4 var3;
      label21: {
         label20: {
            int[] var2 = K32.L$arrint();
            var3 = this.F;
            if (var2 != null) {
               if (!this.F.r) {
                  var3 = this.F;
                  if (var2 == null) {
                     break label21;
                  }

                  if (this.F.I() != 0) {
                     break label20;
                  }
               }

               var3 = this.F;
            }

            var3.H(this.F.y.indexOf(var1), false);
         }

         var3 = this.F;
      }

      var3.j = var1;
   }
}





