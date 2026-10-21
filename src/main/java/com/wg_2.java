package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Wg_2 implements ChangeListener {
   final pA_3 o;

   Wg_2(pA_3 var1) {
      this.o = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      pA_3 var3;
      int var10000 = _y_2.y();
      this.o.cS = true;
      this.o.P = pA_3.y(this.o).getValue();
      int var2 = var10000;
      var3 = this.o;
      label17:
      if (var2 == 0) {
         if (pA_3.e(this.o) != null) {
            var3 = this.o;
            if (var2 != 0) {
               break label17;
            }

            if (this.o.q.isVisible()) {
               this.o.N();
               this.o.q.getParent().doLayout();
            }
         }

         var3 = this.o;
      }

      var3.repaint();
   }
}





