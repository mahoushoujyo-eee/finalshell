import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ad_2 implements tk_4 {
   final lv_4 n;
   final Yf_2 L;

   ad_2(Yf_2 var1, lv_4 var2) {
      this.L = var1;
      this.n = var2;
   }

   @Override
   public void R(U var1) {
      Method var10001 = (Method)com.c.c(321309124375536271L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(292557478156152530L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001 = (Method)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var6 = com.c.a(var10001);
      Method var10 = com.c.d(292825639419034536L);
      var10002 = var6;
      U var7 = var1;
      Method var10000 = var10;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





