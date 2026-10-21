package com.finalshell.task;

import com.finalshell.core.Fl4;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class Zl2 implements Runnable {
   final JPasswordField n;
   final Fl4 I;
   public static long a;

   Zl2(Fl4 var1, JPasswordField var2) {
      this.I = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Bb4(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3696381474741709159L;
      long var10002 = 3696381474741709231L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





