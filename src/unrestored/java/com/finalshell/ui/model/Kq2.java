package com.finalshell.ui.model;

public final class Kq2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Kq2 shade;
   public static Kq2 background;
   public static Kq2 backgroundPainter;
   public static Kq2 border;
   public static Kq2[] R;

   public static Kq2[] values() {
      return (Kq2[])R.clone();
   }

   public static Kq2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Kq2(String var1, int var2) {
   }

   public static Kq2[] s() {
      return new Kq2[]{shade, background, backgroundPainter, border};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "b'W\u000e3K\u0019u(P\u0005s.U\u00011";
      int var5 = "b'W\u000e3K\u0019u(P\u0005s.U\u00011".length();
      char var2 = '\n';
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 122;
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
                        var46 = 122;
                        break;
                     case 1:
                        var46 = 60;
                        break;
                     case 2:
                        var46 = 78;
                        break;
                     case 3:
                        var46 = 31;
                        break;
                     case 4:
                        var46 = 46;
                        break;
                     case 5:
                        var46 = 67;
                        break;
                     default:
                        var46 = 12;
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
                     shade = new Kq2(var0[1], 0);
                     background = new Kq2(var0[0], 1);
                     backgroundPainter = new Kq2(var0[2], 2);
                     border = new Kq2(var0[3], 3);
                     R = s();
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

                  var3 = "_\u001aj3\u000ev$H\u0015m\b\bm%I\u001e{\u0006_\u0014{<\fv";
                  var5 = "_\u001aj3\u000ev$H\u0015m\b\bm%I\u001e{\u0006_\u0014{<\fv".length();
                  var2 = 17;
                  var8 = -1;
            }

            var10000 = 71;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







