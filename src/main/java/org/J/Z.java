package org.J;

import java.lang.reflect.Method;
import org.v._q_2;

public class Z {
   private static final Class C;
   private static final Method g;
   private final Object r;

   public Z(Object var1) {
      this.r = var1;
   }

   public void V(org.R.L var1) {
      boolean var10000 = _q_2.g();
      org.w.j.o(g, this.r, new Object[]{org.R.i.h(var1)});
      boolean var2 = var10000;
      if (var2) {
         com.ky_4.K(new String[4]);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "4RzX%T\r\u00178\\~|jB\u0011;Q&n0E\u00003P&N0E\u00003P";
      int var5 = "4RzX%T\r\u00178\\~|jB\u0011;Q&n0E\u00003P&N0E\u00003P".length();
      char var2 = 7;
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
                     var29 = 50;
                     break;
                  case 1:
                     var29 = 93;
                     break;
                  case 2:
                     var29 = 104;
                     break;
                  case 3:
                     var29 = 125;
                     break;
                  case 4:
                     var29 = 36;
                     break;
                  case 5:
                     var29 = 87;
                     break;
                  default:
                     var29 = 5;
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
            C = org.w.d.Z(var0[1]);
            g = org.w.d.z(C, var0[0], new Class[]{org.R.L.r});
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





