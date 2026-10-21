package com.finalshell.core;

import java.awt.image.BufferedImage;

public class GN3 extends Gy4 {
   public float[] T;
   public float[] M;
   public float n = 4.0F;
   public float S = 4.0F;
   public float i = 1.0F;
   public float N = 1.0F;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public GN3() {
      this.Y(1);
   }

   public void C(float var1) {
      this.n = var1;
   }

   public float u() {
      return this.n;
   }

   public void W(float var1) {
      this.S = var1;
   }

   public float E() {
      return this.S;
   }

   public void L(float var1) {
      this.i = var1;
   }

   public float L() {
      return this.i;
   }

   public void o(float var1) {
      this.N = var1;
   }

   public float a() {
      return this.N;
   }

   public void r() {
      this.T = new float[b(31694, 5517541827996539773L)];
      String[] var10000 = W5.q();
      this.M = new float[b(15666, 3174700197610003840L)];
      int var2 = 0;
      String[] var1 = var10000;

      while (var2 < b(15666, 3174700197610003840L)) {
         float var3 = (float) (Math.PI * 2) * (float)var2 / 256.0F * this.N;
         this.T[var2] = (float)((double)(-this.S) * Math.sin((double)var3));
         this.M[var2] = (float)((double)this.S * Math.cos((double)var3));
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   public int F(int var1, int var2) {
      return Iw4.e((int)(127.0F * (1.0F + UZ.x((float)var1 / this.n, (float)var2 / this.n))));
   }

   @Override
   public void h(int var1, int var2, float[] var3) {
      int var4 = this.F(var1, var2);
      var3[0] = (float)var1 + this.T[var4];
      var3[1] = (float)var2 + this.M[var4];
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.r();
      return super.filter(var1, var2);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8371;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "I_SHu6!\"{ANx(0#\u0018\u000e".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 18;
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
         var10007 = 18;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 31;
               break;
            case 1:
               var37 = 36;
               break;
            case 2:
               var37 = 50;
               break;
            case 3:
               var37 = 46;
               break;
            case 4:
               var37 = 8;
               break;
            case 5:
               var37 = 86;
               break;
            default:
               var37 = 71;
         }
      } else {
         var25 = 18;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 6123596083155539961L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "¸Õá¤·bM\u0084ª2jUî\u009d\u008by";
            int var13 = "¸Õá¤·bM\u0084ª2jUî\u009d\u008by".length();
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

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 18;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 31;
               break;
            case 1:
               var37 = 36;
               break;
            case 2:
               var37 = 50;
               break;
            case 3:
               var37 = 46;
               break;
            case 4:
               var37 = 8;
               break;
            case 5:
               var37 = 86;
               break;
            default:
               var37 = 71;
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
                  var37 = 31;
                  break;
               case 1:
                  var37 = 36;
                  break;
               case 2:
                  var37 = 50;
                  break;
               case 3:
                  var37 = 46;
                  break;
               case 4:
                  var37 = 8;
                  break;
               case 5:
                  var37 = 86;
                  break;
               default:
                  var37 = 71;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 6123596083155539961L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "¸Õá¤·bM\u0084ª2jUî\u009d\u008by";
               int var5 = "¸Õá¤·bM\u0084ª2jUî\u009d\u008by".length();
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

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 31;
                  break;
               case 1:
                  var37 = 36;
                  break;
               case 2:
                  var37 = 50;
                  break;
               case 3:
                  var37 = 46;
                  break;
               case 4:
                  var37 = 8;
                  break;
               case 5:
                  var37 = 86;
                  break;
               default:
                  var37 = 71;
            }
         }
      }
   }
}





