package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.core.Nr4;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ik2 extends KeyAdapter {
   public final Nr4 Q;

   public Ik2(Nr4 var1) {
      this.Q = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (GR.lD.J(var1)) {
         this.Q.g();
      }
   }
}





