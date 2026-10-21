package com.finalshell.ui.model;

public final class GV {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static GV ESCAPE;
   public static GV DATA;
   public static GV HEADER;
   public static GV CANCEL;
   public static GV FINISH;
   public static String i;

   public static GV[] values() {
      return (GV[])c.clone();
   }

   public static GV valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public GV(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static void V(String var0) {
      i = var0;
   }

   public static String b() {
      return i;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "\u0000'^\u0000&[\u0006\u0003=S\b%V\u0006\r1\\\u00053L";
      int var5 = "\u0000'^\u0000&[\u0006\u0003=S\b%V\u0006\r1\\\u00053L".length();
      V(null);
      char var2 = 6;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 2;
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
                        var46 = 71;
                        break;
                     case 1:
                        var46 = 118;
                        break;
                     case 2:
                        var46 = 31;
                        break;
                     case 3:
                        var46 = 67;
                        break;
                     case 4:
                        var46 = 116;
                        break;
                     case 5:
                        var46 = 28;
                        break;
                     default:
                        var46 = 10;
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
                     ESCAPE = new GV(var0[0], 0);
                     DATA = new GV(var0[4], 1);
                     HEADER = new GV(var0[2], 2);
                     CANCEL = new GV(var0[3], 3);
                     FINISH = new GV(var0[1], 4);
                     c = q();
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

                  var3 = "kX>o^?\u0004lX$m";
                  var5 = "kX>o^?\u0004lX$m".length();
                  var2 = 6;
                  var8 = -1;
            }

            var10000 = 111;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







