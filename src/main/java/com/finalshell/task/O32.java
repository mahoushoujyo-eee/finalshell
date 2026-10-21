package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.TO;
import javax.swing.SwingUtilities;

public class O32 implements Runnable {
   final int d;
   final int u;
   final TO E;

   O32(TO var1, int var2, int var3) {
      this.E = var1;
      this.d = var2;
      this.u = var3;
   }

   @Override
   public void run() {
      try {
         Object var2 = 623978626682822626L;
         Ref.g(623978626682822626L, var2);
         Object var4 = 396507593444187971L;
         Thread.sleep((long)Registry.lookupField(304927446900442607L).getInt(Ref.g(396507593444187971L, var4)));
      } catch (InterruptedException var11) {
         var11.printStackTrace();
      }

      try {
         Object var6 = 623978626682822626L;
         Ref.g(623978626682822626L, var6);
         Object var8 = 396507593444187971L;
         if (!Registry.lookupField(425527513845441827L).getBoolean(Ref.g(396507593444187971L, var8))) {
            SwingUtilities.invokeLater(new Uv4(this));
         }
      } catch (InterruptedException var10) {
         throw a(var10);
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





