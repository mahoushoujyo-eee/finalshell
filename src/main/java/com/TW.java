package com;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

class TW implements ContainerListener {
   final NJ S;
   final it_4 R;

   TW(it_4 var1, NJ var2) {
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





