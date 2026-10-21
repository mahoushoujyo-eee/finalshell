package org.v;

public final class RH extends RK {
   public final t_4 V;
   private static final long[] a;
   private static final Integer[] b;

   public RH(NA var1, t_4 var2) {
      super(var1);
      this.V = var2;
   }

   @Override
   public void d(x_3 var1) {
      super.d(var1);
      this.V.d(var1);
   }

   @Override
   public String toString() {
      return "@" + this.A + a(20265, 2471357946988888234L) + this.V + a(32714, 317761939285094472L);
   }

   @Override
   public Nt_2 R() {
      return this.A;
   }

   @org.F.c
   @Override
   public Object q(_e_2 var1) throws Throwable {
      return var1.b(this);
   }

   static {
      long var0 = 3690759351751204122L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ì\u0015\u008f\t\u000f\u0088]\u0098{i¶Mª®í{";
      int var5 = "ì\u0015\u008f\t\u000f\u0088]\u0098{i¶Mª®í{".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20355;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





