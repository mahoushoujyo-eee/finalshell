import java.awt.Container;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bu_4 implements Runnable {
   final boolean i;
   final a3 r;
   private static final long a;

   bu_4(a3 var1, boolean var2) {
      this.r = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      int[] var10000 = a3.I();
      Method var10001 = (Method)com.c.c(481550355343873241L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(519181782535843793L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10 = (Rectangle)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Rectangle var2 = var10;
      int[] var1 = var10000;
      Rectangle var3 = ((a3)com.c.c(481550355343873241L).get(this)).getBounds();
      Container var7 = ((a3)com.c.c(481550355343873241L).get(this)).getParent();
      if (var1 != null) {
         if (var7 == null) {
            return;
         }

         var7 = ((a3)com.c.c(481550355343873241L).get(this)).getParent();
      }

      label48: {
         Rectangle var4 = var7.getBounds();
         int var5 = (int)a;
         Rectangle var8 = var4;
         if (var1 != null) {
            if (var4 == null) {
               break label48;
            }

            var8 = var2;
         }

         if (var1 != null) {
            if (var8 == null) {
               break label48;
            }

            var8 = var4;
         }

         if (var8.height - var2.y < var5) {
         }
      }

      if (com.c.c(234151530419687938L).getBoolean(this) && var2 != null) {
         ((a3)com.c.c(481550355343873241L).get(this)).scrollRectToVisible(var2);
      }
   }

   static {
      long var0 = 7446380712253550142L;
      long var10002 = -2700192281428660616L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





