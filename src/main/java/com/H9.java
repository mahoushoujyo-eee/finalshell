package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class H9 extends KeyAdapter {
   final _y_2 g;
   final com.Bq_2 z;
   private static final long a;

   H9(com.Bq_2 var1, _y_2 var2) {
      this.z = var1;
      this.g = var2;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      label16: {
         int var2 = _y_2.M();
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
      long var0 = 6001192819066693146L;
      long var10002 = -6624545575447009791L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





