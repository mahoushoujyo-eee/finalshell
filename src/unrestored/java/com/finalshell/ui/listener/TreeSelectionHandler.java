package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KF3;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class TreeSelectionHandler implements TreeSelectionListener {
   public final KF3 F;

   public TreeSelectionHandler(KF3 var1) {
      this.F = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.F.V(this.F.a.N(), true, false);
   }
}





