package com.finalshell.core;

public final class DG3 implements Aj2 {
   public long J = 1L;
   public long u = 0L;
   public static long[] a;
   public static Integer[] b;
   public static long[] c;
   public static Long[] d;

   @Override
   public void I(long var1) {
      this.J = var1 & b(19622, 4138740959448262675L);
      this.u = var1 >> a(6255, 4390668233000687446L) & b(19622, 4138740959448262675L);
   }

   @Override
   public void C() {
      this.J = 1L;
      this.u = 0L;
   }

   @Override
   public long u() {
      return this.u << a(6255, 4390668233000687446L) | this.J;
   }

   @Override
   public void A(byte[] var1, int var2, int var3) {
      int[] var4 = Nm4.g();
      int var10000 = var3;
      int var10001 = 1;
      if (var4 == null) {
         if (var3 == 1) {
            this.J = this.J + (long)(var1[var2++] & a(24795, 3934409388042907616L));
            this.u = this.u + this.J;
            this.J = this.J % b(19328, 8571087273621253943L);
            this.u = this.u % b(19328, 8571087273621253943L);
            return;
         }

         var10000 = var3;
         var10001 = a(23964, 1647763343925203616L);
      }

      int var5 = var10000 / var10001;
      int var6 = var3 % a(2721, 8982245692592031131L);

      int var7;
      while (true) {
         if (var5-- > 0) {
            var7 = a(2721, 8982245692592031131L);
            var10000 = var3 - var7;
            if (var4 != null) {
               break;
            }

            var3 = var10000;

            label49: {
               while (var7-- > 0) {
                  this.J = this.J + (long)(var1[var2++] & a(5785, 8199892271762282913L));
                  this.u = this.u + this.J;
                  if (var4 != null) {
                     break label49;
                  }

                  if (var4 != null) {
                     break;
                  }
               }

               this.J = this.J % b(19328, 8571087273621253943L);
               this.u = this.u % b(19328, 8571087273621253943L);
            }

            if (var4 == null) {
               continue;
            }
         }

         var7 = var6;
         var10000 = var3 - var6;
         break;
      }

      while (true) {
         if (var7-- > 0) {
            this.J = this.J + (long)(var1[var2++] & a(5785, 8199892271762282913L));
            this.u = this.u + this.J;
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               continue;
            }
         }

         this.J = this.J % b(19328, 8571087273621253943L);
         this.u = this.u % b(19328, 8571087273621253943L);
         break;
      }
   }

   public DG3 s() {
      DG3 var1 = new DG3();
      var1.J = this.J;
      var1.u = this.u;
      return var1;
   }

   public static long h(long var0, long var2, long var4) {
      long var7 = b(16494, 7471326592952001754L);
      long var13 = var4 % var7;
      long var9 = var0 & b(3341, 8495052391616293307L);
      long var11 = var13 * var9;
      var11 %= var7;
      int[] var10000 = Nm4.g();
      var9 += (var2 & b(19622, 4138740959448262675L)) + var7 - 1L;
      var11 += (var0 >> a(29589, 3383659337675373736L) & b(19622, 4138740959448262675L))
         + (var2 >> a(6255, 4390668233000687446L) & b(19622, 4138740959448262675L))
         + var7
         - var13;
      int[] var6 = var10000;
      long var20;
      int var18 = (var20 = var9 - var7) == 0L ? 0 : (var20 < 0L ? -1 : 1);
      if (var6 == null) {
         if (var18 >= 0) {
            var9 -= var7;
         }

         long var21;
         var18 = (var21 = var9 - var7) == 0L ? 0 : (var21 < 0L ? -1 : 1);
      }

      if (var6 == null) {
         if (var18 >= 0) {
            var9 -= var7;
         }

         long var22;
         var18 = (var22 = var11 - (var7 << 1)) == 0L ? 0 : (var22 < 0L ? -1 : 1);
      }

      if (var6 == null) {
         if (var18 >= 0) {
            var11 -= var7 << 1;
         }

         if (var6 != null) {
            return var11 | var7;
         }

         long var23;
         var18 = (var23 = var11 - var7) == 0L ? 0 : (var23 < 0L ? -1 : 1);
      }

      if (var18 >= 0) {
         var11 -= var7;
      }

      return var9 | var11 << a(6255, 4390668233000687446L);
   }

   @Override
   public Aj2 y() {
      return this.s();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3897;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 9399) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var8 = 4961368798664667725L;
      long[] var14 = new long[6];
      int var11 = 0;
      String var12 = "C\u008e¤Û\u000e\u0084%\u000b\u009b\u0095¨ÃJÁ«\u0013\u0084õcgû_]R=\u009f$%Ü&\"f";
      int var13 = "C\u008e¤Û\u000e\u0084%\u000b\u009b\u0095¨ÃJÁ«\u0013\u0084õcgû_]R=\u009f$%Ü&\"f".length();
      byte var10 = 0;

      label38:
      while (true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var14;
         var10001 = var11++;
         long var10002 = ((long)var15[0] & 255L) << 56
            | ((long)var15[1] & 255L) << 48
            | ((long)var15[2] & 255L) << 40
            | ((long)var15[3] & 255L) << 32
            | ((long)var15[4] & 255L) << 24
            | ((long)var15[5] & 255L) << 16
            | ((long)var15[6] & 255L) << 8
            | (long)var15[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var30 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var30;
                  if (var10 >= var13) {
                     a = var14;
                     b = new Integer[6];
                     long var0 = 8110696377370173836L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "\u0006|e\u0014½\"qJ\u0005j\u0086F0\u00ad·È";
                     int var5 = "\u0006|e\u0014½\"qJ\u0005j\u0086F0\u00ad·È".length();
                     byte var2 = 0;

                     label28:
                     while (true) {
                        int var21 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        var10000 = var6;
                        var21 = var3++;
                        var10002 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        var10003 = -1;

                        while (true) {
                           var30 = var10002 ^ var0;
                           switch (var10003) {
                              case 0:
                                 var10000[var21] = var30;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Long[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var10000[var21] = var30;
                                 if (var2 < var5) {
                                    continue label28;
                                 }

                                 var4 = "Iá9\u009b\u0087wv`\u0017!\u0080\u0091\u0093çú§";
                                 var5 = "Iá9\u009b\u0087wv`\u0017!\u0080\u0091\u0093çú§".length();
                                 var2 = 0;
                           }

                           byte var23 = var2;
                           var2 += 8;
                           var7 = var4.substring(var23, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var10000 = var6;
                           var21 = var3++;
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
                  break;
               default:
                  var10000[var10001] = var30;
                  if (var10 < var13) {
                     continue label38;
                  }

                  var12 = "\u0098{\u0094û³\u000fÎõ\u0090\u000f³Ñ8\u008fu]";
                  var13 = "\u0098{\u0094û³\u000fÎõ\u0090\u000f³Ñ8\u008fu]".length();
                  var10 = 0;
            }

            byte var20 = var10;
            var10 += 8;
            var15 = var12.substring(var20, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var14;
            var10001 = var11++;
            var10002 = ((long)var15[0] & 255L) << 56
               | ((long)var15[1] & 255L) << 48
               | ((long)var15[2] & 255L) << 40
               | ((long)var15[3] & 255L) << 32
               | ((long)var15[4] & 255L) << 24
               | ((long)var15[5] & 255L) << 16
               | ((long)var15[6] & 255L) << 8
               | (long)var15[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





