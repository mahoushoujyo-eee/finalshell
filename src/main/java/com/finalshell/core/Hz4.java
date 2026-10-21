package com.finalshell.core;

public class Hz4 extends HN3 {
   public int C;
   public int b;
   public float P = 0.0F;
   public float R = 1.0F;
   public float j = 10.0F;
   public int m;
   public boolean r;
   public float N = 1.0F;
   public float a = 0.0F;
   public float u = 0.0F;
   public float c = 1.0F;
   public static String d;
   public static long[] e;
   public static Integer[] f;

   public void K(float var1) {
      this.P = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.N = var2;
      this.a = var3;
      this.u = -var3;
      this.c = var2;
   }

   public float K() {
      return this.P;
   }

   public void M(int var1) {
      this.m = var1;
   }

   public int v() {
      return this.m;
   }

   public void E(float var1) {
      this.R = var1;
   }

   public float t() {
      return this.R;
   }

   public void t(float var1) {
      this.j = var1;
   }

   public float X() {
      return this.j;
   }

   public void u(boolean var1) {
      this.r = var1;
   }

   public boolean x() {
      return this.r;
   }

   @Override
   public void C(int var1, int var2) {
      this.C = var1;
      this.b = var2;
      super.C(var1, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4;
      int var8;
      label41: {
         float var5;
         label44: {
            String[] var10000 = W5.q();
            var5 = this.N * (float)var1 + this.a * (float)var2;
            float var6 = this.u * (float)var1 + this.c * (float)var2;
            var4 = var10000;
            var8 = this.m;
            byte var10001 = 2;
            if (var4 != null) {
               if (this.m == 2) {
                  var5 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
                  if (var4 != null) {
                     break label44;
                  }
               }

               var8 = this.m;
               var10001 = 3;
            }

            if (var4 != null) {
               if (var8 == var10001) {
                  var5 = NM.i(var5, 16.0F);
                  if (var4 != null) {
                     break label44;
                  }
               }

               var8 = this.m;
               if (var4 == null) {
                  break label41;
               }

               var10001 = 4;
            }

            if (var8 == var10001) {
               var5 = this.J(var5, 16.0F);
            }
         }

         var8 = (int)(NM.k(this.R, this.R + this.j, var5) * 255.0F);
      }

      int var7 = var8;
      var8 = (this.r) ? 1 : 0;
      if (var4 != null) {
         if (this.r) {
            var7 = a(30267, 7354607472132633087L) - var7;
         }

         var8 = var7 << a(24012, 7938124610400229898L) | var3 & a(18617, 8180241593083137916L);
      }

      return var8;
   }

   public float J(float var1, float var2) {
      String[] var10000 = W5.q();
      var1 = NM.i(var1, 2.0F * var2);
      String[] var3 = var10000;
      float var5 = var1;
      if (var3 != null) {
         if (var1 > var2) {
            return 2.0F * var2 - var1;
         }

         var5 = var1;
      }

      return var5;
   }

   @Override
   public String toString() {
      return d;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18372;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "NFfMRcG".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 15;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 15;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 7;
               break;
            case 1:
               var37 = 40;
               break;
            case 2:
               var37 = 13;
               break;
            case 3:
               var37 = 39;
               break;
            case 4:
               var37 = 115;
               break;
            case 5:
               var37 = 66;
               break;
            default:
               var37 = 102;
         }
      } else {
         var25 = 15;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            d = var29;
            long var9 = 10720500309899610L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "Ð2ÙÇr/\bZ\u0003äÞ¶ ®IÙãÌ]í\u008dx#H";
            int var13 = "Ð2ÙÇr/\bZ\u0003äÞ¶ ®IÙãÌ]í\u008dx#H".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            e = var14;
            f = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 15;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 7;
               break;
            case 1:
               var37 = 40;
               break;
            case 2:
               var37 = 13;
               break;
            case 3:
               var37 = 39;
               break;
            case 4:
               var37 = 115;
               break;
            case 5:
               var37 = 66;
               break;
            default:
               var37 = 102;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 7;
                  break;
               case 1:
                  var37 = 40;
                  break;
               case 2:
                  var37 = 13;
                  break;
               case 3:
                  var37 = 39;
                  break;
               case 4:
                  var37 = 115;
                  break;
               case 5:
                  var37 = 66;
                  break;
               default:
                  var37 = 102;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               d = var27;
               long var0 = 10720500309899610L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "Ð2ÙÇr/\bZ\u0003äÞ¶ ®IÙãÌ]í\u008dx#H";
               int var5 = "Ð2ÙÇr/\bZ\u0003äÞ¶ ®IÙãÌ]í\u008dx#H".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               e = var6;
               f = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 7;
                  break;
               case 1:
                  var37 = 40;
                  break;
               case 2:
                  var37 = 13;
                  break;
               case 3:
                  var37 = 39;
                  break;
               case 4:
                  var37 = 115;
                  break;
               case 5:
                  var37 = 66;
                  break;
               default:
                  var37 = 102;
            }
         }
      }
   }
}





