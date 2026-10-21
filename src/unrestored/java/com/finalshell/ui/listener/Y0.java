package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Y0 extends ContainerAdapter {
   public final boolean w;
   public final com.finalshell.ui.panel.K22 O;

   public Y0(com.finalshell.ui.panel.K22 var1, boolean var2) {
      this.O = var1;
      this.w = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
      int[] var2 = K32.L$arrint();
      Y0 var10000 = this;
      if (var2 != null) {
         if (this.w) {
            this.O.L(var1.getComponent());
         }

         var10000 = this;
      }

      var10000.O.Y();
   }

   @Override
   public void componentRemoved(ContainerEvent var1) {
      int[] var2 = K32.L$arrint();
      Y0 var10000 = this;
      if (var2 != null) {
         if (this.w) {
            this.O.q(var1.getComponent());
         }

         var10000 = this;
      }

      var10000.O.Y();
   }
}





