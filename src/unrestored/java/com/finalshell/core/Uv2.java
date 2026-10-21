package com.finalshell.core;

public class Uv2 {
   public String X = null;
   public boolean M = false;
   public boolean d = true;
   public Object u = null;
   public static String a;

   public Uv2() {
   }

   public Uv2(Object var1) {
      this.u = var1;
   }

   public Uv2(Object var1, boolean var2) {
      this.M = var2;
      this.u = var1;
   }

   public String o() {
      String var1 = com.finalshell.ui.panel.Co2.U$String();
      String var10000 = this.X;
      if (var1 != null) {
         if (this.X == null) {
            this.X = NE.E(a);
         }

         var10000 = this.X;
      }

      return var10000;
   }

   public void O(String var1) {
      this.X = var1;
   }

   public Object g() {
      return this.u;
   }

   public void P(Object var1) {
      this.u = var1;
   }

   public boolean Z() {
      return this.M;
   }

   public void i(boolean var1) {
      this.M = var1;
   }

   public void B$void() {
      String var1 = com.finalshell.ui.panel.Co2.U$String();
      boolean var10001 = this.Z();
      if (var1 != null) {
         var10001 = !var10001;
      }

      this.i(var10001);
   }

   public boolean B$boolean() {
      return this.d;
   }

   public void e(boolean var1) {
      this.d = var1;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "/Cr\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 64;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      } else {
         var6 = 64;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 44;
               break;
            case 1:
               var23 = 65;
               break;
            case 2:
               var23 = 113;
               break;
            case 3:
               var23 = 18;
               break;
            case 4:
               var23 = 93;
               break;
            case 5:
               var23 = 46;
               break;
            default:
               var23 = 78;
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





