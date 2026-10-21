package com.C;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class C extends ContainerAdapter {
   final com.ki_4 K;
   final I z;

   C(I var1, com.ki_4 var2) {
      this.z = var1;
      this.K = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
      if (var1.getChild() != this.K) {
         this.z.Z();
      }
   }

   @Override
   public void componentRemoved(ContainerEvent var1) {
      if (var1.getChild() != this.K) {
         this.z.Z();
      }
   }
}





