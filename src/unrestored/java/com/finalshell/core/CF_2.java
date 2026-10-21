package com.finalshell.core;

public class CF_2 implements Po2, Cloneable {
   public int[] B;
   public static long[] a;
   public static Integer[] b;

   public CF_2() {
      this.B = new int[a(24370, 4715111695791294126L)];
   }

   public CF_2(int[] var1) {
      this.B = var1;
   }

   @Override
   public Object clone() {
      try {
         CF_2 var1 = (CF_2)super.clone();
         var1.B = (int[])this.B.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   public void V(int[] var1) {
      this.B = var1;
   }

   public int[] W() {
      return this.B;
   }

   @Override
   public int D(float var1) {
      String[] var10000 = W5.q();
      int var3 = (int)(var1 * 255.0F);
      String[] var2 = var10000;
      int var4 = var3;
      if (var2 != null) {
         if (var3 < 0) {
            var3 = 0;
            if (var2 != null) {
               return this.B[var3];
            }
         }

         var4 = var3;
      }

      if (var2 == null) {
         return var4;
      } else {
         if (var4 > a(28816, 7043301042965850382L)) {
            var3 = a(11412, 5172120128805172489L);
         }

         return this.B[var3];
      }
   }

   public void l(int var1, int var2, int var3, int var4) {
      String[] var10000 = W5.q();
      int var6 = this.B[var2];
      int var7 = this.B[var3];
      String[] var5 = var10000;
      int var8 = var2;

      while (true) {
         if (var8 <= var1) {
            this.B[var8] = NM.n((float)(var8 - var2) / (float)(var1 - var2), var6, var4);
            var8++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var8 = var1;
         break;
      }

      while (var8 < var3) {
         this.B[var8] = NM.n((float)(var8 - var1) / (float)(var3 - var1), var4, var7);
         var8++;
         if (var5 == null) {
            break;
         }
      }
   }

   public void t(int var1, int var2, int var3, int var4) {
      String[] var10000 = W5.q();
      int var6 = var1;
      String[] var5 = var10000;

      while (var6 <= var2) {
         this.B[var6] = NM.n((float)(var6 - var1) / (float)(var2 - var1), var3, var4);
         var6++;
         if (var5 == null) {
            break;
         }
      }
   }

   public void o(int var1, int var2, int var3) {
      String[] var10000 = W5.q();
      int var5 = var1;
      String[] var4 = var10000;

      while (var5 <= var2) {
         this.B[var5] = var3;
         var5++;
         if (var4 == null) {
            break;
         }
      }
   }

   public void l(int var1, int var2) {
      this.B[var1] = var2;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22940;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2986575538856208387L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\u001d|\u001f\u001a\u000f\u008b/\u00ad.§HY\u00adq]õ®¦\u0096\n@{\u0001ò";
      int var5 = "\u001d|\u001f\u001a\u000f\u008b/\u00ad.§HY\u00adq]õ®¦\u0096\n@{\u0001ò".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
}





