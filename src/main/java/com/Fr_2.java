package com;

import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

class Fr_2 extends com.FY {
   final JComponent l;
   final Gi_2 W;

   Fr_2(Gi_2 var1, JComponent var2) {
      this.W = var1;
      this.l = var2;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.W.W = false;
      this.W.b.getModel().setRollover(false);
      this.W.u = 0.0F;
      this.W.F = null;
      Gi_2.F(this.W);
      this.l.repaint();
   }
}





