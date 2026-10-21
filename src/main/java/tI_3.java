import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class tI_3 implements Runnable {
   final String n;
   final String W;
   final String E;
   final mT g;

   tI_3(mT var1, String var2, String var3, String var4) {
      this.g = var1;
      this.n = var2;
      this.W = var3;
      this.E = var4;
   }

   @Override
   public void run() {
      try {
         Method var10000 = (Method)com.c.c(219976392524080121L).get(com.c.c(139637220479988407L).get(this));
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(622340890791521181L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000 = (Method)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10001 = com.c.a(com.c.c(513731305386934069L).get(this), com.c.c(337966207493126884L).get(this));
         var10003 = com.c.d(247777483328047393L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var10000 = (Method)com.c.c(400471378487267832L).get(com.c.c(139637220479988407L).get(this));
         var10001 = com.c.a(com.c.c(513731305386934069L).get(this), com.c.c(337966207493126884L).get(this), com.c.c(582886898373027813L).get(this));
         var10003 = com.c.d(191848618899962223L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            ck_4 var11 = (ck_4)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}





