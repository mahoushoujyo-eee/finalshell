package com.Z;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class c_2 implements ListSelectionListener {
   final com.Z.T D;

   c_2(com.Z.T var1) {
      this.D = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      this.D.f();
   }
}





