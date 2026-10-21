package com.finalshell.core;

import com.finalshell.ui.model.U0;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.awt.Color;

public class Pb2 extends AbstractSingleValueConverter {
   public static U0 F;
   public static long a;

   @Override
   public boolean canConvert(java.lang.Class var1) {
      return var1.equals(Color.class);
   }

   @Override
   public Object fromString(String var1) {
      return f(var1);
   }

   @Override
   public String toString(Object var1) {
      Color var2 = (Color)var1;
      return h(var2);
   }

   public static Color f(String var0) {
      int[] var1 = com.finalshell.ui.model.F2.T();
      boolean var10000 = F.d(var0);
      if (var1 != null) {
         if (var10000) {
            return (Color)F.Q$Object(var0);
         }

         if (var1 == null) {
            return P9.u(var0);
         }

         var10000 = var0.contains("#");
      }

      return var10000 ? P9.C(var0) : P9.u(var0);
   }

   public static String h(Color var0) {
      int[] var1 = com.finalshell.ui.model.F2.T();
      U0 var10000 = F;
      Color var10001 = var0;
      if (var1 != null) {
         if (!F.A$boolean(var0)) {
            StringBuilder var3 = new StringBuilder().append(var0.getRed()).append(",").append(var0.getGreen());
            String var4 = ",";
            if (var1 != null) {
               var3 = var3.append(",").append(var0.getBlue());
               var4 = var0.getAlpha() < (int)a ? "," + var0.getAlpha() : "";
            }

            return var3.append(var4).toString();
         }

         var10000 = F;
         var10001 = var0;
      }

      return (String)var10000.A$Object(var10001);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var2 = new String[14];
      int var6 = 0;
      String var5 = "\u00166x}\"!\u0005\u001b(xp.\u0005\u001e6|v+\u0004\u001b(lv\t\u0015-~{1\u0003w\u0018=\u0006\u0000!u\u007f*3\u0004\t-wx\u0005\u000e,pg \b\u001d%kx\u00026d\u0000\u0004\u00171u\u007f\u0004\u001e6xj\u0004\u001a=x}";
      int var7 = "\u00166x}\"!\u0005\u001b(xp.\u0005\u001e6|v+\u0004\u001b(lv\t\u0015-~{1\u0003w\u0018=\u0006\u0000!u\u007f*3\u0004\t-wx\u0005\u000e,pg \b\u001d%kx\u00026d\u0000\u0004\u00171u\u007f\u0004\u001e6xj\u0004\u001a=x}"
         .length();
      char var4 = 6;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 100;
         String var10001 = var5.substring(++var10, var10 + var4);
         byte var10002 = -1;

         while (true) {
      char[] var23;
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
                        var50 = 29;
                        break;
                     case 1:
                        var50 = 32;
                        break;
                     case 2:
                        var50 = 125;
                        break;
                     case 3:
                        var50 = 119;
                        break;
                     case 4:
                        var50 = 33;
                        break;
                     case 5:
                        var50 = 32;
                        break;
                     default:
                        var50 = 97;
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
                     long var0 = 1318965192185600357L;
                     long var27 = -4538647141814117990L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     F = new U0();
                     F.A(var2[9], null);
                     F.A(var2[1], Color.BLACK);
                     F.A(var2[7], Color.WHITE);
                     F.A(var2[12], Color.RED);
                     F.A(var2[2], Color.GREEN);
                     F.A(var2[3], Color.BLUE);
                     F.A(var2[4], Color.LIGHT_GRAY);
                     F.A(var2[10], Color.GRAY);
                     F.A(var2[8], Color.DARK_GRAY);
                     F.A(var2[6], Color.PINK);
                     F.A(var2[0], Color.ORANGE);
                     F.A(var2[5], Color.YELLOW);
                     F.A(var2[13], Color.MAGENTA);
                     F.A(var2[11], Color.CYAN);
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

                  var5 = "\u0000*v\u0007\u001f.u} ;o";
                  var7 = "\u0000*v\u0007\u001f.u} ;o".length();
                  var4 = 3;
                  var10 = -1;
            }

            var10000 = 111;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}





