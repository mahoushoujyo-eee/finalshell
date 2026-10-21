package com.finalshell.task;

import javax.swing.SwingUtilities;

public class Jg2 implements Runnable {
   Jg2() {
   }

   @Override
   public void run() {
      SwingUtilities.invokeLater(new UH3(this));
   }
}





