package org.v;

import org.I;

public final class Nf_2 extends NR {
   public final NV d;
   public final NV J;
   private static final long[] a;
   private static final Integer[] f;

   public Nf_2(I var1, NV var2, NV var3) {
      super(var1);
      this.d = var2;
      this.J = var3;
   }

   @Override
   public String toString() {
      return this.d.toString() + a(15693, 6280154084436749091L) + this.J + a(25470, 5299278668901578001L);
   }

   @org.F.c
   @Override
   public Object W(_4 var1) throws Throwable {
      return var1.e(this);
   }

   static {
      long var0 = 6365754352793795695L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "mý\n\u001f,\u0005I#F¿âÁô9\u0097\u0017";
      int var5 = "mý\n\u001f,\u0005I#F¿âÁô9\u0097\u0017".length();
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
      f = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5743;
      if (f[var3] == null) {
         f[var3] = (int)(a[var3] ^ var1);
      }

      return f[var3];
   }
}





