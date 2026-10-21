package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class I6 implements ActionListener {
   final Kz4 v;

   I6(Kz4 var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.v.X(null);
   }
}





