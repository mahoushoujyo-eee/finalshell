import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

class VW implements Runnable {
   final KV C;

   VW(KV var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      String[] var10000 = KV.b();
      ArrayList var2 = (ArrayList)((ArrayList)com.c.c(561219037117570651L).get(com.c.c(142803273519455900L).get(this))).clone();
      String[] var1 = var10000;
      Iterator var3 = var2.iterator();

      label53: {
         while (true) {
            if (var3.hasNext()) {
               uI_3 var4 = (uI_3)var3.next();
               var7 = var4;
               if (var1 != null) {
                  break;
               }

               label56: {
                  if (var1 == null) {
                     if (var4 == null) {
                        break label56;
                     }

                     var7 = var4;
                  }

                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(467072645301573589L);
                  Object[] var10002 = var10001;
                  uI_3 var12 = var7;
                  Method var8 = var10003;

                  try {
                     var8.invoke(var12, var10002);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }
               }

               if (var1 == null) {
                  continue;
               }
            }

            var9 = (KV)com.c.c(142803273519455900L).get(this);
            if (var1 != null) {
               break label53;
            }

            var7 = (uI_3)com.c.c(284667866022471457L).get(var9);
            break;
         }

         if (var7 != null) {
            var10000 = (String[])com.c.c(284667866022471457L).get(com.c.c(142803273519455900L).get(this));
            Object[] var13 = com.c.f();
            Method var16 = com.c.d(467072645301573589L);
            Object[] var15 = var13;
            var13 = var10000;
            Method var11 = var16;

            try {
               var11.invoke(var13, var15);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         var9 = (KV)com.c.c(142803273519455900L).get(this);
      }

      ((ArrayList)com.c.c(561219037117570651L).get(var9)).clear();
   }
}





