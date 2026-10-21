package com;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class K8 extends WindowAdapter {
   final Frame L;
   final Frame N;

   K8(Frame var1, Frame var2) {
      this.L = var1;
      this.N = var2;
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      String var2 = com.FV.D();
      Frame var10000 = this.L;
      if (var2 == null) {
         if (this.L.isShowing()) {
            this.L.setExtendedState(0);
            this.L.toFront();
            if (var2 == null) {
               return;
            }
         }

         var10000 = this.N;
      }

      var10000.removeWindowListener(this);
   }
}





