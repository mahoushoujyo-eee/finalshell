package com;

import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class gF_3 extends gy_4 {
   private float R;
   private float G;
   private float c;
   private float Z;
   private float a;
   private float A;
   private float l;
   private float g;
   private float p;
   private float I;
   private float o;
   private float C;
   private float h;
   private float K;
   private float O;
   private float x;
   private float Q;
   private float E;
   private float V;
   private float k;
   private float Y;
   private float T;
   private float b;
   private float M;
   private float w;
   private float H;
   private float i;
   private float W;
   private float u;
   private float e;
   private float B;
   private float m;
   private boolean J;
   private boolean D = false;
   private static final String d;

   public gF_3() {
      this(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F);
   }

   public gF_3(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void Q(boolean var1) {
      this.D = var1;
   }

   public boolean x() {
      return this.D;
   }

   public void J(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.A(var1, var2, var3, var4, var5, var6, var7, var8);
      this.J = true;
   }

   public void A(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      label21: {
         gF_3 var10;
         this.R = var1;
         this.G = var2;
         this.c = var3;
         this.Z = var4;
         this.a = var5;
         this.A = var6;
         this.l = var7;
         this.g = var8;
         String[] var10000 = com.W5.q();
         this.p = var3 - var5;
         this.I = var4 - var6;
         String[] var9 = var10000;
         this.o = var7 - var5;
         this.C = var8 - var6;
         this.h = var1 - var3 + var5 - var7;
         this.K = var2 - var4 + var6 - var8;
         var10 = this;
         label20:
         if (var9 != null) {
            if (this.h == 0.0F) {
               var10 = this;
               if (var9 == null) {
                  break label20;
               }

               if (this.K == 0.0F) {
                  this.M = var3 - var1;
                  this.i = var5 - var3;
                  this.e = var1;
                  this.w = var4 - var2;
                  this.W = var6 - var4;
                  this.B = var2;
                  this.H = this.u = 0.0F;
                  if (var9 != null) {
                     break label21;
                  }
               }
            }

            this.H = (this.h * this.C - this.o * this.K) / (this.p * this.C - this.I * this.o);
            this.u = (this.p * this.K - this.I * this.h) / (this.p * this.C - this.I * this.o);
            this.M = var3 - var1 + this.H * var3;
            this.i = var7 - var1 + this.u * var7;
            this.e = var1;
            this.w = var4 - var2 + this.H * var4;
            this.W = var8 - var2 + this.u * var8;
            var10 = this;
         }

         var10.B = var2;
      }

      this.m = 1.0F;
      this.J = false;
   }

   public void f(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.A(var1, var2, var3, var4, var5, var6, var7, var8);
      float var9 = this.W * this.m - this.B * this.u;
      float var10 = this.B * this.H - this.w * this.m;
      float var11 = this.w * this.u - this.W * this.H;
      float var12 = this.e * this.u - this.i * this.m;
      float var13 = this.M * this.m - this.e * this.H;
      float var14 = this.i * this.H - this.M * this.u;
      float var15 = this.i * this.B - this.e * this.W;
      float var16 = this.e * this.w - this.M * this.B;
      float var17 = this.M * this.W - this.i * this.w;
      float var18 = 1.0F / var17;
      this.M = var9 * var18;
      this.i = var12 * var18;
      this.e = var15 * var18;
      this.w = var10 * var18;
      this.W = var13 * var18;
      this.B = var16 * var18;
      this.H = var11 * var18;
      this.u = var14 * var18;
      this.m = 1.0F;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.O = this.W * this.m - this.B * this.u;
      this.x = this.e * this.u - this.i * this.m;
      String[] var10000 = com.W5.q();
      this.Q = this.i * this.B - this.e * this.W;
      this.E = this.B * this.H - this.w * this.m;
      this.V = this.M * this.m - this.e * this.H;
      this.k = this.e * this.w - this.M * this.B;
      this.Y = this.w * this.u - this.W * this.H;
      this.T = this.i * this.H - this.M * this.u;
      this.b = this.M * this.W - this.i * this.w;
      String[] var3 = var10000;
      gF_3 var8 = this;
      if (var3 != null) {
         if (!this.J) {
            int var4 = var1.getWidth();
            int var5 = var1.getHeight();
            float var6 = 1.0F / (float)var4;
            float var7 = 1.0F / (float)var5;
            this.O *= var6;
            this.E *= var6;
            this.Y *= var6;
            this.x *= var7;
            this.V *= var7;
            this.T *= var7;
         }

         var8 = this;
      }

      return var8.filter(var1, var2);
   }

   @Override
   protected void T(Rectangle var1) {
      String[] var2 = com.W5.q();
      boolean var10000 = this.J;
      if (var2 != null) {
         if (this.J) {
            var1.x = (int)Math.min(Math.min(this.R, this.c), Math.min(this.a, this.l));
            var1.y = (int)Math.min(Math.min(this.G, this.Z), Math.min(this.A, this.g));
            var1.width = (int)Math.max(Math.max(this.R, this.c), Math.max(this.a, this.l)) - var1.x;
            var1.height = (int)Math.max(Math.max(this.G, this.Z), Math.max(this.A, this.g)) - var1.y;
            return;
         }

         var10000 = this.D;
      }

      if (!var10000) {
         float var3 = (float)var1.getWidth();
         float var4 = (float)var1.getHeight();
         Rectangle var5 = new Rectangle();
         var5.add(this.getPoint2D(new Float(0.0F, 0.0F), null));
         var5.add(this.getPoint2D(new Float(var3, 0.0F), null));
         var5.add(this.getPoint2D(new Float(0.0F, var4), null));
         var5.add(this.getPoint2D(new Float(var3, var4), null));
         var1.setRect(var5);
      }
   }

   public float H() {
      return this.R - (float)((int)Math.min(Math.min(this.R, this.c), Math.min(this.a, this.l)));
   }

   public float p() {
      return this.G - (float)((int)Math.min(Math.min(this.G, this.Z), Math.min(this.A, this.g)));
   }

   @Override
   public Rectangle2D getBounds2D(BufferedImage var1) {
      String[] var2 = com.W5.q();
      int var10000 = this.D;
      if (var2 != null) {
         if (this.D) {
            return new Rectangle(0, 0, var1.getWidth(), var1.getHeight());
         }

         var10000 = var1.getWidth();
      }

      float var3 = (float)var10000;
      float var4 = (float)var1.getHeight();
      java.awt.geom.Rectangle2D.Float var5 = new java.awt.geom.Rectangle2D.Float();
      var5.add(this.getPoint2D(new Float(0.0F, 0.0F), null));
      var5.add(this.getPoint2D(new Float(var3, 0.0F), null));
      var5.add(this.getPoint2D(new Float(0.0F, var4), null));
      var5.add(this.getPoint2D(new Float(var3, var4), null));
      return var5;
   }

   @Override
   public Point2D getPoint2D(Point2D var1, Point2D var2) {
      String[] var3 = com.W5.q();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = new Float();
         }

         var10000 = var1;
      }

      float var4 = (float)var10000.getX();
      float var5 = (float)var1.getY();
      float var6 = 1.0F / (var4 * this.H + var5 * this.u + this.m);
      var2.setLocation((double)((var4 * this.M + var5 * this.i + this.e) * var6), (double)((var4 * this.w + var5 * this.W + this.B) * var6));
      return (Point2D)var2;
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      var3[0] = (float)this.U.width * (this.O * (float)var1 + this.x * (float)var2 + this.Q) / (this.Y * (float)var1 + this.T * (float)var2 + this.b);
      var3[1] = (float)this.U.height * (this.E * (float)var1 + this.V * (float)var2 + this.k) / (this.Y * (float)var1 + this.T * (float)var2 + this.b);
   }

   @Override
   public String toString() {
      return d;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "F^\u0000J\u001e,Y-g\u0016L\u0002.HaC\u001aH\u0014p\u0003,".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 106;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      } else {
         var6 = 106;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 104;
               break;
            case 1:
               var23 = 93;
               break;
            case 2:
               var23 = 25;
               break;
            case 3:
               var23 = 84;
               break;
            case 4:
               var23 = 27;
               break;
            case 5:
               var23 = 52;
               break;
            default:
               var23 = 71;
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
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





