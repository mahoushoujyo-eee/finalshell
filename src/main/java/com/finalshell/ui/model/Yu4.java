package com.finalshell.ui.model;

import com.finalshell.ui.panel.Ky4;

public final class Yu4 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Yu4 BIN32;
   public static Yu4 BIN;
   public static Yu4 HEX;
   public int E;
   public DZ s;
   public X9 Z;
   public static Yu4[] r;
   public static Ky4[] g;

   public static Yu4[] values() {
      return (Yu4[])r.clone();
   }

   public static Yu4 valueOf(String var0) {
      return Enum.valueOf(Yu4.class, var0);
   }

   public static Yu4 O(byte var0) {
      Ky4[] var10000 = c$arrky_4();
      Yu4[] var2 = values();
      Ky4[] var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while (var4 < var3) {
         Yu4 var5 = var2[var4];
         if (var1 == null) {
            if (var5.T() == var0) {
               return var5;
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }

      return null;
   }

   public Yu4(String var1, int var2, int var3, DZ var4, X9 var5) {
      super(var1, var2);
      this.E = var3;
      this.s = var4;
      this.Z = var5;
   }

   public DZ s() {
      return this.s;
   }

   public byte T() {
      return this.Z.r();
   }

   public int c$int() {
      return this.E;
   }

   public boolean d() {
      return this == HEX;
   }

   public static Yu4[] r() {
      return new Yu4[]{BIN32, BIN, HEX};
   }

   static {
      __vfClinit__();
   }

   public static void r(Ky4[] var0) {
      g = var0;
   }

   public static Ky4[] c$arrky_4() {
      return g;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "0Ze\u0005:Vs)J\u0003:Vs";
      int var5 = "0Ze\u0005:Vs)J\u0003:Vs".length();
      r(null);
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 115;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 115;
               var10006 = var6;
            } else {
               var13 = 115;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 115;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 11;
                     break;
                  case 1:
                     var29 = 108;
                     break;
                  case 2:
                     var29 = 78;
                     break;
                  case 3:
                     var29 = 105;
                     break;
                  case 4:
                     var29 = 11;
                     break;
                  case 5:
                     var29 = 117;
                     break;
                  default:
                     var29 = 118;
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
            BIN32 = new Yu4(var0[1], 0, 1, DZ.CRC32, X9.ZBIN32);
            BIN = new Yu4(var0[2], 1, 1, DZ.CRC16, X9.ZBIN);
            HEX = new Yu4(var0[0], 2, 2, DZ.CRC16, X9.ZHEX);
            r = r();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







