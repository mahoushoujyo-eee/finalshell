package com.finalshell.task;

import com.finalshell.core.WC_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XZ3 implements Runnable {
   final ActionListener U;
   final ActionEvent b;
   final WC_2 h;

   XZ3(WC_2 var1, ActionListener var2, ActionEvent var3) {
      this.h = var1;
      this.U = var2;
      this.b = var3;
   }

   @Override
   public void run() {
      this.U.actionPerformed(this.b);
   }
}





