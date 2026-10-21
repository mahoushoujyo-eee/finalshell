package com.finalshell.ui.model;

public final class WF3 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static WF3 User;
   public static WF3 Remote;

   public static WF3[] values() {
      return (WF3[])y.clone();
   }

   public static WF3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public WF3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "@Q\u0012_/\u0016\u0004GG\u001aB";
      int var5 = "@Q\u0012_/\u0016\u0004GG\u001aB".length();
      char var2 = 6;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 117;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 117;
               var10006 = var6;
            } else {
               var13 = 117;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 117;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 103;
                     break;
                  case 1:
                     var29 = 65;
                     break;
                  case 2:
                     var29 = 10;
                     break;
                  case 3:
                     var29 = 69;
                     break;
                  case 4:
                     var29 = 46;
                     break;
                  case 5:
                     var29 = 6;
                     break;
                  default:
                     var29 = 115;
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
            User = new WF3(var0[1], 0);
            Remote = new WF3(var0[0], 1);
            y = v();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







