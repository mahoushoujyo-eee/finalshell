package com.Z;

import java.io.File;
import java.util.Comparator;

class S implements Comparator {
   final com.Z.T H;

   S(com.Z.T var1) {
      this.H = var1;
   }

   public int L(File var1, File var2) {
      boolean var3 = com.Cz_2.V(var1);
      boolean var4 = com.Cz_2.V(var2);
      String var5 = var3 ? com.Cz_2.G(var1.getName(), true) : "";
      String var6 = var4 ? com.Cz_2.G(var2.getName(), true) : "";
      return var5.compareToIgnoreCase(var6);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.L((File)var1, (File)var2);
   }
}





