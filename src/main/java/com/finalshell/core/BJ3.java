package com.finalshell.core;

public class BJ3 {
   public static String a;

   public int w() {
      return 1;
   }

   public int L() {
      return 1;
   }

   public int A(char param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.K ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifeq 1c
      // 09: iload 2
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: bipush 0
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 1
      // 20: ireturn
   }

   public int r(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/D5.e ()I
      // 003: aconst_null
      // 004: astore 4
      // 006: istore 3
      // 007: aload 1
      // 008: iload 3
      // 009: ifne 01a
      // 00c: ifnonnull 019
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 015: athrow
      // 016: ldc ""
      // 018: astore 1
      // 019: aload 2
      // 01a: iload 3
      // 01b: ifne 02c
      // 01e: ifnonnull 02b
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 027: athrow
      // 028: ldc ""
      // 02a: astore 2
      // 02b: aload 1
      // 02c: invokevirtual java/lang/String.toCharArray ()[C
      // 02f: astore 5
      // 031: aload 2
      // 032: invokevirtual java/lang/String.toCharArray ()[C
      // 035: astore 6
      // 037: aload 5
      // 039: arraylength
      // 03a: istore 7
      // 03c: aload 6
      // 03e: arraylength
      // 03f: istore 8
      // 041: aload 5
      // 043: arraylength
      // 044: iload 3
      // 045: ifne 05d
      // 048: ifne 05a
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 051: athrow
      // 052: aload 6
      // 054: arraylength
      // 055: ireturn
      // 056: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 059: athrow
      // 05a: aload 6
      // 05c: arraylength
      // 05d: iload 3
      // 05e: ifne 078
      // 061: ifne 073
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06a: athrow
      // 06b: aload 5
      // 06d: arraylength
      // 06e: ireturn
      // 06f: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 072: athrow
      // 073: aload 5
      // 075: arraylength
      // 076: bipush 1
      // 077: iadd
      // 078: aload 6
      // 07a: arraylength
      // 07b: bipush 1
      // 07c: iadd
      // 07d: multianewarray 41 2
      // 081: astore 4
      // 083: bipush 1
      // 084: istore 9
      // 086: iload 9
      // 088: iload 7
      // 08a: if_icmpgt 0b4
      // 08d: aload 4
      // 08f: iload 9
      // 091: aaload
      // 092: bipush 0
      // 093: aload 4
      // 095: iload 9
      // 097: bipush 1
      // 098: isub
      // 099: aaload
      // 09a: bipush 0
      // 09b: iaload
      // 09c: aload 0
      // 09d: invokevirtual com/finalshell/core/BJ3.w ()I
      // 0a0: iadd
      // 0a1: iastore
      // 0a2: iinc 9 1
      // 0a5: iload 3
      // 0a6: ifne 0b7
      // 0a9: iload 3
      // 0aa: ifeq 086
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b3: athrow
      // 0b4: bipush 1
      // 0b5: istore 9
      // 0b7: iload 9
      // 0b9: iload 8
      // 0bb: if_icmpgt 0ec
      // 0be: aload 4
      // 0c0: bipush 0
      // 0c1: aaload
      // 0c2: iload 9
      // 0c4: aload 4
      // 0c6: bipush 0
      // 0c7: aaload
      // 0c8: iload 9
      // 0ca: bipush 1
      // 0cb: isub
      // 0cc: iaload
      // 0cd: aload 0
      // 0ce: invokevirtual com/finalshell/core/BJ3.L ()I
      // 0d1: iadd
      // 0d2: iastore
      // 0d3: iinc 9 1
      // 0d6: iload 3
      // 0d7: ifne 0ef
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e0: athrow
      // 0e1: iload 3
      // 0e2: ifeq 0b7
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0eb: athrow
      // 0ec: bipush 1
      // 0ed: istore 9
      // 0ef: iload 9
      // 0f1: iload 7
      // 0f3: if_icmpgt 178
      // 0f6: bipush 1
      // 0f7: iload 3
      // 0f8: ifne 180
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 101: athrow
      // 102: istore 10
      // 104: iload 10
      // 106: iload 8
      // 108: if_icmpgt 171
      // 10b: aload 4
      // 10d: iload 9
      // 10f: aaload
      // 110: iload 10
      // 112: bipush 3
      // 113: newarray 10
      // 115: dup
      // 116: bipush 0
      // 117: aload 4
      // 119: iload 9
      // 11b: bipush 1
      // 11c: isub
      // 11d: aaload
      // 11e: iload 10
      // 120: iaload
      // 121: aload 0
      // 122: invokevirtual com/finalshell/core/BJ3.w ()I
      // 125: iadd
      // 126: iastore
      // 127: dup
      // 128: bipush 1
      // 129: aload 4
      // 12b: iload 9
      // 12d: aaload
      // 12e: iload 10
      // 130: bipush 1
      // 131: isub
      // 132: iaload
      // 133: aload 0
      // 134: invokevirtual com/finalshell/core/BJ3.L ()I
      // 137: iadd
      // 138: iastore
      // 139: dup
      // 13a: bipush 2
      // 13b: aload 4
      // 13d: iload 9
      // 13f: bipush 1
      // 140: isub
      // 141: aaload
      // 142: iload 10
      // 144: bipush 1
      // 145: isub
      // 146: iaload
      // 147: aload 0
      // 148: aload 5
      // 14a: iload 9
      // 14c: bipush 1
      // 14d: isub
      // 14e: caload
      // 14f: aload 6
      // 151: iload 10
      // 153: bipush 1
      // 154: isub
      // 155: caload
      // 156: invokevirtual com/finalshell/core/BJ3.A (CC)I
      // 159: iadd
      // 15a: iastore
      // 15b: invokestatic com/finalshell/core/UJ3.G ([I)I
      // 15e: iastore
      // 15f: iinc 10 1
      // 162: iload 3
      // 163: ifne 174
      // 166: iload 3
      // 167: ifeq 104
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 170: athrow
      // 171: iinc 9 1
      // 174: iload 3
      // 175: ifeq 0ef
      // 178: aload 4
      // 17a: iload 7
      // 17c: aaload
      // 17d: iload 8
      // 17f: iaload
      // 180: ireturn
   }

   public static int x(String param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/D5.K ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 014
      // 009: ifnull 022
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 012: athrow
      // 013: aload 1
      // 014: iload 2
      // 015: ifeq 032
      // 018: ifnonnull 031
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 021: athrow
      // 022: new java/lang/IllegalArgumentException
      // 025: dup
      // 026: getstatic com/finalshell/core/BJ3.a Ljava/lang/String;
      // 029: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 02c: athrow
      // 02d: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: aload 0
      // 032: invokevirtual java/lang/String.length ()I
      // 035: istore 4
      // 037: aload 1
      // 038: invokevirtual java/lang/String.length ()I
      // 03b: istore 5
      // 03d: iload 4
      // 03f: iload 2
      // 040: ifeq 056
      // 043: ifne 054
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04c: athrow
      // 04d: iload 5
      // 04f: ireturn
      // 050: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 053: athrow
      // 054: iload 5
      // 056: iload 2
      // 057: ifeq 06f
      // 05a: ifne 06b
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 063: athrow
      // 064: iload 4
      // 066: ireturn
      // 067: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06a: athrow
      // 06b: iload 4
      // 06d: bipush 1
      // 06e: iadd
      // 06f: iload 5
      // 071: bipush 1
      // 072: iadd
      // 073: multianewarray 41 2
      // 077: astore 3
      // 078: bipush 0
      // 079: istore 6
      // 07b: iload 6
      // 07d: iload 4
      // 07f: if_icmpgt 091
      // 082: aload 3
      // 083: iload 6
      // 085: aaload
      // 086: bipush 0
      // 087: iload 6
      // 089: iastore
      // 08a: iinc 6 1
      // 08d: iload 2
      // 08e: ifne 07b
      // 091: bipush 0
      // 092: istore 7
      // 094: iload 7
      // 096: iload 5
      // 098: if_icmpgt 0b5
      // 09b: aload 3
      // 09c: bipush 0
      // 09d: aaload
      // 09e: iload 7
      // 0a0: iload 7
      // 0a2: iastore
      // 0a3: iinc 7 1
      // 0a6: iload 2
      // 0a7: ifeq 0b8
      // 0aa: iload 2
      // 0ab: ifne 094
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b4: athrow
      // 0b5: bipush 1
      // 0b6: istore 6
      // 0b8: iload 6
      // 0ba: iload 4
      // 0bc: if_icmpgt 150
      // 0bf: aload 0
      // 0c0: iload 6
      // 0c2: bipush 1
      // 0c3: isub
      // 0c4: invokevirtual java/lang/String.charAt (I)C
      // 0c7: istore 8
      // 0c9: bipush 1
      // 0ca: iload 2
      // 0cb: ifeq 157
      // 0ce: istore 7
      // 0d0: iload 7
      // 0d2: iload 5
      // 0d4: if_icmpgt 149
      // 0d7: aload 1
      // 0d8: iload 7
      // 0da: bipush 1
      // 0db: isub
      // 0dc: invokevirtual java/lang/String.charAt (I)C
      // 0df: istore 9
      // 0e1: iload 8
      // 0e3: iload 2
      // 0e4: ifeq 106
      // 0e7: iload 9
      // 0e9: iload 2
      // 0ea: ifeq 0bc
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: if_icmpne 0fe
      // 0f7: bipush 0
      // 0f8: istore 10
      // 0fa: iload 2
      // 0fb: ifne 108
      // 0fe: bipush 1
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/BJ3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: istore 10
      // 108: aload 3
      // 109: iload 6
      // 10b: aaload
      // 10c: iload 7
      // 10e: bipush 3
      // 10f: newarray 10
      // 111: dup
      // 112: bipush 0
      // 113: aload 3
      // 114: iload 6
      // 116: bipush 1
      // 117: isub
      // 118: aaload
      // 119: iload 7
      // 11b: iaload
      // 11c: bipush 1
      // 11d: iadd
      // 11e: iastore
      // 11f: dup
      // 120: bipush 1
      // 121: aload 3
      // 122: iload 6
      // 124: aaload
      // 125: iload 7
      // 127: bipush 1
      // 128: isub
      // 129: iaload
      // 12a: bipush 1
      // 12b: iadd
      // 12c: iastore
      // 12d: dup
      // 12e: bipush 2
      // 12f: aload 3
      // 130: iload 6
      // 132: bipush 1
      // 133: isub
      // 134: aaload
      // 135: iload 7
      // 137: bipush 1
      // 138: isub
      // 139: iaload
      // 13a: iload 10
      // 13c: iadd
      // 13d: iastore
      // 13e: invokestatic com/finalshell/core/UJ3.G ([I)I
      // 141: iastore
      // 142: iinc 7 1
      // 145: iload 2
      // 146: ifne 0d0
      // 149: iinc 6 1
      // 14c: iload 2
      // 14d: ifne 0b8
      // 150: aload 3
      // 151: iload 4
      // 153: aaload
      // 154: iload 5
      // 156: iaload
      // 157: ireturn
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "4[I\u0012C5)GBN\bYr4\b[\u001b\u0019Hr4\u0012CW".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 54;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 54;
         var10006 = var0;
      } else {
         var6 = 54;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 54;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 81;
               break;
            case 1:
               var23 = 25;
               break;
            case 2:
               var23 = 13;
               break;
            case 3:
               var23 = 77;
               break;
            case 4:
               var23 = 27;
               break;
            case 5:
               var23 = 100;
               break;
            default:
               var23 = 108;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





