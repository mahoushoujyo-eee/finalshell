package com.finalshell.task;

import com.finalshell.crypto.ConnectHost;

public class WR3 implements Runnable {
   final ConnectHost A;

   WR3(ConnectHost var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      this.A.S();
   }
}





