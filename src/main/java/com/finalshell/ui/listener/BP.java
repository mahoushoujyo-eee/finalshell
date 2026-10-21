package com.finalshell.ui.listener;

import com.finalshell.ui.panel.OY3;
import com.finalshell.ui.panel.Xt2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BP implements ActionListener {
   public final Xt2 c;
   public static long[] a;
   public static Integer[] b;

   public BP(Xt2 var1) {
      this.c = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = OY3.y$boolean();
      int var10000 = Xt2.M(this.c);
      if (var2) {
         if (var10000 < a(650, 2589690146371739930L)) {
            Xt2.F(this.c, a(5637, 169693120508507543L));
            if (var2) {
               return;
            }
         }

         Xt2.i(this.c, a(18282, 6378775124025435385L));
      }

      Xt2.K(this.c).Y();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9106;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1549365881823188503L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "1 M\u0096ý\u0092ã\u0088³÷Q\u000f\\\u008c2n\u0084ñ9j!ÿw\u008d";
      int var5 = "1 M\u0096ý\u0092ã\u0088³÷Q\u000f\\\u008c2n\u0084ñ9j!ÿw\u008d".length();
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
      b = new Integer[3];
   }
}





