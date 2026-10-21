package com;

public enum YT {
   MOUSE_REPORTING_NONE, MOUSE_REPORTING_NORMAL, MOUSE_REPORTING_HILITE, MOUSE_REPORTING_BUTTON_MOTION, MOUSE_REPORTING_ALL_MOTION, MOUSE_REPORTING_FOCUS;
   private static String p;
   private static final long a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "YfDtwK?Qy^uf]#SvYn~]9Q\u001dYfDtwK?Qy^uf]#SvSrf@\"Zv\\hf]\"Z\u001aYfDtwK?Qy^uf]#SvPk~K [}Xh|\u0015YfDtwK?Qy^uf]#SvWhqA>";
      int var7 = "YfDtwK?Qy^uf]#SvYn~]9Q\u001dYfDtwK?Qy^uf]#SvSrf@\"Zv\\hf]\"Z\u001aYfDtwK?Qy^uf]#SvPk~K [}Xh|\u0015YfDtwK?Qy^uf]#SvWhqA>".length();
      char var4 = 22;
      c("EvJVKc");
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 16;
         String var10001 = var5.substring(++var10, var10 + var4);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label48;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 4;
                        break;
                     case 1:
                        var50 = 57;
                        break;
                     case 2:
                        var50 = 1;
                        break;
                     case 3:
                        var50 = 55;
                        break;
                     case 4:
                        var50 = 34;
                        break;
                     case 5:
                        var50 = 4;
                        break;
                     default:
                        var50 = 125;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var2[var6++] = var33;
                  if ((var10 += var4) >= var7) {
                     long var0 = 4418713021632058281L;
                     long var27 = 6214231401169261487L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     return;
                  }

                  var4 = var5.charAt(var10);
                  break;
               default:
                  var2[var6++] = var33;
                  if ((var10 += var4) < var7) {
                     var4 = var5.charAt(var10);
                     continue label53;
                  }

                  var5 = "KtVfeY-CkLgtO1AdMznC\u0016KtVfeY-CkLgtO1AdMzrK>J";
                  var7 = "KtVfeY-CkLgtO1AdMznC\u0016KtVfeY-CkLgtO1AdMzrK>J".length();
                  var4 = 20;
                  var10 = -1;
            }

            var10000 = 2;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }

   public static void c(String var0) {
      p = var0;
   }

   public static String M() {
      return p;
   }
}






