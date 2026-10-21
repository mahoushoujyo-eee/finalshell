package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.DU;
import javax.swing.SwingUtilities;

public class T9 implements Runnable {
   final Yk2 O;

   T9(Yk2 var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Object var1 = 443102958901146195L;
      Ref.g(443102958901146195L, var1);
      Object var3 = 427592903543022635L;
      Ref.g(427592903543022635L, var3);
      Object var5 = 477342503026871908L;
      if (((DU)Ref.g(477342503026871908L, var5)).isVisible()) {
         SwingUtilities.invokeLater(new AQ(this));
      }
   }
}





