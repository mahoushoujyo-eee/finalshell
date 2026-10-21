package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K42;
import com.finalshell.ui.panel.Kk4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class C_g_2 implements ActionListener {
   public final K42 q;
   public final File T;
   public final Kk4 E;

   public C_g_2(Kk4 var1, K42 var2, File var3) {
      this.E = var1;
      this.q = var2;
      this.T = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      K42.y(this.E.E).remove(this.T);
      K42.g(this.E.E).remove(this.E);
      this.E.E.revalidate();
      this.E.E.repaint();
      K42.b(this.E.E, K42.y(this.E.E));
   }
}





