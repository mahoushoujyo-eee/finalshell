package com.finalshell.task;

public class QU implements Runnable {
   public final String p;
   public final com.finalshell.ui.panel.Oj2 Q;

   public QU(com.finalshell.ui.panel.Oj2 var1, String var2) {
      this.Q = var1;
      this.p = var2;
   }

   @Override
   public void run() {
      this.Q.d.execute(new FC(this));
   }
}





