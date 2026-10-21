package com.finalshell.ui.listener;

import com.finalshell.core.Cz2;
import com.finalshell.ui.panel.KF3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C2_2 implements ActionListener {
   final KF3 O;

   C2_2(KF3 var1) {
      this.O = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.O.V(Cz2.x$File(), true, true);
   }
}





