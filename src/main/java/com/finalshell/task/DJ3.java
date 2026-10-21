package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CE;
import javax.swing.SwingUtilities;

public class DJ3 implements Runnable {
   final CE x;
   public static long a;

   DJ3(CE var1) {
      this.x = var1;
   }

   @Override
   public void run() {
      int[] var1 = CE.S$arrint();

      while (true) {
         Object var3 = 253496364775430961L;
         if (!Registry.lookupField(209317155687574257L).getBoolean(Ref.g(253496364775430961L, var3))) {
            break;
         }

         SwingUtilities.invokeLater(new Gl2_2(this));

         try {
            Thread.sleep(a);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
            if (var1 == null) {
               break;
            }
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6082190871435017201L;
      long var10002 = 6082190871435016709L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





