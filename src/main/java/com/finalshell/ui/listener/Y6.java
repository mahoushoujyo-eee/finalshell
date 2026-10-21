package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Ky4;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Y6 implements MouseWheelListener {
   final com.finalshell.core.M3 J;

   Y6(com.finalshell.core.M3 var1) {
      this.J = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      Ky4[] var2 = com.finalshell.core.M3.X();
      int var10000 = this.J.b;
      if (var2 == null) {
         if (!this.J.b) {
            return;
         }

         var10000 = (com.finalshell.core.M3.F(this.J).isEnabled()) ? 1 : 0;
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.J.Y()) ? 1 : 0;
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = com.finalshell.core.M3.B(this.J).getSelectedIndex();
      }

      int var3 = var10000;
      int var4 = Math.min(Math.max(0, var3 + var1.getWheelRotation()), com.finalshell.core.M3.M(this.J).getModel().getSize() - 1);
      if (var4 != var3) {
         com.finalshell.core.M3.C(this.J).setSelectedIndex(var4);
      }
   }
}





