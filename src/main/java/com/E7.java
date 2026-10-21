package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class E7 implements ActionListener {
   final File M;
   final com.kz_4 h;

   E7(com.kz_4 var1, File var2) {
      this.h = var1;
      this.M = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.h.X(this.M);
   }
}





