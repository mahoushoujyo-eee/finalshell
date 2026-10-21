package com.finalshell.core;

import com.finalshell.ui.dialog.Ds2;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;

public class TF implements E_2 {
   public Rectangle b;
   public final Component U;
   public final E_2 e;
   public final Ds2 d;

   public TF(Ds2 var1, Component var2, E_2 var3) {
      this.d = var1;
      this.U = var2;
      this.e = var3;
      this.b = new Rectangle();
   }

   public Rectangle Q() {
      int[] var1 = Ds2.U$arrint();
      TF var10000 = this;
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





