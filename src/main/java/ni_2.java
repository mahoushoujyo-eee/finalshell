import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ni_2 implements Runnable {
   final tf_4 G;
   final String p;
   final a3 O;

   ni_2(a3 var1, tf_4 var2, String var3) {
      this.O = var1;
      this.G = var2;
      this.p = var3;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(608688273536518013L).get(com.c.c(603836458999646755L).get(this));
      Object[] var10001 = com.c.a(com.c.c(605151501817846112L).get(this));
      Method var10003 = com.c.d(217942201414471271L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = (Method)com.c.c(285663222664681848L).get(com.c.c(603836458999646755L).get(this));
      var10001 = com.c.a(com.c.c(603711447625071769L).get(this));
      var10003 = com.c.d(287767492579901085L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      int var1 = ((Km_2)com.c.c(285663222664681848L).get(com.c.c(603836458999646755L).get(this))).getSelectedRow();
      if (var1 > -1) {
         var10000 = (Method)com.c.c(285663222664681848L).get(com.c.c(603836458999646755L).get(this));
         var10001 = com.c.a(var1);
         var10003 = com.c.d(442091497690345581L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }
}





