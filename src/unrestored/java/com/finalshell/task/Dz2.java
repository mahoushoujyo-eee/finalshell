package com.finalshell.task;

import com.finalshell.ui.listener.Vz2;
import javax.swing.SwingUtilities;

public class Dz2 implements Runnable {
   public final int n;
   public final Vz2 V;
   public static long a;

   public Dz2(Vz2 var1, int var2) {
      this.V = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new CQ(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2401060664398434607L;
      long var10002 = 2401060664398434635L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





