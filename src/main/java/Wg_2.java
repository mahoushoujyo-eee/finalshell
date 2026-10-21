import com._y_2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Wg_2 implements Runnable {
   final _y_2 C;
   final U h;

   Wg_2(U var1, _y_2 var2) {
      this.h = var1;
      this.C = var2;
   }

   @Override
   public void run() {
      String[] var10000 = F8.y();
      Ty_2 var2 = ((_y_2)com.c.c(249265836943574937L).get(this)).M();
      String[] var1 = var10000;
      Ty_2 var6 = var2;
      if (var1 == null) {
         if (var2 != null) {
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(211078057503611761L);
            Object[] var10002 = var10001;
            Ty_2 var9 = var2;
            Method var7 = var10003;

            try {
               var7.invoke(var9, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         var6 = new Ty_2((_y_2)com.c.c(249265836943574937L).get(this));
      }

      Ty_2 var3 = var6;
      ((_y_2)com.c.c(249265836943574937L).get(this)).V(var3);
      Object[] var10 = com.c.f();
      Method var13 = com.c.d(148323203103408090L);
      Object[] var12 = var10;
      Ty_2 var11 = var3;
      Method var8 = var13;

      try {
         var8.invoke(var11, var12);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





