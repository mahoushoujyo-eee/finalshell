package com.h;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class Y implements ActionListener {
   final JComponent S;
   final com.h.c y;

   Y(com.h.c var1, JComponent var2) {
      this.y = var1;
      this.S = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.h.c var3;
      label40: {
         boolean var2;
         var2 = com.h.K.Z();
         var10000 = com.h.c.i(this.y);
         label36:
         if (var2) {
            if (var10000 != 0) {
               var10000 = com.h.c.D(this.y);
               if (!var2) {
                  break label36;
               }

               if (var10000 < 5) {
                  com.h.c.w(this.y);
                  this.S.repaint();
                  if (var2) {
                     return;
                  }
               }
            }

            var3 = this.y;
            if (!var2) {
               break label40;
            }

            var10000 = com.h.c.i(this.y);
         }

         if (var10000 == 0) {
            var3 = this.y;
            if (!var2) {
               break label40;
            }

            if (com.h.c.D(this.y) > 0) {
               com.h.c.E(this.y);
               this.S.repaint();
               if (var2) {
                  return;
               }
            }
         }

         var3 = this.y;
      }

      com.h.c.T(var3).Y();
   }
}





