package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class v_2 implements ActionListener {
   final com.Z.T d;

   v_2(com.Z.T var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.d.h(var1);
   }
}





