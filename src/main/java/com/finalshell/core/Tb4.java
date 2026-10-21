package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Tb4 {
   public InputStream y;
   public OutputStream t;
   public InputStream n;
   public OutputStream T;
   public String s;
   public int L;
   public String z;
   public int M;
   public boolean U;
   public Lv4_2 B;
   public int X;

   public Tb4(String var1, int var2, String var3, int var4, Lv4_2 var5, int var6) {
      long var8 = 387347256520815117L;
      Object var7 = null;
      Ref.s(387347256520815117L, var7, var8);
      long var10 = 340350589392341061L;
      Object var9 = null;
      Ref.s(340350589392341061L, var9, var10);
      long var12 = 441418071335236039L;
      Object var11 = null;
      Ref.s(441418071335236039L, var11, var12);
      long var14 = 221957569033400503L;
      Object var13 = null;
      Ref.s(221957569033400503L, var13, var14);
      Registry.lookupField(202693181592854719L).setBoolean(this, false);
      Registry.lookupField(375641075699496300L).setInt(this, var6);
      long var16 = 321501092453038022L;
      Ref.s(321501092453038022L, var1, var16);
      Registry.lookupField(154546378560701039L).setInt(this, var2);
      long var18 = 484087737275163755L;
      Ref.s(484087737275163755L, var3, var18);
      Registry.lookupField(258281440451827859L).setInt(this, var4);
      long var20 = 545945209183732401L;
      Ref.s(545945209183732401L, var5, var20);
   }

   public void l(Socket param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/BS.s ()I
      // 003: istore 2
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 009: ldc2_w 387347256520815117
      // 00c: astore 7
      // 00e: astore 6
      // 010: ldc2_w 387347256520815117
      // 013: aload 6
      // 015: aload 7
      // 017: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 01a: aload 0
      // 01b: aload 1
      // 01c: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 01f: ldc2_w 340350589392341061
      // 022: astore 9
      // 024: astore 8
      // 026: ldc2_w 340350589392341061
      // 029: aload 8
      // 02b: aload 9
      // 02d: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 030: aload 0
      // 031: iload 2
      // 032: ifeq 057
      // 035: ldc2_w 545945209183732401
      // 038: astore 10
      // 03a: ldc2_w 545945209183732401
      // 03d: aload 10
      // 03f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 042: checkcast com/finalshell/core/Lv4_2
      // 045: ifnonnull 0f6
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: ldc2_w 484087737275163755
      // 05a: astore 12
      // 05c: ldc2_w 484087737275163755
      // 05f: aload 12
      // 061: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 064: aload 0
      // 065: ldc2_w 258281440451827859
      // 068: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 06b: swap
      // 06c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 06f: aload 0
      // 070: ldc2_w 375641075699496300
      // 073: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 076: swap
      // 077: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 07a: aconst_null
      // 07b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
      // 07e: ldc2_w 252674541260190421
      // 081: astore 14
      // 083: ldc2_w 252674541260190421
      // 086: aload 14
      // 088: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 08b: checkcast com/finalshell/core/Ow4_2
      // 08e: goto 095
      // 091: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 094: athrow
      // 095: astore 3
      // 096: aload 0
      // 097: aload 3
      // 098: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09b: ldc2_w 338384932181778709
      // 09e: astore 17
      // 0a0: astore 16
      // 0a2: ldc2_w 338384932181778709
      // 0a5: aload 16
      // 0a7: aload 17
      // 0a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ac: goto 0b3
      // 0af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: ldc2_w 441418071335236039
      // 0b6: astore 19
      // 0b8: astore 18
      // 0ba: ldc2_w 441418071335236039
      // 0bd: aload 18
      // 0bf: aload 19
      // 0c1: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c4: aload 0
      // 0c5: aload 3
      // 0c6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c9: ldc2_w 306921991173116420
      // 0cc: astore 21
      // 0ce: astore 20
      // 0d0: ldc2_w 306921991173116420
      // 0d3: aload 20
      // 0d5: aload 21
      // 0d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0da: goto 0e1
      // 0dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: ldc2_w 221957569033400503
      // 0e4: astore 23
      // 0e6: astore 22
      // 0e8: ldc2_w 221957569033400503
      // 0eb: aload 22
      // 0ed: aload 23
      // 0ef: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0f2: iload 2
      // 0f3: ifne 54b
      // 0f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f9: ldc2_w 270389152141252877
      // 0fc: astore 24
      // 0fe: ldc2_w 270389152141252877
      // 101: aload 24
      // 103: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 106: goto 10d
      // 109: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 110: ldc2_w 306266403902896148
      // 113: astore 27
      // 115: astore 26
      // 117: ldc2_w 306266403902896148
      // 11a: aload 26
      // 11c: aload 27
      // 11e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 121: goto 128
      // 124: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 0
      // 129: ldc2_w 545945209183732401
      // 12c: astore 28
      // 12e: ldc2_w 545945209183732401
      // 131: aload 28
      // 133: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 136: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 139: ldc2_w 603433831346798442
      // 13c: astore 31
      // 13e: astore 30
      // 140: ldc2_w 603433831346798442
      // 143: aload 30
      // 145: aload 31
      // 147: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 14a: goto 151
      // 14d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 150: athrow
      // 151: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 154: ldc2_w 560237732988887706
      // 157: astore 33
      // 159: astore 32
      // 15b: ldc2_w 560237732988887706
      // 15e: aload 32
      // 160: aload 33
      // 162: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 165: checkcast com/finalshell/core/LD3_2
      // 168: goto 16f
      // 16b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: astore 3
      // 170: aload 3
      // 171: ifnull 461
      // 174: aconst_null
      // 175: astore 4
      // 177: aload 3
      // 178: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17b: ldc2_w 562951426394330328
      // 17e: astore 35
      // 180: astore 34
      // 182: ldc2_w 562951426394330328
      // 185: aload 34
      // 187: aload 35
      // 189: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18c: checkcast java/lang/Integer
      // 18f: invokevirtual java/lang/Integer.intValue ()I
      // 192: goto 199
      // 195: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 198: athrow
      // 199: ldc2_w 392143205024518869
      // 19c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 19f: aconst_null
      // 1a0: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1a3: iload 2
      // 1a4: ifeq 37e
      // 1a7: if_icmpne 352
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: aconst_null
      // 1b2: astore 5
      // 1b4: aload 3
      // 1b5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b8: ldc2_w 562777604625200665
      // 1bb: astore 37
      // 1bd: astore 36
      // 1bf: ldc2_w 562777604625200665
      // 1c2: aload 36
      // 1c4: aload 37
      // 1c6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c9: goto 1d0
      // 1cc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d3: ldc2_w 330094358428833085
      // 1d6: astore 38
      // 1d8: ldc2_w 330094358428833085
      // 1db: aload 38
      // 1dd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e0: checkcast java/lang/Boolean
      // 1e3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e6: goto 1ed
      // 1e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: iload 2
      // 1ee: ifeq 23b
      // 1f1: ifne 2d0
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fa: athrow
      // 1fb: aload 3
      // 1fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ff: ldc2_w 465224899237569377
      // 202: astore 41
      // 204: astore 40
      // 206: ldc2_w 465224899237569377
      // 209: aload 40
      // 20b: aload 41
      // 20d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 210: goto 217
      // 213: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 216: athrow
      // 217: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 21a: ldc2_w 330094358428833085
      // 21d: astore 42
      // 21f: ldc2_w 330094358428833085
      // 222: aload 42
      // 224: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 227: checkcast java/lang/Boolean
      // 22a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 22d: goto 234
      // 230: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 233: athrow
      // 234: goto 23b
      // 237: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: ifne 2d0
      // 23e: new sockslib/client/Socks5
      // 241: dup
      // 242: new java/net/InetSocketAddress
      // 245: dup
      // 246: aload 3
      // 247: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 24a: ldc2_w 531355023953548464
      // 24d: astore 45
      // 24f: astore 44
      // 251: ldc2_w 531355023953548464
      // 254: aload 44
      // 256: aload 45
      // 258: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 25b: checkcast java/lang/String
      // 25e: goto 265
      // 261: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 264: athrow
      // 265: aload 3
      // 266: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 269: ldc2_w 511476850441845458
      // 26c: astore 47
      // 26e: astore 46
      // 270: ldc2_w 511476850441845458
      // 273: aload 46
      // 275: aload 47
      // 277: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27a: checkcast java/lang/Integer
      // 27d: invokevirtual java/lang/Integer.intValue ()I
      // 280: goto 287
      // 283: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 286: athrow
      // 287: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 28a: aload 3
      // 28b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 28e: ldc2_w 562777604625200665
      // 291: astore 49
      // 293: astore 48
      // 295: ldc2_w 562777604625200665
      // 298: aload 48
      // 29a: aload 49
      // 29c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29f: checkcast java/lang/String
      // 2a2: goto 2a9
      // 2a5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a8: athrow
      // 2a9: aload 3
      // 2aa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ad: ldc2_w 465224899237569377
      // 2b0: astore 51
      // 2b2: astore 50
      // 2b4: ldc2_w 465224899237569377
      // 2b7: aload 50
      // 2b9: aload 51
      // 2bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2be: checkcast java/lang/String
      // 2c1: goto 2c8
      // 2c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: invokespecial sockslib/client/Socks5.<init> (Ljava/net/SocketAddress;Ljava/lang/String;Ljava/lang/String;)V
      // 2cb: astore 5
      // 2cd: goto 321
      // 2d0: new sockslib/client/Socks5
      // 2d3: dup
      // 2d4: new java/net/InetSocketAddress
      // 2d7: dup
      // 2d8: aload 3
      // 2d9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2dc: ldc2_w 531355023953548464
      // 2df: astore 53
      // 2e1: astore 52
      // 2e3: ldc2_w 531355023953548464
      // 2e6: aload 52
      // 2e8: aload 53
      // 2ea: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2ed: checkcast java/lang/String
      // 2f0: goto 2f7
      // 2f3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f6: athrow
      // 2f7: aload 3
      // 2f8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2fb: ldc2_w 511476850441845458
      // 2fe: astore 55
      // 300: astore 54
      // 302: ldc2_w 511476850441845458
      // 305: aload 54
      // 307: aload 55
      // 309: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 30c: checkcast java/lang/Integer
      // 30f: invokevirtual java/lang/Integer.intValue ()I
      // 312: goto 319
      // 315: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 318: athrow
      // 319: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 31c: invokespecial sockslib/client/Socks5.<init> (Ljava/net/SocketAddress;)V
      // 31f: astore 5
      // 321: new sockslib/client/SocksSocket
      // 324: dup
      // 325: aload 5
      // 327: new java/net/InetSocketAddress
      // 32a: dup
      // 32b: aload 0
      // 32c: ldc2_w 484087737275163755
      // 32f: astore 56
      // 331: ldc2_w 484087737275163755
      // 334: aload 56
      // 336: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 339: checkcast java/lang/String
      // 33c: aload 0
      // 33d: ldc2_w 258281440451827859
      // 340: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 343: swap
      // 344: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 347: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 34a: invokespecial sockslib/client/SocksSocket.<init> (Lsockslib/client/SocksProxy;Ljava/net/SocketAddress;)V
      // 34d: astore 4
      // 34f: goto 421
      // 352: aload 3
      // 353: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 356: ldc2_w 562951426394330328
      // 359: astore 59
      // 35b: astore 58
      // 35d: ldc2_w 562951426394330328
      // 360: aload 58
      // 362: aload 59
      // 364: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 367: checkcast java/lang/Integer
      // 36a: invokevirtual java/lang/Integer.intValue ()I
      // 36d: goto 374
      // 370: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 373: athrow
      // 374: ldc2_w 319971801115033366
      // 377: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 37a: aconst_null
      // 37b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 37e: if_icmpne 421
      // 381: aload 0
      // 382: ldc2_w 484087737275163755
      // 385: astore 60
      // 387: ldc2_w 484087737275163755
      // 38a: aload 60
      // 38c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 38f: checkcast java/lang/String
      // 392: aload 0
      // 393: ldc2_w 258281440451827859
      // 396: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 399: swap
      // 39a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 39d: aload 3
      // 39e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3a1: ldc2_w 531355023953548464
      // 3a4: astore 63
      // 3a6: astore 62
      // 3a8: ldc2_w 531355023953548464
      // 3ab: aload 62
      // 3ad: aload 63
      // 3af: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b2: checkcast java/lang/String
      // 3b5: goto 3bc
      // 3b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3bb: athrow
      // 3bc: aload 3
      // 3bd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c0: ldc2_w 511476850441845458
      // 3c3: astore 65
      // 3c5: astore 64
      // 3c7: ldc2_w 511476850441845458
      // 3ca: aload 64
      // 3cc: aload 65
      // 3ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3d1: checkcast java/lang/Integer
      // 3d4: invokevirtual java/lang/Integer.intValue ()I
      // 3d7: goto 3de
      // 3da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3dd: athrow
      // 3de: aload 3
      // 3df: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3e2: ldc2_w 562777604625200665
      // 3e5: astore 67
      // 3e7: astore 66
      // 3e9: ldc2_w 562777604625200665
      // 3ec: aload 66
      // 3ee: aload 67
      // 3f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3f3: checkcast java/lang/String
      // 3f6: goto 3fd
      // 3f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3fc: athrow
      // 3fd: aload 3
      // 3fe: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 401: ldc2_w 465224899237569377
      // 404: astore 69
      // 406: astore 68
      // 408: ldc2_w 465224899237569377
      // 40b: aload 68
      // 40d: aload 69
      // 40f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 412: checkcast java/lang/String
      // 415: goto 41c
      // 418: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 41b: athrow
      // 41c: invokestatic com/finalshell/core/Fi4.I (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
      // 41f: astore 4
      // 421: aload 0
      // 422: new java/io/DataInputStream
      // 425: dup
      // 426: aload 4
      // 428: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 42b: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 42e: ldc2_w 441418071335236039
      // 431: astore 71
      // 433: astore 70
      // 435: ldc2_w 441418071335236039
      // 438: aload 70
      // 43a: aload 71
      // 43c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 43f: aload 0
      // 440: new java/io/DataOutputStream
      // 443: dup
      // 444: aload 4
      // 446: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 449: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 44c: ldc2_w 221957569033400503
      // 44f: astore 73
      // 451: astore 72
      // 453: ldc2_w 221957569033400503
      // 456: aload 72
      // 458: aload 73
      // 45a: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 45d: iload 2
      // 45e: ifne 54b
      // 461: aload 0
      // 462: iload 2
      // 463: ifeq 4ad
      // 466: goto 46d
      // 469: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46c: athrow
      // 46d: ldc2_w 545945209183732401
      // 470: astore 74
      // 472: ldc2_w 545945209183732401
      // 475: aload 74
      // 477: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 47a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 47d: ldc2_w 581008912184751225
      // 480: astore 77
      // 482: astore 76
      // 484: ldc2_w 581008912184751225
      // 487: aload 76
      // 489: aload 77
      // 48b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 48e: checkcast java/lang/Boolean
      // 491: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 494: goto 49b
      // 497: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49a: athrow
      // 49b: ifeq 54b
      // 49e: goto 4a5
      // 4a1: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a4: athrow
      // 4a5: aload 0
      // 4a6: goto 4ad
      // 4a9: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ac: athrow
      // 4ad: ldc2_w 484087737275163755
      // 4b0: astore 78
      // 4b2: ldc2_w 484087737275163755
      // 4b5: aload 78
      // 4b7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4ba: aload 0
      // 4bb: ldc2_w 258281440451827859
      // 4be: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4c1: swap
      // 4c2: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 4c5: aload 0
      // 4c6: ldc2_w 375641075699496300
      // 4c9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4cc: swap
      // 4cd: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 4d0: aconst_null
      // 4d1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
      // 4d4: ldc2_w 252674541260190421
      // 4d7: astore 80
      // 4d9: ldc2_w 252674541260190421
      // 4dc: aload 80
      // 4de: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e1: checkcast com/finalshell/core/Ow4_2
      // 4e4: goto 4eb
      // 4e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ea: athrow
      // 4eb: astore 4
      // 4ed: aload 0
      // 4ee: aload 4
      // 4f0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4f3: ldc2_w 338384932181778709
      // 4f6: astore 83
      // 4f8: astore 82
      // 4fa: ldc2_w 338384932181778709
      // 4fd: aload 82
      // 4ff: aload 83
      // 501: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 504: goto 50b
      // 507: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 50a: athrow
      // 50b: ldc2_w 441418071335236039
      // 50e: astore 85
      // 510: astore 84
      // 512: ldc2_w 441418071335236039
      // 515: aload 84
      // 517: aload 85
      // 519: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 51c: aload 0
      // 51d: aload 4
      // 51f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 522: ldc2_w 306921991173116420
      // 525: astore 87
      // 527: astore 86
      // 529: ldc2_w 306921991173116420
      // 52c: aload 86
      // 52e: aload 87
      // 530: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 533: goto 53a
      // 536: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 539: athrow
      // 53a: ldc2_w 221957569033400503
      // 53d: astore 89
      // 53f: astore 88
      // 541: ldc2_w 221957569033400503
      // 544: aload 88
      // 546: aload 89
      // 548: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 54b: ldc2_w 388376917454860932
      // 54e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 551: aconst_null
      // 552: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 555: new com/finalshell/task/Ne2
      // 558: dup
      // 559: aload 0
      // 55a: invokespecial com/finalshell/task/Ne2.<init> (Lcom/finalshell/core/Tb4;)V
      // 55d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 560: ldc2_w 434592463220957006
      // 563: astore 91
      // 565: astore 90
      // 567: ldc2_w 434592463220957006
      // 56a: aload 90
      // 56c: aload 91
      // 56e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 571: pop
      // 572: goto 579
      // 575: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 578: athrow
      // 579: ldc2_w 388376917454860932
      // 57c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 57f: aconst_null
      // 580: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 583: new com/finalshell/task/Lg2
      // 586: dup
      // 587: aload 0
      // 588: invokespecial com/finalshell/task/Lg2.<init> (Lcom/finalshell/core/Tb4;)V
      // 58b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 58e: ldc2_w 434592463220957006
      // 591: astore 93
      // 593: astore 92
      // 595: ldc2_w 434592463220957006
      // 598: aload 92
      // 59a: aload 93
      // 59c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 59f: pop
      // 5a0: goto 5a7
      // 5a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5a6: athrow
      // 5a7: goto 5cc
      // 5aa: astore 3
      // 5ab: aload 3
      // 5ac: invokevirtual java/lang/Exception.printStackTrace ()V
      // 5af: aload 0
      // 5b0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5b3: ldc2_w 607929959020247755
      // 5b6: astore 95
      // 5b8: astore 94
      // 5ba: ldc2_w 607929959020247755
      // 5bd: aload 94
      // 5bf: aload 95
      // 5c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5c4: pop
      // 5c5: goto 5cc
      // 5c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5cb: athrow
      // 5cc: return
   }

   public void c() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/BS.s ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 032
      // 009: ldc2_w 202693181592854719
      // 00c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00f: swap
      // 010: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 013: ifne 11b
      // 016: goto 01d
      // 019: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c: athrow
      // 01d: aload 0
      // 01e: bipush 1
      // 01f: ldc2_w 202693181592854719
      // 022: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 025: dup_x2
      // 026: pop
      // 027: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 02a: aload 0
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: iload 1
      // 033: ifeq 06b
      // 036: ldc2_w 387347256520815117
      // 039: astore 3
      // 03a: ldc2_w 387347256520815117
      // 03d: aload 3
      // 03e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 041: checkcast java/io/InputStream
      // 044: ifnull 06a
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 0
      // 04f: ldc2_w 387347256520815117
      // 052: astore 5
      // 054: ldc2_w 387347256520815117
      // 057: aload 5
      // 059: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05c: checkcast java/io/InputStream
      // 05f: invokevirtual java/io/InputStream.close ()V
      // 062: goto 06a
      // 065: astore 2
      // 066: aload 2
      // 067: invokevirtual java/io/IOException.printStackTrace ()V
      // 06a: aload 0
      // 06b: iload 1
      // 06c: ifeq 0a6
      // 06f: ldc2_w 340350589392341061
      // 072: astore 7
      // 074: ldc2_w 340350589392341061
      // 077: aload 7
      // 079: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07c: checkcast java/io/OutputStream
      // 07f: ifnull 0a5
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 0
      // 08a: ldc2_w 340350589392341061
      // 08d: astore 9
      // 08f: ldc2_w 340350589392341061
      // 092: aload 9
      // 094: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 097: checkcast java/io/OutputStream
      // 09a: invokevirtual java/io/OutputStream.close ()V
      // 09d: goto 0a5
      // 0a0: astore 2
      // 0a1: aload 2
      // 0a2: invokevirtual java/io/IOException.printStackTrace ()V
      // 0a5: aload 0
      // 0a6: iload 1
      // 0a7: ifeq 0e1
      // 0aa: ldc2_w 441418071335236039
      // 0ad: astore 11
      // 0af: ldc2_w 441418071335236039
      // 0b2: aload 11
      // 0b4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b7: checkcast java/io/InputStream
      // 0ba: ifnull 0e0
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: ldc2_w 441418071335236039
      // 0c8: astore 13
      // 0ca: ldc2_w 441418071335236039
      // 0cd: aload 13
      // 0cf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d2: checkcast java/io/InputStream
      // 0d5: invokevirtual java/io/InputStream.close ()V
      // 0d8: goto 0e0
      // 0db: astore 2
      // 0dc: aload 2
      // 0dd: invokevirtual java/io/IOException.printStackTrace ()V
      // 0e0: aload 0
      // 0e1: ldc2_w 221957569033400503
      // 0e4: astore 15
      // 0e6: ldc2_w 221957569033400503
      // 0e9: aload 15
      // 0eb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ee: checkcast java/io/OutputStream
      // 0f1: iload 1
      // 0f2: ifeq 110
      // 0f5: ifnull 11b
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/Tb4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: ldc2_w 221957569033400503
      // 103: astore 17
      // 105: ldc2_w 221957569033400503
      // 108: aload 17
      // 10a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10d: checkcast java/io/OutputStream
      // 110: invokevirtual java/io/OutputStream.close ()V
      // 113: goto 11b
      // 116: astore 2
      // 117: aload 2
      // 118: invokevirtual java/io/IOException.printStackTrace ()V
      // 11b: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





