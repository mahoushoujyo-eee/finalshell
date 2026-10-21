package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.K32;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RQ extends KeyAdapter {
   public final K32 t;

   public RQ(K32 var1) {
      this.t = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int[] var2 = K32.L$arrint();
      if (var2 != null && (GR.lZ.J(var1) || var2 != null && GR.rN.J(var1))) {
         this.t.q$boolean();
      }
   }
}





