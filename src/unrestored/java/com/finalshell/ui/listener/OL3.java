package com.finalshell.ui.listener;

import com.finalshell.ui.panel.QQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OL3 implements ActionListener {
   public final QQ H;

   public OL3(QQ var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.H.l();
   }
}





