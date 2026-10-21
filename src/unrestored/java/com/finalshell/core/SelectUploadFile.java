package com.finalshell.core;

import com.finalshell.io.IS3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.St2;
import com.finalshell.task.Xh2;
import com.finalshell.ui.model.On4;
import com.finalshell.ui.model.RP3;
import com.finalshell.ui.model.SY;
import com.finalshell.ui.model.WF3;
import com.finalshell.ui.model.YT;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectUploadFile extends P__2 {
   public static Logger J;
   public static int Q;
   public static int t;
   public static int z;
   public BlockingQueue m = new LinkedBlockingQueue();
   public PD3 o;
   public SetBackgroundImagePanel F;
   public boolean M = false;
   public boolean x = false;
   public char d;
   public boolean N = true;
   public long D;
   public long u;
   public ZModemTransfer I;
   public Cj4 K;
   public YI c;
   public GH_2 g;
   public PipedOutputStream L = null;
   public PipedInputStream T = null;
   public IS3 A = null;
   public long e = System.currentTimeMillis();
   public boolean s = true;
   public boolean Y = false;
   public byte[] Z = null;
   public int G = 0;
   public boolean P = false;
   public boolean b = false;
   public boolean C;
   public static String V;
   public static String[] f;
   public static String[] h;
   public static long[] k;
   public static Integer[] l;
   public static long[] p;
   public static Long[] q;

   public SelectUploadFile(Cj4 var1, Y42 var2, PD3 var3, QT var4, SetBackgroundImagePanel var5) {
      super(var2, var4);
      r$String();
      this.C = false;
      this.K = var1;
      this.o = var3;
      this.F = var5;
      Object var10001 = Registry.lookupField(388376917454860932L).get(null);
      SelectUploadFile var10002 = Registry.packArgs(new St2(this, var5));
      long var8 = 434592463220957006L;
      Object var7 = var10002;
      Ref.h(434592463220957006L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Object var6 = var10001;
      var10002 = (SelectUploadFile)Registry.lookupField(388376917454860932L).get(null);
      GH_2 var10003 = (GH_2)(Registry.packArgs(new Xh2(this, var5), b(9751, 5158089169205765890L)));
      long var10 = 201859364639460244L;
      Object var9 = var10003;
      var10003 = Ref.h(201859364639460244L, var9, var10);

      try {
         var10003 = (GH_2)var10003;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10002.g = var10003;
      if (var6 != null) {
         Ky4.K(new String[5]);
      }
   }

   @Override
   public boolean Q() {
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
      // 004: sipush 2163
      // 007: ldc2_w 7583510341915412846
      // 00a: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 00d: newarray 8
      // 00f: putfield com/finalshell/core/SelectUploadFile.Z [B
      // 012: aload 0
      // 013: bipush 0
      // 014: putfield com/finalshell/core/SelectUploadFile.G I
      // 017: aload 0
      // 018: bipush 1
      // 019: putfield com/finalshell/core/SelectUploadFile.s Z
      // 01c: astore 1
      // 01d: aload 0
      // 01e: bipush 0
      // 01f: putfield com/finalshell/core/SelectUploadFile.Y Z
      // 022: aload 0
      // 023: bipush 0
      // 024: putfield com/finalshell/core/SelectUploadFile.P Z
      // 027: aload 0
      // 028: new java/io/PipedOutputStream
      // 02b: dup
      // 02c: invokespecial java/io/PipedOutputStream.<init> ()V
      // 02f: putfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 032: aload 0
      // 033: new java/io/PipedInputStream
      // 036: dup
      // 037: invokespecial java/io/PipedInputStream.<init> ()V
      // 03a: putfield com/finalshell/core/SelectUploadFile.T Ljava/io/PipedInputStream;
      // 03d: aload 0
      // 03e: getfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 041: aload 0
      // 042: getfield com/finalshell/core/SelectUploadFile.T Ljava/io/PipedInputStream;
      // 045: invokevirtual java/io/PipedOutputStream.connect (Ljava/io/PipedInputStream;)V
      // 048: goto 050
      // 04b: astore 2
      // 04c: aload 2
      // 04d: invokevirtual java/io/IOException.printStackTrace ()V
      // 050: aload 0
      // 051: new com/finalshell/io/IS3
      // 054: dup
      // 055: aload 0
      // 056: getfield com/finalshell/core/SelectUploadFile.o Lcom/finalshell/core/PD3;
      // 059: checkcast com/finalshell/core/E0
      // 05c: invokespecial com/finalshell/io/IS3.<init> (Lcom/finalshell/core/E0;)V
      // 05f: putfield com/finalshell/core/SelectUploadFile.A Lcom/finalshell/io/IS3;
      // 062: new com/finalshell/core/CK
      // 065: dup
      // 066: aload 0
      // 067: getfield com/finalshell/core/SelectUploadFile.A Lcom/finalshell/io/IS3;
      // 06a: aload 0
      // 06b: getfield com/finalshell/core/SelectUploadFile.T Ljava/io/PipedInputStream;
      // 06e: invokespecial com/finalshell/core/CK.<init> (Ljava/io/OutputStream;Ljava/io/InputStream;)V
      // 071: astore 2
      // 072: aload 2
      // 073: aload 0
      // 074: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 077: invokevirtual com/finalshell/core/CK.t (Lcom/finalshell/core/Y42;)V
      // 07a: aload 0
      // 07b: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 07e: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 083: istore 3
      // 084: aload 0
      // 085: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 088: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 08b: astore 4
      // 08d: aload 4
      // 08f: invokevirtual com/finalshell/io/To2.P ()[B
      // 092: ifnull 198
      // 095: new java/lang/String
      // 098: dup
      // 099: aload 4
      // 09b: invokevirtual com/finalshell/io/To2.P ()[B
      // 09e: bipush 0
      // 09f: aload 4
      // 0a1: invokevirtual com/finalshell/io/To2.P ()[B
      // 0a4: arraylength
      // 0a5: invokespecial java/lang/String.<init> ([BII)V
      // 0a8: astore 5
      // 0aa: aload 1
      // 0ab: ifnonnull 191
      // 0ae: iload 3
      // 0af: sipush 16034
      // 0b2: ldc2_w 8349523448647139248
      // 0b5: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 0b8: if_icmpne 185
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 4
      // 0c4: invokevirtual com/finalshell/io/To2.P ()[B
      // 0c7: astore 6
      // 0c9: aload 0
      // 0ca: aload 6
      // 0cc: arraylength
      // 0cd: putfield com/finalshell/core/SelectUploadFile.G I
      // 0d0: aload 5
      // 0d2: sipush -18915
      // 0d5: sipush -6788
      // 0d8: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 0db: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0de: aload 1
      // 0df: ifnonnull 116
      // 0e2: ifne 10e
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: aload 6
      // 0ee: bipush 0
      // 0ef: baload
      // 0f0: aload 1
      // 0f1: ifnonnull 116
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: sipush 22483
      // 0fe: ldc2_w 8626528990299838157
      // 101: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 104: if_icmpne 185
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: bipush -1
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: istore 7
      // 118: bipush 0
      // 119: istore 8
      // 11b: iload 8
      // 11d: aload 0
      // 11e: getfield com/finalshell/core/SelectUploadFile.G I
      // 121: if_icmpge 185
      // 124: aload 6
      // 126: iload 8
      // 128: baload
      // 129: istore 9
      // 12b: aload 1
      // 12c: ifnonnull 181
      // 12f: iload 9
      // 131: sipush 1911
      // 134: ldc2_w 6232824159686133351
      // 137: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 13a: aload 1
      // 13b: ifnonnull 1e0
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: if_icmpne 17e
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: iload 8
      // 151: istore 7
      // 153: aload 0
      // 154: getfield com/finalshell/core/SelectUploadFile.G I
      // 157: iload 7
      // 159: isub
      // 15a: istore 10
      // 15c: iload 10
      // 15e: newarray 8
      // 160: astore 11
      // 162: aload 0
      // 163: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 166: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 169: aload 11
      // 16b: iload 10
      // 16d: invokevirtual com/finalshell/io/To2.F ([BI)V
      // 170: aload 0
      // 171: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 174: bipush 1
      // 175: invokevirtual com/finalshell/core/Cj4.R (Z)V
      // 178: aload 2
      // 179: invokevirtual com/finalshell/core/CK.D$void ()V
      // 17c: bipush 1
      // 17d: ireturn
      // 17e: iinc 8 1
      // 181: aload 1
      // 182: ifnull 11b
      // 185: aload 0
      // 186: getfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 189: aload 4
      // 18b: invokevirtual com/finalshell/io/To2.P ()[B
      // 18e: invokevirtual java/io/PipedOutputStream.write ([B)V
      // 191: aload 0
      // 192: getfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 195: invokevirtual java/io/PipedOutputStream.flush ()V
      // 198: goto 1a4
      // 19b: astore 5
      // 19d: aload 5
      // 19f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1a2: bipush 0
      // 1a3: ireturn
      // 1a4: ldc2_w 388376917454860932
      // 1a7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1aa: aconst_null
      // 1ab: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ae: new com/finalshell/task/T_2
      // 1b1: dup
      // 1b2: aload 0
      // 1b3: aload 4
      // 1b5: iload 3
      // 1b6: aload 2
      // 1b7: invokespecial com/finalshell/task/T_2.<init> (Lcom/finalshell/core/SelectUploadFile;Lcom/finalshell/io/To2;ILcom/finalshell/core/CK;)V
      // 1ba: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1bd: ldc2_w 434592463220957006
      // 1c0: astore 17
      // 1c2: astore 16
      // 1c4: ldc2_w 434592463220957006
      // 1c7: aload 16
      // 1c9: aload 17
      // 1cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ce: pop
      // 1cf: goto 1d6
      // 1d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d5: athrow
      // 1d6: iload 3
      // 1d7: sipush 30071
      // 1da: ldc2_w 7755233323294094450
      // 1dd: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 1e0: aload 1
      // 1e1: ifnonnull 3b8
      // 1e4: if_icmpne 3a7
      // 1e7: goto 1ee
      // 1ea: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: aload 2
      // 1ef: new com/finalshell/core/G
      // 1f2: dup
      // 1f3: aload 0
      // 1f4: aload 2
      // 1f5: invokespecial com/finalshell/core/G.<init> (Lcom/finalshell/core/SelectUploadFile;Lcom/finalshell/core/CK;)V
      // 1f8: invokevirtual com/finalshell/core/CK.I (Lcom/finalshell/core/Fb4;)V
      // 1fb: aload 0
      // 1fc: getfield com/finalshell/core/SelectUploadFile.F Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 1ff: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 202: astore 5
      // 204: new com/finalshell/ui/dialog/Xw2
      // 207: dup
      // 208: aload 5
      // 20a: sipush -18939
      // 20d: sipush -12971
      // 210: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 213: invokespecial com/finalshell/ui/dialog/Xw2.<init> (Ljava/awt/Window;Ljava/lang/String;)V
      // 216: astore 6
      // 218: aload 6
      // 21a: aload 5
      // 21c: invokevirtual com/finalshell/ui/dialog/Xw2.setLocationRelativeTo (Ljava/awt/Component;)V
      // 21f: aload 6
      // 221: bipush 1
      // 222: invokevirtual com/finalshell/ui/dialog/Xw2.setVisible (Z)V
      // 225: aload 6
      // 227: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 22a: ldc2_w 525435051304774885
      // 22d: astore 19
      // 22f: astore 18
      // 231: ldc2_w 525435051304774885
      // 234: aload 18
      // 236: aload 19
      // 238: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23b: checkcast java/lang/Integer
      // 23e: invokevirtual java/lang/Integer.intValue ()I
      // 241: goto 248
      // 244: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 247: athrow
      // 248: istore 7
      // 24a: new java/util/ArrayList
      // 24d: dup
      // 24e: invokespecial java/util/ArrayList.<init> ()V
      // 251: astore 8
      // 253: iload 7
      // 255: aload 1
      // 256: ifnonnull 339
      // 259: ldc2_w 564170828581134815
      // 25c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 25f: aconst_null
      // 260: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 263: if_icmpne 334
      // 266: goto 26d
      // 269: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26c: athrow
      // 26d: aload 6
      // 26f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 272: ldc2_w 441345736697351432
      // 275: astore 21
      // 277: astore 20
      // 279: ldc2_w 441345736697351432
      // 27c: aload 20
      // 27e: aload 21
      // 280: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 283: checkcast java/lang/String
      // 286: goto 28d
      // 289: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: astore 9
      // 28f: aload 6
      // 291: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 294: ldc2_w 269744480676509918
      // 297: astore 23
      // 299: astore 22
      // 29b: ldc2_w 269744480676509918
      // 29e: aload 22
      // 2a0: aload 23
      // 2a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a5: checkcast java/util/ArrayList
      // 2a8: goto 2af
      // 2ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ae: athrow
      // 2af: astore 10
      // 2b1: aload 10
      // 2b3: invokevirtual java/util/ArrayList.size ()I
      // 2b6: aload 1
      // 2b7: ifnonnull 339
      // 2ba: ifle 334
      // 2bd: goto 2c4
      // 2c0: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c3: athrow
      // 2c4: aload 10
      // 2c6: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2c9: astore 11
      // 2cb: aload 11
      // 2cd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d2: ifeq 334
      // 2d5: aload 11
      // 2d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2dc: astore 12
      // 2de: aload 9
      // 2e0: astore 13
      // 2e2: aload 12
      // 2e4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2e7: ldc2_w 492128056065034754
      // 2ea: astore 24
      // 2ec: ldc2_w 492128056065034754
      // 2ef: aload 24
      // 2f1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f4: checkcast java/io/File
      // 2f7: goto 2fe
      // 2fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2fd: athrow
      // 2fe: astore 14
      // 300: aload 14
      // 302: invokevirtual java/io/File.isFile ()Z
      // 305: aload 1
      // 306: ifnonnull 339
      // 309: aload 1
      // 30a: ifnonnull 32f
      // 30d: goto 314
      // 310: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 313: athrow
      // 314: ifeq 330
      // 317: goto 31e
      // 31a: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31d: athrow
      // 31e: aload 8
      // 320: aload 14
      // 322: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 325: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 328: goto 32f
      // 32b: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: pop
      // 330: aload 1
      // 331: ifnull 2cb
      // 334: aload 8
      // 336: invokevirtual java/util/ArrayList.size ()I
      // 339: ifne 372
      // 33c: ldc2_w 388376917454860932
      // 33f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 342: aconst_null
      // 343: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 346: new com/finalshell/task/XU3
      // 349: dup
      // 34a: aload 0
      // 34b: aload 2
      // 34c: invokespecial com/finalshell/task/XU3.<init> (Lcom/finalshell/core/SelectUploadFile;Lcom/finalshell/core/CK;)V
      // 34f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 352: ldc2_w 434592463220957006
      // 355: astore 27
      // 357: astore 26
      // 359: ldc2_w 434592463220957006
      // 35c: aload 26
      // 35e: aload 27
      // 360: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 363: pop
      // 364: goto 36b
      // 367: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36a: athrow
      // 36b: goto 372
      // 36e: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: ldc2_w 388376917454860932
      // 375: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 378: aconst_null
      // 379: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 37c: new com/finalshell/task/Dw4
      // 37f: dup
      // 380: aload 0
      // 381: aload 8
      // 383: aload 2
      // 384: invokespecial com/finalshell/task/Dw4.<init> (Lcom/finalshell/core/SelectUploadFile;Ljava/util/ArrayList;Lcom/finalshell/core/CK;)V
      // 387: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 38a: ldc2_w 434592463220957006
      // 38d: astore 29
      // 38f: astore 28
      // 391: ldc2_w 434592463220957006
      // 394: aload 28
      // 396: aload 29
      // 398: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39b: pop
      // 39c: goto 3a3
      // 39f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a2: athrow
      // 3a3: aload 1
      // 3a4: ifnull 478
      // 3a7: iload 3
      // 3a8: sipush 22623
      // 3ab: ldc2_w 8896031303343593795
      // 3ae: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 3b1: goto 3b8
      // 3b4: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: if_icmpne 478
      // 3bb: new java/io/File
      // 3be: dup
      // 3bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c2: ldc2_w 270389152141252877
      // 3c5: astore 30
      // 3c7: ldc2_w 270389152141252877
      // 3ca: aload 30
      // 3cc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3cf: goto 3d6
      // 3d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d5: athrow
      // 3d6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3d9: ldc2_w 306266403902896148
      // 3dc: astore 33
      // 3de: astore 32
      // 3e0: ldc2_w 306266403902896148
      // 3e3: aload 32
      // 3e5: aload 33
      // 3e7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ea: goto 3f1
      // 3ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f0: athrow
      // 3f1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3f4: ldc2_w 248904686894997647
      // 3f7: astore 35
      // 3f9: astore 34
      // 3fb: ldc2_w 248904686894997647
      // 3fe: aload 34
      // 400: aload 35
      // 402: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 405: checkcast java/lang/String
      // 408: goto 40f
      // 40b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40e: athrow
      // 40f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 412: astore 5
      // 414: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 417: new java/lang/StringBuilder
      // 41a: dup
      // 41b: invokespecial java/lang/StringBuilder.<init> ()V
      // 41e: sipush -18934
      // 421: sipush 7658
      // 424: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 427: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42a: aload 5
      // 42c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 42f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 432: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 435: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 438: aload 2
      // 439: new com/finalshell/core/A_2
      // 43c: dup
      // 43d: aload 0
      // 43e: aload 5
      // 440: aload 2
      // 441: invokespecial com/finalshell/core/A_2.<init> (Lcom/finalshell/core/SelectUploadFile;Ljava/io/File;Lcom/finalshell/core/CK;)V
      // 444: invokevirtual com/finalshell/core/CK.I (Lcom/finalshell/core/Fb4;)V
      // 447: ldc2_w 388376917454860932
      // 44a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 44d: aconst_null
      // 44e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 451: new com/finalshell/task/P82
      // 454: dup
      // 455: aload 0
      // 456: aload 2
      // 457: aload 5
      // 459: invokespecial com/finalshell/task/P82.<init> (Lcom/finalshell/core/SelectUploadFile;Lcom/finalshell/core/CK;Ljava/io/File;)V
      // 45c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 45f: ldc2_w 434592463220957006
      // 462: astore 37
      // 464: astore 36
      // 466: ldc2_w 434592463220957006
      // 469: aload 36
      // 46b: aload 37
      // 46d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 470: pop
      // 471: goto 478
      // 474: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 477: athrow
      // 478: goto 48f
      // 47b: astore 5
      // 47d: aload 5
      // 47f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 482: aload 0
      // 483: bipush 0
      // 484: putfield com/finalshell/core/SelectUploadFile.s Z
      // 487: goto 48f
      // 48a: astore 15
      // 48c: aload 15
      // 48e: athrow
      // 48f: invokestatic java/lang/System.currentTimeMillis ()J
      // 492: lstore 5
      // 494: sipush 8036
      // 497: ldc2_w 8339874633047372420
      // 49a: invokestatic com/finalshell/core/SelectUploadFile.c (IJ)J
      // 49d: invokestatic java/lang/Thread.sleep (J)V
      // 4a0: goto 4aa
      // 4a3: astore 7
      // 4a5: aload 7
      // 4a7: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 4aa: aload 0
      // 4ab: getfield com/finalshell/core/SelectUploadFile.P Z
      // 4ae: ifeq 494
      // 4b1: goto 4b4
      // 4b4: aload 0
      // 4b5: bipush 1
      // 4b6: putfield com/finalshell/core/SelectUploadFile.Y Z
      // 4b9: aload 0
      // 4ba: aload 1
      // 4bb: ifnonnull 503
      // 4be: getfield com/finalshell/core/SelectUploadFile.s Z
      // 4c1: ifne 502
      // 4c4: goto 4cb
      // 4c7: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ca: athrow
      // 4cb: aload 2
      // 4cc: invokevirtual com/finalshell/core/CK.k$boolean ()Z
      // 4cf: ifne 502
      // 4d2: goto 4d9
      // 4d5: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d8: athrow
      // 4d9: aload 0
      // 4da: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 4dd: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 4e0: invokevirtual com/finalshell/io/To2.close ()V
      // 4e3: goto 4f1
      // 4e6: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e9: athrow
      // 4ea: astore 7
      // 4ec: aload 7
      // 4ee: invokevirtual java/io/IOException.printStackTrace ()V
      // 4f1: aload 0
      // 4f2: getfield com/finalshell/core/SelectUploadFile.A Lcom/finalshell/io/IS3;
      // 4f5: invokevirtual com/finalshell/io/IS3.close ()V
      // 4f8: goto 502
      // 4fb: astore 7
      // 4fd: aload 7
      // 4ff: invokevirtual java/io/IOException.printStackTrace ()V
      // 502: aload 0
      // 503: getfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 506: invokevirtual java/io/PipedOutputStream.close ()V
      // 509: goto 513
      // 50c: astore 7
      // 50e: aload 7
      // 510: invokevirtual java/io/IOException.printStackTrace ()V
      // 513: aload 0
      // 514: getfield com/finalshell/core/SelectUploadFile.s Z
      // 517: ireturn
   }

   public Cj4 r$cj_4() {
      return this.K;
   }

   @Override
   public void C(char var1, QT var2) throws IOException {
   }

   public void N() {
      this.X();
      String var10000 = r$String();
      Connect_2 var2 = (Connect_2)this.w;
      String var1 = var10000;
      if (var1 == null) {
         if (var2.G(com.finalshell.ui.model.NZ.StoreCursor)) {
            this.Z(com.finalshell.ui.model.NZ.StoreCursor, false);
            this.Z(com.finalshell.ui.model.NZ.AlternateBuffer, false);
         }

         this.Z(com.finalshell.ui.model.NZ.CursorKey, false);
         this.Z(com.finalshell.ui.model.NZ.CursorVisible, true);
      }
   }

   public void s() {
      this.X();
   }

   public void X() {
      this.C = false;
      this.a.o(0);
   }

   @Override
   public void o(char param1, QT param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/SelectUploadFile.r$String ()Ljava/lang/String;
      // 003: astore 3
      // 004: iload 1
      // 005: aload 3
      // 006: ifnonnull 189
      // 009: lookupswitch 376 13 0 119 5 181 7 130 8 147 9 316 10 230 11 230 12 230 13 164 14 265 15 247 27 333 157 361
      // 07c: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 3
      // 081: ifnull 25f
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 2
      // 08c: invokeinterface com/finalshell/core/QT.Y ()V 1
      // 091: aload 3
      // 092: ifnull 25f
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 2
      // 09d: invokeinterface com/finalshell/core/QT.Q ()V 1
      // 0a2: aload 3
      // 0a3: ifnull 25f
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: aload 2
      // 0ae: invokeinterface com/finalshell/core/QT.D$void ()V 1
      // 0b3: aload 3
      // 0b4: ifnull 25f
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: new java/lang/StringBuilder
      // 0c1: dup
      // 0c2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c5: sipush -18941
      // 0c8: sipush 30598
      // 0cb: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 0ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d1: bipush 1
      // 0d2: newarray 5
      // 0d4: dup
      // 0d5: bipush 0
      // 0d6: iload 1
      // 0d7: castore
      // 0d8: invokestatic com/finalshell/core/SelectUploadFile.T ([C)Ljava/lang/String;
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e1: invokestatic com/finalshell/core/SelectUploadFile.k (Ljava/lang/String;)V
      // 0e4: aload 3
      // 0e5: ifnull 25f
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 2
      // 0f0: invokeinterface com/finalshell/core/QT.M ()V 1
      // 0f5: aload 3
      // 0f6: ifnull 25f
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 2
      // 101: bipush 0
      // 102: invokeinterface com/finalshell/core/QT.R (I)V 2
      // 107: aload 3
      // 108: ifnull 25f
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: sipush -18943
      // 115: sipush 18622
      // 118: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 11b: invokestatic java/lang/Boolean.getBoolean (Ljava/lang/String;)Z
      // 11e: aload 3
      // 11f: ifnonnull 27f
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: ifeq 25f
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 2
      // 134: bipush 1
      // 135: invokeinterface com/finalshell/core/QT.R (I)V 2
      // 13a: aload 3
      // 13b: ifnull 25f
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: aload 2
      // 146: invokeinterface com/finalshell/core/QT.N ()V 1
      // 14b: aload 3
      // 14c: ifnull 25f
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 0
      // 157: aload 0
      // 158: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 15b: invokeinterface com/finalshell/core/Y42.C ()C 1
      // 160: aload 0
      // 161: getfield com/finalshell/core/SelectUploadFile.w Lcom/finalshell/core/QT;
      // 164: invokespecial com/finalshell/core/SelectUploadFile.B (CLcom/finalshell/core/QT;)V
      // 167: aload 3
      // 168: ifnull 25f
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 0
      // 173: invokespecial com/finalshell/core/SelectUploadFile.z ()V
      // 176: aload 3
      // 177: ifnull 25f
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: iload 1
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: sipush 3872
      // 18c: ldc2_w 2386255973238574655
      // 18f: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 192: if_icmpgt 1bd
      // 195: new java/lang/StringBuilder
      // 198: dup
      // 199: sipush -18887
      // 19c: sipush -16374
      // 19f: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 1a2: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1a5: astore 4
      // 1a7: aload 4
      // 1a9: getstatic com/finalshell/ui/model/Dc2.NONE Lcom/finalshell/ui/model/Dc2;
      // 1ac: iload 1
      // 1ad: invokestatic com/finalshell/core/Sd2.Q (Ljava/lang/StringBuilder;Lcom/finalshell/ui/model/Dc2;C)Lcom/finalshell/ui/model/Dc2;
      // 1b0: pop
      // 1b1: aload 4
      // 1b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b6: invokestatic com/finalshell/core/SelectUploadFile.b (Ljava/lang/String;)V
      // 1b9: aload 3
      // 1ba: ifnull 25f
      // 1bd: aload 0
      // 1be: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 1c1: iload 1
      // 1c2: invokeinterface com/finalshell/core/Y42.s (C)V 2
      // 1c7: aload 0
      // 1c8: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 1cb: aload 2
      // 1cc: invokeinterface com/finalshell/core/QT.w$int ()I 1
      // 1d1: invokeinterface com/finalshell/core/Y42.a (I)Ljava/lang/String; 2
      // 1d6: astore 4
      // 1d8: ldc2_w 280429622358205740
      // 1db: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1de: aconst_null
      // 1df: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1e2: aload 3
      // 1e3: ifnonnull 200
      // 1e6: ifeq 257
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 1f4: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: sipush 30071
      // 203: ldc2_w 7755233323294094450
      // 206: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 209: if_icmpne 20c
      // 20c: aload 0
      // 20d: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 210: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 215: sipush 30071
      // 218: ldc2_w 7755233323294094450
      // 21b: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 21e: aload 3
      // 21f: ifnonnull 245
      // 222: if_icmpeq 248
      // 225: goto 22c
      // 228: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: aload 0
      // 22d: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 230: invokeinterface com/finalshell/core/Y42.O ()I 1
      // 235: sipush 22623
      // 238: ldc2_w 8896031303343593795
      // 23b: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 23e: goto 245
      // 241: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 244: athrow
      // 245: if_icmpne 257
      // 248: aload 4
      // 24a: bipush 0
      // 24b: aload 4
      // 24d: invokevirtual java/lang/String.length ()I
      // 250: bipush 2
      // 251: isub
      // 252: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 255: astore 4
      // 257: aload 2
      // 258: aload 4
      // 25a: invokeinterface com/finalshell/core/QT.k (Ljava/lang/String;)V 2
      // 25f: aload 0
      // 260: iload 1
      // 261: putfield com/finalshell/core/SelectUploadFile.d C
      // 264: aload 0
      // 265: invokestatic java/lang/System.currentTimeMillis ()J
      // 268: putfield com/finalshell/core/SelectUploadFile.D J
      // 26b: aload 0
      // 26c: aload 3
      // 26d: ifnonnull 283
      // 270: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 273: invokeinterface com/finalshell/core/Y42.w ()Z 1
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: ifeq 286
      // 282: aload 0
      // 283: invokespecial com/finalshell/core/SelectUploadFile.P ()V
      // 286: return
   }

   public void B(char param1, QT param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/SelectUploadFile.r$String ()Ljava/lang/String;
      // 003: astore 3
      // 004: iload 1
      // 005: tableswitch 1058 32 126 1041 1058 1058 1041 1041 1041 1058 1058 1041 1041 1041 1041 1058 1058 1041 1041 1058 1058 1058 1058 1058 1058 777 800 817 834 1058 1058 1058 857 876 1058 1041 1058 1058 1058 579 596 895 1058 613 1058 1058 1058 1058 630 647 665 683 1058 1058 1058 1058 1058 1058 1058 1058 1058 1058 395 1058 762 1058 1058 1058 1058 1058 919 1058 1058 1058 1058 1058 1058 1058 1058 1058 1058 936 957 1058 1058 1058 1058 1058 1058 1058 1058 1058 1058 1058 1058 978 999 1020
      // 190: new com/finalshell/core/LY
      // 193: dup
      // 194: aload 0
      // 195: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 198: invokespecial com/finalshell/core/LY.<init> (Lcom/finalshell/core/Y42;)V
      // 19b: astore 4
      // 19d: getstatic com/finalshell/core/SelectUploadFile.J Lorg/slf4j/Logger;
      // 1a0: invokeinterface org/slf4j/Logger.isDebugEnabled ()Z 1
      // 1a5: aload 3
      // 1a6: ifnonnull 1ef
      // 1a9: ifeq 1e6
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: getstatic com/finalshell/core/SelectUploadFile.J Lorg/slf4j/Logger;
      // 1b6: new java/lang/StringBuilder
      // 1b9: dup
      // 1ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bd: sipush -18888
      // 1c0: sipush -27261
      // 1c3: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 1c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c9: aload 4
      // 1cb: invokevirtual com/finalshell/core/LY.a$String ()Ljava/lang/String;
      // 1ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d1: ldc_w ")"
      // 1d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1da: invokeinterface org/slf4j/Logger.debug (Ljava/lang/String;)V 2
      // 1df: goto 1e6
      // 1e2: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e5: athrow
      // 1e6: aload 4
      // 1e8: aload 0
      // 1e9: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 1ec: invokevirtual com/finalshell/core/LY.q (Lcom/finalshell/core/Y42;)Z
      // 1ef: aload 3
      // 1f0: ifnonnull 20a
      // 1f3: ifne 439
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: aload 4
      // 200: invokespecial com/finalshell/core/SelectUploadFile.A (Lcom/finalshell/core/LY;)Z
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 209: athrow
      // 20a: istore 5
      // 20c: iload 5
      // 20e: ifne 244
      // 211: getstatic com/finalshell/core/SelectUploadFile.J Lorg/slf4j/Logger;
      // 214: new java/lang/StringBuilder
      // 217: dup
      // 218: invokespecial java/lang/StringBuilder.<init> ()V
      // 21b: sipush -18940
      // 21e: sipush -5086
      // 221: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 224: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 227: aload 4
      // 229: invokevirtual com/finalshell/core/LY.a$String ()Ljava/lang/String;
      // 22c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22f: ldc_w ")"
      // 232: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 235: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 238: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
      // 23d: goto 244
      // 240: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: aload 3
      // 245: ifnull 439
      // 248: aload 2
      // 249: invokeinterface com/finalshell/core/QT.o ()V 1
      // 24e: aload 3
      // 24f: ifnull 439
      // 252: goto 259
      // 255: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: aload 2
      // 25a: invokeinterface com/finalshell/core/QT.K ()V 1
      // 25f: aload 3
      // 260: ifnull 439
      // 263: goto 26a
      // 266: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: aload 2
      // 26b: invokeinterface com/finalshell/core/QT.n ()V 1
      // 270: aload 3
      // 271: ifnull 439
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: aload 2
      // 27c: invokeinterface com/finalshell/core/QT.e ()V 1
      // 281: aload 3
      // 282: ifnull 439
      // 285: goto 28c
      // 288: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28b: athrow
      // 28c: aload 2
      // 28d: bipush 2
      // 28e: invokeinterface com/finalshell/core/QT.X (I)V 2
      // 293: aload 3
      // 294: ifnull 439
      // 297: goto 29e
      // 29a: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29d: athrow
      // 29e: aload 2
      // 29f: bipush 3
      // 2a0: invokeinterface com/finalshell/core/QT.X (I)V 2
      // 2a5: aload 3
      // 2a6: ifnull 439
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: new com/finalshell/core/Dc4
      // 2b3: dup
      // 2b4: aload 0
      // 2b5: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 2b8: invokespecial com/finalshell/core/Dc4.<init> (Lcom/finalshell/core/Y42;)V
      // 2bb: astore 5
      // 2bd: aload 3
      // 2be: ifnonnull 2fb
      // 2c1: aload 0
      // 2c2: aload 5
      // 2c4: invokespecial com/finalshell/core/SelectUploadFile.f (Lcom/finalshell/core/Dc4;)Z
      // 2c7: ifne 439
      // 2ca: goto 2d1
      // 2cd: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d0: athrow
      // 2d1: getstatic com/finalshell/core/SelectUploadFile.J Lorg/slf4j/Logger;
      // 2d4: new java/lang/StringBuilder
      // 2d7: dup
      // 2d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2db: sipush -18936
      // 2de: sipush 14804
      // 2e1: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: aload 5
      // 2e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ef: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: aload 3
      // 2fc: ifnull 439
      // 2ff: aload 0
      // 300: invokespecial com/finalshell/core/SelectUploadFile.z ()V
      // 303: aload 3
      // 304: ifnull 439
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: sipush -18938
      // 311: sipush 13454
      // 314: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 317: invokestatic com/finalshell/core/SelectUploadFile.k (Ljava/lang/String;)V
      // 31a: aload 3
      // 31b: ifnull 439
      // 31e: goto 325
      // 321: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 324: athrow
      // 325: aload 2
      // 326: invokeinterface com/finalshell/core/QT.h ()V 1
      // 32b: aload 3
      // 32c: ifnull 439
      // 32f: goto 336
      // 332: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 335: athrow
      // 336: aload 2
      // 337: invokeinterface com/finalshell/core/QT.t ()V 1
      // 33c: aload 3
      // 33d: ifnull 439
      // 340: goto 347
      // 343: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 346: athrow
      // 347: sipush -18883
      // 34a: sipush 25233
      // 34d: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 350: invokestatic com/finalshell/core/SelectUploadFile.k (Ljava/lang/String;)V
      // 353: aload 3
      // 354: ifnull 439
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: aload 0
      // 35f: getstatic com/finalshell/ui/model/NZ.Keypad Lcom/finalshell/ui/model/NZ;
      // 362: bipush 1
      // 363: invokespecial com/finalshell/core/SelectUploadFile.Z (Lcom/finalshell/ui/model/NZ;Z)V
      // 366: aload 3
      // 367: ifnull 439
      // 36a: goto 371
      // 36d: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 370: athrow
      // 371: aload 0
      // 372: getstatic com/finalshell/ui/model/NZ.Keypad Lcom/finalshell/ui/model/NZ;
      // 375: bipush 0
      // 376: invokespecial com/finalshell/core/SelectUploadFile.Z (Lcom/finalshell/ui/model/NZ;Z)V
      // 379: aload 3
      // 37a: ifnull 439
      // 37d: goto 384
      // 380: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 383: athrow
      // 384: aload 2
      // 385: bipush 1
      // 386: aload 2
      // 387: invokeinterface com/finalshell/core/QT.b ()I 1
      // 38c: invokeinterface com/finalshell/core/QT.i (II)V 3
      // 391: aload 3
      // 392: ifnull 439
      // 395: goto 39c
      // 398: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39b: athrow
      // 39c: aload 2
      // 39d: invokeinterface com/finalshell/core/QT.V ()V 1
      // 3a2: aload 3
      // 3a3: ifnull 439
      // 3a6: goto 3ad
      // 3a9: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ac: athrow
      // 3ad: aload 0
      // 3ae: getfield com/finalshell/core/SelectUploadFile.w Lcom/finalshell/core/QT;
      // 3b1: bipush 2
      // 3b2: invokeinterface com/finalshell/core/QT.R (I)V 2
      // 3b7: aload 3
      // 3b8: ifnull 439
      // 3bb: goto 3c2
      // 3be: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c1: athrow
      // 3c2: aload 0
      // 3c3: getfield com/finalshell/core/SelectUploadFile.w Lcom/finalshell/core/QT;
      // 3c6: bipush 3
      // 3c7: invokeinterface com/finalshell/core/QT.R (I)V 2
      // 3cc: aload 3
      // 3cd: ifnull 439
      // 3d0: goto 3d7
      // 3d3: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: getfield com/finalshell/core/SelectUploadFile.w Lcom/finalshell/core/QT;
      // 3db: bipush 3
      // 3dc: invokeinterface com/finalshell/core/QT.Q (I)V 2
      // 3e1: aload 3
      // 3e2: ifnull 439
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3eb: athrow
      // 3ec: aload 0
      // 3ed: getfield com/finalshell/core/SelectUploadFile.w Lcom/finalshell/core/QT;
      // 3f0: bipush 2
      // 3f1: invokeinterface com/finalshell/core/QT.Q (I)V 2
      // 3f6: aload 3
      // 3f7: ifnull 439
      // 3fa: goto 401
      // 3fd: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 400: athrow
      // 401: aload 0
      // 402: getfield com/finalshell/core/SelectUploadFile.w Lcom/finalshell/core/QT;
      // 405: bipush 1
      // 406: invokeinterface com/finalshell/core/QT.Q (I)V 2
      // 40b: aload 3
      // 40c: ifnull 439
      // 40f: goto 416
      // 412: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 415: athrow
      // 416: aload 0
      // 417: iload 1
      // 418: aload 2
      // 419: invokespecial com/finalshell/core/SelectUploadFile.v (CLcom/finalshell/core/QT;)V
      // 41c: aload 3
      // 41d: ifnull 439
      // 420: goto 427
      // 423: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 426: athrow
      // 427: aload 0
      // 428: bipush 1
      // 429: newarray 5
      // 42b: dup
      // 42c: bipush 0
      // 42d: iload 1
      // 42e: castore
      // 42f: invokevirtual com/finalshell/core/SelectUploadFile.Y ([C)V
      // 432: goto 439
      // 435: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 438: athrow
      // 439: return
   }

   public void z() throws IOException {
      Dc4 var1 = new Dc4(this.a);

      try {
         if (!this.W(var1)) {
            J.warn(a(-18933, 11939) + var1);
         }
      } catch (IOException var2) {
         throw a(var2);
      }
   }

   public boolean f(Dc4 var1) {
      return false;
   }

   public boolean W(Dc4 var1) {
      int var7;
      String var10000 = r$String();
      int var3 = var1.N(0, -1);
      String var2 = var10000;
      var7 = var3;
      if (var2 == null) {
         switch (var3) {
            case 0:
            case 1:
            case 2:
               String var4 = var1.O(1);
               if (var2 != null) {
                  return true;
               }

               if (var4 != null) {
                  this.w.X(var4);
                  return true;
               }
               break;
            case 7:
               return true;
            case 8:
               String var5 = var1.O(2);
               var10000 = var5;
               if (var2 == null) {
                  if (var5 == null) {
                     break;
                  }

                  var10000 = var5;
               }

               if (!var10000.isEmpty()) {
                  this.w.T(var5);
                  if (var2 == null) {
                     return true;
                  }
               }

               this.w.s();
               return true;
            case 10:
            case 11:
               return this.X(var1);
            case 1341:
               List var6 = var1.B();
               this.w.c(var6.subList(1, var6.size()));
               return true;
         }

         var7 = 0;
      }

      return var7 != 0;
   }

   public boolean X(@NotNull Dc4 var1) {
      String var2 = r$String();
      int var10000 = ("?".equals(var1.O(1))) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = var1.N(0, -1);
      }

      int var3;
      XF3 var4;
      label60: {
         var3 = var10000;
         var10000 = var3;
         int var10001 = b(30215, 231012923191621377L);
         if (var2 == null) {
            if (var3 == var10001) {
               var4 = this.w.D$xF_3();
               if (var2 == null) {
                  break label60;
               }
            }

            var10000 = var3;
            if (var2 != null) {
               return var3 != 0;
            }

            var10001 = b(12643, 6699229872075649146L);
         }

         if (var10000 == var10001) {
            var4 = this.w.r();
            if (var2 == null) {
               break label60;
            }
         }

         return 0 != 0;
      }

      if (var4 != null) {
         String var5;
         label31: {
            var5 = var1.T(var3 + ";" + var4.c());
            Logger var7 = J;
            if (var2 == null) {
               if (!J.isDebugEnabled()) {
                  break label31;
               }

               var7 = J;
            }

            var7.debug(a(-18923, -19675) + var3 + a(-18944, 25200) + var5);
         }

         this.w.I(var5);
      }

      return true;
   }

   public void v(char param1, QT param2) throws IOException {
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
      // 004: getfield com/finalshell/core/SelectUploadFile.a Lcom/finalshell/core/Y42;
      // 007: invokeinterface com/finalshell/core/Y42.C ()C 1
      // 00c: istore 4
      // 00e: astore 3
      // 00f: iload 1
      // 010: aload 3
      // 011: ifnonnull 0ae
      // 014: tableswitch 684 32 64 152 684 684 331 661 409 684 684 521 541 561 581 684 601 621 641 684 684 684 684 684 684 684 684 684 684 684 684 684 684 684 684 661
      // 0a8: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: iload 4
      // 0ae: tableswitch 150 70 78 50 73 150 150 150 150 96 114 132
      // 0e0: sipush -18885
      // 0e3: sipush -475
      // 0e6: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 0e9: invokestatic com/finalshell/core/SelectUploadFile.k (Ljava/lang/String;)V
      // 0ec: aload 3
      // 0ed: ifnull 2c0
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: sipush -18925
      // 0fa: sipush -22000
      // 0fd: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 100: invokestatic com/finalshell/core/SelectUploadFile.k (Ljava/lang/String;)V
      // 103: aload 3
      // 104: ifnull 2c0
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: aload 2
      // 10f: bipush 1
      // 110: invokeinterface com/finalshell/core/QT.l (I)V 2
      // 115: aload 3
      // 116: ifnull 2c0
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: aload 2
      // 121: bipush 2
      // 122: invokeinterface com/finalshell/core/QT.l (I)V 2
      // 127: aload 3
      // 128: ifnull 2c0
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: aload 2
      // 133: bipush 3
      // 134: invokeinterface com/finalshell/core/QT.l (I)V 2
      // 139: aload 3
      // 13a: ifnull 2c0
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 0
      // 145: bipush 2
      // 146: newarray 5
      // 148: dup
      // 149: bipush 0
      // 14a: iload 1
      // 14b: castore
      // 14c: dup
      // 14d: bipush 1
      // 14e: iload 4
      // 150: castore
      // 151: invokevirtual com/finalshell/core/SelectUploadFile.Y ([C)V
      // 154: aload 3
      // 155: ifnull 2c0
      // 158: goto 15f
      // 15b: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: iload 4
      // 161: lookupswitch 49 1 56 23
      // 174: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: aload 2
      // 179: sipush 15252
      // 17c: ldc2_w 3925100451407248002
      // 17f: invokestatic com/finalshell/core/SelectUploadFile.b (IJ)I
      // 182: invokeinterface com/finalshell/core/QT.w (C)V 2
      // 187: aload 3
      // 188: ifnull 2c0
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191: athrow
      // 192: aload 0
      // 193: bipush 2
      // 194: newarray 5
      // 196: dup
      // 197: bipush 0
      // 198: iload 1
      // 199: castore
      // 19a: dup
      // 19b: bipush 1
      // 19c: iload 4
      // 19e: castore
      // 19f: invokevirtual com/finalshell/core/SelectUploadFile.Y ([C)V
      // 1a2: aload 3
      // 1a3: ifnull 2c0
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: iload 4
      // 1af: lookupswitch 83 2 64 29 71 29
      // 1c8: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: new java/lang/StringBuilder
      // 1cf: dup
      // 1d0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d3: sipush -18926
      // 1d6: sipush 23772
      // 1d9: invokestatic com/finalshell/core/SelectUploadFile.a (II)Ljava/lang/String;
      // 1dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1df: bipush 2
      // 1e0: newarray 5
      // 1e2: dup
      // 1e3: bipush 0
      // 1e4: iload 1
      // 1e5: castore
      // 1e6: dup
      // 1e7: bipush 1
      // 1e8: iload 4
      // 1ea: castore
      // 1eb: invokestatic com/finalshell/core/SelectUploadFile.T ([C)Ljava/lang/String;
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f4: invokestatic com/finalshell/core/SelectUploadFile.k (Ljava/lang/String;)V
      // 1f7: aload 3
      // 1f8: ifnull 2c0
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 0
      // 203: bipush 2
      // 204: newarray 5
      // 206: dup
      // 207: bipush 0
      // 208: iload 1
      // 209: castore
      // 20a: dup
      // 20b: bipush 1
      // 20c: iload 4
      // 20e: castore
      // 20f: invokevirtual com/finalshell/core/SelectUploadFile.Y ([C)V
      // 212: aload 3
      // 213: ifnull 2c0
      // 216: goto 21d
      // 219: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: aload 2
      // 21e: bipush 0
      // 21f: iload 4
      // 221: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 226: aload 3
      // 227: ifnull 2c0
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: aload 2
      // 232: bipush 1
      // 233: iload 4
      // 235: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 23a: aload 3
      // 23b: ifnull 2c0
      // 23e: goto 245
      // 241: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 244: athrow
      // 245: aload 2
      // 246: bipush 2
      // 247: iload 4
      // 249: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 24e: aload 3
      // 24f: ifnull 2c0
      // 252: goto 259
      // 255: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: aload 2
      // 25a: bipush 3
      // 25b: iload 4
      // 25d: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 262: aload 3
      // 263: ifnull 2c0
      // 266: goto 26d
      // 269: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26c: athrow
      // 26d: aload 2
      // 26e: bipush 1
      // 26f: iload 4
      // 271: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 276: aload 3
      // 277: ifnull 2c0
      // 27a: goto 281
      // 27d: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 280: athrow
      // 281: aload 2
      // 282: bipush 2
      // 283: iload 4
      // 285: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 28a: aload 3
      // 28b: ifnull 2c0
      // 28e: goto 295
      // 291: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: aload 2
      // 296: bipush 3
      // 297: iload 4
      // 299: invokeinterface com/finalshell/core/QT.K (IC)V 3
      // 29e: aload 3
      // 29f: ifnull 2c0
      // 2a2: goto 2a9
      // 2a5: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a8: athrow
      // 2a9: aload 0
      // 2aa: bipush 2
      // 2ab: newarray 5
      // 2ad: dup
      // 2ae: bipush 0
      // 2af: iload 1
      // 2b0: castore
      // 2b1: dup
      // 2b2: bipush 1
      // 2b3: iload 4
      // 2b5: castore
      // 2b6: invokevirtual com/finalshell/core/SelectUploadFile.Y ([C)V
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/SelectUploadFile.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bf: athrow
      // 2c0: return
   }

   public void Y(char[] var1) {
      k(T(var1));
   }

   public static void k(String var0) {
      b(a(-18921, -31701) + var0);
   }

   public static void b(String var0) {
      String var10000 = r$String();
      Q++;
      String var1 = var10000;
      int var2 = Q;
      int var10001 = z;
      if (var1 == null) {
         if (Q < z) {
            int var3 = Q % (z / t);
            if (var1 == null) {
               if (var3 != 0) {
                  return;
               }

               var3 = z / t;
            }

            if (var3 > 1) {
               var0 = var0 + a(-18942, 29653) + z / t + a(-18920, -19475);
            }

            J.warn(var0);
            if (var1 == null) {
               return;
            }
         }

         var2 = z;
         var10001 = b(30071, 7755233323294094450L);
      }

      z = var2 * var10001;
   }

   public static String T(char[] var0) {
      StringBuilder var7;
      StringBuilder var2 = new StringBuilder(a(-18922, -18811));
      char[] var3 = var0;
      int var4 = var0.length;
      String var10000 = r$String();
      int var5 = 0;
      String var1 = var10000;

      while (true) {
         if (var5 < var4) {
            char var6 = var3[var5];
            var2.append((char)b(5774, 4624599632345634717L));
            var7 = var2.append(var6);
            if (var1 != null) {
               break;
            }

            var5++;
            if (var1 == null) {
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return var7.toString();
   }

   public boolean A(LY var1) {
      String var2 = r$String();
      char var10000 = var1.R();
      if (var2 == null) {
         switch (var10000) {
            case '@':
               return this.o(var1);
            case 'A':
               return this.U(var1);
            case 'B':
               return this.J(var1);
            case 'C':
               return this.m(var1);
            case 'D':
               return this.w(var1);
            case 'E':
               return this.s(var1);
            case 'F':
               return this.Q(var1);
            case 'G':
            case '`':
               return this.L(var1);
            case 'H':
            case 'f':
               return this.e(var1);
            case 'I':
            case 'N':
            case 'O':
            case 'Q':
            case 'R':
            case 'U':
            case 'V':
            case 'W':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'e':
            case 'i':
            case 'j':
            case 'k':
            case 'o':
            case 'p':
            case 's':
            default:
               var10000 = 0;
               break;
            case 'J':
               return this.S(var1);
            case 'K':
               return this.F(var1);
            case 'L':
               return this.x(var1);
            case 'M':
               return this.Y(var1);
            case 'P':
               return this.I(var1);
            case 'S':
               return this.V(var1);
            case 'T':
               return this.Z(var1);
            case 'X':
               return this.C(var1);
            case 'c':
               int var5 = (var1.c()) ? 1 : 0;
               if (var2 == null) {
                  if (var5 != 0) {
                     var5 = var1.Q(0, 0);
                     if (var2 == null) {
                        if (var5 == 0) {
                           this.j();
                           return true;
                        }

                        var5 = 0;
                     }

                     return var5 != 0;
                  }

                  var5 = (this.j()) ? 1 : 0;
               }

               return var5 != 0;
            case 'd':
               return this.P(var1);
            case 'g':
               return this.l(var1.Q(0, 0));
            case 'h':
               return this.X(var1, true);
            case 'l':
               return this.X(var1, false);
            case 'm':
               boolean var4 = var1.c();
               if (var2 == null) {
                  if (var4) {
                     return false;
                  }

                  var4 = this.p(var1);
               }

               return var4;
            case 'n':
               return this.v(var1);
            case 'q':
               return this.c(var1);
            case 'r':
               boolean var3 = var1.u();
               if (var2 == null) {
                  if (var3) {
                     return this.g(var1);
                  }

                  var3 = this.a(var1);
               }

               return var3;
            case 't':
               return this.T(var1);
         }
      }

      return var10000 != 0;
   }

   public boolean T(LY var1) {
      String var2 = r$String();
      int var10000 = var1.Q(0, -1);
      if (var2 == null) {
         switch (var10000) {
            case 8:
               int var3 = var1.Q(2, 0);
               int var4 = var1.Q(1, 0);
               var10000 = var3;
               if (var2 == null) {
                  if (var3 == 0) {
                     var3 = this.w.R();
                  }

                  var10000 = var4;
               }

               if (var2 == null) {
                  if (var10000 == 0) {
                     var4 = this.w.b();
                  }

                  this.w.m(new OT(var3, var4), WF3.Remote);
                  var10000 = 1;
               }

               return var10000 != 0;
            case 22:
               return this.u(var1);
            case 23:
               return this.q(var1);
            default:
               var10000 = 0;
         }
      }

      return var10000 != 0;
   }

   public boolean u(LY var1) {
      String var2 = r$String();
      int var10000 = var1.Q(1, -1);
      if (var2 == null) {
         switch (var10000) {
            case 0:
            case 2:
               this.w.v();
               return true;
            case 1:
               return true;
            default:
               var10000 = 0;
         }
      }

      return var10000 != 0;
   }

   public boolean q(LY var1) {
      String var2 = r$String();
      int var10000 = var1.Q(1, -1);
      if (var2 == null) {
         switch (var10000) {
            case 0:
            case 2:
               this.w.C();
               return true;
            case 1:
               return true;
            default:
               var10000 = 0;
         }
      }

      return var10000 != 0;
   }

   public boolean l(int var1) {
      String var2 = r$String();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 == 0) {
            this.w.P();
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000 == 3) {
            this.w.B();
            return true;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }

   public boolean C(LY var1) {
      this.w.e(var1.Q(0, 1));
      return true;
   }

   public boolean X(LY var1, boolean var2) {
      String var3 = r$String();
      int var10000 = (var1.u()) ? 1 : 0;
      if (var3 == null) {
         if (var10000 != 0) {
            var10000 = var1.Q(0, -1);
            if (var3 == null) {
               switch (var10000) {
                  case 1:
                     this.Z(com.finalshell.ui.model.NZ.CursorKey, var2);
                     return true;
                  case 3:
                     this.Z(com.finalshell.ui.model.NZ.WideColumn, var2);
                     return true;
                  case 4:
                     this.Z(com.finalshell.ui.model.NZ.SmoothScroll, var2);
                     return true;
                  case 5:
                     this.Z(com.finalshell.ui.model.NZ.ReverseVideo, var2);
                     return true;
                  case 6:
                     this.Z(com.finalshell.ui.model.NZ.OriginMode, var2);
                     return true;
                  case 7:
                     this.Z(com.finalshell.ui.model.NZ.AutoWrap, var2);
                     return true;
                  case 8:
                     this.Z(com.finalshell.ui.model.NZ.AutoRepeatKeys, var2);
                     return true;
                  case 12:
                     return true;
                  case 25:
                     this.Z(com.finalshell.ui.model.NZ.CursorVisible, var2);
                     return true;
                  case 40:
                     this.Z(com.finalshell.ui.model.NZ.AllowWideColumn, var2);
                     return true;
                  case 45:
                     this.Z(com.finalshell.ui.model.NZ.ReverseWrapAround, var2);
                     return true;
                  case 47:
                  case 1047:
                     this.Z(com.finalshell.ui.model.NZ.AlternateBuffer, var2);
                     return true;
                  case 1000:
                     if (var2) {
                        this.s(YT.MOUSE_REPORTING_NORMAL);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.s(YT.MOUSE_REPORTING_NONE);
                     return true;
                  case 1001:
                     if (var2) {
                        this.s(YT.MOUSE_REPORTING_HILITE);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.s(YT.MOUSE_REPORTING_NONE);
                     return true;
                  case 1002:
                     if (var2) {
                        this.s(YT.MOUSE_REPORTING_BUTTON_MOTION);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.s(YT.MOUSE_REPORTING_NONE);
                     return true;
                  case 1003:
                     if (var2) {
                        this.s(YT.MOUSE_REPORTING_ALL_MOTION);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.s(YT.MOUSE_REPORTING_NONE);
                     return true;
                  case 1005:
                     if (var2) {
                        this.w.L(On4.MOUSE_FORMAT_XTERM_EXT);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.w.L(On4.MOUSE_FORMAT_XTERM);
                     return true;
                  case 1006:
                     if (var2) {
                        this.w.L(On4.MOUSE_FORMAT_SGR);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.w.L(On4.MOUSE_FORMAT_XTERM);
                     return true;
                  case 1015:
                     if (var2) {
                        this.w.L(On4.MOUSE_FORMAT_URXVT);
                        if (var3 == null) {
                           return true;
                        }
                     }

                     this.w.L(On4.MOUSE_FORMAT_XTERM);
                     return true;
                  case 1034:
                     this.Z(com.finalshell.ui.model.NZ.EightBitInput, var2);
                     return true;
                  case 1039:
                     this.Z(com.finalshell.ui.model.NZ.AltSendsEscape, var2);
                     return true;
                  case 1048:
                     this.Z(com.finalshell.ui.model.NZ.StoreCursor, var2);
                     return true;
                  case 1049:
                     this.Z(com.finalshell.ui.model.NZ.StoreCursor, var2);
                     this.Z(com.finalshell.ui.model.NZ.AlternateBuffer, var2);
                     return true;
                  case 2004:
                     this.Z(com.finalshell.ui.model.NZ.BracketedPasteMode, var2);
                     return true;
                  default:
                     var10000 = 0;
               }
            }

            return var10000 != 0;
         }

         var10000 = var1.Q(0, -1);
      }

      if (var3 == null) {
         switch (var10000) {
            case 2:
               this.Z(com.finalshell.ui.model.NZ.KeyboardAction, var2);
               return true;
            case 4:
               this.Z(com.finalshell.ui.model.NZ.InsertMode, var2);
               return true;
            case 12:
               this.Z(com.finalshell.ui.model.NZ.SendReceive, var2);
               return true;
            case 20:
               this.Z(com.finalshell.ui.model.NZ.AutoNewLine, var2);
               return true;
            case 25:
               return true;
            default:
               var10000 = 0;
         }
      }

      return var10000 != 0;
   }

   public boolean P(LY var1) {
      int var2 = var1.Q(0, 1);
      this.w.n(var2);
      return true;
   }

   public boolean g(LY var1) {
      J.warn(a(-18918, -11462) + var1.toString());
      return false;
   }

   public boolean v(LY var1) {
      String var2 = r$String();
      int var10000 = (var1.u()) ? 1 : 0;
      if (var2 == null) {
         if (var10000 != 0) {
            J.warn(a(-18916, 23759));
            return false;
         }

         var10000 = var1.Q(0, 0);
      }

      int var3 = var10000;
      var10000 = var3;
      int var10001 = 5;
      if (var2 == null) {
         if (var3 == 5) {
            String var7 = a(-18931, -20917);
            J.debug(a(-18929, -27032) + var7);
            this.w.I(var7);
            return true;
         }

         var10000 = var3;
         if (var2 != null) {
            return var3 != 0;
         }

         var10001 = b(16191, 8883633026203434552L);
      }

      if (var10000 == var10001) {
         int var4 = this.w.A();
         int var5 = this.w.z();
         String var6 = a(-18886, 9608) + var4 + ";" + var5 + "R";
         J.debug(a(-18937, -8208) + var6);
         this.w.I(var6);
         return true;
      } else {
         J.warn(a(-18927, 11500) + var1.toString());
         return 0 != 0;
      }
   }

   public boolean c(LY var1) {
      String var10000 = r$String();
      this.w.p(1);
      String var2 = var10000;
      int var3 = var1.Q(0, 0);
      if (var2 == null) {
         switch (var3) {
            case 0:
            case 1:
               this.w.R(RP3.BLINK_BLOCK);
               return true;
            case 2:
               this.w.R(RP3.STEADY_BLOCK);
               return true;
            case 3:
               this.w.R(RP3.BLINK_UNDERLINE);
               return true;
            case 4:
               this.w.R(RP3.STEADY_UNDERLINE);
               return true;
            case 5:
               this.w.R(RP3.BLINK_VERTICAL_BAR);
               return true;
            case 6:
               this.w.R(RP3.STEADY_VERTICAL_BAR);
               return true;
            default:
               J.warn(a(-18928, -19864) + var1.toString());
               var3 = 0;
         }
      }

      return var3 != 0;
   }

   public boolean x(LY var1) {
      this.w.M(var1.Q(0, 1));
      return true;
   }

   public boolean j() {
      String var1 = r$String();
      boolean var10000 = J.isDebugEnabled();
      if (var1 == null) {
         if (var10000) {
            J.debug(a(-18935, -28685));
         }

         this.w.R(Sd2.k);
         var10000 = true;
      }

      return var10000;
   }

   public boolean L(LY var1) {
      int var2 = var1.Q(0, 1);
      this.w.A(var2);
      return true;
   }

   public boolean s(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 1);
      String var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         var5 = var3 == 0 ? 1 : var3;
      }

      var3 = var5;
      this.w.T(var3);
      this.w.A(1);
      return true;
   }

   public boolean Q(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 1);
      String var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         var5 = var3 == 0 ? 1 : var3;
      }

      var3 = var5;
      this.w.E(var3);
      this.w.A(1);
      return true;
   }

   public boolean o(LY var1) {
      int var2 = var1.Q(0, 1);
      this.w.u(var2);
      return true;
   }

   public boolean S(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 0);
      String var2 = var10000;
      boolean var4 = var1.u();
      if (var2 == null) {
         if (var4) {
            return false;
         }

         this.w.d(var3);
         var4 = true;
      }

      return var4;
   }

   public boolean F(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 0);
      String var2 = var10000;
      boolean var4 = var1.u();
      if (var2 == null) {
         if (var4) {
            return false;
         }

         this.w.b(var3);
         var4 = true;
      }

      return var4;
   }

   public boolean Y(LY var1) {
      this.w.x(var1.Q(0, 1));
      return true;
   }

   public boolean I(LY var1) {
      int var2 = var1.Q(0, 1);
      this.w.J(var2);
      return true;
   }

   public boolean w(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 1);
      String var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         var5 = var3 == 0 ? 1 : var3;
      }

      var3 = var5;
      this.w.p(var3);
      return true;
   }

   public boolean a(LY var1) {
      int var2 = var1.Q(0, 1);
      int var3 = var1.Q(1, this.w.b());
      this.w.x(var2, var3);
      return true;
   }

   public boolean V(LY var1) {
      int var2 = var1.Q(0, 1);
      this.w.N(var2);
      return true;
   }

   public boolean Z(LY var1) {
      int var2 = var1.Q(0, 1);
      this.w.g(var2);
      return true;
   }

   public boolean m(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 1);
      String var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         var5 = var3 == 0 ? 1 : var3;
      }

      var3 = var5;
      this.w.Z(var3);
      return true;
   }

   public boolean J(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 0);
      String var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         var5 = var3 == 0 ? 1 : var3;
      }

      var3 = var5;
      this.w.T(var3);
      return true;
   }

   public boolean e(LY var1) {
      int var2 = var1.Q(0, 1);
      int var3 = var1.Q(1, 1);
      this.w.i(var3, var2);
      return true;
   }

   public boolean p(LY var1) {
      String var10000 = r$String();
      YP var3 = this.w.I().U();
      String var2 = var10000;
      YP var5 = var3;
      if (var2 == null) {
         if (var3.r() && var1.toString().equals(a(-18913, -10808))) {
         }

         var5 = l(var3, var1);
      }

      YP var4 = var5;
      this.w.c(var4);
      return true;
   }

   @NotNull
   public static YP l(@NotNull YP var0, LY var1) {
      int var7;
      AG var3 = var0.n();
      String var10000 = r$String();
      int var4 = var1.a$int();
      String var2 = var10000;
      int var10 = var4;
      if (var2 == null) {
         if (var4 == 0) {
            var3 = new AG();
         }

         var10 = 0;
      }

      int var5 = var10;

      while (var5 < var4) {
         int var6 = 1;
         var7 = var1.Q(var5, -1);
         int var11 = var7;
         if (var2 == null) {
            if (var7 == -1) {
               J.warn(a(-18919, -31001) + var5);
               var5++;
               if (var2 == null) {
                  continue;
               }
            }

            var11 = var7;
         }

         label90: {
            switch (var11) {
               case 0:
                  var3 = new AG();
                  if (var2 == null) {
                     break;
                  }
               case 1:
                  var3.c(SY.BOLD, true);
                  if (var2 == null) {
                     break;
                  }
               case 2:
                  var3.c(SY.DIM, true);
                  if (var2 == null) {
                     break;
                  }
               case 3:
                  var3.c(SY.ITALIC, true);
                  if (var2 == null) {
                     break;
                  }
               case 4:
                  var3.c(SY.UNDERLINED, true);
                  if (var2 == null) {
                     break;
                  }
               case 5:
                  var3.c(SY.BLINK, true);
                  if (var2 == null) {
                     break;
                  }
               case 7:
                  var3.c(SY.INVERSE, true);
                  if (var2 == null) {
                     break;
                  }
               case 8:
                  var3.c(SY.HIDDEN, true);
                  if (var2 == null) {
                     break;
                  }
               case 22:
                  var3.c(SY.BOLD, false);
                  var3.c(SY.DIM, false);
                  if (var2 == null) {
                     break;
                  }
               case 23:
                  var3.c(SY.ITALIC, false);
                  if (var2 == null) {
                     break;
                  }
               case 24:
                  var3.c(SY.UNDERLINED, false);
                  if (var2 == null) {
                     break;
                  }
               case 25:
                  var3.c(SY.BLINK, false);
                  if (var2 == null) {
                     break;
                  }
               case 27:
                  var3.c(SY.INVERSE, false);
                  if (var2 == null) {
                     break;
                  }
               case 28:
                  var3.c(SY.HIDDEN, false);
                  if (var2 == null) {
                     break;
                  }
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
                  var3.c(Et2.W(var7 - b(8453, 4580677378242977810L)));
                  var3.H(true);
                  if (var2 == null) {
                     break;
                  }
               case 38:
                  var3.H(true);
                  Et2 var8 = v(var1, var5);
                  if (var2 != null) {
                     break label90;
                  }

                  if (var8 == null) {
                     break;
                  }

                  var3.c(var8);
                  var6 = x(var1, var5);
                  if (var2 == null) {
                     break;
                  }
               case 39:
                  var3.c(null);
                  if (var2 == null) {
                     break;
                  }
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
                  var3.v(true);
                  var3.j(Et2.W(var7 - b(8513, 1373035407892750416L)));
                  if (var2 == null) {
                     break;
                  }
               case 48:
                  var3.v(true);
                  Et2 var9 = v(var1, var5);
                  if (var2 != null) {
                     break label90;
                  }

                  if (var9 == null) {
                     break;
                  }

                  var3.j(var9);
                  var6 = x(var1, var5);
                  if (var2 == null) {
                     break;
                  }
               case 49:
                  var3.v(false);
                  var3.j(null);
                  if (var2 == null) {
                     break;
                  }
               case 90:
               case 91:
               case 92:
               case 93:
               case 94:
               case 95:
               case 96:
               case 97:
                  var3.c(S3.M(var7 - b(32604, 4476951528135818820L)));
                  if (var2 == null) {
                     break;
                  }
               case 100:
               case 101:
               case 102:
               case 103:
               case 104:
               case 105:
               case 106:
               case 107:
                  var3.j(S3.M(var7 - b(5323, 6649319782143792591L)));
                  if (var2 == null) {
                     break;
                  }
               case 6:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
               case 21:
               case 26:
               case 29:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 61:
               case 62:
               case 63:
               case 64:
               case 65:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
               case 77:
               case 78:
               case 79:
               case 80:
               case 81:
               case 82:
               case 83:
               case 84:
               case 85:
               case 86:
               case 87:
               case 88:
               case 89:
               case 98:
               case 99:
               default:
                  J.warn(a(-18917, 24790) + var7);
            }

            var5 += var6;
         }

         if (var2 != null) {
            break;
         }
      }

      return var3.y();
   }

   public static Et2 v(LY var0, int var1) {
      int var7;
      String var10000 = r$String();
      int var3 = var0.Q(var1 + 1, 0);
      String var2 = var10000;
      var7 = var3;
      byte var10001 = 2;
      if (var2 == null) {
         if (var3 == 2) {
            int var4 = var0.Q(var1 + 2, -1);
            int var5 = var0.Q(var1 + 3, -1);
            int var6 = var0.Q(var1 + 4, -1);
            if (var2 == null) {
               label50:
               if (var4 >= 0) {
                  int var8 = var4;
                  if (var2 == null) {
                     if (var4 >= b(87, 2930272240152707395L)) {
                        break label50;
                     }

                     var8 = var5;
                  }

                  if (var2 == null) {
                     if (var8 < 0) {
                        break label50;
                     }

                     var8 = var5;
                  }

                  if (var2 == null) {
                     if (var8 >= b(20049, 8273039819131342666L)) {
                        break label50;
                     }

                     var8 = var6;
                  }

                  if (var2 == null) {
                     if (var8 < 0) {
                        break label50;
                     }

                     var8 = var6;
                  }

                  if (var8 < b(20049, 8273039819131342666L)) {
                     return new Et2(var4, var5, var6);
                  }
               }

               J.warn(a(-18924, 10593) + var0.toString());
            }

            return null;
         }

         var7 = var3;
         if (var2 != null) {
            return S3.M(var3);
         }

         var10001 = 5;
      }

      if (var7 != var10001) {
         J.warn(a(-18930, 11647) + var0.toString());
         return null;
      } else {
         return S3.M(var0.Q(var1 + 2, 0));
      }
   }

   public static int x(LY var0, int var1) {
      String var10000 = r$String();
      int var3 = var0.Q(var1 + 1, 0);
      String var2 = var10000;
      int var4 = var3;
      byte var10001 = 2;
      if (var2 == null) {
         if (var3 == 2) {
            return 5;
         }

         var4 = var3;
         if (var2 != null) {
            return var3;
         }

         var10001 = 5;
      }

      return var4 == var10001 ? 3 : 1;
   }

   public boolean U(LY var1) {
      String var10000 = r$String();
      int var3 = var1.Q(0, 0);
      String var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         var5 = var3 == 0 ? 1 : var3;
      }

      var3 = var5;
      this.w.E(var3);
      return true;
   }

   public void Z(com.finalshell.ui.model.NZ var1, boolean var2) {
      String var3 = r$String();
      if (var3 == null) {
         if (J.isDebugEnabled()) {
            J.info(a(-18932, -22594) + var1 + a(-18914, -11658) + var2);
         }

         this.w.o(var1, var2);
      }
   }

   public void s(YT var1) {
      this.w.d(var1);
   }

   @NotNull
   public CompletableFuture I(@NotNull BiConsumer var1) {
      CompletableFuture var2 = new CompletableFuture();
      var1.accept(c(19717, 4536056769698898148L), this::P);
      this.m.add(var2);
      return var2;
   }

   public void P() {
      String var1 = r$String();

      CompletableFuture var2;
      while ((var2 = (CompletableFuture)this.m.poll()) != null) {
         var2.complete(null);
         if (var1 != null) {
            break;
         }
      }
   }

   @Override
   public void f() {
      this.N = false;
      this.X();
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 624731062495880669L;
      Object[] var1 = var10001;
      Ref.h(624731062495880669L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.K.a();
      this.r$void();
   }

   public void H() {
      this.m = null;
      this.o = null;
      this.F = null;
      this.I = null;
      this.K = null;
      this.c = null;
      this.g = null;
      this.L = null;
      this.T = null;
      this.A = null;
      this.Z = null;
   }

   public void r$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.Rg2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static void Y(String var0) {
      V = var0;
   }

   public static String r$String() {
      return V;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -18919) & 65535;
      if (h[var2] == null) {
         char[] var3 = f[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 254;
               break;
            case 1:
               var10000 = 163;
               break;
            case 2:
               var10000 = 179;
               break;
            case 3:
               var10000 = 36;
               break;
            case 4:
               var10000 = 166;
               break;
            case 5:
               var10000 = 92;
               break;
            case 6:
               var10000 = 224;
               break;
            case 7:
               var10000 = 175;
               break;
            case 8:
               var10000 = 31;
               break;
            case 9:
               var10000 = 10;
               break;
            case 10:
               var10000 = 170;
               break;
            case 11:
               var10000 = 136;
               break;
            case 12:
               var10000 = 61;
               break;
            case 13:
               var10000 = 95;
               break;
            case 14:
               var10000 = 17;
               break;
            case 15:
               var10000 = 50;
               break;
            case 16:
               var10000 = 255;
               break;
            case 17:
               var10000 = 222;
               break;
            case 18:
               var10000 = 104;
               break;
            case 19:
               var10000 = 250;
               break;
            case 20:
               var10000 = 12;
               break;
            case 21:
               var10000 = 6;
               break;
            case 22:
               var10000 = 113;
               break;
            case 23:
               var10000 = 233;
               break;
            case 24:
               var10000 = 119;
               break;
            case 25:
               var10000 = 55;
               break;
            case 26:
               var10000 = 148;
               break;
            case 27:
               var10000 = 1;
               break;
            case 28:
               var10000 = 124;
               break;
            case 29:
               var10000 = 246;
               break;
            case 30:
               var10000 = 51;
               break;
            case 31:
               var10000 = 205;
               break;
            case 32:
               var10000 = 151;
               break;
            case 33:
               var10000 = 173;
               break;
            case 34:
               var10000 = 79;
               break;
            case 35:
               var10000 = 93;
               break;
            case 36:
               var10000 = 69;
               break;
            case 37:
               var10000 = 177;
               break;
            case 38:
               var10000 = 122;
               break;
            case 39:
               var10000 = 243;
               break;
            case 40:
               var10000 = 147;
               break;
            case 41:
               var10000 = 115;
               break;
            case 42:
               var10000 = 127;
               break;
            case 43:
               var10000 = 84;
               break;
            case 44:
               var10000 = 198;
               break;
            case 45:
               var10000 = 44;
               break;
            case 46:
               var10000 = 235;
               break;
            case 47:
               var10000 = 103;
               break;
            case 48:
               var10000 = 200;
               break;
            case 49:
               var10000 = 214;
               break;
            case 50:
               var10000 = 16;
               break;
            case 51:
               var10000 = 80;
               break;
            case 52:
               var10000 = 227;
               break;
            case 53:
               var10000 = 182;
               break;
            case 54:
               var10000 = 192;
               break;
            case 55:
               var10000 = 149;
               break;
            case 56:
               var10000 = 97;
               break;
            case 57:
               var10000 = 201;
               break;
            case 58:
               var10000 = 21;
               break;
            case 59:
               var10000 = 185;
               break;
            case 60:
               var10000 = 241;
               break;
            case 61:
               var10000 = 236;
               break;
            case 62:
               var10000 = 107;
               break;
            case 63:
               var10000 = 43;
               break;
            case 64:
               var10000 = 30;
               break;
            case 65:
               var10000 = 183;
               break;
            case 66:
               var10000 = 238;
               break;
            case 67:
               var10000 = 91;
               break;
            case 68:
               var10000 = 34;
               break;
            case 69:
               var10000 = 242;
               break;
            case 70:
               var10000 = 67;
               break;
            case 71:
               var10000 = 145;
               break;
            case 72:
               var10000 = 68;
               break;
            case 73:
               var10000 = 169;
               break;
            case 74:
               var10000 = 134;
               break;
            case 75:
               var10000 = 112;
               break;
            case 76:
               var10000 = 48;
               break;
            case 77:
               var10000 = 76;
               break;
            case 78:
               var10000 = 24;
               break;
            case 79:
               var10000 = 3;
               break;
            case 80:
               var10000 = 209;
               break;
            case 81:
               var10000 = 253;
               break;
            case 82:
               var10000 = 230;
               break;
            case 83:
               var10000 = 215;
               break;
            case 84:
               var10000 = 114;
               break;
            case 85:
               var10000 = 225;
               break;
            case 86:
               var10000 = 168;
               break;
            case 87:
               var10000 = 58;
               break;
            case 88:
               var10000 = 221;
               break;
            case 89:
               var10000 = 240;
               break;
            case 90:
               var10000 = 142;
               break;
            case 91:
               var10000 = 108;
               break;
            case 92:
               var10000 = 159;
               break;
            case 93:
               var10000 = 140;
               break;
            case 94:
               var10000 = 100;
               break;
            case 95:
               var10000 = 237;
               break;
            case 96:
               var10000 = 110;
               break;
            case 97:
               var10000 = 157;
               break;
            case 98:
               var10000 = 211;
               break;
            case 99:
               var10000 = 116;
               break;
            case 100:
               var10000 = 11;
               break;
            case 101:
               var10000 = 74;
               break;
            case 102:
               var10000 = 4;
               break;
            case 103:
               var10000 = 172;
               break;
            case 104:
               var10000 = 218;
               break;
            case 105:
               var10000 = 143;
               break;
            case 106:
               var10000 = 207;
               break;
            case 107:
               var10000 = 63;
               break;
            case 108:
               var10000 = 77;
               break;
            case 109:
               var10000 = 178;
               break;
            case 110:
               var10000 = 102;
               break;
            case 111:
               var10000 = 212;
               break;
            case 112:
               var10000 = 87;
               break;
            case 113:
               var10000 = 126;
               break;
            case 114:
               var10000 = 188;
               break;
            case 115:
               var10000 = 20;
               break;
            case 116:
               var10000 = 25;
               break;
            case 117:
               var10000 = 86;
               break;
            case 118:
               var10000 = 229;
               break;
            case 119:
               var10000 = 162;
               break;
            case 120:
               var10000 = 118;
               break;
            case 121:
               var10000 = 213;
               break;
            case 122:
               var10000 = 71;
               break;
            case 123:
               var10000 = 90;
               break;
            case 124:
               var10000 = 109;
               break;
            case 125:
               var10000 = 49;
               break;
            case 126:
               var10000 = 0;
               break;
            case 127:
               var10000 = 223;
               break;
            case 128:
               var10000 = 9;
               break;
            case 129:
               var10000 = 60;
               break;
            case 130:
               var10000 = 105;
               break;
            case 131:
               var10000 = 184;
               break;
            case 132:
               var10000 = 57;
               break;
            case 133:
               var10000 = 121;
               break;
            case 134:
               var10000 = 217;
               break;
            case 135:
               var10000 = 56;
               break;
            case 136:
               var10000 = 139;
               break;
            case 137:
               var10000 = 206;
               break;
            case 138:
               var10000 = 29;
               break;
            case 139:
               var10000 = 73;
               break;
            case 140:
               var10000 = 82;
               break;
            case 141:
               var10000 = 40;
               break;
            case 142:
               var10000 = 154;
               break;
            case 143:
               var10000 = 226;
               break;
            case 144:
               var10000 = 99;
               break;
            case 145:
               var10000 = 54;
               break;
            case 146:
               var10000 = 133;
               break;
            case 147:
               var10000 = 83;
               break;
            case 148:
               var10000 = 249;
               break;
            case 149:
               var10000 = 138;
               break;
            case 150:
               var10000 = 152;
               break;
            case 151:
               var10000 = 234;
               break;
            case 152:
               var10000 = 94;
               break;
            case 153:
               var10000 = 189;
               break;
            case 154:
               var10000 = 75;
               break;
            case 155:
               var10000 = 111;
               break;
            case 156:
               var10000 = 208;
               break;
            case 157:
               var10000 = 174;
               break;
            case 158:
               var10000 = 141;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 204;
               break;
            case 161:
               var10000 = 146;
               break;
            case 162:
               var10000 = 130;
               break;
            case 163:
               var10000 = 23;
               break;
            case 164:
               var10000 = 180;
               break;
            case 165:
               var10000 = 197;
               break;
            case 166:
               var10000 = 41;
               break;
            case 167:
               var10000 = 193;
               break;
            case 168:
               var10000 = 161;
               break;
            case 169:
               var10000 = 153;
               break;
            case 170:
               var10000 = 128;
               break;
            case 171:
               var10000 = 135;
               break;
            case 172:
               var10000 = 18;
               break;
            case 173:
               var10000 = 62;
               break;
            case 174:
               var10000 = 164;
               break;
            case 175:
               var10000 = 158;
               break;
            case 176:
               var10000 = 137;
               break;
            case 177:
               var10000 = 15;
               break;
            case 178:
               var10000 = 22;
               break;
            case 179:
               var10000 = 78;
               break;
            case 180:
               var10000 = 167;
               break;
            case 181:
               var10000 = 239;
               break;
            case 182:
               var10000 = 39;
               break;
            case 183:
               var10000 = 13;
               break;
            case 184:
               var10000 = 131;
               break;
            case 185:
               var10000 = 5;
               break;
            case 186:
               var10000 = 2;
               break;
            case 187:
               var10000 = 244;
               break;
            case 188:
               var10000 = 64;
               break;
            case 189:
               var10000 = 191;
               break;
            case 190:
               var10000 = 101;
               break;
            case 191:
               var10000 = 196;
               break;
            case 192:
               var10000 = 252;
               break;
            case 193:
               var10000 = 27;
               break;
            case 194:
               var10000 = 32;
               break;
            case 195:
               var10000 = 52;
               break;
            case 196:
               var10000 = 28;
               break;
            case 197:
               var10000 = 231;
               break;
            case 198:
               var10000 = 216;
               break;
            case 199:
               var10000 = 70;
               break;
            case 200:
               var10000 = 106;
               break;
            case 201:
               var10000 = 26;
               break;
            case 202:
               var10000 = 129;
               break;
            case 203:
               var10000 = 165;
               break;
            case 204:
               var10000 = 186;
               break;
            case 205:
               var10000 = 7;
               break;
            case 206:
               var10000 = 98;
               break;
            case 207:
               var10000 = 59;
               break;
            case 208:
               var10000 = 247;
               break;
            case 209:
               var10000 = 14;
               break;
            case 210:
               var10000 = 45;
               break;
            case 211:
               var10000 = 47;
               break;
            case 212:
               var10000 = 203;
               break;
            case 213:
               var10000 = 125;
               break;
            case 214:
               var10000 = 81;
               break;
            case 215:
               var10000 = 248;
               break;
            case 216:
               var10000 = 245;
               break;
            case 217:
               var10000 = 132;
               break;
            case 218:
               var10000 = 228;
               break;
            case 219:
               var10000 = 195;
               break;
            case 220:
               var10000 = 181;
               break;
            case 221:
               var10000 = 194;
               break;
            case 222:
               var10000 = 37;
               break;
            case 223:
               var10000 = 8;
               break;
            case 224:
               var10000 = 232;
               break;
            case 225:
               var10000 = 171;
               break;
            case 226:
               var10000 = 53;
               break;
            case 227:
               var10000 = 144;
               break;
            case 228:
               var10000 = 176;
               break;
            case 229:
               var10000 = 120;
               break;
            case 230:
               var10000 = 35;
               break;
            case 231:
               var10000 = 89;
               break;
            case 232:
               var10000 = 85;
               break;
            case 233:
               var10000 = 33;
               break;
            case 234:
               var10000 = 202;
               break;
            case 235:
               var10000 = 42;
               break;
            case 236:
               var10000 = 210;
               break;
            case 237:
               var10000 = 220;
               break;
            case 238:
               var10000 = 160;
               break;
            case 239:
               var10000 = 199;
               break;
            case 240:
               var10000 = 187;
               break;
            case 241:
               var10000 = 156;
               break;
            case 242:
               var10000 = 88;
               break;
            case 243:
               var10000 = 251;
               break;
            case 244:
               var10000 = 190;
               break;
            case 245:
               var10000 = 65;
               break;
            case 246:
               var10000 = 66;
               break;
            case 247:
               var10000 = 72;
               break;
            case 248:
               var10000 = 19;
               break;
            case 249:
               var10000 = 219;
               break;
            case 250:
               var10000 = 150;
               break;
            case 251:
               var10000 = 46;
               break;
            case 252:
               var10000 = 117;
               break;
            case 253:
               var10000 = 96;
               break;
            case 254:
               var10000 = 155;
               break;
            default:
               var10000 = 123;
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

         h[var2] = new String(var3).intern();
      }

      return h[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 276;
      if (l[var3] == null) {
         l[var3] = (int)(k[var3] ^ var1);
      }

      return l[var3];
   }

   public static long c(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 28129) & 32767;
      if (q[var3] == null) {
         q[var3] = p[var3] ^ var1;
      }

      return q[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var43;
      byte[] var7;
      String[] var21 = new String[37];
      int var19 = 0;
      String var18 = "\u0001\u0081Ðp¬®w\u009b8ÏB\u0010\u0015RÚB@(Ó\u0084%ØxcqÉ|·\u0003×QØ\u0088§/\u0015j\u0005\br\u001f\bØÃ?Ùø+O¤\u001cæC'¶u\u0000õ½Ì\u0094ä}²Gk0\u008aüôÍ\u00105#\u0097FPt}\rtÄm]8\u0002¡Hp?\u0083ìº\u0003|\u0012Ç/gÏ!O\u000b\b_T4N\u0084=d\f6R&\u0099dÉC z\u0002qqHÒLRF\u0082\u0011}\u000eê\u001b\u0094|\u009c\u0091\u008df[-@Ô\u0006ÇÌ9èÅB\u000b/\u001eÀx!,Ø\u0004@:\u001f6÷\u0091Æ\u008cê\u0015É%D\u008a!\tý·\u0094ß¼\u0080É\u001exÛ\u0014DÉþ\u0003á\u009f©\u0098.¡oU\u0084³îiÓvS#@N\u0017\u001d±<\u0086\u00997Ó\u0002-.²çø\u0097\u0089f¶\u0096è¼MÆq~Óì\u0015p\u0088çæJ»\u0010'Ö>udÍi\u0018±]ª\\6´o¼î?ça\u0012o±ÒÈ\u0085\u0089a>½+[Ö³×{\u0015áë\"»\u001dM\u001cÓ<«\u0017ä\u000egu\u0080\u000e**C¿\u0003¢³8\u008eÀ\u0014\u008d+\u0017m¦\u009bYxá\u0012\u0090%\u0016\u000eHÓX´?Úw\\§æ=\u0019-)\u0014Ý\u0018¹ç7\u0005/ï4\u007f\u0006µ\u008d@Ü\u0007gg7m \u0098XðÎ\u008bp×\u0006¾öZÏÂ\u0005=ä\u0019\u001a\u008bãD4Tþµx\u008dÒ=RÎd\u0004©^ôÁ%\u0004\u009dê&\u0018\f(¸t@¾s*\u0092\u009b\u0010]@õ¾î\tÕ\u0013Ç¸\u00827½õ\u008fÀBjR§Ý\u001awõ\u001eþu\u007fU½\t\u0087Õt\u0002M78\nÛÞæ}Á% \u0019\u0095\u001a§\u000f\u0004¡6\u0094=À\u0004(t\u00816ó±ïÚ*Ô¢.[OsTò\u0013ºnCröóD¬\u0019yÝ\u009a\u007fÅyã)$\u0007\u0004Õz\u009d\u0002\røá=\u0092ÌÄ\r\u001fõÇ\tçë\u001f.Þýe\u008d(%\u0082Ù~\u0092\u0097\u008bdZ¥eÏò÷\u001fæøãT\n°\u007fézV%ªÓ¶¿C^ÎÃ\u009dN>ØNç¦©s\u0089Ýë®&,È{rÏ¤\u00ad\u001fRcì_pQf+ZÏgJ\u0088j.íew:¾\u0084AßU.:IF®9ò\u0089»<ì³÷Ó½6v®ñ6Ã7\u0006µÓ\r\u0088\b\u0019J\u001d`ò¾ï¥\u0010«\u0085¶\u0007{LýB`µO2eÉ!j\u0005\u008d:\u0094}é\u0006避戗亢伅敠买\u001c\u0011pÚß¨Ðm\u0093\u009aôë-:ä\u0092»mÆç\u009b\u0003Ëè£¤J¹\u001f\u001fmX\u0095µ\u00802\u0084Áí\u0016\u0014\u009a[Å@\u0091&I\u009a'\u0012üY `b6r9ÛL JßOÎ>\u0094:\u00923\u00ad\u009c\u0012ñ\u009dµ®»åÃ\u00920&\u001cG\u0012D\u0017uÏ\u009f\u000b´\u001c\u0084ùhîþö§WÃlà>\u007f\u0086:÷xOu§wçpÌ$\u000b\u000e%\u0012©\u0083\u001f\u0095Ê%¾\u0002×n¡\u0089\f3/\u0012¥°\u00126YùÕà*ÍJ(¥é\u0007åâ±]¸â";
      int var20 = "\u0001\u0081Ðp¬®w\u009b8ÏB\u0010\u0015RÚB@(Ó\u0084%ØxcqÉ|·\u0003×QØ\u0088§/\u0015j\u0005\br\u001f\bØÃ?Ùø+O¤\u001cæC'¶u\u0000õ½Ì\u0094ä}²Gk0\u008aüôÍ\u00105#\u0097FPt}\rtÄm]8\u0002¡Hp?\u0083ìº\u0003|\u0012Ç/gÏ!O\u000b\b_T4N\u0084=d\f6R&\u0099dÉC z\u0002qqHÒLRF\u0082\u0011}\u000eê\u001b\u0094|\u009c\u0091\u008df[-@Ô\u0006ÇÌ9èÅB\u000b/\u001eÀx!,Ø\u0004@:\u001f6÷\u0091Æ\u008cê\u0015É%D\u008a!\tý·\u0094ß¼\u0080É\u001exÛ\u0014DÉþ\u0003á\u009f©\u0098.¡oU\u0084³îiÓvS#@N\u0017\u001d±<\u0086\u00997Ó\u0002-.²çø\u0097\u0089f¶\u0096è¼MÆq~Óì\u0015p\u0088çæJ»\u0010'Ö>udÍi\u0018±]ª\\6´o¼î?ça\u0012o±ÒÈ\u0085\u0089a>½+[Ö³×{\u0015áë\"»\u001dM\u001cÓ<«\u0017ä\u000egu\u0080\u000e**C¿\u0003¢³8\u008eÀ\u0014\u008d+\u0017m¦\u009bYxá\u0012\u0090%\u0016\u000eHÓX´?Úw\\§æ=\u0019-)\u0014Ý\u0018¹ç7\u0005/ï4\u007f\u0006µ\u008d@Ü\u0007gg7m \u0098XðÎ\u008bp×\u0006¾öZÏÂ\u0005=ä\u0019\u001a\u008bãD4Tþµx\u008dÒ=RÎd\u0004©^ôÁ%\u0004\u009dê&\u0018\f(¸t@¾s*\u0092\u009b\u0010]@õ¾î\tÕ\u0013Ç¸\u00827½õ\u008fÀBjR§Ý\u001awõ\u001eþu\u007fU½\t\u0087Õt\u0002M78\nÛÞæ}Á% \u0019\u0095\u001a§\u000f\u0004¡6\u0094=À\u0004(t\u00816ó±ïÚ*Ô¢.[OsTò\u0013ºnCröóD¬\u0019yÝ\u009a\u007fÅyã)$\u0007\u0004Õz\u009d\u0002\røá=\u0092ÌÄ\r\u001fõÇ\tçë\u001f.Þýe\u008d(%\u0082Ù~\u0092\u0097\u008bdZ¥eÏò÷\u001fæøãT\n°\u007fézV%ªÓ¶¿C^ÎÃ\u009dN>ØNç¦©s\u0089Ýë®&,È{rÏ¤\u00ad\u001fRcì_pQf+ZÏgJ\u0088j.íew:¾\u0084AßU.:IF®9ò\u0089»<ì³÷Ó½6v®ñ6Ã7\u0006µÓ\r\u0088\b\u0019J\u001d`ò¾ï¥\u0010«\u0085¶\u0007{LýB`µO2eÉ!j\u0005\u008d:\u0094}é\u0006避戗亢伅敠买\u001c\u0011pÚß¨Ðm\u0093\u009aôë-:ä\u0092»mÆç\u009b\u0003Ëè£¤J¹\u001f\u001fmX\u0095µ\u00802\u0084Áí\u0016\u0014\u009a[Å@\u0091&I\u009a'\u0012üY `b6r9ÛL JßOÎ>\u0094:\u00923\u00ad\u009c\u0012ñ\u009dµ®»åÃ\u00920&\u001cG\u0012D\u0017uÏ\u009f\u000b´\u001c\u0084ùhîþö§WÃlà>\u007f\u0086:÷xOu§wçpÌ$\u000b\u000e%\u0012©\u0083\u001f\u0095Ê%¾\u0002×n¡\u0089\f3/\u0012¥°\u00126YùÕà*ÍJ(¥é\u0007åâ±]¸â"
         .length();
      char var17 = ')';
      int var25 = -1;
      Y(null);

      label79:
      while (true) {
         byte var10000 = 90;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 90;
                        break;
                     case 1:
                        var77 = 74;
                        break;
                     case 2:
                        var77 = 53;
                        break;
                     case 3:
                        var77 = 75;
                        break;
                     case 4:
                        var77 = 79;
                        break;
                     case 5:
                        var77 = 122;
                        break;
                     default:
                        var77 = 79;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     f = var21;
                     h = new String[37];
                     long var8 = 6840520796343690009L;
                     long[] var14 = new long[20];
                     int var11 = 0;
                     String var12 = "ïdvÕ1ÁcZ¢ö\u0091\u001fºðD\u007f\u0094\u0094ÚÓqfYÞ\u0097\u0001±¢¨kÃ\u0015¯uÊ(\u0011,ey>Aj\u001e7ÇÃa\t®\u009aõ0ÔÜ½ý%\u0001)úáô¤9:Æ©¢0:N{«§Kàãjw£þ©\u0089¿ÒµÏù\u000b\u008d£Ü¶í9\u0085^\u0084-\u0017\u0091\u009d\u000f²\u001d(÷é}ÓhÉ4\u0081lØî\"òÒ\u0004òúÿ@\u00adS!µñêL\u0014v\u008ajRËò©\u008b\u0097a";
                     int var13 = "ïdvÕ1ÁcZ¢ö\u0091\u001fºðD\u007f\u0094\u0094ÚÓqfYÞ\u0097\u0001±¢¨kÃ\u0015¯uÊ(\u0011,ey>Aj\u001e7ÇÃa\t®\u009aõ0ÔÜ½ý%\u0001)úáô¤9:Æ©¢0:N{«§Kàãjw£þ©\u0089¿ÒµÏù\u000b\u008d£Ü¶í9\u0085^\u0084-\u0017\u0091\u009d\u000f²\u001d(÷é}ÓhÉ4\u0081lØî\"òÒ\u0004òúÿ@\u00adS!µñêL\u0014v\u008ajRËò©\u008b\u0097a"
                        .length();
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        long[] var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           long var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    k = var14;
                                    l = new Integer[20];
                                    long var0 = 1254065740895142165L;
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "/\u0094\u0019¼õâa\u0095bÚyïm\u001e³\u009b";
                                    int var5 = "/\u0094\u0019¼õâa\u0095bÚyïm\u001e³\u009b".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
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
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    p = var6;
                                    q = new Long[2];
                                    J = LoggerFactory.getLogger(SelectUploadFile.class);
                                    Q = 0;
                                    t = b(16533, 1880854355273499023L);
                                    z = t;
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "ËccÊià\u0094\u0012¸\u0096\u0080¨\u0089t]'";
                                 var13 = "ËccÊià\u0094\u0012¸\u0096\u0080¨\u0089t]'".length();
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = "É<#.&À´+ém³(Å\u0084\u0010\u0094Ê_\u001dz©\u008aÃ×¦òÒ«\u009c\r0gu_\u0002\u0006Iµ";
                  var20 = "É<#.&À´+ém³(Å\u0084\u0010\u0094Ê_\u001dz©\u008aÃ×¦òÒ«\u009c\r0gu_\u0002\u0006Iµ".length();
                  var17 = 2;
                  var25 = -1;
            }

            var10000 = 78;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}





