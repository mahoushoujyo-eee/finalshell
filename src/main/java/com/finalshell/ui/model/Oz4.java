package com.finalshell.ui.model;

public final class Oz4 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Oz4 SHOWING;
   public static Oz4 HIDDEN;
   public static Oz4 NO_FOCUS;
   public static Oz4[] h;

   public static Oz4[] values() {
      return (Oz4[])h.clone();
   }

   public static Oz4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Oz4(String var1, int var2) {
   }

   public static Oz4[] x() {
      return new Oz4[]{SHOWING, HIDDEN, NO_FOCUS};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "WWxrf\u0013{J\u0007JPhc`\u001ei\u0006QQcpl\u001e";
      int var5 = "WWxrf\u0013{J\u0007JPhc`\u001ei\u0006QQcpl\u001e".length();
      char var2 = '\b';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 57;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 57;
               var10006 = var6;
            } else {
               var13 = 57;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 57;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 32;
                     break;
                  case 1:
                     var29 = 33;
                     break;
                  case 2:
                     var29 = 30;
                     break;
                  case 3:
                     var29 = 13;
                     break;
                  case 4:
                     var29 = 16;
                     break;
                  case 5:
                     var29 = 105;
                     break;
                  default:
                     var29 = 23;
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
            SHOWING = new Oz4(var0[1], 0);
            HIDDEN = new Oz4(var0[2], 1);
            NO_FOCUS = new Oz4(var0[0], 2);
            h = x();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







