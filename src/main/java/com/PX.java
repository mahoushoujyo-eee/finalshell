package com;

import org.jetbrains.annotations.NotNull;

public class PX {
   private final int o;
   private pG_3 f;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public PX(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/XP.j ()[I
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: astore 2
      // 08: iload 1
      // 09: aload 2
      // 0a: ifnonnull 18
      // 0d: iflt 1c
      // 10: goto 17
      // 13: invokestatic com/PX.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16: athrow
      // 17: iload 1
      // 18: bipush 3
      // 19: if_icmple 2b
      // 1c: new java/lang/IllegalArgumentException
      // 1f: dup
      // 20: getstatic com/PX.a Ljava/lang/String;
      // 23: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/PX.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 1
      // 2d: putfield com/PX.o I
      // 30: aload 0
      // 31: iload 1
      // 32: aload 2
      // 33: ifnonnull 51
      // 36: bipush 1
      // 37: if_icmpne 54
      // 3a: goto 41
      // 3d: invokestatic com/PX.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: sipush 24374
      // 44: ldc2_w 2604183409553810464
      // 47: invokestatic com/PX.a (IJ)I
      // 4a: goto 51
      // 4d: invokestatic com/PX.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: goto 5d
      // 54: sipush 25828
      // 57: ldc2_w 2498600881696448499
      // 5a: invokestatic com/PX.a (IJ)I
      // 5d: invokestatic com/pG_3.T (C)Lcom/pG_3;
      // 60: putfield com/PX.f Lcom/pG_3;
      // 63: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 66: ifnull 76
      // 69: bipush 2
      // 6a: newarray 10
      // 6c: invokestatic com/XP.x ([I)V
      // 6f: goto 76
      // 72: invokestatic com/PX.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 75: athrow
      // 76: return
   }

   public pG_3 X() {
      return this.f;
   }

   public int l() {
      return this.o;
   }

   public int j(char var1, int var2) {
      int[] var10000 = XP.j();
      int var4 = this.f.Q(var2);
      int[] var3 = var10000;

      try {
         if (var3 != null) {
            return var4;
         }

         if (var4 >= 0) {
            return var4;
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }

      return var1;
   }

   public void t(@NotNull pG_3 var1) {
      this.f = var1;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "N.0wl\u0003o')(re\u0012*".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 20;
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
         var10007 = 20;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 19;
               break;
            case 1:
               var37 = 84;
               break;
            case 2:
               var37 = 82;
               break;
            case 3:
               var37 = 2;
               break;
            case 4:
               var37 = 20;
               break;
            case 5:
               var37 = 126;
               break;
            default:
               var37 = 31;
         }
      } else {
         var25 = 20;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 3656082006845097258L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "×È\u0014\u008c\u0097Ø¡:Óú\u009c\u009fcM\u009a\u009b";
            int var13 = "×È\u0014\u008c\u0097Ø¡:Óú\u009c\u009fcM\u009a\u009b".length();
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
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 20;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 19;
               break;
            case 1:
               var37 = 84;
               break;
            case 2:
               var37 = 82;
               break;
            case 3:
               var37 = 2;
               break;
            case 4:
               var37 = 20;
               break;
            case 5:
               var37 = 126;
               break;
            default:
               var37 = 31;
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
                  var37 = 19;
                  break;
               case 1:
                  var37 = 84;
                  break;
               case 2:
                  var37 = 82;
                  break;
               case 3:
                  var37 = 2;
                  break;
               case 4:
                  var37 = 20;
                  break;
               case 5:
                  var37 = 126;
                  break;
               default:
                  var37 = 31;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 3656082006845097258L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "×È\u0014\u008c\u0097Ø¡:Óú\u009c\u009fcM\u009a\u009b";
               int var5 = "×È\u0014\u008c\u0097Ø¡:Óú\u009c\u009fcM\u009a\u009b".length();
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
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 19;
                  break;
               case 1:
                  var37 = 84;
                  break;
               case 2:
                  var37 = 82;
                  break;
               case 3:
                  var37 = 2;
                  break;
               case 4:
                  var37 = 20;
                  break;
               case 5:
                  var37 = 126;
                  break;
               default:
                  var37 = 31;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31510;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





