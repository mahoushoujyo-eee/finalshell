package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ha_2 implements GN {
   private static final Logger i = LoggerFactory.getLogger(Xe_2.class);

   @Override
   public boolean K(int var1) {
      boolean var2 = com.dm_4.J();
      int var10000 = var1;
      if (!var2) {
         switch (var1) {
            case 0:
               return i.isDebugEnabled();
            case 1:
               return i.isInfoEnabled();
            case 2:
               return i.isWarnEnabled();
            case 3:
            case 4:
               return i.isErrorEnabled();
            default:
               var10000 = i.isTraceEnabled();
         }
      }

      return (boolean)var10000;
   }

   @Override
   public void t(int var1, String var2) {
      this.c(var1, var2, null);
   }

   @Override
   public void c(int var1, String var2, Throwable var3) {
      boolean var4 = com.dm_4.J();
      int var10000 = this.K(var1);
      if (!var4) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1;
      }

      switch (var10000) {
         case 0:
            i.debug(var2, var3);
            if (!var4) {
               break;
            }
         case 1:
            i.info(var2, var3);
            if (!var4) {
               break;
            }
         case 2:
            i.warn(var2, var3);
            if (!var4) {
               break;
            }
         case 3:
         case 4:
            i.error(var2, var3);
            if (!var4) {
               break;
            }
         default:
            i.trace(var2, var3);
      }
   }
}





