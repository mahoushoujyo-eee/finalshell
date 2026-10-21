package com.h;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class a implements ActionListener {
   final com.h.c f;

   a(com.h.c var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.h.c var3;
      label40: {
         boolean var2;
         var2 = com.h.K.V();
         var10000 = com.h.c.P(this.f);
         label36:
         if (!var2) {
            if (var10000 != 0) {
               var10000 = com.h.c.C(this.f);
               if (var2) {
                  break label36;
               }

               if (var10000 < com.h.c.S.size() - 1) {
                  com.h.c.N(this.f);
                  com.h.c.T(this.f).repaint();
                  if (!var2) {
                     return;
                  }
               }
            }

            var3 = this.f;
            if (var2) {
               break label40;
            }

            var10000 = com.h.c.P(this.f);
         }

         if (var10000 == 0) {
            var3 = this.f;
            if (var2) {
               break label40;
            }

            if (com.h.c.C(this.f) > 0) {
               com.h.c.B(this.f);
               com.h.c.T(this.f).repaint();
               if (!var2) {
                  return;
               }
            }
         }

         var3 = this.f;
      }

      com.h.c.t(var3).Y();
   }
}





