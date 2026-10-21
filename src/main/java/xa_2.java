import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class xa_2 implements DocumentListener {
   final FK u;

   xa_2(FK var1) {
      this.u = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      FK var13;
      label65: {
         String[] var2 = FK.i();
         boolean var10000 = com.c.c(187877731600446636L).getBoolean(com.c.c(402898185977671634L).get(this));
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            com.c.c(410723057057853227L).setBoolean(com.c.c(402898185977671634L).get(this), true);
            var13 = (FK)com.c.c(402898185977671634L).get(this);
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(306221011327708335L);
            Object[] var10002 = var10001;
            var10001 = var13;
            Method var8 = var10003;

            try {
               var8.invoke(var10001, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(612990022110170911L);
            var10002 = var10001;
            var10001 = var13;
            Method var10 = var10003;

            try {
               var10.invoke(var10001, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(260951206679444801L);
            var10002 = var10001;
            var10001 = var13;
            Method var12 = var10003;

            try {
               var12.invoke(var10001, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            if (var2 != null) {
               break label65;
            }

            var10000 = com.c.c(546619646805113494L).getBoolean(var13);
         }

         if (var10000) {
            var13 = (FK)com.c.c(402898185977671634L).get(this);
            if (var2 != null) {
               break label65;
            }

            if (((Dv_2)com.c.c(265132846717086219L).get(var13)).getText().length() <= 0) {
               return;
            }
         }

         var13 = (FK)com.c.c(402898185977671634L).get(this);
      }

      Object[] var20 = com.c.f();
      Method var27 = com.c.d(587140723221156561L);
      Object[] var24 = var20;
      FK var21 = var13;
      Method var14 = var27;

      try {
         var14.invoke(var21, var24);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      String[] var2 = FK.i();
      boolean var10000 = com.c.c(210701759688696485L).getBoolean(com.c.c(402898185977671634L).get(this));
      if (var2 == null) {
         if (var10000) {
            com.c.c(210701759688696485L).setBoolean(com.c.c(402898185977671634L).get(this), false);
            return;
         }

         var10000 = com.c.c(187877731600446636L).getBoolean(com.c.c(402898185977671634L).get(this));
      }

      if (var2 == null) {
         if (!var10000) {
            return;
         }

         com.c.c(410723057057853227L).setBoolean(com.c.c(402898185977671634L).get(this), true);
         Object var7 = com.c.c(402898185977671634L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(306221011327708335L);
         Object[] var10002 = var10001;
         var10001 = (Object[])var7;
         Method var8 = var10003;

         try {
            var8.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10000 = com.c.c(278860969542151097L).getBoolean(com.c.c(402898185977671634L).get(this));
      }

      label79: {
         if (var2 == null) {
            if (!var10000) {
               Object var9 = com.c.c(402898185977671634L).get(this);
               Object[] var16 = com.c.f();
               Method var25 = com.c.d(612990022110170911L);
               Object[] var22 = var16;
               var16 = (Object[])var9;
               Method var10 = var25;

               try {
                  var10.invoke(var16, var22);
               } catch (InvocationTargetException var5) {
                  throw var5.getTargetException();
               }
            }

            com.c.c(278860969542151097L).setBoolean(com.c.c(402898185977671634L).get(this), false);
            Object var11 = com.c.c(402898185977671634L).get(this);
            Object[] var18 = com.c.f();
            Method var26 = com.c.d(260951206679444801L);
            Object[] var23 = var18;
            var18 = (Object[])var11;
            Method var12 = var26;

            try {
               var12.invoke(var18, var23);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            if (var2 != null) {
               break label79;
            }

            var10000 = com.c.c(546619646805113494L).getBoolean(var13);
         }

         if (var10000) {
            var13 = (FK)com.c.c(402898185977671634L).get(this);
            if (var2 != null) {
               break label79;
            }

            if (((Dv_2)com.c.c(265132846717086219L).get(var13)).getText().length() <= 0) {
               return;
            }
         }

         var13 = (FK)com.c.c(402898185977671634L).get(this);
      }

      Object[] var20 = com.c.f();
      Method var27 = com.c.d(587140723221156561L);
      Object[] var24 = var20;
      FK var21 = var13;
      Method var14 = var27;

      try {
         var14.invoke(var21, var24);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      FK var13;
      label65: {
         String[] var2 = FK.i();
         boolean var10000 = com.c.c(187877731600446636L).getBoolean(com.c.c(402898185977671634L).get(this));
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            com.c.c(410723057057853227L).setBoolean(com.c.c(402898185977671634L).get(this), true);
            var13 = (FK)com.c.c(402898185977671634L).get(this);
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(306221011327708335L);
            Object[] var10002 = var10001;
            var10001 = var13;
            Method var8 = var10003;

            try {
               var8.invoke(var10001, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(612990022110170911L);
            var10002 = var10001;
            var10001 = var13;
            Method var10 = var10003;

            try {
               var10.invoke(var10001, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(260951206679444801L);
            var10002 = var10001;
            var10001 = var13;
            Method var12 = var10003;

            try {
               var12.invoke(var10001, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            var13 = (FK)com.c.c(402898185977671634L).get(this);
            if (var2 != null) {
               break label65;
            }

            var10000 = com.c.c(546619646805113494L).getBoolean(var13);
         }

         if (var10000) {
            var13 = (FK)com.c.c(402898185977671634L).get(this);
            if (var2 != null) {
               break label65;
            }

            if (((Dv_2)com.c.c(265132846717086219L).get(var13)).getText().length() <= 0) {
               return;
            }
         }

         var13 = (FK)com.c.c(402898185977671634L).get(this);
      }

      Object[] var20 = com.c.f();
      Method var27 = com.c.d(587140723221156561L);
      Object[] var24 = var20;
      FK var21 = var13;
      Method var14 = var27;

      try {
         var14.invoke(var21, var24);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





