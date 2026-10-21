package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.core.W22;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

public class Xo4 extends KeyAdapter {
   public final JList F;
   public final W22 C;

   public Xo4(W22 var1, JList var2) {
      this.C = var1;
      this.F = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (GR.lR.J(var1)) {
         this.C.N(this.F, this.F.getSelectedIndex());
      }
   }
}





