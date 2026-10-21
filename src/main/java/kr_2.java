import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Kr_2 implements Runnable {
   final zD s;

   Kr_2(zD var1) {
      this.s = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void run() {
      boolean var10000 = zD.d();
      int var2 = 0;
      boolean var1 = var10000;

      while (var2 < com.c.c(130436548453706137L).getInt(null)) {
         label64: {
            label54: {
               label53: {
                  try {
                     var10 = (zD)com.c.c(615872267704886591L).get(this);
                     if (var1) {
                        break label53;
                     }

                     if (com.c.c(516591042377540953L).getBoolean(var10)) {
                        break;
                     }
                  } catch (Exception var9) {
                     throw a(var9);
                  }

                  try {
                     var10 = (zD)com.c.c(615872267704886591L).get(this);
                  } catch (Exception var8) {
                     boolean var10001 = false;
                     break label54;
                  }
               }

               try {
                  Object[] var15 = com.c.f();
                  Method var10003 = com.c.d(554677732047204965L);
                  Object[] var10002 = var15;
                  zD var16 = var10;
                  Method var12 = var10003;

                  try {
                     var12.invoke(var16, var10002);
                     break label64;
                  } catch (InvocationTargetException var4) {
                     throw var4.getTargetException();
                  }
               } catch (Exception var7) {
                  boolean var13 = false;
               }
            }

            try {
               if (!var1) {
                  break;
               }
            } catch (Exception var6) {
               boolean var14 = false;
               throw a(var6);
            }
         }

         try {
            var2++;
            if (var1) {
               break;
            }
         } catch (Exception var5) {
            boolean var17 = false;
            throw a(var5);
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





