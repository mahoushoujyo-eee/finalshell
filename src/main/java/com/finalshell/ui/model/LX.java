package com.finalshell.ui.model;

public final class LX {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static LX none;
   public static LX united;
   public static LX separated;

   public static LX[] values() {
      return (LX[])a.clone();
   }

   public static LX valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public LX(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "6\u0011W|T\u0006\t0\u001aNiC\u0003f&\u001b\u0004-\u0010Pm";
      int var5 = "6\u0011W|T\u0006\t0\u001aNiC\u0003f&\u001b\u0004-\u0010Pm".length();
      char var2 = 6;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 69;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 69;
               var10006 = var6;
            } else {
               var13 = 69;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 69;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 6;
                     break;
                  case 1:
                     var29 = 58;
                     break;
                  case 2:
                     var29 = 123;
                     break;
                  case 3:
                     var29 = 77;
                     break;
                  case 4:
                     var29 = 116;
                     break;
                  case 5:
                     var29 = 39;
                     break;
                  default:
                     var29 = 87;
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
            none = new LX(var0[2], 0);
            united = new LX(var0[0], 1);
            separated = new LX(var0[1], 2);
            a = x();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







