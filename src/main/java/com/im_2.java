package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Im_2 extends MouseAdapter {
   final na_4 b;

   Im_2(na_4 var1) {
      this.b = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      na_4 var3;
      label24: {
         boolean var2 = na_4.e();
         int var10000 = var1.getClickCount();
         if (var2) {
            if (var10000 != 2) {
               return;
            }

            var3 = this.b;
            if (!var2) {
               break label24;
            }

            var10000 = this.b.isEnabled();
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





