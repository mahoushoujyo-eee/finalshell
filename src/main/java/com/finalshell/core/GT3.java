package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class GT3 extends W5 {
   public Rectangle l;
   public Rectangle H;

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      int var6 = var1.getType();
      WritableRaster var7 = var1.getRaster();
      this.H = new Rectangle(0, 0, var4, var5);
      this.l = new Rectangle(0, 0, var4, var5);
      String[] var3 = var10000;
      this.J(this.l);
      BufferedImage var12 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var8 = var1.getColorModel();
            var2 = new BufferedImage(var8, var8.createCompatibleWritableRaster(this.l.width, this.l.height), var8.isAlphaPremultiplied(), null);
         }

         var12 = var2;
      }

      WritableRaster var10 = var12.getRaster();
      int[] var9 = this.l(var1, 0, 0, var4, var5, null);
      var9 = this.K(var4, var5, var9, this.l);
      this.E(var2, 0, 0, this.l.width, this.l.height, var9);
      return var2;
   }

   public void J(Rectangle var1) {
   }

   public abstract int[] K(int var1, int var2, int[] var3, Rectangle var4);
}





