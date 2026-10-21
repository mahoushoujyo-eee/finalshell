package com.finalshell.task;

import com.finalshell.core.Connect5;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LZ3 extends Thread {
   final Connect5 p;
   public final ServerSocket f;
   public static String a;

   LZ3(Connect5 var1, ServerSocket var2) {
      this.p = var1;
      this.f = var2;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = this.f.accept();
            System.out.println(a + var1.getRemoteSocketAddress());
            this.p.p(var1);
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "揔厄辡掉WZ\u0016Q".toCharArray();
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
               var23 = 35;
               break;
            case 1:
               var23 = 1;
               break;
            case 2:
               var23 = 45;
               break;
            case 3:
               var23 = 126;
               break;
            case 4:
               var23 = 55;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 118;
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





