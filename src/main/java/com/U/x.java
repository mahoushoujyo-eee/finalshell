package com.U;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

class x extends Canvas {
   final y C;

   x(y var1) {
      this.C = var1;
   }

   @Override
   public void paint(Graphics var1) {
      boolean var2;
      y var4;
      label35: {
         var2 = com.U.O.U();
         int var10000 = this.C.isContinuousLayout();
         if (!var2) {
            if (var10000 != 0) {
               return;
            }

            var4 = this.C;
            if (var2) {
               break label35;
            }

            var10000 = this.C.getLastDragLocation();
         }

         if (var10000 == -1) {
            return;
         }

         var4 = this.C;
      }

      Dimension var3 = com.U.y.X(var4).getSize();
      Graphics var5 = var1;
      if (!var2) {
         var1.setColor(this.C.Z);
         if (this.C.getOrientation() == 1) {
            var1.fillRect(0, 0, com.U.y.J(this.C) - 1, var3.height - 1);
            if (!var2) {
               return;
            }
         }

         var5 = var1;
      }

      var5.fillRect(0, 0, var3.width - 1, com.U.y.H(this.C) - 1);
   }
}





