package com;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class Y0 extends ContainerAdapter {
   final boolean w;
   final com.k2_2 O;

   Y0(com.k2_2 var1, boolean var2) {
      this.O = var1;
      this.w = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
      int[] var2 = com.k3_2.L();
      com.Y0 var10000 = this;
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
      int[] var2 = com.k3_2.L();
      com.Y0 var10000 = this;
      if (var2 != null) {
         if (this.w) {
            this.O.q(var1.getComponent());
         }

         var10000 = this;
      }

      var10000.O.Y();
   }
}





