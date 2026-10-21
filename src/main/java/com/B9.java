package com;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class B9 implements MouseWheelListener {
   final pA_3 R;

   B9(pA_3 var1) {
      this.R = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = _y_2.y();
      int var10000 = this.R.m(var1);
      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getWheelRotation();
      }

      int var3 = var10000;
      pA_3.Z(this.R, var3);
   }
}





