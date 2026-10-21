package com.Z;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class r_2 implements ListSelectionListener {
   final com.Z.T E;

   r_2(com.Z.T var1) {
      this.E = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      this.E.f();
   }
}





