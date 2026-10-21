package com.finalshell.ui.model;

import com.finalshell.core.FN;
import com.finalshell.core.WC_2;
import java.awt.event.MouseEvent;

public final class HT {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static HT left;
   public static HT middle;
   public static HT right;
   public final int s;

   public static HT[] values() {
      return (HT[])H.clone();
   }

   public static HT valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public HT(String var1, int var2, int var3) {
      this.s = var3;
   }

   public int r() {
      return this.s;
   }

   public static HT l(MouseEvent var0) {
      int[] var1 = WC_2.V();
      boolean var10000 = FN.L(var0);
      if (var1 == null) {
         if (var10000) {
            return right;
         }

         var10000 = FN.N(var0);
      }

      return var10000 ? middle : left;
   }

   public static HT x(int var0) {
      switch (var0) {
         case 1:
            return left;
         case 2:
            return middle;
         case 3:
            return right;
         default:
            return null;
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = " fLV~\u0006?fOZf7\u0004>jMJ";
      int var5 = " fLV~\u0006?fOZf7\u0004>jMJ".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 32;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 32;
               var10006 = var6;
            } else {
               var13 = 32;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 32;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 114;
                     break;
                  case 1:
                     var29 = 47;
                     break;
                  case 2:
                     var29 = 11;
                     break;
                  case 3:
                     var29 = 30;
                     break;
                  case 4:
                     var29 = 42;
                     break;
                  case 5:
                     var29 = 114;
                     break;
                  default:
                     var29 = 126;
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
            left = new HT(var0[2], 0, 1);
            middle = new HT(var0[1], 1, 2);
            right = new HT(var0[0], 2, 3);
            H = T();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







