package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;
import java.awt.Color;

public class TI {
   public static int d;
   public static int E;
   public static int i;
   public static int P;
   public static boolean L;
   public static String F;
   public static String v;
   public static boolean J;
   public static Color f;
   public static Color x;
   public static Color e;
   public static Color r;
   public static Color B;
   public static Color Z;
   public static int K;
   public static boolean Y;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[2];
      int var12 = 0;
      String var11 = "\u007f#i\fZ1fQ\r\u001bwB`3F fk\u0013I\nx\b)=Vk\u0014c\u001c6$V};Y=`?\u007fD\u0005q\u001aUXv8iS!KJ`'pS7dpAqkz\fK^\u007fIv\u0014*z@fVi\r";
      int var13 = "\u007f#i\fZ1fQ\r\u001bwB`3F fk\u0013I\nx\b)=Vk\u0014c\u001c6$V};Y=`?\u007fD\u0005q\u001aUXv8iS!KJ`'pS7dpAqkz\fK^\u007fIv\u0014*z@fVi\r"
         .length();
      char var10 = 11;
      int var9 = -1;

      while (true) {
         char[] var10002;
         label57: {
            char[] var10003 = var11.substring(++var9, var9 + var10).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var28 = 122;
            var10002 = var10003;
            int var18 = var10004;
            byte var33;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var33 = 122;
               var10006 = var14;
            } else {
               var28 = 122;
               var18 = var10004;
               if (var10004 <= var14) {
                  break label57;
               }

               var10005 = var10003;
               var33 = 122;
               var10006 = var14;
            }

            while (true) {
               char var47 = var10005[var10006];
               byte var48;
               switch (var14 % 7) {
                  case 0:
                     var48 = 127;
                     break;
                  case 1:
                     var48 = 49;
                     break;
                  case 2:
                     var48 = 76;
                     break;
                  case 3:
                     var48 = 53;
                     break;
                  case 4:
                     var48 = 110;
                     break;
                  case 5:
                     var48 = 101;
                     break;
                  default:
                     var48 = 73;
               }

               var10005[var10006] = (char)(var47 ^ var33 ^ var48);
               var14++;
               if (var28 == 0) {
                  var10006 = var28;
                  var10005 = var10002;
                  var33 = var28;
               } else {
                  if (var18 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var33 = var28;
                  var10006 = var14;
               }
            }
         }

         String var30 = new String(var10002).intern();
         int var20 = -1;
         var8[var12++] = var30;
         if ((var9 += var10) >= var13) {
            long var1 = 5676353707116835027L;
            long[] var0 = new long[11];
            int var4 = 0;
            String var5 = "/\u0015\u0003ã<+°,ë(p\u001b<+°·5©´.<;°Ó\u0092ù}&<+°ÞdU×\u0082<+°Ðê¡ÊÌ<+°\u0095PµoK<+°E¹Ç\u0007\u0019<+°·Ã;;c<\u008b°Ó";
            int var6 = "/\u0015\u0003ã<+°,ë(p\u001b<+°·5©´.<;°Ó\u0092ù}&<+°ÞdU×\u0082<+°Ðê¡ÊÌ<+°\u0095PµoK<+°E¹Ç\u0007\u0019<+°·Ã;;c<\u008b°Ó".length();
            byte var3 = 0;

            label41:
            while (true) {
               var20 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var20, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var10000 = var0;
               var20 = var4++;
               long var26 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var31 = -1;

               while (true) {
                  long var38 = var26 ^ var1;
                  switch (var31) {
                     case 0:
                        var10000[var20] = var38;
                        if (var3 >= var6) {
                           Ref.s(618527515530736341L, null, 1);
                           Ref.setInt(552925321128219086L, null, (int)var0[8]);
                           Ref.setInt(457705496102446726L, null, (int)var0[2]);
                           Ref.s(426110742590203935L, null, -1);
                           Ref.s(280429622358205740L, null, true);
                           Ref.s(133405405151830121L, null, var8[1]);
                           Ref.s(483775177759177776L, null, var8[0]);
                           Ref.s(623285473035456762L, null, true);
                           Ref.setField(0L, null, new Color((int)var0[0], (int)var0[5], 0, (int)var0[6]));
                           Ref.setField(0L, null, new Color((int)var0[9], (int)var0[9], (int)var0[1]));
                           Ref.setField(0L, null, new Color(0, 0, 0));
                           Ref.setField(0L, null, new Color((int)var0[9], (int)var0[7], (int)var0[10]));
                           Ref.setField(0L, null, Ref.g(371948663278580654L, null));
                           Ref.setField(0L, null, new Color(0, (int)var0[9], 0));
                           Ref.setInt(231094135750452722L, null, (int)var0[4]);
                           Ref.s(138376625977546971L, null, true);
                           int var15 = (int)var0[3];
                           return;
                        }
                        break;
                     default:
                        var10000[var20] = var38;
                        if (var3 < var6) {
                           continue label41;
                        }

                        var5 = "LZæk<+°,.4N\r<+°\u0004";
                        var6 = "LZæk<+°,.4N\r<+°\u0004".length();
                        var3 = 0;
                  }

                  byte var23 = var3;
                  var3 += 8;
                  var7 = var5.substring(var23, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var10000 = var0;
                  var20 = var4++;
                  var26 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var31 = 0;
               }
            }
         }

         var10 = var11.charAt(var9);
      }
   }
}





