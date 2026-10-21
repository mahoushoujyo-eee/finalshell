package com.finalshell.ui.listener;

import com.finalshell.core.Ch2;
import com.finalshell.core.WC_2;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Qm2;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Hy2 implements ActionListener {
   public int e;
   public final Rectangle f;
   public final Qm2 S;
   public final BufferedImage I;
   public static long[] a;
   public static Integer[] b;

   public Hy2(Rectangle var1, Qm2 var2, BufferedImage var3) {
      this.f = var1;
      this.S = var2;
      this.I = var3;
      this.e = a(15709, 3791628624128876567L);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ky4[] var2 = Ch2.O();
      Object var10000 = this;
      if (var2 != null) {
         if (this.e > 0) {
            this.e -= 5;
            Point var3 = this.f.getLocation();
            var3.y = var3.y + (a(16103, 1788404574236451756L) - this.e) / 2;
            this.S.V(this.I, var3, this.e);
            if (var2 != null) {
               return;
            }
         }

         this.S.K();
         var10000 = var1.getSource();
      }

      ((WC_2)var10000).Y();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7498;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2383622583092413208L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u001d\u0084;x2µ#k\u009cýÇ\u008a\u001dÞ Ð";
      int var5 = "\u001d\u0084;x2µ#k\u009cýÇ\u008a\u001dÞ Ð".length();
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





