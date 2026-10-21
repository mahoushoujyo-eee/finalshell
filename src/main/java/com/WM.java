package com;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class WM extends com.W5 {
   private int U;
   private int A;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public WM() {
      this(a(19608, 8310446517117948266L), a(30524, 8589244937408686799L));
   }

   public WM(int var1, int var2) {
      this.U = var1;
      this.A = var2;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = com.W5.q();
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      BufferedImage var8 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var6 = var1.getColorModel();
            var2 = new BufferedImage(var6, var6.createCompatibleWritableRaster(this.U, this.A), var6.isAlphaPremultiplied(), null);
         }

         var8 = var2;
      }

      Graphics2D var7 = var8.createGraphics();
      var7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      var7.drawImage(var1, 0, 0, this.U, this.A, null);
      var7.dispose();
      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0016\u007f%\u001cya\u0013}T?\u000bcq\u000e16\u0005\u000bw\u007f\u0002".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 10;
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
         var10007 = 10;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 88;
               break;
            case 1:
               var37 = 28;
               break;
            case 2:
               var37 = 92;
               break;
            case 3:
               var37 = 98;
               break;
            case 4:
               var37 = 28;
               break;
            case 5:
               var37 = 25;
               break;
            default:
               var37 = 109;
         }
      } else {
         var25 = 10;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 387946350401585980L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "üf|V0\u0089©Ój\u0098\u0086\u001aÖ*\u0012v";
            int var13 = "üf|V0\u0089©Ój\u0098\u0086\u001aÖ*\u0012v".length();
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
         var10007 = 10;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 88;
               break;
            case 1:
               var37 = 28;
               break;
            case 2:
               var37 = 92;
               break;
            case 3:
               var37 = 98;
               break;
            case 4:
               var37 = 28;
               break;
            case 5:
               var37 = 25;
               break;
            default:
               var37 = 109;
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
                  var37 = 88;
                  break;
               case 1:
                  var37 = 28;
                  break;
               case 2:
                  var37 = 92;
                  break;
               case 3:
                  var37 = 98;
                  break;
               case 4:
                  var37 = 28;
                  break;
               case 5:
                  var37 = 25;
                  break;
               default:
                  var37 = 109;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 387946350401585980L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "üf|V0\u0089©Ój\u0098\u0086\u001aÖ*\u0012v";
               int var5 = "üf|V0\u0089©Ój\u0098\u0086\u001aÖ*\u0012v".length();
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
                  var37 = 88;
                  break;
               case 1:
                  var37 = 28;
                  break;
               case 2:
                  var37 = 92;
                  break;
               case 3:
                  var37 = 98;
                  break;
               case 4:
                  var37 = 28;
                  break;
               case 5:
                  var37 = 25;
                  break;
               default:
                  var37 = 109;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24051;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





