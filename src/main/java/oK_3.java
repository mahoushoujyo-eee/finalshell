import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oK_3 implements Runnable {
   final ty_4 q;
   final Qg_2 S;

   oK_3(Qg_2 var1, ty_4 var2) {
      this.S = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      ty_4 var8;
      label52: {
         String var1 = Vn_2.C();
         boolean var10000 = com.c.c(288985563586479085L).get(this) instanceof tQ_3;
         if (var1 == null) {
            if (var10000) {
               var8 = (ty_4)com.c.c(481242388329627461L).get(this);
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(417567863675886752L);
               Object[] var10002 = var10001;
               var10001 = var8;
               Method var7 = var10003;

               try {
                  var7.invoke(var10001, var10002);
               } catch (InvocationTargetException var5) {
                  throw var5.getTargetException();
               }

               if (var1 == null) {
                  return;
               }
            }

            var8 = (ty_4)com.c.c(288985563586479085L).get(this);
            if (var1 != null) {
               break label52;
            }

            var10000 = var8 instanceof ty_4;
         }

         if (!var10000) {
            return;
         }

         var8 = (ty_4)com.c.c(288985563586479085L).get(this);
      }

      ty_4 var2 = var8;
      Object[] var14 = com.c.f();
      Method var20 = com.c.d(542590257020999358L);
      Object[] var18 = var14;
      ty_4 var15 = var2;
      Method var9 = var20;

      try {
         var10 = (Integer)var9.invoke(var15, var18);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      if (var10 == com.c.c(614101277846852824L).getInt(null)) {
         var8 = (ty_4)com.c.c(481242388329627461L).get(this);
         var14 = com.c.f();
         var20 = com.c.d(417567863675886752L);
         var18 = var14;
         var14 = var8;
         Method var12 = var20;

         try {
            var12.invoke(var14, var18);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }
}





