package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;

class Ec_2 implements PropertyChangeListener {
   final com.DP X;

   Ec_2(com.DP var1) {
      this.X = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      SwingUtilities.invokeLater(new iq_4(this));
   }
}





