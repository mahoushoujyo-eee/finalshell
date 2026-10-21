package com.finalshell.ui.model;

public final class Rd2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Rd2 PRIVATE_MEMBERS_OF_ENCLOSING_AND_ENCLOSED_TYPES_INACCESSIBLE;
   public static Rd2 EXPRESSIONS_IN_TRY_WITH_RESOURCES_ALLOWED;

   public static Rd2[] values() {
      return (Rd2[])com.finalshell.reflect.Ref.cloneObject(s);
   }

   public static Rd2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Rd2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\u001eX(<\u000eRN\u0011G$'\rCY\u001dU.,\u0010CE\rF.9\u0006HL\u0011K/.\u0010CE\rF.9\nBT\u001aS1/\u001cYB\u0000K\")\nUX\u0007H-/)\u000bR18\nUX\u0007E/9\u0010OE\u0011^33\u0010QB\u001aB>8\nUD\u001bX\"/\u001cYJ\u0002F.=\nB";
      int var5 = "\u001eX(<\u000eRN\u0011G$'\rCY\u001dU.,\u0010CE\rF.9\u0006HL\u0011K/.\u0010CE\rF.9\nBT\u001aS1/\u001cYB\u0000K\")\nUX\u0007H-/)\u000bR18\nUX\u0007E/9\u0010OE\u0011^33\u0010QB\u001aB>8\nUD\u001bX\"/\u001cYJ\u0002F.=\nB"
         .length();
      char var2 = '<';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 53;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            } else {
               var13 = 53;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 123;
                     break;
                  case 1:
                     var29 = 63;
                     break;
                  case 2:
                     var29 = 84;
                     break;
                  case 3:
                     var29 = 95;
                     break;
                  case 4:
                     var29 = 122;
                     break;
                  case 5:
                     var29 = 51;
                     break;
                  default:
                     var29 = 62;
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
            PRIVATE_MEMBERS_OF_ENCLOSING_AND_ENCLOSED_TYPES_INACCESSIBLE = new Rd2(var0[0], 0);
            EXPRESSIONS_IN_TRY_WITH_RESOURCES_ALLOWED = new Rd2(var0[1], 1);
            s = N();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
   private static Object s;
}







