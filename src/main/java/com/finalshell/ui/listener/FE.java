package com.finalshell.ui.listener;

import javax.swing.event.AncestorEvent;

public class FE extends FY {
   final com.finalshell.ui.panel.Qq2 M;

   FE(com.finalshell.ui.panel.Qq2 var1) {
      this.M = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.M.R();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.M.R();
   }
}





