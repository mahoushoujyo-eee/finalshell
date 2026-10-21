package com.finalshell.ui.listener;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class D3 implements TreeSelectionListener {
   final com.finalshell.ui.panel.S g;

   D3(com.finalshell.ui.panel.S var1) {
      this.g = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.g.U$void();
   }
}





