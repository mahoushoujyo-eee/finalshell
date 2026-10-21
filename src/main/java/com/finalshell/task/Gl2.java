package com.finalshell.task;

import com.finalshell.core.Connect_2;

public class Gl2 extends Thread {
   public final Connect_2 f;
   public static String[] a;
   public static String[] b;
   public static long c;
   public static long[] d;
   public static Long[] e;

   public Gl2(Connect_2 var1) {
      this.f = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 003: istore 1
      // 004: sipush 20673
      // 007: ldc2_w 8637889578945651195
      // 00a: invokestatic com/finalshell/task/Gl2.a (IJ)J
      // 00d: invokestatic java/lang/Thread.sleep (J)V
      // 010: goto 018
      // 013: astore 2
      // 014: iload 1
      // 015: ifeq 364
      // 018: aload 0
      // 019: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 01c: getfield com/finalshell/core/Connect_2.dD Z
      // 01f: iload 1
      // 020: ifne 053
      // 023: goto 02a
      // 026: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 029: athrow
      // 02a: ifeq 03f
      // 02d: goto 034
      // 030: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 033: athrow
      // 034: iload 1
      // 035: ifeq 004
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 043: getfield com/finalshell/core/Connect_2.b J
      // 046: lconst_0
      // 047: iload 1
      // 048: ifne 060
      // 04b: lcmp
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 052: athrow
      // 053: ifle 004
      // 056: invokestatic java/lang/System.currentTimeMillis ()J
      // 059: aload 0
      // 05a: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 05d: getfield com/finalshell/core/Connect_2.b J
      // 060: lsub
      // 061: lstore 2
      // 062: aload 0
      // 063: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 066: invokestatic com/finalshell/core/Connect_2.W (Lcom/finalshell/core/Connect_2;)I
      // 069: istore 4
      // 06b: aload 0
      // 06c: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 06f: invokestatic com/finalshell/core/Connect_2.y (Lcom/finalshell/core/Connect_2;)Lcom/finalshell/core/Im4;
      // 072: invokevirtual com/finalshell/core/Im4.H ()I
      // 075: istore 5
      // 077: invokestatic java/lang/System.currentTimeMillis ()J
      // 07a: aload 0
      // 07b: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 07e: getfield com/finalshell/core/Connect_2.I J
      // 081: lsub
      // 082: lstore 6
      // 084: invokestatic java/lang/System.currentTimeMillis ()J
      // 087: aload 0
      // 088: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 08b: getfield com/finalshell/core/Connect_2.R J
      // 08e: lsub
      // 08f: lstore 8
      // 091: lload 2
      // 092: sipush 3446
      // 095: ldc2_w 8756032399858007119
      // 098: invokestatic com/finalshell/task/Gl2.a (IJ)J
      // 09b: lcmp
      // 09c: iload 1
      // 09d: ifne 0bd
      // 0a0: ifle 361
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a9: athrow
      // 0aa: lload 6
      // 0ac: sipush 5123
      // 0af: ldc2_w 3858904791226246456
      // 0b2: invokestatic com/finalshell/task/Gl2.a (IJ)J
      // 0b5: lcmp
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0bc: athrow
      // 0bd: iload 1
      // 0be: ifne 0d9
      // 0c1: ifle 361
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 0cf: getfield com/finalshell/core/Connect_2.J Z
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0d8: athrow
      // 0d9: iload 1
      // 0da: ifne 0f2
      // 0dd: ifne 361
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e6: athrow
      // 0e7: iload 4
      // 0e9: bipush 1
      // 0ea: isub
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f1: athrow
      // 0f2: istore 10
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 0f8: invokestatic com/finalshell/core/Connect_2.y (Lcom/finalshell/core/Connect_2;)Lcom/finalshell/core/Im4;
      // 0fb: invokevirtual com/finalshell/core/Im4.l ()Lcom/finalshell/core/Ua2;
      // 0fe: iload 10
      // 100: invokevirtual com/finalshell/core/Ua2.t (I)Lcom/finalshell/core/DC3;
      // 103: astore 11
      // 105: aload 0
      // 106: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 109: invokestatic com/finalshell/core/Connect_2.y (Lcom/finalshell/core/Connect_2;)Lcom/finalshell/core/Im4;
      // 10c: invokevirtual com/finalshell/core/Im4.l ()Lcom/finalshell/core/Ua2;
      // 10f: iload 10
      // 111: bipush 1
      // 112: isub
      // 113: invokevirtual com/finalshell/core/Ua2.t (I)Lcom/finalshell/core/DC3;
      // 116: astore 12
      // 118: aload 11
      // 11a: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 11d: ldc ""
      // 11f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 122: ifne 361
      // 125: aload 0
      // 126: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 129: getfield com/finalshell/core/Connect_2.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 12c: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 12f: astore 13
      // 131: aload 11
      // 133: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 136: astore 14
      // 138: new com/finalshell/core/TN3
      // 13b: dup
      // 13c: invokespecial com/finalshell/core/TN3.<init> ()V
      // 13f: aload 14
      // 141: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 144: aload 0
      // 145: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 148: getfield com/finalshell/core/Connect_2.n Ljava/lang/String;
      // 14b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 14e: invokevirtual com/finalshell/core/TN3.N (Ljava/lang/String;Ljava/lang/String;)D
      // 151: dstore 15
      // 153: bipush 0
      // 154: istore 17
      // 156: dload 15
      // 158: ldc2_w 0.5
      // 15b: dcmpl
      // 15c: iload 1
      // 15d: ifne 18c
      // 160: ifgt 18b
      // 163: goto 16a
      // 166: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 16e: getfield com/finalshell/core/Connect_2.n Ljava/lang/String;
      // 171: ldc ""
      // 173: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 176: iload 1
      // 177: ifne 18f
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 180: athrow
      // 181: ifeq 18e
      // 184: goto 18b
      // 187: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 18a: athrow
      // 18b: bipush 1
      // 18c: istore 17
      // 18e: bipush 0
      // 18f: istore 18
      // 191: aload 13
      // 193: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.c$KeyEvent ()Ljava/awt/event/KeyEvent;
      // 196: iload 1
      // 197: ifne 1b0
      // 19a: ifnull 1b5
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1a3: athrow
      // 1a4: aload 13
      // 1a6: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.c$KeyEvent ()Ljava/awt/event/KeyEvent;
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1af: athrow
      // 1b0: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 1b3: istore 18
      // 1b5: aload 0
      // 1b6: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 1b9: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 1bc: iload 1
      // 1bd: ifne 1db
      // 1c0: ifnull 1f8
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 1ce: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 1d1: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1da: athrow
      // 1db: sipush 4233
      // 1de: sipush 13600
      // 1e1: invokestatic com/finalshell/task/Gl2.a (II)Ljava/lang/String;
      // 1e4: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1e7: iload 1
      // 1e8: ifne 1fa
      // 1eb: ifeq 1f8
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1f4: athrow
      // 1f5: bipush 1
      // 1f6: istore 17
      // 1f8: iload 17
      // 1fa: ifeq 361
      // 1fd: aload 0
      // 1fe: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 201: aload 14
      // 203: putfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 206: aload 0
      // 207: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 20a: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 20d: ifnull 217
      // 210: goto 217
      // 213: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 216: athrow
      // 217: aload 0
      // 218: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 21b: iload 4
      // 21d: putfield com/finalshell/core/Connect_2.g I
      // 220: aload 0
      // 221: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 224: iload 5
      // 226: putfield com/finalshell/core/Connect_2.M I
      // 229: aload 0
      // 22a: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 22d: bipush 1
      // 22e: putfield com/finalshell/core/Connect_2.J Z
      // 231: invokestatic java/lang/System.currentTimeMillis ()J
      // 234: aload 13
      // 236: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.Z$long ()J
      // 239: lsub
      // 23a: lstore 19
      // 23c: aload 13
      // 23e: bipush 0
      // 23f: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.b$void (Z)V
      // 242: aload 13
      // 244: bipush 0
      // 245: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.e (Z)V
      // 248: aload 0
      // 249: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 24c: iload 1
      // 24d: ifne 357
      // 250: getfield com/finalshell/core/Connect_2.y Z
      // 253: ifne 337
      // 256: goto 25d
      // 259: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 25c: athrow
      // 25d: new com/finalshell/core/TN3
      // 260: dup
      // 261: invokespecial com/finalshell/core/TN3.<init> ()V
      // 264: aload 11
      // 266: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 269: aload 0
      // 26a: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 26d: getfield com/finalshell/core/Connect_2.n Ljava/lang/String;
      // 270: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 273: invokevirtual com/finalshell/core/TN3.N (Ljava/lang/String;Ljava/lang/String;)D
      // 276: dstore 21
      // 278: iload 1
      // 279: ifne 353
      // 27c: iload 18
      // 27e: getstatic com/finalshell/task/Gl2.c J
      // 281: l2i
      // 282: if_icmpne 337
      // 285: goto 28c
      // 288: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 28b: athrow
      // 28c: iload 17
      // 28e: iload 1
      // 28f: ifne 2b7
      // 292: goto 299
      // 295: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 298: athrow
      // 299: ifeq 32f
      // 29c: goto 2a3
      // 29f: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2a2: athrow
      // 2a3: aload 0
      // 2a4: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 2a7: invokestatic com/finalshell/core/Connect_2.y (Lcom/finalshell/core/Connect_2;)Lcom/finalshell/core/Im4;
      // 2aa: invokevirtual com/finalshell/core/Im4.H ()I
      // 2ad: iload 10
      // 2af: iadd
      // 2b0: goto 2b7
      // 2b3: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2b6: athrow
      // 2b7: istore 23
      // 2b9: aload 12
      // 2bb: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 2be: astore 24
      // 2c0: aload 0
      // 2c1: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 2c4: iload 1
      // 2c5: ifne 333
      // 2c8: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 2cb: sipush 4232
      // 2ce: sipush -17277
      // 2d1: invokestatic com/finalshell/task/Gl2.a (II)Ljava/lang/String;
      // 2d4: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2d7: ifeq 32f
      // 2da: goto 2e1
      // 2dd: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2e0: athrow
      // 2e1: aload 24
      // 2e3: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2e6: astore 25
      // 2e8: iload 23
      // 2ea: aload 0
      // 2eb: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 2ee: getfield com/finalshell/core/Connect_2.B I
      // 2f1: isub
      // 2f2: bipush 1
      // 2f3: iload 1
      // 2f4: ifne 32c
      // 2f7: if_icmpne 31a
      // 2fa: goto 301
      // 2fd: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 300: athrow
      // 301: aload 0
      // 302: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 305: aload 0
      // 306: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 309: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 30c: invokevirtual com/finalshell/core/Connect_2.r (Ljava/lang/String;)V
      // 30f: iload 1
      // 310: ifeq 32f
      // 313: goto 31a
      // 316: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 319: athrow
      // 31a: iload 23
      // 31c: aload 0
      // 31d: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 320: getfield com/finalshell/core/Connect_2.B I
      // 323: isub
      // 324: bipush 1
      // 325: goto 32c
      // 328: invokestatic com/finalshell/task/Gl2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 32b: athrow
      // 32c: if_icmple 32f
      // 32f: aload 0
      // 330: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 333: bipush 1
      // 334: putfield com/finalshell/core/Connect_2.y Z
      // 337: aload 0
      // 338: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 33b: aload 0
      // 33c: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 33f: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 342: putfield com/finalshell/core/Connect_2.q Ljava/lang/String;
      // 345: aload 0
      // 346: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 349: aload 0
      // 34a: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 34d: getfield com/finalshell/core/Connect_2.h Ljava/lang/String;
      // 350: putfield com/finalshell/core/Connect_2.n Ljava/lang/String;
      // 353: aload 0
      // 354: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 357: aload 0
      // 358: getfield com/finalshell/task/Gl2.f Lcom/finalshell/core/Connect_2;
      // 35b: getfield com/finalshell/core/Connect_2.z Ljava/lang/String;
      // 35e: putfield com/finalshell/core/Connect_2.c Ljava/lang/String;
      // 361: goto 004
      // 364: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 4232) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 228;
               break;
            case 1:
               var10000 = 244;
               break;
            case 2:
               var10000 = 225;
               break;
            case 3:
               var10000 = 227;
               break;
            case 4:
               var10000 = 110;
               break;
            case 5:
               var10000 = 3;
               break;
            case 6:
               var10000 = 233;
               break;
            case 7:
               var10000 = 148;
               break;
            case 8:
               var10000 = 144;
               break;
            case 9:
               var10000 = 188;
               break;
            case 10:
               var10000 = 127;
               break;
            case 11:
               var10000 = 206;
               break;
            case 12:
               var10000 = 175;
               break;
            case 13:
               var10000 = 86;
               break;
            case 14:
               var10000 = 203;
               break;
            case 15:
               var10000 = 45;
               break;
            case 16:
               var10000 = 218;
               break;
            case 17:
               var10000 = 15;
               break;
            case 18:
               var10000 = 143;
               break;
            case 19:
               var10000 = 242;
               break;
            case 20:
               var10000 = 136;
               break;
            case 21:
               var10000 = 243;
               break;
            case 22:
               var10000 = 113;
               break;
            case 23:
               var10000 = 70;
               break;
            case 24:
               var10000 = 84;
               break;
            case 25:
               var10000 = 158;
               break;
            case 26:
               var10000 = 205;
               break;
            case 27:
               var10000 = 222;
               break;
            case 28:
               var10000 = 154;
               break;
            case 29:
               var10000 = 241;
               break;
            case 30:
               var10000 = 151;
               break;
            case 31:
               var10000 = 162;
               break;
            case 32:
               var10000 = 137;
               break;
            case 33:
               var10000 = 145;
               break;
            case 34:
               var10000 = 102;
               break;
            case 35:
               var10000 = 248;
               break;
            case 36:
               var10000 = 41;
               break;
            case 37:
               var10000 = 44;
               break;
            case 38:
               var10000 = 178;
               break;
            case 39:
               var10000 = 131;
               break;
            case 40:
               var10000 = 71;
               break;
            case 41:
               var10000 = 65;
               break;
            case 42:
               var10000 = 49;
               break;
            case 43:
               var10000 = 91;
               break;
            case 44:
               var10000 = 5;
               break;
            case 45:
               var10000 = 53;
               break;
            case 46:
               var10000 = 187;
               break;
            case 47:
               var10000 = 199;
               break;
            case 48:
               var10000 = 193;
               break;
            case 49:
               var10000 = 18;
               break;
            case 50:
               var10000 = 57;
               break;
            case 51:
               var10000 = 183;
               break;
            case 52:
               var10000 = 192;
               break;
            case 53:
               var10000 = 164;
               break;
            case 54:
               var10000 = 207;
               break;
            case 55:
               var10000 = 171;
               break;
            case 56:
               var10000 = 150;
               break;
            case 57:
               var10000 = 180;
               break;
            case 58:
               var10000 = 10;
               break;
            case 59:
               var10000 = 77;
               break;
            case 60:
               var10000 = 161;
               break;
            case 61:
               var10000 = 76;
               break;
            case 62:
               var10000 = 253;
               break;
            case 63:
               var10000 = 81;
               break;
            case 64:
               var10000 = 198;
               break;
            case 65:
               var10000 = 89;
               break;
            case 66:
               var10000 = 47;
               break;
            case 67:
               var10000 = 153;
               break;
            case 68:
               var10000 = 68;
               break;
            case 69:
               var10000 = 156;
               break;
            case 70:
               var10000 = 98;
               break;
            case 71:
               var10000 = 135;
               break;
            case 72:
               var10000 = 24;
               break;
            case 73:
               var10000 = 249;
               break;
            case 74:
               var10000 = 90;
               break;
            case 75:
               var10000 = 25;
               break;
            case 76:
               var10000 = 46;
               break;
            case 77:
               var10000 = 61;
               break;
            case 78:
               var10000 = 217;
               break;
            case 79:
               var10000 = 69;
               break;
            case 80:
               var10000 = 223;
               break;
            case 81:
               var10000 = 226;
               break;
            case 82:
               var10000 = 93;
               break;
            case 83:
               var10000 = 179;
               break;
            case 84:
               var10000 = 19;
               break;
            case 85:
               var10000 = 43;
               break;
            case 86:
               var10000 = 48;
               break;
            case 87:
               var10000 = 85;
               break;
            case 88:
               var10000 = 216;
               break;
            case 89:
               var10000 = 235;
               break;
            case 90:
               var10000 = 134;
               break;
            case 91:
               var10000 = 174;
               break;
            case 92:
               var10000 = 106;
               break;
            case 93:
               var10000 = 79;
               break;
            case 94:
               var10000 = 152;
               break;
            case 95:
               var10000 = 128;
               break;
            case 96:
               var10000 = 117;
               break;
            case 97:
               var10000 = 147;
               break;
            case 98:
               var10000 = 215;
               break;
            case 99:
               var10000 = 55;
               break;
            case 100:
               var10000 = 122;
               break;
            case 101:
               var10000 = 238;
               break;
            case 102:
               var10000 = 141;
               break;
            case 103:
               var10000 = 100;
               break;
            case 104:
               var10000 = 224;
               break;
            case 105:
               var10000 = 11;
               break;
            case 106:
               var10000 = 104;
               break;
            case 107:
               var10000 = 95;
               break;
            case 108:
               var10000 = 64;
               break;
            case 109:
               var10000 = 168;
               break;
            case 110:
               var10000 = 160;
               break;
            case 111:
               var10000 = 9;
               break;
            case 112:
               var10000 = 105;
               break;
            case 113:
               var10000 = 52;
               break;
            case 114:
               var10000 = 54;
               break;
            case 115:
               var10000 = 196;
               break;
            case 116:
               var10000 = 2;
               break;
            case 117:
               var10000 = 51;
               break;
            case 118:
               var10000 = 181;
               break;
            case 119:
               var10000 = 12;
               break;
            case 120:
               var10000 = 108;
               break;
            case 121:
               var10000 = 28;
               break;
            case 122:
               var10000 = 254;
               break;
            case 123:
               var10000 = 1;
               break;
            case 124:
               var10000 = 126;
               break;
            case 125:
               var10000 = 172;
               break;
            case 126:
               var10000 = 17;
               break;
            case 127:
               var10000 = 107;
               break;
            case 128:
               var10000 = 177;
               break;
            case 129:
               var10000 = 75;
               break;
            case 130:
               var10000 = 115;
               break;
            case 131:
               var10000 = 186;
               break;
            case 132:
               var10000 = 176;
               break;
            case 133:
               var10000 = 119;
               break;
            case 134:
               var10000 = 42;
               break;
            case 135:
               var10000 = 80;
               break;
            case 136:
               var10000 = 239;
               break;
            case 137:
               var10000 = 26;
               break;
            case 138:
               var10000 = 133;
               break;
            case 139:
               var10000 = 159;
               break;
            case 140:
               var10000 = 138;
               break;
            case 141:
               var10000 = 38;
               break;
            case 142:
               var10000 = 87;
               break;
            case 143:
               var10000 = 63;
               break;
            case 144:
               var10000 = 88;
               break;
            case 145:
               var10000 = 212;
               break;
            case 146:
               var10000 = 142;
               break;
            case 147:
               var10000 = 166;
               break;
            case 148:
               var10000 = 213;
               break;
            case 149:
               var10000 = 229;
               break;
            case 150:
               var10000 = 191;
               break;
            case 151:
               var10000 = 184;
               break;
            case 152:
               var10000 = 230;
               break;
            case 153:
               var10000 = 123;
               break;
            case 154:
               var10000 = 211;
               break;
            case 155:
               var10000 = 251;
               break;
            case 156:
               var10000 = 219;
               break;
            case 157:
               var10000 = 173;
               break;
            case 158:
               var10000 = 236;
               break;
            case 159:
               var10000 = 33;
               break;
            case 160:
               var10000 = 190;
               break;
            case 161:
               var10000 = 21;
               break;
            case 162:
               var10000 = 29;
               break;
            case 163:
               var10000 = 22;
               break;
            case 164:
               var10000 = 165;
               break;
            case 165:
               var10000 = 7;
               break;
            case 166:
               var10000 = 120;
               break;
            case 167:
               var10000 = 170;
               break;
            case 168:
               var10000 = 234;
               break;
            case 169:
               var10000 = 62;
               break;
            case 170:
               var10000 = 146;
               break;
            case 171:
               var10000 = 245;
               break;
            case 172:
               var10000 = 83;
               break;
            case 173:
               var10000 = 200;
               break;
            case 174:
               var10000 = 114;
               break;
            case 175:
               var10000 = 37;
               break;
            case 176:
               var10000 = 31;
               break;
            case 177:
               var10000 = 103;
               break;
            case 178:
               var10000 = 204;
               break;
            case 179:
               var10000 = 118;
               break;
            case 180:
               var10000 = 97;
               break;
            case 181:
               var10000 = 74;
               break;
            case 182:
               var10000 = 4;
               break;
            case 183:
               var10000 = 237;
               break;
            case 184:
               var10000 = 232;
               break;
            case 185:
               var10000 = 82;
               break;
            case 186:
               var10000 = 132;
               break;
            case 187:
               var10000 = 140;
               break;
            case 188:
               var10000 = 94;
               break;
            case 189:
               var10000 = 208;
               break;
            case 190:
               var10000 = 149;
               break;
            case 191:
               var10000 = 34;
               break;
            case 192:
               var10000 = 67;
               break;
            case 193:
               var10000 = 50;
               break;
            case 194:
               var10000 = 169;
               break;
            case 195:
               var10000 = 252;
               break;
            case 196:
               var10000 = 195;
               break;
            case 197:
               var10000 = 14;
               break;
            case 198:
               var10000 = 197;
               break;
            case 199:
               var10000 = 201;
               break;
            case 200:
               var10000 = 255;
               break;
            case 201:
               var10000 = 124;
               break;
            case 202:
               var10000 = 112;
               break;
            case 203:
               var10000 = 30;
               break;
            case 204:
               var10000 = 130;
               break;
            case 205:
               var10000 = 231;
               break;
            case 206:
               var10000 = 16;
               break;
            case 207:
               var10000 = 221;
               break;
            case 208:
               var10000 = 39;
               break;
            case 209:
               var10000 = 56;
               break;
            case 210:
               var10000 = 129;
               break;
            case 211:
               var10000 = 20;
               break;
            case 212:
               var10000 = 13;
               break;
            case 213:
               var10000 = 202;
               break;
            case 214:
               var10000 = 182;
               break;
            case 215:
               var10000 = 27;
               break;
            case 216:
               var10000 = 157;
               break;
            case 217:
               var10000 = 240;
               break;
            case 218:
               var10000 = 167;
               break;
            case 219:
               var10000 = 101;
               break;
            case 220:
               var10000 = 116;
               break;
            case 221:
               var10000 = 92;
               break;
            case 222:
               var10000 = 247;
               break;
            case 223:
               var10000 = 121;
               break;
            case 224:
               var10000 = 8;
               break;
            case 225:
               var10000 = 78;
               break;
            case 226:
               var10000 = 214;
               break;
            case 227:
               var10000 = 32;
               break;
            case 228:
               var10000 = 185;
               break;
            case 229:
               var10000 = 99;
               break;
            case 230:
               var10000 = 59;
               break;
            case 231:
               var10000 = 66;
               break;
            case 232:
               var10000 = 60;
               break;
            case 233:
               var10000 = 23;
               break;
            case 234:
               var10000 = 155;
               break;
            case 235:
               var10000 = 125;
               break;
            case 236:
               var10000 = 189;
               break;
            case 237:
               var10000 = 58;
               break;
            case 238:
               var10000 = 246;
               break;
            case 239:
               var10000 = 72;
               break;
            case 240:
               var10000 = 35;
               break;
            case 241:
               var10000 = 250;
               break;
            case 242:
               var10000 = 209;
               break;
            case 243:
               var10000 = 36;
               break;
            case 244:
               var10000 = 210;
               break;
            case 245:
               var10000 = 0;
               break;
            case 246:
               var10000 = 220;
               break;
            case 247:
               var10000 = 73;
               break;
            case 248:
               var10000 = 111;
               break;
            case 249:
               var10000 = 194;
               break;
            case 250:
               var10000 = 139;
               break;
            case 251:
               var10000 = 96;
               break;
            case 252:
               var10000 = 163;
               break;
            case 253:
               var10000 = 6;
               break;
            case 254:
               var10000 = 109;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 28987) & 32767;
      if (e[var3] == null) {
         e[var3] = d[var3] ^ var1;
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[2];
      int var13 = 0;
      String var12 = "}Q\u001f\u0003@\u001a¸";
      int var14 = "}Q\u001f\u0003@\u001a¸".length();
      char var11 = 3;
      int var10 = -1;

      while (true) {
         char[] var10002;
         label50: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var27 = 83;
            var10002 = var10003;
            int var18 = var10004;
            byte var31;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var31 = 83;
               var10006 = var16;
            } else {
               var27 = 83;
               var18 = var10004;
               if (var10004 <= var16) {
                  break label50;
               }

               var10005 = var10003;
               var31 = 83;
               var10006 = var16;
            }

            while (true) {
               char var44 = var10005[var10006];
               byte var45;
               switch (var16 % 7) {
                  case 0:
                     var45 = 100;
                     break;
                  case 1:
                     var45 = 4;
                     break;
                  case 2:
                     var45 = 42;
                     break;
                  case 3:
                     var45 = 65;
                     break;
                  case 4:
                     var45 = 62;
                     break;
                  case 5:
                     var45 = 104;
                     break;
                  default:
                     var45 = 77;
               }

               var10005[var10006] = (char)(var44 ^ var31 ^ var45);
               var16++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var31 = var27;
               } else {
                  if (var18 <= var16) {
                     break;
                  }

                  var10005 = var10002;
                  var31 = var27;
                  var10006 = var16;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var20 = -1;
         var15[var13++] = var29;
         if ((var10 += var11) >= var14) {
            a = var15;
            b = new String[2];
            long var8 = 2468722227450459124L;
            long var26 = -8119917069810813954L ^ var8;
            var20 = (byte)-1;
            c = var26;
            long var0 = 6899508517248798915L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "j2o\u0006 rt×(`\b¾\u008d\u007f1b&<Wct=m ";
            int var5 = "j2o\u0006 rt×(`\b¾\u008d\u007f1b&<Wct=m ".length();
            byte var2 = 0;

            do {
               var20 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var20, var2).getBytes("ISO-8859-1");
               var20 = var3++;
               long var35 = (
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
               byte var30 = -1;
               var6[var20] = var35;
            } while (var2 < var5);

            d = var6;
            e = new Long[3];
            return;
         }

         var11 = var12.charAt(var10);
      }
   }
}





