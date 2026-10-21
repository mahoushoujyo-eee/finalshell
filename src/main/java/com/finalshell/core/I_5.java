package com.finalshell.core;

public class I_5 extends N2_4 {
   public int E = a(21072, 1412584213620380446L);
   public int Y = 1;
   public int U = 1;
   public boolean m;
   public static long[] a;
   public static Integer[] b;

   @Override
   public void v(char var1) {
      boolean var2;
      char var10000;
      var2 = N_5.R();
      var10000 = (this.m) ? 1 : 0;
      label28:
      if (var2) {
         if (this.m) {
            this.m = false;
            var10000 = var1;
            if (!var2) {
               break label28;
            }

            if (var1 == a(7696, 4855059120827047775L)) {
               return;
            }
         }

         var10000 = var1;
      }

      switch (var10000) {
         case '\r':
            this.m = true;
            this.Y++;
            this.U = 1;
            if (var2) {
               break;
            }
         case '\n':
         case '\u0085':
         case '\u2028':
         case '\u2029':
            this.Y++;
            this.U = 1;
            if (var2) {
               break;
            }
         case '\t':
            this.U = this.U - (this.U - 1) % this.E + this.E;
            if (var2) {
               break;
            }
         default:
            this.U++;
      }
   }

   @Override
   public int E() {
      return this.Y;
   }

   @Override
   public void e(int var1) {
      this.Y = var1;
   }

   @Override
   public int v() {
      return this.U;
   }

   @Override
   public void R(int var1) {
      this.U = var1;
   }

   @Override
   public void E(int var1) {
      this.E = var1;
   }

   @Override
   public void V() {
      this.Y = this.U = 1;
      this.m = false;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 334;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3828438286954153836L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "¨Û°¹&B\u0094z\u0097:l/\u009e\u0002Ø9";
      int var5 = "¨Û°¹&B\u0094z\u0097:l/\u009e\u0002Ø9".length();
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





