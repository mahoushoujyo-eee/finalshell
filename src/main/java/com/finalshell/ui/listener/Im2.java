package com.finalshell.ui.listener;

import com.finalshell.core.Na4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Im2 extends MouseAdapter {
   final Na4 b;

   Im2(Na4 var1) {
      this.b = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Na4 var3;
      label24: {
         boolean var2 = Na4.e();
         int var10000 = var1.getClickCount();
         if (var2) {
            if (var10000 != 2) {
               return;
            }

            var3 = this.b;
            if (!var2) {
               break label24;
            }

            var10000 = (this.b.isEnabled()) ? 1 : 0;
         }

         if (var10000 == 0) {
            return;
         }

         this.b.Y();
         var3 = this.b;
      }

      var3.h();
   }
}





