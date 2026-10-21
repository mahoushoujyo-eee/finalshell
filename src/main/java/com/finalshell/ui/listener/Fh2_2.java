package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Wd2;
import javax.swing.event.AncestorEvent;

public class Fh2_2 extends FY {
   public final Wd2 t;

   public Fh2_2(Wd2 var1) {
      this.t = var1;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.t.j$void();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.t.j$void();
   }
}





