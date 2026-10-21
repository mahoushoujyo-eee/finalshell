import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class LT implements ActionListener {
   final U a;
   private static final long[] b;
   private static final Long[] c;

   LT(U var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = F8.y();
      long var10001 = System.currentTimeMillis();
      Object var10002 = com.c.c(199832172921665052L).get(null);
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(311260639782144664L);
      Object[] var10004 = var10003;
      var10003 = (Object[])var10002;
      var10002 = var10005;

      try {
         var42 = (Long)var10002.invoke(var10003, var10004);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      label94: {
         long var3 = var10001 - var42;
         String[] var2 = var10000;
         int var13 = ((KQ)com.c.c(199832172921665052L).get(null)).isVisible();
         if (var2 == null) {
            if (var13 != 0) {
               var10000 = (String[])com.c.c(199832172921665052L).get(null);
               Object[] var29 = com.c.f();
               Method var50 = com.c.d(419565703796979209L);
               var10002 = var29;
               Object var30 = var10000;
               Method var15 = var50;

               try {
                  var16 = (Boolean)var15.invoke(var30, (Object[])var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               byte var5 = var16;
               long var56;
               int var17 = (var56 = var3 - a(27195, 8548535950817463058L)) == 0L ? 0 : (var56 < 0L ? -1 : 1);
               if (var2 == null) {
                  if (var17 > 0) {
                     var5 = 1;
                  }

                  var10000 = (String[])com.c.c(199832172921665052L).get(null);
                  Object[] var31 = com.c.f();
                  Method var51 = com.c.d(249886410317960768L);
                  var10002 = var31;
                  Object var32 = var10000;
                  Method var19 = var51;

                  try {
                     var20 = (U)var19.invoke(var32, (Object[])var10002);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  var17 = var20.equals((U)com.c.c(181600139630751244L).get(this));
               }

               if (var2 == null) {
                  if (var17 == 0) {
                     var5 = 1;
                  }

                  var17 = var5;
               }

               label100: {
                  if (var17 != 0) {
                     var10000 = (String[])com.c.c(181600139630751244L).get(this);
                     Object[] var33 = com.c.f();
                     Method var52 = com.c.d(385826789103549433L);
                     var10002 = var33;
                     Object var34 = var10000;
                     Method var22 = var52;

                     try {
                        var22.invoke(var34, (Object[])var10002);
                     } catch (InvocationTargetException var9) {
                        throw var9.getTargetException();
                     }

                     if (var2 == null) {
                        break label100;
                     }
                  }

                  var10000 = (String[])com.c.c(199832172921665052L).get(null);
                  Object[] var35 = com.c.a(false);
                  Method var53 = com.c.d(634601920284847200L);
                  var10002 = var35;
                  Object var36 = var10000;
                  Method var24 = var53;

                  try {
                     var24.invoke(var36, (Object[])var10002);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }
               }

               if (var2 == null) {
                  break label94;
               }
            }

            long var57;
            var13 = (var57 = var3 - a(13008, 746215865339991032L)) == 0L ? 0 : (var57 < 0L ? -1 : 1);
         }

         if (var13 > 0) {
            var10000 = (String[])com.c.c(181600139630751244L).get(this);
            Object[] var37 = com.c.f();
            Method var54 = com.c.d(385826789103549433L);
            var10002 = var37;
            Object var38 = var10000;
            Method var26 = var54;

            try {
               var26.invoke(var38, (Object[])var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }
         }
      }

      var10000 = (String[])com.c.c(199832172921665052L).get(null);
      Object[] var39 = com.c.a(com.c.c(181600139630751244L).get(this));
      Method var55 = com.c.d(324105784334970743L);
      var10002 = var39;
      Object var40 = var10000;
      Method var28 = var55;

      try {
         var28.invoke(var40, (Object[])var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   static {
      long var0 = 8360661401461151461L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "~\\\u001e_B0\u0085ç\u0002¥\u0089\u0018ÃHÜÛ";
      int var5 = "~\\\u001e_B0\u0085ç\u0002¥\u0089\u0018ÃHÜÛ".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      b = var6;
      c = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 24872) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }
}





