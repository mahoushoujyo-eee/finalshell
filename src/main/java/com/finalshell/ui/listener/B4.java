package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.frame.KeyManagerFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B4 implements ActionListener {
   final KeyManagerFrame I;

   B4(KeyManagerFrame var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 119316395797982130L;
      ((KeyManagerFrame)Ref.g(119316395797982130L, var2)).setVisible(false);
   }
}





