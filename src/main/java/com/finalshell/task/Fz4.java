package com.finalshell.task;

import com.finalshell.core.Yy4_2;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class Fz4 implements Runnable {
   final JPasswordField i;
   final Yy4_2 G;
   public static long a;

   Fz4(Yy4_2 var1, JPasswordField var2) {
      this.G = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new B32(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3403430707449283592L;
      long var10002 = 3403430707449283776L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





