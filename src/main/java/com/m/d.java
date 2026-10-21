package com.m;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class d implements TreeSelectionListener {
   final com.m.s g;

   d(com.m.s var1) {
      this.g = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.g.U();
   }
}





