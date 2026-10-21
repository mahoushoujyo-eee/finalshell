package com.finalshell.core;

import javax.swing.JPopupMenu;
import org.jetbrains.annotations.NotNull;

public class H_ implements Ob2_2 {
   public final JPopupMenu n;

   public H_(JPopupMenu var1) {
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





