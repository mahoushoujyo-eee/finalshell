package com;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class xk_4 extends ImageIcon {
   private static int h;

   public xk_4() {
   }

   public xk_4(byte[] var1) {
      super(var1);
   }

   public xk_4(byte[] var1, String var2) {
      super(var1, var2);
   }

   public xk_4(Image var1) {
      super(var1);
   }

   public xk_4(Image var1, String var2) {
      super(var1, var2);
   }

   public xk_4(URL var1) {
      super(var1);
   }

   public xk_4(URL var1, String var2) {
      super(var1, var2);
   }

   public xk_4(String var1) {
      super(var1);
   }

   public xk_4(String var1, String var2) {
      super(var1, var2);
   }

   public xk_4(ImageIcon var1) {
      super(var1.getImage());
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      int var6;
      int var7;
      label29: {
         int var10000 = K();
         var6 = this.getIconWidth();
         var7 = this.getIconHeight();
         int var5 = var10000;
         if (var5 != 0) {
            if (var1 != null) {
               boolean var8 = var1.getComponentOrientation().isLeftToRight();
               if (var5 == 0) {
                  return;
               }

               if (!var8) {
                  break label29;
               }
            }

            var2.drawImage(this.getImage(), var3, var4, var6, var7, this.getImageObserver());
         }

         if (var5 != 0) {
            return;
         }

         com.ky_4.K(new String[2]);
      }

      var2.drawImage(this.getImage(), var3 + var6, var4, -var6, var7, this.getImageObserver());
   }

   public static void w(int var0) {
      h = var0;
   }

   public static int K() {
      return h;
   }

   public static int e() {
      int var0 = K();
      return var0 == 0 ? 31 : 0;
   }

   static {
      if (K() == 0) {
         w(38);
      }
   }
}





