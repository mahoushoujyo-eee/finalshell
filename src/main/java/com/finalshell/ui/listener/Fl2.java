package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fl2 implements ActionListener {
   public final com.finalshell.core.N2 y;

   public Fl2(com.finalshell.core.N2 var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.core.N2 var3;
      label40: {
         int var2;
         var2 = com.finalshell.core.N2.G$int();
         var10000 = this.y.y;
         label36:
         if (var2 == 0) {
            if (this.y.y) {
               var10000 = this.y.B;
               if (var2 != 0) {
                  break label36;
               }

               if (this.y.B < 5) {
                  this.y.B++;
                  com.finalshell.core.N2.a(this.y).repaint();
                  if (var2 == 0) {
                     return;
                  }
               }
            }

            var3 = this.y;
            if (var2 != 0) {
               break label40;
            }

            var10000 = this.y.y;
         }

         if (var10000 == 0) {
            var3 = this.y;
            if (var2 != 0) {
               break label40;
            }

            if (this.y.B > 0) {
               this.y.B--;
               com.finalshell.core.N2.l(this.y).repaint();
               if (var2 == 0) {
                  return;
               }
            }
         }

         var3 = this.y;
      }

      var3.v.Y();
   }
}





