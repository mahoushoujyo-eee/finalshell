package com.finalshell.ui.model;

import com.finalshell.ui.panel.Ky4;

public final class Pt2 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Pt2 unchecked;
   public static Pt2 checked;
   public static Pt2 mixed;
   public static Ky4[] L;

   public static Pt2[] values() {
      return (Pt2[])G.clone();
   }

   public static Pt2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Pt2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static void J(Ky4[] var0) {
      L = var0;
   }

   public static Ky4[] b() {
      return L;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      J(null);
      String var3 = "i!Z ;\u0007g G&4\u001fF\tq&A-:\u0019Ia,";
      int var5 = "i!Z ;\u0007g G&4\u001fF\tq&A-:\u0019Ia,".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 36;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 36;
               var10006 = var6;
            } else {
               var13 = 36;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 36;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 32;
                     break;
                  case 1:
                     var29 = 108;
                     break;
                  case 2:
                     var29 = 6;
                     break;
                  case 3:
                     var29 = 97;
                     break;
                  case 4:
                     var29 = 123;
                     break;
                  case 5:
                     var29 = 94;
                     break;
                  default:
                     var29 = 6;
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
            unchecked = new Pt2(var0[2], 0);
            checked = new Pt2(var0[1], 1);
            mixed = new Pt2(var0[0], 2);
            G = Q();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







