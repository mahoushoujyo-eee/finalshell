package com.finalshell.core;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

public class Rb2 implements WE3 {
   public Void K(Map var1) {
      int var10000 = Ph2.w();
      java.lang.Class[] var3 = new java.lang.Class[]{Time.class, Date.class, Timestamp.class};
      int var2 = var10000;

      for (java.lang.Class var7 : var3) {
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





