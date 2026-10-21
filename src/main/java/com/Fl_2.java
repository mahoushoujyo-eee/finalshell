package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Fl_2 implements ActionListener {
   final _n_2 y;

   Fl_2(_n_2 var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      _n_2 var3;
      label40: {
         int var2;
         var2 = _n_2.G();
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
                  _n_2.a(this.y).repaint();
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
               _n_2.l(this.y).repaint();
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





