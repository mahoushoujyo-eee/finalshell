package com.finalshell.ui.model;

public final class G3 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static G3 BLOCK;
   public static G3 TYPE_DECLARATION;
   public static G3 COMPILATION_UNIT;
   public static G3[] e;

   public static G3[] values() {
      return (G3[])e.clone();
   }

   public static G3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public G3(String var1, int var2) {
   }

   public static G3[] J() {
      return new G3[]{BLOCK, TYPE_DECLARATION, COMPILATION_UNIT};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "*=iF\u00014]=;kX\u0017-R &\u0010=+tS\u0017<Y*>eD\t,U&<\u0005+>kU\u0003";
      int var5 = "*=iF\u00014]=;kX\u0017-R &\u0010=+tS\u0017<Y*>eD\t,U&<\u0005+>kU\u0003".length();
      char var2 = 16;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 113;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 113;
               var10006 = var6;
            } else {
               var13 = 113;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 113;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 24;
                     break;
                  case 1:
                     var29 = 3;
                     break;
                  case 2:
                     var29 = 85;
                     break;
                  case 3:
                     var29 = 103;
                     break;
                  case 4:
                     var29 = 57;
                     break;
                  case 5:
                     var29 = 9;
                     break;
                  default:
                     var29 = 109;
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
            BLOCK = new G3(var0[2], 0);
            TYPE_DECLARATION = new G3(var0[1], 1);
            COMPILATION_UNIT = new G3(var0[0], 2);
            e = J();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







