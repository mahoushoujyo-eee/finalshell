import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class mn_2 implements Cq_2 {
   final zD S;
   final String C;
   final String w;
   final JA P;

   mn_2(JA var1, zD var2, String var3, String var4) {
      this.P = var1;
      this.S = var2;
      this.C = var3;
      this.w = var4;
   }

   @Override
   public void u(VO var1) {
      boolean var2 = F6.i();

      label50: {
         try {
            if (!var2) {
               break label50;
            }

            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(178857963789314984L);
            Object[] var10002 = var10001;
            VO var15 = var1;
            Method var10000 = var10003;

            try {
               var10 = (Integer)var10000.invoke(var15, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            if (var10 != com.c.c(242649790291880610L).getInt(null)) {
               return;
            }
         } catch (Exception var9) {
            throw a(var9);
         }

         try {
            Method var11 = (Method)com.c.c(140538463457516322L).get(this);
            Object[] var16 = com.c.a(com.c.c(543246570144301620L).get(com.c.c(127529234865039930L).get(this)));
            Method var23 = com.c.d(596624758422184723L);
            Object[] var20 = var16;
            var16 = var11;
            var11 = var23;

            try {
               var11.invoke(var16, var20);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      com.c.c(525973064303548535L).setLong(com.c.c(127529234865039930L).get(this), System.currentTimeMillis());

      try {
         Object[] var13 = com.c.a(com.c.c(139735919125773440L).get(this), com.c.c(461570582865979606L).get(this), false);
         Method var14 = com.c.d(197468530930532747L);
         Object[] var22 = var13;
         Object var19 = null;

         try {
            var14.invoke(var19, var22);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





