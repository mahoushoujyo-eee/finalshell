package com.finalshell.ui.listener;

import com.finalshell.ui.panel.CI;
import com.finalshell.ui.panel.Pb4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class M7 extends MouseAdapter {
   public final CI v;
   public final Pb4 H;
   public final I_2 T;

   public M7(I_2 var1, CI var2, Pb4 var3) {
      this.T = var1;
      this.v = var2;
      this.H = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.T.f.a(this.v.getSelectedIndex());
      this.H.setVisible(false);
   }
}





