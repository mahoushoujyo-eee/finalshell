package com.finalshell.task;

import com.finalshell.ui.panel.SetBackgroundImagePanel;

public class D implements Runnable {
   final SetBackgroundImagePanel E;

   D(SetBackgroundImagePanel var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      this.E.j();
   }
}





