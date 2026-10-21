package com.finalshell.task;

import com.finalshell.ui.dialog.Xw2;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class DY3 implements Runnable {
   public final JScrollPane G;
   public final Xw2 w;
   public static long a;

   public DY3(Xw2 var1, JScrollPane var2) {
      this.w = var1;
      this.G = var2;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      SwingUtilities.invokeLater(new Lo2(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4400891631342927584L;
      long var10002 = 4400891631342927400L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





