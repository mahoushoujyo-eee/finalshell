import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class V4 implements Fb_2 {
   final f7_2 D;

   V4(f7_2 var1) {
      this.D = var1;
   }

   @Override
   public void O(ty_4 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(542590257020999358L);
      Object[] var10002 = var10001;
      ty_4 var7 = var1;
      Method var10000 = var10003;

      try {
         var4 = (Integer)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      if (var4 == com.c.c(456349507517882113L).getInt(null)) {
         var10000 = (Method)com.c.c(429517307045395670L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(282102616369022866L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }
}





