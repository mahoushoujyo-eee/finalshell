package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T1 implements ActionListener {
   final ConnectionProperty S;

   T1(ConnectionProperty var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.S.kj.v$void();
   }
}





