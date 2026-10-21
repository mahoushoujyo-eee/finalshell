package com.finalshell.ui.listener;

import com.finalshell.core.Nr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TE implements ActionListener {
   final Nr4 T;

   TE(Nr4 var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.T.E.u(this.T.v.isSelected());
      this.T.v();
   }
}





