package com.finalshell.task;

import com.finalshell.ui.panel.Qj2;
import java.awt.Component;

public class Cu2_2 implements Runnable {
   public final Component v;
   public final Qj2 g;

   public Cu2_2(Qj2 var1, Component var2) {
      this.g = var1;
      this.v = var2;
   }

   @Override
   public void run() {
      this.g.W(this.v);
   }
}





