package com.finalshell.task;

import com.finalshell.core.Wc2;
import java.awt.event.KeyEvent;

public class KL3 implements Runnable {
   final Wc2 k;
   final KeyEvent D;

   KL3(Wc2 var1, KeyEvent var2) {
      this.k = var1;
      this.D = var2;
   }

   @Override
   public void run() {
      this.k.j(this.D);
   }
}





