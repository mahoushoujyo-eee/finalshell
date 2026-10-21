package com.finalshell.core;

import org.jetbrains.annotations.NotNull;

public class Ov4 {
   public YP Q = YP.r;
   public YP P = YP.r;
   public YP D = null;

   public YP U() {
      return YP.P(this.p());
   }

   @NotNull
   public static YP m(@NotNull YP var0, @NotNull YP var1) {
      Et2 var5;
      boolean var2;
      AG var3;
      YP var6;
      label44: {
         boolean var10000 = com.finalshell.ui.model.J2.g();
         var3 = var0.n();
         var2 = var10000;
         var5 = var0.s();
         label40:
         if (var2) {
            if (var5 == null) {
               var5 = var1.s();
               if (!var2) {
                  break label40;
               }

               if (var5 != null) {
                  var3.j(var1.s());
               }
            }

            var6 = var0;
            if (!var2) {
               break label44;
            }

            var5 = var0.K();
         }

         if (var5 == null) {
            var6 = var1;
            if (!var2) {
               break label44;
            }

            if (var1.K() != null) {
               var3.c(var1.K());
            }
         }

         var6 = var0;
      }

      if (var2) {
         if (var6 != null) {
            var3.v(var0.a());
            var3.H(var0.r());
            var3.R(var0.w());
         }

         var6 = var3.y();
      }

      return var6;
   }

   public void L() {
      this.Q = this.P;
      this.D = null;
   }

   public void u(Ov4 var1) {
      this.W(var1.U());
   }

   public void t(YP var1) {
      this.P = var1;
      this.D = null;
   }

   public Et2 c() {
      return this.R(null);
   }

   public Et2 R(Et2 var1) {
      boolean var2 = com.finalshell.ui.model.J2.g();
      Et2 var10000 = var1;
      if (var2) {
         var10000 = var1 != null ? var1 : this.P.s();
      }

      return var10000;
   }

   public Et2 A() {
      return this.A(null);
   }

   public Et2 A(Et2 var1) {
      boolean var2 = com.finalshell.ui.model.J2.g();
      Et2 var10000 = var1;
      if (var2) {
         var10000 = var1 != null ? var1 : this.P.K();
      }

      return var10000;
   }

   public void W(YP var1) {
      this.Q = var1;
      this.D = null;
   }

   public YP p() {
      boolean var1 = com.finalshell.ui.model.J2.g();
      YP var10000 = this.D;
      if (var1) {
         if (this.D == null) {
            this.D = m(this.Q, this.P);
         }

         var10000 = this.D;
      }

      return var10000;
   }
}





