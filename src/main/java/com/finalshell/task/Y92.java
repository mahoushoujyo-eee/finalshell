package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SendSyncMailPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Y92 implements Runnable {
   final SendSyncMailPanel H;

   Y92(SendSyncMailPanel var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      String var1 = SendSyncMailPanel.u();
      Object var3 = 446953166655942254L;
      SendSyncMailPanel var10001 = (SendSyncMailPanel)Ref.g(446953166655942254L, var3);
      if (var1 != null) {
         if (!Registry.lookupField(370516434131129032L).getBoolean(var10001)) {
            return;
         }

         Object var5 = 446953166655942254L;
         SendSyncMailPanel var10002 = (SendSyncMailPanel)Ref.g(446953166655942254L, var5);
      }

      Object var7 = 535617497140980511L;
      JScrollBar var2 = ((JScrollPane)Ref.g(535617497140980511L, var7)).getVerticalScrollBar();
      var2.setValue(var2.getMaximum());
   }
}





