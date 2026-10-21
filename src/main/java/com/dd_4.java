package com;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class dd_4 implements TreeSelectionListener {
   final com.kF_3 U;

   dd_4(com.kF_3 var1) {
      this.U = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.U.e();
   }
}





