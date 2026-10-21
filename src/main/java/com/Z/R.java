package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

class R implements ActionListener {
   final com.Z.A k;

   R(com.Z.A var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.Z.A.y(this.k, true);
      List var2 = com.Z.A.s(this.k).s();
      com.Z.A.n(this.k).setSelectedFiles(var2.toArray(new File[var2.size()]));
      com.Z.A.y(this.k, false);
      com.Z.A.n(this.k).approveSelection();
   }
}





