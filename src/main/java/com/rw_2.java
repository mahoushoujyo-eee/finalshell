package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Rw_2 implements ActionListener {
   final EX U;
   final com.kD_3 x;
   private static final long a;

   Rw_2(com.kD_3 var1, EX var2) {
      this.x = var1;
      this.U = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.U.setValue((int)a);
   }

   static {
      long var0 = 8229549093471946858L;
      long var10002 = 2772536876090296394L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





