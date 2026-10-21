package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class Ur_2 extends KeyAdapter {
   final Ic2 k;

   Ur_2(Ic2 var1) {
      this.k = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (GR.lZ.J(var1)) {
         Ic2.i(this.k, (File)Ic2.g(this.k).getSelectedValue());
      }
   }
}





