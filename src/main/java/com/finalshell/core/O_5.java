package com.finalshell.core;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class O_5 extends U2_3 {
   final ClassLoader u;
   public static String b;

   O_5(ClassLoader var1) {
      this.u = var1;
   }

   @C_9
   @Override
   public N_6 J(String var1) {
      label17: {
         int[] var2 = F_6.h();
         String var10000 = var1;
         if (var2 == null) {
            if (!var1.startsWith("/")) {
               break label17;
            }

            var10000 = var1.substring(1);
         }

         var1 = var10000;
      }

      URL var3 = this.u.getResource(var1);
      return var3 == null ? null : E_2_4.v(var3, var1);
   }

   @C_9
   @Override
   public Iterable E(String var1, boolean var2) throws IOException {
      Map var4 = K2_5.D(this.u, var1, false, var2);
      ArrayList var5 = new ArrayList(var4.size());
      int[] var10000 = F_6.h();
      Iterator var6 = var4.entrySet().iterator();
      int[] var3 = var10000;

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         String var8 = (String)var7.getKey();
         URL var9 = (URL)var7.getValue();

         label26: {
            try {
               boolean var11 = var8.endsWith(b);
               if (var3 != null) {
                  break label26;
               }

               if (!var11) {
                  continue;
               }
            } catch (IOException var10) {
               throw a(var10);
            }

            var5.add(E_2_4.v(var9, var8));
         }

         if (var3 != null) {
            break;
         }
      }

      return var5;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001ao\u0010\u000b\u0012\u000b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 123;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      } else {
         var6 = 123;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 79;
               break;
            case 1:
               var23 = 119;
               break;
            case 2:
               var23 = 7;
               break;
            case 3:
               var23 = 17;
               break;
            case 4:
               var23 = 26;
               break;
            case 5:
               var23 = 3;
               break;
            default:
               var23 = 1;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





