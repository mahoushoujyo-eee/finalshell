package com.finalshell.ui.model;

public final class KO extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static KO ALWAYS;
   public static KO NEVER;
   public static KO HOVER;
   public static KO[] E;

   public static KO[] values() {
      return (KO[])E.clone();
   }

   public static KO valueOf(String var0) {
      return Enum.valueOf(KO.class, var0);
   }

   public KO(String var1, int var2) {
      super(var1, var2);
   }

   public static KO[] s() {
      return new KO[]{ALWAYS, NEVER, HOVER};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "JO\u001b\u0007|\u0005LE\u001b\u0007|\u0006CL\u001a\u0003w\u007f";
      int var5 = "JO\u001b\u0007|\u0005LE\u001b\u0007|\u0006CL\u001a\u0003w\u007f".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 90;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 90;
               var10006 = var6;
            } else {
               var13 = 90;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 90;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 88;
                     break;
                  case 1:
                     var29 = 90;
                     break;
                  case 2:
                     var29 = 23;
                     break;
                  case 3:
                     var29 = 24;
                     break;
                  case 4:
                     var29 = 116;
                     break;
                  case 5:
                     var29 = 118;
                     break;
                  default:
                     var29 = 112;
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
            ALWAYS = new KO(var0[2], 0);
            NEVER = new KO(var0[1], 1);
            HOVER = new KO(var0[0], 2);
            E = s();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







