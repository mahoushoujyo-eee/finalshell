import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class dv_4 implements zv_2 {
   private static final String a;

   @Override
   public boolean l(Object var1) {
      ck_4 var3 = (ck_4)var1;
      File var10000;
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(605430732347023634L);
      Object[] var10004 = var10003;
      ck_4 var19 = var3;
      Method var10002 = var10005;

      try {
         var16 = (String)var10002.invoke(var19, var10004);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10000 = new File(var16);
      File var4 = var10000;
      com.ky_4[] var9 = Vk_2.y();
      boolean var5 = false;
      com.ky_4[] var2 = var9;
      boolean var10 = var4.exists();
      if (var2 != null) {
         if (var10) {
            Object[] var11 = com.c.a(var4.getName());
            Method var12 = com.c.d(353935338506646766L);
            Object[] var18 = var11;
            Object var15 = null;

            try {
               var13 = (String)var12.invoke(var15, var18);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            String var6 = var13;
            boolean var14 = var6.toLowerCase().equals(a);
            if (var2 == null) {
               return var14;
            }

            if (!var14) {
               return false;
            }

            var5 = true;
            if (var2 == null) {
               return false;
            }
         }

         return var5;
      } else {
         return var10;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "l\u001b\u0003?".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 122;
               break;
            case 1:
               var23 = 20;
               break;
            case 2:
               var23 = 16;
               break;
            case 3:
               var23 = 45;
               break;
            case 4:
               var23 = 67;
               break;
            case 5:
               var23 = 52;
               break;
            default:
               var23 = 125;
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





