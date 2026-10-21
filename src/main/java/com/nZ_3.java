package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class nZ_3 extends KeyAdapter {
   final com.OG t;

   nZ_3(com.OG var1) {
      this.t = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      com.ky_4[] var2 = com.OG.P();
      boolean var10000 = this.t.isEnabled();
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = GR.rN.J(var1);
      }

      label21:
      if (var2 != null) {
         if (!var10000) {
            var10000 = GR.lZ.J(var1);
            if (var2 == null) {
               break label21;
            }

            if (!var10000) {
               return;
            }
         }

         com.OG.s(this.t, true);
      }

      this.t.repaint();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      com.OG var3;
      label32: {
         com.ky_4[] var2;
         var2 = com.OG.P();
         var10000 = GR.rN.J(var1);
         label28:
         if (var2 != null) {
            if (!var10000) {
               var10000 = GR.lZ.J(var1);
               if (var2 == null) {
                  break label28;
               }

               if (!var10000) {
                  return;
               }
            }

            com.OG.s(this.t, false);
            var3 = this.t;
            if (var2 == null) {
               break label32;
            }

            var10000 = this.t.isEnabled();
         }

         if (var10000) {
            this.t.I();
            if (var2 != null) {
               return;
            }
         }

         var3 = this.t;
      }

      var3.repaint();
   }
}





