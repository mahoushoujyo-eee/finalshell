import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CQ implements Runnable {
   final Dz_2 p;

   CQ(Dz_2 var1) {
      this.p = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(590917027979763395L)
         .get(com.c.c(259214779978464137L).get(com.c.c(589662259632237172L).get(com.c.c(543497142605929448L).get(this))));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(505450737708956760L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      boolean var1 = ((Km_2)com.c.c(166731455568463101L)
            .get(com.c.c(259214779978464137L).get(com.c.c(589662259632237172L).get(com.c.c(543497142605929448L).get(this)))))
         .editCellAt(com.c.c(562214196442797805L).getInt(com.c.c(543497142605929448L).get(this)), 0);
   }
}





