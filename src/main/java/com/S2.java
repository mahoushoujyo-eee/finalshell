package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class S2 implements ActionListener {
   final File A;
   final com.kF_3 a;

   S2(com.kF_3 var1, File var2) {
      this.a = var1;
      this.A = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.V(this.A, true, true);
   }
}





