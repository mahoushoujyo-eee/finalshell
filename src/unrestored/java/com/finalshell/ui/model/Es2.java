package com.finalshell.ui.model;

import com.finalshell.core.LS3;
import com.finalshell.ui.panel.Oj2;
import java.util.Comparator;

public class Es2 implements Comparator {
   public int u(LS3 var1, LS3 var2) {
      boolean var3 = Oj2.g();
      int var10000 = var1.H();
      int var10001 = var2.H();
      if (var3) {
         if (var10000 < var10001) {
            return -1;
         }

         var10000 = var1.H();
         if (!var3) {
            return var10000;
         }

         var10001 = var2.H();
      }

      return var10000 > var10001 ? 1 : 0;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.u((LS3)var1, (LS3)var2);
   }
}





