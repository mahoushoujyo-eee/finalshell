package com.finalshell.ui.listener;

import com.finalshell.core.C_c_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WM3 implements PropertyChangeListener {
   public final C_c_2 j;

   public WM3(C_c_2 var1) {
      this.j = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.j.h();
   }
}





