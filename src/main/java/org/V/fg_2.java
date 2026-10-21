package org.v;

import org.I;

public class fg_2 extends fK {
   public final String[] o;
   private static final String a;
   private static final long b;

   public fg_2(I var1, String[] var2) {
      super(var1);
      this.o = var2;
   }

   @org.F.c
   @Override
   public final Object b(h2 var1) throws Throwable {
      return var1.f(this);
   }

   @Override
   public String toString() {
      return a + RG.N(this.o, ".") + (int)b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "J}\u0007=`@x".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 116;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 116;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 87;
               break;
            case 1:
               var21 = 100;
               break;
            case 2:
               var21 = 3;
               break;
            case 3:
               var21 = 38;
               break;
            case 4:
               var21 = 102;
               break;
            case 5:
               var21 = 64;
               break;
            default:
               var21 = 44;
         }
      } else {
         var13 = 116;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 5112693722136173991L;
            long var12 = -4763891897833103972L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 116;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 87;
               break;
            case 1:
               var21 = 100;
               break;
            case 2:
               var21 = 3;
               break;
            case 3:
               var21 = 38;
               break;
            case 4:
               var21 = 102;
               break;
            case 5:
               var21 = 64;
               break;
            default:
               var21 = 44;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 87;
                  break;
               case 1:
                  var21 = 100;
                  break;
               case 2:
                  var21 = 3;
                  break;
               case 3:
                  var21 = 38;
                  break;
               case 4:
                  var21 = 102;
                  break;
               case 5:
                  var21 = 64;
                  break;
               default:
                  var21 = 44;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 5112693722136173991L;
               long var11 = -4763891897833103972L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 87;
                  break;
               case 1:
                  var21 = 100;
                  break;
               case 2:
                  var21 = 3;
                  break;
               case 3:
                  var21 = 38;
                  break;
               case 4:
                  var21 = 102;
                  break;
               case 5:
                  var21 = 64;
                  break;
               default:
                  var21 = 44;
            }
         }
      }
   }
}





