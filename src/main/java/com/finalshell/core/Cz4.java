package com.finalshell.core;

import com.finalshell.ui.panel.SZ;

public class Cz4 extends C42 {
   final Y9_2 F;

   Cz4(Y9_2 var1) {
      this.F = var1;
   }

   @Override
   public boolean z() {
      String var1 = SZ.L();
      boolean var10000 = Y9_2.D$boolean(this.F);
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = Y9_2.O(this.F);
      }

      return var1 != null ? var10000 : var10000;
   }

   @Override
   public void f(boolean var1) {
      Y9_2.b(this.F, var1);
      Y9_2.i(this.F).repaint();
   }
}





