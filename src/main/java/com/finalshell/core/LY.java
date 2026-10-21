package com.finalshell.core;

import com.finalshell.ui.model.Dc2;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class LY {
   public int x;
   public int[] t;
   public char I;
   public ArrayList j;
   public boolean a = false;
   public boolean P = false;
   public final StringBuilder G = new StringBuilder();
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public LY(Y42 var1) throws IOException {
      this.t = new int[5];
      this.x = 0;
      this.v(var1);
   }

   public void v(Y42 param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/SelectUploadFile.r$String ()Ljava/lang/String;
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/LY.x I
      // 008: bipush 0
      // 009: istore 3
      // 00a: bipush 0
      // 00b: istore 4
      // 00d: astore 2
      // 00e: bipush -1
      // 00f: istore 5
      // 011: aload 1
      // 012: invokeinterface com/finalshell/core/Y42.C ()C 1
      // 017: istore 6
      // 019: aload 0
      // 01a: getfield com/finalshell/core/LY.G Ljava/lang/StringBuilder;
      // 01d: iload 6
      // 01f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 022: pop
      // 023: iinc 5 1
      // 026: iload 6
      // 028: sipush 8923
      // 02b: ldc2_w 3749490279074827177
      // 02e: invokestatic com/finalshell/core/LY.a (IJ)I
      // 031: if_icmpne 05f
      // 034: iload 5
      // 036: aload 2
      // 037: ifnonnull 068
      // 03a: aload 2
      // 03b: ifnonnull 068
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 044: athrow
      // 045: ifne 05f
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 04e: athrow
      // 04f: aload 0
      // 050: bipush 1
      // 051: putfield com/finalshell/core/LY.a Z
      // 054: aload 2
      // 055: ifnull 24c
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05e: athrow
      // 05f: iload 6
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 067: athrow
      // 068: sipush 31865
      // 06b: ldc2_w 3524648769106924810
      // 06e: invokestatic com/finalshell/core/LY.a (IJ)I
      // 071: aload 2
      // 072: ifnonnull 0b8
      // 075: if_icmpne 0a6
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 07e: athrow
      // 07f: iload 5
      // 081: aload 2
      // 082: ifnonnull 0af
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 08b: athrow
      // 08c: ifne 0a6
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 095: athrow
      // 096: aload 0
      // 097: bipush 1
      // 098: putfield com/finalshell/core/LY.P Z
      // 09b: aload 2
      // 09c: ifnull 24c
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a5: athrow
      // 0a6: iload 6
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ae: athrow
      // 0af: sipush 6009
      // 0b2: ldc2_w 4849407136697925124
      // 0b5: invokestatic com/finalshell/core/LY.a (IJ)I
      // 0b8: aload 2
      // 0b9: ifnonnull 147
      // 0bc: if_icmpne 135
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c5: athrow
      // 0c6: iload 3
      // 0c7: aload 2
      // 0c8: ifnonnull 0f1
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d1: athrow
      // 0d2: ifle 24c
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: dup
      // 0de: getfield com/finalshell/core/LY.x I
      // 0e1: bipush 1
      // 0e2: iadd
      // 0e3: putfield com/finalshell/core/LY.x I
      // 0e6: aload 0
      // 0e7: getfield com/finalshell/core/LY.x I
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: ifnonnull 130
      // 0f5: aload 0
      // 0f6: getfield com/finalshell/core/LY.t [I
      // 0f9: arraylength
      // 0fa: if_icmpne 125
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 103: athrow
      // 104: aload 0
      // 105: getfield com/finalshell/core/LY.t [I
      // 108: arraylength
      // 109: bipush 2
      // 10a: imul
      // 10b: newarray 10
      // 10d: astore 7
      // 10f: aload 0
      // 110: getfield com/finalshell/core/LY.t [I
      // 113: bipush 0
      // 114: aload 7
      // 116: bipush 0
      // 117: aload 0
      // 118: getfield com/finalshell/core/LY.t [I
      // 11b: arraylength
      // 11c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11f: aload 0
      // 120: aload 7
      // 122: putfield com/finalshell/core/LY.t [I
      // 125: aload 0
      // 126: getfield com/finalshell/core/LY.t [I
      // 129: aload 0
      // 12a: getfield com/finalshell/core/LY.x I
      // 12d: bipush 0
      // 12e: iastore
      // 12f: bipush 0
      // 130: istore 3
      // 131: aload 2
      // 132: ifnull 24c
      // 135: sipush 4990
      // 138: ldc2_w 7312599300505614859
      // 13b: invokestatic com/finalshell/core/LY.a (IJ)I
      // 13e: iload 6
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 146: athrow
      // 147: aload 2
      // 148: ifnonnull 1ba
      // 14b: if_icmpgt 1a8
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 154: athrow
      // 155: iload 6
      // 157: sipush 31626
      // 15a: ldc2_w 2864821236645876477
      // 15d: invokestatic com/finalshell/core/LY.a (IJ)I
      // 160: aload 2
      // 161: ifnonnull 1ba
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 16a: athrow
      // 16b: if_icmpgt 1a8
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 174: athrow
      // 175: aload 0
      // 176: getfield com/finalshell/core/LY.t [I
      // 179: aload 0
      // 17a: getfield com/finalshell/core/LY.x I
      // 17d: aload 0
      // 17e: getfield com/finalshell/core/LY.t [I
      // 181: aload 0
      // 182: getfield com/finalshell/core/LY.x I
      // 185: iaload
      // 186: sipush 26534
      // 189: ldc2_w 1427044044393205462
      // 18c: invokestatic com/finalshell/core/LY.a (IJ)I
      // 18f: imul
      // 190: iload 6
      // 192: iadd
      // 193: sipush 32362
      // 196: ldc2_w 4560277042066839315
      // 199: invokestatic com/finalshell/core/LY.a (IJ)I
      // 19c: isub
      // 19d: iastore
      // 19e: iinc 3 1
      // 1a1: bipush 1
      // 1a2: istore 4
      // 1a4: aload 2
      // 1a5: ifnull 24c
      // 1a8: sipush 11844
      // 1ab: ldc2_w 1600636455380092730
      // 1ae: invokestatic com/finalshell/core/LY.a (IJ)I
      // 1b1: iload 6
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b9: athrow
      // 1ba: aload 2
      // 1bb: ifnonnull 20b
      // 1be: if_icmpgt 1f9
      // 1c1: goto 1c8
      // 1c4: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c7: athrow
      // 1c8: iload 6
      // 1ca: sipush 8106
      // 1cd: ldc2_w 7087231498955405020
      // 1d0: invokestatic com/finalshell/core/LY.a (IJ)I
      // 1d3: aload 2
      // 1d4: ifnonnull 20b
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1dd: athrow
      // 1de: if_icmpgt 1f9
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: iload 6
      // 1eb: invokespecial com/finalshell/core/LY.I (C)V
      // 1ee: aload 2
      // 1ef: ifnull 24c
      // 1f2: goto 1f9
      // 1f5: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1f8: athrow
      // 1f9: sipush 31091
      // 1fc: ldc2_w 1598051738249351175
      // 1ff: invokestatic com/finalshell/core/LY.a (IJ)I
      // 202: iload 6
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 20a: athrow
      // 20b: aload 2
      // 20c: ifnonnull 22b
      // 20f: if_icmpgt 23f
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 218: athrow
      // 219: iload 6
      // 21b: sipush 17406
      // 21e: ldc2_w 2017591533633858191
      // 221: invokestatic com/finalshell/core/LY.a (IJ)I
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22a: athrow
      // 22b: if_icmpgt 23f
      // 22e: aload 0
      // 22f: iload 6
      // 231: putfield com/finalshell/core/LY.I C
      // 234: aload 2
      // 235: ifnull 250
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 23e: athrow
      // 23f: aload 0
      // 240: iload 6
      // 242: invokespecial com/finalshell/core/LY.I (C)V
      // 245: goto 24c
      // 248: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24b: athrow
      // 24c: aload 2
      // 24d: ifnull 011
      // 250: aload 0
      // 251: dup
      // 252: getfield com/finalshell/core/LY.x I
      // 255: iload 4
      // 257: iadd
      // 258: putfield com/finalshell/core/LY.x I
      // 25b: return
   }

   public void I(char var1) {
      String var2 = SelectUploadFile.r$String();
      ArrayList var10000 = this.j;
      if (var2 == null) {
         if (this.j == null) {
            this.j = new ArrayList();
         }

         var10000 = this.j;
      }

      var10000.add(var1);
   }

   public boolean q(Y42 param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/SelectUploadFile.r$String ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/LY.j Ljava/util/ArrayList;
      // 008: ifnonnull 011
      // 00b: bipush 0
      // 00c: ireturn
      // 00d: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 010: athrow
      // 011: sipush 13896
      // 014: ldc2_w 5476812939393507124
      // 017: invokestatic com/finalshell/core/LY.a (IJ)I
      // 01a: newarray 5
      // 01c: astore 3
      // 01d: bipush 0
      // 01e: istore 4
      // 020: aload 0
      // 021: getfield com/finalshell/core/LY.j Ljava/util/ArrayList;
      // 024: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 027: astore 5
      // 029: aload 5
      // 02b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 030: ifeq 05a
      // 033: aload 5
      // 035: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03a: checkcast java/lang/Character
      // 03d: invokevirtual java/lang/Character.charValue ()C
      // 040: istore 6
      // 042: aload 3
      // 043: iload 4
      // 045: iinc 4 1
      // 048: iload 6
      // 04a: castore
      // 04b: aload 2
      // 04c: ifnonnull 07a
      // 04f: aload 2
      // 050: ifnull 029
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 059: athrow
      // 05a: aload 3
      // 05b: iload 4
      // 05d: iinc 4 1
      // 060: sipush 21524
      // 063: ldc2_w 4837511606043606382
      // 066: invokestatic com/finalshell/core/LY.a (IJ)I
      // 069: castore
      // 06a: aload 3
      // 06b: iload 4
      // 06d: iinc 4 1
      // 070: sipush 619
      // 073: ldc2_w 3279952298483297040
      // 076: invokestatic com/finalshell/core/LY.a (IJ)I
      // 079: castore
      // 07a: aload 0
      // 07b: getfield com/finalshell/core/LY.a Z
      // 07e: aload 2
      // 07f: ifnonnull 0a7
      // 082: ifeq 0a3
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 08b: athrow
      // 08c: aload 3
      // 08d: iload 4
      // 08f: iinc 4 1
      // 092: sipush 8106
      // 095: ldc2_w 7087231498955405020
      // 098: invokestatic com/finalshell/core/LY.a (IJ)I
      // 09b: castore
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/LY.P Z
      // 0a7: aload 2
      // 0a8: ifnonnull 0cd
      // 0ab: ifeq 0cc
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b4: athrow
      // 0b5: aload 3
      // 0b6: iload 4
      // 0b8: iinc 4 1
      // 0bb: sipush 18016
      // 0be: ldc2_w 2845729727191674648
      // 0c1: invokestatic com/finalshell/core/LY.a (IJ)I
      // 0c4: castore
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: istore 5
      // 0cf: iload 5
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/core/LY.x I
      // 0d5: if_icmpge 14a
      // 0d8: iload 5
      // 0da: aload 2
      // 0db: ifnonnull 15f
      // 0de: aload 2
      // 0df: ifnonnull 111
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e8: athrow
      // 0e9: ifeq 10a
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f2: athrow
      // 0f3: aload 3
      // 0f4: iload 4
      // 0f6: iinc 4 1
      // 0f9: sipush 10651
      // 0fc: ldc2_w 208800221344661732
      // 0ff: invokestatic com/finalshell/core/LY.a (IJ)I
      // 102: castore
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield com/finalshell/core/LY.t [I
      // 10e: iload 5
      // 110: iaload
      // 111: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 114: astore 6
      // 116: bipush 0
      // 117: istore 7
      // 119: iload 7
      // 11b: aload 6
      // 11d: invokevirtual java/lang/String.length ()I
      // 120: if_icmpge 143
      // 123: aload 3
      // 124: iload 4
      // 126: iinc 4 1
      // 129: aload 6
      // 12b: iload 7
      // 12d: invokevirtual java/lang/String.charAt (I)C
      // 130: castore
      // 131: iinc 7 1
      // 134: aload 2
      // 135: ifnonnull 146
      // 138: aload 2
      // 139: ifnull 119
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/LY.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 142: athrow
      // 143: iinc 5 1
      // 146: aload 2
      // 147: ifnull 0cf
      // 14a: aload 3
      // 14b: iload 4
      // 14d: iinc 4 1
      // 150: aload 0
      // 151: getfield com/finalshell/core/LY.I C
      // 154: castore
      // 155: aload 1
      // 156: aload 3
      // 157: iload 4
      // 159: invokeinterface com/finalshell/core/Y42.h ([CI)V 3
      // 15e: bipush 1
      // 15f: ireturn
   }

   public int a$int() {
      return this.x;
   }

   public final int Q(int var1, int var2) {
      String var3 = SelectUploadFile.r$String();
      int var10000 = var1;
      if (var3 == null) {
         if (var1 >= this.x) {
            return var2;
         }

         var10000 = this.t[var1];
      }

      return var10000;
   }

   public void p(StringBuilder var1) {
      String var10000 = SelectUploadFile.r$String();
      var1.append(a(310, 21811));
      String var2 = var10000;
      boolean var8 = this.a;
      if (var2 == null) {
         if (this.a) {
            var1.append("?");
         }

         var8 = this.P;
      }

      if (var8) {
         var1.append(">");
      }

      String var3 = "";
      int var4 = 0;

      while (true) {
         if (var4 < this.x) {
            var1.append(var3);
            var1.append(this.t[var4]);
            var3 = ";";
            var4++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         var1.append(this.I);
         break;
      }

      if (var2 == null) {
         if (this.j == null) {
            return;
         }

         var1.append(a(308, 31663));
      }

      Dc2 var7 = Dc2.NONE;

      for (char var6 : this.j) {
         var7 = Sd2.Q(var1, var7, var6);
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.p(var1);
      return var1.toString();
   }

   public char R() {
      return this.I;
   }

   public boolean u() {
      return this.a;
   }

   public boolean c() {
      return this.P;
   }

   @NotNull
   public String a$String() {
      StringBuilder var1 = new StringBuilder();
      var1.append(a(309, 17228));
      this.p(var1);
      var1.append(a(311, -30046));
      var1.append((CharSequence)this.G);
      return var1.toString();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 310) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 255;
               break;
            case 1:
               var10000 = 49;
               break;
            case 2:
               var10000 = 43;
               break;
            case 3:
               var10000 = 100;
               break;
            case 4:
               var10000 = 161;
               break;
            case 5:
               var10000 = 151;
               break;
            case 6:
               var10000 = 23;
               break;
            case 7:
               var10000 = 122;
               break;
            case 8:
               var10000 = 201;
               break;
            case 9:
               var10000 = 80;
               break;
            case 10:
               var10000 = 85;
               break;
            case 11:
               var10000 = 119;
               break;
            case 12:
               var10000 = 162;
               break;
            case 13:
               var10000 = 197;
               break;
            case 14:
               var10000 = 107;
               break;
            case 15:
               var10000 = 190;
               break;
            case 16:
               var10000 = 81;
               break;
            case 17:
               var10000 = 225;
               break;
            case 18:
               var10000 = 233;
               break;
            case 19:
               var10000 = 126;
               break;
            case 20:
               var10000 = 69;
               break;
            case 21:
               var10000 = 114;
               break;
            case 22:
               var10000 = 184;
               break;
            case 23:
               var10000 = 27;
               break;
            case 24:
               var10000 = 110;
               break;
            case 25:
               var10000 = 117;
               break;
            case 26:
               var10000 = 105;
               break;
            case 27:
               var10000 = 18;
               break;
            case 28:
               var10000 = 64;
               break;
            case 29:
               var10000 = 221;
               break;
            case 30:
               var10000 = 223;
               break;
            case 31:
               var10000 = 53;
               break;
            case 32:
               var10000 = 224;
               break;
            case 33:
               var10000 = 2;
               break;
            case 34:
               var10000 = 62;
               break;
            case 35:
               var10000 = 180;
               break;
            case 36:
               var10000 = 195;
               break;
            case 37:
               var10000 = 199;
               break;
            case 38:
               var10000 = 163;
               break;
            case 39:
               var10000 = 89;
               break;
            case 40:
               var10000 = 21;
               break;
            case 41:
               var10000 = 57;
               break;
            case 42:
               var10000 = 236;
               break;
            case 43:
               var10000 = 238;
               break;
            case 44:
               var10000 = 170;
               break;
            case 45:
               var10000 = 47;
               break;
            case 46:
               var10000 = 130;
               break;
            case 47:
               var10000 = 237;
               break;
            case 48:
               var10000 = 59;
               break;
            case 49:
               var10000 = 92;
               break;
            case 50:
               var10000 = 13;
               break;
            case 51:
               var10000 = 179;
               break;
            case 52:
               var10000 = 253;
               break;
            case 53:
               var10000 = 37;
               break;
            case 54:
               var10000 = 133;
               break;
            case 55:
               var10000 = 189;
               break;
            case 56:
               var10000 = 173;
               break;
            case 57:
               var10000 = 32;
               break;
            case 58:
               var10000 = 91;
               break;
            case 59:
               var10000 = 48;
               break;
            case 60:
               var10000 = 245;
               break;
            case 61:
               var10000 = 229;
               break;
            case 62:
               var10000 = 128;
               break;
            case 63:
               var10000 = 120;
               break;
            case 64:
               var10000 = 209;
               break;
            case 65:
               var10000 = 228;
               break;
            case 66:
               var10000 = 61;
               break;
            case 67:
               var10000 = 220;
               break;
            case 68:
               var10000 = 63;
               break;
            case 69:
               var10000 = 207;
               break;
            case 70:
               var10000 = 24;
               break;
            case 71:
               var10000 = 144;
               break;
            case 72:
               var10000 = 234;
               break;
            case 73:
               var10000 = 67;
               break;
            case 74:
               var10000 = 214;
               break;
            case 75:
               var10000 = 138;
               break;
            case 76:
               var10000 = 50;
               break;
            case 77:
               var10000 = 82;
               break;
            case 78:
               var10000 = 158;
               break;
            case 79:
               var10000 = 99;
               break;
            case 80:
               var10000 = 205;
               break;
            case 81:
               var10000 = 213;
               break;
            case 82:
               var10000 = 203;
               break;
            case 83:
               var10000 = 231;
               break;
            case 84:
               var10000 = 208;
               break;
            case 85:
               var10000 = 19;
               break;
            case 86:
               var10000 = 97;
               break;
            case 87:
               var10000 = 215;
               break;
            case 88:
               var10000 = 35;
               break;
            case 89:
               var10000 = 108;
               break;
            case 90:
               var10000 = 87;
               break;
            case 91:
               var10000 = 60;
               break;
            case 92:
               var10000 = 149;
               break;
            case 93:
               var10000 = 230;
               break;
            case 94:
               var10000 = 121;
               break;
            case 95:
               var10000 = 235;
               break;
            case 96:
               var10000 = 102;
               break;
            case 97:
               var10000 = 248;
               break;
            case 98:
               var10000 = 216;
               break;
            case 99:
               var10000 = 33;
               break;
            case 100:
               var10000 = 111;
               break;
            case 101:
               var10000 = 115;
               break;
            case 102:
               var10000 = 137;
               break;
            case 103:
               var10000 = 152;
               break;
            case 104:
               var10000 = 104;
               break;
            case 105:
               var10000 = 150;
               break;
            case 106:
               var10000 = 250;
               break;
            case 107:
               var10000 = 25;
               break;
            case 108:
               var10000 = 112;
               break;
            case 109:
               var10000 = 95;
               break;
            case 110:
               var10000 = 182;
               break;
            case 111:
               var10000 = 56;
               break;
            case 112:
               var10000 = 206;
               break;
            case 113:
               var10000 = 3;
               break;
            case 114:
               var10000 = 125;
               break;
            case 115:
               var10000 = 31;
               break;
            case 116:
               var10000 = 10;
               break;
            case 117:
               var10000 = 39;
               break;
            case 118:
               var10000 = 93;
               break;
            case 119:
               var10000 = 42;
               break;
            case 120:
               var10000 = 51;
               break;
            case 121:
               var10000 = 79;
               break;
            case 122:
               var10000 = 11;
               break;
            case 123:
               var10000 = 36;
               break;
            case 124:
               var10000 = 148;
               break;
            case 125:
               var10000 = 45;
               break;
            case 126:
               var10000 = 143;
               break;
            case 127:
               var10000 = 4;
               break;
            case 128:
               var10000 = 249;
               break;
            case 129:
               var10000 = 140;
               break;
            case 130:
               var10000 = 185;
               break;
            case 131:
               var10000 = 165;
               break;
            case 132:
               var10000 = 65;
               break;
            case 133:
               var10000 = 135;
               break;
            case 134:
               var10000 = 193;
               break;
            case 135:
               var10000 = 146;
               break;
            case 136:
               var10000 = 40;
               break;
            case 137:
               var10000 = 83;
               break;
            case 138:
               var10000 = 28;
               break;
            case 139:
               var10000 = 29;
               break;
            case 140:
               var10000 = 217;
               break;
            case 141:
               var10000 = 204;
               break;
            case 142:
               var10000 = 188;
               break;
            case 143:
               var10000 = 181;
               break;
            case 144:
               var10000 = 5;
               break;
            case 145:
               var10000 = 251;
               break;
            case 146:
               var10000 = 66;
               break;
            case 147:
               var10000 = 136;
               break;
            case 148:
               var10000 = 6;
               break;
            case 149:
               var10000 = 86;
               break;
            case 150:
               var10000 = 139;
               break;
            case 151:
               var10000 = 101;
               break;
            case 152:
               var10000 = 222;
               break;
            case 153:
               var10000 = 94;
               break;
            case 154:
               var10000 = 90;
               break;
            case 155:
               var10000 = 192;
               break;
            case 156:
               var10000 = 142;
               break;
            case 157:
               var10000 = 118;
               break;
            case 158:
               var10000 = 52;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 132;
               break;
            case 161:
               var10000 = 46;
               break;
            case 162:
               var10000 = 16;
               break;
            case 163:
               var10000 = 15;
               break;
            case 164:
               var10000 = 160;
               break;
            case 165:
               var10000 = 12;
               break;
            case 166:
               var10000 = 26;
               break;
            case 167:
               var10000 = 241;
               break;
            case 168:
               var10000 = 8;
               break;
            case 169:
               var10000 = 1;
               break;
            case 170:
               var10000 = 175;
               break;
            case 171:
               var10000 = 9;
               break;
            case 172:
               var10000 = 109;
               break;
            case 173:
               var10000 = 153;
               break;
            case 174:
               var10000 = 72;
               break;
            case 175:
               var10000 = 187;
               break;
            case 176:
               var10000 = 76;
               break;
            case 177:
               var10000 = 183;
               break;
            case 178:
               var10000 = 41;
               break;
            case 179:
               var10000 = 194;
               break;
            case 180:
               var10000 = 134;
               break;
            case 181:
               var10000 = 131;
               break;
            case 182:
               var10000 = 242;
               break;
            case 183:
               var10000 = 212;
               break;
            case 184:
               var10000 = 178;
               break;
            case 185:
               var10000 = 22;
               break;
            case 186:
               var10000 = 20;
               break;
            case 187:
               var10000 = 247;
               break;
            case 188:
               var10000 = 159;
               break;
            case 189:
               var10000 = 58;
               break;
            case 190:
               var10000 = 177;
               break;
            case 191:
               var10000 = 169;
               break;
            case 192:
               var10000 = 164;
               break;
            case 193:
               var10000 = 106;
               break;
            case 194:
               var10000 = 240;
               break;
            case 195:
               var10000 = 127;
               break;
            case 196:
               var10000 = 75;
               break;
            case 197:
               var10000 = 227;
               break;
            case 198:
               var10000 = 176;
               break;
            case 199:
               var10000 = 124;
               break;
            case 200:
               var10000 = 7;
               break;
            case 201:
               var10000 = 198;
               break;
            case 202:
               var10000 = 232;
               break;
            case 203:
               var10000 = 71;
               break;
            case 204:
               var10000 = 171;
               break;
            case 205:
               var10000 = 219;
               break;
            case 206:
               var10000 = 78;
               break;
            case 207:
               var10000 = 77;
               break;
            case 208:
               var10000 = 239;
               break;
            case 209:
               var10000 = 166;
               break;
            case 210:
               var10000 = 200;
               break;
            case 211:
               var10000 = 0;
               break;
            case 212:
               var10000 = 191;
               break;
            case 213:
               var10000 = 156;
               break;
            case 214:
               var10000 = 30;
               break;
            case 215:
               var10000 = 244;
               break;
            case 216:
               var10000 = 174;
               break;
            case 217:
               var10000 = 17;
               break;
            case 218:
               var10000 = 246;
               break;
            case 219:
               var10000 = 211;
               break;
            case 220:
               var10000 = 116;
               break;
            case 221:
               var10000 = 186;
               break;
            case 222:
               var10000 = 44;
               break;
            case 223:
               var10000 = 70;
               break;
            case 224:
               var10000 = 34;
               break;
            case 225:
               var10000 = 113;
               break;
            case 226:
               var10000 = 243;
               break;
            case 227:
               var10000 = 14;
               break;
            case 228:
               var10000 = 129;
               break;
            case 229:
               var10000 = 84;
               break;
            case 230:
               var10000 = 96;
               break;
            case 231:
               var10000 = 88;
               break;
            case 232:
               var10000 = 254;
               break;
            case 233:
               var10000 = 68;
               break;
            case 234:
               var10000 = 55;
               break;
            case 235:
               var10000 = 123;
               break;
            case 236:
               var10000 = 226;
               break;
            case 237:
               var10000 = 252;
               break;
            case 238:
               var10000 = 73;
               break;
            case 239:
               var10000 = 98;
               break;
            case 240:
               var10000 = 147;
               break;
            case 241:
               var10000 = 54;
               break;
            case 242:
               var10000 = 154;
               break;
            case 243:
               var10000 = 145;
               break;
            case 244:
               var10000 = 141;
               break;
            case 245:
               var10000 = 155;
               break;
            case 246:
               var10000 = 196;
               break;
            case 247:
               var10000 = 168;
               break;
            case 248:
               var10000 = 167;
               break;
            case 249:
               var10000 = 202;
               break;
            case 250:
               var10000 = 103;
               break;
            case 251:
               var10000 = 157;
               break;
            case 252:
               var10000 = 172;
               break;
            case 253:
               var10000 = 218;
               break;
            case 254:
               var10000 = 74;
               break;
            default:
               var10000 = 210;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10623;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "\u008f\u0088V\u008d\u000bQBøóO\u001d©\u0094\u007f5s";
      int var12 = "\u008f\u0088V\u008d\u000bQBøóO\u001d©\u0094\u007f5s".length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 39;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 110;
                        break;
                     case 1:
                        var65 = 89;
                        break;
                     case 2:
                        var65 = 7;
                        break;
                     case 3:
                        var65 = 22;
                        break;
                     case 4:
                        var65 = 56;
                        break;
                     case 5:
                        var65 = 21;
                        break;
                     default:
                        var65 = 61;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     b = var13;
                     c = new String[4];
                     long var0 = 3769862117433599776L;
                     long[] var6 = new long[16];
                     int var3 = 0;
                     String var4 = "ÎCn\u0084§\u0091gÿËÔ$Ø`¬` \u0006öÎ¿³ËY\u001fÀñ\fx\u0090\u0004ü\u0014iý\u0092À\u0086\u0086Lk/Ñãf¢Ú\u001aUcR·¼¸\u0017°\u0003\u008c\u008b\u0095¿EÓ\u0088\u0006¿\u0005\u000eË2\u00915ähÙ`\u0003éæÑÃ\u0017p6\\¢¼Ý\u001b\u0099 L\u0082\u0086Ø·gÄ=]{Ùv2\u0014\u009e9\u008f\u0002DÝì¶";
                     int var5 = "ÎCn\u0084§\u0091gÿËÔ$Ø`¬` \u0006öÎ¿³ËY\u001fÀñ\fx\u0090\u0004ü\u0014iý\u0092À\u0086\u0086Lk/Ñãf¢Ú\u001aUcR·¼¸\u0017°\u0003\u008c\u008b\u0095¿EÓ\u0088\u0006¿\u0005\u000eË2\u00915ähÙ`\u0003éæÑÃ\u0017p6\\¢¼Ý\u001b\u0099 L\u0082\u0086Ø·gÄ=]{Ùv2\u0014\u009e9\u008f\u0002DÝì¶"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[16];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0095j¶N!À\rÑ\u0003äØ«)0)ü";
                                 var5 = "\u0095j¶N!À\rÑ\u0003äØ«)0)ü".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u008d\u0093^·¾E«Äi¸\u008c\bkDÄäv]hÀ";
                  var12 = "\u008d\u0093^·¾E«Äi¸\u008c\bkDÄäv]hÀ".length();
                  var9 = 11;
                  var17 = -1;
            }

            var10000 = 42;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





