package com.finalshell.core;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class C_y_2_2 extends C_L {
   public static Logger MG;
   public J_5 M2;
   public Charset MR;
   public EnumSet Mv;
   public final Set MZ;
   public int M3;
   public int Mz;
   @C_9
   public U_5 MK;
   @C_9
   public Y_5 Mf;
   public static String[] cb;
   public static String[] db;
   public static long eb;

   public C_y_2_2(J_5 var1, @C_9 String var2, @C_9 C_L var3) {
   super(var3);
      Charset var5;
      label14: {
         this.Mv = EnumSet.noneOf(com.finalshell.ui.model.Rd2.class);
         String[] var10000 = RG_2.C();
         this.MZ = new HashSet();
         this.M3 = -1;
         this.Mz = -1;
         this.M2 = var1;
         String[] var4 = var10000;
         String var10001 = var2;
         if (var4 != null) {
            if (var2 == null) {
               var5 = Charset.defaultCharset();
               break label14;
            }

            var10001 = var2;
         }

         var5 = Charset.forName(var10001);
      }

      this.MR = var5;
      super.L();
   }

   public void n(int var1) {
      this.M3 = var1;
   }

   public void P(int var1) {
      this.Mz = var1;
   }

   public Set V() {
      return this.MZ;
   }

   public void T(J_5 var1) {
      this.M2 = var1;
   }

   public J_5 x() {
      return this.M2;
   }

   @Deprecated
   public void I(@C_9 String var1) {
      Charset var3;
      label14: {
         String[] var2 = RG_2.C();
         String var10001 = var1;
         if (var2 != null) {
            if (var1 == null) {
               var3 = Charset.defaultCharset();
               break label14;
            }

            var10001 = var1;
         }

         var3 = Charset.forName(var10001);
      }

      this.v(var3);
   }

   public void v(Charset var1) {
      this.MR = var1;
   }

   public void H(@C_9 U_5 var1) {
      this.MK = var1;
   }

   public void z(@C_9 Y_5 var1) {
      this.Mf = var1;
   }

   public EnumSet e() {
      return this.Mv;
   }

   public C_y_2_2 G(EnumSet var1) {
      this.Mv = var1;
      return this;
   }

   @C_9
   @Override
   public Hd2 x(String param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: getstatic com/finalshell/core/C_y_2_2.MG Ljava/util/logging/Logger;
      // 006: aconst_null
      // 007: sipush -26817
      // 00a: sipush -4411
      // 00d: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 010: aload 1
      // 011: invokevirtual java/util/logging/Logger.entering (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
      // 014: aload 1
      // 015: invokestatic com/finalshell/core/F0_2.F (Ljava/lang/String;)Ljava/lang/String;
      // 018: astore 3
      // 019: astore 2
      // 01a: getstatic com/finalshell/core/C_y_2_2.MG Ljava/util/logging/Logger;
      // 01d: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 020: sipush -26820
      // 023: sipush 717
      // 026: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 029: aload 3
      // 02a: invokevirtual java/util/logging/Logger.log (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
      // 02d: aload 3
      // 02e: sipush -26821
      // 031: sipush -15576
      // 034: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 037: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 03a: aload 2
      // 03b: ifnull 056
      // 03e: ifeq 04e
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 047: athrow
      // 048: aconst_null
      // 049: areturn
      // 04a: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 04d: athrow
      // 04e: aload 3
      // 04f: getstatic com/finalshell/core/C_y_2_2.eb J
      // 052: l2i
      // 053: invokevirtual java/lang/String.indexOf (I)I
      // 056: istore 5
      // 058: iload 5
      // 05a: bipush -1
      // 05b: if_icmpne 066
      // 05e: aload 3
      // 05f: goto 06d
      // 062: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 065: athrow
      // 066: aload 3
      // 067: bipush 0
      // 068: iload 5
      // 06a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 06d: astore 4
      // 06f: aload 0
      // 070: getfield com/finalshell/core/C_y_2_2.MZ Ljava/util/Set;
      // 073: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 078: astore 5
      // 07a: aload 5
      // 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 081: ifeq 0d9
      // 084: aload 5
      // 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08b: checkcast com/finalshell/core/H3_2
      // 08e: astore 6
      // 090: aload 6
      // 092: aload 4
      // 094: invokevirtual com/finalshell/core/H3_2.u (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 097: astore 7
      // 099: aload 7
      // 09b: ifnull 0d5
      // 09e: aload 3
      // 09f: aload 4
      // 0a1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a4: ifne 0cc
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ad: athrow
      // 0ae: aload 6
      // 0b0: aload 3
      // 0b1: invokevirtual com/finalshell/core/H3_2.u (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 0b4: astore 7
      // 0b6: aload 7
      // 0b8: aload 2
      // 0b9: ifnull 0d4
      // 0bc: ifnonnull 0cc
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c5: athrow
      // 0c6: aconst_null
      // 0c7: areturn
      // 0c8: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: aload 7
      // 0cf: invokevirtual com/finalshell/core/C_y_2_2.l (Lcom/finalshell/core/Hd2;)V
      // 0d2: aload 7
      // 0d4: areturn
      // 0d5: aload 2
      // 0d6: ifnonnull 07a
      // 0d9: aload 0
      // 0da: aload 3
      // 0db: invokevirtual com/finalshell/core/C_y_2_2.l (Ljava/lang/String;)Lcom/finalshell/core/RB;
      // 0de: astore 5
      // 0e0: aload 5
      // 0e2: ifnonnull 0e7
      // 0e5: aconst_null
      // 0e6: areturn
      // 0e7: new com/finalshell/core/H3_2
      // 0ea: dup
      // 0eb: aload 5
      // 0ed: aload 0
      // 0ee: invokespecial com/finalshell/core/H3_2.<init> (Lcom/finalshell/core/RB;Lcom/finalshell/core/C_L;)V
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/core/C_y_2_2.Mv Ljava/util/EnumSet;
      // 0f5: invokevirtual com/finalshell/core/H3_2.F (Ljava/util/EnumSet;)Lcom/finalshell/core/H3_2;
      // 0f8: astore 6
      // 0fa: aload 6
      // 0fc: aload 0
      // 0fd: getfield com/finalshell/core/C_y_2_2.Mz I
      // 100: invokevirtual com/finalshell/core/H3_2.s (I)V
      // 103: aload 6
      // 105: aload 0
      // 106: getfield com/finalshell/core/C_y_2_2.MK Lcom/finalshell/core/U_5;
      // 109: invokevirtual com/finalshell/core/H3_2.E (Lcom/finalshell/core/U_5;)V
      // 10c: aload 6
      // 10e: aload 0
      // 10f: getfield com/finalshell/core/C_y_2_2.Mf Lcom/finalshell/core/Y_5;
      // 112: invokevirtual com/finalshell/core/H3_2.Y (Lcom/finalshell/core/Y_5;)V
      // 115: aload 0
      // 116: getfield com/finalshell/core/C_y_2_2.MZ Ljava/util/Set;
      // 119: aload 6
      // 11b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 120: pop
      // 121: aload 6
      // 123: aload 3
      // 124: invokevirtual com/finalshell/core/H3_2.u (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 127: astore 7
      // 129: aload 7
      // 12b: aload 2
      // 12c: ifnull 189
      // 12f: ifnonnull 181
      // 132: goto 139
      // 135: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 138: athrow
      // 139: aload 3
      // 13a: aload 4
      // 13c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13f: ifeq 17f
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 148: athrow
      // 149: new com/finalshell/core/B2_5
      // 14c: dup
      // 14d: new java/lang/StringBuilder
      // 150: dup
      // 151: invokespecial java/lang/StringBuilder.<init> ()V
      // 154: sipush -26823
      // 157: sipush -32633
      // 15a: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 160: aload 3
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: sipush -26824
      // 167: sipush 12573
      // 16a: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: aconst_null
      // 174: checkcast com/finalshell/ui/model/I
      // 177: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 17a: athrow
      // 17b: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17e: athrow
      // 17f: aconst_null
      // 180: areturn
      // 181: aload 0
      // 182: aload 7
      // 184: invokevirtual com/finalshell/core/C_y_2_2.l (Lcom/finalshell/core/Hd2;)V
      // 187: aload 7
      // 189: areturn
      // 18a: astore 5
      // 18c: new java/lang/ClassNotFoundException
      // 18f: dup
      // 190: new java/lang/StringBuilder
      // 193: dup
      // 194: invokespecial java/lang/StringBuilder.<init> ()V
      // 197: sipush -26818
      // 19a: sipush -23400
      // 19d: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: aload 3
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: ldc "'"
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1af: aload 5
      // 1b1: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1b4: athrow
      // 1b5: astore 5
      // 1b7: new java/lang/ClassNotFoundException
      // 1ba: dup
      // 1bb: new java/lang/StringBuilder
      // 1be: dup
      // 1bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c2: sipush -26819
      // 1c5: sipush -31325
      // 1c8: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 1cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ce: aload 3
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: ldc "'"
      // 1d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1da: aload 5
      // 1dc: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1df: athrow
   }

   @C_9
   public RB l(String param1) throws IOException, B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/C_y_2_2.M2 Lcom/finalshell/core/J_5;
      // 07: aload 1
      // 08: invokestatic com/finalshell/core/Cr2_2.R (Ljava/lang/String;)Ljava/lang/String;
      // 0b: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 0e: astore 3
      // 0f: getstatic com/finalshell/core/C_y_2_2.MG Ljava/util/logging/Logger;
      // 12: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 15: sipush -26822
      // 18: sipush 11131
      // 1b: invokestatic com/finalshell/core/C_y_2_2.b (II)Ljava/lang/String;
      // 1e: aload 3
      // 1f: invokevirtual java/util/logging/Logger.log (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
      // 22: astore 2
      // 23: aload 3
      // 24: aload 2
      // 25: ifnull 39
      // 28: ifnonnull 38
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: invokestatic com/finalshell/core/C_y_2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 37: athrow
      // 38: aload 3
      // 39: invokeinterface com/finalshell/core/N_6.o$InputStream ()Ljava/io/InputStream; 1
      // 3e: astore 4
      // 40: new com/finalshell/core/Hc2_2
      // 43: dup
      // 44: aload 3
      // 45: invokeinterface com/finalshell/core/N_6.o$String ()Ljava/lang/String; 1
      // 4a: new java/io/InputStreamReader
      // 4d: dup
      // 4e: aload 4
      // 50: aload 0
      // 51: getfield com/finalshell/core/C_y_2_2.MR Ljava/nio/charset/Charset;
      // 54: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 57: invokespecial com/finalshell/core/Hc2_2.<init> (Ljava/lang/String;Ljava/io/Reader;)V
      // 5a: astore 5
      // 5c: new com/finalshell/core/HG
      // 5f: dup
      // 60: aload 5
      // 62: invokespecial com/finalshell/core/HG.<init> (Lcom/finalshell/core/Hc2_2;)V
      // 65: astore 6
      // 67: aload 6
      // 69: aload 0
      // 6a: getfield com/finalshell/core/C_y_2_2.M3 I
      // 6d: invokevirtual com/finalshell/core/HG.Q (I)V
      // 70: aload 6
      // 72: aload 0
      // 73: getfield com/finalshell/core/C_y_2_2.Mf Lcom/finalshell/core/Y_5;
      // 76: invokevirtual com/finalshell/core/HG.S (Lcom/finalshell/core/Y_5;)V
      // 79: aload 6
      // 7b: invokevirtual com/finalshell/core/HG.X$RB ()Lcom/finalshell/core/RB;
      // 7e: astore 7
      // 80: aload 4
      // 82: invokevirtual java/io/InputStream.close ()V
      // 85: goto 8a
      // 88: astore 8
      // 8a: aload 7
      // 8c: areturn
      // 8d: astore 9
      // 8f: aload 4
      // 91: invokevirtual java/io/InputStream.close ()V
      // 94: goto 99
      // 97: astore 10
      // 99: aload 9
      // 9b: athrow
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -26823) & 65535;
      if (db[var2] == null) {
         char[] var3 = cb[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 29;
               break;
            case 1:
               var10000 = 126;
               break;
            case 2:
               var10000 = 237;
               break;
            case 3:
               var10000 = 25;
               break;
            case 4:
               var10000 = 188;
               break;
            case 5:
               var10000 = 162;
               break;
            case 6:
               var10000 = 206;
               break;
            case 7:
               var10000 = 215;
               break;
            case 8:
               var10000 = 74;
               break;
            case 9:
               var10000 = 172;
               break;
            case 10:
               var10000 = 103;
               break;
            case 11:
               var10000 = 124;
               break;
            case 12:
               var10000 = 128;
               break;
            case 13:
               var10000 = 160;
               break;
            case 14:
               var10000 = 48;
               break;
            case 15:
               var10000 = 60;
               break;
            case 16:
               var10000 = 195;
               break;
            case 17:
               var10000 = 1;
               break;
            case 18:
               var10000 = 152;
               break;
            case 19:
               var10000 = 96;
               break;
            case 20:
               var10000 = 203;
               break;
            case 21:
               var10000 = 49;
               break;
            case 22:
               var10000 = 75;
               break;
            case 23:
               var10000 = 101;
               break;
            case 24:
               var10000 = 13;
               break;
            case 25:
               var10000 = 86;
               break;
            case 26:
               var10000 = 14;
               break;
            case 27:
               var10000 = 97;
               break;
            case 28:
               var10000 = 44;
               break;
            case 29:
               var10000 = 227;
               break;
            case 30:
               var10000 = 107;
               break;
            case 31:
               var10000 = 242;
               break;
            case 32:
               var10000 = 57;
               break;
            case 33:
               var10000 = 139;
               break;
            case 34:
               var10000 = 56;
               break;
            case 35:
               var10000 = 222;
               break;
            case 36:
               var10000 = 52;
               break;
            case 37:
               var10000 = 92;
               break;
            case 38:
               var10000 = 213;
               break;
            case 39:
               var10000 = 132;
               break;
            case 40:
               var10000 = 247;
               break;
            case 41:
               var10000 = 253;
               break;
            case 42:
               var10000 = 151;
               break;
            case 43:
               var10000 = 148;
               break;
            case 44:
               var10000 = 210;
               break;
            case 45:
               var10000 = 198;
               break;
            case 46:
               var10000 = 226;
               break;
            case 47:
               var10000 = 113;
               break;
            case 48:
               var10000 = 140;
               break;
            case 49:
               var10000 = 83;
               break;
            case 50:
               var10000 = 149;
               break;
            case 51:
               var10000 = 231;
               break;
            case 52:
               var10000 = 3;
               break;
            case 53:
               var10000 = 39;
               break;
            case 54:
               var10000 = 55;
               break;
            case 55:
               var10000 = 89;
               break;
            case 56:
               var10000 = 201;
               break;
            case 57:
               var10000 = 20;
               break;
            case 58:
               var10000 = 120;
               break;
            case 59:
               var10000 = 147;
               break;
            case 60:
               var10000 = 249;
               break;
            case 61:
               var10000 = 40;
               break;
            case 62:
               var10000 = 189;
               break;
            case 63:
               var10000 = 21;
               break;
            case 64:
               var10000 = 61;
               break;
            case 65:
               var10000 = 68;
               break;
            case 66:
               var10000 = 36;
               break;
            case 67:
               var10000 = 123;
               break;
            case 68:
               var10000 = 119;
               break;
            case 69:
               var10000 = 143;
               break;
            case 70:
               var10000 = 181;
               break;
            case 71:
               var10000 = 2;
               break;
            case 72:
               var10000 = 207;
               break;
            case 73:
               var10000 = 229;
               break;
            case 74:
               var10000 = 37;
               break;
            case 75:
               var10000 = 72;
               break;
            case 76:
               var10000 = 125;
               break;
            case 77:
               var10000 = 88;
               break;
            case 78:
               var10000 = 81;
               break;
            case 79:
               var10000 = 5;
               break;
            case 80:
               var10000 = 109;
               break;
            case 81:
               var10000 = 15;
               break;
            case 82:
               var10000 = 105;
               break;
            case 83:
               var10000 = 145;
               break;
            case 84:
               var10000 = 167;
               break;
            case 85:
               var10000 = 108;
               break;
            case 86:
               var10000 = 93;
               break;
            case 87:
               var10000 = 186;
               break;
            case 88:
               var10000 = 173;
               break;
            case 89:
               var10000 = 11;
               break;
            case 90:
               var10000 = 219;
               break;
            case 91:
               var10000 = 110;
               break;
            case 92:
               var10000 = 252;
               break;
            case 93:
               var10000 = 64;
               break;
            case 94:
               var10000 = 112;
               break;
            case 95:
               var10000 = 158;
               break;
            case 96:
               var10000 = 220;
               break;
            case 97:
               var10000 = 76;
               break;
            case 98:
               var10000 = 98;
               break;
            case 99:
               var10000 = 204;
               break;
            case 100:
               var10000 = 115;
               break;
            case 101:
               var10000 = 73;
               break;
            case 102:
               var10000 = 28;
               break;
            case 103:
               var10000 = 205;
               break;
            case 104:
               var10000 = 133;
               break;
            case 105:
               var10000 = 84;
               break;
            case 106:
               var10000 = 100;
               break;
            case 107:
               var10000 = 23;
               break;
            case 108:
               var10000 = 4;
               break;
            case 109:
               var10000 = 191;
               break;
            case 110:
               var10000 = 116;
               break;
            case 111:
               var10000 = 31;
               break;
            case 112:
               var10000 = 216;
               break;
            case 113:
               var10000 = 183;
               break;
            case 114:
               var10000 = 185;
               break;
            case 115:
               var10000 = 85;
               break;
            case 116:
               var10000 = 146;
               break;
            case 117:
               var10000 = 156;
               break;
            case 118:
               var10000 = 180;
               break;
            case 119:
               var10000 = 209;
               break;
            case 120:
               var10000 = 179;
               break;
            case 121:
               var10000 = 190;
               break;
            case 122:
               var10000 = 65;
               break;
            case 123:
               var10000 = 12;
               break;
            case 124:
               var10000 = 137;
               break;
            case 125:
               var10000 = 175;
               break;
            case 126:
               var10000 = 163;
               break;
            case 127:
               var10000 = 178;
               break;
            case 128:
               var10000 = 217;
               break;
            case 129:
               var10000 = 223;
               break;
            case 130:
               var10000 = 164;
               break;
            case 131:
               var10000 = 221;
               break;
            case 132:
               var10000 = 196;
               break;
            case 133:
               var10000 = 0;
               break;
            case 134:
               var10000 = 142;
               break;
            case 135:
               var10000 = 153;
               break;
            case 136:
               var10000 = 87;
               break;
            case 137:
               var10000 = 30;
               break;
            case 138:
               var10000 = 130;
               break;
            case 139:
               var10000 = 90;
               break;
            case 140:
               var10000 = 66;
               break;
            case 141:
               var10000 = 34;
               break;
            case 142:
               var10000 = 95;
               break;
            case 143:
               var10000 = 9;
               break;
            case 144:
               var10000 = 102;
               break;
            case 145:
               var10000 = 230;
               break;
            case 146:
               var10000 = 238;
               break;
            case 147:
               var10000 = 182;
               break;
            case 148:
               var10000 = 135;
               break;
            case 149:
               var10000 = 184;
               break;
            case 150:
               var10000 = 24;
               break;
            case 151:
               var10000 = 118;
               break;
            case 152:
               var10000 = 129;
               break;
            case 153:
               var10000 = 53;
               break;
            case 154:
               var10000 = 224;
               break;
            case 155:
               var10000 = 7;
               break;
            case 156:
               var10000 = 254;
               break;
            case 157:
               var10000 = 51;
               break;
            case 158:
               var10000 = 154;
               break;
            case 159:
               var10000 = 244;
               break;
            case 160:
               var10000 = 187;
               break;
            case 161:
               var10000 = 18;
               break;
            case 162:
               var10000 = 141;
               break;
            case 163:
               var10000 = 232;
               break;
            case 164:
               var10000 = 77;
               break;
            case 165:
               var10000 = 50;
               break;
            case 166:
               var10000 = 251;
               break;
            case 167:
               var10000 = 168;
               break;
            case 168:
               var10000 = 174;
               break;
            case 169:
               var10000 = 165;
               break;
            case 170:
               var10000 = 46;
               break;
            case 171:
               var10000 = 241;
               break;
            case 172:
               var10000 = 236;
               break;
            case 173:
               var10000 = 212;
               break;
            case 174:
               var10000 = 6;
               break;
            case 175:
               var10000 = 63;
               break;
            case 176:
               var10000 = 228;
               break;
            case 177:
               var10000 = 248;
               break;
            case 178:
               var10000 = 234;
               break;
            case 179:
               var10000 = 47;
               break;
            case 180:
               var10000 = 10;
               break;
            case 181:
               var10000 = 243;
               break;
            case 182:
               var10000 = 27;
               break;
            case 183:
               var10000 = 138;
               break;
            case 184:
               var10000 = 70;
               break;
            case 185:
               var10000 = 131;
               break;
            case 186:
               var10000 = 16;
               break;
            case 187:
               var10000 = 94;
               break;
            case 188:
               var10000 = 155;
               break;
            case 189:
               var10000 = 200;
               break;
            case 190:
               var10000 = 58;
               break;
            case 191:
               var10000 = 169;
               break;
            case 192:
               var10000 = 80;
               break;
            case 193:
               var10000 = 54;
               break;
            case 194:
               var10000 = 136;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 82;
               break;
            case 197:
               var10000 = 117;
               break;
            case 198:
               var10000 = 194;
               break;
            case 199:
               var10000 = 218;
               break;
            case 200:
               var10000 = 134;
               break;
            case 201:
               var10000 = 122;
               break;
            case 202:
               var10000 = 214;
               break;
            case 203:
               var10000 = 202;
               break;
            case 204:
               var10000 = 8;
               break;
            case 205:
               var10000 = 235;
               break;
            case 206:
               var10000 = 99;
               break;
            case 207:
               var10000 = 38;
               break;
            case 208:
               var10000 = 42;
               break;
            case 209:
               var10000 = 104;
               break;
            case 210:
               var10000 = 71;
               break;
            case 211:
               var10000 = 225;
               break;
            case 212:
               var10000 = 245;
               break;
            case 213:
               var10000 = 91;
               break;
            case 214:
               var10000 = 157;
               break;
            case 215:
               var10000 = 171;
               break;
            case 216:
               var10000 = 246;
               break;
            case 217:
               var10000 = 19;
               break;
            case 218:
               var10000 = 78;
               break;
            case 219:
               var10000 = 197;
               break;
            case 220:
               var10000 = 250;
               break;
            case 221:
               var10000 = 240;
               break;
            case 222:
               var10000 = 233;
               break;
            case 223:
               var10000 = 159;
               break;
            case 224:
               var10000 = 32;
               break;
            case 225:
               var10000 = 22;
               break;
            case 226:
               var10000 = 26;
               break;
            case 227:
               var10000 = 170;
               break;
            case 228:
               var10000 = 193;
               break;
            case 229:
               var10000 = 255;
               break;
            case 230:
               var10000 = 17;
               break;
            case 231:
               var10000 = 176;
               break;
            case 232:
               var10000 = 121;
               break;
            case 233:
               var10000 = 161;
               break;
            case 234:
               var10000 = 35;
               break;
            case 235:
               var10000 = 79;
               break;
            case 236:
               var10000 = 211;
               break;
            case 237:
               var10000 = 150;
               break;
            case 238:
               var10000 = 199;
               break;
            case 239:
               var10000 = 67;
               break;
            case 240:
               var10000 = 59;
               break;
            case 241:
               var10000 = 111;
               break;
            case 242:
               var10000 = 177;
               break;
            case 243:
               var10000 = 144;
               break;
            case 244:
               var10000 = 43;
               break;
            case 245:
               var10000 = 127;
               break;
            case 246:
               var10000 = 114;
               break;
            case 247:
               var10000 = 69;
               break;
            case 248:
               var10000 = 106;
               break;
            case 249:
               var10000 = 192;
               break;
            case 250:
               var10000 = 62;
               break;
            case 251:
               var10000 = 41;
               break;
            case 252:
               var10000 = 239;
               break;
            case 253:
               var10000 = 166;
               break;
            case 254:
               var10000 = 45;
               break;
            default:
               var10000 = 208;
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

         db[var2] = new String(var3).intern();
      }

      return db[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "Jl\u0090ôPû¾S\u0018`¢EõsµRM\u001c-B\"p\u0084h\u0016u\b\u000eIè\\+\u0091y·#U\u0093uç9_Öò\u000f\u0014\u001avE}ùU\u0004¤|ÅUCiÿ\u001b\u0003F×\u0005\u0097\u0010<¥ú\u0012Õ\u008aM*úk\u0093xò6½Ýxs\u00847¥\u0004\u001aL\b>´y\u0092\u009dh°Ùÿ\"!Ç¸\u0086¬ÎT\fÍrà\u0006óö\r~W>ó\u0012Z¯\u00186aÿmá";
      int var6 = "Jl\u0090ôPû¾S\u0018`¢EõsµRM\u001c-B\"p\u0084h\u0016u\b\u000eIè\\+\u0091y·#U\u0093uç9_Öò\u000f\u0014\u001avE}ùU\u0004¤|ÅUCiÿ\u001b\u0003F×\u0005\u0097\u0010<¥ú\u0012Õ\u008aM*úk\u0093xò6½Ýxs\u00847¥\u0004\u001aL\b>´y\u0092\u009dh°Ùÿ\"!Ç¸\u0086¬ÎT\fÍrà\u0006óö\r~W>ó\u0012Z¯\u00186aÿmá"
         .length();
      char var3 = 18;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 3;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 92;
                        break;
                     case 1:
                        var50 = 79;
                        break;
                     case 2:
                        var50 = 119;
                        break;
                     case 3:
                        var50 = 1;
                        break;
                     case 4:
                        var50 = 102;
                        break;
                     case 5:
                        var50 = 52;
                        break;
                     default:
                        var50 = 62;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     cb = var7;
                     db = new String[8];
                     long var0 = 4577641707573346436L;
                     long var27 = 1830607309683556512L ^ var0;
                     byte var18 = -1;
                     eb = var27;
                     MG = Logger.getLogger(C_y_2_2.class.getName());
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "`WLZ\u0093\u008côyü\u0095\u001aÃÕÔ\u0014?\u009dN\u0092Ñ\u009dÈ±Ü®\u001c°#\u0013¾¬\u008b}3ü\u0092²";
                  var6 = "`WLZ\u0093\u008côyü\u0095\u001aÃÕÔ\u0014?\u009dN\u0092Ñ\u009dÈ±Ü®\u001c°#\u0013¾¬\u008b}3ü\u0092²".length();
                  var3 = '\n';
                  var10 = -1;
            }

            var10000 = 27;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





