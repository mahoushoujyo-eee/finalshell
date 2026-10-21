package com.finalshell.ui.model;

public final class US {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static US Bash;
   public static US Zsh;
   public static US Unknown;
   public static US[] E;

   public static US[] values() {
      return (US[])E.clone();
   }

   public static US valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public US(String var1, int var2) {
   }

   public static US[] X() {
      return new US[]{Bash, Zsh, Unknown};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u000b\u001b|\u0004\u0013\tgP\u0007\u0004\u0006\u007fV\u0002G0";
      int var5 = "\u000b\u001b|\u0004\u0013\tgP\u0007\u0004\u0006\u007fV\u0002G0".length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 4;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 4;
               var10006 = var6;
            } else {
               var13 = 4;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 4;
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
                     var29 = 108;
                     break;
                  case 2:
                     var29 = 16;
                     break;
                  case 3:
                     var29 = 60;
                     break;
                  case 4:
                     var29 = 105;
                     break;
                  case 5:
                     var29 = 52;
                     break;
                  default:
                     var29 = 90;
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
            Bash = new US(var0[1], 0);
            Zsh = new US(var0[0], 1);
            Unknown = new US(var0[2], 2);
            E = X();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







