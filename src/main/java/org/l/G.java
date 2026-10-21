package org.l;

import java.util.Enumeration;
import java.util.Iterator;

public class G implements Iterator {
   private final Enumeration m;
   private static final String a;

   public G(Enumeration var1) {
      this.m = var1;
   }

   @Override
   public boolean hasNext() {
      return this.m.hasMoreElements();
   }

   @Override
   public Object next() {
      return this.m.nextElement();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException(a);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "%n\u00028u\u001f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 48;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 48;
         var10006 = var0;
      } else {
         var6 = 48;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 48;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 103;
               break;
            case 1:
               var23 = 59;
               break;
            case 2:
               var23 = 95;
               break;
            case 3:
               var23 = 103;
               break;
            case 4:
               var23 = 51;
               break;
            case 5:
               var23 = 74;
               break;
            default:
               var23 = 59;
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





