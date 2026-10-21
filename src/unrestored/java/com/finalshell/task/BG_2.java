package com.finalshell.task;

import com.finalshell.ui.listener.ZM;

public class BG_2 implements Runnable {
   public final ZM T;

   public BG_2(ZM var1) {
      this.T = var1;
   }

   @Override
   public void run() {
      this.T.k.repaint();
   }
}





