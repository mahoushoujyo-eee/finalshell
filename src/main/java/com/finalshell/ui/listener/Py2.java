package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.core.Nx4;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Py2 extends KeyAdapter {
   public final Nx4 o;

   public Py2(Nx4 var1) {
      this.o = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var2 = Nx4.c$int();
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





