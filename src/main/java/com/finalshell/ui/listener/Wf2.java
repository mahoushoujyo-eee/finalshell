package com.finalshell.ui.listener;

import com.finalshell.core.Nr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wf2 implements ActionListener {
   public final Nr4 t;

   public Wf2(Nr4 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.t.E.I(this.t.F.isSelected());
      this.t.v();
   }
}





