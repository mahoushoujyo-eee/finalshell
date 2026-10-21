package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K42;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XA implements ActionListener {
   public final Window T;
   public final K42 g;

   public XA(K42 var1, Window var2) {
      this.g = var1;
      this.T = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      K42.v(this.g).showOpenDialog(this.T);
      K42.L(this.g).requestFocusInWindow();
   }
}





