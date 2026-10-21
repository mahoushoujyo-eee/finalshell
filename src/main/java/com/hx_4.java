package com;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class hx_4 extends com.W5 {
   private float d = 0.5F;
   private float G = 0.5F;
   private float L;
   private float y;
   private float l;
   private float n;
   private float D = 1.0F;
   private float e = 1.0F;
   private int h;
   private static final String a;

   public hx_4() {
   }

   public hx_4(float var1, float var2, float var3, float var4) {
      this.L = var1;
      this.y = var2;
      this.l = var3;
      this.n = var4;
   }

   public void H(float var1) {
      this.y = var1;
   }

   public float Y() {
      return this.y;
   }

   public void N(float var1) {
      this.L = var1;
   }

   public float y() {
      return this.L;
   }

   public void L(float var1) {
      this.l = var1;
   }

   public float u() {
      return this.l;
   }

   public void o(float var1) {
      this.n = var1;
   }

   public float H() {
      return this.n;
   }

   public void s(float var1) {
      this.D = var1;
   }

   public float v() {
      return this.D;
   }

   public void y(float var1) {
      this.e = var1;
   }

   public float U() {
      return this.e;
   }

   public void v(float var1) {
      this.d = var1;
   }

   public float G() {
      return this.d;
   }

   public void T(float var1) {
      this.G = var1;
   }

   public float e() {
      return this.G;
   }

   public void C(Point2D var1) {
      this.d = (float)var1.getX();
      this.G = (float)var1.getY();
   }

   public Point2D a() {
      return new Float(this.d, this.G);
   }

   public void U(int var1) {
      this.h = var1;
   }

   public int m() {
      return this.h;
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

      float var4 = (float)var10000.getWidth() * this.d;
      float var5 = (float)var1.getHeight() * this.G;
      float var6 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
      float var7 = (float)((double)this.L * Math.cos((double)this.y));
      float var8 = (float)((double)this.L * -Math.sin((double)this.y));
      float var9 = (float)Math.exp((double)this.n);
      float var10 = this.l;
      if (this.h == 0) {
         Graphics2D var13 = var2.createGraphics();
         var13.drawRenderedImage(var1, null);
         var13.dispose();
         return var2;
      } else {
         Graphics2D var11 = var2.createGraphics();
         var11.drawImage(var1, null, null);
         int var12 = 0;

         while (true) {
            if (var12 < this.h) {
               var11.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               var11.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
               var11.setComposite(AlphaComposite.getInstance(3, NM.J((float)var12 / (float)(this.h - 1), this.D, this.e)));
               var11.translate((double)(var4 + var7), (double)(var5 + var8));
               var11.scale((double)var9, (double)var9);
               if (var3 == null) {
                  break;
               }

               float var15;
               int var14 = (var15 = this.l - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               if (var3 != null) {
                  if (var14) {
                     var11.rotate((double)var10);
                  }

                  var11.translate((double)(-var4), (double)(-var5));
                  var11.drawImage(var1, null, null);
               }

               var12++;
               if (var3 != null) {
                  continue;
               }
            }

            var11.dispose();
            break;
         }

         return var2;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "?#UO\u001c[JU\u0003VO\u001bMX\u0019.\u001d\u0004Q".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 13;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 13;
         var10006 = var0;
      } else {
         var6 = 13;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 13;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 119;
               break;
            case 1:
               var23 = 72;
               break;
            case 2:
               var23 = 62;
               break;
            case 3:
               var23 = 39;
               break;
            case 4:
               var23 = 114;
               break;
            case 5:
               var23 = 34;
               break;
            default:
               var23 = 52;
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





