package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Hy4 extends W5 {
   public BufferedImageOp Z;
   public int s;

   public Hy4(BufferedImageOp var1, int var2) {
      this.Z = var1;
      this.s = var2;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      BufferedImage var6;
      String[] var10000 = W5.q();
      BufferedImage var4 = var1;
      String[] var3 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < this.s) {
            var6 = this.Z.filter(var4, var2);
            if (var3 == null) {
               break;
            }

            var4 = var6;
            var5++;
            if (var3 != null) {
               continue;
            }
         }

         var6 = var4;
         break;
      }

      return var6;
   }
}





