import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Oj_2 implements Runnable {
   final oX_3 U;

   Oj_2(oX_3 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(581062571413896186L).get(com.c.c(133173071882973546L).get(this));
      Object[] var10001 = com.c.a(
         com.c.c(353004286530058057L).get(com.c.c(133173071882973546L).get(this)), com.c.c(353004286530058057L).get(com.c.c(133173071882973546L).get(this))
      );
      Method var10003 = com.c.d(621461495980468759L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





