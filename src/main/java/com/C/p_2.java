package com.C;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class p_2 extends ContainerAdapter {
   final com.Ov_2 t;
   final J N;

   p_2(J var1, com.Ov_2 var2) {
      this.N = var1;
      this.t = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
      if (var1.getChild() != this.t) {
         this.N.Z();
      }
   }

   @Override
   public void componentRemoved(ContainerEvent var1) {
      if (var1.getChild() != this.t) {
         this.N.Z();
      }
   }
}





