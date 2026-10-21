package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CD implements ActionListener {
   final com.finalshell.ui.panel.QS f;

   CD(com.finalshell.ui.panel.QS var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f.V();
   }
}





