package com.finalshell.ui.model;

public final class So2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static So2 never;
   public static So2 multiline;
   public static So2 always;

   public static So2[] values() {
      return (So2[])com.finalshell.reflect.Ref.cloneObject(C);
   }

   public static So2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public So2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "|I<\\kn~\u007fY\u0006pP'I{q\u0005\u007fY&Mp";
      int var5 = "|I<\\kn~\u007fY\u0006pP'I{q\u0005\u007fY&Mp".length();
      char var2 = '\t';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 12;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 12;
               var10006 = var6;
            } else {
               var13 = 12;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 12;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 29;
                     break;
                  case 1:
                     var29 = 48;
                     break;
                  case 2:
                     var29 = 92;
                     break;
                  case 3:
                     var29 = 36;
                     break;
                  case 4:
                     var29 = 14;
                     break;
                  case 5:
                     var29 = 14;
                     break;
                  default:
                     var29 = 27;
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
            never = new So2(var0[2], 0);
            multiline = new So2(var0[0], 1);
            always = new So2(var0[1], 2);
            C = a();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
   private static Object C;
}







