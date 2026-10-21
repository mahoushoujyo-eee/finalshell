package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TJ extends com.T4 {
   protected int d;
   protected boolean r;

   public TJ() {
      this(2);
   }

   public TJ(int var1) {
      this(var1, false);
   }

   public TJ(int var1, boolean var2) {
      this.d = var1;
      this.r = var2;
   }

   public int d() {
      return this.d;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public boolean d$boolean() {
      return this.r;
   }

   public void X(boolean var1) {
      this.r = var1;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.Q(var1, false);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.Q(var1, true);
   }

   @Override
   public void layoutContainer(Container var1) {
      int var10000 = com.T4.b();
      Dimension var3 = this.preferredLayoutSize(var1);
      int var2 = var10000;
      Dimension var4 = new Dimension(var3.width, var1.getSize().height);
      byte var5 = var1.getComponentOrientation().isLeftToRight();
      Insets var6 = var1.getInsets();
      var10000 = var5;
      if (var2 != 0) {
         var10000 = var5 != 0 ? var6.left : var6.right;
      }

      int var7 = var10000;
      var10000 = var5;
      if (var2 != 0) {
         var10000 = var5 != 0 ? var6.right : var6.left;
      }

      int var8 = var10000;
      var10000 = var3.width;
      if (var2 != 0) {
         var10000 = var3.width < var4.width ? 1 : 0;
      }

      int var9 = var10000;
      int var10 = var7;
      int var11 = var6.top;
      int var12 = Math.max(var4.height, var3.height) - var6.top - var6.bottom;
      int var13 = var4.width - var3.width;
      int var14 = var1.getComponentCount();
      int var15 = 0;

      while (var15 < var14) {
         Component var16 = var1.getComponent(var15);
         if (var2 != 0) {
            if (var16.isVisible()) {
               var10000 = var9;
               if (var2 != 0) {
                  var10000 = var9 != 0 ? var16.getMinimumSize().width : var16.getPreferredSize().width;
               }

               int var17 = var10000;
               var10000 = var13;
               if (var2 != 0) {
                  if (var13 > 0) {
                     var17 += var17 * var13 / var3.width;
                  }

                  var10000 = this.r;
               }

               label93: {
                  label109: {
                     if (var2 != 0) {
                        if (var10000 == 0) {
                           break label109;
                        }

                        var10000 = var15;
                     }

                     int var10001 = var14 - 1;
                     if (var2 != 0) {
                        if (var10000 != var10001) {
                           break label109;
                        }

                        var10000 = var1.getWidth() - var10;
                        var10001 = var8;
                     }

                     var10000 -= var10001;
                     if (var2 == 0) {
                        break label93;
                     }

                     if (var10000 > 0) {
                        var10000 = var1.getWidth() - var10 - var8;
                        break label93;
                     }
                  }

                  var10000 = var17;
               }

               label77: {
                  int var18;
                  label76: {
                     var18 = var10000;
                     if (var2 != 0) {
                        if (var5 == 0) {
                           break label76;
                        }

                        var16.setBounds(var10, var11, var18, var12);
                     }

                     if (var2 != 0) {
                        break label77;
                     }
                  }

                  var16.setBounds(var1.getWidth() - var10 - var18, var11, var18, var12);
               }

               var10 += var17 + this.d();
            }

            var15++;
         }

         if (var2 == 0) {
            break;
         }
      }
   }

   protected Dimension Q(Container var1, boolean var2) {
      int var10000 = com.T4.O();
      int var4 = var1.getComponentCount();
      int var3 = var10000;
      Dimension var5 = new Dimension(0, 0);
      int var6 = 0;

      while (true) {
         if (var6 < var4) {
            var10 = var1;
            if (var3 != 0) {
               break;
            }

            Component var7 = var1.getComponent(var6);
            Dimension var8 = var2 ? var7.getMinimumSize() : var7.getPreferredSize();
            var5.height = Math.max(var8.height, var5.height);
            var5.width = var5.width + var8.width;
            if (var3 == 0) {
               if (var6 != 0) {
                  var5.width = var5.width + this.d();
               }

               var6++;
            }

            if (var3 == 0) {
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





