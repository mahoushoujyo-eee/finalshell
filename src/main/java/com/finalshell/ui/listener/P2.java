package com.finalshell.ui.listener;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class P2 extends ContainerAdapter {
   final com.finalshell.ui.panel.Ov2 t;
   final com.finalshell.core.J_2 N;

   P2(com.finalshell.core.J_2 var1, com.finalshell.ui.panel.Ov2 var2) {
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





