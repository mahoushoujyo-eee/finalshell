package com.finalshell.ui.listener;

import com.finalshell.core.Nr4;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class C_M implements PropertyChangeListener {
   public final Nr4 a;

   public C_M(Nr4 var1) {
      this.a = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.a.y();
   }
}





