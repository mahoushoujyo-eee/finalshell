import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Y2 implements ActionListener {
   final FK y;
   private static final long a;

   Y2(FK var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = FK.i();
      long var10001 = System.currentTimeMillis();
      Object var10002 = com.c.c(603322144267344178L).get(this);
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(598310545867820014L);
      Object[] var10004 = var10003;
      var10003 = (Object[])var10002;
      var10002 = var10005;

      try {
         var35 = (Long)var10002.invoke(var10003, var10004);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      label81: {
         label82: {
            String[] var2;
            label83: {
               long var3 = var10001 - var35;
               var2 = var10000;
               var12 = ((FK)com.c.c(603322144267344178L).get(this)).isVisible();
               if (var2 == null) {
                  if (var12 != 0) {
                     var10000 = (String[])com.c.c(603322144267344178L).get(this);
                     Object[] var24 = com.c.f();
                     Method var42 = com.c.d(496821856781947383L);
                     var10002 = var24;
                     Object var25 = var10000;
                     Method var14 = var42;

                     try {
                        var14.invoke(var25, (Object[])var10002);
                     } catch (InvocationTargetException var10) {
                        throw var10.getTargetException();
                     }

                     if (var2 == null) {
                        break label83;
                     }
                  }

                  long var47;
                  var12 = (var47 = var3 - a) == 0L ? 0 : (var47 < 0L ? -1 : 1);
               }

               if (var2 != null) {
                  break label82;
               }

               if (var12 > 0) {
                  var10000 = (String[])com.c.c(603322144267344178L).get(this);
                  Object[] var26 = com.c.f();
                  Method var43 = com.c.d(306221011327708335L);
                  var10002 = var26;
                  Object var27 = var10000;
                  Method var16 = var43;

                  try {
                     var16.invoke(var27, (Object[])var10002);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }

                  var10000 = (String[])com.c.c(603322144267344178L).get(this);
                  Object[] var28 = com.c.f();
                  Method var44 = com.c.d(612990022110170911L);
                  var10002 = var28;
                  Object var29 = var10000;
                  Method var18 = var44;

                  try {
                     var18.invoke(var29, (Object[])var10002);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }
               }
            }

            var19 = (FK)com.c.c(603322144267344178L).get(this);
            if (var2 != null) {
               break label81;
            }

            var12 = com.c.c(433591404553967252L).getBoolean(var19);
         }

         if (var12 != 0) {
            var10000 = (String[])com.c.c(603322144267344178L).get(this);
            Object[] var30 = com.c.a(true);
            Method var45 = com.c.d(464995000560394494L);
            var10002 = var30;
            Object var31 = var10000;
            Method var21 = var45;

            try {
               var21.invoke(var31, (Object[])var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }
         }

         var19 = (FK)com.c.c(603322144267344178L).get(this);
      }

      Object[] var32 = com.c.f();
      Method var46 = com.c.d(590715370702654304L);
      var10002 = var32;
      FK var33 = var19;
      Method var22 = var46;

      try {
         var23 = (Rectangle)var22.invoke(var33, (Object[])var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Rectangle var5 = var23;
      ((FK)com.c.c(603322144267344178L).get(this)).setBounds(var5);
   }

   static {
      long var0 = 7647438739696825250L;
      long var10002 = 7647438739696825176L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





