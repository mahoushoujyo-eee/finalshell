package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ns4 implements Ak2, X4 {
   public NumberFormat m;
   public static Ns4 x;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Ns4() {
   }

   public Ns4(DecimalFormat var1) {
      this.m = var1;
   }

   public Ns4(String var1) {
      this(new DecimalFormat(var1));
   }

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: aload 6
      // 0e: ifnull 29
      // 11: ifnonnull 28
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 7
      // 1d: getstatic com/finalshell/ui/model/EP.WriteNullNumberAsZero Lcom/finalshell/ui/model/EP;
      // 20: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 23: return
      // 24: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 2
      // 29: checkcast java/lang/Float
      // 2c: invokevirtual java/lang/Float.floatValue ()F
      // 2f: fstore 8
      // 31: aload 0
      // 32: getfield com/finalshell/core/Ns4.m Ljava/text/NumberFormat;
      // 35: aload 6
      // 37: ifnull 4f
      // 3a: ifnull 63
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/core/Ns4.m Ljava/text/NumberFormat;
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: fload 8
      // 51: f2d
      // 52: invokevirtual java/text/NumberFormat.format (D)Ljava/lang/String;
      // 55: astore 9
      // 57: aload 7
      // 59: aload 9
      // 5b: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 5e: aload 6
      // 60: ifnonnull 72
      // 63: aload 7
      // 65: fload 8
      // 67: bipush 1
      // 68: invokevirtual com/finalshell/io/YM3.q (FZ)V
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: return
   }

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      try {
         return K(var1);
      } catch (Exception var5) {
         throw new Hi2(a + var3, var5);
      }
   }

   public static Object K(Yn4 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: invokeinterface com/finalshell/core/P7.P ()I 1
      // 0f: bipush 2
      // 10: aload 1
      // 11: ifnull 4e
      // 14: if_icmpne 3c
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokeinterface com/finalshell/core/P7.c$String ()Ljava/lang/String; 1
      // 24: astore 3
      // 25: aload 2
      // 26: sipush 18838
      // 29: ldc2_w 7229916549784059846
      // 2c: invokestatic com/finalshell/core/Ns4.a (IJ)I
      // 2f: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 34: aload 3
      // 35: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 38: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3b: areturn
      // 3c: aload 2
      // 3d: aload 1
      // 3e: ifnull 70
      // 41: invokeinterface com/finalshell/core/P7.P ()I 1
      // 46: bipush 3
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: if_icmpne 6c
      // 51: aload 2
      // 52: invokeinterface com/finalshell/core/P7.I ()F 1
      // 57: fstore 3
      // 58: aload 2
      // 59: sipush 19288
      // 5c: ldc2_w 5241834458080460041
      // 5f: invokestatic com/finalshell/core/Ns4.a (IJ)I
      // 62: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 67: fload 3
      // 68: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 6b: areturn
      // 6c: aload 0
      // 6d: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 70: astore 3
      // 71: aload 3
      // 72: aload 1
      // 73: ifnull 87
      // 76: ifnonnull 86
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aconst_null
      // 81: areturn
      // 82: invokestatic com/finalshell/core/Ns4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 3
      // 87: invokestatic com/finalshell/core/B8_2.h (Ljava/lang/Object;)Ljava/lang/Float;
      // 8a: areturn
   }

   @Override
   public int j() {
      return 2;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30289;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "z\u001c+&0Mfd\u001ay0'sfxQy3<den]cu".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 56;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 56;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 50;
               break;
            case 1:
               var37 = 69;
               break;
            case 2:
               var37 = 97;
               break;
            case 3:
               var37 = 109;
               break;
            case 4:
               var37 = 109;
               break;
            case 5:
               var37 = 57;
               break;
            default:
               var37 = 49;
         }
      } else {
         var25 = 56;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 8148701748040159117L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "!à\u0093w=Àr\u0094;á\u0085\u001a)\u0011p[";
            int var13 = "!à\u0093w=Àr\u0094;á\u0085\u001a)\u0011p[".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            x = new Ns4();
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 56;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 50;
               break;
            case 1:
               var37 = 69;
               break;
            case 2:
               var37 = 97;
               break;
            case 3:
               var37 = 109;
               break;
            case 4:
               var37 = 109;
               break;
            case 5:
               var37 = 57;
               break;
            default:
               var37 = 49;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 50;
                  break;
               case 1:
                  var37 = 69;
                  break;
               case 2:
                  var37 = 97;
                  break;
               case 3:
                  var37 = 109;
                  break;
               case 4:
                  var37 = 109;
                  break;
               case 5:
                  var37 = 57;
                  break;
               default:
                  var37 = 49;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 8148701748040159117L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "!à\u0093w=Àr\u0094;á\u0085\u001a)\u0011p[";
               int var5 = "!à\u0093w=Àr\u0094;á\u0085\u001a)\u0011p[".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               x = new Ns4();
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 50;
                  break;
               case 1:
                  var37 = 69;
                  break;
               case 2:
                  var37 = 97;
                  break;
               case 3:
                  var37 = 109;
                  break;
               case 4:
                  var37 = 109;
                  break;
               case 5:
                  var37 = 57;
                  break;
               default:
                  var37 = 49;
            }
         }
      }
   }
}





