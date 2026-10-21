package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CD implements ActionListener {
   final com.QS f;

   CD(com.QS var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f.V();
   }
}





