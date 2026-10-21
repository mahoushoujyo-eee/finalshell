package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LK extends com.Lz_2 {
   protected int z = Pe_2.q;
   protected Color l = Pe_2.B;
   protected Color C = Pe_2.S;
   private static final long[] a;
   private static final Integer[] b;

   public LK() {
   }

   public LK(int var1) {
      this.z = var1;
   }

   public LK(Color var1, Color var2) {
      this.l = var1;
      this.C = var2;
   }

   public LK(int var1, Color var2, Color var3) {
      this.z = var1;
      this.l = var2;
      this.C = var3;
   }

   public int F() {
      return this.z;
   }

   public void a(int var1) {
      this.z = var1;
      this.l();
   }

   public Color w() {
      return this.l;
   }

   public void W(Color var1) {
      this.l = var1;
      this.l();
   }

   public Color U() {
      return this.C;
   }

   public void p(Color var1) {
      this.C = var1;
      this.l();
   }

   @Override
   public Boolean d(JComponent var1) {
      int[] var2 = com.Lz_2.M();
      int var10000 = this.l.getAlpha();
      int var10001 = a(1551, 3862150394586548285L);
      if (var2 == null) {
         if (var10000 != var10001) {
            return false;
         }

         var10000 = this.C.getAlpha();
         if (var2 != null) {
            return Boolean.valueOf((boolean)var10000);
         }

         var10001 = a(24958, 7667382412824850253L);
      }

      return var10000 == var10001 ? true : false;
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      GA.h(var1, var2.x, var2.y, var2.width, var2.height, this.z, this.l, this.C);
   }

   static {
      long var0 = 7688990457244589854L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0085ms\u0003w\u0019×ÜMÛs\u0090dî0¬";
      int var5 = "\u0085ms\u0003w\u0019×ÜMÛs\u0090dî0¬".length();
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
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20018;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





