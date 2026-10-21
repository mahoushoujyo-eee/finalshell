package com.finalshell.core;

import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Ge4 extends W5 {
   public String t;
   public Font L;
   public Paint o;
   public Composite E;
   public AffineTransform a;
   public static long[] b;
   public static Integer[] c;

   public Ge4() {
   }

   public Ge4(String var1, Font var2, Paint var3, Composite var4, AffineTransform var5) {
      this.t = var1;
      this.L = var2;
      this.E = var4;
      this.o = var3;
      this.a = var5;
   }

   public void l(String var1) {
      this.t = var1;
   }

   public String f() {
      return this.t;
   }

   public void p(Composite var1) {
      this.E = var1;
   }

   public Composite A() {
      return this.E;
   }

   public void k(Paint var1) {
      this.o = var1;
   }

   public Paint a() {
      return this.o;
   }

   public void n(Font var1) {
      this.L = var1;
   }

   public Font y() {
      return this.L;
   }

   public void R(AffineTransform var1) {
      this.a = var1;
   }

   public AffineTransform H() {
      return this.a;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = W5.q();
      BufferedImage var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var10000 = var2;
      }

      Graphics2D var4 = var10000.createGraphics();
      var4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      Ge4 var5 = this;
      if (var3 != null) {
         if (this.L != null) {
            var4.setFont(this.L);
         }

         var5 = this;
      }

      if (var3 != null) {
         if (var5.a != null) {
            var4.setTransform(this.a);
         }

         var5 = this;
      }

      if (var3 != null) {
         if (var5.E != null) {
            var4.setComposite(this.E);
         }

         var5 = this;
      }

      if (var3 != null) {
         if (var5.o != null) {
            var4.setPaint(this.o);
         }

         var5 = this;
      }

      if (var5.t != null) {
         var4.drawString(this.t, a(31563, 2506015766379174632L), a(19781, 8376972399143890151L));
      }

      var4.dispose();
      return var2;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24995;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8354668623742330589L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "T\u0003_\u0089ÊÌ|?@°\u0083Z¾zJ^";
      int var5 = "T\u0003_\u0089ÊÌ|?@°\u0083Z¾zJ^".length();
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
   }
}





