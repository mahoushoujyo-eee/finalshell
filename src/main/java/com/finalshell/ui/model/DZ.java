package com.finalshell.ui.model;

public final class DZ {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static DZ CRC16;
   public static DZ CRC32;
   public int l;
   public int y;
   public static DZ[] L;

   public static DZ[] values() {
      return (DZ[])L.clone();
   }

   public static DZ valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public DZ(String var1, int var2, int var3, int var4) {
      this.l = var3;
      this.y = var4;
   }

   public int o() {
      return this.l;
   }

   public int U() {
      return this.y;
   }

   public static DZ[] Y() {
      return new DZ[]{CRC16, CRC32};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "A\\\u0003Z&\u0005A\\\u0003X\"";
      int var5 = "A\\\u0003Z&\u0005A\\\u0003X\"".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 111;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 111;
               var10006 = var6;
            } else {
               var13 = 111;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 111;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 109;
                     break;
                  case 1:
                     var29 = 97;
                     break;
                  case 2:
                     var29 = 47;
                     break;
                  case 3:
                     var29 = 6;
                     break;
                  case 4:
                     var29 = 123;
                     break;
                  case 5:
                     var29 = 118;
                     break;
                  default:
                     var29 = 84;
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
            CRC16 = new DZ(var0[1], 0, 2, 0);
            CRC32 = new DZ(var0[0], 1, 4, -1);
            L = Y();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







