package com.finalshell.task;

import com.finalshell.connection.Connection12;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class KS3 implements Runnable {
   public final Connection12 m;

   public KS3(Connection12 var1) {
      this.m = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void run() {
      boolean var10000 = Connection12.d$boolean();
      int var2 = 0;
      boolean var1 = var10000;

      while (var2 < Registry.lookupField(130436548453706137L).getInt(null)) {
         label64: {
            label54: {
               label53: {
                  try {
                     Object var4 = 606454046828697275L;
                     Connection12 var10001 = (Connection12)Ref.g(606454046828697275L, var4);
                     if (var1) {
                        break label53;
                     }

                     if (Registry.lookupField(516591042377540953L).getBoolean(var10001)) {
                        break;
                     }
                  } catch (Exception var15) {
                     throw a(var15);
                  }

                  try {
                     Object var6 = 606454046828697275L;
                     Connection12 var10002 = (Connection12)Ref.g(606454046828697275L, var6);
                  } catch (Exception var14) {
                     boolean var17 = false;
                     break label54;
                  }
               }

               try {
                  Object[] var21 = Registry.emptyArgs();
                  long var9 = 554677732047204965L;
                  Object[] var8 = var21;
                  Ref.h(554677732047204965L, var8, var9);

                  try {
                     break label64;
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }
               } catch (Exception var13) {
                  boolean var18 = false;
               }
            }

            try {
               if (!var1) {
                  break;
               }
            } catch (Exception var12) {
               boolean var19 = false;
               throw a(var12);
            }
         }

         try {
            var2++;
            if (var1) {
               break;
            }
         } catch (Exception var11) {
            boolean var20 = false;
            throw a(var11);
         }
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





