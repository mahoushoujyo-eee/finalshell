package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KF3;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class Dd4 implements TreeSelectionListener {
   final KF3 U;

   Dd4(KF3 var1) {
      this.U = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.U.e();
   }
}





