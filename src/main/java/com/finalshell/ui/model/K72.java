package com.finalshell.ui.model;

public final class K72 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static K72 rgb;
   public static K72 hex;

   public static K72[] values() {
      return (K72[])c.clone();
   }

   public static K72 valueOf(String var0) {
      return Enum.valueOf(K72.class, var0);
   }

   public K72(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "2\u000fb\u0003(\rx";
      int var5 = "2\u000fb\u0003(\rx".length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 123;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 123;
               var10006 = var6;
            } else {
               var13 = 123;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 123;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 33;
                     break;
                  case 1:
                     var29 = 17;
                     break;
                  case 2:
                     var29 = 97;
                     break;
                  case 3:
                     var29 = 2;
                     break;
                  case 4:
                     var29 = 19;
                     break;
                  case 5:
                     var29 = 82;
                     break;
                  default:
                     var29 = 81;
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
            rgb = new K72(var0[1], 0);
            hex = new K72(var0[0], 1);
            c = h();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







