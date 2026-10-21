package com.finalshell.task;

import com.finalshell.core.XQ_2;

public class O5 implements Runnable {
   final XQ_2 w;
   public final String r;

   O5(XQ_2 var1, String var2) {
      this.w = var1;
      this.r = var2;
   }

   @Override
   public void run() {
      this.w.s.remove(this.r);
   }
}





