package com.finalshell.ui.listener;

import com.finalshell.core.Fm2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class N02 implements PropertyChangeListener {
   final Fm2 A;

   N02(Fm2 var1) {
      this.A = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.A.I.a(this.A.U.isEnabled());
   }
}





