package com.finalshell.core;

public final class NN_3 extends NV_2 {
   public final NR_2 l;
   public final String f;
   public final NV_2 p;
   public static long[] a;
   public static Integer[] d;

   public NN_3(com.finalshell.ui.model.I var1, NR_2 var2, String var3, NV_2 var4) {
      super(var1);
      this.l = var2;
      this.f = var3;
      this.p = var4;
   }

   @Override
   public String toString() {
      return this.l.toString() + a(27770, 7030598922913227434L) + this.f + a(30192, 2204268455757396769L) + this.p.toString();
   }

   @C_9
   @Override
   public Object i(C_w_2 var1) throws Throwable {
      return var1.E(this);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20177;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6754376292825043918L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "2\u008c\u0014æê,¨Ïlkf&ÃT±D";
      int var5 = "2\u008c\u0014æê,¨Ïlkf&ÃT±D".length();
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





