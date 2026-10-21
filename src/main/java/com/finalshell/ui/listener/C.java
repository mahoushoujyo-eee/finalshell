package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Ki4;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class C extends ContainerAdapter {
   public final Ki4 K;
   public final com.finalshell.core.I z;

   public C(com.finalshell.core.I var1, Ki4 var2) {
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





