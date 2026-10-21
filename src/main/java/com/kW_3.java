package com;

import java.awt.Color;
import java.awt.Component;

public class kW_3 extends com.k5_2 {
   private com.o8_2 x = null;
   private int k;
   private int R;
   private Color o;
   private Xt_2 c;
   private static final long[] e;
   private static final Integer[] f;

   public kW_3() {
      this.k = a(772, 3118536602164193555L);
      this.R = 1;
      this.o = Color.GRAY;
      this.N();
   }

   public kW_3(Component var1) {
      super(var1);
      this.k = a(806, 8931361481806670128L);
      this.R = 1;
      this.o = Color.GRAY;
      this.N();
   }

   protected void N() {
      this.c = new Xt_2(this);
      this.c.setVisible(false);
      this.A(this.c);
   }

   @Override
   public void H(Component var1) {
      super.H(var1);
      this.D(var1 != null ? new com.oh_4(var1) : null);
   }

   public void D(com.o8_2 var1) {
      this.x = var1;
   }

   public com.o8_2 c() {
      return this.x;
   }

   public boolean k() {
      return this.c.V();
   }

   public void U(boolean var1) {
      this.c.a(var1);
   }

   public boolean d() {
      return this.c.r();
   }

   public void k(boolean var1) {
      this.c.o(var1);
   }

   public int J() {
      return this.k;
   }

   public void P(int var1) {
      this.k = var1;
   }

   public int o() {
      return this.R;
   }

   public void w(int var1) {
      this.R = var1;
   }

   public Color Q() {
      return this.o;
   }

   public void U(Color var1) {
      this.o = var1;
   }

   static int e(com.kW_3 var0) {
      return var0.R;
   }

   static Color w(com.kW_3 var0) {
      return var0.o;
   }

   static com.o8_2 P(com.kW_3 var0) {
      return var0.x;
   }

   static {
      long var0 = 3912541653690464685L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "NÚo\u0006\u000e\u0092Ð\u0092ËC9\u008eÚ/P±";
      int var5 = "NÚo\u0006\u000e\u0092Ð\u0092ËC9\u008eÚ/P±".length();
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

      e = var6;
      f = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27158;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }
}





