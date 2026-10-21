package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class WW extends W5 {
   public BufferedImage o;
   public BufferedImage t;
   public static String a;

   public WW() {
   }

   public WW(BufferedImage var1, BufferedImage var2) {
      this.t = var1;
      this.o = var2;
   }

   public void s(BufferedImage var1) {
      this.o = var1;
   }

   public BufferedImage m() {
      return this.o;
   }

   public void w(BufferedImage var1) {
      this.t = var1;
   }

   public BufferedImage h() {
      return this.t;
   }

   public static void m(Raster var0, WritableRaster var1, Raster var2) {
      int var4 = var0.getMinX();
      int var5 = var0.getMinY();
      int var6 = var0.getWidth();
      String[] var10000 = W5.q();
      int var7 = var0.getHeight();
      int[] var8 = null;
      int[] var9 = null;
      int[] var10 = null;
      int var11 = 0;
      String[] var3 = var10000;

      while (var11 < var7) {
         var8 = var0.getPixels(var4, var5, var6, 1, var8);
         var9 = var2.getPixels(var4, var5, var6, 1, var9);
         var10 = var1.getPixels(var4, var5, var6, 1, var10);
         int var12 = var4;
         int var13 = 0;

         while (true) {
            if (var13 < var6) {
               int var14 = var8[var12];
               int var15 = var10[var12];
               int var16 = var8[var12 + 1];
               int var17 = var10[var12 + 1];
               int var18 = var8[var12 + 2];
               int var19 = var10[var12 + 2];
               int var20 = var8[var12 + 3];
               int var21 = var10[var12 + 3];
               float var22 = (float)var9[var12 + 3] / 255.0F;
               float var23 = 1.0F - var22;
               var10[var12] = (int)(var22 * (float)var14 + var23 * (float)var15);
               var10[var12 + 1] = (int)(var22 * (float)var16 + var23 * (float)var17);
               var10[var12 + 2] = (int)(var22 * (float)var18 + var23 * (float)var19);
               var10[var12 + 3] = (int)(var22 * (float)var20 + var23 * (float)var21);
               var12 += 4;
               var13++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            var1.setPixels(var4, var5, var6, 1, var10);
            var5++;
            var11++;
            break;
         }

         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var10000 = W5.q();
      int var6 = var1.getType();
      WritableRaster var7 = var1.getRaster();
      String[] var3 = var10000;
      BufferedImage var9 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var9 = var2;
      }

      WritableRaster var8 = var9.getRaster();
      BufferedImage var10 = this.o;
      if (var3 != null) {
         if (this.o != null) {
            if (var3 == null) {
               return this.t;
            }

            if (this.t != null) {
               m(var1.getRaster(), var2.getRaster(), this.t.getRaster());
            }
         }

         var10 = var2;
      }

      return var10;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Bz\u007f\u007f%\u00055Bz\u007f8eL".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 50;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 50;
         var10006 = var0;
      } else {
         var6 = 50;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 50;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 59;
               break;
            case 1:
               var23 = 45;
               break;
            case 2:
               var23 = 52;
               break;
            case 3:
               var23 = 36;
               break;
            case 4:
               var23 = 121;
               break;
            case 5:
               var23 = 80;
               break;
            default:
               var23 = 40;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





