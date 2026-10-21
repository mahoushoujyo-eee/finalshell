package com.finalshell.core;

public class Gv4 extends HN3 {
   public float v = 32.0F;
   public float u = 1.0F;
   public float k = 0.0F;
   public float m = 1.0F;
   public float x = 1.0F;
   public float I = 0.5F;
   public float T = 0.5F;
   public int U;
   public float S = 1.0F;
   public float C = 0.0F;
   public float V = 0.0F;
   public float s = 1.0F;
   public Po2 l = new C4();
   public SC F = new UZ();
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void L(float var1) {
      this.m = var1;
   }

   public float J() {
      return this.m;
   }

   public void B(SC var1) {
      this.F = var1;
   }

   public SC M() {
      return this.F;
   }

   public void L(int var1) {
      this.U = var1;
   }

   public int A() {
      return this.U;
   }

   public void l(float var1) {
      this.v = var1;
   }

   public float R() {
      return this.v;
   }

   public void I(float var1) {
      this.u = var1;
   }

   public float K() {
      return this.u;
   }

   public void y(float var1) {
      this.k = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.S = var2;
      this.C = var3;
      this.V = -var3;
      this.s = var2;
   }

   public float I() {
      return this.k;
   }

   public void N(float var1) {
      this.x = var1;
   }

   public float N() {
      return this.x;
   }

   public void g(Po2 var1) {
      this.l = var1;
   }

   public Po2 r() {
      return this.l;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4;
      float var21;
      label36: {
         float var5 = this.S * (float)var1 + this.C * (float)var2;
         float var6 = this.V * (float)var1 + this.s * (float)var2;
         String[] var10000 = W5.q();
         var5 /= this.v;
         var6 /= this.v * this.u;
         var4 = var10000;
         var21 = this.x;
         if (var4 != null) {
            if ((double)this.x == 1.0) {
               var21 = UZ.x(var5, var6);
               break label36;
            }

            var21 = var5;
         }

         var21 = UZ.q(var21, var6, this.x);
      }

      int var9;
      label30: {
         int var8;
         float var18;
         label29: {
            var18 = var21;
            var18 = var18 * 0.5F + 0.5F;
            var18 = NM.w(var18, this.I);
            var18 = NM.E(var18, this.T);
            var18 *= this.m;
            var8 = var3 & a(12631, 4424826963692083416L);
            Po2 var22 = this.l;
            if (var4 != null) {
               if (this.l == null) {
                  break label29;
               }

               var22 = this.l;
            }

            var9 = var22.D(var18);
            if (var4 != null) {
               break label30;
            }
         }

         var9 = Iw4.e((int)(var18 * 255.0F));
         int var10 = var9 << a(20503, 812447778416540058L);
         int var11 = var9 << a(22594, 5252387932988617166L);
         var9 = var8 | var10 | var11 | var9;
      }

      int var23 = this.U;
      if (var4 != null) {
         if (this.U != 0) {
            var9 = Iw4.P(var3, var9, this.U);
         }

         var23 = var9;
      }

      return var23;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27021;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Kn-\u001d\fe}0E:\u0000\nr61%".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 27;
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
         var10007 = 27;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 4;
               break;
            case 1:
               var37 = 16;
               break;
            case 2:
               var37 = 78;
               break;
            case 3:
               var37 = 114;
               break;
            case 4:
               var37 = 98;
               break;
            case 5:
               var37 = 12;
               break;
            default:
               var37 = 3;
         }
      } else {
         var25 = 27;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 6777714783949377007L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "#Ù÷á\u0089%ôeT\u0002\u0097\u0081\u008ebü)\n\u0015\u008e\u0096ZX\u00957";
            int var13 = "#Ù÷á\u0089%ôeT\u0002\u0097\u0081\u008ebü)\n\u0015\u008e\u0096ZX\u00957".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

            b = var14;
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 27;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 4;
               break;
            case 1:
               var37 = 16;
               break;
            case 2:
               var37 = 78;
               break;
            case 3:
               var37 = 114;
               break;
            case 4:
               var37 = 98;
               break;
            case 5:
               var37 = 12;
               break;
            default:
               var37 = 3;
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
                  var37 = 4;
                  break;
               case 1:
                  var37 = 16;
                  break;
               case 2:
                  var37 = 78;
                  break;
               case 3:
                  var37 = 114;
                  break;
               case 4:
                  var37 = 98;
                  break;
               case 5:
                  var37 = 12;
                  break;
               default:
                  var37 = 3;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 6777714783949377007L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "#Ù÷á\u0089%ôeT\u0002\u0097\u0081\u008ebü)\n\u0015\u008e\u0096ZX\u00957";
               int var5 = "#Ù÷á\u0089%ôeT\u0002\u0097\u0081\u008ebü)\n\u0015\u008e\u0096ZX\u00957".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

               b = var6;
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 4;
                  break;
               case 1:
                  var37 = 16;
                  break;
               case 2:
                  var37 = 78;
                  break;
               case 3:
                  var37 = 114;
                  break;
               case 4:
                  var37 = 98;
                  break;
               case 5:
                  var37 = 12;
                  break;
               default:
                  var37 = 3;
            }
         }
      }
   }
}





