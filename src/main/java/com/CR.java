package com;

import java.sql.Clob;

class CR implements wE_3 {
   public Boolean p(Class var1) {
      return Clob.class.isAssignableFrom(var1);
   }

   @Override
   public Object N(Object var1) {
      return this.p((Class)var1);
   }
}





