package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;

class el_4 extends FocusAdapter {
   final JList m;
   final wO_3 U;

   el_4(wO_3 var1, JList var2) {
      this.U = var1;
      this.m = var2;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.U.C(this.m);
   }
}





