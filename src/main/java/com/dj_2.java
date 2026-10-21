package com;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

public class Dj_2 extends JComponent {
   protected int I;
   protected int r;
   protected int Z;
   protected BufferedImage f;
   protected BufferedImage M;
   private static final long[] a;
   private static final Integer[] b;

   public Dj_2() {
      this(a(26174, 1667449126911982065L), a(16445, 1822139528243191795L));
   }

   public Dj_2(int var1, int var2) {
      this(var1, var2, null);
   }

   public Dj_2(int var1, int var2, BufferedImage var3) {
      this.r = var1;
      this.Z = var2;
      this.I = Math.max(Math.max(var1, var2) / a(22144, 7118668849997154633L), 3);
      this.f = var3;
      this.M = var3;
      this.P();
      com.FN.Y(this);
      this.setTransferHandler(new rh_4(this));
   }

   public BufferedImage v() {
      return this.f;
   }

   public BufferedImage a() {
      return this.M;
   }

   public int i() {
      return this.I;
   }

   public void J(int var1) {
      this.I = var1;
      this.P();
   }

   public int L() {
      return this.r;
   }

   public void i(int var1) {
      this.r = var1;
      this.P();
   }

   public int P() {
      return this.Z;
   }

   public void y(int var1) {
      this.Z = var1;
      this.P();
   }

   public void C(BufferedImage var1) {
      this.f = var1;
      this.M = var1;
      this.P();
      this.repaint();
   }

   protected void P$void() {
      String var1 = com.Wb_2.m();
      BufferedImage var10000 = this.M;
      if (var1 != null) {
         if (this.M == null) {
            return;
         }

         this.M = Xg_2.S(this.f, this.r, this.Z);
         var10000 = Xg_2.m(this.M, 3);
      }

      BufferedImage var2 = var10000;
      Graphics2D var3 = var2.createGraphics();
      RV.X(var3);
      var3.setPaint(Color.WHITE);
      var3.fillRoundRect(0, 0, this.M.getWidth(), this.M.getHeight(), this.I * 2, this.I * 2);
      var3.setComposite(AlphaComposite.getInstance(5));
      var3.drawImage(this.M, 0, 0, null);
      var3.dispose();
      this.M.flush();
      this.M = var2;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      String var10000 = com.Wb_2.m();
      super.paintComponent(var1);
      Graphics2D var3 = (Graphics2D)var1;
      String var2 = var10000;
      Object var4 = RV.X(var3);
      if (this.M != null) {
         var3.drawImage(this.M, this.getWidth() / 2 - this.M.getWidth() / 2 + 1, this.getHeight() / 2 - this.M.getHeight() / 2 + 1, null);
      }

      Double var5 = new Double(
         (double)(this.getWidth() / 2 - this.r / 2 + 1),
         (double)(this.getHeight() / 2 - this.Z / 2 + 1),
         (double)(this.r - (this.M == null ? 3 : 1)),
         (double)(this.Z - (this.M == null ? 3 : 1)),
         (double)(this.I * 2),
         (double)(this.I * 2)
      );
      if (var2 != null) {
         if (this.M == null) {
            var3.setPaint(new Color(a(29504, 7582048157992496264L), a(4009, 6099193945677582435L), a(4009, 6099193945677582435L)));
            var3.fill(var5);
            var3.setStroke(
               new BasicStroke(
                  2.0F,
                  1,
                  1,
                  1.0F,
                  new float[]{Math.max(5.0F, Math.min((float)(Math.max(this.r, this.Z) / a(10533, 1078021828222580462L)), 10.0F)), 8.0F},
                  4.0F
               )
            );
            var3.setPaint(Color.LIGHT_GRAY);
            var3.draw(var5);
         }

         RV.X(var3, var4);
      }

      if (com.ky_4.F() != null) {
         com.Wb_2.W("iQOVKc");
      }
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(this.r + 2, this.Z + 2);
   }

   static {
      long var0 = 4747364431614770488L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "oÿ\u001cñfê\u000bÐ8L \u001baë\u00ad©NÓµK\b\u0000ô{Ö\u0095\u0011·\u0092´ÑB";
      int var5 = "oÿ\u001cñfê\u000bÐ8L \u001baë\u00ad©NÓµK\b\u0000ô{Ö\u0095\u0011·\u0092´ÑB".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = ":\u0005×\u001c?'D\u0089\u009a\\þ\u0080u\u009aâ\u008b";
                  var5 = ":\u0005×\u001c?'D\u0089\u009a\\þ\u0080u\u009aâ\u008b".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24523;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





