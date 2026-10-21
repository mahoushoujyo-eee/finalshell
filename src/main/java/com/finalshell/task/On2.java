package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.Copy2;
import javax.swing.JSplitPane;

public class On2 implements Runnable {
   final JSplitPane N;
   final Copy2 v;

   On2(Copy2 var1, JSplitPane var2) {
      this.v = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      Object var2 = 538664854951199242L;
      int var1 = (int)((float)((JSplitPane)Ref.g(538664854951199242L, var2)).getWidth() * 0.65F);
      Object var4 = 538664854951199242L;
      ((JSplitPane)Ref.g(538664854951199242L, var4)).setDividerLocation(var1);
   }
}





