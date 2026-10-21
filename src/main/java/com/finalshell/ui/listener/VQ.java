package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VQ implements ListSelectionListener {
   public final com.finalshell.core.Km2 f;

   public VQ(com.finalshell.core.Km2 var1) {
      this.f = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      Object var2 = 269574532637239586L;
      Registry.lookupField(363492891300853480L).setLong(Ref.g(269574532637239586L, var2), System.currentTimeMillis());
   }
}





