package com.finalshell.ui.listener;

import com.finalshell.core.It4;
import com.finalshell.core.NJ;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class TW2 implements ContainerListener {
   final NJ S;
   final It4 R;

   TW2(It4 var1, NJ var2) {
      this.R = var1;
      this.S = var2;
   }

   @Override
   public void componentAdded(ContainerEvent var1) {
   }

   @Override
   public void componentRemoved(ContainerEvent var1) {
      if (var1.getSource() == this.R.E) {
         this.S.e();
      }
   }
}





