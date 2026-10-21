package com.finalshell.ui.model;

public final class Hq2 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Hq2 componentFocus;
   public static Hq2 fieldFocus;

   public static Hq2[] values() {
      return (Hq2[])W.clone();
   }

   public static Hq2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Hq2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\b\r\u0000n\u001c7\u007f\u0005\u0016+q\u0010,i\n\r\u000b\br\u0017\u001fu\b\u0017\u001e";
      int var5 = "\b\r\u0000n\u001c7\u007f\u0005\u0016+q\u0010,i\n\r\u000b\br\u0017\u001fu\b\u0017\u001e".length();
      char var2 = 14;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 60;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 60;
               var10006 = var6;
            } else {
               var13 = 60;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 60;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 87;
                     break;
                  case 1:
                     var29 = 94;
                     break;
                  case 2:
                     var29 = 81;
                     break;
                  case 3:
                     var29 = 34;
                     break;
                  case 4:
                     var29 = 79;
                     break;
                  case 5:
                     var29 = 101;
                     break;
                  default:
                     var29 = 38;
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
            componentFocus = new Hq2(var0[0], 0);
            fieldFocus = new Hq2(var0[1], 1);
            W = k();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







