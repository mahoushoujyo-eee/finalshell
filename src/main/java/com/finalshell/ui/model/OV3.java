package com.finalshell.ui.model;

public final class OV3 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static OV3 random;
   public static OV3 zoomIn;
   public static OV3 zoomOut;
   public static String P;

   public static OV3[] values() {
      return (OV3[])C.clone();
   }

   public static OV3 valueOf(String var0) {
      return Enum.valueOf(OV3.class, var0);
   }

   public OV3(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static void R(String var0) {
      P = var0;
   }

   public static String n() {
      return P;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "Fn\u0017\u001ayYW\u0006N`\u0016\u0013YA\u0006Fn\u0017\u001a\u007fB";
      int var5 = "Fn\u0017\u001ayYW\u0006N`\u0016\u0013YA\u0006Fn\u0017\u001a\u007fB".length();
      char var2 = 7;
      R("EdXBvb");
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
                     var29 = 54;
                     break;
                  case 1:
                     var29 = 11;
                     break;
                  case 2:
                     var29 = 114;
                     break;
                  case 3:
                     var29 = 125;
                     break;
                  case 4:
                     var29 = 60;
                     break;
                  case 5:
                     var29 = 38;
                     break;
                  default:
                     var29 = 41;
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
            random = new OV3(var0[1], 0);
            zoomIn = new OV3(var0[2], 1);
            zoomOut = new OV3(var0[0], 2);
            C = r();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







