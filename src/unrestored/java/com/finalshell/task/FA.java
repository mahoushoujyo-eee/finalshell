package com.finalshell.task;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CT;
import javax.swing.SwingUtilities;

public class FA implements Runnable {
   public final CT o;
   public static long a;

   public FA(CT var1) {
      this.o = var1;
   }

   @Override
   public void run() {
      boolean var1 = Uo2.i();

      while (true) {
         Object var3 = 591504459344043173L;
         if (!Ref.getBoolean(392954843758135722L, Ref.g(591504459344043173L, var3))) {
            break;
         }

         SwingUtilities.invokeLater(new Oj4(this));

         try {
            Thread.sleep(a);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
            if (var1) {
               break;
            }
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8141341996293006600L;
      long var10002 = 8141341996293006588L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





