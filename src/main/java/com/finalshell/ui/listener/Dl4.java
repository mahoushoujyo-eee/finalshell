package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ButtonModel;
import javax.swing.JMenuItem;

public class Dl4 implements PropertyChangeListener {
   final XN z;
   final JMenuItem u;

   Dl4(XN var1, JMenuItem var2) {
      this.z = var1;
      this.u = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      ((ButtonModel)var1.getOldValue()).removeChangeListener(this.z);
      this.u.getModel().addChangeListener(this.z);
   }
}





