package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

public abstract class T4 implements LayoutManager2 {
   public static int c;
   public static long[] g;
   public static Integer[] k;

   @Override
   public void addLayoutComponent(Component var1, Object var2) {
      this.A(var1, var2);
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
      this.A(var2, var1);
   }

   @Override
   public void removeLayoutComponent(Component var1) {
      this.F(var1);
   }

   public void A(Component var1, Object var2) {
   }

   public void F(Component var1) {
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.preferredLayoutSize(var1);
   }

   @Override
   public Dimension maximumLayoutSize(Container var1) {
      return new Dimension(a(23296, 5614625828517698134L), a(14998, 7986499160904711105L));
   }

   @Override
   public float getLayoutAlignmentX(Container var1) {
      return 0.5F;
   }

   @Override
   public float getLayoutAlignmentY(Container var1) {
      return 0.5F;
   }

   @Override
   public void invalidateLayout(Container var1) {
   }

   public static void l(int var0) {
      c = var0;
   }

   public static int b() {
      return c;
   }

   public static int O() {
      int var0 = b();
      return var0 == 0 ? 51 : 0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 342;
      if (k[var3] == null) {
         k[var3] = (int)(g[var3] ^ var1);
      }

      return k[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2303545438569127437L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0088¢\u009dFÝ\u009a{¤ç7bÁv³\u009a3";
      int var5 = "\u0088¢\u009dFÝ\u009a{¤ç7bÁv³\u009a3".length();
      l(103);
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

      g = var6;
      k = new Integer[2];
   }
}





