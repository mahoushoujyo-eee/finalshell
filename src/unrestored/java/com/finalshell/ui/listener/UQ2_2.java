package com.finalshell.ui.listener;

import com.finalshell.core.BX;
import com.finalshell.core.Bw2_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UQ2_2 implements ActionListener {
   public final BX G;
   public final com.finalshell.core.At2 J;
   public final Bw2_2 B;

   public UQ2_2(Bw2_2 var1, BX var2, com.finalshell.core.At2 var3) {
      this.B = var1;
      this.G = var2;
      this.J = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.G.u$boolean(this.J);
   }
}





