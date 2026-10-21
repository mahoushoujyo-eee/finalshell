package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class Lk_2 implements ActionListener {
   final File y;
   final com.kc_4 E;

   Lk_2(com.kc_4 var1, File var2) {
      this.E = var1;
      this.y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.E.m.remove(this.y);
      this.E.n();
   }
}





