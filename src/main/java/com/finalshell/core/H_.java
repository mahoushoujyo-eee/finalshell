package com.finalshell.core;

import javax.swing.JPopupMenu;
import org.jetbrains.annotations.NotNull;

public class H_ implements Ob2_2 {
   final JPopupMenu n;

   H_(JPopupMenu var1) {
      this.n = var1;
   }

   @Override
   public void O(@NotNull AD_2 var1) {
      this.n.add(AD_2.z(var1));
   }

   @Override
   public void M() {
      this.n.addSeparator();
   }
}





