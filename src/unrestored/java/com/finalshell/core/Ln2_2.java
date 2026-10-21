package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QG2;
import com.finalshell.ui.panel.XT3;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.MultipleGradientPaint.CycleMethod;
import javax.swing.JComponent;

public class Ln2_2 extends Lz2_2 {
   public static float[] D;
   public static Color[] W;
   public static long[] a;
   public static Integer[] b;

   public Ln2_2() {
   }

   public void B(Graphics2D var1, Rectangle var2, QG2 var3) {
      String var4;
      byte var5;
      int var12;
      String var10000 = XT3.l();
      var5 = (byte)((var3.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      var4 = var10000;
      var12 = var3.w();
      label103:
      if (var4 != null) {
         if (var12 != a(14401, 1552294392319821209L)) {
            var12 = var3.w();
            if (var4 == null) {
               break label103;
            }

            if (var12 != 2) {
               var12 = 0;
               break label103;
            }
         }

         var12 = 1;
      }

      int var6;
      label95: {
         var6 = var12;
         var12 = var5;
         if (var4 != null) {
            if (var5 != 0) {
               var12 = var3.w();
               if (var4 != null) {
                  if (var12 != a(26811, 1921181376836539744L)) {
                     var12 = var3.w();
                     if (var4 == null) {
                        break label95;
                     }

                     if (var12 != a(30839, 5469388559655929261L)) {
                        var12 = 0;
                        break label95;
                     }
                  }

                  var12 = 1;
               }
               break label95;
            }

            var12 = var3.w();
         }

         label83:
         if (var4 != null) {
            if (var12 != 2) {
               var12 = var3.w();
               if (var4 == null) {
                  break label83;
               }

               if (var12 != 4) {
                  var12 = 0;
                  break label83;
               }
            }

            var12 = 1;
         }
      }

      label106: {
         int var7 = var12;
         var12 = var6;
         if (var4 != null) {
            if (var6 != 0) {
               if (var7 != 0) {
                  Rectangle var8 = new Rectangle(var2.x, var2.y, var2.width * 2, var2.height * 2);
                  var1.setPaint(new RadialGradientPaint(var8, D, W, CycleMethod.NO_CYCLE));
                  var1.fill(var2);
                  var1.setPaint(var3.isEnabled() ? NJ3.I : NJ3.r);
                  var1.drawLine(var2.x + var2.width - 1, var2.y + var2.height - 1, var2.x + var2.width - 1, var2.y + var2.height - 1);
                  if (var4 != null) {
                     break label106;
                  }
               }

               Rectangle var9 = new Rectangle(var2.x - var2.width, var2.y, var2.width * 2, var2.height * 2);
               var1.setPaint(new RadialGradientPaint(var9, D, W, CycleMethod.NO_CYCLE));
               var1.fill(var2);
               var1.setPaint(var3.isEnabled() ? NJ3.I : NJ3.r);
               var1.drawLine(var2.x, var2.y + var2.height - 1, var2.x, var2.y + var2.height - 1);
               if (var4 != null) {
                  break label106;
               }
            }

            var12 = var7;
         }

         if (var12 != 0) {
            Rectangle var10 = new Rectangle(var2.x, var2.y - var2.height, var2.width * 2, var2.height * 2);
            var1.setPaint(new RadialGradientPaint(var10, D, W, CycleMethod.NO_CYCLE));
            var1.fill(var2);
            var1.setPaint(var3.isEnabled() ? NJ3.I : NJ3.r);
            var1.drawLine(var2.x + var2.width - 1, var2.y, var2.x + var2.width - 1, var2.y);
            if (var4 != null) {
               break label106;
            }
         }

         Rectangle var11 = new Rectangle(var2.x - var2.width, var2.y - var2.height, var2.width * 2, var2.height * 2);
         var1.setPaint(new RadialGradientPaint(var11, D, W, CycleMethod.NO_CYCLE));
         var1.fill(var2);
         var1.setPaint(var3.isEnabled() ? NJ3.I : NJ3.r);
         var1.drawLine(var2.x, var2.y, var2.x, var2.y);
      }

      if (Ky4.F$arrString() != null) {
         XT3.Y("BJIwMb");
      }
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.B(var1, var2, (QG2)var3);
   }

   public Ln2_2(Rl4 var1) {
      this();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32218;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1779289978631629666L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = " Ñ.ÖD ®É\"\u0098.«s°>\niaü÷yÍîó";
      int var5 = " Ñ.ÖD ®É\"\u0098.«s°>\niaü÷yÍîó".length();
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
      b = new Integer[3];
      D = new float[]{0.0F, 0.5F};
      W = new Color[]{NJ3.o, NJ3.m};
   }
}





