package com.finalshell.task;

import com.finalshell.ui.model.CY3;
import com.finalshell.ui.panel.U22;
import java.io.File;

public class A5_2 implements Runnable {
   final File g;
   final U22 r;

   A5_2(U22 var1, File var2) {
      this.r = var1;
      this.g = var2;
   }

   @Override
   public void run() {
      CY3 var1 = this.r.d(this.g);
      if (var1 != null) {
         this.r.b(var1);
      }
   }
}





