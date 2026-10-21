package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cM_3 implements ActionListener {
   final com.QZ B;
   private static final long[] a;
   private static final Integer[] b;

   cM_3(com.QZ var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = com.QX.Y();
      com.QZ var10000 = this.B;
      if (var2 == null) {
         if (this.B.b < a(31487, 4160654507471791181L)) {
            this.B.b = this.B.b + a(8498, 2736446167824875393L);
            this.B.repaint();
            if (var2 == null) {
               return;
            }
         }

         var10000 = this.B;
      }

      var10000.N.Y();
   }

   static {
      long var0 = 8906305254045346349L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0012o[/\u001ej\u008e\u0004\"\u0097#\tt¿Uµ";
      int var5 = "\u0012o[/\u001ej\u008e\u0004\"\u0097#\tt¿Uµ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7858;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





