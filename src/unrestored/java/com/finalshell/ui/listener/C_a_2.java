package com.finalshell.ui.listener;

import com.finalshell.core.Ej2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class C_a_2 implements PropertyChangeListener {
   public final Ej2 Z;

   public C_a_2(Ej2 var1) {
      this.Z = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Ej2.X(this.Z, Ej2.P(this.Z));
   }
}





