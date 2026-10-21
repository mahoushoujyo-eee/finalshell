package com;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class h__2 extends com.W5 {
   private int U;
   private int l;
   private int S;
   private int e;
   private Paint m;
   private static final String a;

   public h__2() {
   }

   public h__2(int var1, int var2, int var3, int var4, Paint var5) {
      this.U = var1;
      this.S = var2;
      this.l = var3;
      this.e = var4;
      this.m = var5;
   }

   public void r(int var1) {
      this.U = var1;
   }

   public int O() {
      return this.U;
   }

   public void I(int var1) {
      this.l = var1;
   }

   public int x() {
      return this.l;
   }

   public void V(int var1) {
      this.S = var1;
   }

   public int L() {
      return this.S;
   }

   public void u(int var1) {
      this.e = var1;
   }

   public int i() {
      return this.e;
   }

   public void M(Paint var1) {
      this.m = var1;
   }

   public Paint T() {
      return this.m;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      String[] var10000 = com.W5.q();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      BufferedImage var7 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = new BufferedImage(var4 + this.U + this.l, var5 + this.S + this.e, var1.getType());
         }

         var7 = var2;
      }

      Graphics2D var6 = var7.createGraphics();
      if (var3 != null) {
         if (this.m != null) {
            var6.setPaint(this.m);
            int var8 = this.U;
            if (var3 != null) {
               if (this.U > 0) {
                  var6.fillRect(0, 0, this.U, var5);
               }

               var8 = this.l;
            }

            if (var3 != null) {
               if (var8 > 0) {
                  var6.fillRect(var4 - this.l, 0, this.l, var5);
               }

               var8 = this.S;
            }

            if (var3 != null) {
               if (var8 > 0) {
                  var6.fillRect(this.U, 0, var4 - this.U - this.l, this.S);
               }

               var8 = this.e;
            }

            if (var8 > 0) {
               var6.fillRect(this.U, var5 - this.e, var4 - this.U - this.l, this.e);
            }
         }

         var6.drawRenderedImage(var1, AffineTransform.getTranslateInstance((double)this.U, (double)this.l));
         var6.dispose();
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "y\u000bpMjhW\u0012 lKa\u007fQ\u0013L-".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 84;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      } else {
         var6 = 84;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 105;
               break;
            case 1:
               var23 = 54;
               break;
            case 2:
               var23 = 87;
               break;
            case 3:
               var23 = 109;
               break;
            case 4:
               var23 = 81;
               break;
            case 5:
               var23 = 78;
               break;
            default:
               var23 = 119;
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





