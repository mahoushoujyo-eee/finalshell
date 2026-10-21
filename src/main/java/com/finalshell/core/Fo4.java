package com.finalshell.core;

import com.finalshell.task.Bd2;
import javax.swing.SwingUtilities;

public class Fo4 implements Tk4 {
   final M6 t;

   Fo4(M6 var1) {
      this.t = var1;
   }

   @Override
   public void R(com.finalshell.ui.frame.U var1) {
      SwingUtilities.invokeLater(new Bd2(this, var1));
   }
}





