package com.finalshell.ui.model;

public final class HF {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static HF Object;
   public static HF Array;
   public static HF Value;
   public static HF[] W;

   public static HF[] values() {
      return (HF[])W.clone();
   }

   public static HF valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public HF(String var1, int var2) {
   }

   public static HF[] w() {
      return new HF[]{Object, Array, Value};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "ot9\u0014\u0018\u0006vw?\u0004\u001eQ\u0005xg'\u0000\u0004";
      int var5 = "ot9\u0014\u0018\u0006vw?\u0004\u001eQ\u0005xg'\u0000\u0004".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 10;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 10;
               var10006 = var6;
            } else {
               var13 = 10;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 10;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 51;
                     break;
                  case 1:
                     var29 = 31;
                     break;
                  case 2:
                     var29 = 95;
                     break;
                  case 3:
                     var29 = 107;
                     break;
                  case 4:
                     var29 = 119;
                     break;
                  case 5:
                     var29 = 47;
                     break;
                  default:
                     var29 = 15;
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
            Object = new HF(var0[1], 0);
            Array = new HF(var0[2], 1);
            Value = new HF(var0[0], 2);
            W = w();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







