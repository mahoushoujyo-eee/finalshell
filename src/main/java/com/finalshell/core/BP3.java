package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import org.apache.hc.client5.http.SystemDefaultDnsResolver;

public class BP3 extends SystemDefaultDnsResolver {
   public final U52 k;
   public static String a;

   public BP3(U52 var1) {
      this.k = var1;
   }

   @Override
   public InetAddress[] resolve(String var1) {
      InetAddress[] var2 = null;

      try {
         new StringBuilder();
         Object var10001 = Registry.packArgs(5);
         long var4 = 502006739469260406L;
         Object var10002 = Ref.h2(502006739469260406L, var4);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         ((java.lang.StringBuilder)var10001).append((String)var10002);
         var10002 = Registry.packArgs(a);
         long var6 = 517287540690064504L;
         Object var10003 = Ref.h2(517287540690064504L, var6);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         String var3 = ((java.lang.StringBuilder)var10002).append((String)var10003).toString();
         Object var8 = 526415368393605621L;
         Object var10004 = Ref.g(526415368393605621L, var8);
         Object var10 = 623538750367053717L;
         if (var10004.equals((String)Ref.g(623538750367053717L, var10))) {
            var2 = super.resolve(var3);
         } else {
            var2 = super.resolve(var1);
         }
      } catch (Exception var14) {
      }

      return var2;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "@<\"j%PF9m\u000e^\bixb;\u001an,NjUX\u0007U\u0017xg@T\u001f2^YS\"?9\\>p@NC\u0004M\"9".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 6;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 6;
         var10006 = var0;
      } else {
         var6 = 6;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 6;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 16;
               break;
            case 1:
               var23 = 8;
               break;
            case 2:
               var23 = 75;
               break;
            case 3:
               var23 = 2;
               break;
            case 4:
               var23 = 104;
               break;
            case 5:
               var23 = 14;
               break;
            default:
               var23 = 47;
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





