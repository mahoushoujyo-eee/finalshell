package com;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

class wI_3 implements AncestorListener {
   final com.lk_4 R;

   wI_3(com.lk_4 var1) {
      this.R = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.R.C();
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.R.C();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.R.C();
   }
}





