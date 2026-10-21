package com.finalshell.ui.listener;

import com.finalshell.core.A2_2;
import com.finalshell.core.Qx2;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class X2 extends ContainerAdapter {
   final Qx2 O;
   final A2_2 b;

   X2(A2_2 var1, Qx2 var2) {
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





