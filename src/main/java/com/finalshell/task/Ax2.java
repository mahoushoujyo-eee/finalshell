package com.finalshell.task;

import com.finalshell.core.TM;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import javax.swing.SwingUtilities;

public class Ax2 extends Thread {
   public final TM i;

   public Ax2(TM var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 167340028826152955L;
         Ref.g(167340028826152955L, var2);
         Object var4 = 123645524365861271L;
         Thread.sleep((long)Registry.lookupField(506455871704714368L).getInt(Ref.g(123645524365861271L, var4)));
      } catch (InterruptedException var11) {
         var11.printStackTrace();
      }

      try {
         Object var6 = 167340028826152955L;
         Ref.g(167340028826152955L, var6);
         Object var8 = 123645524365861271L;
         if (!Registry.lookupField(281199022400540961L).getBoolean(Ref.g(123645524365861271L, var8))) {
            SwingUtilities.invokeLater(new Tw2(this));
         }
      } catch (InterruptedException var10) {
         throw a(var10);
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





