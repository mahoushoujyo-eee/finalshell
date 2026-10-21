package com.finalshell.ui.model;

import com.finalshell.core.Cz2;
import java.io.File;
import java.util.Comparator;

public class S implements Comparator {
   final com.finalshell.ui.panel.T H;

   S(com.finalshell.ui.panel.T var1) {
      this.H = var1;
   }

   public int L(File var1, File var2) {
      boolean var3 = Cz2.V(var1);
      boolean var4 = Cz2.V(var2);
      String var5 = var3 ? Cz2.G(var1.getName(), true) : "";
      String var6 = var4 ? Cz2.G(var2.getName(), true) : "";
      return var5.compareToIgnoreCase(var6);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.L((File)var1, (File)var2);
   }
}





