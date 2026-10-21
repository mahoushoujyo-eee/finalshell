package com.finalshell.core;

import com.finalshell.ui.panel.KD3;
import java.io.File;
import java.util.List;

public class Er2 extends EY {
   public final KD3 T;

   public Er2(KD3 var1) {
      this.T = var1;
   }

   @Override
   public boolean d(List var1) {
      int[] var2 = KD3.u();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      for (File var4 : var10000) {
         boolean var5 = Xg2.P(var4.getName());
         if (var2 != null) {
            return var5;
         }

         if (var2 != null) {
            return var5;
         }

         if (var5) {
            this.T.v(var4);
            return true;
         }

         if (var2 != null) {
            break;
         }
      }

      return false;
   }
}





