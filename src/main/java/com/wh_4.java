package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class wh_4 implements ActionListener {
   final Runnable y;

   wh_4(Runnable var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.FV.p(this.y);
   }
}





