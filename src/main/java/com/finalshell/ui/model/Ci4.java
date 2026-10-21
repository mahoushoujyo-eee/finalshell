package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public final class Ci4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Ci4 fill;
   public static Ci4 align;
   public static Ci4 custom;

   public static Ci4[] values() {
      return (Ci4[])((Ci4[])Registry.lookupField(177510316711686286L).get(null)).clone();
   }

   public static Ci4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Ci4(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      Ci4 D;
      Ci4 var15;
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u0003V\nxT:\u0004\u0006J\u0015`\u0005\u0001O\u0010kU";
      int var5 = "\u0003V\nxT:\u0004\u0006J\u0015`\u0005\u0001O\u0010kU".length();
      char var2 = 6;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label48: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var18 = 99;
            var10002 = var10003;
            int var11 = var10004;
            byte var21;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var21 = 99;
               var10006 = var6;
            } else {
               var18 = 99;
               var11 = var10004;
               if (var10004 <= var6) {
                  break label48;
               }

               var10005 = var10003;
               var21 = 99;
               var10006 = var6;
            }

            while (true) {
               char var33 = var10005[var10006];
               byte var34;
               switch (var6 % 7) {
                  case 0:
                     var34 = 3;
                     break;
                  case 1:
                     var34 = 64;
                     break;
                  case 2:
                     var34 = 26;
                     break;
                  case 3:
                     var34 = 111;
                     break;
                  case 4:
                     var34 = 88;
                     break;
                  case 5:
                     var34 = 52;
                     break;
                  default:
                     var34 = 115;
               }

               var10005[var10006] = (char)(var33 ^ var21 ^ var34);
               var6++;
               if (var18 == 0) {
                  var10006 = var18;
                  var10005 = var10002;
                  var21 = var18;
               } else {
                  if (var11 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var21 = var18;
                  var10006 = var6;
               }
            }
         }

         String var20 = new String(var10002).intern();
         byte var13 = -1;
         var0[var4++] = var20;
         if ((var1 += var2) >= var5) {
            fill = new Ci4(var0[1], 0);
            align = new Ci4(var0[2], 1);
            custom = new Ci4(var0[0], 2);
            Registry.emptyArgs();
            long var7 = 545218802171132370L;
            Object var14 = Ref.h2(545218802171132370L, var7);

            try {
               var15 = (Ci4)((Ci4[])var14);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            D = var15;
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







