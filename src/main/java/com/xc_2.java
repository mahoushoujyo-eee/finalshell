package com;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Xc_2 implements xV_3 {
   private static int v;
   private SortedSet a = new TreeSet();
   private int C;
   private int M;
   private static final long[] b;
   private static final Integer[] c;

   public Xc_2(int var1) {
      this(var1, v);
   }

   public Xc_2(int var1, int var2) {
      this.C = var1;
      this.M = var2;
      this.o(var1, var2);
   }

   private void o(int var1, int var2) {
      boolean var10000 = j_2.g();
      int var4 = var2;
      boolean var3 = var10000;

      while (var4 < var1) {
         this.a.add(Integer.valueOf(var4));
         var4 += var2;
         if (!var3) {
            break;
         }
      }
   }

   @Override
   public void K(int var1) {
      label58: {
         boolean var2;
         label59: {
            var2 = j_2.P();
            int var10000 = var1;
            int var10001 = this.C;
            if (!var2) {
               if (var1 <= this.C) {
                  break label59;
               }

               var10000 = this.M;
               var10001 = this.C / this.M;
            }

            int var3 = var10000 * var10001;

            while (var3 < var1) {
               if (var2) {
                  return;
               }

               var10000 = var3;
               var10001 = this.C;
               if (!var2) {
                  if (var3 >= this.C) {
                     this.a.add(Integer.valueOf(var3));
                  }

                  var10000 = var3;
                  var10001 = this.M;
               }

               var3 = var10000 + var10001;
               if (var2) {
                  break;
               }
            }

            if (!var2) {
               break label58;
            }
         }

         Iterator var5 = this.a.iterator();

         while (var5.hasNext()) {
            int var4 = (Integer)var5.next();
            if (var2) {
               return;
            }

            if (var4 > var1) {
               var5.remove();
            }

            if (var2) {
               break;
            }
         }
      }

      this.C = var1;
   }

   @Override
   public void c(int var1) {
      this.a.remove(Integer.valueOf(var1));
   }

   @Override
   public void n() {
      this.a.clear();
   }

   @Override
   public int r(int var1) {
      return this.U(var1) - var1;
   }

   @Override
   public int M(int var1) {
      return var1 - this.G(var1);
   }

   @Override
   public int U(int var1) {
      int var10000 = j_2.P();
      int var3 = a(18622, 6774740100010319664L);
      boolean var2 = (boolean)var10000;
      SortedSet var4 = this.a.tailSet(var1 + 1);
      var10000 = var4.isEmpty();
      if (!var2) {
         if (var10000 == 0) {
            var3 = (Integer)var4.first();
         }

         var10000 = Math.min(var3, this.C - 1);
      }

      return var10000;
   }

   @Override
   public int G(int var1) {
      int var10000 = j_2.g();
      int var3 = 0;
      boolean var2 = (boolean)var10000;
      SortedSet var4 = this.a.headSet(var1);
      var10000 = var4.isEmpty();
      if (var2) {
         if (var10000 == 0) {
            var3 = (Integer)var4.last();
         }

         var10000 = Math.max(0, var3);
      }

      return var10000;
   }

   @Override
   public void h(int var1) {
      this.a.add(Integer.valueOf(var1));
   }

   static {
      long var0 = 5043970017563678638L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0087\u009f·göq\u000b!C»©\u0087¯Ð÷a";
      int var5 = "\u0087\u009f·göq\u000b!C»©\u0087¯Ð÷a".length();
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

      b = var6;
      c = new Integer[2];
      v = a(19208, 4224967885537909895L);
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22415;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





