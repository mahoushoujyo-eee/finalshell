package com.finalshell.task;

import com.finalshell.ui.listener.KA;
import javax.swing.SwingUtilities;

public class G implements Runnable {
   public final KA V;
   public static long a;

   public G(KA var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Jb2(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 591028527190101473L;
      long var10002 = 591028527190101381L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





