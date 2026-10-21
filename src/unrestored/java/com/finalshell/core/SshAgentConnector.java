package com.finalshell.core;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;

public class SshAgentConnector implements Db2 {
   public Rc2 P;
   public Path m;
   public static String[] a;
   public static String[] b;
   public static long c;

   public SshAgentConnector() throws C_Y {
      this(q(), t());
   }

   public SshAgentConnector(Path var1) throws C_Y {
      this(q(), var1);
   }

   public SshAgentConnector(Rc2 var1) throws C_Y {
      this(var1, t());
   }

   public SshAgentConnector(Rc2 var1, Path var2) {
      this.P = var1;
      this.m = var2;
   }

   @Override
   public String B() {
      return a(-14032, -8601);
   }

   @Override
   public boolean x() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial com/finalshell/core/Q_2.Z ()Ljava/nio/channels/SocketChannel;
      // 08: astore 2
      // 09: bipush 1
      // 0a: istore 3
      // 0b: aload 2
      // 0c: iload 1
      // 0d: ifne 1b
      // 10: ifnull 1e
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 2
      // 1b: invokevirtual java/nio/channels/SocketChannel.close ()V
      // 1e: iload 3
      // 1f: ireturn
      // 20: astore 3
      // 21: aload 2
      // 22: iload 1
      // 23: ifne 31
      // 26: ifnull 3f
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 2
      // 31: invokevirtual java/nio/channels/SocketChannel.close ()V
      // 34: goto 3f
      // 37: astore 4
      // 39: aload 3
      // 3a: aload 4
      // 3c: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 3f: aload 3
      // 40: athrow
      // 41: astore 2
      // 42: bipush 0
      // 43: ireturn
   }

   public SocketChannel Z() throws IOException {
      return this.P.o(this.m);
   }

   @Override
   public void Z(UJ param1) throws C_Y {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: invokespecial com/finalshell/core/Q_2.Z ()Ljava/nio/channels/SocketChannel;
      // 08: astore 3
      // 09: aload 3
      // 0a: aload 1
      // 0b: bipush 0
      // 0c: aload 1
      // 0d: invokevirtual com/finalshell/core/UJ.P ()I
      // 10: invokestatic com/finalshell/core/Q_2.y (Ljava/nio/channels/SocketChannel;Lcom/finalshell/core/UJ;II)I
      // 13: pop
      // 14: aload 1
      // 15: invokevirtual com/finalshell/core/UJ.a ()V
      // 18: aload 3
      // 19: aload 1
      // 1a: bipush 0
      // 1b: bipush 4
      // 1c: invokestatic com/finalshell/core/Q_2.S (Ljava/nio/channels/SocketChannel;Lcom/finalshell/core/UJ;II)I
      // 1f: istore 4
      // 21: aload 1
      // 22: invokevirtual com/finalshell/core/UJ.d ()I
      // 25: istore 4
      // 27: iload 4
      // 29: iload 2
      // 2a: ifeq 39
      // 2d: ifle 4b
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: iload 4
      // 39: iload 2
      // 3a: ifeq 84
      // 3d: getstatic com/finalshell/core/Q_2.c J
      // 40: l2i
      // 41: if_icmple 72
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: new com/finalshell/core/C_Y
      // 4e: dup
      // 4f: new java/lang/StringBuilder
      // 52: dup
      // 53: invokespecial java/lang/StringBuilder.<init> ()V
      // 56: sipush -14026
      // 59: sipush -22864
      // 5c: invokestatic com/finalshell/core/Q_2.a (II)Ljava/lang/String;
      // 5f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62: iload 4
      // 64: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 67: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6a: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 6d: athrow
      // 6e: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 1
      // 73: invokevirtual com/finalshell/core/UJ.a ()V
      // 76: aload 1
      // 77: iload 4
      // 79: invokevirtual com/finalshell/core/UJ.X (I)V
      // 7c: aload 3
      // 7d: aload 1
      // 7e: bipush 0
      // 7f: iload 4
      // 81: invokestatic com/finalshell/core/Q_2.S (Ljava/nio/channels/SocketChannel;Lcom/finalshell/core/UJ;II)I
      // 84: istore 4
      // 86: aload 3
      // 87: iload 2
      // 88: ifeq 96
      // 8b: ifnull c0
      // 8e: goto 95
      // 91: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: aload 3
      // 96: invokevirtual java/nio/channels/SocketChannel.close ()V
      // 99: goto c0
      // 9c: astore 4
      // 9e: aload 3
      // 9f: iload 2
      // a0: ifeq ae
      // a3: ifnull bd
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: aload 3
      // ae: invokevirtual java/nio/channels/SocketChannel.close ()V
      // b1: goto bd
      // b4: astore 5
      // b6: aload 4
      // b8: aload 5
      // ba: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // bd: aload 4
      // bf: athrow
      // c0: goto d1
      // c3: astore 3
      // c4: new com/finalshell/core/C_Y
      // c7: dup
      // c8: aload 3
      // c9: invokevirtual java/io/IOException.toString ()Ljava/lang/String;
      // cc: aload 3
      // cd: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // d0: athrow
      // d1: return
   }

   public static Rc2 q() throws C_Y {
      try {
         return new OZ3();
      } catch (C_Y var5) {
         try {
            return new NF3();
         } catch (NoClassDefFoundError var3) {
            C_Y var2 = new C_Y(a(-14027, -26947));
            var2.addSuppressed(var5);
            var2.addSuppressed(var3);
            throw var2;
         } catch (C_Y var4) {
            var4.addSuppressed(var5);
            throw var5;
         }
      }
   }

   public static Path t() throws C_Y {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: sipush -14025
      // 06: sipush -14953
      // 09: invokestatic com/finalshell/core/Q_2.a (II)Ljava/lang/String;
      // 0c: invokestatic com/finalshell/core/E8.F (Ljava/lang/String;)Ljava/lang/String;
      // 0f: astore 1
      // 10: istore 0
      // 11: aload 1
      // 12: iload 0
      // 13: ifne 36
      // 16: ifnonnull 35
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: new com/finalshell/core/C_Y
      // 23: dup
      // 24: sipush -14028
      // 27: sipush 23175
      // 2a: invokestatic com/finalshell/core/Q_2.a (II)Ljava/lang/String;
      // 2d: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 30: athrow
      // 31: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: bipush 0
      // 37: anewarray 141
      // 3a: invokestatic java/nio/file/Paths.get (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
      // 3d: areturn
   }

   public static int S(SocketChannel param0, UJ param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 1
      // 04: getfield com/finalshell/core/UJ.g [B
      // 07: iload 2
      // 08: iload 3
      // 09: invokestatic java/nio/ByteBuffer.wrap ([BII)Ljava/nio/ByteBuffer;
      // 0c: astore 5
      // 0e: iload 3
      // 0f: istore 6
      // 11: istore 4
      // 13: iload 3
      // 14: ifle 64
      // 17: aload 0
      // 18: aload 5
      // 1a: invokevirtual java/nio/channels/SocketChannel.read (Ljava/nio/ByteBuffer;)I
      // 1d: istore 7
      // 1f: iload 7
      // 21: iload 4
      // 23: ifne 66
      // 26: iload 4
      // 28: ifne 44
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: ifge 42
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush -1
      // 3d: ireturn
      // 3e: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: iload 7
      // 44: iload 4
      // 46: ifne 5e
      // 49: ifle 5f
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: iload 3
      // 54: iload 7
      // 56: isub
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: istore 3
      // 5f: iload 4
      // 61: ifeq 13
      // 64: iload 6
      // 66: ireturn
   }

   public static int y(SocketChannel param0, UJ param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 1
      // 04: getfield com/finalshell/core/UJ.g [B
      // 07: iload 2
      // 08: iload 3
      // 09: invokestatic java/nio/ByteBuffer.wrap ([BII)Ljava/nio/ByteBuffer;
      // 0c: astore 5
      // 0e: iload 3
      // 0f: istore 6
      // 11: istore 4
      // 13: iload 3
      // 14: ifle 64
      // 17: aload 0
      // 18: aload 5
      // 1a: invokevirtual java/nio/channels/SocketChannel.write (Ljava/nio/ByteBuffer;)I
      // 1d: istore 7
      // 1f: iload 7
      // 21: iload 4
      // 23: ifne 66
      // 26: iload 4
      // 28: ifne 44
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: ifge 42
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush -1
      // 3d: ireturn
      // 3e: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: iload 7
      // 44: iload 4
      // 46: ifne 5e
      // 49: ifle 5f
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: iload 3
      // 54: iload 7
      // 56: isub
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Q_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: istore 3
      // 5f: iload 4
      // 61: ifeq 13
      // 64: iload 6
      // 66: ireturn
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -14028) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 197;
               break;
            case 1:
               var10000 = 0;
               break;
            case 2:
               var10000 = 77;
               break;
            case 3:
               var10000 = 190;
               break;
            case 4:
               var10000 = 161;
               break;
            case 5:
               var10000 = 187;
               break;
            case 6:
               var10000 = 96;
               break;
            case 7:
               var10000 = 231;
               break;
            case 8:
               var10000 = 41;
               break;
            case 9:
               var10000 = 155;
               break;
            case 10:
               var10000 = 130;
               break;
            case 11:
               var10000 = 65;
               break;
            case 12:
               var10000 = 255;
               break;
            case 13:
               var10000 = 185;
               break;
            case 14:
               var10000 = 248;
               break;
            case 15:
               var10000 = 73;
               break;
            case 16:
               var10000 = 61;
               break;
            case 17:
               var10000 = 128;
               break;
            case 18:
               var10000 = 169;
               break;
            case 19:
               var10000 = 45;
               break;
            case 20:
               var10000 = 58;
               break;
            case 21:
               var10000 = 238;
               break;
            case 22:
               var10000 = 7;
               break;
            case 23:
               var10000 = 136;
               break;
            case 24:
               var10000 = 208;
               break;
            case 25:
               var10000 = 180;
               break;
            case 26:
               var10000 = 216;
               break;
            case 27:
               var10000 = 117;
               break;
            case 28:
               var10000 = 177;
               break;
            case 29:
               var10000 = 111;
               break;
            case 30:
               var10000 = 109;
               break;
            case 31:
               var10000 = 42;
               break;
            case 32:
               var10000 = 30;
               break;
            case 33:
               var10000 = 211;
               break;
            case 34:
               var10000 = 218;
               break;
            case 35:
               var10000 = 39;
               break;
            case 36:
               var10000 = 137;
               break;
            case 37:
               var10000 = 234;
               break;
            case 38:
               var10000 = 224;
               break;
            case 39:
               var10000 = 220;
               break;
            case 40:
               var10000 = 222;
               break;
            case 41:
               var10000 = 131;
               break;
            case 42:
               var10000 = 104;
               break;
            case 43:
               var10000 = 64;
               break;
            case 44:
               var10000 = 228;
               break;
            case 45:
               var10000 = 126;
               break;
            case 46:
               var10000 = 116;
               break;
            case 47:
               var10000 = 232;
               break;
            case 48:
               var10000 = 153;
               break;
            case 49:
               var10000 = 110;
               break;
            case 50:
               var10000 = 81;
               break;
            case 51:
               var10000 = 204;
               break;
            case 52:
               var10000 = 119;
               break;
            case 53:
               var10000 = 101;
               break;
            case 54:
               var10000 = 120;
               break;
            case 55:
               var10000 = 43;
               break;
            case 56:
               var10000 = 107;
               break;
            case 57:
               var10000 = 198;
               break;
            case 58:
               var10000 = 97;
               break;
            case 59:
               var10000 = 230;
               break;
            case 60:
               var10000 = 76;
               break;
            case 61:
               var10000 = 121;
               break;
            case 62:
               var10000 = 34;
               break;
            case 63:
               var10000 = 86;
               break;
            case 64:
               var10000 = 102;
               break;
            case 65:
               var10000 = 112;
               break;
            case 66:
               var10000 = 167;
               break;
            case 67:
               var10000 = 113;
               break;
            case 68:
               var10000 = 71;
               break;
            case 69:
               var10000 = 51;
               break;
            case 70:
               var10000 = 221;
               break;
            case 71:
               var10000 = 2;
               break;
            case 72:
               var10000 = 8;
               break;
            case 73:
               var10000 = 69;
               break;
            case 74:
               var10000 = 90;
               break;
            case 75:
               var10000 = 170;
               break;
            case 76:
               var10000 = 6;
               break;
            case 77:
               var10000 = 241;
               break;
            case 78:
               var10000 = 98;
               break;
            case 79:
               var10000 = 79;
               break;
            case 80:
               var10000 = 226;
               break;
            case 81:
               var10000 = 4;
               break;
            case 82:
               var10000 = 129;
               break;
            case 83:
               var10000 = 105;
               break;
            case 84:
               var10000 = 52;
               break;
            case 85:
               var10000 = 138;
               break;
            case 86:
               var10000 = 27;
               break;
            case 87:
               var10000 = 239;
               break;
            case 88:
               var10000 = 14;
               break;
            case 89:
               var10000 = 1;
               break;
            case 90:
               var10000 = 57;
               break;
            case 91:
               var10000 = 63;
               break;
            case 92:
               var10000 = 54;
               break;
            case 93:
               var10000 = 151;
               break;
            case 94:
               var10000 = 84;
               break;
            case 95:
               var10000 = 9;
               break;
            case 96:
               var10000 = 16;
               break;
            case 97:
               var10000 = 127;
               break;
            case 98:
               var10000 = 87;
               break;
            case 99:
               var10000 = 233;
               break;
            case 100:
               var10000 = 85;
               break;
            case 101:
               var10000 = 217;
               break;
            case 102:
               var10000 = 223;
               break;
            case 103:
               var10000 = 83;
               break;
            case 104:
               var10000 = 243;
               break;
            case 105:
               var10000 = 78;
               break;
            case 106:
               var10000 = 22;
               break;
            case 107:
               var10000 = 29;
               break;
            case 108:
               var10000 = 183;
               break;
            case 109:
               var10000 = 25;
               break;
            case 110:
               var10000 = 12;
               break;
            case 111:
               var10000 = 184;
               break;
            case 112:
               var10000 = 173;
               break;
            case 113:
               var10000 = 225;
               break;
            case 114:
               var10000 = 10;
               break;
            case 115:
               var10000 = 191;
               break;
            case 116:
               var10000 = 201;
               break;
            case 117:
               var10000 = 236;
               break;
            case 118:
               var10000 = 215;
               break;
            case 119:
               var10000 = 144;
               break;
            case 120:
               var10000 = 251;
               break;
            case 121:
               var10000 = 62;
               break;
            case 122:
               var10000 = 94;
               break;
            case 123:
               var10000 = 26;
               break;
            case 124:
               var10000 = 205;
               break;
            case 125:
               var10000 = 166;
               break;
            case 126:
               var10000 = 253;
               break;
            case 127:
               var10000 = 108;
               break;
            case 128:
               var10000 = 145;
               break;
            case 129:
               var10000 = 66;
               break;
            case 130:
               var10000 = 193;
               break;
            case 131:
               var10000 = 174;
               break;
            case 132:
               var10000 = 213;
               break;
            case 133:
               var10000 = 219;
               break;
            case 134:
               var10000 = 18;
               break;
            case 135:
               var10000 = 33;
               break;
            case 136:
               var10000 = 59;
               break;
            case 137:
               var10000 = 80;
               break;
            case 138:
               var10000 = 172;
               break;
            case 139:
               var10000 = 19;
               break;
            case 140:
               var10000 = 92;
               break;
            case 141:
               var10000 = 160;
               break;
            case 142:
               var10000 = 182;
               break;
            case 143:
               var10000 = 181;
               break;
            case 144:
               var10000 = 227;
               break;
            case 145:
               var10000 = 74;
               break;
            case 146:
               var10000 = 206;
               break;
            case 147:
               var10000 = 165;
               break;
            case 148:
               var10000 = 199;
               break;
            case 149:
               var10000 = 100;
               break;
            case 150:
               var10000 = 176;
               break;
            case 151:
               var10000 = 37;
               break;
            case 152:
               var10000 = 47;
               break;
            case 153:
               var10000 = 254;
               break;
            case 154:
               var10000 = 140;
               break;
            case 155:
               var10000 = 5;
               break;
            case 156:
               var10000 = 35;
               break;
            case 157:
               var10000 = 75;
               break;
            case 158:
               var10000 = 194;
               break;
            case 159:
               var10000 = 147;
               break;
            case 160:
               var10000 = 148;
               break;
            case 161:
               var10000 = 237;
               break;
            case 162:
               var10000 = 188;
               break;
            case 163:
               var10000 = 210;
               break;
            case 164:
               var10000 = 142;
               break;
            case 165:
               var10000 = 67;
               break;
            case 166:
               var10000 = 246;
               break;
            case 167:
               var10000 = 134;
               break;
            case 168:
               var10000 = 49;
               break;
            case 169:
               var10000 = 250;
               break;
            case 170:
               var10000 = 38;
               break;
            case 171:
               var10000 = 189;
               break;
            case 172:
               var10000 = 163;
               break;
            case 173:
               var10000 = 122;
               break;
            case 174:
               var10000 = 202;
               break;
            case 175:
               var10000 = 235;
               break;
            case 176:
               var10000 = 139;
               break;
            case 177:
               var10000 = 164;
               break;
            case 178:
               var10000 = 56;
               break;
            case 179:
               var10000 = 24;
               break;
            case 180:
               var10000 = 186;
               break;
            case 181:
               var10000 = 13;
               break;
            case 182:
               var10000 = 158;
               break;
            case 183:
               var10000 = 70;
               break;
            case 184:
               var10000 = 11;
               break;
            case 185:
               var10000 = 123;
               break;
            case 186:
               var10000 = 209;
               break;
            case 187:
               var10000 = 141;
               break;
            case 188:
               var10000 = 72;
               break;
            case 189:
               var10000 = 175;
               break;
            case 190:
               var10000 = 156;
               break;
            case 191:
               var10000 = 159;
               break;
            case 192:
               var10000 = 31;
               break;
            case 193:
               var10000 = 154;
               break;
            case 194:
               var10000 = 21;
               break;
            case 195:
               var10000 = 135;
               break;
            case 196:
               var10000 = 168;
               break;
            case 197:
               var10000 = 212;
               break;
            case 198:
               var10000 = 40;
               break;
            case 199:
               var10000 = 133;
               break;
            case 200:
               var10000 = 124;
               break;
            case 201:
               var10000 = 3;
               break;
            case 202:
               var10000 = 15;
               break;
            case 203:
               var10000 = 106;
               break;
            case 204:
               var10000 = 195;
               break;
            case 205:
               var10000 = 55;
               break;
            case 206:
               var10000 = 28;
               break;
            case 207:
               var10000 = 196;
               break;
            case 208:
               var10000 = 91;
               break;
            case 209:
               var10000 = 68;
               break;
            case 210:
               var10000 = 93;
               break;
            case 211:
               var10000 = 44;
               break;
            case 212:
               var10000 = 162;
               break;
            case 213:
               var10000 = 247;
               break;
            case 214:
               var10000 = 36;
               break;
            case 215:
               var10000 = 48;
               break;
            case 216:
               var10000 = 200;
               break;
            case 217:
               var10000 = 53;
               break;
            case 218:
               var10000 = 179;
               break;
            case 219:
               var10000 = 95;
               break;
            case 220:
               var10000 = 150;
               break;
            case 221:
               var10000 = 60;
               break;
            case 222:
               var10000 = 171;
               break;
            case 223:
               var10000 = 88;
               break;
            case 224:
               var10000 = 118;
               break;
            case 225:
               var10000 = 146;
               break;
            case 226:
               var10000 = 50;
               break;
            case 227:
               var10000 = 46;
               break;
            case 228:
               var10000 = 143;
               break;
            case 229:
               var10000 = 82;
               break;
            case 230:
               var10000 = 32;
               break;
            case 231:
               var10000 = 89;
               break;
            case 232:
               var10000 = 240;
               break;
            case 233:
               var10000 = 17;
               break;
            case 234:
               var10000 = 245;
               break;
            case 235:
               var10000 = 103;
               break;
            case 236:
               var10000 = 125;
               break;
            case 237:
               var10000 = 214;
               break;
            case 238:
               var10000 = 152;
               break;
            case 239:
               var10000 = 157;
               break;
            case 240:
               var10000 = 242;
               break;
            case 241:
               var10000 = 192;
               break;
            case 242:
               var10000 = 249;
               break;
            case 243:
               var10000 = 207;
               break;
            case 244:
               var10000 = 252;
               break;
            case 245:
               var10000 = 244;
               break;
            case 246:
               var10000 = 114;
               break;
            case 247:
               var10000 = 203;
               break;
            case 248:
               var10000 = 149;
               break;
            case 249:
               var10000 = 229;
               break;
            case 250:
               var10000 = 115;
               break;
            case 251:
               var10000 = 99;
               break;
            case 252:
               var10000 = 20;
               break;
            case 253:
               var10000 = 23;
               break;
            case 254:
               var10000 = 178;
               break;
            default:
               var10000 = 132;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "\u0014\u0006\u009bæ©2_Kº\u0013ìÂ\u007f\u0004\u001e\u0007ÏÓh¢øp\u008eè1\u0003\bð\\\u001f±¦\u0017&ãü3[_iÙ\u001e¢ÙmÝ\u008aµ¿¥\u0083D\u001a5/\u00adËÇ@\t+\u0010\u0086\u008c´UÊ\rév`çÃ\u0088 ¥n!";
      int var6 = "\u0014\u0006\u009bæ©2_Kº\u0013ìÂ\u007f\u0004\u001e\u0007ÏÓh¢øp\u008eè1\u0003\bð\\\u001f±¦\u0017&ãü3[_iÙ\u001e¢ÙmÝ\u008aµ¿¥\u0083D\u001a5/\u00adËÇ@\t+\u0010\u0086\u008c´UÊ\rév`çÃ\u0088 ¥n!"
         .length();
      char var3 = 29;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 111;
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
                        var50 = 28;
                        break;
                     case 1:
                        var50 = 61;
                        break;
                     case 2:
                        var50 = 105;
                        break;
                     case 3:
                        var50 = 101;
                        break;
                     case 4:
                        var50 = 117;
                        break;
                     case 5:
                        var50 = 33;
                        break;
                     default:
                        var50 = 123;
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
                     a = var7;
                     b = new String[5];
                     long var0 = 5902802498515832957L;
                     long var27 = -8264031133158141827L ^ var0;
                     byte var18 = -1;
                     c = var27;
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

                  var4 = "X\u0097\u001bÝ°\\u\u008fö\u0082lùf\t\u0001©4LQ`\\Zï";
                  var6 = "X\u0097\u001bÝ°\\u\u008fö\u0082lùf\t\u0001©4LQ`\\Zï".length();
                  var3 = '\r';
                  var10 = -1;
            }

            var10000 = 103;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





