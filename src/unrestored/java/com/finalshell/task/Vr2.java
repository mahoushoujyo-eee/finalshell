package com.finalshell.task;

import com.finalshell.core.UD;
import com.finalshell.crypto.PingMessageReceiver;

public class Vr2 implements Runnable {
   public final PingMessageReceiver t;
   public final UD o;

   public Vr2(PingMessageReceiver var1, UD var2) {
      this.t = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      this.o.X();
   }
}





