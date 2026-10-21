package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Py_2 extends KeyAdapter {
   final nx_4 o;

   Py_2(nx_4 var1) {
      this.o = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var2 = nx_4.c();
      boolean var10000 = this.o.isEnabled();
      if (var2 != 0) {
         if (!var10000) {
            return;
         }

         var10000 = GR.lD.J(var1);
      }

      if (var2 != 0) {
         if (var10000) {
            this.o.x();
            if (var2 != 0) {
               return;
            }
         }

         var10000 = GR.rI.J(var1);
      }

      if (var10000) {
         this.o.j();
      }
   }
}





