package com.finalshell.task;

import com.finalshell.connection.DelayedAckSACK;

public class Th2 extends Thread {
   final DelayedAckSACK m;

   Th2(DelayedAckSACK var1) {
      this.m = var1;
   }

   @Override
   public void run() {
      this.m.i(this.m.g, this.m.F + 1);
   }
}





