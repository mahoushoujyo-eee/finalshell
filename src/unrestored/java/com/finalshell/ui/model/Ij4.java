package com.finalshell.ui.model;

public final class Ij4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Ij4 standalone;
   public static Ij4 attached;

   public static Ij4[] values() {
      return (Ij4[])com.finalshell.reflect.Ref.cloneObject(n);
   }

   public static Ij4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Ij4(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\u0015/nt~1$\u0010\n\u0007/{{y8-\u001b5\u007f";
      int var5 = "\u0015/nt~1$\u0010\n\u0007/{{y8-\u001b5\u007f".length();
      char var2 = '\b';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 66;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 66;
               var10006 = var6;
            } else {
               var13 = 66;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 66;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 54;
                     break;
                  case 1:
                     var29 = 25;
                     break;
                  case 2:
                     var29 = 88;
                     break;
                  case 3:
                     var29 = 87;
                     break;
                  case 4:
                     var29 = 95;
                     break;
                  case 5:
                     var29 = 27;
                     break;
                  default:
                     var29 = 3;
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
            standalone = new Ij4(var0[1], 0);
            attached = new Ij4(var0[0], 1);
            n = M();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
   private static Object n;
}







