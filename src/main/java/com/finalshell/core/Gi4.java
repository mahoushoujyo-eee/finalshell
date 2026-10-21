package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Gi4 extends Gy4 {
   public float[] X;
   public float[] e;
   public float w = 4.0F;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Gi4() {
      this.Y(1);
   }

   public void f(float var1) {
      this.w = var1;
   }

   public float D() {
      return this.w;
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      int var4 = (int)(Math.random() * 255.0);
      float var5 = (float)Math.random();
      var3[0] = (float)var1 + var5 * this.X[var4];
      var3[1] = (float)var2 + var5 * this.e[var4];
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      this.X = new float[b(17454, 4357647261016193132L)];
      String[] var3 = var10000;
      this.e = new float[b(25936, 152856635800901907L)];
      int var4 = 0;

      while (true) {
         if (var4 < b(25936, 152856635800901907L)) {
            float var5 = (float) (Math.PI * 2) * (float)var4 / 256.0F;
            this.X[var4] = (float)((double)this.w * Math.sin((double)var5));
            var6 = this;
            if (var3 == null) {
               break;
            }

            this.e[var4] = (float)((double)this.w * Math.cos((double)var5));
            var4++;
            if (var3 != null) {
               continue;
            }
         }

         var6 = this;
         break;
      }

      return var6.filter(var1, var2);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15426;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "a#F-!J\u0012\n\u000e\\?(M\u0015@d\u001bw".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 117;
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
         var10007 = 117;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 80;
               break;
            case 1:
               var37 = 63;
               break;
            case 2:
               var37 = 64;
               break;
            case 3:
               var37 = 44;
               break;
            case 4:
               var37 = 59;
               break;
            case 5:
               var37 = 77;
               break;
            default:
               var37 = 19;
         }
      } else {
         var25 = 117;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 4566877758410028636L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "-v[scû\u008f0°'CÞ\u001cÐ.O";
            int var13 = "-v[scû\u008f0°'CÞ\u001cÐ.O".length();
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
         var10007 = 117;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 80;
               break;
            case 1:
               var37 = 63;
               break;
            case 2:
               var37 = 64;
               break;
            case 3:
               var37 = 44;
               break;
            case 4:
               var37 = 59;
               break;
            case 5:
               var37 = 77;
               break;
            default:
               var37 = 19;
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
                  var37 = 80;
                  break;
               case 1:
                  var37 = 63;
                  break;
               case 2:
                  var37 = 64;
                  break;
               case 3:
                  var37 = 44;
                  break;
               case 4:
                  var37 = 59;
                  break;
               case 5:
                  var37 = 77;
                  break;
               default:
                  var37 = 19;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 4566877758410028636L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "-v[scû\u008f0°'CÞ\u001cÐ.O";
               int var5 = "-v[scû\u008f0°'CÞ\u001cÐ.O".length();
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
                  var37 = 80;
                  break;
               case 1:
                  var37 = 63;
                  break;
               case 2:
                  var37 = 64;
                  break;
               case 3:
                  var37 = 44;
                  break;
               case 4:
                  var37 = 59;
                  break;
               case 5:
                  var37 = 77;
                  break;
               default:
                  var37 = 19;
            }
         }
      }
   }
}





