package com.finalshell.ui.listener;

import com.finalshell.core.UE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O5 implements ActionListener {
   public final UE s;
   public final com.finalshell.ui.panel.N_2 U;

   public O5(com.finalshell.ui.panel.N_2 var1, UE var2) {
      this.U = var1;
      this.s = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.U.N(this.s.isSelected());
   }
}





