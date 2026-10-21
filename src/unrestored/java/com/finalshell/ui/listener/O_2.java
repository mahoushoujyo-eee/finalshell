package com.finalshell.ui.listener;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

public class O_2 implements HierarchyListener {
   public final com.finalshell.ui.panel.Qq2 J;

   public O_2(com.finalshell.ui.panel.Qq2 var1) {
      this.J = var1;
   }

   @Override
   public void hierarchyChanged(HierarchyEvent var1) {
      if (var1.getID() == 1) {
         this.J.q(false);
      }
   }
}





