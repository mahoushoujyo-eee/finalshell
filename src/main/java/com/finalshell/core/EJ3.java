package com.finalshell.core;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class EJ3 implements PK3 {
   public Object i(Object var1, java.lang.Class var2) {
      int var3 = Ph2.u();
      java.lang.Class var10000 = var2;
      java.lang.Class<Date> var10001 = Date.class;
      if (var3 == 0) {
         if (var2 == Date.class) {
            return B8_2.p(var1);
         }

         var10000 = var2;
         var10001 = Time.class;
      }

      if (var3 == 0) {
         if (var10000 == var10001) {
            return B8_2.z(var1);
         }

         var10000 = var2;
         if (var3 != 0) {
            return var2;
         }

         var10001 = Timestamp.class;
      }

      return var10000 != var10001 ? null : B8_2.q(var1);
   }

   @Override
   public Object h(Object var1, Object var2) {
      return this.i(var1, (java.lang.Class)var2);
   }
}





