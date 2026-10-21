package com.finalshell.ui.listener;

import com.finalshell.core.DP_2;
import com.finalshell.task.Iq4;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;

public class Ec2 implements PropertyChangeListener {
   public final DP_2 X;

   public Ec2(DP_2 var1) {
      this.X = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      SwingUtilities.invokeLater(new Iq4(this));
   }
}





