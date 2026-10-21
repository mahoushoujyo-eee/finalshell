package com;

public final class XO {
   XO L;
   private final int E;
   private final int c;
   private final int j;
   private static final long[] a;
   private static final Integer[] b;

   public XO(w0_2 var1, int var2, String var3, String var4) {
      label15: {
         int[] var10000 = XB.X();
         super();
         int[] var5 = var10000;
         XO var6 = var1.s;
         if (var5 == null) {
            if (var1.s == null) {
               var1.s = this;
               if (var5 == null) {
                  break label15;
               }
            }

            var6 = var1.k;
         }

         var6.L = this;
      }

      var1.k = this;
      this.E = var2;
      this.c = var1.O(var3);
      this.j = var1.O(var4);
   }

   public void b() {
   }

   int h() {
      return a(28024, 8017337190419335230L);
   }

   void S(rE_3 var1) {
      int var2 = a(4771, 1855237061617121254L);
      var1.G(this.E & a(9816, 5348132879023620895L)).G(this.c).G(this.j);
      byte var3 = 0;
      var1.G(var3);
   }

   static {
      long var0 = 9020033205111879319L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "Þ«H®\u0082ØJw\\ñÙ×\u0083\u0092þ¡À/;\u0003Ã>\u0001q";
      int var5 = "Þ«H®\u0082ØJw\\ñÙ×\u0083\u0092þ¡À/;\u0003Ã>\u0001q".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25927;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





