package com.finalshell.ui.listener;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class A extends ContainerAdapter {
   final com.finalshell.core.KR f;
   final com.finalshell.core.X e;

   A(com.finalshell.core.X var1, com.finalshell.core.KR var2) {
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





