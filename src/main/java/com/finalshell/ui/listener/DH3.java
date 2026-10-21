package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DH3 implements ActionListener {
   final HD v;

   DH3(HD var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.v.L.Y();
   }
}





