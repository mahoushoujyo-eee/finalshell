import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class mN implements Callable {
   final String Q;
   final String R;
   final Ty_2 Z;
   private static final String a;

   mN(Ty_2 var1, String var2, String var3) {
      this.Z = var1;
      this.Q = var2;
      this.R = var3;
   }

   @Override
   public Object call() throws Exception {
      Method var10000 = (Method)com.c.c(414699363586462157L).get(this);
      Object[] var10001 = com.c.a(a, com.c.c(334535388556626563L).get(this), com.c.c(346354231886387055L).get(this));
      Method var10003 = com.c.d(543008358971428048L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
         return null;
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Jub\u0016qU\"\fvg\u0014s\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 82;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      } else {
         var6 = 82;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 54;
               break;
            case 1:
               var23 = 65;
               break;
            case 2:
               var23 = 89;
               break;
            case 3:
               var23 = 42;
               break;
            case 4:
               var23 = 66;
               break;
            case 5:
               var23 = 107;
               break;
            default:
               var23 = 3;
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





