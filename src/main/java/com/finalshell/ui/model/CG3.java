package com.finalshell.ui.model;

public final class CG3 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static CG3 flow;
   public static CG3 stack;

   public static CG3[] values() {
      return (CG3[])F.clone();
   }

   public static CG3 valueOf(String var0) {
      return Enum.valueOf(CG3.class, var0);
   }

   public CG3(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "i\u001aOP\u0005|\u0002AD\t";
      int var5 = "i\u001aOP\u0005|\u0002AD\t".length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 13;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 13;
               var10006 = var6;
            } else {
               var13 = 13;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 13;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 2;
                     break;
                  case 1:
                     var29 = 123;
                     break;
                  case 2:
                     var29 = 45;
                     break;
                  case 3:
                     var29 = 42;
                     break;
                  case 4:
                     var29 = 111;
                     break;
                  case 5:
                     var29 = 55;
                     break;
                  default:
                     var29 = 67;
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
            flow = new CG3(var0[0], 0);
            stack = new CG3(var0[1], 1);
            F = k();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







