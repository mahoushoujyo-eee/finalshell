package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A3 implements ActionListener {
   final ConnectionProperty z;

   A3(ConnectionProperty var1) {
      this.z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.z.kj.b(false, true);
   }
}





