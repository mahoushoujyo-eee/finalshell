package com.finalshell.ui.listener;

import com.finalshell.core.Nr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_G implements ActionListener {
   final Nr4 R;

   C_G(Nr4 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.R.E.Q(this.R.l.isSelected());
      this.R.v();
   }
}





