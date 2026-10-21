package com.finalshell.task;

import com.finalshell.ui.panel.Qj2;
import java.awt.Component;

public class Si2 implements Runnable {
   public final Component z;
   public final Qj2 s;

   public Si2(Qj2 var1, Component var2) {
      this.s = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      this.s.W(this.z);
   }
}





