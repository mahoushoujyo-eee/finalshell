package com.finalshell.ui.model;

import com.finalshell.core.I22;
import com.finalshell.core.Ld4;
import java.util.Comparator;

public class Yb2 implements Comparator {
   public int R(Ld4 var1, Ld4 var2) {
      byte var10000 = (byte)((I22.K$boolean()) ? 1 : 0);
      Class var4 = var1.D();
      boolean var3 = ((boolean)var10000) != 0;
      Class var5 = var2.D();
      var10000 = (byte)((var4.equals(var5)) ? 1 : 0);
      if (var3) {
         if (var10000 != 0) {
            return 0;
         }

         var10000 = (byte)((var4.isAssignableFrom(var5)) ? 1 : 0);
      }

      if (var3) {
         if (var10000 != 0) {
            return 1;
         }

         var10000 = -1;
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.R((Ld4)var1, (Ld4)var2);
   }
}





