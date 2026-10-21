package com.finalshell.task;

import com.finalshell.core.Yy4_2;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class Qv2 implements Runnable {
   final JPasswordField J;
   final Yy4_2 a;
   public static long b;

   Qv2(Yy4_2 var1, JPasswordField var2) {
      this.a = var1;
      this.J = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(b);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new OL(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5184639206001186526L;
      long var10002 = 5184639206001186326L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





