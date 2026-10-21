package com.finalshell.ui.listener;

import com.finalshell.core.WO3;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;

public class El4 extends FocusAdapter {
   final JList m;
   final WO3 U;

   El4(WO3 var1, JList var2) {
      this.U = var1;
      this.m = var2;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.U.C(this.m);
   }
}





