package com.finalshell.task;

import com.finalshell.ui.panel.AM;
import javax.swing.SwingUtilities;

public class GE implements Runnable {
   final AM Q;
   public static long a;

   GE(AM var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
      }

      SwingUtilities.invokeLater(new YS(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4262348397449795676L;
      long var10002 = 4262348397449795732L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





