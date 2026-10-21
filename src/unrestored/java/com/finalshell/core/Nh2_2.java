package com.finalshell.core;

public final class Nh2_2 extends NR_2 {
   public final NV_2 E;
   public static long[] a;
   public static Integer[] d;

   public Nh2_2(com.finalshell.ui.model.I var1, NV_2 var2) {
      super(var1);
      this.E = var2;
   }

   @Override
   public String toString() {
      return a(22299, 4640775289137174373L) + this.E.toString() + a(25872, 2612603581908100463L);
   }

   @C_9
   @Override
   public Object W(C_4_3 var1) throws Throwable {
      return var1.s(this);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16511;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6265627432741851673L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u001b¨Ü6\u0099\u000e÷_¾Ðã\u0085\u0090ëÅT";
      int var5 = "\u001b¨Ü6\u0099\u000e÷_¾Ðã\u0085\u0090ëÅT".length();
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
      d = new Integer[2];
   }
}





