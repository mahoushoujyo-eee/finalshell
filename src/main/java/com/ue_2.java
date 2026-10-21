package com;

final class ue_2 implements com.aj_2 {
   private int Z = 0;
   private static int[] z;
   private static final long[] a;
   private static final Integer[] b;
   private static final long[] c;
   private static final Long[] d;

   @Override
   public void A(byte[] var1, int var2, int var3) {
      int[] var10000 = nm_4.g();
      int var5 = ~this.Z;
      int[] var4 = var10000;

      while (true) {
         if (--var3 >= 0) {
            var5 = z[(var5 ^ var1[var2++]) & a(6062, 6719589629920745314L)] ^ var5 >>> a(3191, 7134053857946897598L);
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               continue;
            }
         }

         this.Z = ~var5;
         break;
      }
   }

   @Override
   public void C() {
      this.Z = 0;
   }

   @Override
   public void I(long var1) {
      this.Z = (int)(var1 & b(19106, 115993715303970424L));
   }

   @Override
   public long u() {
      return (long)this.Z & b(31288, 3505931755486496483L);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static long j(long var0, long var2, long var4) {
      int[] var10000 = nm_4.g();
      long[] var9 = new long[a(10829, 7117853909133175431L)];
      int[] var6 = var10000;
      long[] var10 = new long[a(32691, 984710200557207421L)];
      long var13 = var4;
      if (var6 == null) {
         if (var4 <= 0L) {
            return var0;
         }

         var10[0] = b(8688, 222484501740625192L);
         var13 = 1L;
      }

      long var7 = var13;
      int var11 = 1;

      while (true) {
         if (var11 < a(32691, 984710200557207421L)) {
            var10[var11] = var7;
            var7 <<= 1;
            var11++;
            if (var6 != null) {
               break;
            }

            if (var6 == null) {
               continue;
            }
         }

         Y(var9, var10);
         break;
      }

      Y(var10, var9);

      while (true) {
         Y(var9, var10);
         if ((var4 & 1L) != 0L) {
            var0 = X(var9, var0);
         }

         while (true) {
            label65: {
               var4 >>= 1;
               long var15;
               int var14 = (var15 = var4 - 0L) == 0L ? 0 : (var15 < 0L ? -1 : 1);
               if (var6 == null) {
                  if (!var14 && var6 == null) {
                     break label65;
                  }

                  Y(var10, var9);
                  long var16;
                  var14 = (var16 = (var4 & 1L) - 0L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
               }

               if (var6 == null) {
                  if (var14) {
                     var0 = X(var10, var0);
                  }

                  var4 >>= 1;
                  long var17;
                  var14 = (var17 = var4 - 0L) == 0L ? 0 : (var17 < 0L ? -1 : 1);
               }

               if (var14) {
                  break;
               }
            }

            var0 ^= var2;
            if (var6 == null) {
               return var0;
            }

            var0 = var0;
         }
      }
   }

   private static long X(long[] var0, long var1) {
      long var4 = 0L;
      int[] var10000 = nm_4.g();
      int var6 = 0;
      int[] var3 = var10000;

      while (true) {
         if (var1 != 0L) {
            var7 = var1 & 1L;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               if (var7 != 0L) {
                  var4 ^= var0[var6];
               }

               var7 = var1 >> 1;
            }

            var1 = var7;
            var6++;
            if (var3 == null) {
               continue;
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   static final void Y(long[] var0, long[] var1) {
      int[] var10000 = nm_4.g();
      int var3 = 0;
      int[] var2 = var10000;

      while (var3 < a(32691, 984710200557207421L)) {
         var0[var3] = X(var1, var1[var3]);
         var3++;
         if (var2 != null) {
            break;
         }
      }
   }

   public ue_2 D() {
      ue_2 var1 = new ue_2();
      var1.Z = this.Z;
      return var1;
   }

   static int[] k() {
      int[] var0 = new int[z.length];
      System.arraycopy(z, 0, var0, 0, var0.length);
      return var0;
   }

   @Override
   public com.aj_2 y() {
      return this.D();
   }

   static {
      long var8 = 7341830455983048418L;
      long[] var14 = new long[8];
      int var11 = 0;
      String var12 = "s4AV1m\u008aTù\u0015\u001bÕ\u001bZ¾2\u0015\u0001niJÐ·\u0004ov\u0080#³\u0001¬ECåÅr\u0005éñ´8¥ Ò5Ð\u0091\u007f";
      int var13 = "s4AV1m\u008aTù\u0015\u001bÕ\u001bZ¾2\u0015\u0001niJÐ·\u0004ov\u0080#³\u0001¬ECåÅr\u0005éñ´8¥ Ò5Ð\u0091\u007f".length();
      byte var10 = 0;

      label50:
      while (true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes("ISO-8859-1");
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
            long var27 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var27;
                  if (var10 >= var13) {
                     a = var14;
                     b = new Integer[8];
                     long var0 = 1186299178379457918L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0011ê\u0083zß\u0084<ù Ñ\u0006\u008a\u0087Ò\fb\u0013`ø¨\u0017Z+v";
                     int var5 = "\u0011ê\u0083zß\u0084<ù Ñ\u0006\u008a\u0087Ò\fb\u0013`ø¨\u0017Z+v".length();
                     byte var2 = 0;

                     do {
                        int var22 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                        var22 = var3++;
                        var27 = (
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
                        var10003 = -1;
                        var6[var22] = var27;
                     } while (var2 < var5);

                     c = var6;
                     d = new Long[3];
                     z = null;
                     z = new int[a(14616, 5077368662220421584L)];

                     for (int var16 = 0; var16 < a(30363, 1219690253098055254L); var16++) {
                        int var17 = var16;
                        int var18 = a(12581, 3548653720626737646L);

                        while (--var18 >= 0) {
                           if ((var17 & 1) != 0) {
                              var17 = a(4974, 1461477008570422177L) ^ var17 >>> 1;
                           } else {
                              var17 >>>= 1;
                           }
                        }

                        z[var16] = var17;
                     }

                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var27;
                  if (var10 < var13) {
                     continue label50;
                  }

                  var12 = "ns\u0090RÐ\u0086\u0096cÛ§¿/déù¿";
                  var13 = "ns\u0090RÐ\u0086\u0096cÛ§¿/déù¿".length();
                  var10 = 0;
            }

            byte var21 = var10;
            var10 += 8;
            var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 201;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 15578) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }
}





