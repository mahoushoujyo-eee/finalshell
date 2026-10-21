package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G2 implements ActionListener {
   public final com.finalshell.ui.panel.T f;

   public G2(com.finalshell.ui.panel.T var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f.R((com.finalshell.core.V3)this.f.i.getSelectedItem(), false);
   }
}





