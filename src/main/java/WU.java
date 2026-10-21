import com.IR;
import com._y_2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class WU extends W2 {
   final Ty_2 D;
   private static final String a;

   WU(Ty_2 var1) {
      this.D = var1;
      Object[] var10001 = com.c.a(a);
      Method var10003 = com.c.d(241374024532053562L);
      Object[] var10002 = var10001;
      WU var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void O() {
      String[] var1 = KV.b();
      String var10000 = (String)com.c.c(372236004790213499L).get(this);
      if (var1 == null) {
         if (var10000 == null) {
            return;
         }

         Object[] var10001 = com.c.a(com.c.c(372236004790213499L).get(this));
         Method var8 = com.c.d(492930666611970668L);
         Object[] var14 = var10001;
         Object var12 = null;

         try {
            var10001 = (String[])var8.invoke(var12, var14);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         com.c.c(372236004790213499L).set(this, var10001[0]);
         var10000 = (String)com.c.c(372236004790213499L).get(this);
      }

      String var2 = var10000;
      IR var3 = (IR)((_y_2)com.c.c(347134699669184892L).get(com.c.c(476394601477793388L).get(this))).O();
      var3.L(var2);
      var10000 = (String)com.c.c(260853473545280110L).get(com.c.c(476394601477793388L).get(this));
      Object[] var10 = com.c.a(var2);
      Method var15 = com.c.d(197261518833743144L);
      Object[] var13 = var10;
      var10 = var10000;
      Method var7 = var15;

      try {
         var7.invoke(var10, var13);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "`[2".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 19;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 19;
         var10006 = var0;
      } else {
         var6 = 19;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 19;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 3;
               break;
            case 1:
               var23 = 63;
               break;
            case 2:
               var23 = 69;
               break;
            case 3:
               var23 = 46;
               break;
            case 4:
               var23 = 5;
               break;
            case 5:
               var23 = 44;
               break;
            default:
               var23 = 33;
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





