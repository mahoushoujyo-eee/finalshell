package com.finalshell.core;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class NP3 extends CardLayout {
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var10000 = T4.b();
      Object var3;
      synchronized (var3 = var1.getTreeLock()){} // $VF: monitorenter 
      int var2 = var10000;

      try {
         Insets var4 = var1.getInsets();
         int var5 = var1.getComponentCount();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;

         while (var8 < var5) {
            Component var9 = var1.getComponent(var8);
            if (var2 != 0) {
               label65:
               if (var9.isVisible()) {
                  label86: {
                     Dimension var10 = var9.getPreferredSize();
                     var10000 = var10.width;
                     int var10001 = var6;
                     if (var2 != 0) {
                        if (var10.width > var6) {
                           var6 = var10.width;
                        }

                        var10000 = var10.height;
                        if (var2 == 0) {
                           break label86;
                        }

                        var10001 = var7;
                     }

                     if (var10000 <= var10001) {
                        break label65;
                     }

                     var10000 = var10.height;
                  }

                  var7 = var10000;
               }

               var8++;
            }

            if (var2 == 0) {
               break;
            }
         }

         Dimension var15 = new Dimension(var4.left + var4.right + var6 + this.getHgap() * 2, var4.top + var4.bottom + var7 + this.getVgap() * 2);
         // $VF: monitorexit
         return var15;
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Dimension minimumLayoutSize(Container var1) {
      int var10000 = T4.O();
      Object var3;
      synchronized (var3 = var1.getTreeLock()){} // $VF: monitorenter 
      int var2 = var10000;

      try {
         Insets var4 = var1.getInsets();
         int var5 = var1.getComponentCount();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;

         while (var8 < var5) {
            Component var9 = var1.getComponent(var8);
            if (var2 == 0) {
               label65:
               if (var9.isVisible()) {
                  label86: {
                     Dimension var10 = var9.getMinimumSize();
                     var10000 = var10.width;
                     int var10001 = var6;
                     if (var2 == 0) {
                        if (var10.width > var6) {
                           var6 = var10.width;
                        }

                        var10000 = var10.height;
                        if (var2 != 0) {
                           break label86;
                        }

                        var10001 = var7;
                     }

                     if (var10000 <= var10001) {
                        break label65;
                     }

                     var10000 = var10.height;
                  }

                  var7 = var10000;
               }

               var8++;
            }

            if (var2 != 0) {
               break;
            }
         }

         Dimension var15 = new Dimension(var4.left + var4.right + var6 + this.getHgap() * 2, var4.top + var4.bottom + var7 + this.getVgap() * 2);
         // $VF: monitorexit
         return var15;
      } finally {
         // $VF: monitorexit
      }
   }
}





