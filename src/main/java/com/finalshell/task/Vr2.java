package com.finalshell.task;

import com.finalshell.core.UD;
import com.finalshell.crypto.PingMessageR;

public class Vr2 implements Runnable {
   final PingMessageR t;
   public final UD o;

   Vr2(PingMessageR var1, UD var2) {
      this.t = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      this.o.X();
   }
}





