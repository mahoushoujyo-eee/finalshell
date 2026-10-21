package com;

import org.jetbrains.annotations.NotNull;

class lc_4 implements com.Lf_2 {
   final com.dx_4 W;
   final IR e;

   lc_4(IR var1, com.dx_4 var2) {
      this.e = var1;
      this.W = var2;
   }

   @Override
   public void N(int var1, int var2, @NotNull com.YP var3, @NotNull j_2 var4, int var5) {
      int var10000 = j_2.P();
      int var7 = 0;
      int var8 = var4.length();
      boolean var6 = (boolean)var10000;
      var10000 = var4 instanceof com.q_2;
      if (!var6) {
         if (var10000 != 0) {
            com.q_2 var9 = (com.q_2)var4;
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
   public void r(int var1, int var2, int var3, @NotNull com.YP var4, @NotNull j_2 var5, int var6) {
   }

   @Override
   public void K(int var1, int var2, int var3, int var4) {
   }
}





