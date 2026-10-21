package com.finalshell.core;

import com.finalshell.reflect.Registry;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;

public class Y12_2 {
   public long f;
   public boolean b;

   public Y12_2(JComponent var1, JPopupMenu var2) {
      Registry.lookupField(436558571101672386L).setBoolean(this, false);
      var2.addPopupMenuListener(new com.finalshell.ui.listener.DG(this));
      var1.addMouseListener(new com.finalshell.ui.listener.LC3(this));
   }

   public boolean i() {
      return Registry.lookupField(436558571101672386L).getBoolean(this);
   }

   public void w(boolean var1) {
      Registry.lookupField(436558571101672386L).setBoolean(this, var1);
   }
}





