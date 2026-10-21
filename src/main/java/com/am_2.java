package com;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class am_2 extends com.aG {
   @NotNull
   private com.yA_3 H;
   @NotNull
   private com.YP q;
   @Nullable
   private com.YP n;
   @NotNull
   private com.KO h;

   private am_2(@NotNull com.Yw_2 var1) {
      this.H = com.Yw_2.L(var1);
      this.q = com.Yw_2.h(var1);
      this.n = com.Yw_2.J(var1);
      this.h = com.Yw_2.x(var1);
   }

   @NotNull
   public com.Yw_2 g() {
      return this.I(false);
   }

   @NotNull
   public com.Yw_2 I(boolean var1) {
      String var10000 = com.dx_4.g();
      Et_2 var3 = this.q.K();
      Et_2 var4 = this.q.s();
      String var2 = var10000;
      if (var1) {
         com.YP var5;
         label27: {
            var5 = super.y();
            com.YP var6 = var5;
            if (var2 == null) {
               if (var5.K() != null) {
                  var7 = var5.K();
                  break label27;
               }

               var6 = this.q;
            }

            var7 = var6.K();
         }

         label21: {
            var3 = var7;
            com.YP var8 = var5;
            if (var2 == null) {
               if (var5.s() != null) {
                  var9 = var5.s();
                  break label21;
               }

               var8 = this.q;
            }

            var9 = var8.s();
         }

         var4 = var9;
      }

      return new com.Yw_2(var1, var3, var4, this.H, this.h, this.n, null);
   }

   @NotNull
   @Override
   public com.YP y() {
      return this.g();
   }

   am_2(com.Yw_2 var1, com.aK var2) {
      this(var1);
   }
}





