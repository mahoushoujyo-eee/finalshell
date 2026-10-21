package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.Qe2_2;
import com.finalshell.ui.panel.Kz4;
import com.finalshell.ui.panel.Pb4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RJ3 implements ActionListener {
   public final Pb4 D;
   public final Qe2_2 s;
   public final Kz4 B;

   public RJ3(Kz4 var1, Pb4 var2, Qe2_2 var3) {
      this.B = var1;
      this.D = var2;
      this.s = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.B.transferFocus();
      FN.M(this.D);
      this.D.r(this.s);
   }
}





