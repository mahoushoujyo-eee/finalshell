import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class tb_4 {
   InputStream y;
   OutputStream t;
   InputStream n;
   OutputStream T;
   String s;
   int L;
   String z;
   int M;
   boolean U;
   lv_4 B;
   int X;

   tb_4(String var1, int var2, String var3, int var4, lv_4 var5, int var6) {
      com.c.c(387347256520815117L).set(this, null);
      com.c.c(340350589392341061L).set(this, null);
      com.c.c(441418071335236039L).set(this, null);
      com.c.c(221957569033400503L).set(this, null);
      com.c.c(202693181592854719L).setBoolean(this, false);
      com.c.c(375641075699496300L).setInt(this, var6);
      com.c.c(321501092453038022L).set(this, var1);
      com.c.c(154546378560701039L).setInt(this, var2);
      com.c.c(484087737275163755L).set(this, var3);
      com.c.c(258281440451827859L).setInt(this, var4);
      com.c.c(545945209183732401L).set(this, var5);
   }

   void l(Socket param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic BS.s ()I
      // 003: istore 2
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 009: ldc2_w 387347256520815117
      // 00c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00f: dup_x2
      // 010: pop
      // 011: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 014: aload 0
      // 015: aload 1
      // 016: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 019: ldc2_w 340350589392341061
      // 01c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 01f: dup_x2
      // 020: pop
      // 021: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 024: aload 0
      // 025: iload 2
      // 026: ifeq 048
      // 029: ldc2_w 545945209183732401
      // 02c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 02f: swap
      // 030: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 033: checkcast lv_4
      // 036: ifnonnull 0cb
      // 039: goto 040
      // 03c: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 0
      // 041: goto 048
      // 044: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: ldc2_w 484087737275163755
      // 04b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 04e: swap
      // 04f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 052: aload 0
      // 053: ldc2_w 258281440451827859
      // 056: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 059: swap
      // 05a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 05d: aload 0
      // 05e: ldc2_w 375641075699496300
      // 061: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 064: swap
      // 065: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 068: aconst_null
      // 069: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
      // 06c: ldc2_w 252674541260190421
      // 06f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 072: swap
      // 073: aconst_null
      // 074: swap
      // 075: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 078: checkcast ow_4
      // 07b: goto 082
      // 07e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 081: athrow
      // 082: astore 3
      // 083: aload 0
      // 084: aload 3
      // 085: invokestatic com/c.f ()[Ljava/lang/Object;
      // 088: ldc2_w 338384932181778709
      // 08b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 08e: dup_x2
      // 08f: pop
      // 090: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 093: goto 09a
      // 096: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 099: athrow
      // 09a: ldc2_w 441418071335236039
      // 09d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0a0: dup_x2
      // 0a1: pop
      // 0a2: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0a5: aload 0
      // 0a6: aload 3
      // 0a7: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0aa: ldc2_w 306921991173116420
      // 0ad: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b5: goto 0bc
      // 0b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: ldc2_w 221957569033400503
      // 0bf: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0c7: iload 2
      // 0c8: ifne 47d
      // 0cb: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0ce: ldc2_w 270389152141252877
      // 0d1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0d4: swap
      // 0d5: aconst_null
      // 0d6: swap
      // 0d7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0da: goto 0e1
      // 0dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0e4: ldc2_w 306266403902896148
      // 0e7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ef: goto 0f6
      // 0f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: ldc2_w 545945209183732401
      // 0fa: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0fd: swap
      // 0fe: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 101: invokestatic com/c.f ()[Ljava/lang/Object;
      // 104: ldc2_w 603433831346798442
      // 107: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10f: goto 116
      // 112: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 115: athrow
      // 116: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 119: ldc2_w 560237732988887706
      // 11c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 11f: dup_x2
      // 120: pop
      // 121: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 124: checkcast lD_3
      // 127: goto 12e
      // 12a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: astore 3
      // 12f: aload 3
      // 130: ifnull 3b8
      // 133: aconst_null
      // 134: astore 4
      // 136: aload 3
      // 137: invokestatic com/c.f ()[Ljava/lang/Object;
      // 13a: ldc2_w 562951426394330328
      // 13d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 140: dup_x2
      // 141: pop
      // 142: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 145: checkcast java/lang/Integer
      // 148: invokevirtual java/lang/Integer.intValue ()I
      // 14b: goto 152
      // 14e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 151: athrow
      // 152: ldc2_w 392143205024518869
      // 155: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 158: aconst_null
      // 159: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 15c: iload 2
      // 15d: ifeq 2fc
      // 160: if_icmpne 2d6
      // 163: goto 16a
      // 166: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aconst_null
      // 16b: astore 5
      // 16d: aload 3
      // 16e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 171: ldc2_w 562777604625200665
      // 174: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 177: dup_x2
      // 178: pop
      // 179: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17c: goto 183
      // 17f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 182: athrow
      // 183: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 186: ldc2_w 330094358428833085
      // 189: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 18c: swap
      // 18d: aconst_null
      // 18e: swap
      // 18f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 192: checkcast java/lang/Boolean
      // 195: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 198: goto 19f
      // 19b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: iload 2
      // 1a0: ifeq 1e6
      // 1a3: ifne 263
      // 1a6: goto 1ad
      // 1a9: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: aload 3
      // 1ae: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1b1: ldc2_w 465224899237569377
      // 1b4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1b7: dup_x2
      // 1b8: pop
      // 1b9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1bc: goto 1c3
      // 1bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1c6: ldc2_w 330094358428833085
      // 1c9: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1cc: swap
      // 1cd: aconst_null
      // 1ce: swap
      // 1cf: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1d2: checkcast java/lang/Boolean
      // 1d5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d8: goto 1df
      // 1db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1de: athrow
      // 1df: goto 1e6
      // 1e2: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e5: athrow
      // 1e6: ifne 263
      // 1e9: new sockslib/client/Socks5
      // 1ec: dup
      // 1ed: new java/net/InetSocketAddress
      // 1f0: dup
      // 1f1: aload 3
      // 1f2: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1f5: ldc2_w 531355023953548464
      // 1f8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1fb: dup_x2
      // 1fc: pop
      // 1fd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 200: checkcast java/lang/String
      // 203: goto 20a
      // 206: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 209: athrow
      // 20a: aload 3
      // 20b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 20e: ldc2_w 511476850441845458
      // 211: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 214: dup_x2
      // 215: pop
      // 216: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 219: checkcast java/lang/Integer
      // 21c: invokevirtual java/lang/Integer.intValue ()I
      // 21f: goto 226
      // 222: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 225: athrow
      // 226: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 229: aload 3
      // 22a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 22d: ldc2_w 562777604625200665
      // 230: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 233: dup_x2
      // 234: pop
      // 235: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 238: checkcast java/lang/String
      // 23b: goto 242
      // 23e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 241: athrow
      // 242: aload 3
      // 243: invokestatic com/c.f ()[Ljava/lang/Object;
      // 246: ldc2_w 465224899237569377
      // 249: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 24c: dup_x2
      // 24d: pop
      // 24e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 251: checkcast java/lang/String
      // 254: goto 25b
      // 257: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: invokespecial sockslib/client/Socks5.<init> (Ljava/net/SocketAddress;Ljava/lang/String;Ljava/lang/String;)V
      // 25e: astore 5
      // 260: goto 2a8
      // 263: new sockslib/client/Socks5
      // 266: dup
      // 267: new java/net/InetSocketAddress
      // 26a: dup
      // 26b: aload 3
      // 26c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 26f: ldc2_w 531355023953548464
      // 272: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 275: dup_x2
      // 276: pop
      // 277: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 27a: checkcast java/lang/String
      // 27d: goto 284
      // 280: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 283: athrow
      // 284: aload 3
      // 285: invokestatic com/c.f ()[Ljava/lang/Object;
      // 288: ldc2_w 511476850441845458
      // 28b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 28e: dup_x2
      // 28f: pop
      // 290: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 293: checkcast java/lang/Integer
      // 296: invokevirtual java/lang/Integer.intValue ()I
      // 299: goto 2a0
      // 29c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 2a3: invokespecial sockslib/client/Socks5.<init> (Ljava/net/SocketAddress;)V
      // 2a6: astore 5
      // 2a8: new sockslib/client/SocksSocket
      // 2ab: dup
      // 2ac: aload 5
      // 2ae: new java/net/InetSocketAddress
      // 2b1: dup
      // 2b2: aload 0
      // 2b3: ldc2_w 484087737275163755
      // 2b6: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2b9: swap
      // 2ba: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2bd: checkcast java/lang/String
      // 2c0: aload 0
      // 2c1: ldc2_w 258281440451827859
      // 2c4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2c7: swap
      // 2c8: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2cb: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 2ce: invokespecial sockslib/client/SocksSocket.<init> (Lsockslib/client/SocksProxy;Ljava/net/SocketAddress;)V
      // 2d1: astore 4
      // 2d3: goto 384
      // 2d6: aload 3
      // 2d7: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2da: ldc2_w 562951426394330328
      // 2dd: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2e0: dup_x2
      // 2e1: pop
      // 2e2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2e5: checkcast java/lang/Integer
      // 2e8: invokevirtual java/lang/Integer.intValue ()I
      // 2eb: goto 2f2
      // 2ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f1: athrow
      // 2f2: ldc2_w 319971801115033366
      // 2f5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2f8: aconst_null
      // 2f9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2fc: if_icmpne 384
      // 2ff: aload 0
      // 300: ldc2_w 484087737275163755
      // 303: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 306: swap
      // 307: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 30a: checkcast java/lang/String
      // 30d: aload 0
      // 30e: ldc2_w 258281440451827859
      // 311: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 314: swap
      // 315: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 318: aload 3
      // 319: invokestatic com/c.f ()[Ljava/lang/Object;
      // 31c: ldc2_w 531355023953548464
      // 31f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 322: dup_x2
      // 323: pop
      // 324: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 327: checkcast java/lang/String
      // 32a: goto 331
      // 32d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 330: athrow
      // 331: aload 3
      // 332: invokestatic com/c.f ()[Ljava/lang/Object;
      // 335: ldc2_w 511476850441845458
      // 338: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 33b: dup_x2
      // 33c: pop
      // 33d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 340: checkcast java/lang/Integer
      // 343: invokevirtual java/lang/Integer.intValue ()I
      // 346: goto 34d
      // 349: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34c: athrow
      // 34d: aload 3
      // 34e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 351: ldc2_w 562777604625200665
      // 354: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 357: dup_x2
      // 358: pop
      // 359: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 35c: checkcast java/lang/String
      // 35f: goto 366
      // 362: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 365: athrow
      // 366: aload 3
      // 367: invokestatic com/c.f ()[Ljava/lang/Object;
      // 36a: ldc2_w 465224899237569377
      // 36d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 370: dup_x2
      // 371: pop
      // 372: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 375: checkcast java/lang/String
      // 378: goto 37f
      // 37b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 37e: athrow
      // 37f: invokestatic fi_4.I (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
      // 382: astore 4
      // 384: aload 0
      // 385: new java/io/DataInputStream
      // 388: dup
      // 389: aload 4
      // 38b: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 38e: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 391: ldc2_w 441418071335236039
      // 394: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 397: dup_x2
      // 398: pop
      // 399: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 39c: aload 0
      // 39d: new java/io/DataOutputStream
      // 3a0: dup
      // 3a1: aload 4
      // 3a3: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 3a6: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 3a9: ldc2_w 221957569033400503
      // 3ac: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3af: dup_x2
      // 3b0: pop
      // 3b1: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3b4: iload 2
      // 3b5: ifne 47d
      // 3b8: aload 0
      // 3b9: iload 2
      // 3ba: ifeq 3fb
      // 3bd: goto 3c4
      // 3c0: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c3: athrow
      // 3c4: ldc2_w 545945209183732401
      // 3c7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3ca: swap
      // 3cb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3ce: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3d1: ldc2_w 581008912184751225
      // 3d4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3d7: dup_x2
      // 3d8: pop
      // 3d9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3dc: checkcast java/lang/Boolean
      // 3df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3e2: goto 3e9
      // 3e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e8: athrow
      // 3e9: ifeq 47d
      // 3ec: goto 3f3
      // 3ef: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f2: athrow
      // 3f3: aload 0
      // 3f4: goto 3fb
      // 3f7: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fa: athrow
      // 3fb: ldc2_w 484087737275163755
      // 3fe: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 401: swap
      // 402: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 405: aload 0
      // 406: ldc2_w 258281440451827859
      // 409: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 40c: swap
      // 40d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 410: aload 0
      // 411: ldc2_w 375641075699496300
      // 414: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 417: swap
      // 418: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 41b: aconst_null
      // 41c: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
      // 41f: ldc2_w 252674541260190421
      // 422: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 425: swap
      // 426: aconst_null
      // 427: swap
      // 428: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 42b: checkcast ow_4
      // 42e: goto 435
      // 431: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 434: athrow
      // 435: astore 4
      // 437: aload 0
      // 438: aload 4
      // 43a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 43d: ldc2_w 338384932181778709
      // 440: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 443: dup_x2
      // 444: pop
      // 445: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 448: goto 44f
      // 44b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44e: athrow
      // 44f: ldc2_w 441418071335236039
      // 452: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 455: dup_x2
      // 456: pop
      // 457: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 45a: aload 0
      // 45b: aload 4
      // 45d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 460: ldc2_w 306921991173116420
      // 463: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 466: dup_x2
      // 467: pop
      // 468: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 46b: goto 472
      // 46e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 471: athrow
      // 472: ldc2_w 221957569033400503
      // 475: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 478: dup_x2
      // 479: pop
      // 47a: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 47d: ldc2_w 388376917454860932
      // 480: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 483: aconst_null
      // 484: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 487: new ne_2
      // 48a: dup
      // 48b: aload 0
      // 48c: invokespecial ne_2.<init> (Ltb_4;)V
      // 48f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 492: ldc2_w 434592463220957006
      // 495: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 498: dup_x2
      // 499: pop
      // 49a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 49d: pop
      // 49e: goto 4a5
      // 4a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4a4: athrow
      // 4a5: ldc2_w 388376917454860932
      // 4a8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4ab: aconst_null
      // 4ac: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4af: new Lg_2
      // 4b2: dup
      // 4b3: aload 0
      // 4b4: invokespecial Lg_2.<init> (Ltb_4;)V
      // 4b7: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4ba: ldc2_w 434592463220957006
      // 4bd: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4c0: dup_x2
      // 4c1: pop
      // 4c2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4c5: pop
      // 4c6: goto 4cd
      // 4c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4cc: athrow
      // 4cd: goto 4ec
      // 4d0: astore 3
      // 4d1: aload 3
      // 4d2: invokevirtual java/lang/Exception.printStackTrace ()V
      // 4d5: aload 0
      // 4d6: invokestatic com/c.f ()[Ljava/lang/Object;
      // 4d9: ldc2_w 607929959020247755
      // 4dc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4df: dup_x2
      // 4e0: pop
      // 4e1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4e4: pop
      // 4e5: goto 4ec
      // 4e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4eb: athrow
      // 4ec: return
   }

   void c() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic BS.s ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 032
      // 009: ldc2_w 202693181592854719
      // 00c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00f: swap
      // 010: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 013: ifne 105
      // 016: goto 01d
      // 019: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c: athrow
      // 01d: aload 0
      // 01e: bipush 1
      // 01f: ldc2_w 202693181592854719
      // 022: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 025: dup_x2
      // 026: pop
      // 027: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 02a: aload 0
      // 02b: goto 032
      // 02e: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: iload 1
      // 033: ifeq 067
      // 036: ldc2_w 387347256520815117
      // 039: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 03c: swap
      // 03d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast java/io/InputStream
      // 043: ifnull 066
      // 046: goto 04d
      // 049: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 0
      // 04e: ldc2_w 387347256520815117
      // 051: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 054: swap
      // 055: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 058: checkcast java/io/InputStream
      // 05b: invokevirtual java/io/InputStream.close ()V
      // 05e: goto 066
      // 061: astore 2
      // 062: aload 2
      // 063: invokevirtual java/io/IOException.printStackTrace ()V
      // 066: aload 0
      // 067: iload 1
      // 068: ifeq 09c
      // 06b: ldc2_w 340350589392341061
      // 06e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 071: swap
      // 072: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 075: checkcast java/io/OutputStream
      // 078: ifnull 09b
      // 07b: goto 082
      // 07e: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: aload 0
      // 083: ldc2_w 340350589392341061
      // 086: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 089: swap
      // 08a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08d: checkcast java/io/OutputStream
      // 090: invokevirtual java/io/OutputStream.close ()V
      // 093: goto 09b
      // 096: astore 2
      // 097: aload 2
      // 098: invokevirtual java/io/IOException.printStackTrace ()V
      // 09b: aload 0
      // 09c: iload 1
      // 09d: ifeq 0d1
      // 0a0: ldc2_w 441418071335236039
      // 0a3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0a6: swap
      // 0a7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0aa: checkcast java/io/InputStream
      // 0ad: ifnull 0d0
      // 0b0: goto 0b7
      // 0b3: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: ldc2_w 441418071335236039
      // 0bb: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0be: swap
      // 0bf: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c2: checkcast java/io/InputStream
      // 0c5: invokevirtual java/io/InputStream.close ()V
      // 0c8: goto 0d0
      // 0cb: astore 2
      // 0cc: aload 2
      // 0cd: invokevirtual java/io/IOException.printStackTrace ()V
      // 0d0: aload 0
      // 0d1: ldc2_w 221957569033400503
      // 0d4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0d7: swap
      // 0d8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0db: checkcast java/io/OutputStream
      // 0de: iload 1
      // 0df: ifeq 0fa
      // 0e2: ifnull 105
      // 0e5: goto 0ec
      // 0e8: invokestatic tb_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: ldc2_w 221957569033400503
      // 0f0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f3: swap
      // 0f4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f7: checkcast java/io/OutputStream
      // 0fa: invokevirtual java/io/OutputStream.close ()V
      // 0fd: goto 105
      // 100: astore 2
      // 101: aload 2
      // 102: invokevirtual java/io/IOException.printStackTrace ()V
      // 105: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





