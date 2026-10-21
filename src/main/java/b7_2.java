import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.SwingUtilities;

class b7_2 implements Runnable {
   final U T;
   final m6 F;
   private static final long a;

   b7_2(m6 var1, U var2) {
      this.F = var1;
      this.T = var2;
   }

   @Override
   public void run() {
      String[] var10000 = F8.y();
      long var2 = System.currentTimeMillis();
      String[] var1 = var10000;

      while (true) {
         var10000 = (String[])com.c.c(440529940248018366L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(404378438847958764L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var8 = var10003;

         try {
            var9 = (Boolean)var8.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         label28:
         if (!var9) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var6) {
               var6.printStackTrace();
               if (var1 == null) {
                  continue;
               }
               break label28;
            }

            if (var1 == null) {
               continue;
            }
            break;
         }

         SwingUtilities.invokeLater(new fy_4(this));
         break;
      }
   }

   static {
      long var0 = 2556498245502164036L;
      long var10002 = 2556498245502164038L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





