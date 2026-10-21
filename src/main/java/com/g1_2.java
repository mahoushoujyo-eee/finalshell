package com;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class g1_2 extends com.W5 {
   private float H = 5.0F;
   private float f = (float) Math.PI * 7.0F / 4.0F;
   private float Y = 5.0F;
   private float h = 0.5F;
   private boolean b = false;
   private int X = -1;
   private float S = 0.2F;
   private float v = 0.0F;
   private static final String a;

   public void r(float var1) {
      this.f = var1;
   }

   public float x() {
      return this.f;
   }

   public void L(float var1) {
      this.Y = var1;
   }

   public float B() {
      return this.Y;
   }

   public void M(float var1) {
      this.H = var1;
   }

   public float J() {
      return this.H;
   }

   public void s(float var1) {
      this.h = var1;
   }

   public float I() {
      return this.h;
   }

   public void K(int var1) {
      this.X = var1;
   }

   public int o() {
      return this.X;
   }

   public void S(boolean var1) {
      this.b = var1;
   }

   public boolean e() {
      return this.b;
   }

   public void p(float var1) {
      this.S = var1;
   }

   public float M() {
      return this.S;
   }

   public void Z(float var1) {
      this.v = var1;
   }

   public float K() {
      return this.v;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4;
      int var5;
      label13: {
         String[] var10000 = com.W5.q();
         var4 = var1.getWidth();
         String[] var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var15 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label13;
            }

            var15 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var15;
      }

      float var6 = this.Y * (float)Math.cos((double)this.f);
      float var7 = -this.Y * (float)Math.sin((double)this.f);
      new BufferedImage(var4, var5, 2);
      hc_4 var9 = new hc_4(this.h * 10.0F, 0.75F, 0.1F);
      BufferedImage var8 = var9.filter(var1, null);
      BufferedImage var10 = new BufferedImage(var4, var5, 2);
      Graphics2D var11 = var10.createGraphics();
      var11.setColor(new Color(this.X));
      var11.fillRect(0, 0, var4, var5);
      var11.setComposite(AlphaComposite.DstIn);
      var11.drawRenderedImage(var8, null);
      var11.setComposite(AlphaComposite.DstOut);
      var11.translate((double)var6, (double)var7);
      var11.drawRenderedImage(var8, null);
      var11.dispose();
      var10 = new hX_3(this.H).filter(var10, null);
      var10 = new gS_3(3.0F * this.S).filter(var10, var10);
      var11 = var2.createGraphics();
      var11.drawRenderedImage(var1, null);
      var11.setComposite(new rO_3(1.0F));
      var11.drawRenderedImage(var10, null);
      var11.dispose();
      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "gL>\u001cN\u0001z\u001bk/\u0019I\u001e1\u001a\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 28;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 28;
         var10006 = var0;
      } else {
         var6 = 28;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 28;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 40;
               break;
            case 1:
               var23 = 36;
               break;
            case 2:
               var23 = 91;
               break;
            case 3:
               var23 = 108;
               break;
            case 4:
               var23 = 59;
               break;
            case 5:
               var23 = 103;
               break;
            default:
               var23 = 3;
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





