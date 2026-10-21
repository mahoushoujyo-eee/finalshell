import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class uv_4 implements Runnable {
   final o3_2 r;

   uv_4(o3_2 var1) {
      this.r = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(612091313834066062L)
         .get(com.c.c(396507593444187971L).get(com.c.c(623978626682822626L).get(com.c.c(236372290177734785L).get(this))));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(505450737708956760L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      ((Km_2)com.c.c(396507593444187971L).get(com.c.c(623978626682822626L).get(com.c.c(236372290177734785L).get(this))))
         .editCellAt(
            com.c.c(586111568867965214L).getInt(com.c.c(236372290177734785L).get(this)),
            com.c.c(216074577526253003L).getInt(com.c.c(236372290177734785L).get(this))
         );
   }
}





