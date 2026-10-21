package com;

class CO implements Runnable {
   final Ic_2 R;

   CO(Ic_2 var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      this.R.L.d.setVisible(false);
   }
}





