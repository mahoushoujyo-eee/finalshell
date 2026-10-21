package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class L_2 implements PropertyChangeListener {
   public final Ky4 M;
   public final com.finalshell.ui.panel.T U;

   public L_2(com.finalshell.ui.panel.T var1, Ky4 var2) {
      this.U = var1;
      this.M = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.U.I.setPreferredSize(null);
      this.U.a.setPreferredSize(null);
      this.U.I.p(this.U.I.getText());
      this.U.a.p(this.U.a.getText());
      FN.b(new Component[]{this.U.I, this.U.a});
      this.M.revalidate();
   }
}





