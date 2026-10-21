package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.KE3;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DM3 extends KeyAdapter {
   public final com.finalshell.core.KR p;
   public final com.finalshell.ui.panel.Kd4 h;

   public DM3(com.finalshell.ui.panel.Kd4 var1, com.finalshell.core.KR var2) {
      this.h = var1;
      this.p = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String var2 = KE3.v();
      if (var2 == null && GR.lD.J(var1)) {
         this.p.requestFocusInWindow();
      }
   }
}





