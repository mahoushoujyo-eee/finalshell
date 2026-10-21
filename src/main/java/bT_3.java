import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFrame;

class bT_3 implements Runnable {
   final yT_3 j;

   bT_3(yT_3 var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      com.c.c(271302278039639994L).set(com.c.c(500337766327596840L).get(this), new Ta_2());
      Method var10000 = (Method)com.c.c(500337766327596840L).get(this);
      Object[] var10001 = com.c.a(new ty_4(com.c.c(371285800720733657L).getInt(null)));
      Method var10003 = com.c.d(473928376202613579L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(222367947831078517L).set(null, new C5(new JFrame()));
      var10000 = (Method)com.c.c(388376917454860932L).get(null);
      var10001 = com.c.a(new V8(this));
      var10003 = com.c.d(434592463220957006L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





