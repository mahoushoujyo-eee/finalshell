package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class G implements ActionListener {
   final com.Z.T f;

   G(com.Z.T var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.f.R((com.b.V)this.f.i.getSelectedItem(), false);
   }
}





