package org.z;

import java.io.IOException;
import java.lang.reflect.Method;
import org.J.Z;

public class a {
   private static final Class z;
   private static final Method a;
   private final Object K;

   public a(Object var1) {
      this.K = var1;
   }

   public Z Y() throws IOException {
      return new Z(org.w.j.o(a, this.K, new Object[0]));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = ")'L\u0001\u001d//I\u0014Ux\u0010+)\u0011\u0018\u0014p\u0004)+\u00118\u0014p\u0004)+m\u0010\u001ap\u00147";
      int var5 = ")'L\u0001\u001d//I\u0014Ux\u0010+)\u0011\u0018\u0014p\u0004)+\u00118\u0014p\u0004)+m\u0010\u001ap\u00147".length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 106;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 106;
               var10006 = var6;
            } else {
               var13 = 106;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 106;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 47;
                     break;
                  case 1:
                     var29 = 36;
                     break;
                  case 2:
                     var29 = 85;
                     break;
                  case 3:
                     var29 = 31;
                     break;
                  case 4:
                     var29 = 17;
                     break;
                  case 5:
                     var29 = 126;
                     break;
                  default:
                     var29 = 27;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            z = org.w.d.Z(var0[1]);
            a = org.w.d.z(z, var0[0], new Class[0]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





