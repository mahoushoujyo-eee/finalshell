package com.finalshell.task;

import com.finalshell.ui.panel.ConnectionProperty;

public class X implements Runnable {
   final ConnectionProperty h;

   X(ConnectionProperty var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      this.h.h$void();
   }
}





