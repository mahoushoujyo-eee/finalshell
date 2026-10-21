package com.finalshell.core;

import java.io.File;

public class MK extends LV3 {
   MK() {
   }

   @Override
   public String z(File var1) {
      return "\"" + super.z(var1) + "\"";
   }

   @Override
   public String C(Object var1) {
      return this.z((File)var1);
   }
}





