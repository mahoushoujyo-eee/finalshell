package com.finalshell.ui.model;

import com.finalshell.core.W82;

public abstract class LN {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static LN Back;
   public static LN BackStyle;
   public static LN Scroll;
   public static LN[] l;

   public static LN[] values() {
      return (LN[])l.clone();
   }

   public static LN valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public LN(String var1, int var2) {
   }

   public abstract String W(W82 var1, int var2);

   public static LN[] y() {
      return new LN[]{Back, BackStyle, Scroll};
   }

   public LN(String var1, int var2, Lu2 var3) {
      this(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "<k*+\u0006-i;/LE\t<k*+s]C\u0012o";
      int var5 = "<k*+\u0006-i;/LE\t<k*+s]C\u0012o".length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 59;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 59;
               var10006 = var6;
            } else {
               var13 = 59;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 59;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 69;
                     break;
                  case 1:
                     var29 = 49;
                     break;
                  case 2:
                     var29 = 114;
                     break;
                  case 3:
                     var29 = 123;
                     break;
                  case 4:
                     var29 = 27;
                     break;
                  case 5:
                     var29 = 18;
                     break;
                  default:
                     var29 = 1;
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
            Back = new Lu2(var0[0], 0);
            BackStyle = new LF(var0[2], 1);
            Scroll = new L4(var0[1], 2);
            l = y();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







