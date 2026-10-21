package com;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

class lY_3 implements wE_3 {
   public Boolean E(Class var1) {
      boolean var2 = com.yn_4.Y();
      Class var10000 = var1;
      Class<Date> var10001 = Date.class;
      if (var2) {
         if (var1 == Date.class) {
            return true;
         }

         var10000 = var1;
         var10001 = Time.class;
      }

      if (var2) {
         if (var10000 == var10001) {
            return true;
         }

         var10000 = var1;
         var10001 = Timestamp.class;
      }

      return var10000 != var10001 ? false : true;
   }

   @Override
   public Object N(Object var1) {
      return this.E((Class)var1);
   }
}





