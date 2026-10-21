import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class aB {
   ArrayList h;
   N a;

   public N q(String var1) {
      String var10000 = W2.F();
      N var3 = null;
      String var2 = var10000;
      Iterator var4 = ((ArrayList)com.c.c(246866782302869295L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            var7 = (N)var4.next();
            if (var2 == null) {
               break;
            }

            N var5 = var7;
            Object[] var10002 = com.c.f();
            Method var10004 = com.c.d(325825537657373656L);
            Object[] var10003 = var10002;
            N var9 = var5;
            Method var10001 = var10004;

            try {
               var8 = (String)var10001.invoke(var9, var10003);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            if (var1.equals(var8)) {
               var3 = var5;
            }

            if (var2 != null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   public ArrayList q() {
      return (ArrayList)com.c.c(246866782302869295L).get(this);
   }

   public void r(ArrayList var1) {
      com.c.c(246866782302869295L).set(this, var1);
   }

   public N x() {
      return (N)com.c.c(619718667615599045L).get(this);
   }

   public void S(N var1) {
      com.c.c(619718667615599045L).set(this, var1);
   }
}





