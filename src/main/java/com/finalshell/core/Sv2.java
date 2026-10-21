package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Sv2 implements Ic4 {
   public static int M;
   public String K;
   public int w;
   public InputStream W;
   public OutputStream z;
   public Socket b;
   public String F;
   public String E;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public Sv2(String var1) {
      boolean var10000 = Dm4.J$boolean();
      int var3 = M;
      boolean var2 = var10000;
      String var4 = var1;

      label24: {
         try {
            if (var2) {
               return;
            }

            if (var1.indexOf(a(13397, 3928891083685148203L)) == -1) {
               break label24;
            }
         } catch (Exception var7) {
            throw a(var7);
         }

         try {
            var4 = var1.substring(0, var1.indexOf(a(13766, 1202850148829673403L)));
            var3 = Integer.parseInt(var1.substring(var1.indexOf(a(13766, 1202850148829673403L)) + 1));
         } catch (Exception var6) {
         }
      }

      this.K = var4;
      this.w = var3;
   }

   public Sv2(String var1, int var2) {
      this.K = var1;
      this.w = var2;
   }

   public void x(String var1, String var2) {
      this.F = var1;
      this.E = var2;
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
      // 011: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 0
      // 016: aload 0
      // 017: getfield com/finalshell/core/Sv2.K Ljava/lang/String;
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/Sv2.w I
      // 01e: iload 4
      // 020: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 023: putfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 026: aload 0
      // 027: aload 0
      // 028: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 02b: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 02e: putfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 031: aload 0
      // 032: aload 0
      // 033: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 036: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 039: putfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 03c: iload 5
      // 03e: ifeq 07d
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: aload 1
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/Sv2.K Ljava/lang/String;
      // 04e: aload 0
      // 04f: getfield com/finalshell/core/Sv2.w I
      // 052: invokeinterface com/finalshell/core/PJ3.y (Ljava/lang/String;I)Ljava/net/Socket; 3
      // 057: putfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 05a: aload 0
      // 05b: aload 1
      // 05c: aload 0
      // 05d: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 060: invokeinterface com/finalshell/core/PJ3.j (Ljava/net/Socket;)Ljava/io/InputStream; 2
      // 065: putfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 0
      // 070: aload 1
      // 071: aload 0
      // 072: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 075: invokeinterface com/finalshell/core/PJ3.P (Ljava/net/Socket;)Ljava/io/OutputStream; 2
      // 07a: putfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 07d: iload 4
      // 07f: iload 5
      // 081: ifne 0af
      // 084: ifle 09e
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 092: iload 4
      // 094: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 0a2: bipush 1
      // 0a3: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 0a6: sipush 10919
      // 0a9: ldc2_w 1055513406020954334
      // 0ac: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 0af: newarray 8
      // 0b1: astore 6
      // 0b3: bipush 0
      // 0b4: istore 7
      // 0b6: aload 6
      // 0b8: iload 7
      // 0ba: iinc 7 1
      // 0bd: bipush 5
      // 0be: bastore
      // 0bf: aload 6
      // 0c1: iload 7
      // 0c3: iinc 7 1
      // 0c6: bipush 2
      // 0c7: bastore
      // 0c8: aload 6
      // 0ca: iload 7
      // 0cc: iinc 7 1
      // 0cf: bipush 0
      // 0d0: bastore
      // 0d1: aload 6
      // 0d3: iload 7
      // 0d5: iinc 7 1
      // 0d8: bipush 2
      // 0d9: bastore
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 0de: aload 6
      // 0e0: bipush 0
      // 0e1: iload 7
      // 0e3: invokevirtual java/io/OutputStream.write ([BII)V
      // 0e6: aload 0
      // 0e7: aload 0
      // 0e8: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 0eb: aload 6
      // 0ed: bipush 2
      // 0ee: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 0f1: bipush 0
      // 0f2: istore 8
      // 0f4: aload 6
      // 0f6: bipush 1
      // 0f7: baload
      // 0f8: sipush 21457
      // 0fb: ldc2_w 2937436654621348269
      // 0fe: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 101: iand
      // 102: iload 5
      // 104: ifne 20e
      // 107: lookupswitch 261 2 0 29 2 37
      // 120: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: bipush 1
      // 125: istore 8
      // 127: iload 5
      // 129: ifeq 20c
      // 12c: aload 0
      // 12d: getfield com/finalshell/core/Sv2.F Ljava/lang/String;
      // 130: iload 5
      // 132: ifne 151
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: ifnull 20c
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: aload 0
      // 147: getfield com/finalshell/core/Sv2.E Ljava/lang/String;
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: iload 5
      // 153: ifne 1be
      // 156: ifnonnull 16c
      // 159: goto 160
      // 15c: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: iload 5
      // 162: ifeq 20c
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: bipush 0
      // 16d: istore 7
      // 16f: aload 6
      // 171: iload 7
      // 173: iinc 7 1
      // 176: bipush 1
      // 177: bastore
      // 178: aload 6
      // 17a: iload 7
      // 17c: iinc 7 1
      // 17f: aload 0
      // 180: getfield com/finalshell/core/Sv2.F Ljava/lang/String;
      // 183: invokevirtual java/lang/String.length ()I
      // 186: i2b
      // 187: bastore
      // 188: aload 0
      // 189: getfield com/finalshell/core/Sv2.F Ljava/lang/String;
      // 18c: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 18f: bipush 0
      // 190: aload 6
      // 192: iload 7
      // 194: aload 0
      // 195: getfield com/finalshell/core/Sv2.F Ljava/lang/String;
      // 198: invokevirtual java/lang/String.length ()I
      // 19b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 19e: iload 7
      // 1a0: aload 0
      // 1a1: getfield com/finalshell/core/Sv2.F Ljava/lang/String;
      // 1a4: invokevirtual java/lang/String.length ()I
      // 1a7: iadd
      // 1a8: istore 7
      // 1aa: aload 6
      // 1ac: iload 7
      // 1ae: iinc 7 1
      // 1b1: aload 0
      // 1b2: getfield com/finalshell/core/Sv2.E Ljava/lang/String;
      // 1b5: invokevirtual java/lang/String.length ()I
      // 1b8: i2b
      // 1b9: bastore
      // 1ba: aload 0
      // 1bb: getfield com/finalshell/core/Sv2.E Ljava/lang/String;
      // 1be: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 1c1: bipush 0
      // 1c2: aload 6
      // 1c4: iload 7
      // 1c6: aload 0
      // 1c7: getfield com/finalshell/core/Sv2.E Ljava/lang/String;
      // 1ca: invokevirtual java/lang/String.length ()I
      // 1cd: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1d0: iload 7
      // 1d2: aload 0
      // 1d3: getfield com/finalshell/core/Sv2.E Ljava/lang/String;
      // 1d6: invokevirtual java/lang/String.length ()I
      // 1d9: iadd
      // 1da: istore 7
      // 1dc: aload 0
      // 1dd: getfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 1e0: aload 6
      // 1e2: bipush 0
      // 1e3: iload 7
      // 1e5: invokevirtual java/io/OutputStream.write ([BII)V
      // 1e8: aload 0
      // 1e9: aload 0
      // 1ea: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 1ed: aload 6
      // 1ef: bipush 2
      // 1f0: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 1f3: aload 6
      // 1f5: bipush 1
      // 1f6: baload
      // 1f7: iload 5
      // 1f9: ifne 20e
      // 1fc: ifne 20c
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: bipush 1
      // 207: istore 8
      // 209: goto 20c
      // 20c: iload 8
      // 20e: iload 5
      // 210: ifne 23b
      // 213: ifne 23a
      // 216: goto 21d
      // 219: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: aload 0
      // 21e: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 221: invokevirtual java/net/Socket.close ()V
      // 224: goto 229
      // 227: astore 9
      // 229: new com/finalshell/core/Pc2
      // 22c: dup
      // 22d: sipush -29566
      // 230: sipush 3117
      // 233: invokestatic com/finalshell/core/Sv2.a (II)Ljava/lang/String;
      // 236: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 239: athrow
      // 23a: bipush 0
      // 23b: istore 7
      // 23d: aload 6
      // 23f: iload 7
      // 241: iinc 7 1
      // 244: bipush 5
      // 245: bastore
      // 246: aload 6
      // 248: iload 7
      // 24a: iinc 7 1
      // 24d: bipush 1
      // 24e: bastore
      // 24f: aload 6
      // 251: iload 7
      // 253: iinc 7 1
      // 256: bipush 0
      // 257: bastore
      // 258: aload 2
      // 259: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 25c: astore 9
      // 25e: aload 9
      // 260: arraylength
      // 261: istore 10
      // 263: aload 6
      // 265: iload 7
      // 267: iinc 7 1
      // 26a: bipush 3
      // 26b: bastore
      // 26c: aload 6
      // 26e: iload 7
      // 270: iinc 7 1
      // 273: iload 10
      // 275: i2b
      // 276: bastore
      // 277: aload 9
      // 279: bipush 0
      // 27a: aload 6
      // 27c: iload 7
      // 27e: iload 10
      // 280: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 283: iload 7
      // 285: iload 10
      // 287: iadd
      // 288: istore 7
      // 28a: aload 6
      // 28c: iload 7
      // 28e: iinc 7 1
      // 291: iload 3
      // 292: sipush 17648
      // 295: ldc2_w 7103509481572746885
      // 298: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 29b: iushr
      // 29c: i2b
      // 29d: bastore
      // 29e: aload 6
      // 2a0: iload 7
      // 2a2: iinc 7 1
      // 2a5: iload 3
      // 2a6: sipush 1833
      // 2a9: ldc2_w 3226222039280190801
      // 2ac: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 2af: iand
      // 2b0: i2b
      // 2b1: bastore
      // 2b2: aload 0
      // 2b3: getfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 2b6: aload 6
      // 2b8: bipush 0
      // 2b9: iload 7
      // 2bb: invokevirtual java/io/OutputStream.write ([BII)V
      // 2be: aload 0
      // 2bf: aload 0
      // 2c0: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 2c3: aload 6
      // 2c5: bipush 4
      // 2c6: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 2c9: aload 6
      // 2cb: bipush 1
      // 2cc: baload
      // 2cd: iload 5
      // 2cf: ifne 31b
      // 2d2: ifeq 30d
      // 2d5: goto 2dc
      // 2d8: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: aload 0
      // 2dd: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 2e0: invokevirtual java/net/Socket.close ()V
      // 2e3: goto 2e8
      // 2e6: astore 11
      // 2e8: new com/finalshell/core/Pc2
      // 2eb: dup
      // 2ec: new java/lang/StringBuilder
      // 2ef: dup
      // 2f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f3: sipush -29568
      // 2f6: sipush -31990
      // 2f9: invokestatic com/finalshell/core/Sv2.a (II)Ljava/lang/String;
      // 2fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ff: aload 6
      // 301: bipush 1
      // 302: baload
      // 303: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 306: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 309: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 30c: athrow
      // 30d: aload 6
      // 30f: bipush 3
      // 310: baload
      // 311: sipush 1833
      // 314: ldc2_w 3226222039280190801
      // 317: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 31a: iand
      // 31b: tableswitch 135 1 4 29 135 60 109
      // 338: aload 0
      // 339: aload 0
      // 33a: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 33d: aload 6
      // 33f: sipush 335
      // 342: ldc2_w 781873340181054256
      // 345: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 348: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 34b: iload 5
      // 34d: ifeq 3a2
      // 350: goto 357
      // 353: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 356: athrow
      // 357: aload 0
      // 358: aload 0
      // 359: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 35c: aload 6
      // 35e: bipush 1
      // 35f: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 362: aload 0
      // 363: aload 0
      // 364: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 367: aload 6
      // 369: aload 6
      // 36b: bipush 0
      // 36c: baload
      // 36d: sipush 1833
      // 370: ldc2_w 3226222039280190801
      // 373: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 376: iand
      // 377: bipush 2
      // 378: iadd
      // 379: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 37c: iload 5
      // 37e: ifeq 3a2
      // 381: goto 388
      // 384: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 387: athrow
      // 388: aload 0
      // 389: aload 0
      // 38a: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 38d: aload 6
      // 38f: sipush 9044
      // 392: ldc2_w 5515605955177259311
      // 395: invokestatic com/finalshell/core/Sv2.a (IJ)I
      // 398: invokespecial com/finalshell/core/Sv2.w (Ljava/io/InputStream;[BI)V
      // 39b: goto 3a2
      // 39e: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a1: athrow
      // 3a2: goto 3fe
      // 3a5: astore 6
      // 3a7: aload 6
      // 3a9: athrow
      // 3aa: astore 6
      // 3ac: aload 0
      // 3ad: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 3b0: iload 5
      // 3b2: ifne 3ca
      // 3b5: ifnull 3cd
      // 3b8: goto 3bf
      // 3bb: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3be: athrow
      // 3bf: aload 0
      // 3c0: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 3c3: goto 3ca
      // 3c6: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c9: athrow
      // 3ca: invokevirtual java/net/Socket.close ()V
      // 3cd: goto 3d2
      // 3d0: astore 7
      // 3d2: new java/lang/StringBuilder
      // 3d5: dup
      // 3d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d9: sipush -29567
      // 3dc: sipush 19946
      // 3df: invokestatic com/finalshell/core/Sv2.a (II)Ljava/lang/String;
      // 3e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e5: aload 6
      // 3e7: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 3ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f0: astore 7
      // 3f2: new com/finalshell/core/Pc2
      // 3f5: dup
      // 3f6: aload 7
      // 3f8: aload 6
      // 3fa: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3fd: athrow
      // 3fe: return
   }

   @Override
   public InputStream R() {
      return this.W;
   }

   @Override
   public OutputStream p() {
      return this.z;
   }

   @Override
   public Socket W() {
      return this.b;
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
      // 09: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 1a: invokevirtual java/io/InputStream.close ()V
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: iload 1
      // 26: ifeq 45
      // 29: getfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 2c: ifnull 44
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 3a: invokevirtual java/io/OutputStream.close ()V
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 48: iload 1
      // 49: ifeq 61
      // 4c: ifnull 64
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: invokevirtual java/net/Socket.close ()V
      // 64: goto 68
      // 67: astore 2
      // 68: aload 0
      // 69: aconst_null
      // 6a: putfield com/finalshell/core/Sv2.W Ljava/io/InputStream;
      // 6d: aload 0
      // 6e: aconst_null
      // 6f: putfield com/finalshell/core/Sv2.z Ljava/io/OutputStream;
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield com/finalshell/core/Sv2.b Ljava/net/Socket;
      // 77: return
   }

   public static int z() {
      return M;
   }

   public void w(InputStream param1, byte[] param2, int param3) throws Pc2, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: bipush 0
      // 04: istore 5
      // 06: istore 4
      // 08: iload 5
      // 0a: iload 3
      // 0b: if_icmpge 4d
      // 0e: aload 1
      // 0f: aload 2
      // 10: iload 5
      // 12: iload 3
      // 13: iload 5
      // 15: isub
      // 16: invokevirtual java/io/InputStream.read ([BII)I
      // 19: istore 6
      // 1b: iload 6
      // 1d: iload 4
      // 1f: ifeq 46
      // 22: ifgt 41
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: new com/finalshell/core/Pc2
      // 2f: dup
      // 30: sipush -29565
      // 33: sipush 27745
      // 36: invokestatic com/finalshell/core/Sv2.a (II)Ljava/lang/String;
      // 39: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic com/finalshell/core/Sv2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: iload 5
      // 43: iload 6
      // 45: iadd
      // 46: istore 5
      // 48: iload 4
      // 4a: ifne 08
      // 4d: return
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -29567) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 58;
               break;
            case 1:
               var10000 = 107;
               break;
            case 2:
               var10000 = 111;
               break;
            case 3:
               var10000 = 159;
               break;
            case 4:
               var10000 = 216;
               break;
            case 5:
               var10000 = 149;
               break;
            case 6:
               var10000 = 18;
               break;
            case 7:
               var10000 = 255;
               break;
            case 8:
               var10000 = 60;
               break;
            case 9:
               var10000 = 86;
               break;
            case 10:
               var10000 = 73;
               break;
            case 11:
               var10000 = 87;
               break;
            case 12:
               var10000 = 3;
               break;
            case 13:
               var10000 = 246;
               break;
            case 14:
               var10000 = 252;
               break;
            case 15:
               var10000 = 88;
               break;
            case 16:
               var10000 = 19;
               break;
            case 17:
               var10000 = 57;
               break;
            case 18:
               var10000 = 71;
               break;
            case 19:
               var10000 = 10;
               break;
            case 20:
               var10000 = 166;
               break;
            case 21:
               var10000 = 160;
               break;
            case 22:
               var10000 = 53;
               break;
            case 23:
               var10000 = 92;
               break;
            case 24:
               var10000 = 236;
               break;
            case 25:
               var10000 = 232;
               break;
            case 26:
               var10000 = 191;
               break;
            case 27:
               var10000 = 99;
               break;
            case 28:
               var10000 = 0;
               break;
            case 29:
               var10000 = 119;
               break;
            case 30:
               var10000 = 176;
               break;
            case 31:
               var10000 = 42;
               break;
            case 32:
               var10000 = 251;
               break;
            case 33:
               var10000 = 1;
               break;
            case 34:
               var10000 = 190;
               break;
            case 35:
               var10000 = 209;
               break;
            case 36:
               var10000 = 169;
               break;
            case 37:
               var10000 = 231;
               break;
            case 38:
               var10000 = 242;
               break;
            case 39:
               var10000 = 68;
               break;
            case 40:
               var10000 = 161;
               break;
            case 41:
               var10000 = 172;
               break;
            case 42:
               var10000 = 165;
               break;
            case 43:
               var10000 = 189;
               break;
            case 44:
               var10000 = 41;
               break;
            case 45:
               var10000 = 16;
               break;
            case 46:
               var10000 = 250;
               break;
            case 47:
               var10000 = 182;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 11;
               break;
            case 50:
               var10000 = 69;
               break;
            case 51:
               var10000 = 198;
               break;
            case 52:
               var10000 = 8;
               break;
            case 53:
               var10000 = 244;
               break;
            case 54:
               var10000 = 215;
               break;
            case 55:
               var10000 = 222;
               break;
            case 56:
               var10000 = 217;
               break;
            case 57:
               var10000 = 126;
               break;
            case 58:
               var10000 = 143;
               break;
            case 59:
               var10000 = 130;
               break;
            case 60:
               var10000 = 43;
               break;
            case 61:
               var10000 = 108;
               break;
            case 62:
               var10000 = 225;
               break;
            case 63:
               var10000 = 102;
               break;
            case 64:
               var10000 = 66;
               break;
            case 65:
               var10000 = 20;
               break;
            case 66:
               var10000 = 214;
               break;
            case 67:
               var10000 = 78;
               break;
            case 68:
               var10000 = 194;
               break;
            case 69:
               var10000 = 115;
               break;
            case 70:
               var10000 = 13;
               break;
            case 71:
               var10000 = 179;
               break;
            case 72:
               var10000 = 206;
               break;
            case 73:
               var10000 = 31;
               break;
            case 74:
               var10000 = 103;
               break;
            case 75:
               var10000 = 192;
               break;
            case 76:
               var10000 = 140;
               break;
            case 77:
               var10000 = 15;
               break;
            case 78:
               var10000 = 21;
               break;
            case 79:
               var10000 = 207;
               break;
            case 80:
               var10000 = 147;
               break;
            case 81:
               var10000 = 77;
               break;
            case 82:
               var10000 = 138;
               break;
            case 83:
               var10000 = 89;
               break;
            case 84:
               var10000 = 148;
               break;
            case 85:
               var10000 = 241;
               break;
            case 86:
               var10000 = 98;
               break;
            case 87:
               var10000 = 205;
               break;
            case 88:
               var10000 = 39;
               break;
            case 89:
               var10000 = 101;
               break;
            case 90:
               var10000 = 29;
               break;
            case 91:
               var10000 = 96;
               break;
            case 92:
               var10000 = 163;
               break;
            case 93:
               var10000 = 24;
               break;
            case 94:
               var10000 = 178;
               break;
            case 95:
               var10000 = 46;
               break;
            case 96:
               var10000 = 5;
               break;
            case 97:
               var10000 = 121;
               break;
            case 98:
               var10000 = 67;
               break;
            case 99:
               var10000 = 139;
               break;
            case 100:
               var10000 = 45;
               break;
            case 101:
               var10000 = 180;
               break;
            case 102:
               var10000 = 105;
               break;
            case 103:
               var10000 = 133;
               break;
            case 104:
               var10000 = 65;
               break;
            case 105:
               var10000 = 85;
               break;
            case 106:
               var10000 = 158;
               break;
            case 107:
               var10000 = 104;
               break;
            case 108:
               var10000 = 25;
               break;
            case 109:
               var10000 = 240;
               break;
            case 110:
               var10000 = 226;
               break;
            case 111:
               var10000 = 62;
               break;
            case 112:
               var10000 = 167;
               break;
            case 113:
               var10000 = 245;
               break;
            case 114:
               var10000 = 28;
               break;
            case 115:
               var10000 = 173;
               break;
            case 116:
               var10000 = 184;
               break;
            case 117:
               var10000 = 70;
               break;
            case 118:
               var10000 = 224;
               break;
            case 119:
               var10000 = 4;
               break;
            case 120:
               var10000 = 76;
               break;
            case 121:
               var10000 = 95;
               break;
            case 122:
               var10000 = 131;
               break;
            case 123:
               var10000 = 202;
               break;
            case 124:
               var10000 = 44;
               break;
            case 125:
               var10000 = 208;
               break;
            case 126:
               var10000 = 219;
               break;
            case 127:
               var10000 = 83;
               break;
            case 128:
               var10000 = 247;
               break;
            case 129:
               var10000 = 120;
               break;
            case 130:
               var10000 = 145;
               break;
            case 131:
               var10000 = 116;
               break;
            case 132:
               var10000 = 174;
               break;
            case 133:
               var10000 = 51;
               break;
            case 134:
               var10000 = 6;
               break;
            case 135:
               var10000 = 48;
               break;
            case 136:
               var10000 = 34;
               break;
            case 137:
               var10000 = 14;
               break;
            case 138:
               var10000 = 170;
               break;
            case 139:
               var10000 = 7;
               break;
            case 140:
               var10000 = 144;
               break;
            case 141:
               var10000 = 155;
               break;
            case 142:
               var10000 = 110;
               break;
            case 143:
               var10000 = 82;
               break;
            case 144:
               var10000 = 128;
               break;
            case 145:
               var10000 = 193;
               break;
            case 146:
               var10000 = 72;
               break;
            case 147:
               var10000 = 221;
               break;
            case 148:
               var10000 = 56;
               break;
            case 149:
               var10000 = 183;
               break;
            case 150:
               var10000 = 220;
               break;
            case 151:
               var10000 = 122;
               break;
            case 152:
               var10000 = 235;
               break;
            case 153:
               var10000 = 64;
               break;
            case 154:
               var10000 = 162;
               break;
            case 155:
               var10000 = 204;
               break;
            case 156:
               var10000 = 30;
               break;
            case 157:
               var10000 = 243;
               break;
            case 158:
               var10000 = 177;
               break;
            case 159:
               var10000 = 237;
               break;
            case 160:
               var10000 = 90;
               break;
            case 161:
               var10000 = 195;
               break;
            case 162:
               var10000 = 118;
               break;
            case 163:
               var10000 = 218;
               break;
            case 164:
               var10000 = 134;
               break;
            case 165:
               var10000 = 63;
               break;
            case 166:
               var10000 = 97;
               break;
            case 167:
               var10000 = 142;
               break;
            case 168:
               var10000 = 132;
               break;
            case 169:
               var10000 = 164;
               break;
            case 170:
               var10000 = 74;
               break;
            case 171:
               var10000 = 125;
               break;
            case 172:
               var10000 = 93;
               break;
            case 173:
               var10000 = 188;
               break;
            case 174:
               var10000 = 152;
               break;
            case 175:
               var10000 = 9;
               break;
            case 176:
               var10000 = 127;
               break;
            case 177:
               var10000 = 114;
               break;
            case 178:
               var10000 = 27;
               break;
            case 179:
               var10000 = 135;
               break;
            case 180:
               var10000 = 112;
               break;
            case 181:
               var10000 = 38;
               break;
            case 182:
               var10000 = 186;
               break;
            case 183:
               var10000 = 171;
               break;
            case 184:
               var10000 = 146;
               break;
            case 185:
               var10000 = 175;
               break;
            case 186:
               var10000 = 113;
               break;
            case 187:
               var10000 = 22;
               break;
            case 188:
               var10000 = 81;
               break;
            case 189:
               var10000 = 196;
               break;
            case 190:
               var10000 = 153;
               break;
            case 191:
               var10000 = 254;
               break;
            case 192:
               var10000 = 49;
               break;
            case 193:
               var10000 = 181;
               break;
            case 194:
               var10000 = 55;
               break;
            case 195:
               var10000 = 106;
               break;
            case 196:
               var10000 = 185;
               break;
            case 197:
               var10000 = 203;
               break;
            case 198:
               var10000 = 124;
               break;
            case 199:
               var10000 = 79;
               break;
            case 200:
               var10000 = 47;
               break;
            case 201:
               var10000 = 91;
               break;
            case 202:
               var10000 = 228;
               break;
            case 203:
               var10000 = 50;
               break;
            case 204:
               var10000 = 94;
               break;
            case 205:
               var10000 = 150;
               break;
            case 206:
               var10000 = 234;
               break;
            case 207:
               var10000 = 157;
               break;
            case 208:
               var10000 = 123;
               break;
            case 209:
               var10000 = 151;
               break;
            case 210:
               var10000 = 253;
               break;
            case 211:
               var10000 = 197;
               break;
            case 212:
               var10000 = 156;
               break;
            case 213:
               var10000 = 54;
               break;
            case 214:
               var10000 = 84;
               break;
            case 215:
               var10000 = 187;
               break;
            case 216:
               var10000 = 61;
               break;
            case 217:
               var10000 = 36;
               break;
            case 218:
               var10000 = 52;
               break;
            case 219:
               var10000 = 32;
               break;
            case 220:
               var10000 = 227;
               break;
            case 221:
               var10000 = 210;
               break;
            case 222:
               var10000 = 212;
               break;
            case 223:
               var10000 = 35;
               break;
            case 224:
               var10000 = 37;
               break;
            case 225:
               var10000 = 80;
               break;
            case 226:
               var10000 = 26;
               break;
            case 227:
               var10000 = 230;
               break;
            case 228:
               var10000 = 211;
               break;
            case 229:
               var10000 = 136;
               break;
            case 230:
               var10000 = 75;
               break;
            case 231:
               var10000 = 109;
               break;
            case 232:
               var10000 = 168;
               break;
            case 233:
               var10000 = 12;
               break;
            case 234:
               var10000 = 201;
               break;
            case 235:
               var10000 = 117;
               break;
            case 236:
               var10000 = 59;
               break;
            case 237:
               var10000 = 223;
               break;
            case 238:
               var10000 = 199;
               break;
            case 239:
               var10000 = 17;
               break;
            case 240:
               var10000 = 100;
               break;
            case 241:
               var10000 = 2;
               break;
            case 242:
               var10000 = 229;
               break;
            case 243:
               var10000 = 137;
               break;
            case 244:
               var10000 = 239;
               break;
            case 245:
               var10000 = 129;
               break;
            case 246:
               var10000 = 23;
               break;
            case 247:
               var10000 = 248;
               break;
            case 248:
               var10000 = 213;
               break;
            case 249:
               var10000 = 249;
               break;
            case 250:
               var10000 = 238;
               break;
            case 251:
               var10000 = 141;
               break;
            case 252:
               var10000 = 154;
               break;
            case 253:
               var10000 = 233;
               break;
            case 254:
               var10000 = 200;
               break;
            default:
               var10000 = 40;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 637;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "\u008ebà\u009eAì\u009aSM\u0016(g\u00ad\u001c\u0080v!\u001cy¼\u009dY\u00adW4O.L0\u0015½mÛ_\u009e\u001eh{\u0013|6§";
      int var12 = "\u008ebà\u009eAì\u009aSM\u0016(g\u00ad\u001c\u0080v!\u001cy¼\u009dY\u00adW4O.L0\u0015½mÛ_\u009e\u001eh{\u0013|6§".length();
      char var9 = '\r';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 61;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 47;
                        break;
                     case 1:
                        var65 = 2;
                        break;
                     case 2:
                        var65 = 123;
                        break;
                     case 3:
                        var65 = 76;
                        break;
                     case 4:
                        var65 = 83;
                        break;
                     case 5:
                        var65 = 8;
                        break;
                     default:
                        var65 = 91;
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
                     c = new String[4];
                     long var0 = 4036175988146995609L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "\u0011d\u0013±gr6\u0018©Í&TÄ\u009cPËºõ½\\4¡\u0082¯_ø\tmä67\u0088 \u009b\u0010;\u008dü-Gô°å\u001fÁ£\u00847;J§i\u0097( ¤";
                     int var5 = "\u0011d\u0013±gr6\u0018©Í&TÄ\u009cPËºõ½\\4¡\u0082¯_ø\tmä67\u0088 \u009b\u0010;\u008dü-Gô°å\u001fÁ£\u00847;J§i\u0097( ¤"
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
                                    e = new Integer[9];
                                    M = a(25238, 4295061484816130284L);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0004\u0099´O2\u009båMf;\u000e\u0094óµÇ\u0014";
                                 var5 = "\u0004\u0099´O2\u009båMf;\u000e\u0094óµÇ\u0014".length();
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

                  var10 = "{y1\u0092\u0014\u0002_á\u009a/½/p/\u0085\u0016DfåÕÑ6ÂÓéÓÛYÙ\u0014~\u008bg©AÉ¦\u0086¸Ð\u0094>\u009e\u0014\u0011ý\u001fWne";
                  var12 = "{y1\u0092\u0014\u0002_á\u009a/½/p/\u0085\u0016DfåÕÑ6ÂÓéÓÛYÙ\u0014~\u008bg©AÉ¦\u0086¸Ð\u0094>\u009e\u0014\u0011ý\u001fWne".length();
                  var9 = 29;
                  var17 = -1;
            }

            var10000 = 23;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





