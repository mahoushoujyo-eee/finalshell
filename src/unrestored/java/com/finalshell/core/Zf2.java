package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Zf2 extends ZH {
   public int l;
   public int c;
   public int z;
   public float B;
   public boolean b;
   public boolean X;
   public int H;
   public static long[] a;
   public static Integer[] d;

   public Zf2() {
      this.l = a(18842, 7407294327733724512L);
      this.c = a(30246, 2476600586153040607L);
      this.z = a(30246, 2476600586153040607L);
      this.B = 0.5F;
      this.b = false;
      this.X = true;
      this.H = a(27663, 3036285714057003252L);
   }

   public Zf2(int var1, int var2, int var3, float var4) {
      this.l = a(30246, 2476600586153040607L);
      this.c = a(30246, 2476600586153040607L);
      this.z = a(30246, 2476600586153040607L);
      this.B = 0.5F;
      this.b = false;
      this.X = true;
      this.H = a(17286, 3306709873100894078L);
      this.l = var1;
      this.c = var2;
      this.z = var3;
      this.B = var4;
   }

   public void S(int var1) {
      this.c = var1;
   }

   public int L() {
      return this.c;
   }

   public void V(int var1) {
      this.z = var1;
   }

   public int o() {
      return this.z;
   }

   public void i(int var1) {
      this.l = var1;
   }

   public int y() {
      return this.l;
   }

   public void s(float var1) {
      this.B = var1;
   }

   public float G() {
      return this.B;
   }

   public void L(int var1) {
      this.H = var1;
   }

   public int E() {
      return this.H;
   }

   public void n(boolean var1) {
      this.b = var1;
   }

   public boolean i() {
      return this.b;
   }

   public void S(boolean var1) {
      this.X = var1;
   }

   public boolean R() {
      return this.X;
   }

   public void M(Rectangle var1) {
      String[] var2 = ZH.U();
      if (var2 == null) {
         if (!this.b) {
            return;
         }

         var1.width = var1.width + Math.abs(this.c) + 2 * this.l;
      }

      var1.height = var1.height + Math.abs(this.z) + 2 * this.l;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      String[] var10000 = ZH.U();
      var4 = var1.getWidth();
      var3 = var10000;
      var5 = var1.getHeight();
      label39:
      if (var2 == null) {
         Zf2 var13 = this;
         if (var3 == null) {
            if (this.b) {
               ColorModel var6 = var1.getColorModel();
               var2 = new BufferedImage(var6, var6.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var6.isAlphaPremultiplied(), null);
               if (var3 == null) {
                  break label39;
               }
            }

            var13 = this;
         }

         var2 = var13.createCompatibleDestImage(var1, null);
      }

      label42: {
         float[][] var11 = new float[][]{{0.0F, 0.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 0.0F, this.B}};
         BufferedImage var7 = new BufferedImage(var4, var5, 2);
         new BandCombineOp(var11, null).filter(var1.getRaster(), var7.getRaster());
         var7 = new Z7((float)this.l).filter(var7, null);
         Graphics2D var8 = var2.createGraphics();
         var8.setComposite(AlphaComposite.getInstance(3, this.B));
         boolean var14 = this.b;
         if (var3 == null) {
            if (this.b) {
               int var9 = Math.max(0, this.l - this.z);
               int var10 = Math.max(0, this.l - this.c);
               var8.translate(var9, var10);
            }

            var8.drawRenderedImage(var7, AffineTransform.getTranslateInstance((double)this.c, (double)this.z));
            if (var3 != null) {
               break label42;
            }

            var14 = this.X;
         }

         if (!var14) {
            var8.setComposite(AlphaComposite.SrcOver);
            var8.drawRenderedImage(var1, null);
         }

         var8.dispose();
      }

      if (Ky4.F$arrString() != null) {
         ZH.L(new String[2]);
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27897;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2830780452505264591L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "hU\u0010\u0017@\u009f;\u0015`½Òk\u0012Æ\u008e±";
      int var5 = "hU\u0010\u0017@\u009f;\u0015`½Òk\u0012Æ\u008e±".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     d = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "g\u0015ÑÍ-D!;N\u008f\u0013aÃç\u0084ª";
                  var5 = "g\u0015ÑÍ-D!;N\u008f\u0013aÃç\u0084ª".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
}





