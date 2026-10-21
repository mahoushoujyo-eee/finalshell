package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class xZ_3 implements Runnable {
   final ActionListener U;
   final ActionEvent b;
   final com.WC h;

   xZ_3(com.WC var1, ActionListener var2, ActionEvent var3) {
      this.h = var1;
      this.U = var2;
      this.b = var3;
   }

   @Override
   public void run() {
      this.U.actionPerformed(this.b);
   }
}





