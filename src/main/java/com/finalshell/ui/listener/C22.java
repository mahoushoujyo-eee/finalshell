package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C22 implements ActionListener {
   final ConnectionProperty P;

   C22(ConnectionProperty var1) {
      this.P = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.P.kj.y();
   }
}





