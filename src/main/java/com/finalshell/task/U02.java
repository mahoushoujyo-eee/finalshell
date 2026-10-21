package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.model.Q6;
import com.finalshell.ui.panel.QuickConnectPanel;

public class U02 implements Runnable {
   public final QuickConnectPanel w;

   public U02(QuickConnectPanel var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Object var1 = 630888003152952115L;
      Ref.g(630888003152952115L, var1);
      Object var3 = 179456532871273698L;
      ((Q6)Ref.g(179456532871273698L, var3)).fireTableDataChanged();
   }
}





