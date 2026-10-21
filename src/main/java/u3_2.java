import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

class u3_2 implements Fb_2 {
   final aW l;

   u3_2(aW var1) {
      this.l = var1;
   }

   @Override
   public void O(ty_4 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(542590257020999358L);
      Object[] var10002 = var10001;
      ty_4 var7 = var1;
      Method var10000 = var10003;

      try {
         var5 = (Integer)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      int var2 = var5;
      if (var2 == com.c.c(146259046198212012L).getInt(null)) {
         JLabel var6 = (JLabel)com.c.c(281854482764394826L).get(com.c.c(309155166021927691L).get(this));
         var10002 = com.c.f();
         Method var10004 = com.c.d(167932056536173107L);
         Object[] var12 = var10002;
         ty_4 var11 = var1;
         Method var8 = var10004;

         try {
            var10001 = (String)var8.invoke(var11, var12);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var6.setText(var10001);
      }
   }
}





