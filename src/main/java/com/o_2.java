package com;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

class o_2 implements HierarchyListener {
   final com.Qq_2 J;

   o_2(com.Qq_2 var1) {
      this.J = var1;
   }

   @Override
   public void hierarchyChanged(HierarchyEvent var1) {
      if (var1.getID() == 1) {
         this.J.q(false);
      }
   }
}





