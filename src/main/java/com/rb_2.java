package com;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

class Rb_2 implements wE_3 {
   public Void K(Map var1) {
      int var10000 = Ph_2.w();
      Class[] var3 = new Class[]{Time.class, Date.class, Timestamp.class};
      int var2 = var10000;

      for (Class var7 : var3) {
         if (var2 != 0 && (var7 != null || var2 == 0)) {
            var1.put(var7.getName(), var7);
         }

         if (var2 == 0) {
            break;
         }
      }

      return null;
   }

   @Override
   public Object N(Object var1) {
      return this.K((Map)var1);
   }
}





