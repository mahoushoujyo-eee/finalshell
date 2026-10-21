package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;

public class Y12_2 {
   public long f;
   public boolean b;

   public Y12_2(JComponent var1, JPopupMenu var2) {
      Ref.s(436558571101672386L, this, false);
      var2.addPopupMenuListener(new com.finalshell.ui.listener.DG(this));
      var1.addMouseListener(new com.finalshell.ui.listener.LC3(this));
   }

   public boolean i() {
      return ((Boolean)Ref.g(436558571101672386L, this)).booleanValue();
   }

   public void w(boolean var1) {
      Ref.s(436558571101672386L, this, var1);
   }
}





