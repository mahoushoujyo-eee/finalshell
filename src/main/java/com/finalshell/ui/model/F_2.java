package com.finalshell.ui.model;

public final class F_2 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static F_2 NAMED_TYPE_DECLARATION;
   public static F_2 COMPILATION_UNIT;
   public static F_2[] k;

   public static F_2[] values() {
      return (F_2[])k.clone();
   }

   public static F_2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public F_2(String var1, int var2) {
   }

   public static F_2[] R() {
      return new F_2[]{NAMED_TYPE_DECLARATION, COMPILATION_UNIT};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "y\u000e(Tc){n\u001f Nc3l{\u000e7Ps?`y\u0010t\u0000(An:nc\u0006*_x#a~\u001b";
      int var5 = "y\u000e(Tc){n\u001f Nc3l{\u000e7Ps?`y\u0010t\u0000(An:nc\u0006*_x#a~\u001b".length();
      char var2 = 22;
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
                     var29 = 126;
                     break;
                  case 1:
                     var29 = 6;
                     break;
                  case 2:
                     var29 = 44;
                     break;
                  case 3:
                     var29 = 88;
                     break;
                  case 4:
                     var29 = 110;
                     break;
                  case 5:
                     var29 = 63;
                     break;
                  default:
                     var29 = 102;
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
            NAMED_TYPE_DECLARATION = new F_2(var0[0], 0);
            COMPILATION_UNIT = new F_2(var0[1], 1);
            k = R();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







