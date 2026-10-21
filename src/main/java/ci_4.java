import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public enum ci_4 {
   fill, align, custom;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u0003V\nxT:\u0004\u0006J\u0015`\u0005\u0001O\u0010kU";
      int var5 = "\u0003V\nxT:\u0004\u0006J\u0015`\u0005\u0001O\u0010kU".length();
      char var2 = 6;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label48: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var20 = 99;
            var10002 = var10003;
            int var11 = var10004;
            byte var23;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var23 = 99;
               var10006 = var6;
            } else {
               var20 = 99;
               var11 = var10004;
               if (var10004 <= var6) {
                  break label48;
               }

               var10005 = var10003;
               var23 = 99;
               var10006 = var6;
            }

            while (true) {
               char var35 = var10005[var10006];
               byte var36;
               switch (var6 % 7) {
                  case 0:
                     var36 = 3;
                     break;
                  case 1:
                     var36 = 64;
                     break;
                  case 2:
                     var36 = 26;
                     break;
                  case 3:
                     var36 = 111;
                     break;
                  case 4:
                     var36 = 88;
                     break;
                  case 5:
                     var36 = 52;
                     break;
                  default:
                     var36 = 115;
               }

               var10005[var10006] = (char)(var35 ^ var23 ^ var36);
               var6++;
               if (var20 == 0) {
                  var10006 = var20;
                  var10005 = var10002;
                  var23 = var20;
               } else {
                  if (var11 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var23 = var20;
                  var10006 = var6;
               }
            }
         }

         String var22 = new String(var10002).intern();
         byte var13 = -1;
         var0[var4++] = var22;
         if ((var1 += var2) >= var5) {
            Object[] var10000 = com.c.f();
            Method var9 = com.c.d(545218802171132370L);
            Object[] var19 = var10000;
            Object var15 = null;

            try {
               var10000 = (ci_4[])var9.invoke(var15, var19);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}






