package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Bq_2;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class H9 extends KeyAdapter {
   public final ConnectionProperty g;
   public final Bq_2 z;
   public static long a;

   public H9(Bq_2 var1, ConnectionProperty var2) {
      this.z = var1;
      this.g = var2;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      label16: {
         int var2 = ConnectionProperty.M$int();
         if (var2 != 0) {
            if (var1.getKeyCode() != (int)a) {
               break label16;
            }

            this.g.w();
         }

         if (var2 != 0) {
            return;
         }
      }

      super.keyPressed(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6001192819066693146L;
      long var10002 = -6624545575447009791L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





