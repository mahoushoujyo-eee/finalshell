package com;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public abstract class zd_2 extends com.zH {
   protected boolean Z = false;

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var10000 = com.zH.U();
      int var6 = var1.getType();
      String[] var3 = var10000;
      WritableRaster var7 = var1.getRaster();
      BufferedImage var13 = var2;
      if (var3 == null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var13 = var2;
      }

      WritableRaster var8 = var13.getRaster();
      this.Y(var4, var5);
      int[] var9 = new int[var4];
      int var10 = 0;

      while (var10 < var5) {
         label61: {
            label69: {
               int var14 = var6;
               if (var3 == null) {
                  if (var6 == 2) {
                     var7.getDataElements(0, var10, var4, 1, var9);
                     int var11 = 0;

                     while (true) {
                        if (var11 < var4) {
                           var9[var11] = this.T(var11, var10, var9[var11]);
                           var11++;
                           if (var3 != null) {
                              break;
                           }

                           if (var3 == null) {
                              continue;
                           }
                        }

                        var8.setDataElements(0, var10, var4, 1, var9);
                        break;
                     }

                     if (var3 == null) {
                        break label69;
                     }
                  }

                  var1.getRGB(0, var10, var4, 1, var9, 0, var4);
                  var14 = 0;
               }

               int var12 = var14;

               while (var12 < var4) {
                  var9[var12] = this.T(var12, var10, var9[var12]);
                  var12++;
                  if (var3 != null) {
                     break label61;
                  }

                  if (var3 != null) {
                     break;
                  }
               }

               var2.setRGB(0, var10, var4, 1, var9, 0, var4);
            }

            var10++;
         }

         if (var3 != null) {
            break;
         }
      }

      return var2;
   }

   public void Y(int var1, int var2) {
   }

   public abstract int T(int var1, int var2, int var3);
}





