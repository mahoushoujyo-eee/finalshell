package com.finalshell.ui.model;

public final class GQ {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static GQ root;
   public static GQ folder;
   public static GQ leaf;
   public static String[] u;

   public static GQ[] values() {
      return (GQ[])com.finalshell.reflect.Ref.cloneObject(s);
   }

   public static GQ valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public GQ(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static void w(String[] var0) {
      u = var0;
   }

   public static String[] W() {
      return u;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      String[] var10000 = new String[4];
      int var4 = 0;
      String var3 = "QjZT\u0006EjYD%\"\u0004O`TF";
      int var5 = "QjZT\u0006EjYD%\"\u0004O`TF".length();
      w(var10000);
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 40;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 40;
               var10006 = var6;
            } else {
               var13 = 40;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 40;
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
                     var29 = 45;
                     break;
                  case 2:
                     var29 = 29;
                     break;
                  case 3:
                     var29 = 8;
                     break;
                  case 4:
                     var29 = 104;
                     break;
                  case 5:
                     var29 = 120;
                     break;
                  default:
                     var29 = 13;
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
            root = new GQ(var0[0], 0);
            folder = new GQ(var0[1], 1);
            leaf = new GQ(var0[2], 2);
            s = v();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
   private static Object s;
}







