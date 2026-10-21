package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class H62 extends W5 {
   public BufferedImageOp m;
   public BufferedImageOp d;

   public H62(BufferedImageOp var1, BufferedImageOp var2) {
      this.m = var1;
      this.d = var2;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      BufferedImage var3 = this.m.filter(var1, var2);
      return this.d.filter(var3, var2);
   }
}





