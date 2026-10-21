package com.C;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class A extends ContainerAdapter {
   final com.KR f;
   final com.C.X e;

   A(com.C.X var1, com.KR var2) {
      this.e = var1;
      this.f = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
      if (var1.getChild() != this.f) {
         this.e.Z();
      }
   }

   @Override
   public void componentRemoved(ContainerEvent var1) {
      if (var1.getChild() != this.f) {
         this.e.Z();
      }
   }
}





