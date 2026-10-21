package com.finalshell.ui.model;

public final class LS {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static LS standalone;
   public static LS attached;

   public static LS[] values() {
      return (LS[])n.clone();
   }

   public static LS valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public LS(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\"[Xt\u000be\u0012>A\\\b0[M{\fl\u001b5";
      int var5 = "\"[Xt\u000be\u0012>A\\\b0[M{\fl\u001b5".length();
      char var2 = '\n';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 66;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 66;
               var10006 = var6;
            } else {
               var13 = 66;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 66;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 19;
                     break;
                  case 1:
                     var29 = 109;
                     break;
                  case 2:
                     var29 = 123;
                     break;
                  case 3:
                     var29 = 88;
                     break;
                  case 4:
                     var29 = 45;
                     break;
                  case 5:
                     var29 = 70;
                     break;
                  default:
                     var29 = 60;
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
            standalone = new LS(var0[0], 0);
            attached = new LS(var0[1], 1);
            n = h();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







