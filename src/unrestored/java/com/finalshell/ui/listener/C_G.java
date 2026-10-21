package com.finalshell.ui.listener;

import com.finalshell.core.Nr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_G implements ActionListener {
   public final Nr4 R;

   public C_G(Nr4 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.R.E.Q(this.R.l.isSelected());
      this.R.v();
   }
}





