package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.CC;
import com.finalshell.ui.panel.Co2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class XR extends KeyAdapter {
   public final CC q;

   public XR(CC var1) {
      this.q = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String var2 = Co2.U$String();
      int var10000 = (GR.rN.J(var1)) ? 1 : 0;
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.q.getSelectedIndex();
      }

      label41: {
         if (var2 != null) {
            if (var10000 == -1) {
               return;
            }

            var7 = this.q;
            if (var2 == null) {
               break label41;
            }

            var10000 = (this.q.isEnabled()) ? 1 : 0;
         }

         if (var10000 == 0) {
            return;
         }

         var7 = this.q;
      }

      for (int var6 : var7.getSelectedIndices()) {
         this.q.x(var6);
         if (var2 == null) {
            break;
         }
      }
   }
}





