package com.finalshell.ui.listener;

import com.finalshell.core.BX;
import com.finalshell.core.Bw2_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UQ2_2 implements ActionListener {
   final BX G;
   final com.finalshell.core.At2 J;
   final Bw2_2 B;

   UQ2_2(Bw2_2 var1, BX var2, com.finalshell.core.At2 var3) {
      this.B = var1;
      this.G = var2;
      this.J = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.G.u$boolean(this.J);
   }
}





