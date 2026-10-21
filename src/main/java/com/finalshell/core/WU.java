package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.lang.reflect.InvocationTargetException;

public class WU extends W2 {
   final Ty2 D;
   public static String a;

   WU(Ty2 var1) {
      this.D = var1;
      Object[] var10001 = Registry.packArgs(a);
      long var3 = 241374024532053562L;
      Object[] var2 = var10001;
      Ref.h(241374024532053562L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void O() {
      String[] var1 = KV.b$arrString();
      Object var4 = 372236004790213499L;
      Object var10001 = (String)Ref.g(372236004790213499L, var4);
      if (var1 == null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var6 = 372236004790213499L;
         Registry.packArgs(Ref.g(372236004790213499L, var6));
         long var8 = 492930666611970668L;
         Object var10004 = Ref.h2(492930666611970668L, var8);

         try {
            var10004 = (String[])var10004;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         var10004 = ((Object[])var10004)[0];
         long var11 = 372236004790213499L;
         String var10 = (String)var10004;
         Ref.s(372236004790213499L, var10, var11);
         Object var12 = 372236004790213499L;
         String var10005 = (String)Ref.g(372236004790213499L, var12);
      }

      Object var2 = var10001;
      Object var14 = 476394601477793388L;
      Ref.g(476394601477793388L, var14);
      Object var16 = 347134699669184892L;
      Connect_2 var3 = (Connect_2)((ConnectionProperty)Ref.g(347134699669184892L, var16)).O$QT();
      var3.L((String)var2);
      Object var18 = 476394601477793388L;
      Ref.g(476394601477793388L, var18);
      Object var20 = 260853473545280110L;
      Ref.g(260853473545280110L, var20);
      Object[] var10006 = Registry.packArgs(var2);
      long var23 = 197261518833743144L;
      Object[] var22 = var10006;
      Ref.h(197261518833743144L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "`[2".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 19;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 19;
         var10006 = var0;
      } else {
         var6 = 19;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 19;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 3;
               break;
            case 1:
               var23 = 63;
               break;
            case 2:
               var23 = 69;
               break;
            case 3:
               var23 = 46;
               break;
            case 4:
               var23 = 5;
               break;
            case 5:
               var23 = 44;
               break;
            default:
               var23 = 33;
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





