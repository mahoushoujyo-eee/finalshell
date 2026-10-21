package com.finalshell.ui.model;

public final class Bi2 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Bi2 clock;
   public static Bi2 stopwatch;
   public static Bi2 timer;
   public static String[] k;

   public static Bi2[] values() {
      return (Bi2[])B.clone();
   }

   public static Bi2 valueOf(String var0) {
      return Enum.valueOf(Bi2.class, var0);
   }

   public Bi2(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static void R(String[] var0) {
      k = var0;
   }

   public static String[] Y() {
      return k;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "F77 d\u0005Q25&}\tA*55a<mQ6";
      int var5 = "F77 d\u0005Q25&}\tA*55a<mQ6".length();
      char var2 = 5;
      int var1 = -1;
      R(null);

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 29;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 29;
               var10006 = var6;
            } else {
               var13 = 29;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 29;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 47;
                     break;
                  case 1:
                     var29 = 67;
                     break;
                  case 2:
                     var29 = 71;
                     break;
                  case 3:
                     var29 = 88;
                     break;
                  case 4:
                     var29 = 11;
                     break;
                  case 5:
                     var29 = 64;
                     break;
                  default:
                     var29 = 4;
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
            clock = new Bi2(var0[1], 0);
            stopwatch = new Bi2(var0[2], 1);
            timer = new Bi2(var0[0], 2);
            B = E();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







