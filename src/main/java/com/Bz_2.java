package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Bz_2 implements ActionListener {
   final com.Bq_2 f;

   Bz_2(com.Bq_2 var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f.f();
   }
}





