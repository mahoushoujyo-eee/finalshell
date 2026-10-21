package com.finalshell.ui.listener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class C_2 implements ListSelectionListener {
   public final com.finalshell.ui.panel.T D;

   public C_2(com.finalshell.ui.panel.T var1) {
      this.D = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      this.D.f();
   }
}





