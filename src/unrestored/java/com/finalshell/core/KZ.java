package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.regex.Pattern;

public class KZ {
   public static Pattern n;
   public static Pattern D;
   public double e;
   public int J;
   public int x;
   public String o;
   public static int O;
   public static long[] a;
   public static Integer[] b;

   public KZ(double var1, int var3) {
      this.e = var1;
      this.J = 0;
      this.x = var3;
   }

   public KZ(double var1, int var3, int var4) {
   super();
      int var10000 = G();
      this.e = var1;
      int var5 = var10000;

      try {
         this.J = var3;
         this.x = var4;
         if (Ky4.F$arrString() != null) {
            O(++var5);
         }
      } catch (NumberFormatException var6) {
         throw new RuntimeException(a(var6));
      }
   }

   public KZ(String var1) {
      this.F(var1);
   }

   public void F(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/KZ.G ()I
      // 003: istore 2
      // 004: getstatic com/finalshell/core/KZ.n Ljava/util/regex/Pattern;
      // 007: aload 1
      // 008: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 00b: astore 3
      // 00c: aload 3
      // 00d: invokevirtual java/util/regex/Matcher.matches ()Z
      // 010: iload 2
      // 011: ifne 029
      // 014: ifeq 119
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 01d: athrow
      // 01e: aload 3
      // 01f: invokevirtual java/util/regex/Matcher.groupCount ()I
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 028: athrow
      // 029: istore 4
      // 02b: aload 0
      // 02c: aload 3
      // 02d: bipush 1
      // 02e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 031: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 034: putfield com/finalshell/core/KZ.e D
      // 037: iload 4
      // 039: bipush 3
      // 03a: iload 2
      // 03b: ifne 06d
      // 03e: if_icmplt 06a
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 047: athrow
      // 048: aload 3
      // 049: bipush 3
      // 04a: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 04d: ifnull 06a
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 056: athrow
      // 057: aload 0
      // 058: aload 3
      // 059: bipush 3
      // 05a: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 05d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 060: putfield com/finalshell/core/KZ.J I
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 069: athrow
      // 06a: iload 4
      // 06c: bipush 5
      // 06d: iload 2
      // 06e: ifne 0af
      // 071: if_icmplt 0a4
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 07a: athrow
      // 07b: aload 3
      // 07c: bipush 5
      // 07d: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 080: ifnull 0a4
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 089: athrow
      // 08a: aload 0
      // 08b: aload 3
      // 08c: bipush 5
      // 08d: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 090: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 093: putfield com/finalshell/core/KZ.x I
      // 096: goto 0a4
      // 099: astore 5
      // 09b: aload 0
      // 09c: aload 3
      // 09d: bipush 5
      // 09e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0a1: putfield com/finalshell/core/KZ.o Ljava/lang/String;
      // 0a4: iload 4
      // 0a6: sipush 20438
      // 0a9: ldc2_w 3434597630685885513
      // 0ac: invokestatic com/finalshell/core/KZ.a (IJ)I
      // 0af: if_icmplt 119
      // 0b2: aload 3
      // 0b3: sipush 28870
      // 0b6: ldc2_w 2691090523496090456
      // 0b9: invokestatic com/finalshell/core/KZ.a (IJ)I
      // 0bc: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0bf: iload 2
      // 0c0: ifne 0e8
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0c9: athrow
      // 0ca: ifnull 119
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0d3: athrow
      // 0d4: aload 3
      // 0d5: sipush 28870
      // 0d8: ldc2_w 2691090523496090456
      // 0db: invokestatic com/finalshell/core/KZ.a (IJ)I
      // 0de: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0e7: athrow
      // 0e8: astore 5
      // 0ea: aload 5
      // 0ec: iload 2
      // 0ed: ifne 106
      // 0f0: ifnull 119
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0f9: athrow
      // 0fa: aload 5
      // 0fc: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 105: athrow
      // 106: invokevirtual java/lang/String.length ()I
      // 109: ifle 119
      // 10c: aload 0
      // 10d: aload 5
      // 10f: putfield com/finalshell/core/KZ.o Ljava/lang/String;
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 118: athrow
      // 119: goto 194
      // 11c: astore 3
      // 11d: getstatic com/finalshell/core/KZ.D Ljava/util/regex/Pattern;
      // 120: aload 1
      // 121: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 124: astore 4
      // 126: aload 4
      // 128: invokevirtual java/util/regex/Matcher.matches ()Z
      // 12b: iload 2
      // 12c: ifne 145
      // 12f: ifeq 17e
      // 132: goto 139
      // 135: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 138: athrow
      // 139: aload 4
      // 13b: invokevirtual java/util/regex/Matcher.groupCount ()I
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 144: athrow
      // 145: istore 5
      // 147: aload 0
      // 148: aload 4
      // 14a: bipush 1
      // 14b: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 14e: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 151: putfield com/finalshell/core/KZ.e D
      // 154: iload 5
      // 156: bipush 3
      // 157: if_icmplt 17e
      // 15a: aload 4
      // 15c: bipush 3
      // 15d: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 160: ifnull 17e
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 169: athrow
      // 16a: aload 0
      // 16b: aload 4
      // 16d: bipush 3
      // 16e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 171: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 174: putfield com/finalshell/core/KZ.J I
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 17d: athrow
      // 17e: goto 194
      // 181: astore 4
      // 183: aload 0
      // 184: ldc2_w 1.4
      // 187: putfield com/finalshell/core/KZ.e D
      // 18a: aload 0
      // 18b: bipush 0
      // 18c: putfield com/finalshell/core/KZ.J I
      // 18f: aload 0
      // 190: bipush 0
      // 191: putfield com/finalshell/core/KZ.x I
      // 194: return
   }

   public int r(double param1, int param3, int param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/KZ.G ()I
      // 03: aload 0
      // 04: getfield com/finalshell/core/KZ.e D
      // 07: dload 1
      // 08: dsub
      // 09: dstore 6
      // 0b: istore 5
      // 0d: dload 6
      // 0f: dconst_0
      // 10: dcmpl
      // 11: iload 5
      // 13: ifne 46
      // 16: ifeq 40
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1f: athrow
      // 20: dload 6
      // 22: dconst_0
      // 23: dcmpg
      // 24: iload 5
      // 26: ifne 3b
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2f: athrow
      // 30: ifge 3e
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 39: athrow
      // 3a: bipush -1
      // 3b: goto 3f
      // 3e: bipush 1
      // 3f: ireturn
      // 40: aload 0
      // 41: getfield com/finalshell/core/KZ.J I
      // 44: iload 3
      // 45: isub
      // 46: istore 8
      // 48: iload 8
      // 4a: iload 5
      // 4c: ifne 67
      // 4f: ifeq 60
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 58: athrow
      // 59: iload 8
      // 5b: ireturn
      // 5c: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield com/finalshell/core/KZ.x I
      // 64: iload 4
      // 66: isub
      // 67: iload 5
      // 69: ifeq 7a
      // 6c: bipush 4
      // 6d: anewarray 97
      // 70: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/KZ.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 79: athrow
      // 7a: ireturn
   }

   public double Y() {
      return this.e;
   }

   public int K() {
      return this.J;
   }

   public int R() {
      return this.x;
   }

   public String i() {
      return this.o;
   }

   static {
      __vfClinit__();
   }

   public static void O(int var0) {
      O = var0;
   }

   public static int M() {
      return O;
   }

   public static int G() {
      int var0 = M();

      try {
         return var0 == 0 ? 40 : 0;
      } catch (NumberFormatException var1) {
         throw new RuntimeException(a(var1));
      }
   }

   public static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31647;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[2];
      int var12 = 0;
      String var11 = "YAe+u?\u0014\u00156((u?`-y*)\u0000.`.5Z^\u0004LcX4>(\u0007;a\u0018YAe+u?\u0014\u00156((u?`-y*)\u0000.`_7(";
      int var13 = "YAe+u?\u0014\u00156((u?`-y*)\u0000.`.5Z^\u0004LcX4>(\u0007;a\u0018YAe+u?\u0014\u00156((u?`-y*)\u0000.`_7(".length();
      char var10 = '#';
      int var9 = -1;
      O(116);

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var11.substring(++var9, var9 + var10).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 74;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 74;
               var10006 = var14;
            } else {
               var23 = 74;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 74;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 59;
                     break;
                  case 1:
                     var41 = 87;
                     break;
                  case 2:
                     var41 = 75;
                     break;
                  case 3:
                     var41 = 74;
                     break;
                  case 4:
                     var41 = 99;
                     break;
                  case 5:
                     var41 = 91;
                     break;
                  default:
                     var41 = 2;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var8[var12++] = var25;
         if ((var9 += var10) >= var13) {
            long var0 = 423573338834277636L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "ô\u0018öN\u0016å!KÙ¢Äûªì\u009eZ";
            int var5 = "ô\u0018öN\u0016å!KÙ¢Äûªì\u009eZ".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            a = var6;
            b = new Integer[2];
            n = Pattern.compile(var8[0]);
            D = Pattern.compile(var8[1]);
            return;
         }

         var10 = var11.charAt(var9);
      }
   }
}





