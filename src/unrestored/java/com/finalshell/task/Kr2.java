package com.finalshell.task;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Kr2 implements Runnable {
   public final FileTransferConnection s;

   public Kr2(FileTransferConnection var1) {
      this.s = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void run() {
      boolean var10000 = FileTransferConnection.d$boolean();
      int var2 = 0;
      boolean var1 = var10000;

      while (var2 < ((Integer)Ref.g(130436548453706137L, null)).intValue()) {
         label64: {
            label54: {
               label53: {
                  try {
                     Object var4 = 615872267704886591L;
                     FileTransferConnection var10001 = (FileTransferConnection)Ref.g(615872267704886591L, var4);
                     if (var1) {
                        break label53;
                     }

                     if (((Boolean)Ref.g(516591042377540953L, var10001)).booleanValue()) {
                        break;
                     }
                  } catch (Exception var15) {
                     throw new RuntimeException(a(var15));
                  }

                  try {
                     Object var6 = 615872267704886591L;
                     FileTransferConnection var10002 = (FileTransferConnection)Ref.g(615872267704886591L, var6);
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
                     throw new RuntimeException(var10.getTargetException());
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
               throw new RuntimeException(a(var12));
            }
         }

         try {
            var2++;
            if (var1) {
               break;
            }
         } catch (Exception var11) {
            boolean var20 = false;
            throw new RuntimeException(a(var11));
         }
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





