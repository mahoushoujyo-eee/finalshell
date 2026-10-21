package com;

import java.util.List;

public class RK extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static final RK system;
   public static final RK drives;
   public static final RK userHome;
   private static final RK[] K;

   private RK() {
   }

   public abstract List I();

   private static RK[] v() {
      return new RK[]{system, drives, userHome};
   }

   RK(RA var3) {
      this();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "O;U\u0012T5\u0006X0O\u0010T+\b^:Y\u0016y)=N";
      int var5 = "O;U\u0012T5\u0006X0O\u0010T+\b^:Y\u0016y)=N".length();
      char var2 = 6;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 15;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 15;
               var10006 = var6;
            } else {
               var13 = 15;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 15;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 36;
                     break;
                  case 1:
                     var29 = 70;
                     break;
                  case 2:
                     var29 = 51;
                     break;
                  case 3:
                     var29 = 107;
                     break;
                  case 4:
                     var29 = 62;
                     break;
                  case 5:
                     var29 = 73;
                     break;
                  default:
                     var29 = 95;
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
            system = new RA("system", 0);
            drives = new RO("drives", 1);
            userHome = new Rs_2("userHome", 2);
            K = v();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







