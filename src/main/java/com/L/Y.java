package com.L;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class Y implements MouseWheelListener {
   final m J;

   Y(m var1) {
      this.J = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      com.ky_4[] var2 = m.X();
      int var10000 = this.J.b;
      if (var2 == null) {
         if (!this.J.b) {
            return;
         }

         var10000 = m.F(this.J).isEnabled();
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.J.Y();
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = m.B(this.J).getSelectedIndex();
      }

      int var3 = var10000;
      int var4 = Math.min(Math.max(0, var3 + var1.getWheelRotation()), m.M(this.J).getModel().getSize() - 1);
      if (var4 != var3) {
         m.C(this.J).setSelectedIndex(var4);
      }
   }
}





