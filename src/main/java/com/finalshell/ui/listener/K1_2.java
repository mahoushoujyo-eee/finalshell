package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.DU;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;

public class K1_2 extends WindowAdapter {
   final JPanel y;
   final DU G;

   K1_2(DU var1, JPanel var2) {
      this.G = var1;
      this.y = var2;
   }

   @Override
   public void windowOpened(WindowEvent var1) {
      Object var2 = 147251249798586499L;
      ((JPanel)Ref.g(147251249798586499L, var2)).requestFocus();
   }
}





