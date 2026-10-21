package com.finalshell.core;

import java.util.ArrayList;
import java.util.List;

public final class RN_2 extends R8_2 {
   public final List D = new ArrayList();
   public static String d;

   public RN_2(com.finalshell.ui.model.I var1) {
      super(var1);
   }

   public void q(C_r_2 var1) {
      this.D.add(var1);
      var1.G(this);
   }

   public void q(List var1) {
      String[] var10000 = RG_2.C();
      this.D.addAll(var1);
      String[] var2 = var10000;

      for (C_r_2 var4 : var1) {
         var4.G(this);
         if (var2 == null) {
            break;
         }
      }
   }

   public C_r_2[] a() {
      return this.D.toArray(new C_r_2[this.D.size()]);
   }

   @C_9
   @Override
   public Object R(H_4_2 var1) throws Throwable {
      return var1.G(this);
   }

   @Override
   public String toString() {
      return d;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "[s-&jh\u0010".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 40;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 40;
         var10006 = var0;
      } else {
         var6 = 40;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 40;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 8;
               break;
            case 1:
               var23 = 123;
               break;
            case 2:
               var23 = 43;
               break;
            case 3:
               var23 = 32;
               break;
            case 4:
               var23 = 108;
               break;
            case 5:
               var23 = 96;
               break;
            default:
               var23 = 69;
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
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





