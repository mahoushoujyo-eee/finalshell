package com.finalshell.task;

import com.finalshell.ui.panel.Bq2;
import javax.swing.SwingUtilities;

public class Di2 implements Runnable {
   final Bq2 q;
   public static long a;

   Di2(Bq2 var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      int var1 = (int)a;

      try {
         Thread.sleep((long)var1);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      SwingUtilities.invokeLater(new Yx4(this, var1));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4738022423121376192L;
      long var10002 = -3096284184352902236L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





