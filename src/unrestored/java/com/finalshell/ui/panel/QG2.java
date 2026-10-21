package com.finalshell.ui.panel;

import com.finalshell.core.Ln2_2;
import com.finalshell.core.Og4;
import javax.swing.SwingConstants;

public class QG2 extends Ky4 implements SwingConstants {
   public static Og4 A;
   public int n;
   public static long[] a;
   public static Integer[] b;

   public QG2() {
      super(A);
      this.n = a(30911, 6689791480754448180L);
   }

   public QG2(int var1) {
      super(A);
      this.n = a(17704, 2790758901638142626L);
      this.J(var1);
   }

   public int w() {
      return this.n;
   }

   public void J(int var1) {
      this.n = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24458;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2022552840895223030L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "~$!ë\u009câÎ\\òDÃ\u0089\u009aÉóÊ";
      int var5 = "~$!ë\u009câÎ\\òDÃ\u0089\u009aÉóÊ".length();
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
      A = new Ln2_2(null);
   }
}





