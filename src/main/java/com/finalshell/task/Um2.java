package com.finalshell.task;

import com.finalshell.core.NF;
import com.finalshell.core.Zn2;
import com.finalshell.ui.model.CB3;

public class Um2 implements Runnable {
   final CB3 o;
   final Zn2 c;

   Um2(Zn2 var1, CB3 var2) {
      this.c = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      this.c.c.w(this.o, new NF(this));
   }
}





