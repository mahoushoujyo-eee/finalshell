package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Cb_2 extends KeyAdapter {
   final na_4 L;
   private static final long[] a;
   private static final Integer[] b;

   Cb_2(na_4 var1) {
      this.L = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      boolean var2 = na_4.v();
      int var10000 = na_4.k(this.L).size();
      if (!var2) {
         if (var10000 == 0) {
            this.L.Y();
         }

         na_4.k(this.L).add(var1.getKeyCode());
      }

      this.L(var1);
      this.L.h();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      na_4.k(this.L).remove(Integer.valueOf(var1.getKeyCode()));
      this.L.h();
   }

   private void L(KeyEvent var1) {
      int var10000 = na_4.e();
      na_4.q(this.L, com.FN.m(var1));
      na_4.f(this.L, com.FN.O(var1));
      boolean var2 = (boolean)var10000;
      na_4.z(this.L, com.FN.y(var1));
      var10000 = var1.getKeyCode();
      int var10001 = a(3915, 1600315036027361801L);
      if (var2) {
         if (var10000 == var10001) {
            return;
         }

         var10000 = var1.getKeyCode();
         var10001 = a(6994, 8129119872493948433L);
      }

      if (var2) {
         if (var10000 == var10001) {
            return;
         }

         var10000 = var1.getKeyCode();
         var10001 = a(27951, 1475770252908591215L);
      }

      if (var10000 != var10001) {
         na_4.S(this.L, var1.getKeyCode());
      }
   }

   static {
      long var0 = 6967867559485116169L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "ÝæHÉ&4\u0095\u0011ë{äÂ\u0085\u0086\u0001\n9\u00185¹\u001b wv";
      int var5 = "ÝæHÉ&4\u0095\u0011ë{äÂ\u0085\u0086\u0001\n9\u00185¹\u001b wv".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5442;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





