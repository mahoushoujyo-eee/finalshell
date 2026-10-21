package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class K8 extends WindowAdapter {
   public final Frame L;
   public final Frame N;

   public K8(Frame var1, Frame var2) {
      this.L = var1;
      this.N = var2;
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      String var2 = FV_2.D();
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





