package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.KC3;
import com.finalshell.ui.panel.Ko4;

public class Cc4 extends C42 {
   public final KC3 G;
   public final Ko4 z;

   public Cc4(Ko4 var1, boolean var2, KC3 var3) {
      super(var2);
      this.z = var1;
      this.G = var3;
   }

   @Override
   public void f(boolean var1) {
      int[] var10000 = K32.L$arrint();
      Ko4 var3 = this.z;
      Ko4.R(var3, var1);
      int[] var2 = var10000;
      if (var2 != null) {
         label17: {
            if (!var1) {
               var4 = this.z;
               if (var2 == null) {
                  break label17;
               }

               if (Ko4.Q(this.z)) {
                  Ko4.r(this.z, false);
                  this.z.V.v().y(var3, null);
                  var3.revalidate();
               }
            }

            var4 = this.z;
         }

         ((javax.swing.JComponent)var4).repaint();
      }
   }
   private static Object var4;
}





