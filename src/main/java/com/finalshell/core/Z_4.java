package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.Method;

public class Z_4 {
   public static java.lang.Class C;
   public static Method g;
   public final Object r;

   public Z_4(Object var1) {
      this.r = var1;
   }

   public void V(L_6 var1) {
      boolean var10000 = C_q_2_2.g();
      J_6.o(g, this.r, new Object[]{I_4.h(var1)});
      boolean var2 = var10000;
      if (var2) {
         Ky4.K(new String[4]);
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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
            C = D_8.Z(var0[1]);
            g = D_8.z(C, var0[0], new java.lang.Class[]{L_6.r});
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





