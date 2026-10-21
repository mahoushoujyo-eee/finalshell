package com.finalshell.task;

import com.finalshell.core.Connect_2;
import com.finalshell.ui.model.WF3;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;

public class Yu2 implements Runnable {
   public final SetBackgroundImagePanel P;

   public Yu2(SetBackgroundImagePanel var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      int var1 = ConnectionProperty.y();
      SetBackgroundImagePanel var10000 = this.P;
      if (var1 == 0) {
         if (SetBackgroundImagePanel.A$E0(this.P) == null) {
            return;
         }

         var10000 = this.P;
      }

      com.finalshell.core.OT var2 = var10000.n$OT();
      com.finalshell.core.OT var3 = var2;
      if (var1 == 0) {
         if (var2 == null) {
            return;
         }

         var2 = Connect_2.V(var2);
         var3 = this.P.N;
      }

      boolean var4 = var3.equals(var2);
      label24:
      if (var1 == 0) {
         if (var4) {
            boolean var5 = SetBackgroundImagePanel.H$boolean(this.P);
            if (var1 != 0) {
               break label24;
            }

            if (var5) {
               return;
            }
         }

         SetBackgroundImagePanel.u(this.P, true);
      }

      SetBackgroundImagePanel.H$Wq_2(this.P).R();
      SetBackgroundImagePanel.A$E0(this.P).J(var2, WF3.User);
   }
}





