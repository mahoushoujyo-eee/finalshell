package com.finalshell.task;

import com.finalshell.core.XQ_2;

public class Jn2 implements Runnable {
   public final XQ_2 p;
   public final String t;

   public Jn2(XQ_2 var1, String var2) {
      this.p = var1;
      this.t = var2;
   }

   @Override
   public void run() {
      this.p.Q.remove(this.t);
   }
}





