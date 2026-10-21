import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

class oo_4 implements Fb_2 {
   final DU C;

   oo_4(DU var1) {
      this.C = var1;
   }

   @Override
   public void O(ty_4 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(542590257020999358L);
      Object[] var10002 = var10001;
      ty_4 var11 = var1;
      Method var10000 = var10003;

      try {
         var7 = (Integer)var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      int var2 = var7;
      if (var2 == com.c.c(146259046198212012L).getInt(null)) {
         var10001 = com.c.f();
         var10003 = com.c.d(167932056536173107L);
         var10002 = var10001;
         ty_4 var13 = var1;
         var10000 = var10003;

         try {
            String var9 = (String)var10000.invoke(var13, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         JLabel var10 = (JLabel)com.c.c(550961635451839925L).get(com.c.c(241100921967448220L).get(this));
         var10002 = com.c.f();
         Method var10004 = com.c.d(167932056536173107L);
         Object[] var20 = var10002;
         ty_4 var18 = var1;
         Method var14 = var10004;

         try {
            var10001 = (String)var14.invoke(var18, var20);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10.setText(var10001);
      }
   }
}





