package com.finalshell.core;

import com.finalshell.ui.panel.QX;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class C_k_2 implements E_2 {
   final Component P;
   final QX G;

   C_k_2(QX var1, Component var2) {
      this.G = var1;
      this.P = var2;
   }

   public Rectangle a() {
      String[] var1;
      Rectangle var2;
      Dimension var3;
      Dimension var4;
      Point var5;
      label37: {
         label36: {
            String[] var10000 = QX.Y();
            var2 = FN.O$Rectangle(this.P);
            var1 = var10000;
            var3 = FN.a$JRootPane(this.P).getSize();
            var4 = this.G.getPreferredSize();
            var5 = new Point();
            if (var1 == null) {
               if (var2.x + var4.width >= var3.width && var3.width - var2.x - var4.width <= var2.x) {
                  break label36;
               }

               var5.x = 0;
            }

            if (var1 == null) {
               break label37;
            }
         }

         var5.x = var2.width - var4.width;
      }

      label26: {
         label25: {
            int var6 = var2.y + var2.height + var4.height;
            int var10001 = var3.height;
            if (var1 == null) {
               if (var6 < var3.height) {
                  break label25;
               }

               var6 = var3.height - var2.y - var2.height - var4.height;
               var10001 = var2.y;
            }

            if (var6 <= var10001) {
               break label26;
            }
         }

         var5.y = var2.height;
         if (var1 == null) {
            return new Rectangle(var5, this.G.getPreferredSize());
         }
      }

      var5.y = -var4.height;
      return new Rectangle(var5, this.G.getPreferredSize());
   }

   @Override
   public Object J() {
      return this.a();
   }
}





