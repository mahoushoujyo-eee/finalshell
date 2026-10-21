package com.finalshell.task;

import com.finalshell.ui.frame.MainFrame;
import javax.swing.SwingUtilities;

public class Qn2 implements Runnable {
   public final MainFrame Z;

   public Qn2(MainFrame var1) {
      this.Z = var1;
   }

   @Override
   public void run() {
      SwingUtilities.invokeLater(new FS3(this));
   }
}





