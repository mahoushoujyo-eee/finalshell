package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.dialog.DK;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class K5 implements PropertyChangeListener {
   final Ky4 v;
   final DK z;

   K5(DK var1, Ky4 var2) {
      this.z = var1;
      this.v = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.z.j.setPreferredSize(null);
      this.z.L.setPreferredSize(null);
      FN.b(new Component[]{this.z.j, this.z.L});
      this.v.revalidate();
   }
}





