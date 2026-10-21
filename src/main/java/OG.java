import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class OG implements Runnable {
   final ArrayList R;
   final CB V;

   OG(CB var1, ArrayList var2) {
      this.V = var1;
      this.R = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(414347828709011535L).get(com.c.c(351102513610977778L).get(this));
      Object[] var10001 = com.c.a(com.c.c(228277604966097106L).get(this));
      Method var10003 = com.c.d(228073642375378428L);
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





