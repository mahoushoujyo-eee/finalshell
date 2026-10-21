package com.finalshell.ui.model;

public final class Ks2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Ks2 Little;
   public static Ks2 Big;
   public static Ks2[] X;

   public static Ks2[] values() {
      return (Ks2[])X.clone();
   }

   public static Ks2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Ks2(String var1, int var2) {
   }

   public static Ks2[] A() {
      return new Ks2[]{Little, Big};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "k(k\u0006e(xo\u001e\u0003";
      int var5 = "k(k\u0006e(xo\u001e\u0003".length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 2;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 2;
               var10006 = var6;
            } else {
               var13 = 2;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 2;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 43;
                     break;
                  case 1:
                     var29 = 67;
                     break;
                  case 2:
                     var29 = 14;
                     break;
                  case 3:
                     var29 = 25;
                     break;
                  case 4:
                     var29 = 112;
                     break;
                  case 5:
                     var29 = 100;
                     break;
                  default:
                     var29 = 111;
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
            Little = new Ks2(var0[1], 0);
            Big = new Ks2(var0[0], 1);
            X = A();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







