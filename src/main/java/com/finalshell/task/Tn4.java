package com.finalshell.task;

import com.finalshell.core.Fl4;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class Tn4 implements Runnable {
   final JPasswordField b;
   final Fl4 R;
   public static long a;

   Tn4(Fl4 var1, JPasswordField var2) {
      this.R = var1;
      this.b = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Yw2(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8891621449729358866L;
      long var10002 = 8891621449729359066L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





