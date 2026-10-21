package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TD_2 extends T4 {
   public int e;

   public TD_2() {
      this(0);
   }

   public TD_2(int var1) {
      this.e = var1;
   }

   public int W() {
      return this.e;
   }

   public void j(int var1) {
      this.e = var1;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      Dimension var7;
      Insets var3 = var1.getInsets();
      int var10000 = T4.O();
      Dimension var4 = new Dimension(var3.left + var3.right, var3.top + var3.bottom);
      int var5 = 0;
      int var2 = var10000;

      while (true) {
         if (var5 < var1.getComponentCount()) {
            Dimension var6 = var1.getComponent(var5).getPreferredSize();
            var7 = var4;
            if (var2 != 0) {
               break;
            }

            int var10003 = var5;
            if (var2 == 0) {
               var10003 = var5 < var1.getComponentCount() - 1 ? this.e : 0;
            }

            var4.width = var4.width + (var6.width - var10003);
            var4.height = Math.max(var4.height, var3.top + var6.height + var3.bottom);
            var5++;
            if (var2 == 0) {
               continue;
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   @Override
   public void layoutContainer(Container var1) {
      int var7;
      int var10000 = T4.b();
      Insets var3 = var1.getInsets();
      int var2 = var10000;
      var10000 = (var1.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      if (var2 != 0) {
         if (var10000 != 0) {
            int var4 = var3.left;
            Component[] var5 = var1.getComponents();
            int var6 = var5.length;
            var7 = 0;

            while (var7 < var6) {
               Component var8 = var5[var7];
               Dimension var9 = var8.getPreferredSize();
               var8.setBounds(var4, var3.top, var9.width, var1.getHeight() - var3.top - var3.bottom);
               var4 += var9.width - this.e;
               var7++;
               if (var2 == 0) {
                  return;
               }

               if (var2 == 0) {
                  break;
               }
            }

            if (var2 != 0) {
               return;
            }
         }

         var10000 = var1.getWidth() - var3.right;
      }

      int var10 = var10000;

      for (Component var14 : var1.getComponents()) {
         Dimension var15 = var14.getPreferredSize();
         var14.setBounds(var10 - var15.width, var3.top, var15.width, var1.getHeight() - var3.top - var3.bottom);
         var10 += this.e - var15.width;
         if (var2 == 0) {
            break;
         }
      }
   }
}





