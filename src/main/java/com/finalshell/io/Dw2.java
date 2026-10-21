package com.finalshell.io;

import com.finalshell.core.D8;
import com.finalshell.core.Nm4;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class Dw2 extends FilterOutputStream {
   protected final D8 e;
   protected byte[] E;
   public boolean O;
   public boolean R;
   public final byte[] U;
   protected boolean m;
   public boolean B;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   Dw2(OutputStream var1) throws IOException {
      this(var1, new D8(-1), a(16245, 8803217142060803622L), true);
      this.m = true;
   }

   Dw2(OutputStream var1, D8 var2) throws IOException {
      this(var1, var2, a(31944, 3103209374615184793L), true);
   }

   Dw2(OutputStream var1, D8 var2, int var3) throws IOException {
      this(var1, var2, var3, true);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   Dw2(OutputStream var1, D8 var2, int var3, boolean var4) throws IOException {
      label30: {
         super(var1);
         this.O = false;
         this.R = false;
         this.U = new byte[1];
         this.m = false;
         this.B = true;
         if (var1 != null) {
            try {
               if (var2 != null) {
                  break label30;
               }
            } catch (IOException var7) {
               boolean var10001 = false;
               throw a(var7);
            }
         }

         try {
            throw new NullPointerException();
         } catch (IOException var6) {
            boolean var8 = false;
            throw a(var6);
         }
      }

      try {
         if (var3 <= 0) {
            throw new IllegalArgumentException(a(-13455, 11923));
         }
      } catch (IOException var5) {
         throw a(var5);
      }

      this.e = var2;
      this.E = new byte[var3];
      this.B = var4;
   }

   @Override
   public void write(int var1) throws IOException {
      this.U[0] = (byte)(var1 & a(25827, 2659441647370747313L));
      this.write(this.U, 0, 1);
   }

   @Override
   public void write(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 4
      // 05: aload 0
      // 06: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 09: invokevirtual com/finalshell/core/D8.h$boolean ()Z
      // 0c: aload 4
      // 0e: ifnonnull 31
      // 11: ifeq 30
      // 14: goto 1b
      // 17: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: new java/io/IOException
      // 1e: dup
      // 1f: sipush -13454
      // 22: sipush 4560
      // 25: invokestatic com/finalshell/io/Dw2.a (II)Ljava/lang/String;
      // 28: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 2b: athrow
      // 2c: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2f: athrow
      // 30: iload 2
      // 31: aload 4
      // 33: ifnonnull 41
      // 36: iflt 6b
      // 39: goto 40
      // 3c: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3f: athrow
      // 40: iload 3
      // 41: aload 4
      // 43: ifnonnull 5a
      // 46: iflt 6b
      // 49: goto 50
      // 4c: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4f: athrow
      // 50: iload 2
      // 51: iload 3
      // 52: iadd
      // 53: goto 5a
      // 56: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 59: athrow
      // 5a: aload 4
      // 5c: ifnonnull 78
      // 5f: aload 1
      // 60: arraylength
      // 61: if_icmple 77
      // 64: goto 6b
      // 67: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6a: athrow
      // 6b: new java/lang/IndexOutOfBoundsException
      // 6e: dup
      // 6f: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 72: athrow
      // 73: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 76: athrow
      // 77: iload 3
      // 78: aload 4
      // 7a: ifnonnull 8c
      // 7d: ifne 88
      // 80: goto 87
      // 83: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 86: athrow
      // 87: return
      // 88: aload 0
      // 89: getfield com/finalshell/io/Dw2.R Z
      // 8c: aload 4
      // 8e: ifnonnull 9c
      // 91: ifeq 9f
      // 94: goto 9b
      // 97: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 9a: athrow
      // 9b: bipush 2
      // 9c: goto a0
      // 9f: bipush 0
      // a0: istore 5
      // a2: aload 0
      // a3: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // a6: aload 1
      // a7: iload 2
      // a8: iload 3
      // a9: bipush 1
      // aa: invokevirtual com/finalshell/core/D8.Z ([BIIZ)V
      // ad: aload 0
      // ae: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // b1: getfield com/finalshell/core/D8.L I
      // b4: ifle dd
      // b7: aload 0
      // b8: iload 5
      // ba: invokevirtual com/finalshell/io/Dw2.b (I)I
      // bd: istore 6
      // bf: iload 6
      // c1: bipush 1
      // c2: if_icmpne d1
      // c5: aload 4
      // c7: ifnull dd
      // ca: goto d1
      // cd: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // d0: athrow
      // d1: aload 4
      // d3: ifnull ad
      // d6: goto dd
      // d9: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // dc: athrow
      // dd: return
   }

   void s$void() throws IOException {
      int[] var1 = Nm4.g();

      while (!this.e.h$boolean()) {
         this.b(4);
         if (var1 != null) {
            break;
         }
      }
   }

   @Override
   public void close() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/Dw2.O Z
      // 08: aload 1
      // 09: ifnonnull 25
      // 0c: ifne 67
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual com/finalshell/io/Dw2.s$void ()V
      // 1a: aload 0
      // 1b: getfield com/finalshell/io/Dw2.m Z
      // 1e: goto 25
      // 21: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: aload 1
      // 26: ifnonnull 51
      // 29: ifeq 42
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 32: athrow
      // 33: aload 0
      // 34: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 37: invokevirtual com/finalshell/core/D8.v ()I
      // 3a: pop
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: ifnonnull 63
      // 47: getfield com/finalshell/io/Dw2.B Z
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 50: athrow
      // 51: ifeq 62
      // 54: aload 0
      // 55: getfield com/finalshell/io/Dw2.out Ljava/io/OutputStream;
      // 58: invokevirtual java/io/OutputStream.close ()V
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 61: athrow
      // 62: aload 0
      // 63: bipush 1
      // 64: putfield com/finalshell/io/Dw2.O Z
      // 67: return
   }

   protected int b(int param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: aload 0
      // 04: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 07: aload 0
      // 08: getfield com/finalshell/io/Dw2.E [B
      // 0b: bipush 0
      // 0c: aload 0
      // 0d: getfield com/finalshell/io/Dw2.E [B
      // 10: arraylength
      // 11: invokevirtual com/finalshell/core/D8.U ([BII)V
      // 14: astore 2
      // 15: aload 0
      // 16: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 19: iload 1
      // 1a: invokevirtual com/finalshell/core/D8.o (I)I
      // 1d: istore 3
      // 1e: iload 3
      // 1f: lookupswitch 88 3 -5 44 0 33 1 33
      // 40: aload 2
      // 41: ifnull b3
      // 44: goto 4b
      // 47: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 4f: getfield com/finalshell/core/D8.L I
      // 52: aload 2
      // 53: ifnonnull 68
      // 56: goto 5d
      // 59: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5c: athrow
      // 5d: ifgt 77
      // 60: goto 67
      // 63: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 66: athrow
      // 67: iload 1
      // 68: bipush 4
      // 69: if_icmpeq 77
      // 6c: aload 2
      // 6d: ifnull b3
      // 70: goto 77
      // 73: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 76: athrow
      // 77: new java/io/IOException
      // 7a: dup
      // 7b: new java/lang/StringBuilder
      // 7e: dup
      // 7f: invokespecial java/lang/StringBuilder.<init> ()V
      // 82: sipush -13453
      // 85: sipush -26985
      // 88: invokestatic com/finalshell/io/Dw2.a (II)Ljava/lang/String;
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e: iload 3
      // 8f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 92: sipush -13456
      // 95: sipush 2467
      // 98: invokestatic com/finalshell/io/Dw2.a (II)Ljava/lang/String;
      // 9b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e: aload 0
      // 9f: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // a2: getfield com/finalshell/core/D8.g I
      // a5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ab: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // ae: athrow
      // af: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // b2: athrow
      // b3: aload 0
      // b4: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // b7: getfield com/finalshell/core/D8.V I
      // ba: istore 4
      // bc: iload 4
      // be: aload 2
      // bf: ifnonnull e2
      // c2: ifle e1
      // c5: goto cc
      // c8: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // cb: athrow
      // cc: aload 0
      // cd: getfield com/finalshell/io/Dw2.out Ljava/io/OutputStream;
      // d0: aload 0
      // d1: getfield com/finalshell/io/Dw2.E [B
      // d4: bipush 0
      // d5: iload 4
      // d7: invokevirtual java/io/OutputStream.write ([BII)V
      // da: goto e1
      // dd: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // e0: athrow
      // e1: iload 3
      // e2: ireturn
   }

   @Override
   public void flush() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 75
      // 09: getfield com/finalshell/io/Dw2.R Z
      // 0c: ifeq 71
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 75
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 25: invokevirtual com/finalshell/core/D8.h$boolean ()Z
      // 28: ifne 71
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 31: athrow
      // 32: aload 0
      // 33: bipush 2
      // 34: invokevirtual com/finalshell/io/Dw2.b (I)I
      // 37: istore 2
      // 38: aload 0
      // 39: getfield com/finalshell/io/Dw2.e Lcom/finalshell/core/D8;
      // 3c: getfield com/finalshell/core/D8.V I
      // 3f: aload 0
      // 40: getfield com/finalshell/io/Dw2.E [B
      // 43: arraylength
      // 44: if_icmpge 56
      // 47: aload 1
      // 48: ifnonnull 6d
      // 4b: aload 1
      // 4c: ifnull 71
      // 4f: goto 56
      // 52: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 55: athrow
      // 56: iload 2
      // 57: bipush 1
      // 58: if_icmpne 6d
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 61: athrow
      // 62: aload 1
      // 63: ifnull 71
      // 66: goto 6d
      // 69: invokestatic com/finalshell/io/Dw2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6c: athrow
      // 6d: aload 1
      // 6e: ifnull 32
      // 71: aload 0
      // 72: getfield com/finalshell/io/Dw2.out Ljava/io/OutputStream;
      // 75: invokevirtual java/io/OutputStream.flush ()V
      // 78: return
   }

   long K() {
      return this.e.z();
   }

   long S() {
      return this.e.N();
   }

   void q(boolean var1) {
      this.R = var1;
   }

   boolean G() {
      return this.R;
   }

   D8 s$D8() {
      return this.e;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -13456) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 51;
               break;
            case 1:
               var10000 = 138;
               break;
            case 2:
               var10000 = 121;
               break;
            case 3:
               var10000 = 103;
               break;
            case 4:
               var10000 = 117;
               break;
            case 5:
               var10000 = 225;
               break;
            case 6:
               var10000 = 168;
               break;
            case 7:
               var10000 = 170;
               break;
            case 8:
               var10000 = 212;
               break;
            case 9:
               var10000 = 140;
               break;
            case 10:
               var10000 = 175;
               break;
            case 11:
               var10000 = 11;
               break;
            case 12:
               var10000 = 68;
               break;
            case 13:
               var10000 = 157;
               break;
            case 14:
               var10000 = 129;
               break;
            case 15:
               var10000 = 35;
               break;
            case 16:
               var10000 = 127;
               break;
            case 17:
               var10000 = 89;
               break;
            case 18:
               var10000 = 67;
               break;
            case 19:
               var10000 = 96;
               break;
            case 20:
               var10000 = 64;
               break;
            case 21:
               var10000 = 45;
               break;
            case 22:
               var10000 = 98;
               break;
            case 23:
               var10000 = 77;
               break;
            case 24:
               var10000 = 234;
               break;
            case 25:
               var10000 = 246;
               break;
            case 26:
               var10000 = 57;
               break;
            case 27:
               var10000 = 6;
               break;
            case 28:
               var10000 = 161;
               break;
            case 29:
               var10000 = 229;
               break;
            case 30:
               var10000 = 16;
               break;
            case 31:
               var10000 = 215;
               break;
            case 32:
               var10000 = 37;
               break;
            case 33:
               var10000 = 21;
               break;
            case 34:
               var10000 = 110;
               break;
            case 35:
               var10000 = 62;
               break;
            case 36:
               var10000 = 81;
               break;
            case 37:
               var10000 = 39;
               break;
            case 38:
               var10000 = 76;
               break;
            case 39:
               var10000 = 213;
               break;
            case 40:
               var10000 = 15;
               break;
            case 41:
               var10000 = 65;
               break;
            case 42:
               var10000 = 29;
               break;
            case 43:
               var10000 = 95;
               break;
            case 44:
               var10000 = 75;
               break;
            case 45:
               var10000 = 17;
               break;
            case 46:
               var10000 = 2;
               break;
            case 47:
               var10000 = 128;
               break;
            case 48:
               var10000 = 131;
               break;
            case 49:
               var10000 = 196;
               break;
            case 50:
               var10000 = 243;
               break;
            case 51:
               var10000 = 167;
               break;
            case 52:
               var10000 = 164;
               break;
            case 53:
               var10000 = 14;
               break;
            case 54:
               var10000 = 239;
               break;
            case 55:
               var10000 = 194;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 132;
               break;
            case 58:
               var10000 = 109;
               break;
            case 59:
               var10000 = 183;
               break;
            case 60:
               var10000 = 133;
               break;
            case 61:
               var10000 = 180;
               break;
            case 62:
               var10000 = 214;
               break;
            case 63:
               var10000 = 220;
               break;
            case 64:
               var10000 = 105;
               break;
            case 65:
               var10000 = 9;
               break;
            case 66:
               var10000 = 149;
               break;
            case 67:
               var10000 = 190;
               break;
            case 68:
               var10000 = 113;
               break;
            case 69:
               var10000 = 153;
               break;
            case 70:
               var10000 = 61;
               break;
            case 71:
               var10000 = 209;
               break;
            case 72:
               var10000 = 242;
               break;
            case 73:
               var10000 = 237;
               break;
            case 74:
               var10000 = 56;
               break;
            case 75:
               var10000 = 253;
               break;
            case 76:
               var10000 = 54;
               break;
            case 77:
               var10000 = 141;
               break;
            case 78:
               var10000 = 87;
               break;
            case 79:
               var10000 = 238;
               break;
            case 80:
               var10000 = 247;
               break;
            case 81:
               var10000 = 200;
               break;
            case 82:
               var10000 = 240;
               break;
            case 83:
               var10000 = 59;
               break;
            case 84:
               var10000 = 244;
               break;
            case 85:
               var10000 = 106;
               break;
            case 86:
               var10000 = 233;
               break;
            case 87:
               var10000 = 100;
               break;
            case 88:
               var10000 = 231;
               break;
            case 89:
               var10000 = 228;
               break;
            case 90:
               var10000 = 158;
               break;
            case 91:
               var10000 = 226;
               break;
            case 92:
               var10000 = 93;
               break;
            case 93:
               var10000 = 171;
               break;
            case 94:
               var10000 = 46;
               break;
            case 95:
               var10000 = 22;
               break;
            case 96:
               var10000 = 195;
               break;
            case 97:
               var10000 = 144;
               break;
            case 98:
               var10000 = 205;
               break;
            case 99:
               var10000 = 63;
               break;
            case 100:
               var10000 = 156;
               break;
            case 101:
               var10000 = 198;
               break;
            case 102:
               var10000 = 177;
               break;
            case 103:
               var10000 = 179;
               break;
            case 104:
               var10000 = 221;
               break;
            case 105:
               var10000 = 74;
               break;
            case 106:
               var10000 = 10;
               break;
            case 107:
               var10000 = 135;
               break;
            case 108:
               var10000 = 70;
               break;
            case 109:
               var10000 = 73;
               break;
            case 110:
               var10000 = 79;
               break;
            case 111:
               var10000 = 40;
               break;
            case 112:
               var10000 = 208;
               break;
            case 113:
               var10000 = 199;
               break;
            case 114:
               var10000 = 186;
               break;
            case 115:
               var10000 = 38;
               break;
            case 116:
               var10000 = 80;
               break;
            case 117:
               var10000 = 163;
               break;
            case 118:
               var10000 = 36;
               break;
            case 119:
               var10000 = 58;
               break;
            case 120:
               var10000 = 78;
               break;
            case 121:
               var10000 = 197;
               break;
            case 122:
               var10000 = 119;
               break;
            case 123:
               var10000 = 203;
               break;
            case 124:
               var10000 = 71;
               break;
            case 125:
               var10000 = 125;
               break;
            case 126:
               var10000 = 12;
               break;
            case 127:
               var10000 = 53;
               break;
            case 128:
               var10000 = 188;
               break;
            case 129:
               var10000 = 182;
               break;
            case 130:
               var10000 = 218;
               break;
            case 131:
               var10000 = 126;
               break;
            case 132:
               var10000 = 211;
               break;
            case 133:
               var10000 = 32;
               break;
            case 134:
               var10000 = 34;
               break;
            case 135:
               var10000 = 184;
               break;
            case 136:
               var10000 = 166;
               break;
            case 137:
               var10000 = 83;
               break;
            case 138:
               var10000 = 107;
               break;
            case 139:
               var10000 = 224;
               break;
            case 140:
               var10000 = 251;
               break;
            case 141:
               var10000 = 97;
               break;
            case 142:
               var10000 = 227;
               break;
            case 143:
               var10000 = 120;
               break;
            case 144:
               var10000 = 204;
               break;
            case 145:
               var10000 = 159;
               break;
            case 146:
               var10000 = 33;
               break;
            case 147:
               var10000 = 210;
               break;
            case 148:
               var10000 = 48;
               break;
            case 149:
               var10000 = 137;
               break;
            case 150:
               var10000 = 1;
               break;
            case 151:
               var10000 = 86;
               break;
            case 152:
               var10000 = 142;
               break;
            case 153:
               var10000 = 136;
               break;
            case 154:
               var10000 = 116;
               break;
            case 155:
               var10000 = 69;
               break;
            case 156:
               var10000 = 201;
               break;
            case 157:
               var10000 = 191;
               break;
            case 158:
               var10000 = 18;
               break;
            case 159:
               var10000 = 145;
               break;
            case 160:
               var10000 = 147;
               break;
            case 161:
               var10000 = 23;
               break;
            case 162:
               var10000 = 82;
               break;
            case 163:
               var10000 = 192;
               break;
            case 164:
               var10000 = 151;
               break;
            case 165:
               var10000 = 24;
               break;
            case 166:
               var10000 = 52;
               break;
            case 167:
               var10000 = 3;
               break;
            case 168:
               var10000 = 27;
               break;
            case 169:
               var10000 = 250;
               break;
            case 170:
               var10000 = 13;
               break;
            case 171:
               var10000 = 230;
               break;
            case 172:
               var10000 = 92;
               break;
            case 173:
               var10000 = 232;
               break;
            case 174:
               var10000 = 101;
               break;
            case 175:
               var10000 = 44;
               break;
            case 176:
               var10000 = 134;
               break;
            case 177:
               var10000 = 185;
               break;
            case 178:
               var10000 = 4;
               break;
            case 179:
               var10000 = 30;
               break;
            case 180:
               var10000 = 223;
               break;
            case 181:
               var10000 = 111;
               break;
            case 182:
               var10000 = 124;
               break;
            case 183:
               var10000 = 148;
               break;
            case 184:
               var10000 = 50;
               break;
            case 185:
               var10000 = 72;
               break;
            case 186:
               var10000 = 130;
               break;
            case 187:
               var10000 = 7;
               break;
            case 188:
               var10000 = 55;
               break;
            case 189:
               var10000 = 178;
               break;
            case 190:
               var10000 = 249;
               break;
            case 191:
               var10000 = 139;
               break;
            case 192:
               var10000 = 189;
               break;
            case 193:
               var10000 = 118;
               break;
            case 194:
               var10000 = 222;
               break;
            case 195:
               var10000 = 181;
               break;
            case 196:
               var10000 = 49;
               break;
            case 197:
               var10000 = 154;
               break;
            case 198:
               var10000 = 94;
               break;
            case 199:
               var10000 = 114;
               break;
            case 200:
               var10000 = 26;
               break;
            case 201:
               var10000 = 202;
               break;
            case 202:
               var10000 = 206;
               break;
            case 203:
               var10000 = 169;
               break;
            case 204:
               var10000 = 60;
               break;
            case 205:
               var10000 = 108;
               break;
            case 206:
               var10000 = 19;
               break;
            case 207:
               var10000 = 235;
               break;
            case 208:
               var10000 = 193;
               break;
            case 209:
               var10000 = 42;
               break;
            case 210:
               var10000 = 115;
               break;
            case 211:
               var10000 = 254;
               break;
            case 212:
               var10000 = 122;
               break;
            case 213:
               var10000 = 152;
               break;
            case 214:
               var10000 = 47;
               break;
            case 215:
               var10000 = 174;
               break;
            case 216:
               var10000 = 187;
               break;
            case 217:
               var10000 = 216;
               break;
            case 218:
               var10000 = 143;
               break;
            case 219:
               var10000 = 25;
               break;
            case 220:
               var10000 = 104;
               break;
            case 221:
               var10000 = 84;
               break;
            case 222:
               var10000 = 99;
               break;
            case 223:
               var10000 = 90;
               break;
            case 224:
               var10000 = 91;
               break;
            case 225:
               var10000 = 155;
               break;
            case 226:
               var10000 = 123;
               break;
            case 227:
               var10000 = 217;
               break;
            case 228:
               var10000 = 236;
               break;
            case 229:
               var10000 = 112;
               break;
            case 230:
               var10000 = 88;
               break;
            case 231:
               var10000 = 5;
               break;
            case 232:
               var10000 = 162;
               break;
            case 233:
               var10000 = 8;
               break;
            case 234:
               var10000 = 173;
               break;
            case 235:
               var10000 = 207;
               break;
            case 236:
               var10000 = 41;
               break;
            case 237:
               var10000 = 28;
               break;
            case 238:
               var10000 = 245;
               break;
            case 239:
               var10000 = 219;
               break;
            case 240:
               var10000 = 20;
               break;
            case 241:
               var10000 = 248;
               break;
            case 242:
               var10000 = 165;
               break;
            case 243:
               var10000 = 252;
               break;
            case 244:
               var10000 = 85;
               break;
            case 245:
               var10000 = 176;
               break;
            case 246:
               var10000 = 43;
               break;
            case 247:
               var10000 = 241;
               break;
            case 248:
               var10000 = 146;
               break;
            case 249:
               var10000 = 0;
               break;
            case 250:
               var10000 = 150;
               break;
            case 251:
               var10000 = 31;
               break;
            case 252:
               var10000 = 66;
               break;
            case 253:
               var10000 = 255;
               break;
            case 254:
               var10000 = 160;
               break;
            default:
               var10000 = 172;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22867;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "+å¢\u0002:l\u0012\u009cMðÝ\"6\u00ad\u001b\u009a\u0013\u0086Å\u0000;òÔô3\u0081JQá Â\u0007¸)7íÉ*¼â@Þ\u0006B\u0012Ö";
      int var12 = "+å¢\u0002:l\u0012\u009cMðÝ\"6\u00ad\u001b\u009a\u0013\u0086Å\u0000;òÔô3\u0081JQá Â\u0007¸)7íÉ*¼â@Þ\u0006B\u0012Ö".length();
      char var9 = 11;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 8;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 95;
                        break;
                     case 1:
                        var58 = 78;
                        break;
                     case 2:
                        var58 = 119;
                        break;
                     case 3:
                        var58 = 82;
                        break;
                     case 4:
                        var58 = 88;
                        break;
                     case 5:
                        var58 = 78;
                        break;
                     default:
                        var58 = 76;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[4];
                     long var0 = 5689815854070223387L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "Fz\u0094Êú\u00146=\u00ad@íh\u0017ToUiTâ«\u0086¤u\u0082";
                     int var5 = "Fz\u0094Êú\u00146=\u00ad@íh\u0017ToUiTâ«\u0086¤u\u0082".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "E\u0094\u009aN_\u008b¾\u008c\u0019\u008d\u009a\u0084\u0083m\u009bi\u0013ËNnT-\u0002\u0092x\u008c>¤±ïq\u0003\u0096.";
                  var12 = "E\u0094\u009aN_\u008b¾\u008c\u0019\u008d\u009a\u0084\u0083m\u009bi\u0013ËNnT-\u0002\u0092x\u008c>¤±ïq\u0003\u0096.".length();
                  var9 = '\b';
                  var16 = -1;
            }

            var10000 = 11;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





