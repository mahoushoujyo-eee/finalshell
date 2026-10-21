package com.finalshell.core;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.SpeedTestFrame;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class SpeedTestService implements PO3 {
   public boolean p;
   public FileTransferConnection G;
   public Lv4_2 q;
   public int J;
   public L0 v;
   public KV e;
   public boolean O;
   public int n;
   public ArrayList s;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] f;
   public static Long[] g;

   public SpeedTestService(Lv4_2 var1, boolean var2) {
      Registry.lookupField(293577005979220571L).setInt(this, a(4063, 527846010556201822L));
      Registry.lookupField(588222327077575093L).setBoolean(this, true);
      ArrayList var10001 = new ArrayList();
      long var4 = 579268137100591706L;
      ArrayList var3 = var10001;
      Ref.s(579268137100591706L, var3, var4);
      long var6 = 148964444860847516L;
      Ref.s(148964444860847516L, var1, var6);
      Registry.lookupField(206342559758395463L).setBoolean(this, var2);
   }

   public void D() {
      Object var1 = 549777208306704057L;
      Ref.g(549777208306704057L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 588282780871837510L;
      Object[] var3 = var10002;
      Ref.h(588282780871837510L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void I() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: new com/finalshell/core/L0
      // 004: dup
      // 005: bipush 3
      // 006: invokespecial com/finalshell/core/L0.<init> (I)V
      // 009: ldc2_w 140404326420309509
      // 00c: astore 12
      // 00e: astore 11
      // 010: ldc2_w 140404326420309509
      // 013: aload 11
      // 015: aload 12
      // 017: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 01a: aload 0
      // 01b: new com/finalshell/core/KV
      // 01e: dup
      // 01f: invokespecial com/finalshell/core/KV.<init> ()V
      // 022: ldc2_w 229111671699256395
      // 025: astore 14
      // 027: astore 13
      // 029: ldc2_w 229111671699256395
      // 02c: aload 13
      // 02e: aload 14
      // 030: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 033: ldc2_w 388376917454860932
      // 036: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 039: aconst_null
      // 03a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 03d: new com/finalshell/task/Ur4
      // 040: dup
      // 041: aload 0
      // 042: invokespecial com/finalshell/task/Ur4.<init> (Lcom/finalshell/core/LF3_2;)V
      // 045: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 048: ldc2_w 434592463220957006
      // 04b: astore 16
      // 04d: astore 15
      // 04f: ldc2_w 434592463220957006
      // 052: aload 15
      // 054: aload 16
      // 056: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 059: pop
      // 05a: goto 061
      // 05d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 060: athrow
      // 061: invokestatic com/finalshell/ui/frame/SpeedTestFrame.K ()[Lcom/finalshell/ui/panel/Ky4;
      // 064: aload 0
      // 065: new com/finalshell/connection/Connection12
      // 068: dup
      // 069: aload 0
      // 06a: ldc2_w 148964444860847516
      // 06d: astore 17
      // 06f: ldc2_w 148964444860847516
      // 072: aload 17
      // 074: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 077: checkcast com/finalshell/core/Lv4_2
      // 07a: aconst_null
      // 07b: ldc2_w 172266869270573121
      // 07e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 081: aconst_null
      // 082: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 085: invokespecial com/finalshell/connection/Connection12.<init> (Lcom/finalshell/core/Lv4_2;Lcom/finalshell/crypto/ConnectHost;I)V
      // 088: ldc2_w 549777208306704057
      // 08b: astore 20
      // 08d: astore 19
      // 08f: ldc2_w 549777208306704057
      // 092: aload 19
      // 094: aload 20
      // 096: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 099: aload 0
      // 09a: ldc2_w 549777208306704057
      // 09d: astore 21
      // 09f: ldc2_w 549777208306704057
      // 0a2: aload 21
      // 0a4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a7: bipush 1
      // 0a8: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0ab: ldc2_w 388299722192549045
      // 0ae: astore 24
      // 0b0: astore 23
      // 0b2: ldc2_w 388299722192549045
      // 0b5: aload 23
      // 0b7: aload 24
      // 0b9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bc: pop
      // 0bd: goto 0c4
      // 0c0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: astore 1
      // 0c5: new java/util/Random
      // 0c8: dup
      // 0c9: invokespecial java/util/Random.<init> ()V
      // 0cc: astore 2
      // 0cd: new java/lang/StringBuilder
      // 0d0: dup
      // 0d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d4: ldc2_w 159143763483921134
      // 0d7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0da: aconst_null
      // 0db: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0de: checkcast java/lang/String
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: sipush -22276
      // 0e7: sipush -21800
      // 0ea: invokestatic com/finalshell/core/LF3_2.a (II)Ljava/lang/String;
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f3: astore 3
      // 0f4: new java/lang/StringBuilder
      // 0f7: dup
      // 0f8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fb: ldc2_w 159143763483921134
      // 0fe: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 101: aconst_null
      // 102: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 105: checkcast java/lang/String
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: sipush -22275
      // 10e: sipush -25962
      // 111: invokestatic com/finalshell/core/LF3_2.a (II)Ljava/lang/String;
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 117: aload 2
      // 118: sipush 9149
      // 11b: ldc2_w 1704643278018549565
      // 11e: invokestatic com/finalshell/core/LF3_2.a (IJ)I
      // 121: invokevirtual java/util/Random.nextInt (I)I
      // 124: invokestatic java/lang/Math.abs (I)I
      // 127: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12a: sipush -22278
      // 12d: sipush -30742
      // 130: invokestatic com/finalshell/core/LF3_2.a (II)Ljava/lang/String;
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 139: astore 4
      // 13b: new java/io/File
      // 13e: dup
      // 13f: ldc2_w 159143763483921134
      // 142: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 145: aconst_null
      // 146: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 149: checkcast java/lang/String
      // 14c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 14f: astore 5
      // 151: aload 5
      // 153: aload 1
      // 154: ifnull 179
      // 157: invokevirtual java/io/File.exists ()Z
      // 15a: ifne 171
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 5
      // 166: invokevirtual java/io/File.mkdirs ()Z
      // 169: pop
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: new java/io/File
      // 174: dup
      // 175: aload 3
      // 176: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 179: astore 6
      // 17b: new java/io/File
      // 17e: dup
      // 17f: aload 4
      // 181: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 184: astore 7
      // 186: aload 0
      // 187: ldc2_w 549777208306704057
      // 18a: astore 25
      // 18c: ldc2_w 549777208306704057
      // 18f: aload 25
      // 191: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 194: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 197: ldc2_w 135220879492188512
      // 19a: astore 28
      // 19c: astore 27
      // 19e: ldc2_w 135220879492188512
      // 1a1: aload 27
      // 1a3: aload 28
      // 1a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a8: pop
      // 1a9: goto 1b0
      // 1ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: ldc2_w 388376917454860932
      // 1b3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1b6: aconst_null
      // 1b7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ba: new com/finalshell/task/Go2
      // 1bd: dup
      // 1be: aload 0
      // 1bf: invokespecial com/finalshell/task/Go2.<init> (Lcom/finalshell/core/LF3_2;)V
      // 1c2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1c5: ldc2_w 434592463220957006
      // 1c8: astore 30
      // 1ca: astore 29
      // 1cc: ldc2_w 434592463220957006
      // 1cf: aload 29
      // 1d1: aload 30
      // 1d3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d6: pop
      // 1d7: goto 1de
      // 1da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: ldc2_w 549777208306704057
      // 1e2: astore 31
      // 1e4: ldc2_w 549777208306704057
      // 1e7: aload 31
      // 1e9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ec: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ef: ldc2_w 191192660445086924
      // 1f2: astore 34
      // 1f4: astore 33
      // 1f6: ldc2_w 191192660445086924
      // 1f9: aload 33
      // 1fb: aload 34
      // 1fd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 200: checkcast com/finalshell/core/DY3
      // 203: goto 20a
      // 206: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 209: athrow
      // 20a: astore 8
      // 20c: aload 0
      // 20d: ldc2_w 206342559758395463
      // 210: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 213: swap
      // 214: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 217: aload 1
      // 218: ifnull 24e
      // 21b: ifeq 242
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: aload 8
      // 227: sipush -22277
      // 22a: sipush -22845
      // 22d: invokestatic com/finalshell/core/LF3_2.a (II)Ljava/lang/String;
      // 230: aload 4
      // 232: aload 0
      // 233: bipush 0
      // 234: invokevirtual com/finalshell/core/DY3.K (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // 237: aload 1
      // 238: ifnonnull 292
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 6
      // 244: invokevirtual java/io/File.exists ()Z
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: ifne 27d
      // 251: new java/io/RandomAccessFile
      // 254: dup
      // 255: aload 3
      // 256: sipush -22279
      // 259: sipush 9542
      // 25c: invokestatic com/finalshell/core/LF3_2.a (II)Ljava/lang/String;
      // 25f: invokespecial java/io/RandomAccessFile.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 262: astore 9
      // 264: aload 9
      // 266: sipush 10891
      // 269: ldc2_w 1626721030563178870
      // 26c: invokestatic com/finalshell/core/LF3_2.b (IJ)J
      // 26f: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 272: aload 9
      // 274: bipush 0
      // 275: invokevirtual java/io/RandomAccessFile.write (I)V
      // 278: aload 9
      // 27a: invokevirtual java/io/RandomAccessFile.close ()V
      // 27d: aload 8
      // 27f: aload 6
      // 281: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 284: sipush -22280
      // 287: sipush -18655
      // 28a: invokestatic com/finalshell/core/LF3_2.a (II)Ljava/lang/String;
      // 28d: aload 0
      // 28e: bipush 0
      // 28f: invokevirtual com/finalshell/core/DY3.d (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // 292: aload 0
      // 293: ldc2_w 140404326420309509
      // 296: astore 35
      // 298: ldc2_w 140404326420309509
      // 29b: aload 35
      // 29d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2a0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2a3: ldc2_w 457664105228082520
      // 2a6: astore 38
      // 2a8: astore 37
      // 2aa: ldc2_w 457664105228082520
      // 2ad: aload 37
      // 2af: aload 38
      // 2b1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b4: pop
      // 2b5: goto 2bc
      // 2b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2bb: athrow
      // 2bc: aload 0
      // 2bd: bipush 0
      // 2be: ldc2_w 588222327077575093
      // 2c1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2c4: dup_x2
      // 2c5: pop
      // 2c6: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 2c9: aload 6
      // 2cb: invokevirtual java/io/File.exists ()Z
      // 2ce: aload 1
      // 2cf: ifnull 2ee
      // 2d2: ifeq 2e9
      // 2d5: goto 2dc
      // 2d8: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: aload 6
      // 2de: invokevirtual java/io/File.delete ()Z
      // 2e1: pop
      // 2e2: goto 2e9
      // 2e5: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: aload 7
      // 2eb: invokevirtual java/io/File.exists ()Z
      // 2ee: aload 1
      // 2ef: ifnull 308
      // 2f2: ifeq 402
      // 2f5: goto 2fc
      // 2f8: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fb: athrow
      // 2fc: aload 7
      // 2fe: invokevirtual java/io/File.delete ()Z
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: pop
      // 309: goto 402
      // 30c: astore 8
      // 30e: aload 8
      // 310: invokevirtual java/lang/Exception.printStackTrace ()V
      // 313: aload 0
      // 314: ldc2_w 140404326420309509
      // 317: astore 39
      // 319: ldc2_w 140404326420309509
      // 31c: aload 39
      // 31e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 321: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 324: ldc2_w 457664105228082520
      // 327: astore 42
      // 329: astore 41
      // 32b: ldc2_w 457664105228082520
      // 32e: aload 41
      // 330: aload 42
      // 332: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 335: pop
      // 336: goto 33d
      // 339: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33c: athrow
      // 33d: aload 0
      // 33e: bipush 0
      // 33f: ldc2_w 588222327077575093
      // 342: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 345: dup_x2
      // 346: pop
      // 347: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 34a: aload 6
      // 34c: invokevirtual java/io/File.exists ()Z
      // 34f: aload 1
      // 350: ifnull 368
      // 353: ifeq 363
      // 356: aload 6
      // 358: invokevirtual java/io/File.delete ()Z
      // 35b: pop
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 362: athrow
      // 363: aload 7
      // 365: invokevirtual java/io/File.exists ()Z
      // 368: aload 1
      // 369: ifnull 382
      // 36c: ifeq 402
      // 36f: goto 376
      // 372: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 375: athrow
      // 376: aload 7
      // 378: invokevirtual java/io/File.delete ()Z
      // 37b: goto 382
      // 37e: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 381: athrow
      // 382: pop
      // 383: goto 402
      // 386: astore 10
      // 388: aload 0
      // 389: ldc2_w 140404326420309509
      // 38c: astore 43
      // 38e: ldc2_w 140404326420309509
      // 391: aload 43
      // 393: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 396: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 399: ldc2_w 457664105228082520
      // 39c: astore 46
      // 39e: astore 45
      // 3a0: ldc2_w 457664105228082520
      // 3a3: aload 45
      // 3a5: aload 46
      // 3a7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3aa: pop
      // 3ab: goto 3b2
      // 3ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b1: athrow
      // 3b2: aload 0
      // 3b3: bipush 0
      // 3b4: ldc2_w 588222327077575093
      // 3b7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3ba: dup_x2
      // 3bb: pop
      // 3bc: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 3bf: aload 6
      // 3c1: invokevirtual java/io/File.exists ()Z
      // 3c4: aload 1
      // 3c5: ifnull 3e4
      // 3c8: ifeq 3df
      // 3cb: goto 3d2
      // 3ce: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d1: athrow
      // 3d2: aload 6
      // 3d4: invokevirtual java/io/File.delete ()Z
      // 3d7: pop
      // 3d8: goto 3df
      // 3db: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3de: athrow
      // 3df: aload 7
      // 3e1: invokevirtual java/io/File.exists ()Z
      // 3e4: aload 1
      // 3e5: ifnull 3fe
      // 3e8: ifeq 3ff
      // 3eb: goto 3f2
      // 3ee: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f1: athrow
      // 3f2: aload 7
      // 3f4: invokevirtual java/io/File.delete ()Z
      // 3f7: goto 3fe
      // 3fa: invokestatic com/finalshell/core/LF3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fd: athrow
      // 3fe: pop
      // 3ff: aload 10
      // 401: athrow
      // 402: return
   }

   @Override
   public void b(int var1, String var2, String var3, long var4) {
   }

   @Override
   public boolean o(long var1) {
      Registry.lookupField(279787951265204347L)
         .setInt(this, (int)((long)Registry.lookupField(279787951265204347L).getInt(this) + var1 / b(17911, 1102625745494197771L)));
      Object var4 = 140404326420309509L;
      Ref.g(140404326420309509L, var4);
      Object[] var10002 = Registry.packArgs((int)var1);
      long var7 = 293036687901413973L;
      Object[] var6 = var10002;
      Ref.h(293036687901413973L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      VO var3 = new VO(null, 1);
      Object[] var10003 = Registry.packArgs(Registry.lookupField(206342559758395463L).getBoolean(this));
      long var9 = 233571545692057344L;
      Object[] var8 = var10003;
      Ref.h(233571545692057344L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var3);
      long var11 = 428387281984060786L;
      Object[] var10 = var10004;
      Ref.h(428387281984060786L, var10, var11);

      try {
         return true;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   @Override
   public void c() {
   }

   public void f(Cq2 var1) {
      Object var2 = 579268137100591706L;
      ((ArrayList)Ref.g(579268137100591706L, var2)).add(var1);
   }

   public void B(VO var1) {
      SpeedTestFrame.K();
      Object var5 = 579268137100591706L;
      Iterator var3 = ((ArrayList)Ref.g(579268137100591706L, var5)).iterator();
      SpeedTestService var2 = this;

      while (var3.hasNext()) {
         Cq2 var4 = (Cq2)var3.next();
         Object[] var10002 = Registry.packArgs(var1);
         long var8 = 297776913386603291L;
         Object[] var7 = var10002;
         Ref.h(297776913386603291L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public KV l() {
      Object var1 = 229111671699256395L;
      return (KV)Ref.g(229111671699256395L, var1);
   }

   public void M(KV var1) {
      long var3 = 229111671699256395L;
      Ref.s(229111671699256395L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -22280) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 97;
               break;
            case 1:
               var10000 = 110;
               break;
            case 2:
               var10000 = 199;
               break;
            case 3:
               var10000 = 128;
               break;
            case 4:
               var10000 = 52;
               break;
            case 5:
               var10000 = 206;
               break;
            case 6:
               var10000 = 113;
               break;
            case 7:
               var10000 = 123;
               break;
            case 8:
               var10000 = 162;
               break;
            case 9:
               var10000 = 116;
               break;
            case 10:
               var10000 = 137;
               break;
            case 11:
               var10000 = 90;
               break;
            case 12:
               var10000 = 53;
               break;
            case 13:
               var10000 = 195;
               break;
            case 14:
               var10000 = 34;
               break;
            case 15:
               var10000 = 197;
               break;
            case 16:
               var10000 = 205;
               break;
            case 17:
               var10000 = 92;
               break;
            case 18:
               var10000 = 168;
               break;
            case 19:
               var10000 = 148;
               break;
            case 20:
               var10000 = 166;
               break;
            case 21:
               var10000 = 57;
               break;
            case 22:
               var10000 = 176;
               break;
            case 23:
               var10000 = 158;
               break;
            case 24:
               var10000 = 120;
               break;
            case 25:
               var10000 = 163;
               break;
            case 26:
               var10000 = 17;
               break;
            case 27:
               var10000 = 215;
               break;
            case 28:
               var10000 = 107;
               break;
            case 29:
               var10000 = 200;
               break;
            case 30:
               var10000 = 157;
               break;
            case 31:
               var10000 = 243;
               break;
            case 32:
               var10000 = 214;
               break;
            case 33:
               var10000 = 172;
               break;
            case 34:
               var10000 = 216;
               break;
            case 35:
               var10000 = 78;
               break;
            case 36:
               var10000 = 156;
               break;
            case 37:
               var10000 = 23;
               break;
            case 38:
               var10000 = 186;
               break;
            case 39:
               var10000 = 20;
               break;
            case 40:
               var10000 = 153;
               break;
            case 41:
               var10000 = 6;
               break;
            case 42:
               var10000 = 125;
               break;
            case 43:
               var10000 = 68;
               break;
            case 44:
               var10000 = 219;
               break;
            case 45:
               var10000 = 101;
               break;
            case 46:
               var10000 = 71;
               break;
            case 47:
               var10000 = 188;
               break;
            case 48:
               var10000 = 79;
               break;
            case 49:
               var10000 = 58;
               break;
            case 50:
               var10000 = 159;
               break;
            case 51:
               var10000 = 142;
               break;
            case 52:
               var10000 = 250;
               break;
            case 53:
               var10000 = 146;
               break;
            case 54:
               var10000 = 44;
               break;
            case 55:
               var10000 = 240;
               break;
            case 56:
               var10000 = 171;
               break;
            case 57:
               var10000 = 198;
               break;
            case 58:
               var10000 = 15;
               break;
            case 59:
               var10000 = 61;
               break;
            case 60:
               var10000 = 127;
               break;
            case 61:
               var10000 = 86;
               break;
            case 62:
               var10000 = 155;
               break;
            case 63:
               var10000 = 145;
               break;
            case 64:
               var10000 = 100;
               break;
            case 65:
               var10000 = 94;
               break;
            case 66:
               var10000 = 169;
               break;
            case 67:
               var10000 = 83;
               break;
            case 68:
               var10000 = 203;
               break;
            case 69:
               var10000 = 223;
               break;
            case 70:
               var10000 = 54;
               break;
            case 71:
               var10000 = 217;
               break;
            case 72:
               var10000 = 201;
               break;
            case 73:
               var10000 = 46;
               break;
            case 74:
               var10000 = 14;
               break;
            case 75:
               var10000 = 29;
               break;
            case 76:
               var10000 = 175;
               break;
            case 77:
               var10000 = 252;
               break;
            case 78:
               var10000 = 87;
               break;
            case 79:
               var10000 = 119;
               break;
            case 80:
               var10000 = 95;
               break;
            case 81:
               var10000 = 212;
               break;
            case 82:
               var10000 = 77;
               break;
            case 83:
               var10000 = 76;
               break;
            case 84:
               var10000 = 65;
               break;
            case 85:
               var10000 = 2;
               break;
            case 86:
               var10000 = 32;
               break;
            case 87:
               var10000 = 75;
               break;
            case 88:
               var10000 = 64;
               break;
            case 89:
               var10000 = 151;
               break;
            case 90:
               var10000 = 81;
               break;
            case 91:
               var10000 = 174;
               break;
            case 92:
               var10000 = 24;
               break;
            case 93:
               var10000 = 242;
               break;
            case 94:
               var10000 = 112;
               break;
            case 95:
               var10000 = 56;
               break;
            case 96:
               var10000 = 177;
               break;
            case 97:
               var10000 = 59;
               break;
            case 98:
               var10000 = 66;
               break;
            case 99:
               var10000 = 167;
               break;
            case 100:
               var10000 = 152;
               break;
            case 101:
               var10000 = 246;
               break;
            case 102:
               var10000 = 165;
               break;
            case 103:
               var10000 = 237;
               break;
            case 104:
               var10000 = 207;
               break;
            case 105:
               var10000 = 232;
               break;
            case 106:
               var10000 = 30;
               break;
            case 107:
               var10000 = 140;
               break;
            case 108:
               var10000 = 180;
               break;
            case 109:
               var10000 = 18;
               break;
            case 110:
               var10000 = 96;
               break;
            case 111:
               var10000 = 194;
               break;
            case 112:
               var10000 = 132;
               break;
            case 113:
               var10000 = 179;
               break;
            case 114:
               var10000 = 85;
               break;
            case 115:
               var10000 = 229;
               break;
            case 116:
               var10000 = 93;
               break;
            case 117:
               var10000 = 187;
               break;
            case 118:
               var10000 = 21;
               break;
            case 119:
               var10000 = 35;
               break;
            case 120:
               var10000 = 208;
               break;
            case 121:
               var10000 = 244;
               break;
            case 122:
               var10000 = 98;
               break;
            case 123:
               var10000 = 236;
               break;
            case 124:
               var10000 = 141;
               break;
            case 125:
               var10000 = 241;
               break;
            case 126:
               var10000 = 72;
               break;
            case 127:
               var10000 = 69;
               break;
            case 128:
               var10000 = 80;
               break;
            case 129:
               var10000 = 45;
               break;
            case 130:
               var10000 = 70;
               break;
            case 131:
               var10000 = 239;
               break;
            case 132:
               var10000 = 181;
               break;
            case 133:
               var10000 = 136;
               break;
            case 134:
               var10000 = 62;
               break;
            case 135:
               var10000 = 88;
               break;
            case 136:
               var10000 = 74;
               break;
            case 137:
               var10000 = 47;
               break;
            case 138:
               var10000 = 89;
               break;
            case 139:
               var10000 = 192;
               break;
            case 140:
               var10000 = 31;
               break;
            case 141:
               var10000 = 193;
               break;
            case 142:
               var10000 = 251;
               break;
            case 143:
               var10000 = 121;
               break;
            case 144:
               var10000 = 231;
               break;
            case 145:
               var10000 = 131;
               break;
            case 146:
               var10000 = 238;
               break;
            case 147:
               var10000 = 63;
               break;
            case 148:
               var10000 = 28;
               break;
            case 149:
               var10000 = 189;
               break;
            case 150:
               var10000 = 235;
               break;
            case 151:
               var10000 = 124;
               break;
            case 152:
               var10000 = 103;
               break;
            case 153:
               var10000 = 202;
               break;
            case 154:
               var10000 = 43;
               break;
            case 155:
               var10000 = 22;
               break;
            case 156:
               var10000 = 182;
               break;
            case 157:
               var10000 = 224;
               break;
            case 158:
               var10000 = 25;
               break;
            case 159:
               var10000 = 118;
               break;
            case 160:
               var10000 = 170;
               break;
            case 161:
               var10000 = 115;
               break;
            case 162:
               var10000 = 228;
               break;
            case 163:
               var10000 = 230;
               break;
            case 164:
               var10000 = 139;
               break;
            case 165:
               var10000 = 211;
               break;
            case 166:
               var10000 = 129;
               break;
            case 167:
               var10000 = 253;
               break;
            case 168:
               var10000 = 173;
               break;
            case 169:
               var10000 = 196;
               break;
            case 170:
               var10000 = 109;
               break;
            case 171:
               var10000 = 51;
               break;
            case 172:
               var10000 = 42;
               break;
            case 173:
               var10000 = 218;
               break;
            case 174:
               var10000 = 36;
               break;
            case 175:
               var10000 = 191;
               break;
            case 176:
               var10000 = 26;
               break;
            case 177:
               var10000 = 185;
               break;
            case 178:
               var10000 = 161;
               break;
            case 179:
               var10000 = 105;
               break;
            case 180:
               var10000 = 33;
               break;
            case 181:
               var10000 = 154;
               break;
            case 182:
               var10000 = 150;
               break;
            case 183:
               var10000 = 234;
               break;
            case 184:
               var10000 = 91;
               break;
            case 185:
               var10000 = 249;
               break;
            case 186:
               var10000 = 41;
               break;
            case 187:
               var10000 = 37;
               break;
            case 188:
               var10000 = 233;
               break;
            case 189:
               var10000 = 13;
               break;
            case 190:
               var10000 = 12;
               break;
            case 191:
               var10000 = 213;
               break;
            case 192:
               var10000 = 27;
               break;
            case 193:
               var10000 = 114;
               break;
            case 194:
               var10000 = 184;
               break;
            case 195:
               var10000 = 3;
               break;
            case 196:
               var10000 = 106;
               break;
            case 197:
               var10000 = 11;
               break;
            case 198:
               var10000 = 164;
               break;
            case 199:
               var10000 = 143;
               break;
            case 200:
               var10000 = 226;
               break;
            case 201:
               var10000 = 104;
               break;
            case 202:
               var10000 = 209;
               break;
            case 203:
               var10000 = 111;
               break;
            case 204:
               var10000 = 8;
               break;
            case 205:
               var10000 = 135;
               break;
            case 206:
               var10000 = 178;
               break;
            case 207:
               var10000 = 204;
               break;
            case 208:
               var10000 = 39;
               break;
            case 209:
               var10000 = 102;
               break;
            case 210:
               var10000 = 49;
               break;
            case 211:
               var10000 = 5;
               break;
            case 212:
               var10000 = 9;
               break;
            case 213:
               var10000 = 138;
               break;
            case 214:
               var10000 = 82;
               break;
            case 215:
               var10000 = 149;
               break;
            case 216:
               var10000 = 134;
               break;
            case 217:
               var10000 = 19;
               break;
            case 218:
               var10000 = 60;
               break;
            case 219:
               var10000 = 16;
               break;
            case 220:
               var10000 = 190;
               break;
            case 221:
               var10000 = 183;
               break;
            case 222:
               var10000 = 248;
               break;
            case 223:
               var10000 = 10;
               break;
            case 224:
               var10000 = 1;
               break;
            case 225:
               var10000 = 144;
               break;
            case 226:
               var10000 = 50;
               break;
            case 227:
               var10000 = 117;
               break;
            case 228:
               var10000 = 255;
               break;
            case 229:
               var10000 = 38;
               break;
            case 230:
               var10000 = 99;
               break;
            case 231:
               var10000 = 40;
               break;
            case 232:
               var10000 = 108;
               break;
            case 233:
               var10000 = 55;
               break;
            case 234:
               var10000 = 73;
               break;
            case 235:
               var10000 = 7;
               break;
            case 236:
               var10000 = 133;
               break;
            case 237:
               var10000 = 245;
               break;
            case 238:
               var10000 = 210;
               break;
            case 239:
               var10000 = 147;
               break;
            case 240:
               var10000 = 67;
               break;
            case 241:
               var10000 = 225;
               break;
            case 242:
               var10000 = 221;
               break;
            case 243:
               var10000 = 0;
               break;
            case 244:
               var10000 = 227;
               break;
            case 245:
               var10000 = 130;
               break;
            case 246:
               var10000 = 126;
               break;
            case 247:
               var10000 = 247;
               break;
            case 248:
               var10000 = 222;
               break;
            case 249:
               var10000 = 220;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 84;
               break;
            case 252:
               var10000 = 48;
               break;
            case 253:
               var10000 = 122;
               break;
            case 254:
               var10000 = 4;
               break;
            default:
               var10000 = 254;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13441;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 1021) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var40;
      String[] var21 = new String[6];
      int var19 = 0;
      String var18 = "'\u0087'bá@N\u000f\u001d\u0002Ïª\u0005ÎH;\u0092=\tU|i\u001d(»gø)";
      int var20 = "'\u0087'bá@N\u000f\u001d\u0002Ïª\u0005ÎH;\u0092=\tU|i\u001d(»gø)".length();
      char var17 = '\t';
      int var24 = -1;

      label71:
      while (true) {
         byte var10000 = 40;
         String var10001 = var18.substring(++var24, var24 + var17);
         byte var10002 = -1;

         while (true) {
            label66: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var22 = 0;
               byte var47 = var10000;
               var40 = var44;
               int var30 = var10004;
               byte var54;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var44;
                  var54 = var10000;
                  var10006 = var22;
               } else {
                  var47 = var10000;
                  var30 = var10004;
                  if (var10004 <= var22) {
                     break label66;
                  }

                  var60 = var44;
                  var54 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var69 = var60[var10006];
                  byte var70;
                  switch (var22 % 7) {
                     case 0:
                        var70 = 42;
                        break;
                     case 1:
                        var70 = 107;
                        break;
                     case 2:
                        var70 = 4;
                        break;
                     case 3:
                        var70 = 76;
                        break;
                     case 4:
                        var70 = 78;
                        break;
                     case 5:
                        var70 = 126;
                        break;
                     default:
                        var70 = 41;
                  }

                  var60[var10006] = (char)(var69 ^ var54 ^ var70);
                  var22++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var60 = var40;
                     var54 = var47;
                  } else {
                     if (var30 <= var22) {
                        break;
                     }

                     var60 = var40;
                     var54 = var47;
                     var10006 = var22;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var49;
                  if ((var24 += var17) >= var20) {
                     a = var21;
                     b = new String[6];
                     long var8 = 6864103703478266204L;
                     long[] var14 = new long[2];
                     int var11 = 0;
                     String var12 = "ö\u0096U\f\u0000\fNB=?Ä\u009füN}\u0089";
                     int var13 = "ö\u0096U\f\u0000\fNB=?Ä\u009füN}\u0089".length();
                     byte var10 = 0;

                     do {
                        byte var32 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var32, var10).getBytes("ISO-8859-1");
                        int var33 = var11++;
                        long var58 = (
                              ((long)var15[0] & 255L) << 56
                                 | ((long)var15[1] & 255L) << 48
                                 | ((long)var15[2] & 255L) << 40
                                 | ((long)var15[3] & 255L) << 32
                                 | ((long)var15[4] & 255L) << 24
                                 | ((long)var15[5] & 255L) << 16
                                 | ((long)var15[6] & 255L) << 8
                                 | (long)var15[7] & 255L
                           )
                           ^ var8;
                        byte var50 = -1;
                        var14[var33] = var58;
                     } while (var10 < var13);

                     c = var14;
                     d = new Integer[2];
                     long var0 = 5435298123751007692L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "]ýHð\u0001f\u008cºD#^\u009e\u0092çcÄ";
                     int var5 = "]ýHð\u0001f\u008cºD#^\u009e\u0092çcÄ".length();
                     byte var2 = 0;

                     do {
                        byte var34 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                        int var35 = var3++;
                        long var59 = (
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
                        byte var51 = -1;
                        var6[var35] = var59;
                     } while (var2 < var5);

                     f = var6;
                     g = new Long[2];
                     return;
                  }

                  var17 = var18.charAt(var24);
                  break;
               default:
                  var21[var19++] = var49;
                  if ((var24 += var17) < var20) {
                     var17 = var18.charAt(var24);
                     continue label71;
                  }

                  var18 = "¾$¯:5Ø«ì;Åq\t\u0087Ñ y¡\u009aÚÞ\u0089";
                  var20 = "¾$¯:5Ø«ì;Åq\t\u0087Ñ y¡\u009aÚÞ\u0089".length();
                  var17 = 11;
                  var24 = -1;
            }

            var10000 = 70;
            var10001 = var18.substring(++var24, var24 + var17);
            var10002 = 0;
         }
      }
   }
}





