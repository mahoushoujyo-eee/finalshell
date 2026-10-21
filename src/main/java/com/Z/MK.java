package com.Z;

import java.io.File;

class MK extends com.lV_3 {
   @Override
   public String z(File var1) {
      return "\"" + super.z(var1) + "\"";
   }

   @Override
   public String C(Object var1) {
      return this.z((File)var1);
   }
}





