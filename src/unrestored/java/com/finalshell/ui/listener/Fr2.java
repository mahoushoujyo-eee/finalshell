package com.finalshell.ui.listener;

import com.finalshell.core.Gi2;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

public class Fr2 extends FY {
   public final JComponent l;
   public final Gi2 W;

   public Fr2(Gi2 var1, JComponent var2) {
      this.W = var1;
      this.l = var2;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.W.W = false;
      this.W.b.getModel().setRollover(false);
      this.W.u = 0.0F;
      this.W.F = null;
      Gi2.F(this.W);
      this.l.repaint();
   }
}





