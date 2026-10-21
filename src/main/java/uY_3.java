import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class uY_3 implements tk_4 {
   final boolean M;
   final Jx_2 q;

   uY_3(Jx_2 var1, boolean var2) {
      this.q = var1;
      this.M = var2;
   }

   @Override
   public void R(U var1) {
      Object[] var10001 = com.c.a(com.c.c(296414114989994442L).getBoolean(this));
      Method var10003 = com.c.d(636304631404470975L);
      Object[] var10002 = var10001;
      U var3 = var1;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





