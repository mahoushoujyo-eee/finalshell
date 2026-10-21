package com.finalshell.task;

import com.finalshell.ui.panel.KF3;
import java.io.File;

public class Q3 implements Runnable {
   final File x;
   final KF3 D;

   Q3(KF3 var1, File var2) {
      this.D = var1;
      this.x = var2;
   }

   @Override
   public void run() {
      this.D.a.removeTreeSelectionListener(this.D.u);
      this.D.a.s(this.D.a.d(this.x));
      this.D.a.addTreeSelectionListener(this.D.u);
   }
}





