package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection4;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class Ve2 implements TreeSelectionListener {
   public final Connection4 S;

   public Ve2(Connection4 var1) {
      this.S = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      Object var2 = 447643929653605646L;
      Registry.lookupField(572181340793640435L).setLong(Ref.g(447643929653605646L, var2), System.currentTimeMillis());
   }
}





