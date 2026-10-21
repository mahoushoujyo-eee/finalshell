package com;

public class LN extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static final com.LN Back;
   public static final com.LN BackStyle;
   public static final com.LN Scroll;
   private static final com.LN[] l;

   private LN() {
   }

   public abstract String W(w8_2 var1, int var2);

   private static com.LN[] y() {
      return new com.LN[]{Back, BackStyle, Scroll};
   }

   LN(com.Lu_2 var3) {
      this();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
            Back = new com.Lu_2("Back", 0);
            BackStyle = new com.LF("BackStyle", 1);
            Scroll = new com.L4("Scroll", 2);
            l = y();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







