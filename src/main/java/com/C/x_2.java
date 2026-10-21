package com.C;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class x_2 extends ContainerAdapter {
   final com.Qx_2 O;
   final com.C.a_2 b;

   x_2(com.C.a_2 var1, com.Qx_2 var2) {
      this.b = var1;
      this.O = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
      if (var1.getChild() != this.O) {
         this.b.Z();
      }
   }

   @Override
   public void componentRemoved(ContainerEvent var1) {
      if (var1.getChild() != this.O) {
         this.b.Z();
      }
   }
}





