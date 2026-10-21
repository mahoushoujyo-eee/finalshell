package com.finalshell.core;

import java.util.ArrayList;
import java.util.List;

@O4(
   Z = "FeatureCollection",
   Z = {"type", "bbox", "coordinates"}
)
public class Xg4 extends XY3 {
   public List n = new ArrayList();
   public static String a;

   public Xg4() {
      super(a);
   }

   public List x() {
      return this.n;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "T\r\u007f%,m8Q\u0007r=<|){\u0007p".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 37;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      } else {
         var6 = 37;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 55;
               break;
            case 1:
               var23 = 77;
               break;
            case 2:
               var23 = 59;
               break;
            case 3:
               var23 = 116;
               break;
            case 4:
               var23 = 124;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 120;
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





