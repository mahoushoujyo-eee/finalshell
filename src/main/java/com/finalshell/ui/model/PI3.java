package com.finalshell.ui.model;

public final class PI3 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static PI3 simple;
   public static PI3 gradient;
   public static String[] L;

   public static PI3[] values() {
      return (PI3[])H.clone();
   }

   public static PI3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public PI3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static void t(String[] var0) {
      L = var0;
   }

   public static String[] v() {
      return L;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      t(null);
      String var3 = "{\u0004vEK5@h\u0006o\u001fzQN5";
      int var5 = "{\u0004vEK5@h\u0006o\u001fzQN5".length();
      char var2 = '\b';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 73;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 73;
               var10006 = var6;
            } else {
               var13 = 73;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 73;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 85;
                     break;
                  case 1:
                     var29 = 63;
                     break;
                  case 2:
                     var29 = 94;
                     break;
                  case 3:
                     var29 = 104;
                     break;
                  case 4:
                     var29 = 107;
                     break;
                  case 5:
                     var29 = 25;
                     break;
                  default:
                     var29 = 103;
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
            simple = new PI3(var0[1], 0);
            gradient = new PI3(var0[0], 1);
            H = Q();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







