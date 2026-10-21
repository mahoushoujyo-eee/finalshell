package com.finalshell.core;

import java.util.LinkedHashMap;
import java.util.Map;

@O4(
   Z = "Feature",
   Z = {"type", "id", "bbox", "coordinates", "properties"}
)
public class XQ3 extends XY3 {
   public String L;
   public XY3 H;
   public Map G = new LinkedHashMap();
   public static String a;

   public XQ3() {
      super(a);
   }

   public XY3 a() {
      return this.H;
   }

   public void O(XY3 var1) {
      this.H = var1;
   }

   public Map k() {
      return this.G;
   }

   public void l(Map var1) {
      this.G = var1;
   }

   public String f() {
      return this.L;
   }

   public void K(String var1) {
      this.L = var1;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "2oYA\u0004<K".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 84;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      } else {
         var6 = 84;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 84;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 32;
               break;
            case 1:
               var23 = 94;
               break;
            case 2:
               var23 = 108;
               break;
            case 3:
               var23 = 97;
               break;
            case 4:
               var23 = 37;
               break;
            case 5:
               var23 = 26;
               break;
            default:
               var23 = 122;
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





