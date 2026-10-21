package com.finalshell.ui.model;

import com.finalshell.core.F_2_2;

public final class M2 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static M2 icons;
   public static M2 tiles;
   public static M2 table;
   public static M2[] i;

   public static M2[] values() {
      return (M2[])i.clone();
   }

   public static M2 valueOf(String var0) {
      return Enum.valueOf(M2.class, var0);
   }

   public M2(String var1, int var2) {
      super(var1, var2);
   }

   public int w() {
      String var1 = com.finalshell.ui.panel.T.v$String();
      int var10000 = F_2_2.j[this.ordinal()];
      if (var1 == null) {
         switch (var10000) {
            case 1:
            case 2:
               return 0;
            case 3:
               return 1;
            default:
               var10000 = -1;
         }
      }

      return var10000;
   }

   public static M2[] f() {
      return new M2[]{icons, tiles, table};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u000b\u0000_K\u0016\u0005\u000b\bQB\u0000\u0005\u0016\u0002RI\u0000";
      int var5 = "\u000b\u0000_K\u0016\u0005\u000b\bQB\u0000\u0005\u0016\u0002RI\u0000".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 3;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 3;
               var10006 = var6;
            } else {
               var13 = 3;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 3;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 124;
                     break;
                  case 1:
                     var29 = 98;
                     break;
                  case 2:
                     var29 = 62;
                     break;
                  case 3:
                     var29 = 36;
                     break;
                  case 4:
                     var29 = 112;
                     break;
                  case 5:
                     var29 = 9;
                     break;
                  default:
                     var29 = 7;
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
            icons = new M2(var0[2], 0);
            tiles = new M2(var0[1], 1);
            table = new M2(var0[0], 2);
            i = f();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







