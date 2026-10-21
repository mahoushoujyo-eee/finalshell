import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yx_4 implements Runnable {
   final int U;
   final Di_2 M;

   yx_4(Di_2 var1, int var2) {
      this.M = var1;
      this.U = var2;
   }

   @Override
   public void run() {
      String[] var1;
      Bq_2 var8;
      label69: {
         label68: {
            String[] var10000 = aM.s();
            Point var2 = ((Bq_2)com.c.c(128810952447237716L).get(com.c.c(554051037585710089L).get(this))).getMousePosition();
            var1 = var10000;
            Point var7 = var2;
            if (var1 == null) {
               if (var2 != null) {
                  break label68;
               }

               var8 = (Bq_2)com.c.c(128810952447237716L).get(com.c.c(554051037585710089L).get(this));
               if (var1 != null) {
                  break label69;
               }

               var7 = ((Yg_2)com.c.c(275545539772972982L).get(var8)).getMousePosition();
            }

            if (var7 == null) {
               return;
            }
         }

         var8 = (Bq_2)com.c.c(128810952447237716L).get(com.c.c(554051037585710089L).get(this));
      }

      int var9 = com.c.c(515313227049281099L).getBoolean(var8);
      if (var1 == null) {
         if (var9 != 0) {
            return;
         }

         Object[] var10 = com.c.f();
         Method var11 = com.c.d(270389152141252877L);
         Object[] var25 = var10;
         Object var18 = null;

         try {
            var8 = (Bq_2)var11.invoke(var18, var25);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var18 = com.c.f();
         Method var10003 = com.c.d(306266403902896148L);
         var25 = (Object[])var18;
         var18 = var8;
         Method var13 = var10003;

         try {
            var8 = (Bq_2)var13.invoke(var18, var25);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var18 = com.c.f();
         var10003 = com.c.d(623727123785142657L);
         var25 = (Object[])var18;
         var18 = var8;
         Method var15 = var10003;

         try {
            var9 = (Boolean)var15.invoke(var18, var25);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }

      if (var1 == null) {
         if (var9 == 0) {
            return;
         }

         long var31;
         var9 = (
                  var31 = System.currentTimeMillis()
                     - com.c.c(444246150125769098L).getLong(com.c.c(128810952447237716L).get(com.c.c(554051037585710089L).get(this)))
                     - (long)com.c.c(151333549214908663L).getInt(this)
               )
               == 0L
            ? 0
            : (var31 < 0L ? -1 : 1);
      }

      if (var9 >= 0) {
         var8 = (Bq_2)com.c.c(293938313616336078L).get(com.c.c(128810952447237716L).get(com.c.c(554051037585710089L).get(this)));
         Object[] var23 = com.c.a(com.c.c(162955545315895464L).get(com.c.c(128810952447237716L).get(com.c.c(554051037585710089L).get(this))));
         Method var30 = com.c.d(176011466134249595L);
         Object[] var28 = var23;
         var23 = var8;
         Method var17 = var30;

         try {
            var17.invoke(var23, var28);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }
}





