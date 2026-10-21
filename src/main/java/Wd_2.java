import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Wd_2 extends W2 {
   final Ty_2 a;

   Wd_2(Ty_2 var1) {
      this.a = var1;
      Object[] var10001 = com.c.a(com.c.c(353811571070434348L).get(null));
      Method var10003 = com.c.d(241374024532053562L);
      Object[] var10002 = var10001;
      Wd_2 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void O() {
      Wd_2 var4;
      label39: {
         String[] var1 = KV.b();
         String var10000 = (String)com.c.c(372236004790213499L).get(this);
         if (var1 == null) {
            if (var10000 == null) {
               return;
            }

            var4 = this;
            if (var1 != null) {
               break label39;
            }

            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(297950173727673677L);
            Object[] var10002 = var10001;
            Wd_2 var8 = this;
            Method var5 = var10003;

            try {
               var4 = (Wd_2)var5.invoke(var8, var10002);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            var10001 = com.c.f();
            var10003 = com.c.d(164968885333537697L);
            var10002 = var10001;
            var10001 = var4;
            Method var7 = var10003;

            try {
               var10000 = (String)var7.invoke(var10001, var10002);
            } catch (InvocationTargetException var2) {
               throw var2.getTargetException();
            }
         }

         if (var10000.equals("")) {
            return;
         }

         var4 = this;
      }

      com.c.c(284041043052708509L).setBoolean(com.c.c(612496811166955604L).get(var4), false);
   }
}





