package com.finalshell.core;

import java.io.File;
import java.io.FileNotFoundException;

public class KG {
   public File s;
   long x;
   public static String a;
   public static long[] b;
   public static Integer[] c;
   public static long[] d;
   public static Long[] e;

   public KG(String var1) {
      this.s = new File(var1);
   }

   public byte[][] B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 2
      // 002: aconst_null
      // 003: astore 3
      // 004: aload 0
      // 005: aload 0
      // 006: getfield com/finalshell/core/KG.s Ljava/io/File;
      // 009: invokevirtual java/io/File.length ()J
      // 00c: putfield com/finalshell/core/KG.x J
      // 00f: invokestatic com/finalshell/core/D6.k ()Ljava/lang/String;
      // 012: aconst_null
      // 013: astore 4
      // 015: astore 1
      // 016: new java/io/FileInputStream
      // 019: dup
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/KG.s Ljava/io/File;
      // 01e: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 021: astore 5
      // 023: new java/io/BufferedInputStream
      // 026: dup
      // 027: aload 5
      // 029: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 02c: astore 4
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/KG.s Ljava/io/File;
      // 032: invokevirtual java/io/File.length ()J
      // 035: sipush 11746
      // 038: ldc2_w 4814929303217512045
      // 03b: invokestatic com/finalshell/core/KG.b (IJ)J
      // 03e: ldiv
      // 03f: l2i
      // 040: istore 6
      // 042: aload 0
      // 043: getfield com/finalshell/core/KG.s Ljava/io/File;
      // 046: invokevirtual java/io/File.length ()J
      // 049: sipush 30761
      // 04c: ldc2_w 8083936393603402663
      // 04f: invokestatic com/finalshell/core/KG.b (IJ)J
      // 052: lrem
      // 053: lconst_0
      // 054: lcmp
      // 055: aload 1
      // 056: ifnonnull 068
      // 059: ifeq 066
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 062: athrow
      // 063: iinc 6 1
      // 066: iload 6
      // 068: aload 1
      // 069: ifnonnull 07b
      // 06c: ifne 079
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 075: athrow
      // 076: bipush 1
      // 077: istore 6
      // 079: iload 6
      // 07b: sipush 28384
      // 07e: ldc2_w 9131803016244656915
      // 081: invokestatic com/finalshell/core/KG.a (IJ)I
      // 084: multianewarray 76 2
      // 088: astore 2
      // 089: bipush 0
      // 08a: istore 7
      // 08c: goto 124
      // 08f: bipush 0
      // 090: istore 8
      // 092: aload 0
      // 093: getfield com/finalshell/core/KG.x J
      // 096: sipush 30761
      // 099: ldc2_w 8083936393603402663
      // 09c: invokestatic com/finalshell/core/KG.b (IJ)J
      // 09f: lcmp
      // 0a0: aload 1
      // 0a1: ifnonnull 0c2
      // 0a4: ifgt 0b9
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield com/finalshell/core/KG.x J
      // 0b2: l2i
      // 0b3: istore 8
      // 0b5: aload 1
      // 0b6: ifnull 0fb
      // 0b9: iload 7
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: ifnonnull 0f9
      // 0c6: iload 6
      // 0c8: bipush 1
      // 0c9: isub
      // 0ca: if_icmpge 0e3
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0d3: athrow
      // 0d4: sipush 32510
      // 0d7: ldc2_w 646926203746544396
      // 0da: invokestatic com/finalshell/core/KG.a (IJ)I
      // 0dd: istore 8
      // 0df: aload 1
      // 0e0: ifnull 0fb
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/core/KG.x J
      // 0e7: sipush 30761
      // 0ea: ldc2_w 8083936393603402663
      // 0ed: invokestatic com/finalshell/core/KG.b (IJ)J
      // 0f0: lrem
      // 0f1: l2i
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0f8: athrow
      // 0f9: istore 8
      // 0fb: iload 8
      // 0fd: newarray 8
      // 0ff: astore 9
      // 101: getstatic com/finalshell/core/KG.a Ljava/lang/String;
      // 104: invokestatic java/security/MessageDigest.getInstance (Ljava/lang/String;)Ljava/security/MessageDigest;
      // 107: astore 3
      // 108: aload 4
      // 10a: aload 9
      // 10c: invokevirtual java/io/BufferedInputStream.read ([B)I
      // 10f: pop
      // 110: aload 3
      // 111: aload 9
      // 113: invokevirtual java/security/MessageDigest.update ([B)V
      // 116: aload 2
      // 117: iload 7
      // 119: aload 3
      // 11a: invokevirtual java/security/MessageDigest.digest ()[B
      // 11d: aastore
      // 11e: aconst_null
      // 11f: astore 9
      // 121: iinc 7 1
      // 124: iload 7
      // 126: iload 6
      // 128: if_icmplt 08f
      // 12b: aload 4
      // 12d: invokevirtual java/io/BufferedInputStream.close ()V
      // 130: goto 1bd
      // 133: astore 5
      // 135: aload 5
      // 137: invokevirtual java/io/FileNotFoundException.printStackTrace ()V
      // 13a: aload 4
      // 13c: aload 1
      // 13d: ifnonnull 145
      // 140: ifnull 1dc
      // 143: aload 4
      // 145: invokevirtual java/io/BufferedInputStream.close ()V
      // 148: goto 1dc
      // 14b: astore 11
      // 14d: aload 11
      // 14f: invokevirtual java/io/IOException.printStackTrace ()V
      // 152: goto 1dc
      // 155: astore 5
      // 157: aload 5
      // 159: invokevirtual java/io/IOException.printStackTrace ()V
      // 15c: aload 4
      // 15e: aload 1
      // 15f: ifnonnull 167
      // 162: ifnull 1dc
      // 165: aload 4
      // 167: invokevirtual java/io/BufferedInputStream.close ()V
      // 16a: goto 1dc
      // 16d: astore 11
      // 16f: aload 11
      // 171: invokevirtual java/io/IOException.printStackTrace ()V
      // 174: goto 1dc
      // 177: astore 5
      // 179: aload 5
      // 17b: invokevirtual java/security/NoSuchAlgorithmException.printStackTrace ()V
      // 17e: aload 4
      // 180: aload 1
      // 181: ifnonnull 189
      // 184: ifnull 1dc
      // 187: aload 4
      // 189: invokevirtual java/io/BufferedInputStream.close ()V
      // 18c: goto 1dc
      // 18f: astore 11
      // 191: aload 11
      // 193: invokevirtual java/io/IOException.printStackTrace ()V
      // 196: goto 1dc
      // 199: astore 10
      // 19b: aload 4
      // 19d: aload 1
      // 19e: ifnonnull 1ad
      // 1a1: ifnull 1ba
      // 1a4: goto 1ab
      // 1a7: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 1aa: athrow
      // 1ab: aload 4
      // 1ad: invokevirtual java/io/BufferedInputStream.close ()V
      // 1b0: goto 1ba
      // 1b3: astore 11
      // 1b5: aload 11
      // 1b7: invokevirtual java/io/IOException.printStackTrace ()V
      // 1ba: aload 10
      // 1bc: athrow
      // 1bd: aload 4
      // 1bf: aload 1
      // 1c0: ifnonnull 1cf
      // 1c3: ifnull 1dc
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/KG.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 1cc: athrow
      // 1cd: aload 4
      // 1cf: invokevirtual java/io/BufferedInputStream.close ()V
      // 1d2: goto 1dc
      // 1d5: astore 11
      // 1d7: aload 11
      // 1d9: invokevirtual java/io/IOException.printStackTrace ()V
      // 1dc: aload 2
      // 1dd: areturn
   }

   public static FileNotFoundException a(FileNotFoundException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5619;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 13199) & 32767;
      if (e[var3] == null) {
         e[var3] = d[var3] ^ var1;
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "+1q".toCharArray();
      int var10004 = var10003.length;
      int var16 = 0;
      byte var44 = 88;
      char[] var10002 = var10003;
      int var31 = var10004;
      char[] var52;
      byte var60;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var52 = var10003;
         var10005 = var16;
         char var10008 = var10003[var16];
         var10007 = 88;
         var10006 = var10008;
         switch (var16 % 7) {
            case 0:
               var60 = 62;
               break;
            case 1:
               var60 = 45;
               break;
            case 2:
               var60 = 28;
               break;
            case 3:
               var60 = 98;
               break;
            case 4:
               var60 = 96;
               break;
            case 5:
               var60 = 124;
               break;
            default:
               var60 = 91;
         }
      } else {
         var44 = 88;
         var31 = var10004;
         if (var10004 <= var16) {
            String var49 = new String(var10003).intern();
            int var38 = -1;
            a = var49;
            long var24 = 1244861023483180375L;
            long[] var29 = new long[2];
            int var26 = 0;
            String var27 = "Â |\u0092¥kÎT\u001eã\u0089R1MÞ[";
            int var28 = "Â |\u0092¥kÎT\u001eã\u0089R1MÞ[".length();
            byte var25 = 0;

            do {
               var38 = var25;
               var25 += 8;
               byte[] var30 = var27.substring(var38, var25).getBytes("ISO-8859-1");
               var38 = var26++;
               long var57 = (
                     ((long)var30[0] & 255L) << 56
                        | ((long)var30[1] & 255L) << 48
                        | ((long)var30[2] & 255L) << 40
                        | ((long)var30[3] & 255L) << 32
                        | ((long)var30[4] & 255L) << 24
                        | ((long)var30[5] & 255L) << 16
                        | ((long)var30[6] & 255L) << 8
                        | (long)var30[7] & 255L
                  )
                  ^ var24;
               byte var50 = -1;
               var29[var38] = var57;
            } while (var25 < var28);

            b = var29;
            c = new Integer[2];
            long var17 = 5895645863825560377L;
            long[] var22 = new long[2];
            int var19 = 0;
            String var20 = "\u0013\u0003\u009a\u001dê<ÍT!þcüýO\u0098\u009e";
            int var21 = "\u0013\u0003\u009a\u001dê<ÍT!þcüýO\u0098\u009e".length();
            byte var18 = 0;

            do {
               int var41 = var18;
               var18 += 8;
               byte[] var23 = var20.substring(var41, var18).getBytes("ISO-8859-1");
               var41 = var19++;
               long var58 = (
                     ((long)var23[0] & 255L) << 56
                        | ((long)var23[1] & 255L) << 48
                        | ((long)var23[2] & 255L) << 40
                        | ((long)var23[3] & 255L) << 32
                        | ((long)var23[4] & 255L) << 24
                        | ((long)var23[5] & 255L) << 16
                        | ((long)var23[6] & 255L) << 8
                        | (long)var23[7] & 255L
                  )
                  ^ var17;
               byte var51 = -1;
               var22[var41] = var58;
            } while (var18 < var21);

            d = var22;
            e = new Long[2];
            return;
         }

         var52 = var10003;
         var10005 = var16;
         char var61 = var10003[var16];
         var10007 = 88;
         var10006 = var61;
         switch (var16 % 7) {
            case 0:
               var60 = 62;
               break;
            case 1:
               var60 = 45;
               break;
            case 2:
               var60 = 28;
               break;
            case 3:
               var60 = 98;
               break;
            case 4:
               var60 = 96;
               break;
            case 5:
               var60 = 124;
               break;
            default:
               var60 = 91;
         }
      }

      while (true) {
         var52[var10005] = (char)(var10006 ^ var10007 ^ var60);
         var16++;
         if (var44 == 0) {
            var52 = var10002;
            var10005 = var44;
            char var63 = var10002[var44];
            var10007 = var44;
            var10006 = var63;
            switch (var16 % 7) {
               case 0:
                  var60 = 62;
                  break;
               case 1:
                  var60 = 45;
                  break;
               case 2:
                  var60 = 28;
                  break;
               case 3:
                  var60 = 98;
                  break;
               case 4:
                  var60 = 96;
                  break;
               case 5:
                  var60 = 124;
                  break;
               default:
                  var60 = 91;
            }
         } else {
            if (var31 <= var16) {
               String var46 = new String(var10002).intern();
               int var33 = -1;
               a = var46;
               long var8 = 1244861023483180375L;
               long[] var14 = new long[2];
               int var11 = 0;
               String var12 = "Â |\u0092¥kÎT\u001eã\u0089R1MÞ[";
               int var13 = "Â |\u0092¥kÎT\u001eã\u0089R1MÞ[".length();
               byte var10 = 0;

               do {
                  var33 = var10;
                  var10 += 8;
                  byte[] var15 = var12.substring(var33, var10).getBytes("ISO-8859-1");
                  var33 = var11++;
                  long var55 = (
                        ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L
                     )
                     ^ var8;
                  byte var47 = -1;
                  var14[var33] = var55;
               } while (var10 < var13);

               b = var14;
               c = new Integer[2];
               long var0 = 5895645863825560377L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u0013\u0003\u009a\u001dê<ÍT!þcüýO\u0098\u009e";
               int var5 = "\u0013\u0003\u009a\u001dê<ÍT!þcüýO\u0098\u009e".length();
               byte var2 = 0;

               do {
                  int var36 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                  var36 = var3++;
                  long var56 = (
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
                  byte var48 = -1;
                  var6[var36] = var56;
               } while (var2 < var5);

               d = var6;
               e = new Long[2];
               return;
            }

            var52 = var10002;
            var10005 = var16;
            char var62 = var10002[var16];
            var10007 = var44;
            var10006 = var62;
            switch (var16 % 7) {
               case 0:
                  var60 = 62;
                  break;
               case 1:
                  var60 = 45;
                  break;
               case 2:
                  var60 = 28;
                  break;
               case 3:
                  var60 = 98;
                  break;
               case 4:
                  var60 = 96;
                  break;
               case 5:
                  var60 = 124;
                  break;
               default:
                  var60 = 91;
            }
         }
      }
   }
}





