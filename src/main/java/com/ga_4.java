package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

public class ga_4 extends com.W5 {
   private float V = 0.1F;
   private float b;
   private float t = 1.0F;
   private float c = 0.5F;
   private float U = 0.5F;
   private int e = -1;
   private int l = 0;
   private static final String a;

   public void T(float var1) {
      this.b = var1;
   }

   public float k() {
      return this.b;
   }

   public void b(float var1) {
      this.t = var1;
   }

   public float s() {
      return this.t;
   }

   public void R(float var1) {
      this.V = var1;
   }

   public float b() {
      return this.V;
   }

   public void W(float var1) {
      this.U = var1;
   }

   public float z() {
      return this.U;
   }

   public void l(float var1) {
      this.c = var1;
   }

   public float t() {
      return this.c;
   }

   public void U(int var1) {
      this.e = var1;
   }

   public int i() {
      return this.e;
   }

   public void K(int var1) {
      this.l = var1;
   }

   public int E() {
      return this.l;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = com.W5.q();
      BufferedImage var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var10000 = var1;
      }

      int var4 = var10000.getWidth();
      int var5 = var1.getHeight();
      int var6 = (int)(this.V * (float)var4 * (float)var5 / 100.0F);
      float var7 = this.U * (float)var4;
      Random var8 = new Random((long)this.l);
      Graphics2D var9 = var2.createGraphics();
      var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var9.setColor(new Color(this.e));
      var9.setStroke(new BasicStroke(this.c));
      int var10 = 0;

      while (true) {
         if (var10 < var6) {
            float var11 = (float)var4 * var8.nextFloat();
            float var12 = (float)var5 * var8.nextFloat();
            float var13 = this.b + (float) (Math.PI * 2) * this.t * (var8.nextFloat() - 0.5F);
            float var14 = (float)Math.sin((double)var13) * var7;
            float var15 = (float)Math.cos((double)var13) * var7;
            float var16 = var11 - var15;
            float var17 = var12 - var14;
            float var18 = var11 + var15;
            float var19 = var12 + var14;
            var9.drawLine((int)var16, (int)var17, (int)var18, (int)var19);
            var10++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var9.dispose();
         break;
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "^7\u0015z.!\u0005_1\t\u007f?0Bi!U0e".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 65;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 65;
         var10006 = var0;
      } else {
         var6 = 65;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 65;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 77;
               break;
            case 1:
               var23 = 19;
               break;
            case 2:
               var23 = 58;
               break;
            case 3:
               var23 = 95;
               break;
            case 4:
               var23 = 10;
               break;
            case 5:
               var23 = 18;
               break;
            default:
               var23 = 107;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





