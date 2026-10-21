package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KF3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class S22 implements ActionListener {
   public final File A;
   public final KF3 a;

   public S22(KF3 var1, File var2) {
      this.a = var1;
      this.A = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.V(this.A, true, true);
   }
}





