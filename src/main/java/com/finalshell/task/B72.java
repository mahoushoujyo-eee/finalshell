package com.finalshell.task;

import com.finalshell.core.M6;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class B72 implements Runnable {
   public final MainFrame T;
   public final M6 F;
   public static long a;

   public B72(M6 var1, MainFrame var2) {
      this.F = var1;
      this.T = var2;
   }

   @Override
   public void run() {
      boolean var12;
      String[] var10000 = F8.y();
      long var2 = System.currentTimeMillis();
      String[] var1 = var10000;

      while (true) {
         Object var5 = 440529940248018366L;
         Ref.g(440529940248018366L, var5);
         Object var10002 = Registry.emptyArgs();
         long var8 = 404378438847958764L;
         Object var7 = var10002;
         var10002 = Ref.h(404378438847958764L, var7, var8);

         try {
            var12 = (Boolean)var10002;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         label28:
         if (!var12) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var10) {
               var10.printStackTrace();
               if (var1 == null) {
                  continue;
               }
               break label28;
            }

            if (var1 == null) {
               continue;
            }
            break;
         }

         SwingUtilities.invokeLater(new Fy4(this));
         break;
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2556498245502164036L;
      long var10002 = 2556498245502164038L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





