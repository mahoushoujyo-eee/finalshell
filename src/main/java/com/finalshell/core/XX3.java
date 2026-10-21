package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class XX3 {
   public static long[] a;
   public static Integer[] b;

   public static BufferedImage C(BufferedImage var0, boolean var1) {
      int var10000 = ConnectionProperty.y();
      BufferedImage var3 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
      int var4 = var0.getWidth();
      int var5 = var0.getHeight();
      int var2 = var10000;
      int[] var6 = new int[var4 * var5];
      var6 = var0.getRGB(0, 0, var4, var5, var6, 0, var4);
      int var7 = 0;
      int var8 = var4;
      int var9 = 0;

      label54:
      while (true) {
         var10000 = var9;

         label51:
         while (var10000 < var5) {
            if (var2 != 0) {
               return var3;
            }

            int var10 = 0;

            while (var10 < var4) {
               Color var11 = new Color(var0.getRGB(var10, var9), true);
               int var12 = var11.getAlpha();
               int var13 = var11.getRed();
               int var14 = var11.getGreen();
               int var15 = var11.getBlue();
               float var16 = 0.0F;
               int var17 = a(32228, 3365650341355253721L);
               var10000 = (var1) ? 1 : 0;
               if (var2 != 0) {
                  continue label51;
               }

               label45: {
                  if (var2 == 0) {
                     if (!var1) {
                        var16 = (float)Math.sqrt(Math.pow((double)(var10 - var8), 2.0) + Math.pow((double)(var9 - var8), 2.0));
                        if (var2 == 0) {
                           break label45;
                        }
                     }

                     var10000 = var10;
                  }

                  var16 = (float)Math.sqrt(Math.pow((double)var10000, 2.0) + Math.pow((double)(var9 - var8), 2.0));
               }

               var17 = (int)(255.0F * var16 / (float)var4);
               var10000 = var17;
               int var10001 = a(6814, 7803854575031683234L);
               if (var2 == 0) {
                  if (var17 > var10001) {
                     var17 = a(6814, 7803854575031683234L);
                  }

                  var10000 = a(6814, 7803854575031683234L);
                  var10001 = var17;
               }

               var17 = var10000 - var10001;
               var11 = new Color(var13, var14, var15, var17);
               var6[var7] = var11.getRGB();
               var7++;
               var10++;
               if (var2 != 0) {
                  break;
               }
            }

            var9++;
            if (var2 == 0) {
               continue label54;
            }
            break;
         }

         var3.setRGB(0, 0, var4, var5, var6, 0, var4);
         return var3;
      }
   }

   public static BufferedImage G(BufferedImage var0, boolean var1) {
      int var10000 = ConnectionProperty.y();
      BufferedImage var3 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
      int var2 = var10000;
      Graphics2D var4 = var3.createGraphics();
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int[] var7 = new int[var5 * var6];
      var7 = var0.getRGB(0, 0, var5, var6, var7, 0, var5);
      int var8 = 0;
      int var9 = 0;

      label55:
      while (true) {
         var10000 = var9;

         label52:
         while (var10000 < var6) {
            if (var2 != 0) {
               return var3;
            }

            int var10 = 0;

            while (var10 < var5) {
               Color var11 = new Color(var0.getRGB(var10, var9), true);
               int var12 = var11.getAlpha();
               int var13 = var11.getRed();
               int var14 = var11.getGreen();
               int var15 = var11.getBlue();
               int var16 = (int)(255.0F * (float)var9 / (float)var6);
               var10000 = (var1) ? 1 : 0;
               if (var2 != 0) {
                  continue label52;
               }

               if (!var1) {
               }

               var10000 = var16;
               if (var2 == 0) {
                  if (var16 > a(6814, 7803854575031683234L)) {
                     var16 = a(6814, 7803854575031683234L);
                  }

                  var10000 = (var1) ? 1 : 0;
               }

               label43: {
                  if (var2 == 0) {
                     if (var10000 == 0) {
                        break label43;
                     }

                     var10000 = a(6814, 7803854575031683234L) - var16;
                  }

                  var16 = var10000;
               }

               var11 = new Color(var13, var14, var15, var16);
               var7[var8] = var11.getRGB();
               var8++;
               var10++;
               if (var2 != 0) {
                  break;
               }
            }

            var9++;
            if (var2 == 0) {
               continue label55;
            }
            break;
         }

         var3.setRGB(0, 0, var5, var6, var7, 0, var5);
         return var3;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4668;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6736174549470996823L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "õ$©j±¬á\n/`¦!T\u0098\u0006q";
      int var5 = "õ$©j±¬á\n/`¦!T\u0098\u0006q".length();
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





