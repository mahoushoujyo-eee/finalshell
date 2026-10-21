package com.finalshell.ui.model;

public final class P extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static P save;
   public static P open;
   public static P custom;

   public static P[] values() {
      return (P[])i.clone();
   }

   public static P valueOf(String var0) {
      return Enum.valueOf(P.class, var0);
   }

   public P(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "IHcH\u0006Y\\fYz:\u0004UYpC";
      int var5 = "IHcH\u0006Y\\fYz:\u0004UYpC".length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 76;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 76;
               var10006 = var6;
            } else {
               var13 = 76;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 76;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 118;
                     break;
                  case 1:
                     var29 = 101;
                     break;
                  case 2:
                     var29 = 89;
                     break;
                  case 3:
                     var29 = 97;
                     break;
                  case 4:
                     var29 = 89;
                     break;
                  case 5:
                     var29 = 27;
                     break;
                  default:
                     var29 = 19;
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
            save = new P(var0[0], 0);
            open = new P(var0[2], 1);
            custom = new P(var0[1], 2);
            i = H();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







