package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashSet;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Fx4 {
   public static int v;
   public M6 e;
   public static Font j;
   public static Font U;
   public static Font i;
   public static Font J;
   public static Font D;
   public static Font q;
   public static Font T;
   public static Font n;
   public static Font X;
   public static Font N;
   public static Font a;
   public static Font A;
   public static Font S;
   public static Font B;
   public static Font f;
   public static Font r;
   public static Font b;
   public static Font H;
   public static Font k;
   public static Font M;
   public static Font g;
   public static Font z;
   public static Color p;
   public static Color s;
   public static Color m;
   public static Color R;
   public static Color E;
   public static Color o;
   public static String c;
   public Window Q;
   public static String[] d;
   public static String[] h;
   public static long[] l;
   public static Integer[] t;
   public static long u;

   public Fx4() {
      long var1 = u;
      Toolkit.getDefaultToolkit().addAWTEventListener(new Tm4(this), var1);
   }

   public void E(String var1) {
      Object var2 = 246607209360964348L;
      Ref.g(246607209360964348L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 594492597324005667L;
      Object[] var4 = var10002;
      Ref.h(594492597324005667L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void L() {
      Object var1 = 246607209360964348L;
      Ref.g(246607209360964348L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 172182913194922599L;
      Object[] var3 = var10002;
      Ref.h(172182913194922599L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void J() {
      label68: {
         String[] var1 = com.finalshell.ui.panel.F8.y();
         if (var1 == null) {
            Registry.emptyArgs();
            long var3 = 454647487873911743L;
            Object var10001 = Ref.h2(454647487873911743L, var3);

            try {
               var28 = (Boolean)var10001;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            if (!var28) {
               break label68;
            }

            Registry.packArgs(a(6957, -18788));
            long var5 = 411267788966857936L;
            Ref.h2(411267788966857936L, var5);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            Registry.packArgs(a(6952, -10518));
            long var7 = 411267788966857936L;
            Ref.h2(411267788966857936L, var7);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            Registry.packArgs(a(6953, -9877));
            long var9 = 411267788966857936L;
            Ref.h2(411267788966857936L, var9);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            Registry.packArgs(a(6955, -25425));
            long var11 = 411267788966857936L;
            Ref.h2(411267788966857936L, var11);

            try {
               ;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }
         }

         Registry.packArgs(a(6951, -18000));
         long var13 = 411267788966857936L;
         Ref.h2(411267788966857936L, var13);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }
      }

      ActionMap var2 = (ActionMap)UIManager.get(a(6958, -12612));
      M6 var10002 = new M6();
      long var16 = 246607209360964348L;
      M6 var15 = var10002;
      Ref.s(246607209360964348L, var15, var16);
      Object var17 = 246607209360964348L;
      Ref.g(246607209360964348L, var17);
      Object[] var10004 = Registry.emptyArgs();
      long var20 = 295720979335565585L;
      Object[] var19 = var10004;
      Ref.h(295720979335565585L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }
   }

   public static void j() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 003: astore 0
      // 004: ldc com/finalshell/core/La2
      // 006: sipush 6954
      // 009: sipush 14308
      // 00c: invokestatic com/finalshell/core/Fx4.a (II)Ljava/lang/String;
      // 00f: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 012: astore 1
      // 013: bipush 0
      // 014: aload 1
      // 015: invokestatic java/awt/Font.createFont (ILjava/io/InputStream;)Ljava/awt/Font;
      // 018: astore 2
      // 019: aload 2
      // 01a: bipush 0
      // 01b: ldc 8.0
      // 01d: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 020: ldc2_w 274038791171154177
      // 023: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 026: aconst_null
      // 027: dup2_x1
      // 028: pop2
      // 029: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 02c: aload 2
      // 02d: bipush 0
      // 02e: ldc 10.0
      // 030: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 033: ldc2_w 243979725756538831
      // 036: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 039: aconst_null
      // 03a: dup2_x1
      // 03b: pop2
      // 03c: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 03f: aload 2
      // 040: bipush 0
      // 041: ldc 11.0
      // 043: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 046: ldc2_w 279716403554365768
      // 049: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 04c: aconst_null
      // 04d: dup2_x1
      // 04e: pop2
      // 04f: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 052: aload 2
      // 053: bipush 0
      // 054: ldc 12.0
      // 056: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 059: ldc2_w 344087302787482558
      // 05c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 05f: aconst_null
      // 060: dup2_x1
      // 061: pop2
      // 062: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 065: aload 2
      // 066: bipush 0
      // 067: ldc 13.0
      // 069: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 06c: ldc2_w 334953030171430953
      // 06f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 072: aconst_null
      // 073: dup2_x1
      // 074: pop2
      // 075: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 078: aload 2
      // 079: bipush 0
      // 07a: ldc 14.0
      // 07c: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 07f: ldc2_w 312463996027732851
      // 082: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 085: aconst_null
      // 086: dup2_x1
      // 087: pop2
      // 088: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 08b: aload 2
      // 08c: bipush 0
      // 08d: ldc 15.0
      // 08f: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 092: ldc2_w 215818181678426769
      // 095: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 098: aconst_null
      // 099: dup2_x1
      // 09a: pop2
      // 09b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 09e: aload 2
      // 09f: bipush 0
      // 0a0: ldc 16.0
      // 0a2: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0a5: ldc2_w 164046876459002055
      // 0a8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ab: aconst_null
      // 0ac: dup2_x1
      // 0ad: pop2
      // 0ae: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0b1: aload 2
      // 0b2: bipush 0
      // 0b3: ldc 17.0
      // 0b5: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0b8: ldc2_w 586943296376675339
      // 0bb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0be: aconst_null
      // 0bf: dup2_x1
      // 0c0: pop2
      // 0c1: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0c4: aload 2
      // 0c5: bipush 0
      // 0c6: ldc 18.0
      // 0c8: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0cb: ldc2_w 568130515263631326
      // 0ce: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d1: aconst_null
      // 0d2: dup2_x1
      // 0d3: pop2
      // 0d4: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0d7: aload 2
      // 0d8: bipush 0
      // 0d9: ldc 19.0
      // 0db: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0de: ldc2_w 346776524977997600
      // 0e1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e4: aconst_null
      // 0e5: dup2_x1
      // 0e6: pop2
      // 0e7: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0ea: aload 2
      // 0eb: bipush 0
      // 0ec: ldc 20.0
      // 0ee: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0f1: ldc2_w 466738480260186535
      // 0f4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0f7: aconst_null
      // 0f8: dup2_x1
      // 0f9: pop2
      // 0fa: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0fd: aload 2
      // 0fe: bipush 0
      // 0ff: ldc 30.0
      // 101: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 104: ldc2_w 488776025980704885
      // 107: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 10a: aconst_null
      // 10b: dup2_x1
      // 10c: pop2
      // 10d: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 110: goto 120
      // 113: astore 1
      // 114: aload 1
      // 115: invokevirtual java/awt/FontFormatException.printStackTrace ()V
      // 118: goto 120
      // 11b: astore 1
      // 11c: aload 1
      // 11d: invokevirtual java/io/IOException.printStackTrace ()V
      // 120: invokestatic javax/swing/ToolTipManager.sharedInstance ()Ljavax/swing/ToolTipManager;
      // 123: sipush 551
      // 126: ldc2_w 6111599415947750858
      // 129: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 12c: invokevirtual javax/swing/ToolTipManager.setInitialDelay (I)V
      // 12f: sipush 6949
      // 132: invokestatic javax/swing/ToolTipManager.sharedInstance ()Ljavax/swing/ToolTipManager;
      // 135: sipush 2851
      // 138: ldc2_w 1680098619616748760
      // 13b: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 13e: invokevirtual javax/swing/ToolTipManager.setDismissDelay (I)V
      // 141: sipush -27434
      // 144: invokestatic com/finalshell/core/Fx4.a (II)Ljava/lang/String;
      // 147: ldc2_w 523981883291410284
      // 14a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 14d: aconst_null
      // 14e: dup2_x1
      // 14f: pop2
      // 150: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 153: sipush 15018
      // 156: ldc2_w 3893654096664941915
      // 159: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 15c: istore 1
      // 15d: new javax/swing/JTextArea
      // 160: dup
      // 161: invokespecial javax/swing/JTextArea.<init> ()V
      // 164: invokevirtual javax/swing/JTextArea.getFont ()Ljava/awt/Font;
      // 167: astore 2
      // 168: aload 2
      // 169: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 16c: ldc2_w 523981883291410284
      // 16f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 172: aconst_null
      // 173: dup2_x1
      // 174: pop2
      // 175: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 178: aload 2
      // 179: invokevirtual java/awt/Font.getSize ()I
      // 17c: istore 1
      // 17d: aload 2
      // 17e: ldc2_w 395970988011231853
      // 181: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 184: aconst_null
      // 185: dup2_x1
      // 186: pop2
      // 187: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 18a: aload 0
      // 18b: ifnonnull 41a
      // 18e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 191: ldc2_w 253808553645062345
      // 194: astore 8
      // 196: ldc2_w 253808553645062345
      // 199: aload 8
      // 19b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 19e: checkcast java/lang/Boolean
      // 1a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a4: goto 1ab
      // 1a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1aa: athrow
      // 1ab: ifeq 2da
      // 1ae: goto 1b5
      // 1b1: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 1b4: athrow
      // 1b5: sipush 6947
      // 1b8: sipush -30527
      // 1bb: invokestatic com/finalshell/core/Fx4.a (II)Ljava/lang/String;
      // 1be: astore 3
      // 1bf: sipush 6950
      // 1c2: sipush -16669
      // 1c5: invokestatic com/finalshell/core/Fx4.a (II)Ljava/lang/String;
      // 1c8: astore 4
      // 1ca: sipush 6948
      // 1cd: sipush 11269
      // 1d0: invokestatic com/finalshell/core/Fx4.a (II)Ljava/lang/String;
      // 1d3: astore 5
      // 1d5: sipush 6946
      // 1d8: sipush 12577
      // 1db: invokestatic com/finalshell/core/Fx4.a (II)Ljava/lang/String;
      // 1de: astore 6
      // 1e0: ldc2_w 238598075603756721
      // 1e3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1e6: aconst_null
      // 1e7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ea: checkcast java/util/HashSet
      // 1ed: astore 7
      // 1ef: aload 7
      // 1f1: aload 4
      // 1f3: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 1f6: aload 0
      // 1f7: ifnonnull 22b
      // 1fa: ifeq 21d
      // 1fd: goto 204
      // 200: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 203: athrow
      // 204: aload 4
      // 206: ldc2_w 523981883291410284
      // 209: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 20c: aconst_null
      // 20d: dup2_x1
      // 20e: pop2
      // 20f: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 212: aload 0
      // 213: ifnull 2ab
      // 216: goto 21d
      // 219: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 21c: athrow
      // 21d: aload 7
      // 21f: aload 5
      // 221: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 22a: athrow
      // 22b: aload 0
      // 22c: ifnonnull 260
      // 22f: ifeq 252
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 238: athrow
      // 239: aload 5
      // 23b: ldc2_w 523981883291410284
      // 23e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 241: aconst_null
      // 242: dup2_x1
      // 243: pop2
      // 244: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 247: aload 0
      // 248: ifnull 2ab
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 251: athrow
      // 252: aload 7
      // 254: aload 6
      // 256: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 259: goto 260
      // 25c: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 25f: athrow
      // 260: aload 0
      // 261: ifnonnull 294
      // 264: ifeq 287
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 26d: athrow
      // 26e: aload 6
      // 270: ldc2_w 523981883291410284
      // 273: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 276: aconst_null
      // 277: dup2_x1
      // 278: pop2
      // 279: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 27c: aload 0
      // 27d: ifnull 2ab
      // 280: goto 287
      // 283: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 286: athrow
      // 287: aload 7
      // 289: aload 3
      // 28a: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 28d: goto 294
      // 290: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 293: athrow
      // 294: ifeq 2ab
      // 297: aload 3
      // 298: ldc2_w 523981883291410284
      // 29b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 29e: aconst_null
      // 29f: dup2_x1
      // 2a0: pop2
      // 2a1: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/Fx4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 2aa: athrow
      // 2ab: ldc2_w 523981883291410284
      // 2ae: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2b1: aconst_null
      // 2b2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2b5: bipush 0
      // 2b6: iload 1
      // 2b7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 2ba: ldc2_w 438310431153331766
      // 2bd: astore 10
      // 2bf: ldc2_w 438310431153331766
      // 2c2: aload 10
      // 2c4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c7: goto 2ce
      // 2ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2cd: athrow
      // 2ce: ldc2_w 395970988011231853
      // 2d1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2d4: aconst_null
      // 2d5: dup2_x1
      // 2d6: pop2
      // 2d7: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2da: ldc2_w 395970988011231853
      // 2dd: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2e0: aconst_null
      // 2e1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2e4: checkcast java/awt/Font
      // 2e7: bipush 1
      // 2e8: iload 1
      // 2e9: i2f
      // 2ea: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 2ed: ldc2_w 449209254921925454
      // 2f0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2f3: aconst_null
      // 2f4: dup2_x1
      // 2f5: pop2
      // 2f6: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2f9: ldc2_w 395970988011231853
      // 2fc: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2ff: aconst_null
      // 300: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 303: checkcast java/awt/Font
      // 306: sipush 7907
      // 309: ldc2_w 8122239910078673181
      // 30c: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 30f: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 312: ldc2_w 168620665706526093
      // 315: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 318: aconst_null
      // 319: dup2_x1
      // 31a: pop2
      // 31b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 31e: ldc2_w 395970988011231853
      // 321: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 324: aconst_null
      // 325: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 328: checkcast java/awt/Font
      // 32b: sipush 11663
      // 32e: ldc2_w 2896991060058391165
      // 331: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 334: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 337: ldc2_w 238546797805326172
      // 33a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 33d: aconst_null
      // 33e: dup2_x1
      // 33f: pop2
      // 340: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 343: ldc2_w 395970988011231853
      // 346: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 349: aconst_null
      // 34a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 34d: checkcast java/awt/Font
      // 350: sipush 19939
      // 353: ldc2_w 1949074466987844108
      // 356: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 359: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 35c: ldc2_w 236927642915393855
      // 35f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 362: aconst_null
      // 363: dup2_x1
      // 364: pop2
      // 365: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 368: ldc2_w 395970988011231853
      // 36b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 36e: aconst_null
      // 36f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 372: checkcast java/awt/Font
      // 375: sipush 12791
      // 378: ldc2_w 5223701907106717197
      // 37b: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 37e: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 381: ldc2_w 423003703858242312
      // 384: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 387: aconst_null
      // 388: dup2_x1
      // 389: pop2
      // 38a: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 38d: ldc2_w 395970988011231853
      // 390: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 393: aconst_null
      // 394: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 397: checkcast java/awt/Font
      // 39a: sipush 1567
      // 39d: ldc2_w 4946749241001503209
      // 3a0: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 3a3: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 3a6: ldc2_w 373239323099996228
      // 3a9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3ac: aconst_null
      // 3ad: dup2_x1
      // 3ae: pop2
      // 3af: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3b2: ldc2_w 395970988011231853
      // 3b5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3b8: aconst_null
      // 3b9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3bc: checkcast java/awt/Font
      // 3bf: sipush 22471
      // 3c2: ldc2_w 1945943143214266415
      // 3c5: invokestatic com/finalshell/core/Fx4.a (IJ)I
      // 3c8: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 3cb: ldc2_w 406637052422931204
      // 3ce: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3d1: aconst_null
      // 3d2: dup2_x1
      // 3d3: pop2
      // 3d4: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3d7: ldc2_w 395970988011231853
      // 3da: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3dd: aconst_null
      // 3de: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3e1: checkcast java/awt/Font
      // 3e4: bipush 0
      // 3e5: iload 1
      // 3e6: bipush 1
      // 3e7: isub
      // 3e8: i2f
      // 3e9: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 3ec: ldc2_w 593752358540399204
      // 3ef: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3f2: aconst_null
      // 3f3: dup2_x1
      // 3f4: pop2
      // 3f5: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3f8: ldc2_w 395970988011231853
      // 3fb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3fe: aconst_null
      // 3ff: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 402: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 405: ldc2_w 602415423692123454
      // 408: astore 12
      // 40a: ldc2_w 602415423692123454
      // 40d: aload 12
      // 40f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 412: pop
      // 413: goto 41a
      // 416: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 419: athrow
      // 41a: return
   }

   public static void b() {
      FlatLightLaf.setup();
   }

   public static void f(String var0) {
      InputMap var1 = (InputMap)UIManager.get(var0);
      var1.put(KeyStroke.getKeyStroke(a(13311, 1184978355668704282L), a(22442, 8972681888753596481L)), a(6944, -27321));
      var1.put(KeyStroke.getKeyStroke(a(15854, 1537326669510562323L), a(25986, 8707905483881745003L)), a(6945, -27611));
      var1.put(KeyStroke.getKeyStroke(a(20906, 4029422088455241309L), a(25986, 8707905483881745003L)), a(6956, -24707));
   }

   public static boolean n(String var0) {
      String[] var10000 = com.finalshell.ui.panel.F8.y();
      boolean var2 = false;
      String[] var1 = var10000;
      boolean var7 = ((HashSet)Registry.lookupField(238598075603756721L).get(null)).contains(var0);
      if (var1 == null) {
         if (var7) {
            Registry.packArgs(var0, 0, a(27761, 1997397399076340626L));
            long var4 = 438310431153331766L;
            Object var10001 = Ref.h2(438310431153331766L, var4);

            try {
               var10001 = (Font)var10001;
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            Font var3 = (Font)var10001;
            var2 = var3.canDisplay((char)a(4436, 1528345745248353956L));
         }

         var7 = var2;
      }

      return var7;
   }

   public static void g(Font var0) {
      FontUIResource var2 = new FontUIResource(var0);
      String[] var10000 = com.finalshell.ui.panel.F8.y();
      Enumeration var3 = UIManager.getDefaults().keys();
      String[] var1 = var10000;

      while (var3.hasMoreElements()) {
         Object var4 = var3.nextElement();
         Object var5 = UIManager.get(var4);
         if (var1 == null && var5 instanceof FontUIResource) {
            UIManager.put(var4, var2);
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public static Font o() {
      return (Font)Registry.lookupField(395970988011231853L).get(null);
   }

   public static void u(Font var0) {
      Registry.lookupField(395970988011231853L).set(null, var0);
   }

   public M6 G() {
      Object var1 = 246607209360964348L;
      return (M6)Ref.g(246607209360964348L, var1);
   }

   public void G(M6 var1) {
      long var3 = 246607209360964348L;
      Ref.s(246607209360964348L, var1, var3);
   }

   public Window z() {
      Object var1 = 384633431140789068L;
      return (Window)Ref.g(384633431140789068L, var1);
   }

   public void u(Window var1) {
      long var3 = 384633431140789068L;
      Ref.s(384633431140789068L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static FontFormatException a(FontFormatException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 6944) & 65535;
      if (h[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 104;
               break;
            case 1:
               var10000 = 45;
               break;
            case 2:
               var10000 = 137;
               break;
            case 3:
               var10000 = 43;
               break;
            case 4:
               var10000 = 63;
               break;
            case 5:
               var10000 = 89;
               break;
            case 6:
               var10000 = 165;
               break;
            case 7:
               var10000 = 179;
               break;
            case 8:
               var10000 = 197;
               break;
            case 9:
               var10000 = 146;
               break;
            case 10:
               var10000 = 226;
               break;
            case 11:
               var10000 = 194;
               break;
            case 12:
               var10000 = 56;
               break;
            case 13:
               var10000 = 69;
               break;
            case 14:
               var10000 = 201;
               break;
            case 15:
               var10000 = 223;
               break;
            case 16:
               var10000 = 195;
               break;
            case 17:
               var10000 = 55;
               break;
            case 18:
               var10000 = 162;
               break;
            case 19:
               var10000 = 241;
               break;
            case 20:
               var10000 = 235;
               break;
            case 21:
               var10000 = 6;
               break;
            case 22:
               var10000 = 136;
               break;
            case 23:
               var10000 = 52;
               break;
            case 24:
               var10000 = 34;
               break;
            case 25:
               var10000 = 22;
               break;
            case 26:
               var10000 = 78;
               break;
            case 27:
               var10000 = 44;
               break;
            case 28:
               var10000 = 91;
               break;
            case 29:
               var10000 = 17;
               break;
            case 30:
               var10000 = 207;
               break;
            case 31:
               var10000 = 191;
               break;
            case 32:
               var10000 = 185;
               break;
            case 33:
               var10000 = 32;
               break;
            case 34:
               var10000 = 95;
               break;
            case 35:
               var10000 = 10;
               break;
            case 36:
               var10000 = 73;
               break;
            case 37:
               var10000 = 246;
               break;
            case 38:
               var10000 = 121;
               break;
            case 39:
               var10000 = 111;
               break;
            case 40:
               var10000 = 15;
               break;
            case 41:
               var10000 = 193;
               break;
            case 42:
               var10000 = 159;
               break;
            case 43:
               var10000 = 37;
               break;
            case 44:
               var10000 = 70;
               break;
            case 45:
               var10000 = 117;
               break;
            case 46:
               var10000 = 242;
               break;
            case 47:
               var10000 = 225;
               break;
            case 48:
               var10000 = 42;
               break;
            case 49:
               var10000 = 222;
               break;
            case 50:
               var10000 = 11;
               break;
            case 51:
               var10000 = 156;
               break;
            case 52:
               var10000 = 169;
               break;
            case 53:
               var10000 = 39;
               break;
            case 54:
               var10000 = 128;
               break;
            case 55:
               var10000 = 30;
               break;
            case 56:
               var10000 = 238;
               break;
            case 57:
               var10000 = 61;
               break;
            case 58:
               var10000 = 214;
               break;
            case 59:
               var10000 = 127;
               break;
            case 60:
               var10000 = 227;
               break;
            case 61:
               var10000 = 203;
               break;
            case 62:
               var10000 = 168;
               break;
            case 63:
               var10000 = 218;
               break;
            case 64:
               var10000 = 134;
               break;
            case 65:
               var10000 = 19;
               break;
            case 66:
               var10000 = 167;
               break;
            case 67:
               var10000 = 231;
               break;
            case 68:
               var10000 = 212;
               break;
            case 69:
               var10000 = 243;
               break;
            case 70:
               var10000 = 119;
               break;
            case 71:
               var10000 = 76;
               break;
            case 72:
               var10000 = 24;
               break;
            case 73:
               var10000 = 68;
               break;
            case 74:
               var10000 = 209;
               break;
            case 75:
               var10000 = 192;
               break;
            case 76:
               var10000 = 106;
               break;
            case 77:
               var10000 = 188;
               break;
            case 78:
               var10000 = 135;
               break;
            case 79:
               var10000 = 213;
               break;
            case 80:
               var10000 = 163;
               break;
            case 81:
               var10000 = 96;
               break;
            case 82:
               var10000 = 31;
               break;
            case 83:
               var10000 = 180;
               break;
            case 84:
               var10000 = 12;
               break;
            case 85:
               var10000 = 53;
               break;
            case 86:
               var10000 = 253;
               break;
            case 87:
               var10000 = 47;
               break;
            case 88:
               var10000 = 130;
               break;
            case 89:
               var10000 = 103;
               break;
            case 90:
               var10000 = 186;
               break;
            case 91:
               var10000 = 152;
               break;
            case 92:
               var10000 = 205;
               break;
            case 93:
               var10000 = 99;
               break;
            case 94:
               var10000 = 129;
               break;
            case 95:
               var10000 = 90;
               break;
            case 96:
               var10000 = 114;
               break;
            case 97:
               var10000 = 143;
               break;
            case 98:
               var10000 = 102;
               break;
            case 99:
               var10000 = 190;
               break;
            case 100:
               var10000 = 202;
               break;
            case 101:
               var10000 = 198;
               break;
            case 102:
               var10000 = 240;
               break;
            case 103:
               var10000 = 153;
               break;
            case 104:
               var10000 = 87;
               break;
            case 105:
               var10000 = 181;
               break;
            case 106:
               var10000 = 8;
               break;
            case 107:
               var10000 = 158;
               break;
            case 108:
               var10000 = 217;
               break;
            case 109:
               var10000 = 141;
               break;
            case 110:
               var10000 = 79;
               break;
            case 111:
               var10000 = 206;
               break;
            case 112:
               var10000 = 54;
               break;
            case 113:
               var10000 = 154;
               break;
            case 114:
               var10000 = 71;
               break;
            case 115:
               var10000 = 122;
               break;
            case 116:
               var10000 = 48;
               break;
            case 117:
               var10000 = 13;
               break;
            case 118:
               var10000 = 108;
               break;
            case 119:
               var10000 = 236;
               break;
            case 120:
               var10000 = 51;
               break;
            case 121:
               var10000 = 189;
               break;
            case 122:
               var10000 = 105;
               break;
            case 123:
               var10000 = 126;
               break;
            case 124:
               var10000 = 7;
               break;
            case 125:
               var10000 = 140;
               break;
            case 126:
               var10000 = 171;
               break;
            case 127:
               var10000 = 29;
               break;
            case 128:
               var10000 = 182;
               break;
            case 129:
               var10000 = 233;
               break;
            case 130:
               var10000 = 93;
               break;
            case 131:
               var10000 = 1;
               break;
            case 132:
               var10000 = 74;
               break;
            case 133:
               var10000 = 208;
               break;
            case 134:
               var10000 = 170;
               break;
            case 135:
               var10000 = 36;
               break;
            case 136:
               var10000 = 59;
               break;
            case 137:
               var10000 = 254;
               break;
            case 138:
               var10000 = 112;
               break;
            case 139:
               var10000 = 229;
               break;
            case 140:
               var10000 = 247;
               break;
            case 141:
               var10000 = 75;
               break;
            case 142:
               var10000 = 145;
               break;
            case 143:
               var10000 = 161;
               break;
            case 144:
               var10000 = 125;
               break;
            case 145:
               var10000 = 77;
               break;
            case 146:
               var10000 = 16;
               break;
            case 147:
               var10000 = 66;
               break;
            case 148:
               var10000 = 139;
               break;
            case 149:
               var10000 = 64;
               break;
            case 150:
               var10000 = 234;
               break;
            case 151:
               var10000 = 204;
               break;
            case 152:
               var10000 = 123;
               break;
            case 153:
               var10000 = 113;
               break;
            case 154:
               var10000 = 46;
               break;
            case 155:
               var10000 = 244;
               break;
            case 156:
               var10000 = 72;
               break;
            case 157:
               var10000 = 133;
               break;
            case 158:
               var10000 = 220;
               break;
            case 159:
               var10000 = 101;
               break;
            case 160:
               var10000 = 120;
               break;
            case 161:
               var10000 = 124;
               break;
            case 162:
               var10000 = 86;
               break;
            case 163:
               var10000 = 216;
               break;
            case 164:
               var10000 = 160;
               break;
            case 165:
               var10000 = 199;
               break;
            case 166:
               var10000 = 224;
               break;
            case 167:
               var10000 = 215;
               break;
            case 168:
               var10000 = 109;
               break;
            case 169:
               var10000 = 228;
               break;
            case 170:
               var10000 = 150;
               break;
            case 171:
               var10000 = 50;
               break;
            case 172:
               var10000 = 97;
               break;
            case 173:
               var10000 = 118;
               break;
            case 174:
               var10000 = 100;
               break;
            case 175:
               var10000 = 172;
               break;
            case 176:
               var10000 = 26;
               break;
            case 177:
               var10000 = 149;
               break;
            case 178:
               var10000 = 65;
               break;
            case 179:
               var10000 = 4;
               break;
            case 180:
               var10000 = 250;
               break;
            case 181:
               var10000 = 18;
               break;
            case 182:
               var10000 = 175;
               break;
            case 183:
               var10000 = 2;
               break;
            case 184:
               var10000 = 21;
               break;
            case 185:
               var10000 = 62;
               break;
            case 186:
               var10000 = 176;
               break;
            case 187:
               var10000 = 142;
               break;
            case 188:
               var10000 = 151;
               break;
            case 189:
               var10000 = 221;
               break;
            case 190:
               var10000 = 183;
               break;
            case 191:
               var10000 = 27;
               break;
            case 192:
               var10000 = 211;
               break;
            case 193:
               var10000 = 252;
               break;
            case 194:
               var10000 = 132;
               break;
            case 195:
               var10000 = 148;
               break;
            case 196:
               var10000 = 57;
               break;
            case 197:
               var10000 = 28;
               break;
            case 198:
               var10000 = 38;
               break;
            case 199:
               var10000 = 116;
               break;
            case 200:
               var10000 = 110;
               break;
            case 201:
               var10000 = 20;
               break;
            case 202:
               var10000 = 115;
               break;
            case 203:
               var10000 = 49;
               break;
            case 204:
               var10000 = 232;
               break;
            case 205:
               var10000 = 200;
               break;
            case 206:
               var10000 = 157;
               break;
            case 207:
               var10000 = 98;
               break;
            case 208:
               var10000 = 92;
               break;
            case 209:
               var10000 = 251;
               break;
            case 210:
               var10000 = 131;
               break;
            case 211:
               var10000 = 219;
               break;
            case 212:
               var10000 = 144;
               break;
            case 213:
               var10000 = 177;
               break;
            case 214:
               var10000 = 35;
               break;
            case 215:
               var10000 = 147;
               break;
            case 216:
               var10000 = 60;
               break;
            case 217:
               var10000 = 248;
               break;
            case 218:
               var10000 = 178;
               break;
            case 219:
               var10000 = 23;
               break;
            case 220:
               var10000 = 81;
               break;
            case 221:
               var10000 = 88;
               break;
            case 222:
               var10000 = 85;
               break;
            case 223:
               var10000 = 187;
               break;
            case 224:
               var10000 = 155;
               break;
            case 225:
               var10000 = 82;
               break;
            case 226:
               var10000 = 249;
               break;
            case 227:
               var10000 = 83;
               break;
            case 228:
               var10000 = 3;
               break;
            case 229:
               var10000 = 80;
               break;
            case 230:
               var10000 = 25;
               break;
            case 231:
               var10000 = 166;
               break;
            case 232:
               var10000 = 0;
               break;
            case 233:
               var10000 = 94;
               break;
            case 234:
               var10000 = 237;
               break;
            case 235:
               var10000 = 255;
               break;
            case 236:
               var10000 = 230;
               break;
            case 237:
               var10000 = 14;
               break;
            case 238:
               var10000 = 41;
               break;
            case 239:
               var10000 = 58;
               break;
            case 240:
               var10000 = 67;
               break;
            case 241:
               var10000 = 173;
               break;
            case 242:
               var10000 = 40;
               break;
            case 243:
               var10000 = 245;
               break;
            case 244:
               var10000 = 5;
               break;
            case 245:
               var10000 = 33;
               break;
            case 246:
               var10000 = 210;
               break;
            case 247:
               var10000 = 9;
               break;
            case 248:
               var10000 = 239;
               break;
            case 249:
               var10000 = 138;
               break;
            case 250:
               var10000 = 84;
               break;
            case 251:
               var10000 = 196;
               break;
            case 252:
               var10000 = 184;
               break;
            case 253:
               var10000 = 164;
               break;
            case 254:
               var10000 = 174;
               break;
            default:
               var10000 = 107;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28650;
      if (t[var3] == null) {
         t[var3] = (int)(l[var3] ^ var1);
      }

      return t[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[15];
      int var13 = 0;
      String var12 = "\u0093tÖ\u008c´åN\u000e¼þ\bsq@\u0004lr\u0014Ô-LeÌ-\t:pÍX'¹½Ã\u0005²\u0016\u009b½\u0006Ã\u0090÷üv\u009e\u0012àÆ@\u0017Uûxam}÷×\u0092í\u001fÀ)\u008c\u0007®\u0083àÝ6X®\u0006Ëêö³Vw\u000fQAvç\u0093å ¢v\u0005\u0094Øþ\f\u0092\u001bÑ°ÈÑN\u001e\u001d@MR»_\u008c\u001bzs]`êÈ\u0011l`\\c-®\u0017>bº\b[Ä¿ÕÎ®®lJEP®¢<¿Û^\u0085Ë\u0016É3D\"\u0083\u009aCk\u001b\u009d\u001eGb«»\u0092¼} o°\u001c\u0018ë®\u0003è«\u0089Ç|\u0086òY\u0084\u0090\u0011\u009aM'\u0011\u001d\u0082\u0011»)0 ù\u0094\u0018\u0084crj´GÐ\u009c\u0081x>ù¸ÌCk°Öº¹ð\\PÍãÖ~\u009a¢\u0010w\u001eNÌz(§\u0081\u0084\u008døªX%\u009e\u0019";
      int var14 = "\u0093tÖ\u008c´åN\u000e¼þ\bsq@\u0004lr\u0014Ô-LeÌ-\t:pÍX'¹½Ã\u0005²\u0016\u009b½\u0006Ã\u0090÷üv\u009e\u0012àÆ@\u0017Uûxam}÷×\u0092í\u001fÀ)\u008c\u0007®\u0083àÝ6X®\u0006Ëêö³Vw\u000fQAvç\u0093å ¢v\u0005\u0094Øþ\f\u0092\u001bÑ°ÈÑN\u001e\u001d@MR»_\u008c\u001bzs]`êÈ\u0011l`\\c-®\u0017>bº\b[Ä¿ÕÎ®®lJEP®¢<¿Û^\u0085Ë\u0016É3D\"\u0083\u009aCk\u001b\u009d\u001eGb«»\u0092¼} o°\u001c\u0018ë®\u0003è«\u0089Ç|\u0086òY\u0084\u0090\u0011\u009aM'\u0011\u001d\u0082\u0011»)0 ù\u0094\u0018\u0084crj´GÐ\u009c\u0081x>ù¸ÌCk°Öº¹ð\\PÍãÖ~\u009a¢\u0010w\u001eNÌz(§\u0081\u0084\u008døªX%\u009e\u0019"
         .length();
      char var11 = 17;
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 60;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
      char[] var36;
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 123;
                        break;
                     case 1:
                        var69 = 34;
                        break;
                     case 2:
                        var69 = 15;
                        break;
                     case 3:
                        var69 = 6;
                        break;
                     case 4:
                        var69 = 103;
                        break;
                     case 5:
                        var69 = 45;
                        break;
                     default:
                        var69 = 104;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     d = var15;
                     h = new String[15];
                     long var2 = 770023006329806024L;
                     long[] var8 = new long[30];
                     int var5 = 0;
                     String var6 = "ÙH\u0089Êzïæço·\u001e\u009bD\u0097¥\u0089²\u009dÚ\u0087½N$ë\u0004Fþ<\u0081X\u0017£nAÒ-d\u0005þÊÚ]\u001a3\u009c²¾ËÁR5|)ð®\tÀª½6ô&p.ý\u0082*\r:µ\u0011\u009e²ñ\u0098\u0087>\u0016\u009fVpÛÚ±«Â\u008a\u008d\u009cÄI\u0094L\u0094\u0099\"!Jl0¼Ô:\u0087ÈõîùÞÇ¿\u0001ïÙÌw\u0016\u000f\u000e w\u0083\u0083µu\u0002@\u0091O\u008e¥\u009cx\u008aÂË{{E\u008c0Ëß\u0000\u0019\bª8Íäè´Õ\u00074%Þböèî^Ê»\u001d\u0097íÇÂ8Ò\u0001>o$ÓoÈÑÎr^j¤ûaôCÆÃÎ\u008d\u000b¨T\u0015\u001diÞ¥ç\u0019\u001a¼é>¦\u009a#Ã\u0000%¦«,AR£ÆäLßÉ\u009e";
                     int var7 = "ÙH\u0089Êzïæço·\u001e\u009bD\u0097¥\u0089²\u009dÚ\u0087½N$ë\u0004Fþ<\u0081X\u0017£nAÒ-d\u0005þÊÚ]\u001a3\u009c²¾ËÁR5|)ð®\tÀª½6ô&p.ý\u0082*\r:µ\u0011\u009e²ñ\u0098\u0087>\u0016\u009fVpÛÚ±«Â\u008a\u008d\u009cÄI\u0094L\u0094\u0099\"!Jl0¼Ô:\u0087ÈõîùÞÇ¿\u0001ïÙÌw\u0016\u000f\u000e w\u0083\u0083µu\u0002@\u0091O\u008e¥\u009cx\u008aÂË{{E\u008c0Ëß\u0000\u0019\bª8Íäè´Õ\u00074%Þböèî^Ê»\u001d\u0097íÇÂ8Ò\u0001>o$ÓoÈÑÎr^j¤ûaôCÆÃÎ\u008d\u000b¨T\u0015\u001diÞ¥ç\u0019\u001a¼é>¦\u009a#Ã\u0000%¦«,AR£ÆäLßÉ\u009e"
                        .length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes("ISO-8859-1");
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    l = var8;
                                    t = new Integer[30];
                                    long var0 = 8634760969056750070L;
                                    long var42 = 8634760969056750054L ^ var0;
                                    byte var31 = -1;
                                    u = var42;
                                    Registry.lookupField(274507651421127580L).setInt(null, a(27174, 4726349126532335066L));
                                    Registry.lookupField(503018106388102479L).set(null, new Color(0, 0, 0));
                                    Registry.lookupField(476153709123937579L)
                                       .set(null, new Color(a(22512, 960993529667368975L), a(5585, 9197729558655498811L), a(5585, 9197729558655498811L)));
                                    Registry.lookupField(461796957683008100L)
                                       .set(null, new Color(a(3379, 8738873055548236509L), a(25180, 4036620769912917438L), a(21842, 2090933165858503329L)));
                                    Registry.lookupField(136831589974125637L)
                                       .set(null, new Color(a(24050, 4029305105094947358L), a(1329, 4891815149675506376L), a(19677, 334602360387871546L)));
                                    Registry.lookupField(623875439513009390L)
                                       .set(
                                          null,
                                          new Color(
                                             a(27281, 8409522371127281008L),
                                             a(6983, 3341685706732762303L),
                                             a(18805, 3587227920034080403L),
                                             a(31221, 5606823337849787925L)
                                          )
                                       );
                                    Registry.lookupField(513155505692963448L).set(null, new Color(a(10329, 5504029929407301565L)));
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "ì\u0010\u0085D÷ùu,\u0012´B¿YV\"Í";
                                 var7 = "ì\u0010\u0085D÷ùu,\u0012´B¿YV\"Í".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes("ISO-8859-1");
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = "h&ã\u0013ã4;XÍ\u008c]»§,~\u0010ôxæÀæuO\u0013r( Ò\u008b\f6_lln«1¿EÚ/óß";
                  var14 = "h&ã\u0013ã4;XÍ\u008c]»§,~\u0010ôxæÀæuO\u0013r( Ò\u008b\f6_lln«1¿EÚ/óß".length();
                  var11 = 23;
                  var19 = -1;
            }

            var10000 = 9;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





