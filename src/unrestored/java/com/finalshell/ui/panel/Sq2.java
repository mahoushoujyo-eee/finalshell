package com.finalshell.ui.panel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JScrollBar;

public class Sq2 extends SZ {
   public final Co2 F;
   public static long[] a;
   public static Integer[] c;

   public Sq2(Co2 var1, Component var2) {
      super(var2);
      this.F = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      int var10;
      String var1;
      Dimension var2;
      Dimension var5;
      label85: {
         int var3;
         int var4;
         label86: {
            Co2 var11;
            label87: {
               var2 = super.getPreferredSize();
               var3 = this.F.getFixedCellWidth();
               String var10000 = Co2.U$String();
               var4 = this.F.getFixedCellHeight();
               var1 = var10000;
               var10 = var3;
               label79:
               if (var1 != null) {
                  if (var3 != -1) {
                     var10 = var4;
                     if (var1 == null) {
                        break label79;
                     }

                     if (var4 != -1) {
                        var5 = new Dimension(var3, var4);
                        if (var1 != null) {
                           break label85;
                        }
                     }
                  }

                  var11 = this.F;
                  if (var1 == null) {
                     break label87;
                  }

                  var10 = this.F.getModel().getSize();
               }

               if (var10 > 0) {
                  var5 = this.F.getCellBounds(0, 0).getSize();
                  if (var1 != null) {
                     break label86;
                  }
               }

               var11 = this.F;
            }

            label65: {
               OQ var6 = var11.l$OQ();
               OQ var12 = var6;
               if (var1 != null) {
                  if (var6 == null) {
                     break label65;
                  }

                  var12 = var6;
               }

               var5 = var12.getPreferredSize();
               if (var1 != null) {
                  break label86;
               }
            }

            var5 = new Dimension(a(2084, 725650633045827506L), a(22096, 2816349845321613767L));
         }

         int var13 = var3;
         byte var10001 = -1;
         if (var1 != null) {
            if (var3 != -1) {
               var5.width = var3;
               if (var1 != null) {
                  break label85;
               }
            }

            var13 = var4;
            var10001 = -1;
         }

         if (var13 != var10001) {
            var5.width = var3;
         }
      }

      Insets var9;
      int var15;
      label48: {
         label89: {
            var9 = this.getInsets();
            JScrollBar var7 = this.getVerticalScrollBar();
            JScrollBar var14 = var7;
            if (var1 != null) {
               if (var7 == null) {
                  break label89;
               }

               var14 = var7;
            }

            var15 = (var14.isShowing()) ? 1 : 0;
            if (var1 == null) {
               break label48;
            }

            if (var15 != 0) {
               var15 = var7.getPreferredSize().width;
               break label48;
            }
         }

         var15 = 0;
      }

      int var8 = var15;
      var2.width = var5.width * this.F.g + var9.left + var9.right + var8 + 1;
      var2.height = var5.height * this.F.d + var9.top + var9.bottom + 1;
      if (Ky4.F$arrString() != null) {
         Co2.E("GyEWg");
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22423;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1231276213173043739L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Û¦\n\u0003\u0007\u000eC\u0086Éb¾rÏ*\u009dó";
      int var5 = "Û¦\n\u0003\u0007\u000eC\u0086Éb¾rÏ*\u009dó".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
      c = new Integer[2];
   }
}





