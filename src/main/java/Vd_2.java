import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Vd_2 implements Runnable {
   final Ty_2 S;
   final C4 d;

   Vd_2(C4 var1, Ty_2 var2) {
      this.d = var1;
      this.S = var2;
   }

   @Override
   public void run() {
      int[] var1 = C4.K();
      Vd_2 var10000 = this;
      if (var1 != null) {
         var10000 = (Vd_2)com.c.c(202071010499428846L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(121632250293569146L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var7 = var10003;

         try {
            var10000 = (Vd_2)var7.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(209547680018014679L);
         var10002 = var10001;
         var10001 = var10000;
         Method var9 = var10003;

         try {
            var10 = (Long)var9.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (var10 <= 0L) {
            return;
         }

         var10000 = this;
      }

      var10000 = (Vd_2)com.c.c(449269637640691602L).get(var10000);
      Method var16 = (Method)com.c.c(202071010499428846L).get(this);
      Object[] var22 = com.c.f();
      Method var10004 = com.c.d(121632250293569146L);
      Object[] var26 = var22;
      var22 = var16;
      var16 = var10004;

      try {
         var16 = (Method)var16.invoke(var22, var26);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var19 = com.c.a(var16);
      Method var27 = com.c.d(540897424776196125L);
      var22 = var19;
      var16 = var10000;
      Method var12 = var27;

      try {
         var12.invoke(var16, var22);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





