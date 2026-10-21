package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.OG;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NZ3 extends KeyAdapter {
   public final OG t;

   public NZ3(OG var1) {
      this.t = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      boolean var10000;
      Ky4[] var2 = OG.P();
      var10000 = this.t.isEnabled();
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

         OG.s(this.t, true);
      }

      this.t.repaint();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      boolean var10000;
      OG var3;
      label32: {
         Ky4[] var2;
         var2 = OG.P();
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

            OG.s(this.t, false);
            var3 = this.t;
            if (var2 == null) {
               break label32;
            }

            var10000 = this.t.isEnabled();
         }

         if (var10000) {
            this.t.I$void();
            if (var2 != null) {
               return;
            }
         }

         var3 = this.t;
      }

      var3.repaint();
   }
}





