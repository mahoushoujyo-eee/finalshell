package com.finalshell.ui.listener;

import javax.swing.event.AncestorEvent;

public class Fy2 extends FY {
   public final com.finalshell.ui.panel.Qq2 U;

   public Fy2(com.finalshell.ui.panel.Qq2 var1) {
      this.U = var1;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.U.q(false);
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.U.R();
   }
}





