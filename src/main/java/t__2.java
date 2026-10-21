import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class t__2 implements zv_2 {
   private static final String a;

   @Override
   public boolean l(Object var1) {
      String var10000 = Km_2.U();
      ck_4 var3 = (ck_4)var1;
      File var10001;
      Object[] var10004 = com.c.f();
      Method var10006 = com.c.d(605430732347023634L);
      Object[] var10005 = var10004;
      ck_4 var25 = var3;
      Method var10003 = var10006;

      try {
         var24 = (String)var10003.invoke(var25, var10005);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10001 = new File(var24);
      File var4 = var10001;
      String var2 = var10000;
      boolean var5 = false;
      boolean var10 = var4.exists();
      if (var2 == null) {
         if (var10) {
            Object[] var11 = com.c.a(var4.getName());
            Method var12 = com.c.d(353935338506646766L);
            Object[] var21 = var11;
            Object var18 = null;

            try {
               var10000 = (String)var12.invoke(var18, var21);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            String var6 = var10000;
            Object[] var14 = com.c.f();
            Method var15 = com.c.d(253808553645062345L);
            var21 = var14;
            var18 = null;

            try {
               var16 = (Boolean)var15.invoke(var18, var21);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            if (var2 != null) {
               return var16;
            }

            if (!var16) {
               return true;
            }

            boolean var26 = var6.toLowerCase().equals(a);
            if (var2 != null) {
               return var26;
            }

            if (var26) {
               var5 = true;
               if (var2 != null) {
                  return true;
               }
            }
         }

         return var5;
      } else {
         return var10;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "h\u0017\u007f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 106;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      } else {
         var6 = 106;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 103;
               break;
            case 1:
               var23 = 5;
               break;
            case 2:
               var23 = 112;
               break;
            case 3:
               var23 = 15;
               break;
            case 4:
               var23 = 63;
               break;
            case 5:
               var23 = 120;
               break;
            default:
               var23 = 43;
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





