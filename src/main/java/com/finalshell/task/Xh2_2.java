package com.finalshell.task;

import com.finalshell.core.KC;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import javax.swing.SwingUtilities;

public class Xh2_2 extends Thread {
   public final KC O;

   public Xh2_2(KC var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 634156811479991088L;
         Ref.g(634156811479991088L, var2);
         Object var4 = 489572751534480599L;
         Thread.sleep((long)Registry.lookupField(341137764522313600L).getInt(Ref.g(489572751534480599L, var4)));
      } catch (InterruptedException var11) {
         var11.printStackTrace();
      }

      try {
         Object var6 = 634156811479991088L;
         Ref.g(634156811479991088L, var6);
         Object var8 = 489572751534480599L;
         if (!Registry.lookupField(532071324274744951L).getBoolean(Ref.g(489572751534480599L, var8))) {
            SwingUtilities.invokeLater(new Bv4(this));
         }
      } catch (InterruptedException var10) {
         throw a(var10);
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





