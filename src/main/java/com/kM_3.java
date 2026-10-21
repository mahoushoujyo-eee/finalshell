package com;

import java.awt.Dimension;
import java.awt.Insets;

public class kM_3 extends com.k5_2 {
   private static final long[] c;
   private static final Integer[] e;

   public kM_3() {
      this.setOpaque(false);
      this.C(0);
      this.setBorder(null);
      this.C(0);
      this.b(new Insets(0, 0, 0, 0));
      this.I(a(25293, 3601297615179512085L), a(17824, 1518886113878826617L));
      this.setMinimumSize(new Dimension(a(20471, 8447542080611931181L), a(12602, 863207024840190689L)));
      this.setMaximumSize(new Dimension(a(17824, 1518886113878826617L), a(17824, 1518886113878826617L)));
   }

   static {
      long var0 = 4296500936015325344L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "-÷\u000eçìWpy×\u001c\u0004YßnW\u0015";
      int var5 = "-÷\u000eçìWpy×\u001c\u0004YßnW\u0015".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
                     c = var6;
                     e = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0082RýÆWk\u0002%\u0082\u0083ó¶\u0088Z|é";
                  var5 = "\u0082RýÆWk\u0002%\u0082\u0083ó¶\u0088Z|é".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7129;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }
}





