package com;

import java.io.IOException;

public class P extends IOException {
   private static final String a;

   public P() {
      super(a);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\n4Q9P-\u0014*\tr#\u0019\n\\!\u00147n\u001f\u000b\u0019o\u001fvw\u0011Y\u0013=[tl\u001e\u0017\u0019,\u000f~l\u001eY\u0015<[{l\u0003\r"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 104;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 104;
         var10006 = var0;
      } else {
         var6 = 104;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 104;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 39;
               break;
            case 1:
               var23 = 19;
               break;
            case 2:
               var23 = 127;
               break;
            case 3:
               var23 = 107;
               break;
            case 4:
               var23 = 24;
               break;
            case 5:
               var23 = 17;
               break;
            default:
               var23 = 20;
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





