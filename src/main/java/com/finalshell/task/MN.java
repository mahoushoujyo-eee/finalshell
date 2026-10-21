package com.finalshell.task;

import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public class MN implements Callable {
   final String Q;
   final String R;
   final Ty2 Z;
   public static String a;

   MN(Ty2 var1, String var2, String var3) {
      this.Z = var1;
      this.Q = var2;
      this.R = var3;
   }

   @Override
   public Object call() throws Exception {
      Object var1 = 414699363586462157L;
      Ref.g(414699363586462157L, var1);
      Object var3 = 334535388556626563L;
      Object var10004 = Ref.g(334535388556626563L, var3);
      Object var5 = 346354231886387055L;
      var10004 = Registry.packArgs(var10004, this, Ref.g(346354231886387055L, var5));
      long var8 = 543008358971428048L;
      Object[] var7 = (Object[])var10004;
      Ref.h(543008358971428048L, var7, var8);

      try {
         return null;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





