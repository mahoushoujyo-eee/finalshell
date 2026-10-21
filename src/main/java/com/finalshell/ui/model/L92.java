package com.finalshell.ui.model;

public final class L92 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static L92 menuBarMenu;
   public static L92 menuBarSubMenu;
   public static L92 comboBoxMenu;
   public static L92 customPopupMenu;

   public static L92[] values() {
      return (L92[])s.clone();
   }

   public static L92 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public L92(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "a\u001dmDb\u001fBm\u0018k@@\u0017|w\u000eo\rpEO\u0013`Q\u001d|}h\u001cg";
      int var5 = "a\u001dmDb\u001fBm\u0018k@@\u0017|w\u000eo\rpEO\u0013`Q\u001d|}h\u001cg".length();
      char var2 = 15;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 22;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label48: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 20;
                        break;
                     case 1:
                        var46 = 126;
                        break;
                     case 2:
                        var46 = 8;
                        break;
                     case 3:
                        var46 = 38;
                        break;
                     case 4:
                        var46 = 27;
                        break;
                     case 5:
                        var46 = 100;
                        break;
                     default:
                        var46 = 4;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var29;
                  if ((var8 += var2) >= var5) {
                     menuBarMenu = new L92(var0[2], 0);
                     menuBarSubMenu = new L92(var0[1], 1);
                     comboBoxMenu = new L92(var0[3], 2);
                     customPopupMenu = new L92(var0[0], 3);
                     s = X();
                     return;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var29;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "(J7\u0002\bT'\bJ7\u0002\f&@4\u0015%w:=b<\u0019?";
                  var5 = "(J7\u0002\bT'\bJ7\u0002\f&@4\u0015%w:=b<\u0019?".length();
                  var2 = 11;
                  var8 = -1;
            }

            var10000 = 81;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







