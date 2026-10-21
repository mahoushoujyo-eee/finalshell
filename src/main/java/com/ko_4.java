package com;

import java.awt.Component;

public class ko_4 extends com.ky_4 {
   private final com.c4_2 C;
   private boolean p;
   private boolean b;
   final com.kC_3 V;
   private static final long[] a;
   private static final Integer[] c;

   public ko_4(com.kC_3 var1) {
      this.V = var1;
      this.p = false;
      this.b = false;
      this.Q();
      this.L(new com.LW(var1));
      uY var2 = new uY(this, var1);
      this.addMouseListener(var2);
      this.addMouseMotionListener(var2);
      this.C = new com.cc_4(this, true, var1);
      com.ON.b(this, this.C);
   }

   public void Q() {
      int[] var1;
      int var2;
      byte var3;
      int var9;
      label83: {
         int[] var10000 = com.k3_2.L();
         var2 = this.L();
         var1 = var10000;
         var3 = this.getComponentOrientation().isLeftToRight();
         var9 = var2;
         if (var1 != null) {
            if (var2 == 0) {
               var9 = com.kC_3.k(this.V).top;
               break label83;
            }

            var9 = com.kC_3.k(this.V).top;
         }

         var9 += 1;
      }

      int var4;
      int var10001;
      label77: {
         label86: {
            var4 = var9;
            var9 = com.kC_3.k(this.V).left;
            var10001 = com.kC_3.Z(this.V);
            if (var1 != null) {
               if (var10001 == 0) {
                  break label86;
               }

               var10001 = com.kC_3.u(this.V);
            }

            if (var1 != null) {
               if (var10001 == 0) {
                  break label86;
               }

               var10001 = var3;
            }

            if (var1 == null) {
               break label77;
            }

            if (var10001 != 0) {
               var10001 = a(1815, 2758467571807545589L);
               break label77;
            }
         }

         var10001 = 0;
      }

      int var5;
      label61: {
         var5 = var9 + var10001;
         var9 = var2;
         var10001 = com.kC_3.O(this.V).size() - 1;
         if (var1 != null) {
            if (var2 == var10001) {
               var9 = com.kC_3.k(this.V).bottom;
               break label61;
            }

            var9 = com.kC_3.k(this.V).bottom;
            var10001 = 1;
         }

         var9 += var10001;
      }

      int var6;
      label55: {
         label87: {
            var6 = var9;
            var9 = com.kC_3.k(this.V).right;
            var10001 = com.kC_3.Z(this.V);
            if (var1 != null) {
               if (var10001 == 0) {
                  break label87;
               }

               var10001 = com.kC_3.u(this.V);
            }

            if (var1 != null) {
               if (var10001 == 0) {
                  break label87;
               }

               var10001 = var3;
            }

            if (var1 == null) {
               break label55;
            }

            if (var10001 == 0) {
               var10001 = a(24192, 6558587468630405475L);
               break label55;
            }
         }

         var10001 = 0;
      }

      int var7 = var9 + var10001;
      this.N(var4, var5, var6, var7);
      if (com.ky_4.F() != null) {
         com.k3_2.x(new int[2]);
      }
   }

   public boolean a() {
      return this.b;
   }

   public boolean O() {
      return this.p;
   }

   public Component I() {
      return this.getComponent(0);
   }

   public int L() {
      return this.V.v().z(this);
   }

   static boolean r(com.ko_4 var0, boolean var1) {
      return var0.p = var1;
   }

   static boolean Q(com.ko_4 var0) {
      return var0.p;
   }

   static boolean R(com.ko_4 var0, boolean var1) {
      return var0.b = var1;
   }

   static {
      long var0 = 6095273514244250006L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "àÍ\u0005hYk(ò\u0096ù¡W¯eñd";
      int var5 = "àÍ\u0005hYk(ò\u0096ù¡W¯eñd".length();
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
      c = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28643;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }
}





