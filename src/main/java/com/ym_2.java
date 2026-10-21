package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

class Ym_2 extends com.C.y_2 {
   final _y_2 s;

   Ym_2(_y_2 var1) {
      this.s = var1;
   }

   @Override
   protected void v(Graphics2D var1, Rectangle var2) {
      int var10000 = _y_2.M();
      com.WZ var4 = this.s.kj.f();
      int var3 = var10000;
      if (var4 != null) {
         int var5 = this.s.e.getModel().getMaximum() - this.s.e.getModel().getMinimum();
         int var6 = Math.max(2, this.v.height / var5);
         Color var7 = (Color)com.c.c(267150274335408220L).get(null);
         var1.setColor(var7);

         for (pE_3 var9 : var4.B()) {
            int var10 = this.v.height * var9.s().r / var5;
            var1.fillRect(this.v.x, this.v.y + var10, this.v.width, var6);
            if (var3 == 0) {
               break;
            }
         }
      }
   }
}





