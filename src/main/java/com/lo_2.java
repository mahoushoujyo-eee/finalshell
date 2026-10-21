package com;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Lo_2 extends com.Lz_2 {
   protected TexturePaint I = null;
   protected com.lt_4 q = null;

   public Lo_2(ImageIcon var1) {
      this(var1.getImage());
   }

   public Lo_2(Image var1) {
      this(Xg_2.v(var1));
   }

   public Lo_2(BufferedImage var1) {
      this.X(var1);
   }

   public Lo_2(com.lt_4 var1) {
      this.F(var1);
   }

   public com.lt_4 V() {
      return this.q;
   }

   public void F(com.lt_4 var1) {
      BufferedImage var3;
      label14: {
         int[] var10000 = com.Lz_2.M();
         this.q = var1;
         int[] var2 = var10000;
         com.lt_4 var10001 = var1;
         if (var2 == null) {
            if (var1 == null) {
               var3 = null;
               break label14;
            }

            var10001 = var1;
         }

         var3 = var10001.O();
      }

      this.X(var3);
   }

   public BufferedImage o() {
      int[] var1 = com.Lz_2.M();
      TexturePaint var10000 = this.I;
      if (var1 == null) {
         if (this.I == null) {
            return null;
         }

         var10000 = this.I;
      }

      return var10000.getImage();
   }

   public void I(BufferedImage var1) {
      this.X(var1);
   }

   protected void X(BufferedImage var1) {
      this.I = var1 != null ? new TexturePaint(var1, new Rectangle(0, 0, var1.getWidth(), var1.getHeight())) : null;
      this.l();
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = com.Lz_2.M();
      if (this.I != null) {
         Rectangle var5;
         Object var7;
         label26: {
            var5 = var3.getVisibleRect().intersection(var2);
            int var10000 = var5.width;
            if (var4 == null) {
               if (var5.width <= 0) {
                  return;
               }

               var7 = var5;
               if (var4 != null) {
                  break label26;
               }

               var10000 = var5.height;
            }

            if (var10000 <= 0) {
               return;
            }

            var7 = RV.O(var1);
         }

         Object var6 = var7;
         var1.setPaint(this.I);
         var1.fillRect(var5.x, var5.y, var5.width, var5.height);
         RV.N(var1, var6);
      }
   }
}





