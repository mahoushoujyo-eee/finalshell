package com.finalshell.ui.listener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class R_2 implements ListSelectionListener {
   public final com.finalshell.ui.panel.T E;

   public R_2(com.finalshell.ui.panel.T var1) {
      this.E = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      this.E.f();
   }
}





