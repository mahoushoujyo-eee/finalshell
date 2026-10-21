package com.finalshell.ui.model;

public final class IC3 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static IC3 none;
   public static IC3 fadeIn;
   public static IC3 fadeOut;

   public static IC3[] values() {
      return (IC3[])com.finalshell.reflect.Ref.cloneObject(H);
   }

   public static IC3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public IC3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "#Y\u0004:Y\u0003O\u0004+W\u000e:\u0006#Y\u0004:_\u0018";
      int var5 = "#Y\u0004:Y\u0003O\u0004+W\u000e:\u0006#Y\u0004:_\u0018".length();
      char var2 = 7;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 20;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 20;
               var10006 = var6;
            } else {
               var13 = 20;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 20;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 81;
                     break;
                  case 1:
                     var29 = 44;
                     break;
                  case 2:
                     var29 = 116;
                     break;
                  case 3:
                     var29 = 75;
                     break;
                  case 4:
                     var29 = 2;
                     break;
                  case 5:
                     var29 = 98;
                     break;
                  default:
                     var29 = 47;
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
            none = new IC3(var0[1], 0);
            fadeIn = new IC3(var0[2], 1);
            fadeOut = new IC3(var0[0], 2);
            H = C();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
   private static Object H;
}







