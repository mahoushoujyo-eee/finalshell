package com;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;

class TF implements com.E {
   private Rectangle b;
   final Component U;
   final com.E e;
   final com.Ds_2 d;

   TF(com.Ds_2 var1, Component var2, com.E var3) {
      this.d = var1;
      this.U = var2;
      this.e = var3;
      this.b = new Rectangle();
   }

   public Rectangle Q() {
      int[] var1 = com.Ds_2.U();
      com.TF var10000 = this;
      if (var1 == null) {
         if (this.U.isShowing()) {
            Rectangle var2 = (Rectangle)this.e.J();
            Point var3 = this.U.getLocationOnScreen();
            this.b = new Rectangle(var3.x + var2.x, var3.y + var2.y, var2.width, var2.height);
         }

         var10000 = this;
      }

      return var10000.b;
   }

   @Override
   public Object J() {
      return this.Q();
   }
}





