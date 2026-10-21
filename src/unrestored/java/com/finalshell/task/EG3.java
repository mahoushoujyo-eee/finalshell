package com.finalshell.task;

import com.finalshell.core.Nx4;
import com.finalshell.ui.listener.YM;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;

public class EG3 implements Runnable {
   public final YM S;
   public static long[] a;
   public static Integer[] b;

   public EG3(YM var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      int var1 = Nx4.R();
      YM var10000 = this.S;
      if (var1 == 0) {
         label19:
         if (YM.l(this.S) != null) {
            Point var2 = MouseInfo.getPointerInfo().getLocation();
            YM.I(this.S, this.S.O.j.createScreenCapture(new Rectangle(var2.x - 4, var2.y - 4, a(17552, 1645018047148698010L), a(26366, 7196767722108816373L))));
            YM.d(this.S, new Color(YM.q(this.S).getRGB(4, 4)));
            var10000 = this.S;
            if (var1 == 0) {
               if (YM.l(this.S) != null) {
                  YM.l(this.S).repaint();
                  YM.N(this.S).setText(this.S.O.w(YM.O(this.S)));
                  if (var1 == 0) {
                     break label19;
                  }
               }

               YM.q(this.S).flush();
               YM.I(this.S, null);
               var10000 = this.S;
            }

            YM.d(var10000, null);
         }

         var10000 = this.S;
      }

      YM.C(var10000, false);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27914;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 170165577975454321L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÿ©C5±^sâ+<\u009f\u0080ûrÑ\u008d";
      int var5 = "ÿ©C5±^sâ+<\u009f\u0080ûrÑ\u008d".length();
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
      b = new Integer[2];
   }
}





