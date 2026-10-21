package com.finalshell.ui.model;

import com.finalshell.ui.panel.KE3;
import javax.swing.JComponent;

public final class BU {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static BU start;
   public static BU middle;
   public static BU end;
   public static BU none;

   public static BU[] values() {
      return (BU[])com.finalshell.reflect.Ref.cloneObject(O);
   }

   public static BU valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public BU(String var1, int var2) {
   }

   public static BU I(JComponent var0, KE3 var1) {
      String var2;
      int var3;
      int var4;
      byte var5;
      int var6;
      var3 = var1.getComponentZOrder(var0);
      String var10000 = KE3.v();
      var4 = var1.getComponentCount() - 1;
      var2 = var10000;
      var5 = (byte)((var1.z()) ? 1 : 0);
      var6 = var4;
      label37:
      if (var2 == null) {
         if (var4 == 0) {
            var6 = var5;
            if (var2 != null) {
               break label37;
            }

            if (var5 == 0) {
               return none;
            }
         }

         var6 = var3;
      }

      if (var2 == null) {
         if (var6 == 0) {
            return start;
         }

         var6 = var3;
      }

      if (var2 == null) {
         if (var6 != var4) {
            return middle;
         }

         var6 = var5;
      }

      return var6 == 0 ? end : middle;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u001b7\u001e\u0005\r-\u001b\f\u0011";
      int var5 = "\u001b7\u001e\u0005\r-\u001b\f\u0011".length();
      char var2 = 3;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 119;
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
                        var46 = 9;
                        break;
                     case 1:
                        var46 = 46;
                        break;
                     case 2:
                        var46 = 13;
                        break;
                     case 3:
                        var46 = 9;
                        break;
                     case 4:
                        var46 = 18;
                        break;
                     case 5:
                        var46 = 38;
                        break;
                     default:
                        var46 = 25;
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
                     start = new BU(var0[1], 0);
                     middle = new BU(var0[3], 1);
                     end = new BU(var0[0], 2);
                     none = new BU(var0[2], 3);
                     O = K();
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

                  var3 = "wQs|\u0006tWy}nS";
                  var5 = "wQs|\u0006tWy}nS".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 16;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
   private static Object O;
}







