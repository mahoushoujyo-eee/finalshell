package com;

class BG implements Runnable {
   final com.zM T;

   BG(com.zM var1) {
      this.T = var1;
   }

   @Override
   public void run() {
      this.T.k.repaint();
   }
}





