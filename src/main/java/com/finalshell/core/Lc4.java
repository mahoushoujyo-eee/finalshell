package com.finalshell.core;

import org.jetbrains.annotations.NotNull;

public class Lc4 implements Lf2 {
   final Dx4 W;
   final Connect_2 e;

   Lc4(Connect_2 var1, Dx4 var2) {
      this.e = var1;
      this.W = var2;
   }

   @Override
   public void N(int var1, int var2, @NotNull YP var3, @NotNull com.finalshell.ui.model.J2 var4, int var5) {
      int var10000 = (com.finalshell.ui.model.J2.P()) ? 1 : 0;
      int var7 = 0;
      int var8 = var4.length();
      boolean var6 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var10000 = (var4 instanceof com.finalshell.ui.model.Q2) ? 1 : 0;
      if (!var6) {
         if (var10000 != 0) {
            com.finalshell.ui.model.Q2 var9 = (com.finalshell.ui.model.Q2)var4;
            var4 = var9.V();
            var7 = var9.p();
         }

         var10000 = var7;
      }

      int var10 = var10000;

      while (var10 < var7 + var8) {
         this.W.A(var1, var2 - var5, var4, var10);
         var10++;
         if (var6) {
            break;
         }
      }
   }

   @Override
   public void r(int var1, int var2, int var3, @NotNull YP var4, @NotNull com.finalshell.ui.model.J2 var5, int var6) {
   }

   @Override
   public void K(int var1, int var2, int var3, int var4) {
   }
}





