import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class Q1 implements Runnable {
   final nq_2 S;
   final ArrayList f;
   final String D;
   final String d;
   final String h;
   final F6 q;

   Q1(F6 var1, nq_2 var2, ArrayList var3, String var4, String var5, String var6) {
      this.q = var1;
      this.S = var2;
      this.f = var3;
      this.D = var4;
      this.d = var5;
      this.h = var6;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(397847941350605539L).get(this);
      Object[] var10001 = com.c.a(
         com.c.c(573780545002942372L).get(this),
         com.c.c(284499839281730180L).get(this),
         com.c.c(302280156894978009L).get(this),
         com.c.c(500672424769647067L).get(this)
      );
      Method var10003 = com.c.d(566104538227199671L);
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





