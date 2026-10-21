package com;

import javax.swing.JProgressBar;

class I2 implements Runnable {
   final JProgressBar q;
   final X1 R;

   I2(X1 var1, JProgressBar var2) {
      this.R = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      this.q.repaint();
   }
}





