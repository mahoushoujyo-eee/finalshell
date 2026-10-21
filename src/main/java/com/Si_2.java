package com;

import java.awt.Component;

class Si_2 implements Runnable {
   final Component z;
   final com.Qj_2 s;

   Si_2(com.Qj_2 var1, Component var2) {
      this.s = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      this.s.W(this.z);
   }
}





