package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("ResourceLocation")
public final class Zo2 extends Enum implements Serializable {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Zo2 url;
   public static Zo2 filePath;
   public static Zo2 nearClass;

   public static Zo2[] values() {
      return (Zo2[])K.clone();
   }

   public static Zo2 valueOf(String var0) {
      return Enum.valueOf(Zo2.class, var0);
   }

   public Zo2(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = ",U3W\u007f|[\"\u0003?N3\t$Y>@lqN9O";
      int var5 = ",U3W\u007f|[\"\u0003?N3\t$Y>@lqN9O".length();
      char var2 = '\b';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 81;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 81;
               var10006 = var6;
            } else {
               var13 = 81;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 81;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 27;
                     break;
                  case 1:
                     var29 = 109;
                     break;
                  case 2:
                     var29 = 14;
                     break;
                  case 3:
                     var29 = 99;
                     break;
                  case 4:
                     var29 = 126;
                     break;
                  case 5:
                     var29 = 76;
                     break;
                  default:
                     var29 = 126;
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
            url = new Zo2(var0[1], 0);
            filePath = new Zo2(var0[0], 1);
            nearClass = new Zo2(var0[2], 2);
            K = N();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}







