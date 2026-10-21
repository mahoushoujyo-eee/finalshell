package com.finalshell.ui.listener;

import com.finalshell.core.A4_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

public class R2 implements ActionListener {
   final A4_2 k;

   R2(A4_2 var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      A4_2.y(this.k, true);
      List var2 = A4_2.s(this.k).s$List();
      A4_2.n(this.k).setSelectedFiles(var2.toArray(new File[var2.size()]));
      A4_2.y(this.k, false);
      A4_2.n(this.k).approveSelection();
   }
}





