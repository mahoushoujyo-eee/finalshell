package com.finalshell.core;

import com.finalshell.io.YM3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class GH implements Ak2 {
   public final Member P;
   public static GH T;
   public static String a;

   public GH() {
      this.P = null;
   }

   public GH(Member var1) {
      this.P = var1;
   }

   @Override
   public void u(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      String var6 = Nv4.o();
      if (this.P == null) {
         YM3 var12 = var1.w;
         var12.V((Enum)var2);
      } else {
         Object var7 = null;

         try {
            label29: {
               label28: {
                  Object var10000;
                  label27: {
                     try {
                        var10000 = this.P;
                        if (var6 == null) {
                           break label27;
                        }

                        if (this.P instanceof Field) {
                           break label28;
                        }
                     } catch (Exception var9) {
                        throw new RuntimeException(a(var9));
                     }

                     var10000 = ((Method)this.P).invoke(var2);
                  }

                  var7 = var10000;
                  break label29;
               }

               var7 = ((Field)this.P).get(var2);
            }
         } catch (Exception var10) {
            throw new Hi2(a, var10);
         }

         var1.B(var7);
      }
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "[|0r\u0000tujx(B\u000b!}Nk+E".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 58;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      } else {
         var6 = 58;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            T = new GH();
            return;
         }

         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 6;
               break;
            case 1:
               var23 = 35;
               break;
            case 2:
               var23 = 126;
               break;
            case 3:
               var23 = 13;
               break;
            case 4:
               var23 = 84;
               break;
            case 5:
               var23 = 59;
               break;
            default:
               var23 = 34;
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
               T = new GH();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





