package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class NU3 extends ComponentAdapter {
   public final Nx4 k;

   public NU3(Nx4 var1) {
      this.k = var1;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int var2 = Nx4.c$int();
      Nx4 var10000 = this.k;
      if (var2 != 0) {
         if (!this.k.S.isShowing()) {
            return;
         }

         var10000 = this.k;
      }

      var10000.y();
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int var2 = Nx4.c$int();
      Nx4 var10000 = this.k;
      if (var2 != 0) {
         if (!this.k.S.isShowing()) {
            return;
         }

         var10000 = this.k;
      }

      var10000.y();
   }
}





