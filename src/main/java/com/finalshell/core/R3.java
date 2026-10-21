package com.finalshell.core;

import com.finalshell.ui.model.PG3;
import com.finalshell.ui.panel.Ky4;
import org.jetbrains.annotations.NotNull;

public class R3 {
   public final PX[] B;
   public PX H;
   public PX w;
   public PX u;
   public static long[] a;
   public static Integer[] b;

   public R3() {
      int[] var10000 = XP.j();
      super();
      this.B = new PX[4];
      int[] var1 = var10000;
      int var2 = 0;

      while (true) {
         if (var2 < this.B.length) {
            this.B[var2] = new PX(var2);
            var2++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         this.o();
         break;
      }
   }

   public void k(@NotNull PX var1, char var2) {
      var1.t(PG3.T(var2));
   }

   public void E(int var1, PG3 var2) {
      this.D(var1).t(var2);
   }

   @NotNull
   public PX V() {
      int[] var10000 = XP.j();
      PX var2 = this.H;
      int[] var1 = var10000;
      PX var3 = this.u;
      if (var1 == null) {
         if (this.u != null) {
            var2 = this.u;
            this.u = null;
         }

         var3 = var2;
      }

      return var3;
   }

   @NotNull
   public PX I() {
      return this.w;
   }

   @NotNull
   public PX D(int var1) {
      return this.B[var1 % 4];
   }

   public char U(char var1) {
      return XP.P(var1, this.V(), this.I());
   }

   public void F(int var1) {
      this.u = this.D(var1);
   }

   public void o() {
      int[] var10000 = XP.j();
      int var2 = 0;
      int[] var1 = var10000;

      while (true) {
         if (var2 < this.B.length) {
            var3 = this;
            if (var1 != null) {
               break;
            }

            PX var4 = this.B[var2];
            int var10001 = var2;
            if (var1 == null) {
               var10001 = var2 == 1 ? a(19207, 6413965814885595917L) : a(9579, 53835227845776736L);
            }

            var4.t(PG3.T((char)var10001));
            var2++;
            if (var1 == null) {
               continue;
            }

            Ky4.K(new String[1]);
         }

         this.H = this.B[0];
         this.w = this.B[1];
         var3 = this;
         break;
      }

      var3.u = null;
   }

   public void f(int var1) {
      this.H = this.D(var1);
   }

   public void o(int var1) {
      this.w = this.D(var1);
   }

   public int D() {
      int[] var1 = XP.j();
      PX var10000 = this.u;
      if (var1 == null) {
         if (this.u == null) {
            return -1;
         }

         var10000 = this.u;
      }

      return var10000.l();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28683;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1346149451910295822L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "+\u001f\u0080=\u0097\u0095d,<-æXZr\n3";
      int var5 = "+\u001f\u0080=\u0097\u0095d,<-æXZr\n3".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





