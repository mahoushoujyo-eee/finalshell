package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.core.WO3;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

public class HW extends KeyAdapter {
   final JList m;
   final WO3 u;

   HW(WO3 var1, JList var2) {
      this.u = var1;
      this.m = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (GR.lR.J(var1)) {
         this.u.N(this.m, this.m.getSelectedIndex());
      }
   }
}





