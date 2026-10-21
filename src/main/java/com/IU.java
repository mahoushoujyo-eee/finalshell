package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IU implements ActionListener {
   final _y_2 Y;
   final com.Bq_2 z;

   IU(com.Bq_2 var1, _y_2 var2) {
      this.z = var1;
      this.Y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Y.w();
   }
}





