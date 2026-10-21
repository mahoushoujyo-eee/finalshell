package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import java.io.BufferedReader;
import java.io.IOException;

public class YG3 implements Runnable {
   public final BufferedReader Q;
   public static String a;

   public YG3(BufferedReader var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var1 = YT3_2.c();

      try {
         while (true) {
            Object var4 = 352442332962568947L;
            String var2;
            if ((var2 = ((BufferedReader)Ref.g(352442332962568947L, var4)).readLine()) != null) {
               try {
                  System.out.println(a + var2);
                  if (var1 == null) {
                     break;
                  }

                  if (var1 != null) {
                     continue;
                  }
               } catch (IOException var8) {
                  throw new RuntimeException(a(var8));
               }
            }

            Object var6 = 352442332962568947L;
            ((BufferedReader)Ref.g(352442332962568947L, var6)).close();
            break;
         }
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Z\\s7\u0007\"IQK\"x".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 45;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      } else {
         var6 = 45;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 18;
               break;
            case 1:
               var23 = 3;
               break;
            case 2:
               var23 = 44;
               break;
            case 3:
               var23 = 117;
               break;
            case 4:
               var23 = 88;
               break;
            case 5:
               var23 = 99;
               break;
            default:
               var23 = 13;
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





