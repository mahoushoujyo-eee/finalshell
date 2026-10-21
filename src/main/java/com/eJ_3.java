package com;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

class eJ_3 implements pK_3 {
   public Object i(Object var1, Class var2) {
      int var3 = Ph_2.u();
      Class var10000 = var2;
      Class<Date> var10001 = Date.class;
      if (var3 == 0) {
         if (var2 == Date.class) {
            return com.B8.p(var1);
         }

         var10000 = var2;
         var10001 = Time.class;
      }

      if (var3 == 0) {
         if (var10000 == var10001) {
            return com.B8.z(var1);
         }

         var10000 = var2;
         if (var3 != 0) {
            return var2;
         }

         var10001 = Timestamp.class;
      }

      return var10000 != var10001 ? null : com.B8.q(var1);
   }

   @Override
   public Object h(Object var1, Object var2) {
      return this.i(var1, (Class)var2);
   }
}





