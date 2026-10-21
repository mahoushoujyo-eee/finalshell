package com.finalshell.ui.model;

public final class On4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static On4 MOUSE_FORMAT_XTERM_EXT;
   public static On4 MOUSE_FORMAT_URXVT;
   public static On4 MOUSE_FORMAT_SGR;
   public static On4 MOUSE_FORMAT_XTERM;

   public static On4[] values() {
      return (On4[])com.finalshell.reflect.Ref.cloneObject(G);
   }

   public static On4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public On4(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "`\\IH;S^bAQZ*SKjA\u0012`\\IH;S^bAQZ*S@yVNV";
      int var5 = "`\\IH;S^bAQZ*SKjA\u0012`\\IH;S^bAQZ*S@yVNV".length();
      char var2 = 16;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 11;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 38;
                        break;
                     case 1:
                        var46 = 24;
                        break;
                     case 2:
                        var46 = 23;
                        break;
                     case 3:
                        var46 = 16;
                        break;
                     case 4:
                        var46 = 117;
                        break;
                     case 5:
                        var46 = 7;
                        break;
                     default:
                        var46 = 19;
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
                     MOUSE_FORMAT_XTERM_EXT = new On4(var0[3], 0);
                     MOUSE_FORMAT_URXVT = new On4(var0[2], 1);
                     MOUSE_FORMAT_SGR = new On4(var0[0], 2);
                     MOUSE_FORMAT_XTERM = new On4(var0[1], 3);
                     G = n();
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

                  var3 = "Wk~\u007f\fdiUvfm\u001ddzH|}x\u0016Wk~\u007f\fdiUvfm\u001ddwNaya\u0016~wN";
                  var5 = "Wk~\u007f\fdiUvfm\u001ddzH|}x\u0016Wk~\u007f\fdiUvfm\u001ddwNaya\u0016~wN".length();
                  var2 = 18;
                  var8 = -1;
            }

            var10000 = 60;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
   private static Object G;
}







