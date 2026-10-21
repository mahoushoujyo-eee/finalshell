package com.finalshell.task;

import javax.swing.JTextField;

public class KT implements Runnable {
   public final JTextField[] H;

   public KT(JTextField[] var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      this.H[0].requestFocus();
   }
}





