package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class Kz_2 implements ActionListener {
   final File O;
   final com.kz_4 c;

   Kz_2(com.kz_4 var1, File var2) {
      this.c = var1;
      this.O = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.c.X(this.O);
   }
}





