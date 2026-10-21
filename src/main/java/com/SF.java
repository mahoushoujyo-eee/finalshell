package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class SF implements ActionListener {
   final File G;
   final com.kz_4 h;

   SF(com.kz_4 var1, File var2) {
      this.h = var1;
      this.G = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.h.X(this.G);
   }
}





