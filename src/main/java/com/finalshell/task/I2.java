package com.finalshell.task;

import com.finalshell.ui.listener.X1;
import javax.swing.JProgressBar;

public class I2 implements Runnable {
   public final JProgressBar q;
   public final X1 R;

   public I2(X1 var1, JProgressBar var2) {
      this.R = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      this.q.repaint();
   }
}





