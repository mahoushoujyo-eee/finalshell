package com.finalshell.core;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public class X3 extends Canvas {
   public final Y3 C;

   public X3(Y3 var1) {
      this.C = var1;
   }

   @Override
   public void paint(Graphics var1) {
      boolean var2;
      Y3 var4;
      label35: {
         var2 = com.finalshell.ui.panel.O2.U();
         int var10000 = (this.C.isContinuousLayout()) ? 1 : 0;
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

      Dimension var3 = Y3.X(var4).getSize();
      Graphics var5 = var1;
      if (!var2) {
         var1.setColor(this.C.Z);
         if (this.C.getOrientation() == 1) {
            var1.fillRect(0, 0, Y3.J(this.C) - 1, var3.height - 1);
            if (!var2) {
               return;
            }
         }

         var5 = var1;
      }

      var5.fillRect(0, 0, var3.width - 1, Y3.H(this.C) - 1);
   }
}





