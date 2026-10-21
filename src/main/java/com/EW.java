package com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.NotNull;

public final class EW extends EC {
   private final MouseEvent t;
   private static String f;
   private static final long[] a;
   private static final Integer[] b;

   public EW(@NotNull MouseEvent var1) {
      super(c(var1), q(var1));
      this.t = var1;
   }

   @Override
   public String toString() {
      return this.t.toString();
   }

   static int c(@NotNull MouseEvent var0) {
      String var1 = V();
      int var10000 = SwingUtilities.isLeftMouseButton(var0);
      if (var1 == null) {
         if (var10000 != 0) {
            return 0;
         }

         var10000 = SwingUtilities.isMiddleMouseButton(var0);
      }

      if (var1 == null) {
         if (var10000 != 0) {
            return 1;
         }

         var10000 = SwingUtilities.isRightMouseButton(var0);
      }

      if (var1 == null) {
         if (var10000 != 0) {
            return -1;
         }

         var10000 = var0 instanceof MouseWheelEvent;
      }

      if (var1 == null) {
         if (var10000 != 0) {
            var10000 = ((MouseWheelEvent)var0).getWheelRotation();
            if (var1 == null) {
               if (var10000 > 0) {
                  return 5;
               }

               var10000 = 4;
            }

            return var10000;
         }

         var10000 = -1;
      }

      return var10000;
   }

   static int q(@NotNull MouseEvent var0) {
      String var10000 = V();
      int var2 = 0;
      String var1 = var10000;
      int var3 = var0.isControlDown();
      if (var1 == null) {
         if (var3 != 0) {
            var2 |= a(30035, 2301423629121430645L);
         }

         var3 = var0.isShiftDown();
      }

      if (var1 == null) {
         if (var3 != 0) {
            var2 |= 4;
         }

         var3 = var0.isMetaDown();
      }

      if (var1 == null) {
         if (var3 != 0) {
            var2 |= a(1293, 5866757125853172778L);
         }

         var3 = var2;
      }

      if (var1 != null) {
         com.ky_4.K(new String[4]);
      }

      return var3;
   }

   public static void F(String var0) {
      f = var0;
   }

   public static String V() {
      return f;
   }

   static {
      long var0 = 3621016000392069631L;
      long[] var6 = new long[2];
      F(null);
      int var3 = 0;
      String var4 = "S§u\u0000î\u0019%\u009aýïÕ$È\u0098UÝ";
      int var5 = "S§u\u0000î\u0019%\u009aýïÕ$È\u0098UÝ".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20774;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





