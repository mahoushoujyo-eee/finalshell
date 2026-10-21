package com.finalshell.core;

import com.finalshell.ui.model.KO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Am2 extends AG {
   @NotNull
   public YA3 H;
   @NotNull
   public YP q;
   @Nullable
   public YP n;
   @NotNull
   public KO h;

   public Am2(@NotNull Yw2 var1) {
      this.H = Yw2.L(var1);
      this.q = Yw2.h(var1);
      this.n = Yw2.J(var1);
      this.h = Yw2.x(var1);
   }

   @NotNull
   public Yw2 g() {
      return this.I(false);
   }

   @NotNull
   public Yw2 I(boolean var1) {
      String var10000 = Dx4.g();
      Et2 var3 = this.q.K();
      Et2 var4 = this.q.s();
      String var2 = var10000;
      if (var1) {
         YP var5;
         label27: {
            var5 = super.y();
            YP var6 = var5;
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
            YP var8 = var5;
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

      return new Yw2(var1, var3, var4, this.H, this.h, this.n, null);
   }

   @NotNull
   @Override
   public YP y() {
      return this.g();
   }

   Am2(Yw2 var1, AK var2) {
      this(var1);
   }
}





