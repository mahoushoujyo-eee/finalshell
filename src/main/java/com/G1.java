package com;

import java.awt.RenderingHints;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.v.fr_2;

class G1 implements PropertyChangeListener {
   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      com.ky_4[] var2 = fr_2.M();
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





