package com.finalshell.task;

import javax.swing.JTextField;

public class KT implements Runnable {
   final JTextField[] H;

   KT(JTextField[] var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      this.H[0].requestFocus();
   }
}





