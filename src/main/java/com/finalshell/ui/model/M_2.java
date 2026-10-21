package com.finalshell.ui.model;

public final class M_2 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static M_2 DEFAULT;
   public static M_2 READ_AHEAD;
   public static M_2 AT_END;
   public static M_2[] h;

   public static M_2[] values() {
      return (M_2[])h.clone();
   }

   public static M_2 valueOf(String var0) {
      return Enum.valueOf(M_2.class, var0);
   }

   public M_2(String var1, int var2) {
      super(var1, var2);
   }

   public static M_2[] J() {
      return new M_2[]{DEFAULT, READ_AHEAD, AT_END};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "KJ:\u0010:QW\\N?\u0006X[$\u0011+T\u0007]J=\u00150\\K";
      int var5 = "KJ:\u0010:QW\\N?\u0006X[$\u0011+T\u0007]J=\u00150\\K".length();
      char var2 = '\n';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 23;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 23;
               var10006 = var6;
            } else {
               var13 = 23;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 23;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 14;
                     break;
                  case 1:
                     var29 = 24;
                     break;
                  case 2:
                     var29 = 108;
                     break;
                  case 3:
                     var29 = 67;
                     break;
                  case 4:
                     var29 = 114;
                     break;
                  case 5:
                     var29 = 7;
                     break;
                  default:
                     var29 = 8;
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
            DEFAULT = new M_2(var0[2], 0);
            READ_AHEAD = new M_2(var0[0], 1);
            AT_END = new M_2(var0[1], 2);
            h = J();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







