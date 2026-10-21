package org.z;

import java.io.IOException;
import java.lang.reflect.Method;
import org.h.x_3;

public class D {
   private static final Class f;
   private static final Method R;
   private static final Method Z;
   private final Object F;
   private static String[] X;

   public D(Object var1) {
      this.F = var1;
   }

   public x_3 H() {
      String[] var1 = b();
      x_3 var10000 = new x_3(org.w.j.o(R, this.F, new Object[0]));
      if (com.ky_4.F() != null) {
         T(new String[4]);
      }

      return var10000;
   }

   public a G() throws IOException {
      String[] var1 = b();

      try {
         a var10000 = new a(org.w.j.o(Z, this.F, new Object[0]));
         if (var1 == null) {
            com.ky_4.K(new String[2]);
         }

         return var10000;
      } catch (IOException var2) {
         throw a(var2);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "0S+aD-\f2 6]>a\u001e(\u00022[fm_ \u00160YfM_ \u00160Y\u001aeV!\u00119R+e\u00043L-n";
      int var5 = "0S+aD-\f2 6]>a\u001e(\u00022[fm_ \u00160YfM_ \u00160Y\u001aeV!\u00119R+e\u00043L-n".length();
      String[] var10000 = new String[5];
      char var2 = '\b';
      T(var10000);
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 96;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 96;
               var10006 = var6;
            } else {
               var13 = 96;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 96;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 60;
                     break;
                  case 1:
                     var29 = 92;
                     break;
                  case 2:
                     var29 = 40;
                     break;
                  case 3:
                     var29 = 96;
                     break;
                  case 4:
                     var29 = 80;
                     break;
                  case 5:
                     var29 = 36;
                     break;
                  default:
                     var29 = 3;
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
            f = org.w.d.Z(var0[1]);
            R = org.w.d.z(f, var0[0], new Class[0]);
            Z = org.w.d.z(f, var0[2], new Class[0]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public static void T(String[] var0) {
      X = var0;
   }

   public static String[] b() {
      return X;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





