package com;

import java.awt.Component;

class Cu_2 implements Runnable {
   final Component v;
   final com.Qj_2 g;

   Cu_2(com.Qj_2 var1, Component var2) {
      this.g = var1;
      this.v = var2;
   }

   @Override
   public void run() {
      this.g.W(this.v);
   }
}





