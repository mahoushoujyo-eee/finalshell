package com.finalshell.task;

import com.finalshell.ui.model.WF3;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;

public class Ny4 implements Runnable {
   final SetBackgroundImagePanel d;

   Ny4(SetBackgroundImagePanel var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      int var1 = ConnectionProperty.y();
      SetBackgroundImagePanel var10000 = this.d;
      if (var1 == 0) {
         if (SetBackgroundImagePanel.A$E0(this.d) == null) {
            return;
         }

         var10000 = this.d;
      }

      com.finalshell.core.OT var2 = var10000.n$OT();
      SetBackgroundImagePanel.A$E0(this.d).J(var2, WF3.User);
   }
}





