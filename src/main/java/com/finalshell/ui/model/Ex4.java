package com.finalshell.ui.model;

public final class Ex4 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Ex4 decrease;
   public static Ex4 increase;

   public static Ex4[] values() {
      return (Ex4[])Y.clone();
   }

   public static Ex4 valueOf(String var0) {
      return Enum.valueOf(Ex4.class, var0);
   }

   public Ex4(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\u000eLGfmr\t\u0002\b\u0003GGfmr\t\u0002";
      int var5 = "\u000eLGfmr\t\u0002\b\u0003GGfmr\t\u0002".length();
      char var2 = '\b';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 110;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 110;
               var10006 = var6;
            } else {
               var13 = 110;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 110;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 9;
                     break;
                  case 1:
                     var29 = 76;
                     break;
                  case 2:
                     var29 = 74;
                     break;
                  case 3:
                     var29 = 122;
                     break;
                  case 4:
                     var29 = 102;
                     break;
                  case 5:
                     var29 = 125;
                     break;
                  default:
                     var29 = 20;
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
            decrease = new Ex4(var0[1], 0);
            increase = new Ex4(var0[0], 1);
            Y = t();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







