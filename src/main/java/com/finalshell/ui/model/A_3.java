package com.finalshell.ui.model;

public final class A_3 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static A_3 OR;
   public static A_3 AND;

   public static A_3[] values() {
      return (A_3[])Y.clone();
   }

   public static A_3 valueOf(String var0) {
      return Enum.valueOf(A_3.class, var0);
   }

   public A_3(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "U\u0006p\u0002[\u001a";
      int var5 = "U\u0006p\u0002[\u001a".length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 38;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 38;
               var10006 = var6;
            } else {
               var13 = 38;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 38;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 50;
                     break;
                  case 1:
                     var29 = 110;
                     break;
                  case 2:
                     var29 = 18;
                     break;
                  case 3:
                     var29 = 71;
                     break;
                  case 4:
                     var29 = 109;
                     break;
                  case 5:
                     var29 = 96;
                     break;
                  default:
                     var29 = 62;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            OR = new A_3(var0[1], 0);
            AND = new A_3(var0[0], 1);
            Y = V();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







