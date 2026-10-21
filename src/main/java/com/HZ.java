package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class HZ extends KeyAdapter {
   final com.Oj_2 B;

   HZ(com.Oj_2 var1) {
      this.B = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      label16: {
         boolean var2 = com.Oj_2.V();
         boolean var10000 = GR.lZ.J(var1);
         if (!var2) {
            if (var10000) {
               break label16;
            }

            var10000 = GR.rN.J(var1);
         }

         if (!var10000) {
            return;
         }
      }

      this.B.A();
   }
}





