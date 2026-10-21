package com.finalshell.ui.listener;

import com.finalshell.ui.dialog.S3;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class J5 extends WindowAdapter {
   public final S3 L;

   public J5(S3 var1) {
      this.L = var1;
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      S3.K(this.L).z(-1);
   }
}





