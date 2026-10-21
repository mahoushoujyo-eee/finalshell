package com.finalshell.ui.model;

public final class Rk4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Rk4 fill;
   public static Rk4 align;
   public static Rk4 custom;

   public static Rk4[] values() {
      return (Rk4[])com.finalshell.reflect.Ref.cloneObject(T);
   }

   public static Rk4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Rk4(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "=_S\u0001c\u0000\u0005?FI\u0012b\u00048CL\u0019";
      int var5 = "=_S\u0001c\u0000\u0005?FI\u0012b\u00048CL\u0019".length();
      char var2 = 6;
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
                     var29 = 83;
                     break;
                  case 1:
                     var29 = 39;
                     break;
                  case 2:
                     var29 = 45;
                     break;
                  case 3:
                     var29 = 120;
                     break;
                  case 4:
                     var29 = 1;
                     break;
                  case 5:
                     var29 = 96;
                     break;
                  default:
                     var29 = 56;
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
            fill = new Rk4(var0[2], 0);
            align = new Rk4(var0[1], 1);
            custom = new Rk4(var0[0], 2);
            T = M();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
   private static Object T;
}







