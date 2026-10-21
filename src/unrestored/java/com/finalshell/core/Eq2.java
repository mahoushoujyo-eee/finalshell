package com.finalshell.core;

import java.io.File;
import java.io.FileFilter;

public class Eq2 implements FileFilter {
   public final On2 t;

   public Eq2(On2 var1) {
      this.t = var1;
   }

   @Override
   public boolean accept(File var1) {
      return this.t.n(var1);
   }
}





