package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class _g_2 implements ActionListener {
   final com.k4_2 q;
   final File T;
   final com.kk_4 E;

   _g_2(com.kk_4 var1, com.k4_2 var2, File var3) {
      this.E = var1;
      this.q = var2;
      this.T = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.k4_2.y(this.E.E).remove(this.T);
      com.k4_2.g(this.E.E).remove(this.E);
      this.E.E.revalidate();
      this.E.E.repaint();
      com.k4_2.b(this.E.E, com.k4_2.y(this.E.E));
   }
}





