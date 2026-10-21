package com.finalshell.core;

public class Cr4 {
   public long c;
   public int T;
   public static int Z;
   public static int i;
   public int Y;
   public String G;

   static {
      __vfClinit__();
   }

   public Cr4(long var1, int var3, int var4) {
      this(null, var1, var3, var4);
   }

   public Cr4(String var1, long var2, int var4, int var5) {
      this.Y = Z;
      this.G = var1;
      this.c = var2;
      this.T = var4;
      this.Y = var5;
   }

   public String B() {
      return this.G;
   }

   public void T(String var1) {
      this.G = var1;
   }

   public int R() {
      return this.Y;
   }

   public long l() {
      return this.c;
   }

   public void I(long var1) {
      this.c = var1;
   }

   public int m() {
      return this.T;
   }

   public void a(int var1) {
      this.T = var1;
   }

   public static void __vfClinit__() {
      long var1 = 5922888288820105474L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "Ý¯\u001dõ\u0093q\u0091\báGGÊ\u0093q\u0091\t";
      int var6 = "Ý¯\u001dõ\u0093q\u0091\báGGÊ\u0093q\u0091\t".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
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
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      Z = (int)var0[0];
      i = (int)var0[1];
   }
}





