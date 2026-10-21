package com;

import java.io.File;
import java.io.FileFilter;

class Eq_2 implements FileFilter {
   final com.On_2 t;

   Eq_2(com.On_2 var1) {
      this.t = var1;
   }

   @Override
   public boolean accept(File var1) {
      return this.t.n(var1);
   }
}





