package com.finalshell.core;

import java.sql.Clob;

public class CR_2 implements WE3 {
   CR_2() {
   }

   public Boolean p(java.lang.Class var1) {
      return Clob.class.isAssignableFrom(var1);
   }

   @Override
   public Object N(Object var1) {
      return this.p((java.lang.Class)var1);
   }
}





