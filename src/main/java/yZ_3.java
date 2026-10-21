import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yZ_3 implements BH {
   final yT_3 U;

   yZ_3(yT_3 var1) {
      this.U = var1;
   }

   @Override
   public void t(L1 var1) {
      Method var10000 = (Method)com.c.c(507208485423109694L).get(com.c.c(376364805698663185L).get(this));
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(542058094445767607L);
      Object[] var10003 = var10002;
      L1 var12 = var1;
      Method var10001 = var10004;

      try {
         var6 = var10001.invoke(var12, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var7 = com.c.a(var6);
      var10001 = com.c.d(417955638237048558L);
      var10003 = var7;
      var10002 = null;

      try {
         var9 = var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var10 = com.c.a(var9, com.c.c(533852929194464166L).getInt(null));
      Method var18 = com.c.d(336149661543182260L);
      var10002 = var10;
      Object var11 = var10000;
      var10000 = var18;

      try {
         var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





