package com;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;

class eG_3 implements Runnable {
   final com.YM S;
   private static final long[] a;
   private static final Integer[] b;

   eG_3(com.YM var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      int var1 = nx_4.R();
      com.YM var10000 = this.S;
      if (var1 == 0) {
         label19:
         if (com.YM.l(this.S) != null) {
            Point var2 = MouseInfo.getPointerInfo().getLocation();
            com.YM.I(
               this.S, this.S.O.j.createScreenCapture(new Rectangle(var2.x - 4, var2.y - 4, a(17552, 1645018047148698010L), a(26366, 7196767722108816373L)))
            );
            com.YM.d(this.S, new Color(com.YM.q(this.S).getRGB(4, 4)));
            var10000 = this.S;
            if (var1 == 0) {
               if (com.YM.l(this.S) != null) {
                  com.YM.l(this.S).repaint();
                  com.YM.N(this.S).setText(this.S.O.w(com.YM.O(this.S)));
                  if (var1 == 0) {
                     break label19;
                  }
               }

               com.YM.q(this.S).flush();
               com.YM.I(this.S, null);
               var10000 = this.S;
            }

            com.YM.d(var10000, null);
         }

         var10000 = this.S;
      }

      com.YM.C(var10000, false);
   }

   static {
      long var0 = 170165577975454321L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÿ©C5±^sâ+<\u009f\u0080ûrÑ\u008d";
      int var5 = "ÿ©C5±^sâ+<\u009f\u0080ûrÑ\u008d".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27914;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





