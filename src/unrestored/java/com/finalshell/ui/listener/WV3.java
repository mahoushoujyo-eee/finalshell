package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Co2;
import com.finalshell.ui.panel.OQ;
import java.awt.ComponentOrientation;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WV3 implements PropertyChangeListener {
   public final Co2 t;
   public final OQ P;

   public WV3(OQ var1, Co2 var2) {
      this.P = var1;
      this.t = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      ComponentOrientation var2 = this.t.getComponentOrientation();
      this.P.a.setComponentOrientation(var2);
      this.P.o.setComponentOrientation(var2);
      this.P.U.setComponentOrientation(var2);
   }
}





