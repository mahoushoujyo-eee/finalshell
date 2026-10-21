package com.finalshell.task;

public class Ke2 implements Runnable {
   public final String T;
   public final com.finalshell.ui.panel.Oj2 j;

   public Ke2(com.finalshell.ui.panel.Oj2 var1, String var2) {
      this.j = var1;
      this.T = var2;
   }

   @Override
   public void run() {
      this.j.d.execute(new ZA(this));
   }
}





