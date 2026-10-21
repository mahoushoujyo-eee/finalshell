package com.c;

import com.GO;
import javax.swing.BorderFactory;

class h_2 extends com.KD {
   final D_2 g;
   private static final long[] a;
   private static final Integer[] b;

   h_2(D_2 var1) {
      this.g = var1;
      super();
      int[] var10000 = D_2.W();
      this.setEnabled(D_2.y(this.g).isIconifiable());
      this.g(false);
      this.f(0);
      int[] var2 = var10000;
      this.s(GO.FT);
      this.x(2);
      this.setFocusable(false);
      label14:
      if (var2 == null) {
         if (this.g.j()) {
            this.X(false);
            this.u(true);
            this.W(false);
            this.z(true);
            if (var2 == null) {
               break label14;
            }
         }

         this.x(false);
         this.M(true);
         this.X(false);
         this.u(true);
      }

      this.setBorder(BorderFactory.createEmptyBorder(4, a(27305, 7282880332333216569L), 4, a(8464, 8441280104003614849L)));
   }

   static {
      long var0 = 2207822625219565160L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÔÄ\u007f>\u0089.%V\u0097i¥Ç\u0007ýnï";
      int var5 = "ÔÄ\u007f>\u0089.%V\u0097i¥Ç\u0007ýnï".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6544;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





