import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Wt_2 extends W2 {
   HashMap D;
   HashMap A;
   private static final String a;

   public Wt_2() {
      Object[] var10001 = com.c.a(a);
      Method var10003 = com.c.d(241374024532053562L);
      Object[] var10002 = var10001;
      Wt_2 var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(581222953681728588L).set(this, new HashMap());
      com.c.c(592026883457058334L).set(this, new HashMap());
   }

   @Override
   public void O() {
      String var1 = W2.F();

      try {
         Object[] var10000 = com.c.a(com.c.c(372236004790213499L).get(this));
         Method var14 = com.c.d(492930666611970668L);
         Object[] var25 = var10000;
         Object var20 = null;

         try {
            var10000 = (String[])var14.invoke(var20, var25);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         String[] var2 = var10000;
         int var3 = 0;

         while (var3 < var2.length) {
            String var4 = var2[var3].trim();
            String[] var5 = var4.split(":");
            String var6 = var5[0];
            int var7 = Integer.parseInt(var5[2]);
            int var8 = Integer.parseInt(var5[2]);

            try {
               ((HashMap)com.c.c(581222953681728588L).get(this)).put(var7, var6);
               ((HashMap)com.c.c(592026883457058334L).get(this)).put(var8, var6);
               var10000 = (Object[])com.c.c(254384586786323749L).get(this);
               var20 = com.c.a(com.c.c(581222953681728588L).get(this));
               Method var10003 = com.c.d(616120388513155293L);
               var25 = (Object[])var20;
               var20 = var10000;
               Method var17 = var10003;

               try {
                  var17.invoke(var20, var25);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               var10000 = (Object[])com.c.c(254384586786323749L).get(this);
               var20 = com.c.a(com.c.c(592026883457058334L).get(this));
               var10003 = com.c.d(604464958059400445L);
               var25 = (Object[])var20;
               var20 = var10000;
               Method var19 = var10003;

               try {
                  var19.invoke(var20, var25);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               var3++;
               if (var1 == null || var1 == null) {
                  break;
               }
            } catch (Exception var12) {
               throw a(var12);
            }
         }
      } catch (Exception var13) {
      }
   }

   public HashMap j() {
      return (HashMap)com.c.c(581222953681728588L).get(this);
   }

   public void o(HashMap var1) {
      com.c.c(581222953681728588L).set(this, var1);
   }

   public HashMap q() {
      return (HashMap)com.c.c(592026883457058334L).get(this);
   }

   public void k(HashMap var1) {
      com.c.c(592026883457058334L).set(this, var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "fV=5k<9f\u00189t7*:a".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 100;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 100;
         var10006 = var0;
      } else {
         var6 = 100;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 100;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 97;
               break;
            case 1:
               var23 = 83;
               break;
            case 2:
               var23 = 45;
               break;
            case 3:
               var23 = 113;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 61;
               break;
            default:
               var23 = 41;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





