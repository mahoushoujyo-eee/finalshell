import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class kf_4 implements Runnable {
   final int a;
   final aM w;

   kf_4(aM var1, int var2) {
      this.w = var1;
      this.a = var2;
   }

   @Override
   public void run() {
      kf_4 var4;
      label40: {
         String[] var1 = aM.s();
         int var10000 = com.c.c(295015697832332578L).getInt(this);
         if (var1 == null) {
            if (var10000 <= 0) {
               return;
            }

            var4 = this;
            if (var1 != null) {
               break label40;
            }

            var10000 = com.c.c(295015697832332578L).getInt(this);
         }

         Method var10001 = (Method)com.c.c(142536030060271800L).get(com.c.c(318753840802082969L).get(this));
         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(230171768324088030L);
         Object[] var10003 = var10002;
         var10002 = var10001;
         var10001 = var10004;

         try {
            var8 = (ArrayList)var10001.invoke(var10002, var10003);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         if (var10000 != var8.size() - 1) {
            return;
         }

         var4 = this;
      }

      var4 = (kf_4)com.c.c(142536030060271800L).get(com.c.c(318753840802082969L).get(var4));
      Object[] var9 = com.c.a(com.c.c(295015697832332578L).getInt(this) - 1);
      Method var13 = com.c.d(451518351793196330L);
      Object[] var12 = var9;
      var9 = var4;
      Method var6 = var13;

      try {
         var6.invoke(var9, var12);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





