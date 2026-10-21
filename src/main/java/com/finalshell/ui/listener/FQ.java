package com.finalshell.ui.listener;

import com.finalshell.core.Ac2;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

public class FQ extends FY {
   final JComponent L;
   final com.finalshell.ui.panel.Kd4 I;

   FQ(com.finalshell.ui.panel.Kd4 var1, JComponent var2) {
      this.I = var1;
      this.L = var2;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      Ac2.o(this.L);
   }
}





