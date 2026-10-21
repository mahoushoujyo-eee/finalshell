package com.finalshell.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class R4 implements Ic4 {
   public static int m;
   public String X;
   public int c;
   public InputStream Y;
   public OutputStream U;
   public Socket S;
   public String z;
   public String K;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public R4(String var1) {
   super();
      boolean var10000 = Dm4.J$boolean();
      int var3 = m;
      String var4 = var1;
      boolean var2 = var10000;

      label24: {
         try {
            if (var2) {
               return;
            }

            if (var1.indexOf(a(8036, 7456196673383505386L)) == -1) {
               break label24;
            }
         } catch (Exception var7) {
            throw a(var7);
         }

         try {
            var4 = var1.substring(0, var1.indexOf(a(27076, 4806721619813165896L)));
            var3 = Integer.parseInt(var1.substring(var1.indexOf(a(27076, 4806721619813165896L)) + 1));
         } catch (Exception var6) {
         }
      }

      this.X = var4;
      this.c = var3;
   }

   public R4(String var1, int var2) {
      this.X = var1;
      this.c = var2;
   }

   public void g(String var1, String var2) {
      this.z = var1;
      this.K = var2;
   }

   @Override
   public void e(PJ3 param1, String param2, int param3, int param4) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 5
      // 005: iload 5
      // 007: ifne 06f
      // 00a: aload 1
      // 00b: ifnonnull 048
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 0
      // 016: aload 0
      // 017: getfield com/finalshell/core/R4.X Ljava/lang/String;
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/R4.c I
      // 01e: iload 4
      // 020: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 023: putfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 026: aload 0
      // 027: aload 0
      // 028: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 02b: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 02e: putfield com/finalshell/core/R4.Y Ljava/io/InputStream;
      // 031: aload 0
      // 032: aload 0
      // 033: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 036: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 039: putfield com/finalshell/core/R4.U Ljava/io/OutputStream;
      // 03c: iload 5
      // 03e: ifeq 07d
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: aload 1
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/R4.X Ljava/lang/String;
      // 04e: aload 0
      // 04f: getfield com/finalshell/core/R4.c I
      // 052: invokeinterface com/finalshell/core/PJ3.y (Ljava/lang/String;I)Ljava/net/Socket; 3
      // 057: putfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 05a: aload 0
      // 05b: aload 1
      // 05c: aload 0
      // 05d: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 060: invokeinterface com/finalshell/core/PJ3.j (Ljava/net/Socket;)Ljava/io/InputStream; 2
      // 065: putfield com/finalshell/core/R4.Y Ljava/io/InputStream;
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 0
      // 070: aload 1
      // 071: aload 0
      // 072: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 075: invokeinterface com/finalshell/core/PJ3.P (Ljava/net/Socket;)Ljava/io/OutputStream; 2
      // 07a: putfield com/finalshell/core/R4.U Ljava/io/OutputStream;
      // 07d: iload 4
      // 07f: iload 5
      // 081: ifne 0af
      // 084: ifle 09e
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 092: iload 4
      // 094: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 0a2: bipush 1
      // 0a3: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 0a6: sipush 7888
      // 0a9: ldc2_w 2040236206246435928
      // 0ac: invokestatic com/finalshell/core/R4.a (IJ)I
      // 0af: newarray 8
      // 0b1: astore 6
      // 0b3: bipush 0
      // 0b4: istore 7
      // 0b6: bipush 0
      // 0b7: istore 7
      // 0b9: aload 6
      // 0bb: iload 7
      // 0bd: iinc 7 1
      // 0c0: bipush 4
      // 0c1: bastore
      // 0c2: aload 6
      // 0c4: iload 7
      // 0c6: iinc 7 1
      // 0c9: bipush 1
      // 0ca: bastore
      // 0cb: aload 6
      // 0cd: iload 7
      // 0cf: iinc 7 1
      // 0d2: iload 3
      // 0d3: sipush 14330
      // 0d6: ldc2_w 8505324130024568181
      // 0d9: invokestatic com/finalshell/core/R4.a (IJ)I
      // 0dc: iushr
      // 0dd: i2b
      // 0de: bastore
      // 0df: aload 6
      // 0e1: iload 7
      // 0e3: iinc 7 1
      // 0e6: iload 3
      // 0e7: sipush 25214
      // 0ea: ldc2_w 8159163509748785396
      // 0ed: invokestatic com/finalshell/core/R4.a (IJ)I
      // 0f0: iand
      // 0f1: i2b
      // 0f2: bastore
      // 0f3: aload 2
      // 0f4: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 0f7: astore 8
      // 0f9: aload 8
      // 0fb: invokevirtual java/net/InetAddress.getAddress ()[B
      // 0fe: astore 9
      // 100: bipush 0
      // 101: istore 10
      // 103: iload 10
      // 105: aload 9
      // 107: arraylength
      // 108: if_icmpge 12c
      // 10b: aload 6
      // 10d: iload 7
      // 10f: iinc 7 1
      // 112: aload 9
      // 114: iload 10
      // 116: baload
      // 117: bastore
      // 118: iinc 10 1
      // 11b: iload 5
      // 11d: ifne 159
      // 120: iload 5
      // 122: ifeq 103
      // 125: goto 12c
      // 128: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: goto 159
      // 12f: astore 8
      // 131: new com/finalshell/core/Pc2
      // 134: dup
      // 135: new java/lang/StringBuilder
      // 138: dup
      // 139: invokespecial java/lang/StringBuilder.<init> ()V
      // 13c: sipush -9918
      // 13f: sipush -20944
      // 142: invokestatic com/finalshell/core/R4.a (II)Ljava/lang/String;
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: aload 8
      // 14a: invokevirtual java/net/UnknownHostException.toString ()Ljava/lang/String;
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 153: aload 8
      // 155: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 158: athrow
      // 159: aload 0
      // 15a: iload 5
      // 15c: ifne 198
      // 15f: getfield com/finalshell/core/R4.z Ljava/lang/String;
      // 162: ifnull 18e
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield com/finalshell/core/R4.z Ljava/lang/String;
      // 170: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 173: bipush 0
      // 174: aload 6
      // 176: iload 7
      // 178: aload 0
      // 179: getfield com/finalshell/core/R4.z Ljava/lang/String;
      // 17c: invokevirtual java/lang/String.length ()I
      // 17f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 182: iload 7
      // 184: aload 0
      // 185: getfield com/finalshell/core/R4.z Ljava/lang/String;
      // 188: invokevirtual java/lang/String.length ()I
      // 18b: iadd
      // 18c: istore 7
      // 18e: aload 6
      // 190: iload 7
      // 192: iinc 7 1
      // 195: bipush 0
      // 196: bastore
      // 197: aload 0
      // 198: getfield com/finalshell/core/R4.U Ljava/io/OutputStream;
      // 19b: aload 6
      // 19d: bipush 0
      // 19e: iload 7
      // 1a0: invokevirtual java/io/OutputStream.write ([BII)V
      // 1a3: sipush 6431
      // 1a6: ldc2_w 4788815369241435030
      // 1a9: invokestatic com/finalshell/core/R4.a (IJ)I
      // 1ac: istore 8
      // 1ae: bipush 0
      // 1af: istore 9
      // 1b1: iload 9
      // 1b3: iload 8
      // 1b5: if_icmpge 208
      // 1b8: aload 0
      // 1b9: getfield com/finalshell/core/R4.Y Ljava/io/InputStream;
      // 1bc: aload 6
      // 1be: iload 9
      // 1c0: iload 8
      // 1c2: iload 9
      // 1c4: isub
      // 1c5: invokevirtual java/io/InputStream.read ([BII)I
      // 1c8: istore 10
      // 1ca: iload 10
      // 1cc: iload 5
      // 1ce: ifne 20c
      // 1d1: iload 5
      // 1d3: ifne 201
      // 1d6: goto 1dd
      // 1d9: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc: athrow
      // 1dd: ifgt 1fc
      // 1e0: goto 1e7
      // 1e3: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e6: athrow
      // 1e7: new com/finalshell/core/Pc2
      // 1ea: dup
      // 1eb: sipush -9917
      // 1ee: sipush 28201
      // 1f1: invokestatic com/finalshell/core/R4.a (II)Ljava/lang/String;
      // 1f4: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1f7: athrow
      // 1f8: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: iload 9
      // 1fe: iload 10
      // 200: iadd
      // 201: istore 9
      // 203: iload 5
      // 205: ifeq 1b1
      // 208: aload 6
      // 20a: bipush 0
      // 20b: baload
      // 20c: iload 5
      // 20e: ifne 248
      // 211: ifeq 244
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: new com/finalshell/core/Pc2
      // 21e: dup
      // 21f: new java/lang/StringBuilder
      // 222: dup
      // 223: invokespecial java/lang/StringBuilder.<init> ()V
      // 226: sipush -9915
      // 229: sipush 27248
      // 22c: invokestatic com/finalshell/core/R4.a (II)Ljava/lang/String;
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: aload 6
      // 234: bipush 0
      // 235: baload
      // 236: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 239: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23c: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 23f: athrow
      // 240: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: aload 6
      // 246: bipush 1
      // 247: baload
      // 248: sipush 29392
      // 24b: ldc2_w 2490926043583705179
      // 24e: invokestatic com/finalshell/core/R4.a (IJ)I
      // 251: if_icmpeq 289
      // 254: aload 0
      // 255: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 258: invokevirtual java/net/Socket.close ()V
      // 25b: goto 260
      // 25e: astore 10
      // 260: new java/lang/StringBuilder
      // 263: dup
      // 264: invokespecial java/lang/StringBuilder.<init> ()V
      // 267: sipush -9920
      // 26a: sipush 28585
      // 26d: invokestatic com/finalshell/core/R4.a (II)Ljava/lang/String;
      // 270: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 273: aload 6
      // 275: bipush 1
      // 276: baload
      // 277: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 27a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27d: astore 10
      // 27f: new com/finalshell/core/Pc2
      // 282: dup
      // 283: aload 10
      // 285: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 288: athrow
      // 289: goto 2e1
      // 28c: astore 6
      // 28e: aload 6
      // 290: athrow
      // 291: astore 6
      // 293: aload 0
      // 294: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 297: iload 5
      // 299: ifne 2b1
      // 29c: ifnull 2b4
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 2aa: goto 2b1
      // 2ad: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b0: athrow
      // 2b1: invokevirtual java/net/Socket.close ()V
      // 2b4: goto 2b9
      // 2b7: astore 7
      // 2b9: new com/finalshell/core/Pc2
      // 2bc: dup
      // 2bd: new java/lang/StringBuilder
      // 2c0: dup
      // 2c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c4: sipush -9919
      // 2c7: sipush -22629
      // 2ca: invokestatic com/finalshell/core/R4.a (II)Ljava/lang/String;
      // 2cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d0: aload 6
      // 2d2: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 2d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2db: aload 6
      // 2dd: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2e0: athrow
      // 2e1: return
   }

   @Override
   public InputStream R() {
      return this.Y;
   }

   @Override
   public OutputStream p() {
      return this.U;
   }

   @Override
   public Socket W() {
      return this.S;
   }

   @Override
   public void n() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 25
      // 09: getfield com/finalshell/core/R4.Y Ljava/io/InputStream;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/R4.Y Ljava/io/InputStream;
      // 1a: invokevirtual java/io/InputStream.close ()V
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: iload 1
      // 26: ifeq 45
      // 29: getfield com/finalshell/core/R4.U Ljava/io/OutputStream;
      // 2c: ifnull 44
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/finalshell/core/R4.U Ljava/io/OutputStream;
      // 3a: invokevirtual java/io/OutputStream.close ()V
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 48: iload 1
      // 49: ifeq 61
      // 4c: ifnull 64
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/R4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: invokevirtual java/net/Socket.close ()V
      // 64: goto 68
      // 67: astore 2
      // 68: aload 0
      // 69: aconst_null
      // 6a: putfield com/finalshell/core/R4.Y Ljava/io/InputStream;
      // 6d: aload 0
      // 6e: aconst_null
      // 6f: putfield com/finalshell/core/R4.U Ljava/io/OutputStream;
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield com/finalshell/core/R4.S Ljava/net/Socket;
      // 77: return
   }

   public static int m() {
      return m;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -9919) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 183;
               break;
            case 1:
               var10000 = 73;
               break;
            case 2:
               var10000 = 242;
               break;
            case 3:
               var10000 = 173;
               break;
            case 4:
               var10000 = 181;
               break;
            case 5:
               var10000 = 63;
               break;
            case 6:
               var10000 = 20;
               break;
            case 7:
               var10000 = 196;
               break;
            case 8:
               var10000 = 253;
               break;
            case 9:
               var10000 = 186;
               break;
            case 10:
               var10000 = 81;
               break;
            case 11:
               var10000 = 117;
               break;
            case 12:
               var10000 = 145;
               break;
            case 13:
               var10000 = 209;
               break;
            case 14:
               var10000 = 216;
               break;
            case 15:
               var10000 = 46;
               break;
            case 16:
               var10000 = 79;
               break;
            case 17:
               var10000 = 166;
               break;
            case 18:
               var10000 = 212;
               break;
            case 19:
               var10000 = 229;
               break;
            case 20:
               var10000 = 159;
               break;
            case 21:
               var10000 = 110;
               break;
            case 22:
               var10000 = 77;
               break;
            case 23:
               var10000 = 239;
               break;
            case 24:
               var10000 = 249;
               break;
            case 25:
               var10000 = 53;
               break;
            case 26:
               var10000 = 106;
               break;
            case 27:
               var10000 = 192;
               break;
            case 28:
               var10000 = 122;
               break;
            case 29:
               var10000 = 92;
               break;
            case 30:
               var10000 = 97;
               break;
            case 31:
               var10000 = 83;
               break;
            case 32:
               var10000 = 167;
               break;
            case 33:
               var10000 = 40;
               break;
            case 34:
               var10000 = 85;
               break;
            case 35:
               var10000 = 26;
               break;
            case 36:
               var10000 = 228;
               break;
            case 37:
               var10000 = 22;
               break;
            case 38:
               var10000 = 162;
               break;
            case 39:
               var10000 = 244;
               break;
            case 40:
               var10000 = 108;
               break;
            case 41:
               var10000 = 12;
               break;
            case 42:
               var10000 = 103;
               break;
            case 43:
               var10000 = 184;
               break;
            case 44:
               var10000 = 34;
               break;
            case 45:
               var10000 = 222;
               break;
            case 46:
               var10000 = 101;
               break;
            case 47:
               var10000 = 206;
               break;
            case 48:
               var10000 = 124;
               break;
            case 49:
               var10000 = 49;
               break;
            case 50:
               var10000 = 204;
               break;
            case 51:
               var10000 = 164;
               break;
            case 52:
               var10000 = 246;
               break;
            case 53:
               var10000 = 29;
               break;
            case 54:
               var10000 = 221;
               break;
            case 55:
               var10000 = 84;
               break;
            case 56:
               var10000 = 8;
               break;
            case 57:
               var10000 = 32;
               break;
            case 58:
               var10000 = 172;
               break;
            case 59:
               var10000 = 116;
               break;
            case 60:
               var10000 = 210;
               break;
            case 61:
               var10000 = 234;
               break;
            case 62:
               var10000 = 220;
               break;
            case 63:
               var10000 = 129;
               break;
            case 64:
               var10000 = 64;
               break;
            case 65:
               var10000 = 11;
               break;
            case 66:
               var10000 = 190;
               break;
            case 67:
               var10000 = 52;
               break;
            case 68:
               var10000 = 82;
               break;
            case 69:
               var10000 = 42;
               break;
            case 70:
               var10000 = 175;
               break;
            case 71:
               var10000 = 132;
               break;
            case 72:
               var10000 = 100;
               break;
            case 73:
               var10000 = 193;
               break;
            case 74:
               var10000 = 66;
               break;
            case 75:
               var10000 = 31;
               break;
            case 76:
               var10000 = 86;
               break;
            case 77:
               var10000 = 19;
               break;
            case 78:
               var10000 = 69;
               break;
            case 79:
               var10000 = 248;
               break;
            case 80:
               var10000 = 98;
               break;
            case 81:
               var10000 = 37;
               break;
            case 82:
               var10000 = 93;
               break;
            case 83:
               var10000 = 60;
               break;
            case 84:
               var10000 = 139;
               break;
            case 85:
               var10000 = 119;
               break;
            case 86:
               var10000 = 7;
               break;
            case 87:
               var10000 = 255;
               break;
            case 88:
               var10000 = 148;
               break;
            case 89:
               var10000 = 123;
               break;
            case 90:
               var10000 = 74;
               break;
            case 91:
               var10000 = 158;
               break;
            case 92:
               var10000 = 161;
               break;
            case 93:
               var10000 = 226;
               break;
            case 94:
               var10000 = 182;
               break;
            case 95:
               var10000 = 94;
               break;
            case 96:
               var10000 = 23;
               break;
            case 97:
               var10000 = 104;
               break;
            case 98:
               var10000 = 157;
               break;
            case 99:
               var10000 = 43;
               break;
            case 100:
               var10000 = 13;
               break;
            case 101:
               var10000 = 109;
               break;
            case 102:
               var10000 = 99;
               break;
            case 103:
               var10000 = 133;
               break;
            case 104:
               var10000 = 223;
               break;
            case 105:
               var10000 = 130;
               break;
            case 106:
               var10000 = 138;
               break;
            case 107:
               var10000 = 243;
               break;
            case 108:
               var10000 = 90;
               break;
            case 109:
               var10000 = 176;
               break;
            case 110:
               var10000 = 152;
               break;
            case 111:
               var10000 = 120;
               break;
            case 112:
               var10000 = 88;
               break;
            case 113:
               var10000 = 36;
               break;
            case 114:
               var10000 = 178;
               break;
            case 115:
               var10000 = 72;
               break;
            case 116:
               var10000 = 224;
               break;
            case 117:
               var10000 = 27;
               break;
            case 118:
               var10000 = 140;
               break;
            case 119:
               var10000 = 33;
               break;
            case 120:
               var10000 = 189;
               break;
            case 121:
               var10000 = 125;
               break;
            case 122:
               var10000 = 197;
               break;
            case 123:
               var10000 = 174;
               break;
            case 124:
               var10000 = 218;
               break;
            case 125:
               var10000 = 217;
               break;
            case 126:
               var10000 = 78;
               break;
            case 127:
               var10000 = 28;
               break;
            case 128:
               var10000 = 219;
               break;
            case 129:
               var10000 = 230;
               break;
            case 130:
               var10000 = 56;
               break;
            case 131:
               var10000 = 95;
               break;
            case 132:
               var10000 = 163;
               break;
            case 133:
               var10000 = 146;
               break;
            case 134:
               var10000 = 165;
               break;
            case 135:
               var10000 = 136;
               break;
            case 136:
               var10000 = 141;
               break;
            case 137:
               var10000 = 179;
               break;
            case 138:
               var10000 = 65;
               break;
            case 139:
               var10000 = 55;
               break;
            case 140:
               var10000 = 142;
               break;
            case 141:
               var10000 = 18;
               break;
            case 142:
               var10000 = 102;
               break;
            case 143:
               var10000 = 15;
               break;
            case 144:
               var10000 = 59;
               break;
            case 145:
               var10000 = 105;
               break;
            case 146:
               var10000 = 121;
               break;
            case 147:
               var10000 = 71;
               break;
            case 148:
               var10000 = 171;
               break;
            case 149:
               var10000 = 235;
               break;
            case 150:
               var10000 = 54;
               break;
            case 151:
               var10000 = 251;
               break;
            case 152:
               var10000 = 17;
               break;
            case 153:
               var10000 = 245;
               break;
            case 154:
               var10000 = 68;
               break;
            case 155:
               var10000 = 199;
               break;
            case 156:
               var10000 = 113;
               break;
            case 157:
               var10000 = 4;
               break;
            case 158:
               var10000 = 169;
               break;
            case 159:
               var10000 = 237;
               break;
            case 160:
               var10000 = 247;
               break;
            case 161:
               var10000 = 9;
               break;
            case 162:
               var10000 = 185;
               break;
            case 163:
               var10000 = 89;
               break;
            case 164:
               var10000 = 39;
               break;
            case 165:
               var10000 = 111;
               break;
            case 166:
               var10000 = 207;
               break;
            case 167:
               var10000 = 45;
               break;
            case 168:
               var10000 = 57;
               break;
            case 169:
               var10000 = 126;
               break;
            case 170:
               var10000 = 213;
               break;
            case 171:
               var10000 = 21;
               break;
            case 172:
               var10000 = 241;
               break;
            case 173:
               var10000 = 160;
               break;
            case 174:
               var10000 = 177;
               break;
            case 175:
               var10000 = 128;
               break;
            case 176:
               var10000 = 195;
               break;
            case 177:
               var10000 = 96;
               break;
            case 178:
               var10000 = 76;
               break;
            case 179:
               var10000 = 153;
               break;
            case 180:
               var10000 = 44;
               break;
            case 181:
               var10000 = 188;
               break;
            case 182:
               var10000 = 16;
               break;
            case 183:
               var10000 = 191;
               break;
            case 184:
               var10000 = 62;
               break;
            case 185:
               var10000 = 134;
               break;
            case 186:
               var10000 = 61;
               break;
            case 187:
               var10000 = 240;
               break;
            case 188:
               var10000 = 144;
               break;
            case 189:
               var10000 = 252;
               break;
            case 190:
               var10000 = 254;
               break;
            case 191:
               var10000 = 50;
               break;
            case 192:
               var10000 = 151;
               break;
            case 193:
               var10000 = 127;
               break;
            case 194:
               var10000 = 201;
               break;
            case 195:
               var10000 = 232;
               break;
            case 196:
               var10000 = 200;
               break;
            case 197:
               var10000 = 143;
               break;
            case 198:
               var10000 = 156;
               break;
            case 199:
               var10000 = 150;
               break;
            case 200:
               var10000 = 47;
               break;
            case 201:
               var10000 = 215;
               break;
            case 202:
               var10000 = 194;
               break;
            case 203:
               var10000 = 3;
               break;
            case 204:
               var10000 = 154;
               break;
            case 205:
               var10000 = 107;
               break;
            case 206:
               var10000 = 67;
               break;
            case 207:
               var10000 = 149;
               break;
            case 208:
               var10000 = 155;
               break;
            case 209:
               var10000 = 147;
               break;
            case 210:
               var10000 = 24;
               break;
            case 211:
               var10000 = 205;
               break;
            case 212:
               var10000 = 211;
               break;
            case 213:
               var10000 = 187;
               break;
            case 214:
               var10000 = 233;
               break;
            case 215:
               var10000 = 6;
               break;
            case 216:
               var10000 = 48;
               break;
            case 217:
               var10000 = 51;
               break;
            case 218:
               var10000 = 231;
               break;
            case 219:
               var10000 = 10;
               break;
            case 220:
               var10000 = 170;
               break;
            case 221:
               var10000 = 203;
               break;
            case 222:
               var10000 = 214;
               break;
            case 223:
               var10000 = 14;
               break;
            case 224:
               var10000 = 25;
               break;
            case 225:
               var10000 = 58;
               break;
            case 226:
               var10000 = 198;
               break;
            case 227:
               var10000 = 118;
               break;
            case 228:
               var10000 = 5;
               break;
            case 229:
               var10000 = 80;
               break;
            case 230:
               var10000 = 180;
               break;
            case 231:
               var10000 = 2;
               break;
            case 232:
               var10000 = 1;
               break;
            case 233:
               var10000 = 137;
               break;
            case 234:
               var10000 = 115;
               break;
            case 235:
               var10000 = 70;
               break;
            case 236:
               var10000 = 41;
               break;
            case 237:
               var10000 = 250;
               break;
            case 238:
               var10000 = 35;
               break;
            case 239:
               var10000 = 0;
               break;
            case 240:
               var10000 = 208;
               break;
            case 241:
               var10000 = 112;
               break;
            case 242:
               var10000 = 227;
               break;
            case 243:
               var10000 = 135;
               break;
            case 244:
               var10000 = 131;
               break;
            case 245:
               var10000 = 75;
               break;
            case 246:
               var10000 = 30;
               break;
            case 247:
               var10000 = 225;
               break;
            case 248:
               var10000 = 114;
               break;
            case 249:
               var10000 = 87;
               break;
            case 250:
               var10000 = 91;
               break;
            case 251:
               var10000 = 38;
               break;
            case 252:
               var10000 = 236;
               break;
            case 253:
               var10000 = 202;
               break;
            case 254:
               var10000 = 168;
               break;
            default:
               var10000 = 238;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 655;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = " Sï\u0016#¦B Í¢\u0097r \u001fzc¤\u0010Jfo8h¡#\u0012¶s\u0019iBL§ \u0085Ë\u0090\u001b¢ó[Â»P¢\u001d\u0084\u0088{m±É\u0010Í\u0087\u001fÞÅ\t\u0089ÿ6¾£VY\\ò\u0087þ\u0080\u009aÂ\u008b¯";
      int var12 = " Sï\u0016#¦B Í¢\u0097r \u001fzc¤\u0010Jfo8h¡#\u0012¶s\u0019iBL§ \u0085Ë\u0090\u001b¢ó[Â»P¢\u001d\u0084\u0088{m±É\u0010Í\u0087\u001fÞÅ\t\u0089ÿ6¾£VY\\ò\u0087þ\u0080\u009aÂ\u008b¯"
         .length();
      char var9 = '\r';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 40;
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
                        var65 = 79;
                        break;
                     case 1:
                        var65 = 42;
                        break;
                     case 2:
                        var65 = 26;
                        break;
                     case 3:
                        var65 = 80;
                        break;
                     case 4:
                        var65 = 75;
                        break;
                     case 5:
                        var65 = 103;
                        break;
                     default:
                        var65 = 123;
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
                     a = var13;
                     b = new String[5];
                     long var0 = 3669384240434075387L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "éñÿæ.Ñc\u0086gGx</\u0004K+£Ñ?IÀOÞ\u0082\u009dfô\u0012\u0018Z=\u0089ö»\u000b:\u0086î&úl¥àá%\u009a¶ð";
                     int var5 = "éñÿæ.Ñc\u0086gGx</\u0004K+£Ñ?IÀOÞ\u0082\u009dfô\u0012\u0018Z=\u0089ö»\u000b:\u0086î&úl¥àá%\u009a¶ð".length();
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
                                    e = new Integer[8];
                                    m = a(3788, 98066710224079937L);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "-¨ËÇAìMeù\u0005\nE\u0098HÎ£";
                                 var5 = "-¨ËÇAìMeù\u0005\nE\u0098HÎ£".length();
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

                  var10 = "<ý¸\u0017\u001dRQj{?\u0095\u0015´\u001fI\u0004\u0016(Èµë\u0096, \u007fæé9&ôq+\u0015\u0018\u0007\u0018\u0014µæò\u00076ñ\u0010\u0088";
                  var12 = "<ý¸\u0017\u001dRQj{?\u0095\u0015´\u001fI\u0004\u0016(Èµë\u0096, \u007fæé9&ôq+\u0015\u0018\u0007\u0018\u0014µæò\u00076ñ\u0010\u0088"
                     .length();
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 62;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





