package com.finalshell.task;

import com.finalshell.ui.listener.Ic2;

public class CO implements Runnable {
   public final Ic2 R;

   public CO(Ic2 var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      this.R.L.d.setVisible(false);
   }
}





