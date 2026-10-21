package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class HQ3 extends W5 {
   public int B;
   public int X;
   public int y;
   public int p;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public HQ3() {
      this(0, 0, a(6461, 7641045286152647198L), a(26581, 5945528850699209975L));
   }

   public HQ3(int var1, int var2, int var3, int var4) {
      this.B = var1;
      this.X = var2;
      this.y = var3;
      this.p = var4;
   }

   public void i(int var1) {
      this.B = var1;
   }

   public int C() {
      return this.B;
   }

   public void E(int var1) {
      this.X = var1;
   }

   public int c() {
      return this.X;
   }

   public void P(int var1) {
      this.y = var1;
   }

   public int b() {
      return this.y;
   }

   public void z(int var1) {
      this.p = var1;
   }

   public int q() {
      return this.p;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      BufferedImage var8 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var6 = var1.getColorModel();
            var2 = new BufferedImage(var6, var6.createCompatibleWritableRaster(this.y, this.p), var6.isAlphaPremultiplied(), null);
         }

         var8 = var2;
      }

      Graphics2D var7 = var8.createGraphics();
      var7.drawRenderedImage(var1, AffineTransform.getTranslateInstance((double)(-this.B), (double)(-this.X)));
      var7.dispose();
      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11043;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "%\\bz8i\u001fNvca'".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 35;
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
         var10007 = 35;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 66;
               break;
            case 1:
               var37 = 22;
               break;
            case 2:
               var37 = 50;
               break;
            case 3:
               var37 = 45;
               break;
            case 4:
               var37 = 116;
               break;
            case 5:
               var37 = 56;
               break;
            default:
               var37 = 72;
         }
      } else {
         var25 = 35;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 5107400691157314024L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "ó\n\u0002r{É\u001bÖÒQúÊyÇe?";
            int var13 = "ó\n\u0002r{É\u001bÖÒQúÊyÇe?".length();
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
         var10007 = 35;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 66;
               break;
            case 1:
               var37 = 22;
               break;
            case 2:
               var37 = 50;
               break;
            case 3:
               var37 = 45;
               break;
            case 4:
               var37 = 116;
               break;
            case 5:
               var37 = 56;
               break;
            default:
               var37 = 72;
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
                  var37 = 66;
                  break;
               case 1:
                  var37 = 22;
                  break;
               case 2:
                  var37 = 50;
                  break;
               case 3:
                  var37 = 45;
                  break;
               case 4:
                  var37 = 116;
                  break;
               case 5:
                  var37 = 56;
                  break;
               default:
                  var37 = 72;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 5107400691157314024L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "ó\n\u0002r{É\u001bÖÒQúÊyÇe?";
               int var5 = "ó\n\u0002r{É\u001bÖÒQúÊyÇe?".length();
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
                  var37 = 66;
                  break;
               case 1:
                  var37 = 22;
                  break;
               case 2:
                  var37 = 50;
                  break;
               case 3:
                  var37 = 45;
                  break;
               case 4:
                  var37 = 116;
                  break;
               case 5:
                  var37 = 56;
                  break;
               default:
                  var37 = 72;
            }
         }
      }
   }
}





