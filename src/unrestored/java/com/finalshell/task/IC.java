package com.finalshell.task;

import com.finalshell.ui.panel.KD3;

public class IC implements Runnable {
   public final KD3 Y;

   public IC(KD3 var1) {
      this.Y = var1;
   }

   @Override
   public void run() {
      KD3.n(this.Y, true);
   }
}





