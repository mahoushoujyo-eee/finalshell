package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.Oj2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HZ extends KeyAdapter {
   public final Oj2 B;

   public HZ(Oj2 var1) {
      this.B = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      label16: {
         boolean var2 = Oj2.V();
         boolean var10000 = GR.lZ.J(var1);
         if (!var2) {
            if (var10000) {
               break label16;
            }

            var10000 = GR.rN.J(var1);
         }

         if (!var10000) {
            return;
         }
      }

      this.B.A();
   }
}





