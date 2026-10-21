import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashSet;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class fx_4 {
   public static int v;
   m6 e;
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
   Window Q;
   private static final String[] d;
   private static final String[] h;
   private static final long[] l;
   private static final Integer[] t;
   private static final long u;

   public fx_4() {
      long var1 = u;
      Toolkit.getDefaultToolkit().addAWTEventListener(new tm_4(this), var1);
   }

   public void E(String var1) {
      Method var10000 = (Method)com.c.c(246607209360964348L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(594492597324005667L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void L() {
      Method var10000 = (Method)com.c.c(246607209360964348L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(172182913194922599L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public void J() {
      label68: {
         String[] var1 = F8.y();
         if (var1 == null) {
            Object[] var10000 = com.c.f();
            Method var10 = com.c.d(454647487873911743L);
            Object[] var37 = var10000;
            Object var24 = null;

            try {
               var11 = (Boolean)var10.invoke(var24, var37);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            if (!var11) {
               break label68;
            }

            var10000 = com.c.a(a(6957, -18788));
            Method var13 = com.c.d(411267788966857936L);
            var37 = var10000;
            var24 = null;

            try {
               var13.invoke(var24, var37);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var10000 = com.c.a(a(6952, -10518));
            Method var15 = com.c.d(411267788966857936L);
            var37 = var10000;
            var24 = null;

            try {
               var15.invoke(var24, var37);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            var10000 = com.c.a(a(6953, -9877));
            Method var17 = com.c.d(411267788966857936L);
            var37 = var10000;
            var24 = null;

            try {
               var17.invoke(var24, var37);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var10000 = com.c.a(a(6955, -25425));
            Method var19 = com.c.d(411267788966857936L);
            var37 = var10000;
            var24 = null;

            try {
               var19.invoke(var24, var37);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         Object[] var20 = com.c.a(a(6951, -18000));
         Method var21 = com.c.d(411267788966857936L);
         Object[] var47 = var20;
         Object var34 = null;

         try {
            var21.invoke(var34, var47);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }

      ActionMap var2 = (ActionMap)UIManager.get(a(6958, -12612));
      com.c.c(246607209360964348L).set(this, new m6());
      Method var22 = (Method)com.c.c(246607209360964348L).get(this);
      Object[] var35 = com.c.f();
      Method var10003 = com.c.d(295720979335565585L);
      Object[] var48 = var35;
      var35 = var22;
      var22 = var10003;

      try {
         var22.invoke(var35, var48);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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
      // 000: invokestatic F8.y ()[Ljava/lang/String;
      // 003: astore 0
      // 004: ldc La_2
      // 006: sipush 6954
      // 009: sipush 14308
      // 00c: invokestatic fx_4.a (II)Ljava/lang/String;
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
      // 023: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 026: aconst_null
      // 027: dup2_x1
      // 028: pop2
      // 029: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 02c: aload 2
      // 02d: bipush 0
      // 02e: ldc 10.0
      // 030: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 033: ldc2_w 243979725756538831
      // 036: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 039: aconst_null
      // 03a: dup2_x1
      // 03b: pop2
      // 03c: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 03f: aload 2
      // 040: bipush 0
      // 041: ldc 11.0
      // 043: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 046: ldc2_w 279716403554365768
      // 049: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 04c: aconst_null
      // 04d: dup2_x1
      // 04e: pop2
      // 04f: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 052: aload 2
      // 053: bipush 0
      // 054: ldc 12.0
      // 056: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 059: ldc2_w 344087302787482558
      // 05c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 05f: aconst_null
      // 060: dup2_x1
      // 061: pop2
      // 062: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 065: aload 2
      // 066: bipush 0
      // 067: ldc 13.0
      // 069: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 06c: ldc2_w 334953030171430953
      // 06f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 072: aconst_null
      // 073: dup2_x1
      // 074: pop2
      // 075: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 078: aload 2
      // 079: bipush 0
      // 07a: ldc 14.0
      // 07c: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 07f: ldc2_w 312463996027732851
      // 082: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 085: aconst_null
      // 086: dup2_x1
      // 087: pop2
      // 088: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 08b: aload 2
      // 08c: bipush 0
      // 08d: ldc 15.0
      // 08f: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 092: ldc2_w 215818181678426769
      // 095: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 098: aconst_null
      // 099: dup2_x1
      // 09a: pop2
      // 09b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 09e: aload 2
      // 09f: bipush 0
      // 0a0: ldc 16.0
      // 0a2: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0a5: ldc2_w 164046876459002055
      // 0a8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ab: aconst_null
      // 0ac: dup2_x1
      // 0ad: pop2
      // 0ae: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0b1: aload 2
      // 0b2: bipush 0
      // 0b3: ldc 17.0
      // 0b5: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0b8: ldc2_w 586943296376675339
      // 0bb: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0be: aconst_null
      // 0bf: dup2_x1
      // 0c0: pop2
      // 0c1: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0c4: aload 2
      // 0c5: bipush 0
      // 0c6: ldc 18.0
      // 0c8: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0cb: ldc2_w 568130515263631326
      // 0ce: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0d1: aconst_null
      // 0d2: dup2_x1
      // 0d3: pop2
      // 0d4: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0d7: aload 2
      // 0d8: bipush 0
      // 0d9: ldc 19.0
      // 0db: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0de: ldc2_w 346776524977997600
      // 0e1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0e4: aconst_null
      // 0e5: dup2_x1
      // 0e6: pop2
      // 0e7: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0ea: aload 2
      // 0eb: bipush 0
      // 0ec: ldc 20.0
      // 0ee: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 0f1: ldc2_w 466738480260186535
      // 0f4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f7: aconst_null
      // 0f8: dup2_x1
      // 0f9: pop2
      // 0fa: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0fd: aload 2
      // 0fe: bipush 0
      // 0ff: ldc 30.0
      // 101: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 104: ldc2_w 488776025980704885
      // 107: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
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
      // 129: invokestatic fx_4.a (IJ)I
      // 12c: invokevirtual javax/swing/ToolTipManager.setInitialDelay (I)V
      // 12f: sipush 6949
      // 132: invokestatic javax/swing/ToolTipManager.sharedInstance ()Ljavax/swing/ToolTipManager;
      // 135: sipush 2851
      // 138: ldc2_w 1680098619616748760
      // 13b: invokestatic fx_4.a (IJ)I
      // 13e: invokevirtual javax/swing/ToolTipManager.setDismissDelay (I)V
      // 141: sipush -27434
      // 144: invokestatic fx_4.a (II)Ljava/lang/String;
      // 147: ldc2_w 523981883291410284
      // 14a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 14d: aconst_null
      // 14e: dup2_x1
      // 14f: pop2
      // 150: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 153: sipush 15018
      // 156: ldc2_w 3893654096664941915
      // 159: invokestatic fx_4.a (IJ)I
      // 15c: istore 1
      // 15d: new javax/swing/JTextArea
      // 160: dup
      // 161: invokespecial javax/swing/JTextArea.<init> ()V
      // 164: invokevirtual javax/swing/JTextArea.getFont ()Ljava/awt/Font;
      // 167: astore 2
      // 168: aload 2
      // 169: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 16c: ldc2_w 523981883291410284
      // 16f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 172: aconst_null
      // 173: dup2_x1
      // 174: pop2
      // 175: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 178: aload 2
      // 179: invokevirtual java/awt/Font.getSize ()I
      // 17c: istore 1
      // 17d: aload 2
      // 17e: ldc2_w 395970988011231853
      // 181: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 184: aconst_null
      // 185: dup2_x1
      // 186: pop2
      // 187: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 18a: aload 0
      // 18b: ifnonnull 417
      // 18e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 191: ldc2_w 253808553645062345
      // 194: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 197: swap
      // 198: aconst_null
      // 199: swap
      // 19a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 19d: checkcast java/lang/Boolean
      // 1a0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a3: goto 1aa
      // 1a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: ifeq 2d8
      // 1ad: goto 1b4
      // 1b0: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 1b3: athrow
      // 1b4: sipush 6947
      // 1b7: sipush -30527
      // 1ba: invokestatic fx_4.a (II)Ljava/lang/String;
      // 1bd: astore 3
      // 1be: sipush 6950
      // 1c1: sipush -16669
      // 1c4: invokestatic fx_4.a (II)Ljava/lang/String;
      // 1c7: astore 4
      // 1c9: sipush 6948
      // 1cc: sipush 11269
      // 1cf: invokestatic fx_4.a (II)Ljava/lang/String;
      // 1d2: astore 5
      // 1d4: sipush 6946
      // 1d7: sipush 12577
      // 1da: invokestatic fx_4.a (II)Ljava/lang/String;
      // 1dd: astore 6
      // 1df: ldc2_w 238598075603756721
      // 1e2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1e5: aconst_null
      // 1e6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e9: checkcast java/util/HashSet
      // 1ec: astore 7
      // 1ee: aload 7
      // 1f0: aload 4
      // 1f2: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 1f5: aload 0
      // 1f6: ifnonnull 22a
      // 1f9: ifeq 21c
      // 1fc: goto 203
      // 1ff: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 202: athrow
      // 203: aload 4
      // 205: ldc2_w 523981883291410284
      // 208: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 20b: aconst_null
      // 20c: dup2_x1
      // 20d: pop2
      // 20e: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 211: aload 0
      // 212: ifnull 2aa
      // 215: goto 21c
      // 218: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 21b: athrow
      // 21c: aload 7
      // 21e: aload 5
      // 220: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 223: goto 22a
      // 226: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 229: athrow
      // 22a: aload 0
      // 22b: ifnonnull 25f
      // 22e: ifeq 251
      // 231: goto 238
      // 234: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 237: athrow
      // 238: aload 5
      // 23a: ldc2_w 523981883291410284
      // 23d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 240: aconst_null
      // 241: dup2_x1
      // 242: pop2
      // 243: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 246: aload 0
      // 247: ifnull 2aa
      // 24a: goto 251
      // 24d: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 250: athrow
      // 251: aload 7
      // 253: aload 6
      // 255: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 258: goto 25f
      // 25b: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 25e: athrow
      // 25f: aload 0
      // 260: ifnonnull 293
      // 263: ifeq 286
      // 266: goto 26d
      // 269: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 26c: athrow
      // 26d: aload 6
      // 26f: ldc2_w 523981883291410284
      // 272: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 275: aconst_null
      // 276: dup2_x1
      // 277: pop2
      // 278: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 27b: aload 0
      // 27c: ifnull 2aa
      // 27f: goto 286
      // 282: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 285: athrow
      // 286: aload 7
      // 288: aload 3
      // 289: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 28c: goto 293
      // 28f: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 292: athrow
      // 293: ifeq 2aa
      // 296: aload 3
      // 297: ldc2_w 523981883291410284
      // 29a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 29d: aconst_null
      // 29e: dup2_x1
      // 29f: pop2
      // 2a0: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2a3: goto 2aa
      // 2a6: invokestatic fx_4.a (Ljava/awt/FontFormatException;)Ljava/awt/FontFormatException;
      // 2a9: athrow
      // 2aa: ldc2_w 523981883291410284
      // 2ad: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2b0: aconst_null
      // 2b1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2b4: bipush 0
      // 2b5: iload 1
      // 2b6: invokestatic com/c.a (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 2b9: ldc2_w 438310431153331766
      // 2bc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2bf: swap
      // 2c0: aconst_null
      // 2c1: swap
      // 2c2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2c5: goto 2cc
      // 2c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2cb: athrow
      // 2cc: ldc2_w 395970988011231853
      // 2cf: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2d2: aconst_null
      // 2d3: dup2_x1
      // 2d4: pop2
      // 2d5: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2d8: ldc2_w 395970988011231853
      // 2db: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2de: aconst_null
      // 2df: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2e2: checkcast java/awt/Font
      // 2e5: bipush 1
      // 2e6: iload 1
      // 2e7: i2f
      // 2e8: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 2eb: ldc2_w 449209254921925454
      // 2ee: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2f1: aconst_null
      // 2f2: dup2_x1
      // 2f3: pop2
      // 2f4: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2f7: ldc2_w 395970988011231853
      // 2fa: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2fd: aconst_null
      // 2fe: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 301: checkcast java/awt/Font
      // 304: sipush 7907
      // 307: ldc2_w 8122239910078673181
      // 30a: invokestatic fx_4.a (IJ)I
      // 30d: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 310: ldc2_w 168620665706526093
      // 313: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 316: aconst_null
      // 317: dup2_x1
      // 318: pop2
      // 319: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 31c: ldc2_w 395970988011231853
      // 31f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 322: aconst_null
      // 323: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 326: checkcast java/awt/Font
      // 329: sipush 11663
      // 32c: ldc2_w 2896991060058391165
      // 32f: invokestatic fx_4.a (IJ)I
      // 332: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 335: ldc2_w 238546797805326172
      // 338: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 33b: aconst_null
      // 33c: dup2_x1
      // 33d: pop2
      // 33e: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 341: ldc2_w 395970988011231853
      // 344: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 347: aconst_null
      // 348: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 34b: checkcast java/awt/Font
      // 34e: sipush 19939
      // 351: ldc2_w 1949074466987844108
      // 354: invokestatic fx_4.a (IJ)I
      // 357: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 35a: ldc2_w 236927642915393855
      // 35d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 360: aconst_null
      // 361: dup2_x1
      // 362: pop2
      // 363: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 366: ldc2_w 395970988011231853
      // 369: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 36c: aconst_null
      // 36d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 370: checkcast java/awt/Font
      // 373: sipush 12791
      // 376: ldc2_w 5223701907106717197
      // 379: invokestatic fx_4.a (IJ)I
      // 37c: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 37f: ldc2_w 423003703858242312
      // 382: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 385: aconst_null
      // 386: dup2_x1
      // 387: pop2
      // 388: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 38b: ldc2_w 395970988011231853
      // 38e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 391: aconst_null
      // 392: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 395: checkcast java/awt/Font
      // 398: sipush 1567
      // 39b: ldc2_w 4946749241001503209
      // 39e: invokestatic fx_4.a (IJ)I
      // 3a1: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 3a4: ldc2_w 373239323099996228
      // 3a7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3aa: aconst_null
      // 3ab: dup2_x1
      // 3ac: pop2
      // 3ad: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3b0: ldc2_w 395970988011231853
      // 3b3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3b6: aconst_null
      // 3b7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3ba: checkcast java/awt/Font
      // 3bd: sipush 22471
      // 3c0: ldc2_w 1945943143214266415
      // 3c3: invokestatic fx_4.a (IJ)I
      // 3c6: invokevirtual java/awt/Font.deriveFont (I)Ljava/awt/Font;
      // 3c9: ldc2_w 406637052422931204
      // 3cc: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3cf: aconst_null
      // 3d0: dup2_x1
      // 3d1: pop2
      // 3d2: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3d5: ldc2_w 395970988011231853
      // 3d8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3db: aconst_null
      // 3dc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3df: checkcast java/awt/Font
      // 3e2: bipush 0
      // 3e3: iload 1
      // 3e4: bipush 1
      // 3e5: isub
      // 3e6: i2f
      // 3e7: invokevirtual java/awt/Font.deriveFont (IF)Ljava/awt/Font;
      // 3ea: ldc2_w 593752358540399204
      // 3ed: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3f0: aconst_null
      // 3f1: dup2_x1
      // 3f2: pop2
      // 3f3: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 3f6: ldc2_w 395970988011231853
      // 3f9: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3fc: aconst_null
      // 3fd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 400: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 403: ldc2_w 602415423692123454
      // 406: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 409: swap
      // 40a: aconst_null
      // 40b: swap
      // 40c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 40f: pop
      // 410: goto 417
      // 413: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 416: athrow
      // 417: return
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
      String[] var10000 = F8.y();
      boolean var2 = false;
      String[] var1 = var10000;
      boolean var5 = ((HashSet)com.c.c(238598075603756721L).get(null)).contains(var0);
      if (var1 == null) {
         if (var5) {
            Object[] var6 = com.c.a(var0, 0, a(27761, 1997397399076340626L));
            Method var7 = com.c.d(438310431153331766L);
            Object[] var10 = var6;
            Object var9 = null;

            try {
               var8 = (Font)var7.invoke(var9, var10);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            Font var3 = var8;
            var2 = var3.canDisplay((char)a(4436, 1528345745248353956L));
         }

         var5 = var2;
      }

      return var5;
   }

   private static void g(Font var0) {
      FontUIResource var2 = new FontUIResource(var0);
      String[] var10000 = F8.y();
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
      return (Font)com.c.c(395970988011231853L).get(null);
   }

   public static void u(Font var0) {
      com.c.c(395970988011231853L).set(null, var0);
   }

   public m6 G() {
      return (m6)com.c.c(246607209360964348L).get(this);
   }

   public void G(m6 var1) {
      com.c.c(246607209360964348L).set(this, var1);
   }

   public Window z() {
      return (Window)com.c.c(384633431140789068L).get(this);
   }

   public void u(Window var1) {
      com.c.c(384633431140789068L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
                                    com.c.c(274507651421127580L).setInt(null, a(27174, 4726349126532335066L));
                                    com.c.c(503018106388102479L).set(null, new Color(0, 0, 0));
                                    com.c.c(476153709123937579L)
                                       .set(null, new Color(a(22512, 960993529667368975L), a(5585, 9197729558655498811L), a(5585, 9197729558655498811L)));
                                    com.c.c(461796957683008100L)
                                       .set(null, new Color(a(3379, 8738873055548236509L), a(25180, 4036620769912917438L), a(21842, 2090933165858503329L)));
                                    com.c.c(136831589974125637L)
                                       .set(null, new Color(a(24050, 4029305105094947358L), a(1329, 4891815149675506376L), a(19677, 334602360387871546L)));
                                    com.c.c(623875439513009390L)
                                       .set(
                                          null,
                                          new Color(
                                             a(27281, 8409522371127281008L),
                                             a(6983, 3341685706732762303L),
                                             a(18805, 3587227920034080403L),
                                             a(31221, 5606823337849787925L)
                                          )
                                       );
                                    com.c.c(513155505692963448L).set(null, new Color(a(10329, 5504029929407301565L)));
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

   private static FontFormatException a(FontFormatException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28650;
      if (t[var3] == null) {
         t[var3] = (int)(l[var3] ^ var1);
      }

      return t[var3];
   }
}





