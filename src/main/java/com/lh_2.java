package com;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class Lh_2 implements TreeSelectionListener {
   final com.kF_3 F;

   Lh_2(com.kF_3 var1) {
      this.F = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.F.V(this.F.a.N(), true, false);
   }
}





