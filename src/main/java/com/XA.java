package com;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class XA implements ActionListener {
   final Window T;
   final com.k4_2 g;

   XA(com.k4_2 var1, Window var2) {
      this.g = var1;
      this.T = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.k4_2.v(this.g).showOpenDialog(this.T);
      com.k4_2.L(this.g).requestFocusInWindow();
   }
}





