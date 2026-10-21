package com.finalshell.ui.listener;

import com.finalshell.core.Fr2_2;
import com.finalshell.core.GO;
import com.finalshell.ui.panel.Ky4;
import java.awt.RenderingHints;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class G1 implements PropertyChangeListener {
   G1() {
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Ky4[] var2 = Fr2_2.M();
      Object var10000 = var1.getNewValue();
      if (var2 != null) {
         if (!(var10000 instanceof RenderingHints)) {
            return;
         }

         var10000 = var1.getNewValue();
      }

      GO.e = (RenderingHints)var10000;
   }
}





