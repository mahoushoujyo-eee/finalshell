package com.finalshell.core;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class LY3 implements WE3 {
   public Boolean E(java.lang.Class var1) {
      boolean var2 = Yn4.Y();
      java.lang.Class var10000 = var1;
      java.lang.Class<Date> var10001 = Date.class;
      if (var2) {
         if (var1 == Date.class) {
            return true;
         }

         var10000 = var1;
         var10001 = (Class<Date>)(Time.class);
      }

      if (var2) {
         if (var10000 == var10001) {
            return true;
         }

         var10000 = var1;
         var10001 = (Class<Date>)(Timestamp.class);
      }

      return var10000 != var10001 ? false : true;
   }

   @Override
   public Object N(Object var1) {
      return this.E((java.lang.Class)var1);
   }
}





