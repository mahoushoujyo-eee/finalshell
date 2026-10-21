package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class wz_4 implements ActionListener {
   final JComponent o;
   final int E;
   final int G;
   final com.Yi_2 D;

   wz_4(com.Yi_2 var1, JComponent var2, int var3, int var4) {
      this.D = var1;
      this.o = var2;
      this.E = var3;
      this.G = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.D.z(this.o, this.E, this.G);
   }
}





