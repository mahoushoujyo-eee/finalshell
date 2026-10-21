package com;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JLayeredPane;

class i5_2 implements WindowStateListener {
   final com.Qt_2 j;
   final JLayeredPane i;

   i5_2(com.Qt_2 var1, JLayeredPane var2) {
      this.j = var1;
      this.i = var2;
   }

   @Override
   public void windowStateChanged(WindowEvent var1) {
      this.j.setBounds(0, 0, this.i.getWidth(), this.i.getHeight());
      this.j.revalidate();
   }
}





