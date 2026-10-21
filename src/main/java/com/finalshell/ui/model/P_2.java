package com.finalshell.ui.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class P_2 implements Iterator {
   public static String a;

   P_2() {
   }

   @Override
   public boolean hasNext() {
      return false;
   }

   @Override
   public Object next() {
      throw new NoSuchElementException();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException(a);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "G\u0011P1^b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 52;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 52;
         var10006 = var0;
      } else {
         var6 = 52;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 52;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 1;
               break;
            case 1:
               var23 = 64;
               break;
            case 2:
               var23 = 9;
               break;
            case 3:
               var23 = 106;
               break;
            case 4:
               var23 = 28;
               break;
            case 5:
               var23 = 51;
               break;
            default:
               var23 = 84;
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





