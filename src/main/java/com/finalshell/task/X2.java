package com.finalshell.task;

import com.finalshell.core.Vn2;
import javax.swing.SwingUtilities;

public class X2 implements Runnable {
   public final Vn2 e;

   public X2(Vn2 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      SwingUtilities.invokeLater(new MF(this));
   }
}





