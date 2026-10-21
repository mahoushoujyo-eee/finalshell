package com.finalshell.task;

import com.finalshell.crypto.ConnectHost;

public class WR3 implements Runnable {
   public final ConnectHost A;

   public WR3(ConnectHost var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      this.A.S();
   }
}





