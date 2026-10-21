package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TU extends T4 {
   protected int Q;

   public TU(int var1) {
      this.Q = var1;
   }

   public int t() {
      return this.Q;
   }

   public void C(int var1) {
      this.Q = var1;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.r(var1, false);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.r(var1, true);
   }

   @Override
   public void layoutContainer(Container var1) {
      int var10000 = T4.O();
      Dimension var3 = this.preferredLayoutSize(var1);
      int var2 = var10000;
      Dimension var4 = new Dimension(var3.width, var1.getSize().height);
      var10000 = var3.width;
      if (var2 == 0) {
         var10000 = var3.width < var4.width ? 1 : 0;
      }

      int var5 = var10000;
      Insets var6 = var1.getInsets();
      int var7 = var6.left;
      int var8 = var6.top;
      int var9 = Math.max(var4.height, var3.height) - var6.top - var6.bottom;
      int var10 = var4.width - var3.width;
      int var11 = var1.getComponentCount();
      int var12 = 0;

      while (var12 < var11) {
         Component var13 = var1.getComponent(var12);
         if (var2 == 0) {
            if (var13.isVisible()) {
               var10000 = var5;
               if (var2 == 0) {
                  var10000 = var5 != 0 ? var13.getMinimumSize().width : var13.getPreferredSize().width;
               }

               int var14 = var10000;
               var10000 = var10;
               if (var2 == 0) {
                  if (var10 > 0) {
                     var14 += var14 * var10 / var3.width;
                  }

                  var13.setBounds(var7, var8, var14, var9);
                  var10000 = var7 + (var14 - this.Q);
               }

               var7 = var10000;
            }

            var12++;
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   protected Dimension r(Container var1, boolean var2) {
      int var10000 = T4.b();
      int var4 = var1.getComponentCount();
      Dimension var5 = new Dimension(0, 0);
      int var6 = 0;
      int var3 = var10000;

      while (true) {
         if (var6 < var4) {
      Dimension var10;
            var10 = var1;
            if (var3 == 0) {
               break;
            }

            Component var7 = var1.getComponent(var6);
            Dimension var8 = var2 ? var7.getMinimumSize() : var7.getPreferredSize();
            var5.height = Math.max(var8.height, var5.height);
            var5.width = var5.width + var8.width;
            if (var3 != 0) {
               if (var6 != 0) {
                  var5.width = var5.width - this.Q;
               }

               var6++;
            }

            if (var3 != 0) {
      Dimension var10;
               continue;
            }
         }

         var10 = var1;
         break;
      }

      Insets var9 = var10.getInsets();
      var5.width = var5.width + var9.left + var9.right;
      var5.height = var5.height + var9.top + var9.bottom;
      return var5;
   }
}






