package com.finalshell.task;

public class Ke2 implements Runnable {
   final String T;
   final com.finalshell.ui.panel.Oj2 j;

   Ke2(com.finalshell.ui.panel.Oj2 var1, String var2) {
      this.j = var1;
      this.T = var2;
   }

   @Override
   public void run() {
      this.j.d.execute(new ZA(this));
   }
}





