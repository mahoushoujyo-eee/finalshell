package com.finalshell.task;

import com.finalshell.core.Cd2;

public class Tu2 implements Runnable {
   final V v;
   public final Cd2 S;

   Tu2(V var1, Cd2 var2) {
      this.v = var1;
      this.S = var2;
   }

   @Override
   public void run() {
      this.S.q.k(this.S.S);
   }
}





