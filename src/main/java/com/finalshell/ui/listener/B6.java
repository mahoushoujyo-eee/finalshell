package com.finalshell.ui.listener;

import com.finalshell.core.IH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B6 implements ActionListener {
   public final IH C;

   public B6(IH var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.C.M();
   }
}





