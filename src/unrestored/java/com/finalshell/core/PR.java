package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class PR implements CompositeContext {
   public int B;
   public static long[] a;
   public static Integer[] b;

   public PR(int var1, ColorModel var2, ColorModel var3) {
      this.B = var1;
   }

   @Override
   public void dispose() {
   }

   @Override
   public void compose(Raster var1, Raster var2, WritableRaster var3) {
      int var21;
      String var10000 = RA3.c();
      int var5 = var1.getMinX();
      String var4 = var10000;
      int var6 = var1.getMinY();
      int var7 = var1.getWidth();
      int var8 = var1.getHeight();
      int[] var9 = null;
      int[] var10 = null;
      int[] var11 = null;
      int[] var12 = new int[var7 * 4];
      int var13 = 0;

      label84:
      while (true) {
         int var20 = var13;

         label82:
         while (true) {
            if (var20 >= var8) {
               break label84;
            }

            var9 = var1.getPixels(var5, var6, var7, 1, var9);
            var11 = var2.getPixels(var5, var6, var7, 1, var11);
            int var14 = 0;
            byte var15 = 0;
            int var16 = 0;

            while (var16 < var7) {
               int var17 = var9[var15 + 3];
               var20 = var13;
               if (var4 != null) {
                  continue label82;
               }

               if (var4 == null) {
                  var20 = var13 != 0 ? var10[var15 + 3] : var17;
               }

               label76: {
                  label90: {
                     label74: {
                        label91: {
                           int var18 = var20;
                           var21 = var13;
                           label72:
                           if (var4 == null) {
                              if (var13 != 0) {
                                 var21 = var16;
                                 if (var4 != null) {
                                    break label72;
                                 }

                                 if (var16 != 0) {
                                    var21 = (var17 ^ var14) & a(3409, 1567581140995091219L);
                                    if (var4 != null) {
                                       break label74;
                                    }

                                    if (var21 != 0) {
                                       break label91;
                                    }
                                 }
                              }

                              var21 = (var17 ^ var18) & a(4772, 4612832726460675301L);
                           }

                           if (var4 != null) {
                              break label74;
                           }

                           if (var21 == 0) {
                              break label90;
                           }
                        }

                        var21 = (this.B + var13 + var16) % a(15787, 4422218822540106728L);
                     }

                     label55: {
                        if (var21 > 4) {
                           var12[var15] = 0;
                           var12[var15 + 1] = 0;
                           var12[var15 + 2] = 0;
                           if (var4 == null) {
                              break label55;
                           }
                        }

                        var12[var15] = a(12229, 6536340609629751680L);
                        var12[var15 + 1] = a(22950, 8212422530587754470L);
                        var12[var15 + 2] = a(1157, 5268441392198460097L);
                     }

                     var12[var15 + 3] = a(22950, 8212422530587754470L);
                     if (var4 == null) {
                        break label76;
                     }
                  }

                  var12[var15] = var11[var15];
                  var12[var15 + 1] = var11[var15 + 1];
                  var12[var15 + 2] = var11[var15 + 2];
                  var12[var15] = a(22950, 8212422530587754470L);
                  var12[var15 + 1] = 0;
                  var12[var15 + 2] = 0;
                  var12[var15 + 3] = 0;
               }

               var14 = var17;
               var15 += 4;
               var16++;
               if (var4 != null) {
                  break;
               }
            }

            var3.setPixels(var5, var6, var7, 1, var12);
            int[] var19 = var9;
            var9 = var10;
            var10 = var19;
            var6++;
            var13++;
            if (var4 != null) {
               break label84;
            }
            break;
         }
      }

      if (Ky4.F$arrString() != null) {
         RA3.C("vaz7O");
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9792;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8556438887050563211L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "õüÐÄµä1\u0092õ\u0096\u001fî°\u0000úî7rX\u001f}aå\u0018}Ñá6 pUi";
      int var5 = "õüÐÄµä1\u0092õ\u0096\u001fî°\u0000úî7rX\u001f}aå\u0018}Ñá6 pUi".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "8\u000b:´\u0011\bì53S\u0011\u00903\rÇô";
                  var5 = "8\u000b:´\u0011\bì53S\u0011\u00903\rÇô".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





