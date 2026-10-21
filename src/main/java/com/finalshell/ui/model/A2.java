package com.finalshell.ui.model;

public final class A2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static A2 outer;
   public static A2 palette;
   public static A2 doubleField;
   public static A2 hsbField;
   public static A2 rgbField;
   public static A2 hexField;
   public static A2[] L;
   public static long a;

   public static A2[] values() {
      return (A2[])L.clone();
   }

   public static A2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public A2(String var1, int var2) {
   }

   public static A2[] G() {
      A2[] var10000 = new A2[(int)a];
      var10000[0] = outer;
      var10000[1] = palette;
      var10000[2] = doubleField;
      var10000[3] = hsbField;
      var10000[4] = rgbField;
      var10000[5] = hexField;
      return var10000;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "@T\u0017\u0013\fE0V\u0007BR\u00190\u0011T9\u000bV\\\u00007\tE\u001a[V\u00191\bZ@\u0017\u0013\fE0V";
      int var7 = "@T\u0017\u0013\fE0V\u0007BR\u00190\u0011T9\u000bV\\\u00007\tE\u001a[V\u00191\bZ@\u0017\u0013\fE0V".length();
      char var4 = '\b';
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 5;
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
                        var50 = 55;
                        break;
                     case 1:
                        var50 = 54;
                        break;
                     case 2:
                        var50 = 112;
                        break;
                     case 3:
                        var50 = 80;
                        break;
                     case 4:
                        var50 = 96;
                        break;
                     case 5:
                        var50 = 37;
                        break;
                     default:
                        var50 = 89;
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
                     long var0 = 5835743864236076817L;
                     long var27 = 988449628010901271L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     outer = new A2(var2[5], 0);
                     palette = new A2(var2[1], 1);
                     doubleField = new A2(var2[2], 2);
                     hsbField = new A2(var2[3], 3);
                     rgbField = new A2(var2[0], 4);
                     hexField = new A2(var2[4], 5);
                     L = G();
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

                  var5 = "[W\f\u0012\rD1W\u0005\\G\u00001\u0016";
                  var7 = "[W\f\u0012\rD1W\u0005\\G\u00001\u0016".length();
                  var4 = '\b';
                  var10 = -1;
            }

            var10000 = 4;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}







