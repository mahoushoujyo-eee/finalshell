package com;

import java.awt.Graphics2D;
import java.util.List;
import org.jetbrains.annotations.NotNull;

class Ep_2 implements com.Lf_2 {
   int o;
   final Graphics2D W;
   final pA_3 p;
   private static final long a;

   Ep_2(pA_3 var1, Graphics2D var2) {
      this.p = var1;
      this.W = var2;
      this.o = this.p.U();
   }

   @Override
   public void N(int var1, int var2, @NotNull com.YP var3, @NotNull j_2 var4, int var5) {
      int var6;
      int var7;
      pA_3 var19;
      int var10000 = _y_2.y();
      var7 = var2 - var5;
      var6 = var10000;
      pA_3.G(this.p, var1, var7, var3, var4, this.W);
      var19 = this.p;
      label63:
      if (var6 == 0) {
         if (pA_3.o(this.p) != null) {
            var19 = this.p;
            if (var6 != 0) {
               break label63;
            }

            List var8 = pA_3.o(this.p).E(var4);
            label59:
            if (var8 != null) {
               this.p.c8 = true;

               for (com.KB var10 : var8) {
                  com.YP var11 = pA_3.a(this.p, var3);
                  j_2 var12 = var4.D(var10);
                  pA_3.G(this.p, var1 + (Integer)var10.X, var7, var11, var12, this.W);
                  if (var6 != 0) {
                     break label59;
                  }

                  if (var6 != 0) {
                     break;
                  }
               }

               this.p.c8 = false;
            }
         }

         var19 = this.p;
      }

      var20 = pA_3.Y(var19);
      label45:
      if (var6 == 0) {
         if (var20 != null) {
            var20 = pA_3.Y(this.p);
            if (var6 != 0) {
               break label45;
            }

            com.KB var13 = var20.x(var1, var7 + this.p.P, var4.length());
            if (var13 != null) {
               com.YP var15 = pA_3.l(this.p, var3);
               j_2 var17 = var4.Y((Integer)var13.X - var1, (Integer)var13.S);
               pA_3.G(this.p, (Integer)var13.X, var7, var15, var17, this.W);
            }
         }

         var20 = pA_3.e(this.p);
      }

      if (var6 == 0) {
         if (var20 == null) {
            return;
         }

         var20 = pA_3.e(this.p);
      }

      com.KB var14 = var20.x(var1, var7 + this.p.P, var4.length());
      if (var6 == 0) {
         if (var14 == null) {
            return;
         }

         this.p.k = true;
      }

      com.YP var16 = pA_3.S(this.p, var3);
      j_2 var18 = var4.Y((Integer)var14.X - var1, (Integer)var14.S);
      pA_3.G(this.p, (Integer)var14.X, var7, var16, var18, this.W);
      this.p.k = false;
   }

   @Override
   public void r(int var1, int var2, int var3, com.YP var4, j_2 var5, int var6) {
      int var10000 = _y_2.M();
      int var8 = var2 - var6;
      int var7 = var10000;
      pA_3 var11 = this.p;
      if (var7 != 0) {
         if (pA_3.e(this.p) != null) {
            com.KB var9 = pA_3.e(this.p).x(var3, var8 + this.p.P, this.o - var3);
            if (var7 == 0) {
               return;
            }

            if (var9 != null) {
               com.YP var10 = pA_3.S(this.p, var4);
               pA_3.G(this.p, var1, var8, var10, var5, this.W);
               return;
            }
         }

         var11 = this.p;
      }

      pA_3.G(var11, var1, var8, var4, var5, this.W);
   }

   @Override
   public void K(int var1, int var2, int var3, int var4) {
      if (var1 < this.o) {
         this.r(var1, var2, var3, com.YP.r, new j_2((char)((int)a), this.o - var1), var4);
      }
   }

   static {
      long var0 = 5261361356709521201L;
      long var10002 = 1650211244313110289L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





