package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Oj2;
import javax.swing.event.AncestorEvent;

public class Fe2 extends FY {
   final Oj2 d;

   Fe2(Oj2 var1) {
      this.d = var1;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.d.f(false);
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.d.f(false);
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.d.f(false);
   }
}





