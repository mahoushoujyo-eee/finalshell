package com.finalshell.ui.dialog;

import com.finalshell.core.CH3;
import com.finalshell.core.Ud2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Pt2;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JRadioButton;

public class ApplyToFileAndDirDialog extends JDialog {
   public ArrayList q;
   public JRadioButton S;
   public JRadioButton v;
   public JRadioButton m;
   public CH3 K;
   public Ud2_2 H;
   public Ud2_2 Z;
   public Ud2_2 T;
   public Ud2_2 C;
   public Ud2_2 j;
   public Ud2_2 r;
   public Ud2_2 f;
   public Ud2_2 A;
   public Ud2_2 R;
   public FileBrowserAddressBar U;
   public JCheckBox p;
   public boolean n;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void main(String[] var0) {
      ArrayList var1 = new ArrayList();
      Ck4 var2 = new Ck4();
      Object[] var10001 = Registry.packArgs(a(28978, 8292369206052946264L));
      long var4 = 304207951791694868L;
      Object[] var3 = var10001;
      Ref.h(304207951791694868L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var1.add(var2);
      new ApplyToFileAndDirDialog(null, var1, null);
   }

   public ApplyToFileAndDirDialog(FileBrowserAddressBar param1, ArrayList param2, Window param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: aload 0
      // 0001: aload 3
      // 0002: invokespecial javax/swing/JDialog.<init> (Ljava/awt/Window;)V
      // 0005: aload 0
      // 0006: bipush 0
      // 0007: ldc2_w 358501768619071086
      // 000a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 000d: dup_x2
      // 000e: pop
      // 000f: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 0012: aload 0
      // 0013: aload 1
      // 0014: ldc2_w 284106982926462996
      // 0017: astore 23
      // 0019: astore 22
      // 001b: ldc2_w 284106982926462996
      // 001e: aload 22
      // 0020: aload 23
      // 0022: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0025: aload 0
      // 0026: bipush 1
      // 0027: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.setModal (Z)V
      // 002a: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 002d: aload 0
      // 002e: aload 2
      // 002f: ldc2_w 293213359538664138
      // 0032: astore 25
      // 0034: astore 24
      // 0036: ldc2_w 293213359538664138
      // 0039: aload 24
      // 003b: aload 25
      // 003d: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0040: istore 4
      // 0042: aconst_null
      // 0043: astore 5
      // 0045: aload 0
      // 0046: new com/finalshell/core/CH3
      // 0049: dup
      // 004a: invokespecial com/finalshell/core/CH3.<init> ()V
      // 004d: ldc2_w 476468811070265040
      // 0050: astore 27
      // 0052: astore 26
      // 0054: ldc2_w 476468811070265040
      // 0057: aload 26
      // 0059: aload 27
      // 005b: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 005e: aload 0
      // 005f: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.getContentPane ()Ljava/awt/Container;
      // 0062: checkcast javax/swing/JPanel
      // 0065: astore 6
      // 0067: aload 6
      // 0069: new net/miginfocom/swing/MigLayout
      // 006c: dup
      // 006d: sipush -7615
      // 0070: sipush -3799
      // 0073: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0076: ldc ""
      // 0078: sipush -7604
      // 007b: sipush -10269
      // 007e: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0081: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0084: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 0087: new java/util/ArrayList
      // 008a: dup
      // 008b: invokespecial java/util/ArrayList.<init> ()V
      // 008e: astore 7
      // 0090: aload 2
      // 0091: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0094: astore 8
      // 0096: aload 8
      // 0098: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 009d: ifeq 01b6
      // 00a0: aload 8
      // 00a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 00a7: astore 9
      // 00a9: bipush 0
      // 00aa: istore 10
      // 00ac: aload 9
      // 00ae: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 00b1: iload 4
      // 00b3: ifeq 01c9
      // 00b6: ldc com/finalshell/ui/model/Tf4
      // 00b8: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 00bb: iload 4
      // 00bd: ifeq 0143
      // 00c0: ifeq 0134
      // 00c3: aload 9
      // 00c5: checkcast com/finalshell/ui/model/Tf4
      // 00c8: astore 11
      // 00ca: aload 11
      // 00cc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 00cf: ldc2_w 549229823689592892
      // 00d2: astore 29
      // 00d4: astore 28
      // 00d6: ldc2_w 549229823689592892
      // 00d9: aload 28
      // 00db: aload 29
      // 00dd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 00e0: checkcast java/lang/Integer
      // 00e3: invokevirtual java/lang/Integer.intValue ()I
      // 00e6: goto 00ed
      // 00e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 00ec: athrow
      // 00ed: istore 10
      // 00ef: aload 0
      // 00f0: bipush 1
      // 00f1: ldc2_w 358501768619071086
      // 00f4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00f7: dup_x2
      // 00f8: pop
      // 00f9: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 00fc: aload 5
      // 00fe: iload 4
      // 0100: ifeq 0126
      // 0103: ifnonnull 0128
      // 0106: aload 11
      // 0108: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 010b: ldc2_w 179612178163941306
      // 010e: astore 31
      // 0110: astore 30
      // 0112: ldc2_w 179612178163941306
      // 0115: aload 30
      // 0117: aload 31
      // 0119: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 011c: checkcast java/lang/String
      // 011f: goto 0126
      // 0122: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0125: athrow
      // 0126: astore 5
      // 0128: iload 4
      // 012a: ifne 019e
      // 012d: bipush 5
      // 012e: anewarray 176
      // 0131: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 0134: aload 9
      // 0136: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0139: iload 4
      // 013b: ifeq 0148
      // 013e: ldc com/finalshell/ui/model/Ck4
      // 0140: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0143: ifeq 019e
      // 0146: aload 9
      // 0148: checkcast com/finalshell/ui/model/Ck4
      // 014b: astore 11
      // 014d: aload 11
      // 014f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0152: ldc2_w 498445835749817375
      // 0155: astore 33
      // 0157: astore 32
      // 0159: ldc2_w 498445835749817375
      // 015c: aload 32
      // 015e: aload 33
      // 0160: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0163: checkcast java/lang/Integer
      // 0166: invokevirtual java/lang/Integer.intValue ()I
      // 0169: goto 0170
      // 016c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 016f: athrow
      // 0170: istore 10
      // 0172: aload 5
      // 0174: iload 4
      // 0176: ifeq 019c
      // 0179: ifnonnull 019e
      // 017c: aload 11
      // 017e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0181: ldc2_w 396085629172753019
      // 0184: astore 35
      // 0186: astore 34
      // 0188: ldc2_w 396085629172753019
      // 018b: aload 34
      // 018d: aload 35
      // 018f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0192: checkcast java/lang/String
      // 0195: goto 019c
      // 0198: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 019b: athrow
      // 019c: astore 5
      // 019e: new com/finalshell/core/CH3
      // 01a1: dup
      // 01a2: iload 10
      // 01a4: invokespecial com/finalshell/core/CH3.<init> (I)V
      // 01a7: astore 11
      // 01a9: aload 7
      // 01ab: aload 11
      // 01ad: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 01b0: pop
      // 01b1: iload 4
      // 01b3: ifne 0096
      // 01b6: aload 0
      // 01b7: sipush -7589
      // 01ba: sipush -19863
      // 01bd: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 01c0: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.setTitle (Ljava/lang/String;)V
      // 01c3: aload 7
      // 01c5: bipush 0
      // 01c6: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 01c9: checkcast com/finalshell/core/CH3
      // 01cc: astore 8
      // 01ce: aload 8
      // 01d0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01d3: ldc2_w 222104419787205717
      // 01d6: astore 37
      // 01d8: astore 36
      // 01da: ldc2_w 222104419787205717
      // 01dd: aload 36
      // 01df: aload 37
      // 01e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01e4: checkcast java/lang/Boolean
      // 01e7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01ea: goto 01f1
      // 01ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01f0: athrow
      // 01f1: istore 9
      // 01f3: aload 0
      // 01f4: ldc2_w 476468811070265040
      // 01f7: astore 38
      // 01f9: ldc2_w 476468811070265040
      // 01fc: aload 38
      // 01fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0201: iload 9
      // 0203: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0206: ldc2_w 176793472219243193
      // 0209: astore 41
      // 020b: astore 40
      // 020d: ldc2_w 176793472219243193
      // 0210: aload 40
      // 0212: aload 41
      // 0214: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0217: pop
      // 0218: goto 021f
      // 021b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021e: athrow
      // 021f: aload 7
      // 0221: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0224: astore 10
      // 0226: aload 10
      // 0228: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 022d: ifeq 02a3
      // 0230: aload 10
      // 0232: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0237: checkcast com/finalshell/core/CH3
      // 023a: astore 11
      // 023c: iload 4
      // 023e: ifeq 0299
      // 0241: iload 9
      // 0243: aload 11
      // 0245: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0248: ldc2_w 222104419787205717
      // 024b: astore 43
      // 024d: astore 42
      // 024f: ldc2_w 222104419787205717
      // 0252: aload 42
      // 0254: aload 43
      // 0256: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0259: checkcast java/lang/Boolean
      // 025c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 025f: goto 0266
      // 0262: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0265: athrow
      // 0266: iload 4
      // 0268: ifeq 090e
      // 026b: if_icmpeq 029e
      // 026e: aload 0
      // 026f: ldc2_w 476468811070265040
      // 0272: astore 44
      // 0274: ldc2_w 476468811070265040
      // 0277: aload 44
      // 0279: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 027c: bipush 1
      // 027d: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0280: ldc2_w 599681978132299793
      // 0283: astore 47
      // 0285: astore 46
      // 0287: ldc2_w 599681978132299793
      // 028a: aload 46
      // 028c: aload 47
      // 028e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0291: pop
      // 0292: goto 0299
      // 0295: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0298: athrow
      // 0299: iload 4
      // 029b: ifne 02a3
      // 029e: iload 4
      // 02a0: ifne 0226
      // 02a3: aload 8
      // 02a5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02a8: ldc2_w 151703521374523010
      // 02ab: astore 49
      // 02ad: astore 48
      // 02af: ldc2_w 151703521374523010
      // 02b2: aload 48
      // 02b4: aload 49
      // 02b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02b9: checkcast java/lang/Boolean
      // 02bc: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02bf: goto 02c6
      // 02c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02c5: athrow
      // 02c6: istore 9
      // 02c8: aload 0
      // 02c9: ldc2_w 476468811070265040
      // 02cc: astore 50
      // 02ce: ldc2_w 476468811070265040
      // 02d1: aload 50
      // 02d3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02d6: iload 9
      // 02d8: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 02db: ldc2_w 213329561193723553
      // 02de: astore 53
      // 02e0: astore 52
      // 02e2: ldc2_w 213329561193723553
      // 02e5: aload 52
      // 02e7: aload 53
      // 02e9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02ec: pop
      // 02ed: goto 02f4
      // 02f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02f3: athrow
      // 02f4: aload 7
      // 02f6: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 02f9: astore 10
      // 02fb: aload 10
      // 02fd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0302: ifeq 0378
      // 0305: aload 10
      // 0307: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 030c: checkcast com/finalshell/core/CH3
      // 030f: astore 11
      // 0311: iload 4
      // 0313: ifeq 036e
      // 0316: iload 9
      // 0318: aload 11
      // 031a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 031d: ldc2_w 151703521374523010
      // 0320: astore 55
      // 0322: astore 54
      // 0324: ldc2_w 151703521374523010
      // 0327: aload 54
      // 0329: aload 55
      // 032b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 032e: checkcast java/lang/Boolean
      // 0331: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0334: goto 033b
      // 0337: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 033a: athrow
      // 033b: iload 4
      // 033d: ifeq 090e
      // 0340: if_icmpeq 0373
      // 0343: aload 0
      // 0344: ldc2_w 476468811070265040
      // 0347: astore 56
      // 0349: ldc2_w 476468811070265040
      // 034c: aload 56
      // 034e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0351: bipush 1
      // 0352: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0355: ldc2_w 380931088466003347
      // 0358: astore 59
      // 035a: astore 58
      // 035c: ldc2_w 380931088466003347
      // 035f: aload 58
      // 0361: aload 59
      // 0363: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0366: pop
      // 0367: goto 036e
      // 036a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 036d: athrow
      // 036e: iload 4
      // 0370: ifne 0378
      // 0373: iload 4
      // 0375: ifne 02fb
      // 0378: aload 8
      // 037a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 037d: ldc2_w 553240027343227646
      // 0380: astore 61
      // 0382: astore 60
      // 0384: ldc2_w 553240027343227646
      // 0387: aload 60
      // 0389: aload 61
      // 038b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 038e: checkcast java/lang/Boolean
      // 0391: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0394: goto 039b
      // 0397: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 039a: athrow
      // 039b: istore 9
      // 039d: aload 0
      // 039e: ldc2_w 476468811070265040
      // 03a1: astore 62
      // 03a3: ldc2_w 476468811070265040
      // 03a6: aload 62
      // 03a8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03ab: iload 9
      // 03ad: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 03b0: ldc2_w 365141742439887079
      // 03b3: astore 65
      // 03b5: astore 64
      // 03b7: ldc2_w 365141742439887079
      // 03ba: aload 64
      // 03bc: aload 65
      // 03be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03c1: pop
      // 03c2: goto 03c9
      // 03c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03c8: athrow
      // 03c9: aload 7
      // 03cb: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 03ce: astore 10
      // 03d0: aload 10
      // 03d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03d7: ifeq 044d
      // 03da: aload 10
      // 03dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03e1: checkcast com/finalshell/core/CH3
      // 03e4: astore 11
      // 03e6: iload 4
      // 03e8: ifeq 0443
      // 03eb: iload 9
      // 03ed: aload 11
      // 03ef: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03f2: ldc2_w 553240027343227646
      // 03f5: astore 67
      // 03f7: astore 66
      // 03f9: ldc2_w 553240027343227646
      // 03fc: aload 66
      // 03fe: aload 67
      // 0400: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0403: checkcast java/lang/Boolean
      // 0406: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0409: goto 0410
      // 040c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 040f: athrow
      // 0410: iload 4
      // 0412: ifeq 090e
      // 0415: if_icmpeq 0448
      // 0418: aload 0
      // 0419: ldc2_w 476468811070265040
      // 041c: astore 68
      // 041e: ldc2_w 476468811070265040
      // 0421: aload 68
      // 0423: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0426: bipush 1
      // 0427: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 042a: ldc2_w 157503679410047501
      // 042d: astore 71
      // 042f: astore 70
      // 0431: ldc2_w 157503679410047501
      // 0434: aload 70
      // 0436: aload 71
      // 0438: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 043b: pop
      // 043c: goto 0443
      // 043f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0442: athrow
      // 0443: iload 4
      // 0445: ifne 044d
      // 0448: iload 4
      // 044a: ifne 03d0
      // 044d: aload 8
      // 044f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0452: ldc2_w 478495353062292307
      // 0455: astore 73
      // 0457: astore 72
      // 0459: ldc2_w 478495353062292307
      // 045c: aload 72
      // 045e: aload 73
      // 0460: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0463: checkcast java/lang/Boolean
      // 0466: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0469: goto 0470
      // 046c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 046f: athrow
      // 0470: istore 9
      // 0472: aload 0
      // 0473: ldc2_w 476468811070265040
      // 0476: astore 74
      // 0478: ldc2_w 476468811070265040
      // 047b: aload 74
      // 047d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0480: iload 9
      // 0482: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0485: ldc2_w 260128928137645271
      // 0488: astore 77
      // 048a: astore 76
      // 048c: ldc2_w 260128928137645271
      // 048f: aload 76
      // 0491: aload 77
      // 0493: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0496: pop
      // 0497: goto 049e
      // 049a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 049d: athrow
      // 049e: aload 7
      // 04a0: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 04a3: astore 10
      // 04a5: aload 10
      // 04a7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04ac: ifeq 0522
      // 04af: aload 10
      // 04b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04b6: checkcast com/finalshell/core/CH3
      // 04b9: astore 11
      // 04bb: iload 4
      // 04bd: ifeq 0518
      // 04c0: iload 9
      // 04c2: aload 11
      // 04c4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04c7: ldc2_w 478495353062292307
      // 04ca: astore 79
      // 04cc: astore 78
      // 04ce: ldc2_w 478495353062292307
      // 04d1: aload 78
      // 04d3: aload 79
      // 04d5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04d8: checkcast java/lang/Boolean
      // 04db: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04de: goto 04e5
      // 04e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04e4: athrow
      // 04e5: iload 4
      // 04e7: ifeq 090e
      // 04ea: if_icmpeq 051d
      // 04ed: aload 0
      // 04ee: ldc2_w 476468811070265040
      // 04f1: astore 80
      // 04f3: ldc2_w 476468811070265040
      // 04f6: aload 80
      // 04f8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04fb: bipush 1
      // 04fc: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 04ff: ldc2_w 459066974758209809
      // 0502: astore 83
      // 0504: astore 82
      // 0506: ldc2_w 459066974758209809
      // 0509: aload 82
      // 050b: aload 83
      // 050d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0510: pop
      // 0511: goto 0518
      // 0514: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0517: athrow
      // 0518: iload 4
      // 051a: ifne 0522
      // 051d: iload 4
      // 051f: ifne 04a5
      // 0522: aload 8
      // 0524: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0527: ldc2_w 602871526512576299
      // 052a: astore 85
      // 052c: astore 84
      // 052e: ldc2_w 602871526512576299
      // 0531: aload 84
      // 0533: aload 85
      // 0535: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0538: checkcast java/lang/Boolean
      // 053b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 053e: goto 0545
      // 0541: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0544: athrow
      // 0545: istore 9
      // 0547: aload 0
      // 0548: ldc2_w 476468811070265040
      // 054b: astore 86
      // 054d: ldc2_w 476468811070265040
      // 0550: aload 86
      // 0552: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0555: iload 9
      // 0557: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 055a: ldc2_w 133593502820992167
      // 055d: astore 89
      // 055f: astore 88
      // 0561: ldc2_w 133593502820992167
      // 0564: aload 88
      // 0566: aload 89
      // 0568: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 056b: pop
      // 056c: goto 0573
      // 056f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0572: athrow
      // 0573: aload 7
      // 0575: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0578: astore 10
      // 057a: aload 10
      // 057c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0581: ifeq 05f7
      // 0584: aload 10
      // 0586: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 058b: checkcast com/finalshell/core/CH3
      // 058e: astore 11
      // 0590: iload 4
      // 0592: ifeq 05ed
      // 0595: iload 9
      // 0597: aload 11
      // 0599: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 059c: ldc2_w 602871526512576299
      // 059f: astore 91
      // 05a1: astore 90
      // 05a3: ldc2_w 602871526512576299
      // 05a6: aload 90
      // 05a8: aload 91
      // 05aa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05ad: checkcast java/lang/Boolean
      // 05b0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05b3: goto 05ba
      // 05b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05b9: athrow
      // 05ba: iload 4
      // 05bc: ifeq 090e
      // 05bf: if_icmpeq 05f2
      // 05c2: aload 0
      // 05c3: ldc2_w 476468811070265040
      // 05c6: astore 92
      // 05c8: ldc2_w 476468811070265040
      // 05cb: aload 92
      // 05cd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05d0: bipush 1
      // 05d1: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 05d4: ldc2_w 495939016008575191
      // 05d7: astore 95
      // 05d9: astore 94
      // 05db: ldc2_w 495939016008575191
      // 05de: aload 94
      // 05e0: aload 95
      // 05e2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05e5: pop
      // 05e6: goto 05ed
      // 05e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05ec: athrow
      // 05ed: iload 4
      // 05ef: ifne 05f7
      // 05f2: iload 4
      // 05f4: ifne 057a
      // 05f7: aload 8
      // 05f9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05fc: ldc2_w 573220489640044246
      // 05ff: astore 97
      // 0601: astore 96
      // 0603: ldc2_w 573220489640044246
      // 0606: aload 96
      // 0608: aload 97
      // 060a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 060d: checkcast java/lang/Boolean
      // 0610: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0613: goto 061a
      // 0616: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0619: athrow
      // 061a: istore 9
      // 061c: aload 0
      // 061d: ldc2_w 476468811070265040
      // 0620: astore 98
      // 0622: ldc2_w 476468811070265040
      // 0625: aload 98
      // 0627: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 062a: iload 9
      // 062c: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 062f: ldc2_w 514552260056769581
      // 0632: astore 101
      // 0634: astore 100
      // 0636: ldc2_w 514552260056769581
      // 0639: aload 100
      // 063b: aload 101
      // 063d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0640: pop
      // 0641: goto 0648
      // 0644: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0647: athrow
      // 0648: aload 7
      // 064a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 064d: astore 10
      // 064f: aload 10
      // 0651: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0656: ifeq 06cc
      // 0659: aload 10
      // 065b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0660: checkcast com/finalshell/core/CH3
      // 0663: astore 11
      // 0665: iload 4
      // 0667: ifeq 06c2
      // 066a: iload 9
      // 066c: aload 11
      // 066e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0671: ldc2_w 573220489640044246
      // 0674: astore 103
      // 0676: astore 102
      // 0678: ldc2_w 573220489640044246
      // 067b: aload 102
      // 067d: aload 103
      // 067f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0682: checkcast java/lang/Boolean
      // 0685: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0688: goto 068f
      // 068b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 068e: athrow
      // 068f: iload 4
      // 0691: ifeq 090e
      // 0694: if_icmpeq 06c7
      // 0697: aload 0
      // 0698: ldc2_w 476468811070265040
      // 069b: astore 104
      // 069d: ldc2_w 476468811070265040
      // 06a0: aload 104
      // 06a2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06a5: bipush 1
      // 06a6: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 06a9: ldc2_w 505709464139575556
      // 06ac: astore 107
      // 06ae: astore 106
      // 06b0: ldc2_w 505709464139575556
      // 06b3: aload 106
      // 06b5: aload 107
      // 06b7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06ba: pop
      // 06bb: goto 06c2
      // 06be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06c1: athrow
      // 06c2: iload 4
      // 06c4: ifne 06cc
      // 06c7: iload 4
      // 06c9: ifne 064f
      // 06cc: aload 8
      // 06ce: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06d1: ldc2_w 172398918030773532
      // 06d4: astore 109
      // 06d6: astore 108
      // 06d8: ldc2_w 172398918030773532
      // 06db: aload 108
      // 06dd: aload 109
      // 06df: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06e2: checkcast java/lang/Boolean
      // 06e5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06e8: goto 06ef
      // 06eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06ee: athrow
      // 06ef: istore 9
      // 06f1: aload 0
      // 06f2: ldc2_w 476468811070265040
      // 06f5: astore 110
      // 06f7: ldc2_w 476468811070265040
      // 06fa: aload 110
      // 06fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06ff: iload 9
      // 0701: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0704: ldc2_w 355183223593251548
      // 0707: astore 113
      // 0709: astore 112
      // 070b: ldc2_w 355183223593251548
      // 070e: aload 112
      // 0710: aload 113
      // 0712: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0715: pop
      // 0716: goto 071d
      // 0719: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 071c: athrow
      // 071d: aload 7
      // 071f: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0722: astore 10
      // 0724: aload 10
      // 0726: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 072b: ifeq 07a1
      // 072e: aload 10
      // 0730: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0735: checkcast com/finalshell/core/CH3
      // 0738: astore 11
      // 073a: iload 4
      // 073c: ifeq 0797
      // 073f: iload 9
      // 0741: aload 11
      // 0743: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0746: ldc2_w 172398918030773532
      // 0749: astore 115
      // 074b: astore 114
      // 074d: ldc2_w 172398918030773532
      // 0750: aload 114
      // 0752: aload 115
      // 0754: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0757: checkcast java/lang/Boolean
      // 075a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 075d: goto 0764
      // 0760: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0763: athrow
      // 0764: iload 4
      // 0766: ifeq 090e
      // 0769: if_icmpeq 079c
      // 076c: aload 0
      // 076d: ldc2_w 476468811070265040
      // 0770: astore 116
      // 0772: ldc2_w 476468811070265040
      // 0775: aload 116
      // 0777: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 077a: bipush 1
      // 077b: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 077e: ldc2_w 622241417393780451
      // 0781: astore 119
      // 0783: astore 118
      // 0785: ldc2_w 622241417393780451
      // 0788: aload 118
      // 078a: aload 119
      // 078c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 078f: pop
      // 0790: goto 0797
      // 0793: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0796: athrow
      // 0797: iload 4
      // 0799: ifne 07a1
      // 079c: iload 4
      // 079e: ifne 0724
      // 07a1: aload 8
      // 07a3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07a6: ldc2_w 408063576801388858
      // 07a9: astore 121
      // 07ab: astore 120
      // 07ad: ldc2_w 408063576801388858
      // 07b0: aload 120
      // 07b2: aload 121
      // 07b4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07b7: checkcast java/lang/Boolean
      // 07ba: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07bd: goto 07c4
      // 07c0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07c3: athrow
      // 07c4: istore 9
      // 07c6: aload 0
      // 07c7: ldc2_w 476468811070265040
      // 07ca: astore 122
      // 07cc: ldc2_w 476468811070265040
      // 07cf: aload 122
      // 07d1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07d4: iload 9
      // 07d6: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 07d9: ldc2_w 429127336507826559
      // 07dc: astore 125
      // 07de: astore 124
      // 07e0: ldc2_w 429127336507826559
      // 07e3: aload 124
      // 07e5: aload 125
      // 07e7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07ea: pop
      // 07eb: goto 07f2
      // 07ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07f1: athrow
      // 07f2: aload 7
      // 07f4: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 07f7: astore 10
      // 07f9: aload 10
      // 07fb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0800: ifeq 0876
      // 0803: aload 10
      // 0805: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 080a: checkcast com/finalshell/core/CH3
      // 080d: astore 11
      // 080f: iload 4
      // 0811: ifeq 086c
      // 0814: iload 9
      // 0816: aload 11
      // 0818: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 081b: ldc2_w 408063576801388858
      // 081e: astore 127
      // 0820: astore 126
      // 0822: ldc2_w 408063576801388858
      // 0825: aload 126
      // 0827: aload 127
      // 0829: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 082c: checkcast java/lang/Boolean
      // 082f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0832: goto 0839
      // 0835: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0838: athrow
      // 0839: iload 4
      // 083b: ifeq 090e
      // 083e: if_icmpeq 0871
      // 0841: aload 0
      // 0842: ldc2_w 476468811070265040
      // 0845: astore 128
      // 0847: ldc2_w 476468811070265040
      // 084a: aload 128
      // 084c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 084f: bipush 1
      // 0850: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0853: ldc2_w 398474259244545450
      // 0856: astore 131
      // 0858: astore 130
      // 085a: ldc2_w 398474259244545450
      // 085d: aload 130
      // 085f: aload 131
      // 0861: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0864: pop
      // 0865: goto 086c
      // 0868: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 086b: athrow
      // 086c: iload 4
      // 086e: ifne 0876
      // 0871: iload 4
      // 0873: ifne 07f9
      // 0876: aload 8
      // 0878: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 087b: ldc2_w 173251605037134799
      // 087e: astore 133
      // 0880: astore 132
      // 0882: ldc2_w 173251605037134799
      // 0885: aload 132
      // 0887: aload 133
      // 0889: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 088c: checkcast java/lang/Boolean
      // 088f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0892: goto 0899
      // 0895: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0898: athrow
      // 0899: istore 9
      // 089b: aload 0
      // 089c: ldc2_w 476468811070265040
      // 089f: astore 134
      // 08a1: ldc2_w 476468811070265040
      // 08a4: aload 134
      // 08a6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08a9: iload 9
      // 08ab: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 08ae: ldc2_w 284267168157957197
      // 08b1: astore 137
      // 08b3: astore 136
      // 08b5: ldc2_w 284267168157957197
      // 08b8: aload 136
      // 08ba: aload 137
      // 08bc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08bf: pop
      // 08c0: goto 08c7
      // 08c3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08c6: athrow
      // 08c7: aload 7
      // 08c9: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 08cc: astore 10
      // 08ce: aload 10
      // 08d0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08d5: ifeq 0946
      // 08d8: aload 10
      // 08da: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08df: checkcast com/finalshell/core/CH3
      // 08e2: astore 11
      // 08e4: iload 4
      // 08e6: ifeq 093c
      // 08e9: iload 9
      // 08eb: aload 11
      // 08ed: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 08f0: ldc2_w 173251605037134799
      // 08f3: astore 139
      // 08f5: astore 138
      // 08f7: ldc2_w 173251605037134799
      // 08fa: aload 138
      // 08fc: aload 139
      // 08fe: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0901: checkcast java/lang/Boolean
      // 0904: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0907: goto 090e
      // 090a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 090d: athrow
      // 090e: if_icmpeq 0941
      // 0911: aload 0
      // 0912: ldc2_w 476468811070265040
      // 0915: astore 140
      // 0917: ldc2_w 476468811070265040
      // 091a: aload 140
      // 091c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 091f: bipush 1
      // 0920: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0923: ldc2_w 583731070473542370
      // 0926: astore 143
      // 0928: astore 142
      // 092a: ldc2_w 583731070473542370
      // 092d: aload 142
      // 092f: aload 143
      // 0931: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0934: pop
      // 0935: goto 093c
      // 0938: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 093b: athrow
      // 093c: iload 4
      // 093e: ifne 0946
      // 0941: iload 4
      // 0943: ifne 08ce
      // 0946: new javax/swing/JLabel
      // 0949: dup
      // 094a: invokespecial javax/swing/JLabel.<init> ()V
      // 094d: astore 10
      // 094f: aload 10
      // 0951: ldc2_w 168620665706526093
      // 0954: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0957: aconst_null
      // 0958: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 095b: checkcast java/awt/Font
      // 095e: invokevirtual javax/swing/JLabel.setFont (Ljava/awt/Font;)V
      // 0961: aload 6
      // 0963: aload 10
      // 0965: sipush -7614
      // 0968: sipush -12539
      // 096b: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 096e: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0971: aload 10
      // 0973: aload 5
      // 0975: invokevirtual javax/swing/JLabel.setText (Ljava/lang/String;)V
      // 0978: new javax/swing/JPanel
      // 097b: dup
      // 097c: invokespecial javax/swing/JPanel.<init> ()V
      // 097f: astore 11
      // 0981: aload 11
      // 0983: sipush -7591
      // 0986: sipush -20018
      // 0989: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 098c: invokestatic javax/swing/BorderFactory.createTitledBorder (Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
      // 098f: invokevirtual javax/swing/JPanel.setBorder (Ljavax/swing/border/Border;)V
      // 0992: aload 11
      // 0994: new net/miginfocom/swing/MigLayout
      // 0997: dup
      // 0998: sipush -7599
      // 099b: sipush 29672
      // 099e: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 09a1: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;)V
      // 09a4: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 09a7: aload 0
      // 09a8: aload 0
      // 09a9: sipush -7602
      // 09ac: sipush 31147
      // 09af: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 09b2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09b5: ldc2_w 315522700683101344
      // 09b8: astore 145
      // 09ba: astore 144
      // 09bc: ldc2_w 315522700683101344
      // 09bf: aload 144
      // 09c1: aload 145
      // 09c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09c6: goto 09cd
      // 09c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09cc: athrow
      // 09cd: ldc2_w 457947084859654284
      // 09d0: astore 147
      // 09d2: astore 146
      // 09d4: ldc2_w 457947084859654284
      // 09d7: aload 146
      // 09d9: aload 147
      // 09db: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 09de: aload 0
      // 09df: ldc2_w 457947084859654284
      // 09e2: astore 148
      // 09e4: ldc2_w 457947084859654284
      // 09e7: aload 148
      // 09e9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09ec: checkcast com/finalshell/core/Ud2_2
      // 09ef: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 09f2: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 09f5: aload 0
      // 09f6: ldc2_w 457947084859654284
      // 09f9: astore 150
      // 09fb: ldc2_w 457947084859654284
      // 09fe: aload 150
      // 0a00: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a03: checkcast com/finalshell/core/Ud2_2
      // 0a06: new com/finalshell/ui/listener/Fj4
      // 0a09: dup
      // 0a0a: aload 0
      // 0a0b: invokespecial com/finalshell/ui/listener/Fj4.<init> (Lcom/finalshell/ui/dialog/ApplyToFileAndDirDialog;)V
      // 0a0e: invokevirtual com/finalshell/core/Ud2_2.addActionListener (Ljava/awt/event/ActionListener;)V
      // 0a11: aload 11
      // 0a13: aload 0
      // 0a14: ldc2_w 457947084859654284
      // 0a17: astore 152
      // 0a19: ldc2_w 457947084859654284
      // 0a1c: aload 152
      // 0a1e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a21: checkcast com/finalshell/core/Ud2_2
      // 0a24: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0a27: pop
      // 0a28: aload 0
      // 0a29: aload 0
      // 0a2a: sipush -7613
      // 0a2d: sipush -6648
      // 0a30: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0a33: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a36: ldc2_w 315522700683101344
      // 0a39: astore 155
      // 0a3b: astore 154
      // 0a3d: ldc2_w 315522700683101344
      // 0a40: aload 154
      // 0a42: aload 155
      // 0a44: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a47: goto 0a4e
      // 0a4a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a4d: athrow
      // 0a4e: ldc2_w 523871247978046775
      // 0a51: astore 157
      // 0a53: astore 156
      // 0a55: ldc2_w 523871247978046775
      // 0a58: aload 156
      // 0a5a: aload 157
      // 0a5c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a5f: aload 0
      // 0a60: ldc2_w 457947084859654284
      // 0a63: astore 158
      // 0a65: ldc2_w 457947084859654284
      // 0a68: aload 158
      // 0a6a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a6d: checkcast com/finalshell/core/Ud2_2
      // 0a70: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0a73: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0a76: aload 11
      // 0a78: aload 0
      // 0a79: ldc2_w 523871247978046775
      // 0a7c: astore 160
      // 0a7e: ldc2_w 523871247978046775
      // 0a81: aload 160
      // 0a83: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a86: checkcast com/finalshell/core/Ud2_2
      // 0a89: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0a8c: pop
      // 0a8d: aload 0
      // 0a8e: aload 0
      // 0a8f: sipush -7616
      // 0a92: sipush 20257
      // 0a95: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0a98: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a9b: ldc2_w 315522700683101344
      // 0a9e: astore 163
      // 0aa0: astore 162
      // 0aa2: ldc2_w 315522700683101344
      // 0aa5: aload 162
      // 0aa7: aload 163
      // 0aa9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0aac: goto 0ab3
      // 0aaf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ab2: athrow
      // 0ab3: ldc2_w 569451499065139968
      // 0ab6: astore 165
      // 0ab8: astore 164
      // 0aba: ldc2_w 569451499065139968
      // 0abd: aload 164
      // 0abf: aload 165
      // 0ac1: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0ac4: aload 0
      // 0ac5: ldc2_w 457947084859654284
      // 0ac8: astore 166
      // 0aca: ldc2_w 457947084859654284
      // 0acd: aload 166
      // 0acf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ad2: checkcast com/finalshell/core/Ud2_2
      // 0ad5: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0ad8: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0adb: aload 11
      // 0add: aload 0
      // 0ade: ldc2_w 569451499065139968
      // 0ae1: astore 168
      // 0ae3: ldc2_w 569451499065139968
      // 0ae6: aload 168
      // 0ae8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0aeb: checkcast com/finalshell/core/Ud2_2
      // 0aee: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0af1: pop
      // 0af2: aload 6
      // 0af4: aload 11
      // 0af6: sipush -7609
      // 0af9: sipush -15672
      // 0afc: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0aff: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0b02: new javax/swing/JPanel
      // 0b05: dup
      // 0b06: invokespecial javax/swing/JPanel.<init> ()V
      // 0b09: astore 12
      // 0b0b: aload 12
      // 0b0d: ldc_w "组"
      // 0b10: invokestatic javax/swing/BorderFactory.createTitledBorder (Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
      // 0b13: invokevirtual javax/swing/JPanel.setBorder (Ljavax/swing/border/Border;)V
      // 0b16: aload 12
      // 0b18: new net/miginfocom/swing/MigLayout
      // 0b1b: dup
      // 0b1c: sipush -7593
      // 0b1f: sipush -13432
      // 0b22: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0b25: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;)V
      // 0b28: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 0b2b: aload 0
      // 0b2c: aload 0
      // 0b2d: sipush -7600
      // 0b30: sipush 7339
      // 0b33: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0b36: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b39: ldc2_w 315522700683101344
      // 0b3c: astore 171
      // 0b3e: astore 170
      // 0b40: ldc2_w 315522700683101344
      // 0b43: aload 170
      // 0b45: aload 171
      // 0b47: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b4a: goto 0b51
      // 0b4d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b50: athrow
      // 0b51: ldc2_w 318464940548783291
      // 0b54: astore 173
      // 0b56: astore 172
      // 0b58: ldc2_w 318464940548783291
      // 0b5b: aload 172
      // 0b5d: aload 173
      // 0b5f: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0b62: aload 0
      // 0b63: ldc2_w 457947084859654284
      // 0b66: astore 174
      // 0b68: ldc2_w 457947084859654284
      // 0b6b: aload 174
      // 0b6d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b70: checkcast com/finalshell/core/Ud2_2
      // 0b73: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0b76: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0b79: aload 12
      // 0b7b: aload 0
      // 0b7c: ldc2_w 318464940548783291
      // 0b7f: astore 176
      // 0b81: ldc2_w 318464940548783291
      // 0b84: aload 176
      // 0b86: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b89: checkcast com/finalshell/core/Ud2_2
      // 0b8c: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0b8f: pop
      // 0b90: aload 0
      // 0b91: aload 0
      // 0b92: sipush -7611
      // 0b95: sipush 14417
      // 0b98: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0b9b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b9e: ldc2_w 315522700683101344
      // 0ba1: astore 179
      // 0ba3: astore 178
      // 0ba5: ldc2_w 315522700683101344
      // 0ba8: aload 178
      // 0baa: aload 179
      // 0bac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0baf: goto 0bb6
      // 0bb2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0bb5: athrow
      // 0bb6: ldc2_w 597557982173392493
      // 0bb9: astore 181
      // 0bbb: astore 180
      // 0bbd: ldc2_w 597557982173392493
      // 0bc0: aload 180
      // 0bc2: aload 181
      // 0bc4: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0bc7: aload 0
      // 0bc8: ldc2_w 457947084859654284
      // 0bcb: astore 182
      // 0bcd: ldc2_w 457947084859654284
      // 0bd0: aload 182
      // 0bd2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bd5: checkcast com/finalshell/core/Ud2_2
      // 0bd8: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0bdb: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0bde: aload 12
      // 0be0: aload 0
      // 0be1: ldc2_w 597557982173392493
      // 0be4: astore 184
      // 0be6: ldc2_w 597557982173392493
      // 0be9: aload 184
      // 0beb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bee: checkcast com/finalshell/core/Ud2_2
      // 0bf1: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0bf4: pop
      // 0bf5: aload 0
      // 0bf6: aload 0
      // 0bf7: sipush -7605
      // 0bfa: sipush -15303
      // 0bfd: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0c00: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c03: ldc2_w 315522700683101344
      // 0c06: astore 187
      // 0c08: astore 186
      // 0c0a: ldc2_w 315522700683101344
      // 0c0d: aload 186
      // 0c0f: aload 187
      // 0c11: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c14: goto 0c1b
      // 0c17: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c1a: athrow
      // 0c1b: ldc2_w 143355655849149136
      // 0c1e: astore 189
      // 0c20: astore 188
      // 0c22: ldc2_w 143355655849149136
      // 0c25: aload 188
      // 0c27: aload 189
      // 0c29: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c2c: aload 0
      // 0c2d: ldc2_w 457947084859654284
      // 0c30: astore 190
      // 0c32: ldc2_w 457947084859654284
      // 0c35: aload 190
      // 0c37: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c3a: checkcast com/finalshell/core/Ud2_2
      // 0c3d: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0c40: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0c43: aload 12
      // 0c45: aload 0
      // 0c46: ldc2_w 143355655849149136
      // 0c49: astore 192
      // 0c4b: ldc2_w 143355655849149136
      // 0c4e: aload 192
      // 0c50: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c53: checkcast com/finalshell/core/Ud2_2
      // 0c56: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0c59: pop
      // 0c5a: aload 6
      // 0c5c: aload 12
      // 0c5e: sipush -7609
      // 0c61: sipush -15672
      // 0c64: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0c67: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0c6a: new javax/swing/JPanel
      // 0c6d: dup
      // 0c6e: invokespecial javax/swing/JPanel.<init> ()V
      // 0c71: astore 13
      // 0c73: aload 13
      // 0c75: sipush -7607
      // 0c78: sipush -28387
      // 0c7b: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0c7e: invokestatic javax/swing/BorderFactory.createTitledBorder (Ljava/lang/String;)Ljavax/swing/border/TitledBorder;
      // 0c81: invokevirtual javax/swing/JPanel.setBorder (Ljavax/swing/border/Border;)V
      // 0c84: aload 13
      // 0c86: new net/miginfocom/swing/MigLayout
      // 0c89: dup
      // 0c8a: sipush -7593
      // 0c8d: sipush -13432
      // 0c90: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0c93: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;)V
      // 0c96: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 0c99: aload 0
      // 0c9a: aload 0
      // 0c9b: sipush -7600
      // 0c9e: sipush 7339
      // 0ca1: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0ca4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ca7: ldc2_w 315522700683101344
      // 0caa: astore 195
      // 0cac: astore 194
      // 0cae: ldc2_w 315522700683101344
      // 0cb1: aload 194
      // 0cb3: aload 195
      // 0cb5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0cb8: goto 0cbf
      // 0cbb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cbe: athrow
      // 0cbf: ldc2_w 348771235428691169
      // 0cc2: astore 197
      // 0cc4: astore 196
      // 0cc6: ldc2_w 348771235428691169
      // 0cc9: aload 196
      // 0ccb: aload 197
      // 0ccd: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0cd0: aload 0
      // 0cd1: ldc2_w 457947084859654284
      // 0cd4: astore 198
      // 0cd6: ldc2_w 457947084859654284
      // 0cd9: aload 198
      // 0cdb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cde: checkcast com/finalshell/core/Ud2_2
      // 0ce1: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0ce4: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0ce7: aload 13
      // 0ce9: aload 0
      // 0cea: ldc2_w 348771235428691169
      // 0ced: astore 200
      // 0cef: ldc2_w 348771235428691169
      // 0cf2: aload 200
      // 0cf4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cf7: checkcast com/finalshell/core/Ud2_2
      // 0cfa: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0cfd: pop
      // 0cfe: aload 0
      // 0cff: aload 0
      // 0d00: sipush -7611
      // 0d03: sipush 14417
      // 0d06: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0d09: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d0c: ldc2_w 315522700683101344
      // 0d0f: astore 203
      // 0d11: astore 202
      // 0d13: ldc2_w 315522700683101344
      // 0d16: aload 202
      // 0d18: aload 203
      // 0d1a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d1d: goto 0d24
      // 0d20: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d23: athrow
      // 0d24: ldc2_w 166179534613546634
      // 0d27: astore 205
      // 0d29: astore 204
      // 0d2b: ldc2_w 166179534613546634
      // 0d2e: aload 204
      // 0d30: aload 205
      // 0d32: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0d35: aload 0
      // 0d36: ldc2_w 457947084859654284
      // 0d39: astore 206
      // 0d3b: ldc2_w 457947084859654284
      // 0d3e: aload 206
      // 0d40: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d43: checkcast com/finalshell/core/Ud2_2
      // 0d46: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0d49: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0d4c: aload 13
      // 0d4e: aload 0
      // 0d4f: ldc2_w 166179534613546634
      // 0d52: astore 208
      // 0d54: ldc2_w 166179534613546634
      // 0d57: aload 208
      // 0d59: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d5c: checkcast com/finalshell/core/Ud2_2
      // 0d5f: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0d62: pop
      // 0d63: aload 0
      // 0d64: aload 0
      // 0d65: sipush -7605
      // 0d68: sipush -15303
      // 0d6b: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0d6e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d71: ldc2_w 315522700683101344
      // 0d74: astore 211
      // 0d76: astore 210
      // 0d78: ldc2_w 315522700683101344
      // 0d7b: aload 210
      // 0d7d: aload 211
      // 0d7f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d82: goto 0d89
      // 0d85: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d88: athrow
      // 0d89: ldc2_w 600985825617038458
      // 0d8c: astore 213
      // 0d8e: astore 212
      // 0d90: ldc2_w 600985825617038458
      // 0d93: aload 212
      // 0d95: aload 213
      // 0d97: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0d9a: aload 0
      // 0d9b: ldc2_w 457947084859654284
      // 0d9e: astore 214
      // 0da0: ldc2_w 457947084859654284
      // 0da3: aload 214
      // 0da5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0da8: checkcast com/finalshell/core/Ud2_2
      // 0dab: getstatic com/finalshell/ui/model/Pt2.mixed Lcom/finalshell/ui/model/Pt2;
      // 0dae: invokevirtual com/finalshell/core/Ud2_2.X (Lcom/finalshell/ui/model/Pt2;)V
      // 0db1: aload 13
      // 0db3: aload 0
      // 0db4: ldc2_w 600985825617038458
      // 0db7: astore 216
      // 0db9: ldc2_w 600985825617038458
      // 0dbc: aload 216
      // 0dbe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0dc1: checkcast com/finalshell/core/Ud2_2
      // 0dc4: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0dc7: pop
      // 0dc8: aload 6
      // 0dca: aload 13
      // 0dcc: sipush -7609
      // 0dcf: sipush -15672
      // 0dd2: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0dd5: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0dd8: new javax/swing/JPanel
      // 0ddb: dup
      // 0ddc: invokespecial javax/swing/JPanel.<init> ()V
      // 0ddf: astore 14
      // 0de1: aload 14
      // 0de3: new net/miginfocom/swing/MigLayout
      // 0de6: dup
      // 0de7: sipush -7593
      // 0dea: sipush -13432
      // 0ded: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0df0: ldc ""
      // 0df2: sipush -7603
      // 0df5: sipush 10742
      // 0df8: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0dfb: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0dfe: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 0e01: aload 14
      // 0e03: new javax/swing/JLabel
      // 0e06: dup
      // 0e07: sipush -7606
      // 0e0a: sipush -4162
      // 0e0d: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0e10: invokespecial javax/swing/JLabel.<init> (Ljava/lang/String;)V
      // 0e13: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 0e16: pop
      // 0e17: new javax/swing/JTextField
      // 0e1a: dup
      // 0e1b: sipush 9892
      // 0e1e: ldc2_w 9155902151285626575
      // 0e21: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (IJ)I
      // 0e24: invokespecial javax/swing/JTextField.<init> (I)V
      // 0e27: astore 15
      // 0e29: aload 15
      // 0e2b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e2e: ldc2_w 322267315291882359
      // 0e31: astore 218
      // 0e33: ldc2_w 322267315291882359
      // 0e36: aload 218
      // 0e38: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e3b: goto 0e42
      // 0e3e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e41: athrow
      // 0e42: pop
      // 0e43: aload 14
      // 0e45: aload 15
      // 0e47: sipush -7609
      // 0e4a: sipush -15672
      // 0e4d: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0e50: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0e53: new javax/swing/JPanel
      // 0e56: dup
      // 0e57: invokespecial javax/swing/JPanel.<init> ()V
      // 0e5a: astore 16
      // 0e5c: aload 16
      // 0e5e: new net/miginfocom/swing/MigLayout
      // 0e61: dup
      // 0e62: sipush -7590
      // 0e65: sipush -14993
      // 0e68: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0e6b: ldc ""
      // 0e6d: ldc ""
      // 0e6f: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0e72: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 0e75: aload 16
      // 0e77: invokestatic javax/swing/BorderFactory.createEtchedBorder ()Ljavax/swing/border/Border;
      // 0e7a: invokevirtual javax/swing/JPanel.setBorder (Ljavax/swing/border/Border;)V
      // 0e7d: aload 0
      // 0e7e: iload 4
      // 0e80: ifeq 0eff
      // 0e83: ldc2_w 358501768619071086
      // 0e86: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e89: swap
      // 0e8a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0e8d: ifeq 0ea0
      // 0e90: aload 6
      // 0e92: aload 16
      // 0e94: sipush -7609
      // 0e97: sipush -15672
      // 0e9a: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0e9d: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0ea0: aload 0
      // 0ea1: new javax/swing/JCheckBox
      // 0ea4: dup
      // 0ea5: sipush -7612
      // 0ea8: sipush 18579
      // 0eab: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0eae: bipush 0
      // 0eaf: invokespecial javax/swing/JCheckBox.<init> (Ljava/lang/String;Z)V
      // 0eb2: ldc2_w 407652211073591669
      // 0eb5: astore 221
      // 0eb7: astore 220
      // 0eb9: ldc2_w 407652211073591669
      // 0ebc: aload 220
      // 0ebe: aload 221
      // 0ec0: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0ec3: aload 16
      // 0ec5: aload 0
      // 0ec6: ldc2_w 407652211073591669
      // 0ec9: astore 222
      // 0ecb: ldc2_w 407652211073591669
      // 0ece: aload 222
      // 0ed0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ed3: checkcast javax/swing/JCheckBox
      // 0ed6: sipush -7609
      // 0ed9: sipush -15672
      // 0edc: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0edf: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0ee2: aload 0
      // 0ee3: ldc2_w 407652211073591669
      // 0ee6: astore 224
      // 0ee8: ldc2_w 407652211073591669
      // 0eeb: aload 224
      // 0eed: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ef0: checkcast javax/swing/JCheckBox
      // 0ef3: new com/finalshell/ui/listener/L7_2
      // 0ef6: dup
      // 0ef7: aload 0
      // 0ef8: invokespecial com/finalshell/ui/listener/L7_2.<init> (Lcom/finalshell/ui/dialog/ApplyToFileAndDirDialog;)V
      // 0efb: invokevirtual javax/swing/JCheckBox.addActionListener (Ljava/awt/event/ActionListener;)V
      // 0efe: aload 0
      // 0eff: ldc2_w 407652211073591669
      // 0f02: astore 226
      // 0f04: ldc2_w 407652211073591669
      // 0f07: aload 226
      // 0f09: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f0c: checkcast javax/swing/JCheckBox
      // 0f0f: new com/finalshell/ui/listener/Fv4
      // 0f12: dup
      // 0f13: aload 0
      // 0f14: invokespecial com/finalshell/ui/listener/Fv4.<init> (Lcom/finalshell/ui/dialog/ApplyToFileAndDirDialog;)V
      // 0f17: invokevirtual javax/swing/JCheckBox.addItemListener (Ljava/awt/event/ItemListener;)V
      // 0f1a: new javax/swing/JPanel
      // 0f1d: dup
      // 0f1e: invokespecial javax/swing/JPanel.<init> ()V
      // 0f21: astore 17
      // 0f23: aload 17
      // 0f25: new net/miginfocom/swing/MigLayout
      // 0f28: dup
      // 0f29: sipush -7601
      // 0f2c: sipush -17041
      // 0f2f: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0f32: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;)V
      // 0f35: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 0f38: new javax/swing/ButtonGroup
      // 0f3b: dup
      // 0f3c: invokespecial javax/swing/ButtonGroup.<init> ()V
      // 0f3f: astore 18
      // 0f41: aload 0
      // 0f42: new javax/swing/JRadioButton
      // 0f45: dup
      // 0f46: sipush -7594
      // 0f49: sipush -5903
      // 0f4c: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0f4f: bipush 1
      // 0f50: invokespecial javax/swing/JRadioButton.<init> (Ljava/lang/String;Z)V
      // 0f53: ldc2_w 551807616942168493
      // 0f56: astore 229
      // 0f58: astore 228
      // 0f5a: ldc2_w 551807616942168493
      // 0f5d: aload 228
      // 0f5f: aload 229
      // 0f61: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0f64: aload 18
      // 0f66: aload 0
      // 0f67: ldc2_w 551807616942168493
      // 0f6a: astore 230
      // 0f6c: ldc2_w 551807616942168493
      // 0f6f: aload 230
      // 0f71: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f74: checkcast javax/swing/JRadioButton
      // 0f77: invokevirtual javax/swing/ButtonGroup.add (Ljavax/swing/AbstractButton;)V
      // 0f7a: aload 17
      // 0f7c: aload 0
      // 0f7d: ldc2_w 551807616942168493
      // 0f80: astore 232
      // 0f82: ldc2_w 551807616942168493
      // 0f85: aload 232
      // 0f87: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f8a: checkcast javax/swing/JRadioButton
      // 0f8d: sipush -7609
      // 0f90: sipush -15672
      // 0f93: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0f96: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0f99: aload 0
      // 0f9a: new javax/swing/JRadioButton
      // 0f9d: dup
      // 0f9e: sipush -7595
      // 0fa1: sipush 14742
      // 0fa4: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0fa7: invokespecial javax/swing/JRadioButton.<init> (Ljava/lang/String;)V
      // 0faa: ldc2_w 425112920809369248
      // 0fad: astore 235
      // 0faf: astore 234
      // 0fb1: ldc2_w 425112920809369248
      // 0fb4: aload 234
      // 0fb6: aload 235
      // 0fb8: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0fbb: aload 18
      // 0fbd: aload 0
      // 0fbe: ldc2_w 425112920809369248
      // 0fc1: astore 236
      // 0fc3: ldc2_w 425112920809369248
      // 0fc6: aload 236
      // 0fc8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fcb: checkcast javax/swing/JRadioButton
      // 0fce: invokevirtual javax/swing/ButtonGroup.add (Ljavax/swing/AbstractButton;)V
      // 0fd1: aload 17
      // 0fd3: aload 0
      // 0fd4: ldc2_w 425112920809369248
      // 0fd7: astore 238
      // 0fd9: ldc2_w 425112920809369248
      // 0fdc: aload 238
      // 0fde: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fe1: checkcast javax/swing/JRadioButton
      // 0fe4: sipush -7609
      // 0fe7: sipush -15672
      // 0fea: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0fed: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0ff0: aload 0
      // 0ff1: new javax/swing/JRadioButton
      // 0ff4: dup
      // 0ff5: sipush -7597
      // 0ff8: sipush -15904
      // 0ffb: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 0ffe: invokespecial javax/swing/JRadioButton.<init> (Ljava/lang/String;)V
      // 1001: ldc2_w 411036142919789727
      // 1004: astore 241
      // 1006: astore 240
      // 1008: ldc2_w 411036142919789727
      // 100b: aload 240
      // 100d: aload 241
      // 100f: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1012: aload 18
      // 1014: aload 0
      // 1015: ldc2_w 411036142919789727
      // 1018: astore 242
      // 101a: ldc2_w 411036142919789727
      // 101d: aload 242
      // 101f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1022: checkcast javax/swing/JRadioButton
      // 1025: invokevirtual javax/swing/ButtonGroup.add (Ljavax/swing/AbstractButton;)V
      // 1028: aload 17
      // 102a: aload 0
      // 102b: ldc2_w 411036142919789727
      // 102e: astore 244
      // 1030: ldc2_w 411036142919789727
      // 1033: aload 244
      // 1035: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1038: checkcast javax/swing/JRadioButton
      // 103b: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 103e: pop
      // 103f: aload 16
      // 1041: aload 17
      // 1043: sipush -7609
      // 1046: sipush -15672
      // 1049: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 104c: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 104f: new javax/swing/JPanel
      // 1052: dup
      // 1053: invokespecial javax/swing/JPanel.<init> ()V
      // 1056: astore 19
      // 1058: aload 19
      // 105a: new net/miginfocom/swing/MigLayout
      // 105d: dup
      // 105e: sipush -7608
      // 1061: sipush 14301
      // 1064: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 1067: invokespecial net/miginfocom/swing/MigLayout.<init> (Ljava/lang/String;)V
      // 106a: invokevirtual javax/swing/JPanel.setLayout (Ljava/awt/LayoutManager;)V
      // 106d: aload 6
      // 106f: aload 19
      // 1071: sipush -7610
      // 1074: sipush 17440
      // 1077: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 107a: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;Ljava/lang/Object;)V
      // 107d: new javax/swing/JButton
      // 1080: dup
      // 1081: sipush -7592
      // 1084: sipush -6347
      // 1087: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 108a: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 108d: astore 20
      // 108f: aload 20
      // 1091: new com/finalshell/ui/listener/Dt2
      // 1094: dup
      // 1095: aload 0
      // 1096: invokespecial com/finalshell/ui/listener/Dt2.<init> (Lcom/finalshell/ui/dialog/ApplyToFileAndDirDialog;)V
      // 1099: invokevirtual javax/swing/JButton.addActionListener (Ljava/awt/event/ActionListener;)V
      // 109c: aload 19
      // 109e: aload 20
      // 10a0: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 10a3: pop
      // 10a4: new javax/swing/JButton
      // 10a7: dup
      // 10a8: sipush -7596
      // 10ab: sipush -25241
      // 10ae: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 10b1: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 10b4: astore 21
      // 10b6: aload 21
      // 10b8: new com/finalshell/ui/listener/KK3
      // 10bb: dup
      // 10bc: aload 0
      // 10bd: invokespecial com/finalshell/ui/listener/KK3.<init> (Lcom/finalshell/ui/dialog/ApplyToFileAndDirDialog;)V
      // 10c0: invokevirtual javax/swing/JButton.addActionListener (Ljava/awt/event/ActionListener;)V
      // 10c3: aload 19
      // 10c5: aload 21
      // 10c7: invokevirtual javax/swing/JPanel.add (Ljava/awt/Component;)Ljava/awt/Component;
      // 10ca: pop
      // 10cb: aload 0
      // 10cc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10cf: ldc2_w 569560317630803778
      // 10d2: astore 247
      // 10d4: astore 246
      // 10d6: ldc2_w 569560317630803778
      // 10d9: aload 246
      // 10db: aload 247
      // 10dd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10e0: pop
      // 10e1: goto 10e8
      // 10e4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10e7: athrow
      // 10e8: aload 0
      // 10e9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10ec: ldc2_w 500111352300516328
      // 10ef: astore 249
      // 10f1: astore 248
      // 10f3: ldc2_w 500111352300516328
      // 10f6: aload 248
      // 10f8: aload 249
      // 10fa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10fd: pop
      // 10fe: goto 1105
      // 1101: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1104: athrow
      // 1105: aload 0
      // 1106: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.pack ()V
      // 1109: aload 0
      // 110a: aload 3
      // 110b: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.setLocationRelativeTo (Ljava/awt/Component;)V
      // 110e: aload 0
      // 110f: bipush 1
      // 1110: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.setVisible (Z)V
      // 1113: return
   }

   public void R() {
      Object var2 = 407652211073591669L;
      boolean var1 = ((JCheckBox)Ref.g(407652211073591669L, var2)).isSelected();
      Object var4 = 551807616942168493L;
      ((JRadioButton)Ref.g(551807616942168493L, var4)).setEnabled(var1);
      Object var6 = 425112920809369248L;
      ((JRadioButton)Ref.g(425112920809369248L, var6)).setEnabled(var1);
      Object var8 = 411036142919789727L;
      ((JRadioButton)Ref.g(411036142919789727L, var8)).setEnabled(var1);
   }

   public void p() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: ldc2_w 551807616942168493
      // 008: astore 24
      // 00a: ldc2_w 551807616942168493
      // 00d: aload 24
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast javax/swing/JRadioButton
      // 015: invokevirtual javax/swing/JRadioButton.isSelected ()Z
      // 018: iload 1
      // 019: ifeq 041
      // 01c: ifeq 053
      // 01f: goto 026
      // 022: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 0
      // 027: ldc2_w 407652211073591669
      // 02a: astore 26
      // 02c: ldc2_w 407652211073591669
      // 02f: aload 26
      // 031: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 034: checkcast javax/swing/JCheckBox
      // 037: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: iload 1
      // 042: ifeq 050
      // 045: ifeq 053
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: bipush 1
      // 050: goto 054
      // 053: bipush 0
      // 054: istore 2
      // 055: aload 0
      // 056: ldc2_w 411036142919789727
      // 059: astore 28
      // 05b: ldc2_w 411036142919789727
      // 05e: aload 28
      // 060: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 063: checkcast javax/swing/JRadioButton
      // 066: invokevirtual javax/swing/JRadioButton.isSelected ()Z
      // 069: iload 1
      // 06a: ifeq 092
      // 06d: ifeq 0a4
      // 070: goto 077
      // 073: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: aload 0
      // 078: ldc2_w 407652211073591669
      // 07b: astore 30
      // 07d: ldc2_w 407652211073591669
      // 080: aload 30
      // 082: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 085: checkcast javax/swing/JCheckBox
      // 088: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: iload 1
      // 093: ifeq 0a1
      // 096: ifeq 0a4
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 1
      // 0a1: goto 0a5
      // 0a4: bipush 0
      // 0a5: istore 3
      // 0a6: aload 0
      // 0a7: ldc2_w 425112920809369248
      // 0aa: astore 32
      // 0ac: ldc2_w 425112920809369248
      // 0af: aload 32
      // 0b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b4: checkcast javax/swing/JRadioButton
      // 0b7: invokevirtual javax/swing/JRadioButton.isSelected ()Z
      // 0ba: iload 1
      // 0bb: ifeq 0e3
      // 0be: ifeq 0f5
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: ldc2_w 407652211073591669
      // 0cc: astore 34
      // 0ce: ldc2_w 407652211073591669
      // 0d1: aload 34
      // 0d3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d6: checkcast javax/swing/JCheckBox
      // 0d9: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: iload 1
      // 0e4: ifeq 0f2
      // 0e7: ifeq 0f5
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: bipush 1
      // 0f2: goto 0f6
      // 0f5: bipush 0
      // 0f6: istore 4
      // 0f8: aload 0
      // 0f9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0fc: ldc2_w 171587370395541788
      // 0ff: astore 37
      // 101: astore 36
      // 103: ldc2_w 171587370395541788
      // 106: aload 36
      // 108: aload 37
      // 10a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10d: checkcast com/finalshell/core/CH3
      // 110: goto 117
      // 113: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 116: athrow
      // 117: astore 5
      // 119: aconst_null
      // 11a: astore 6
      // 11c: aconst_null
      // 11d: astore 7
      // 11f: aconst_null
      // 120: astore 8
      // 122: new java/util/HashMap
      // 125: dup
      // 126: invokespecial java/util/HashMap.<init> ()V
      // 129: astore 9
      // 12b: aload 0
      // 12c: ldc2_w 293213359538664138
      // 12f: astore 38
      // 131: ldc2_w 293213359538664138
      // 134: aload 38
      // 136: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 139: checkcast java/util/ArrayList
      // 13c: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 13f: astore 10
      // 141: aload 10
      // 143: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 148: ifeq 23c
      // 14b: aload 10
      // 14d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 152: astore 11
      // 154: bipush 0
      // 155: istore 12
      // 157: aload 11
      // 159: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 15c: ldc com/finalshell/ui/model/Tf4
      // 15e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 161: iload 1
      // 162: ifeq 1dd
      // 165: ifeq 1c1
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: aload 11
      // 171: checkcast com/finalshell/ui/model/Tf4
      // 174: astore 8
      // 176: aload 8
      // 178: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17b: ldc2_w 549229823689592892
      // 17e: astore 41
      // 180: astore 40
      // 182: ldc2_w 549229823689592892
      // 185: aload 40
      // 187: aload 41
      // 189: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18c: checkcast java/lang/Integer
      // 18f: invokevirtual java/lang/Integer.intValue ()I
      // 192: goto 199
      // 195: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 198: athrow
      // 199: istore 12
      // 19b: aload 8
      // 19d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1a0: ldc2_w 498856411508641826
      // 1a3: astore 43
      // 1a5: astore 42
      // 1a7: ldc2_w 498856411508641826
      // 1aa: aload 42
      // 1ac: aload 43
      // 1ae: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b1: checkcast java/lang/String
      // 1b4: goto 1bb
      // 1b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: astore 6
      // 1bd: iload 1
      // 1be: ifne 22e
      // 1c1: aload 11
      // 1c3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1c6: iload 1
      // 1c7: ifeq 237
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: ldc com/finalshell/ui/model/Ck4
      // 1d3: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1d6: goto 1dd
      // 1d9: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc: athrow
      // 1dd: ifeq 22e
      // 1e0: aload 11
      // 1e2: checkcast com/finalshell/ui/model/Ck4
      // 1e5: astore 7
      // 1e7: aload 7
      // 1e9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ec: ldc2_w 498445835749817375
      // 1ef: astore 45
      // 1f1: astore 44
      // 1f3: ldc2_w 498445835749817375
      // 1f6: aload 44
      // 1f8: aload 45
      // 1fa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fd: checkcast java/lang/Integer
      // 200: invokevirtual java/lang/Integer.intValue ()I
      // 203: goto 20a
      // 206: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 209: athrow
      // 20a: istore 12
      // 20c: aload 7
      // 20e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 211: ldc2_w 605430732347023634
      // 214: astore 47
      // 216: astore 46
      // 218: ldc2_w 605430732347023634
      // 21b: aload 46
      // 21d: aload 47
      // 21f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 222: checkcast java/lang/String
      // 225: goto 22c
      // 228: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: astore 6
      // 22e: aload 9
      // 230: aload 6
      // 232: aload 11
      // 234: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 237: pop
      // 238: iload 1
      // 239: ifne 141
      // 23c: aload 0
      // 23d: ldc2_w 284106982926462996
      // 240: astore 48
      // 242: ldc2_w 284106982926462996
      // 245: aload 48
      // 247: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 24a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 24d: ldc2_w 622340890791521181
      // 250: astore 51
      // 252: astore 50
      // 254: ldc2_w 622340890791521181
      // 257: aload 50
      // 259: aload 51
      // 25b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 25e: checkcast com/finalshell/connection/Connection12
      // 261: goto 268
      // 264: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 267: athrow
      // 268: astore 10
      // 26a: new java/util/ArrayList
      // 26d: dup
      // 26e: invokespecial java/util/ArrayList.<init> ()V
      // 271: astore 11
      // 273: aload 0
      // 274: ldc2_w 358501768619071086
      // 277: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 27a: swap
      // 27b: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 27e: iload 1
      // 27f: ifeq 2a7
      // 282: ifeq 2b9
      // 285: goto 28c
      // 288: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28b: athrow
      // 28c: aload 0
      // 28d: ldc2_w 407652211073591669
      // 290: astore 52
      // 292: ldc2_w 407652211073591669
      // 295: aload 52
      // 297: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 29a: checkcast javax/swing/JCheckBox
      // 29d: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 2a0: goto 2a7
      // 2a3: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a6: athrow
      // 2a7: iload 1
      // 2a8: ifeq 2b6
      // 2ab: ifeq 2b9
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: bipush 1
      // 2b6: goto 2ba
      // 2b9: bipush 0
      // 2ba: istore 12
      // 2bc: aconst_null
      // 2bd: astore 13
      // 2bf: iload 12
      // 2c1: ifeq 2d4
      // 2c4: new com/finalshell/ui/dialog/ProgressDialog
      // 2c7: dup
      // 2c8: aload 0
      // 2c9: invokespecial com/finalshell/ui/dialog/ProgressDialog.<init> (Ljava/awt/Window;)V
      // 2cc: astore 13
      // 2ce: aload 13
      // 2d0: bipush 1
      // 2d1: invokevirtual com/finalshell/ui/dialog/ProgressDialog.setModal (Z)V
      // 2d4: aload 0
      // 2d5: ldc2_w 293213359538664138
      // 2d8: astore 54
      // 2da: ldc2_w 293213359538664138
      // 2dd: aload 54
      // 2df: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2e2: checkcast java/util/ArrayList
      // 2e5: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2e8: astore 14
      // 2ea: aload 14
      // 2ec: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2f1: ifeq 466
      // 2f4: aload 14
      // 2f6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2fb: astore 15
      // 2fd: iload 1
      // 2fe: ifeq 493
      // 301: aload 15
      // 303: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 306: ldc com/finalshell/ui/model/Tf4
      // 308: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 30b: iload 1
      // 30c: ifeq 3d9
      // 30f: goto 316
      // 312: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 315: athrow
      // 316: ifeq 3c8
      // 319: goto 320
      // 31c: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: aload 15
      // 322: checkcast com/finalshell/ui/model/Tf4
      // 325: astore 8
      // 327: aload 8
      // 329: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 32c: ldc2_w 498856411508641826
      // 32f: astore 57
      // 331: astore 56
      // 333: ldc2_w 498856411508641826
      // 336: aload 56
      // 338: aload 57
      // 33a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 33d: checkcast java/lang/String
      // 340: goto 347
      // 343: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 346: athrow
      // 347: astore 6
      // 349: aload 6
      // 34b: astore 16
      // 34d: aload 8
      // 34f: astore 17
      // 351: iload 12
      // 353: iload 1
      // 354: ifeq 3c3
      // 357: ifeq 390
      // 35a: goto 361
      // 35d: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 360: athrow
      // 361: aload 10
      // 363: aload 16
      // 365: aload 11
      // 367: aload 13
      // 369: bipush 1
      // 36a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 36d: ldc2_w 557010342823591586
      // 370: astore 59
      // 372: astore 58
      // 374: ldc2_w 557010342823591586
      // 377: aload 58
      // 379: aload 59
      // 37b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 37e: pop
      // 37f: goto 386
      // 382: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 385: athrow
      // 386: goto 390
      // 389: astore 18
      // 38b: aload 18
      // 38d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 390: aload 11
      // 392: new com/finalshell/core/GZ_2
      // 395: dup
      // 396: aload 16
      // 398: lconst_0
      // 399: aload 17
      // 39b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 39e: ldc2_w 549229823689592892
      // 3a1: astore 61
      // 3a3: astore 60
      // 3a5: ldc2_w 549229823689592892
      // 3a8: aload 60
      // 3aa: aload 61
      // 3ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3af: checkcast java/lang/Integer
      // 3b2: invokevirtual java/lang/Integer.intValue ()I
      // 3b5: goto 3bc
      // 3b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3bb: athrow
      // 3bc: bipush 1
      // 3bd: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 3c0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3c3: pop
      // 3c4: iload 1
      // 3c5: ifne 462
      // 3c8: aload 15
      // 3ca: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3cd: ldc com/finalshell/ui/model/Ck4
      // 3cf: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 3d2: goto 3d9
      // 3d5: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d8: athrow
      // 3d9: iload 1
      // 3da: ifeq 461
      // 3dd: ifeq 462
      // 3e0: goto 3e7
      // 3e3: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e6: athrow
      // 3e7: aload 15
      // 3e9: checkcast com/finalshell/ui/model/Ck4
      // 3ec: astore 7
      // 3ee: aload 11
      // 3f0: new com/finalshell/core/GZ_2
      // 3f3: dup
      // 3f4: aload 7
      // 3f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3f9: ldc2_w 605430732347023634
      // 3fc: astore 63
      // 3fe: astore 62
      // 400: ldc2_w 605430732347023634
      // 403: aload 62
      // 405: aload 63
      // 407: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 40a: checkcast java/lang/String
      // 40d: goto 414
      // 410: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 413: athrow
      // 414: aload 7
      // 416: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 419: ldc2_w 556117124296734693
      // 41c: astore 65
      // 41e: astore 64
      // 420: ldc2_w 556117124296734693
      // 423: aload 64
      // 425: aload 65
      // 427: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 42a: checkcast java/lang/Long
      // 42d: invokevirtual java/lang/Long.longValue ()J
      // 430: goto 437
      // 433: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 436: athrow
      // 437: aload 7
      // 439: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 43c: ldc2_w 498445835749817375
      // 43f: astore 67
      // 441: astore 66
      // 443: ldc2_w 498445835749817375
      // 446: aload 66
      // 448: aload 67
      // 44a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 44d: checkcast java/lang/Integer
      // 450: invokevirtual java/lang/Integer.intValue ()I
      // 453: goto 45a
      // 456: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 459: athrow
      // 45a: bipush 0
      // 45b: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 45e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 461: pop
      // 462: iload 1
      // 463: ifne 2ea
      // 466: aload 13
      // 468: iload 1
      // 469: ifeq 48f
      // 46c: ifnull 483
      // 46f: goto 476
      // 472: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 475: athrow
      // 476: aload 13
      // 478: bipush 0
      // 479: invokevirtual com/finalshell/ui/dialog/ProgressDialog.setVisible (Z)V
      // 47c: goto 483
      // 47f: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 482: athrow
      // 483: new com/finalshell/ui/dialog/ProgressDialog
      // 486: dup
      // 487: aload 0
      // 488: invokespecial com/finalshell/ui/dialog/ProgressDialog.<init> (Ljava/awt/Window;)V
      // 48b: astore 13
      // 48d: aload 13
      // 48f: bipush 1
      // 490: invokevirtual com/finalshell/ui/dialog/ProgressDialog.setModal (Z)V
      // 493: aload 0
      // 494: ldc2_w 284106982926462996
      // 497: astore 68
      // 499: ldc2_w 284106982926462996
      // 49c: aload 68
      // 49e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4a1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4a4: ldc2_w 505246961717689222
      // 4a7: astore 71
      // 4a9: astore 70
      // 4ab: ldc2_w 505246961717689222
      // 4ae: aload 70
      // 4b0: aload 71
      // 4b2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b5: goto 4bc
      // 4b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bb: athrow
      // 4bc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4bf: ldc2_w 371784066522134159
      // 4c2: astore 73
      // 4c4: astore 72
      // 4c6: ldc2_w 371784066522134159
      // 4c9: aload 72
      // 4cb: aload 73
      // 4cd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4d0: checkcast java/util/HashMap
      // 4d3: goto 4da
      // 4d6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d9: athrow
      // 4da: astore 14
      // 4dc: aload 11
      // 4de: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 4e1: astore 15
      // 4e3: aload 15
      // 4e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4ea: ifeq 90c
      // 4ed: aload 15
      // 4ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f4: checkcast com/finalshell/core/GZ_2
      // 4f7: astore 16
      // 4f9: aload 16
      // 4fb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4fe: ldc2_w 552192581091318882
      // 501: astore 75
      // 503: astore 74
      // 505: ldc2_w 552192581091318882
      // 508: aload 74
      // 50a: aload 75
      // 50c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 50f: checkcast java/lang/String
      // 512: goto 519
      // 515: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 518: athrow
      // 519: astore 6
      // 51b: new com/finalshell/core/CH3
      // 51e: dup
      // 51f: aload 16
      // 521: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 524: ldc2_w 126703202877398304
      // 527: astore 77
      // 529: astore 76
      // 52b: ldc2_w 126703202877398304
      // 52e: aload 76
      // 530: aload 77
      // 532: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 535: checkcast java/lang/Integer
      // 538: invokevirtual java/lang/Integer.intValue ()I
      // 53b: goto 542
      // 53e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 541: athrow
      // 542: invokespecial com/finalshell/core/CH3.<init> (I)V
      // 545: astore 17
      // 547: aload 0
      // 548: aload 17
      // 54a: aload 5
      // 54c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 54f: ldc2_w 581704245576079859
      // 552: astore 79
      // 554: astore 78
      // 556: ldc2_w 581704245576079859
      // 559: aload 78
      // 55b: aload 79
      // 55d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 560: checkcast com/finalshell/core/CH3
      // 563: goto 56a
      // 566: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 569: athrow
      // 56a: astore 18
      // 56c: bipush 0
      // 56d: istore 19
      // 56f: bipush 0
      // 570: istore 20
      // 572: iload 1
      // 573: ifeq 917
      // 576: aload 9
      // 578: aload 6
      // 57a: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 57d: iload 1
      // 57e: ifeq 597
      // 581: goto 588
      // 584: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 587: athrow
      // 588: ifeq 595
      // 58b: goto 592
      // 58e: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 591: athrow
      // 592: bipush 1
      // 593: istore 20
      // 595: iload 20
      // 597: iload 1
      // 598: ifeq 5c7
      // 59b: ifeq 5ac
      // 59e: goto 5a5
      // 5a1: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a4: athrow
      // 5a5: bipush 1
      // 5a6: istore 19
      // 5a8: iload 1
      // 5a9: ifne 670
      // 5ac: aload 0
      // 5ad: ldc2_w 407652211073591669
      // 5b0: astore 80
      // 5b2: ldc2_w 407652211073591669
      // 5b5: aload 80
      // 5b7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5ba: checkcast javax/swing/JCheckBox
      // 5bd: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 5c0: goto 5c7
      // 5c3: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c6: athrow
      // 5c7: iload 1
      // 5c8: ifeq 672
      // 5cb: ifeq 670
      // 5ce: goto 5d5
      // 5d1: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d4: athrow
      // 5d5: aload 16
      // 5d7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5da: ldc2_w 501901987609518328
      // 5dd: astore 83
      // 5df: astore 82
      // 5e1: ldc2_w 501901987609518328
      // 5e4: aload 82
      // 5e6: aload 83
      // 5e8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5eb: checkcast java/lang/Boolean
      // 5ee: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5f1: goto 5f8
      // 5f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f7: athrow
      // 5f8: iload 1
      // 5f9: ifeq 648
      // 5fc: goto 603
      // 5ff: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 602: athrow
      // 603: ifeq 640
      // 606: goto 60d
      // 609: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60c: athrow
      // 60d: iload 2
      // 60e: iload 1
      // 60f: ifeq 63a
      // 612: goto 619
      // 615: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 618: athrow
      // 619: ifne 639
      // 61c: goto 623
      // 61f: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 622: athrow
      // 623: iload 3
      // 624: iload 1
      // 625: ifeq 672
      // 628: goto 62f
      // 62b: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62e: athrow
      // 62f: ifeq 670
      // 632: goto 639
      // 635: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 638: athrow
      // 639: bipush 1
      // 63a: istore 19
      // 63c: iload 1
      // 63d: ifne 670
      // 640: iload 2
      // 641: goto 648
      // 644: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 647: athrow
      // 648: iload 1
      // 649: ifeq 66e
      // 64c: ifne 66d
      // 64f: goto 656
      // 652: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 655: athrow
      // 656: iload 4
      // 658: iload 1
      // 659: ifeq 672
      // 65c: goto 663
      // 65f: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 662: athrow
      // 663: ifeq 670
      // 666: goto 66d
      // 669: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66c: athrow
      // 66d: bipush 1
      // 66e: istore 19
      // 670: iload 19
      // 672: ifeq 8fe
      // 675: aload 10
      // 677: aload 18
      // 679: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 67c: ldc2_w 342302554193384759
      // 67f: astore 85
      // 681: astore 84
      // 683: ldc2_w 342302554193384759
      // 686: aload 84
      // 688: aload 85
      // 68a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 68d: checkcast java/lang/Integer
      // 690: invokevirtual java/lang/Integer.intValue ()I
      // 693: goto 69a
      // 696: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 699: athrow
      // 69a: aload 6
      // 69c: invokestatic com/finalshell/reflect/Registry.packArgs (ILjava/lang/Object;)[Ljava/lang/Object;
      // 69f: ldc2_w 590829168067976797
      // 6a2: astore 87
      // 6a4: astore 86
      // 6a6: ldc2_w 590829168067976797
      // 6a9: aload 86
      // 6ab: aload 87
      // 6ad: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6b0: pop
      // 6b1: goto 6b8
      // 6b4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6b7: athrow
      // 6b8: aload 14
      // 6ba: aload 6
      // 6bc: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6bf: astore 21
      // 6c1: aload 21
      // 6c3: ifnull 8fe
      // 6c6: aload 16
      // 6c8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6cb: ldc2_w 501901987609518328
      // 6ce: astore 89
      // 6d0: astore 88
      // 6d2: ldc2_w 501901987609518328
      // 6d5: aload 88
      // 6d7: aload 89
      // 6d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6dc: checkcast java/lang/Boolean
      // 6df: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6e2: goto 6e9
      // 6e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6e8: athrow
      // 6e9: iload 1
      // 6ea: ifeq 7d8
      // 6ed: goto 6f4
      // 6f0: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f3: athrow
      // 6f4: ifeq 7cc
      // 6f7: goto 6fe
      // 6fa: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6fd: athrow
      // 6fe: aload 21
      // 700: instanceof com/finalshell/ui/model/Tf4
      // 703: ifeq 896
      // 706: goto 70d
      // 709: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70c: athrow
      // 70d: aload 10
      // 70f: aload 6
      // 711: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 714: ldc2_w 291861634241198552
      // 717: astore 91
      // 719: astore 90
      // 71b: ldc2_w 291861634241198552
      // 71e: aload 90
      // 720: aload 91
      // 722: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 725: checkcast com/finalshell/ui/model/Tf4
      // 728: goto 72f
      // 72b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 72e: athrow
      // 72f: astore 22
      // 731: aload 21
      // 733: checkcast com/finalshell/ui/model/Tf4
      // 736: astore 23
      // 738: aload 23
      // 73a: aload 22
      // 73c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 73f: ldc2_w 549229823689592892
      // 742: astore 93
      // 744: astore 92
      // 746: ldc2_w 549229823689592892
      // 749: aload 92
      // 74b: aload 93
      // 74d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 750: checkcast java/lang/Integer
      // 753: invokevirtual java/lang/Integer.intValue ()I
      // 756: goto 75d
      // 759: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 75c: athrow
      // 75d: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 760: ldc2_w 571538188428705630
      // 763: astore 95
      // 765: astore 94
      // 767: ldc2_w 571538188428705630
      // 76a: aload 94
      // 76c: aload 95
      // 76e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 771: pop
      // 772: goto 779
      // 775: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 778: athrow
      // 779: aload 23
      // 77b: aload 22
      // 77d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 780: ldc2_w 375336992326046344
      // 783: astore 97
      // 785: astore 96
      // 787: ldc2_w 375336992326046344
      // 78a: aload 96
      // 78c: aload 97
      // 78e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 791: goto 798
      // 794: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 797: athrow
      // 798: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 79b: ldc2_w 261395141772414485
      // 79e: astore 99
      // 7a0: astore 98
      // 7a2: ldc2_w 261395141772414485
      // 7a5: aload 98
      // 7a7: aload 99
      // 7a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7ac: pop
      // 7ad: goto 7b4
      // 7b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7b3: athrow
      // 7b4: aload 0
      // 7b5: ldc2_w 284106982926462996
      // 7b8: astore 100
      // 7ba: ldc2_w 284106982926462996
      // 7bd: aload 100
      // 7bf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 7c2: checkcast com/finalshell/ui/panel/Address
      // 7c5: invokevirtual com/finalshell/ui/panel/Address.repaint ()V
      // 7c8: iload 1
      // 7c9: ifne 896
      // 7cc: aload 21
      // 7ce: instanceof com/finalshell/ui/model/Ck4
      // 7d1: goto 7d8
      // 7d4: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d7: athrow
      // 7d8: ifeq 896
      // 7db: aload 10
      // 7dd: aload 6
      // 7df: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 7e2: ldc2_w 303344491018408266
      // 7e5: astore 103
      // 7e7: astore 102
      // 7e9: ldc2_w 303344491018408266
      // 7ec: aload 102
      // 7ee: aload 103
      // 7f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7f3: checkcast com/finalshell/ui/model/Ck4
      // 7f6: goto 7fd
      // 7f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7fc: athrow
      // 7fd: astore 22
      // 7ff: aload 21
      // 801: checkcast com/finalshell/ui/model/Ck4
      // 804: astore 23
      // 806: aload 23
      // 808: aload 22
      // 80a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 80d: ldc2_w 498445835749817375
      // 810: astore 105
      // 812: astore 104
      // 814: ldc2_w 498445835749817375
      // 817: aload 104
      // 819: aload 105
      // 81b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 81e: checkcast java/lang/Integer
      // 821: invokevirtual java/lang/Integer.intValue ()I
      // 824: goto 82b
      // 827: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 82a: athrow
      // 82b: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 82e: ldc2_w 304207951791694868
      // 831: astore 107
      // 833: astore 106
      // 835: ldc2_w 304207951791694868
      // 838: aload 106
      // 83a: aload 107
      // 83c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 83f: pop
      // 840: goto 847
      // 843: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 846: athrow
      // 847: aload 23
      // 849: aload 22
      // 84b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 84e: ldc2_w 277545572359582529
      // 851: astore 109
      // 853: astore 108
      // 855: ldc2_w 277545572359582529
      // 858: aload 108
      // 85a: aload 109
      // 85c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 85f: goto 866
      // 862: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 865: athrow
      // 866: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 869: ldc2_w 171079686275957967
      // 86c: astore 111
      // 86e: astore 110
      // 870: ldc2_w 171079686275957967
      // 873: aload 110
      // 875: aload 111
      // 877: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 87a: pop
      // 87b: goto 882
      // 87e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 881: athrow
      // 882: aload 0
      // 883: ldc2_w 284106982926462996
      // 886: astore 112
      // 888: ldc2_w 284106982926462996
      // 88b: aload 112
      // 88d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 890: checkcast com/finalshell/ui/panel/Address
      // 893: invokevirtual com/finalshell/ui/panel/Address.repaint ()V
      // 896: aload 13
      // 898: new java/lang/StringBuilder
      // 89b: dup
      // 89c: invokespecial java/lang/StringBuilder.<init> ()V
      // 89f: sipush -7598
      // 8a2: sipush -15331
      // 8a5: invokestatic com/finalshell/ui/dialog/ApplyToFileAndDirDialog.a (II)Ljava/lang/String;
      // 8a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8ab: aload 18
      // 8ad: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 8b0: ldc2_w 342302554193384759
      // 8b3: astore 115
      // 8b5: astore 114
      // 8b7: ldc2_w 342302554193384759
      // 8ba: aload 114
      // 8bc: aload 115
      // 8be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8c1: checkcast java/lang/Integer
      // 8c4: invokevirtual java/lang/Integer.intValue ()I
      // 8c7: goto 8ce
      // 8ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8cd: athrow
      // 8ce: invokestatic java/lang/Integer.toOctalString (I)Ljava/lang/String;
      // 8d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d4: ldc_w "\n"
      // 8d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8da: aload 6
      // 8dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8df: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8e2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8e5: ldc2_w 403347985419057804
      // 8e8: astore 117
      // 8ea: astore 116
      // 8ec: ldc2_w 403347985419057804
      // 8ef: aload 116
      // 8f1: aload 117
      // 8f3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8f6: pop
      // 8f7: goto 8fe
      // 8fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8fd: athrow
      // 8fe: goto 908
      // 901: astore 19
      // 903: aload 19
      // 905: invokevirtual java/lang/Exception.printStackTrace ()V
      // 908: iload 1
      // 909: ifne 4e3
      // 90c: aload 13
      // 90e: bipush 0
      // 90f: invokevirtual com/finalshell/ui/dialog/ProgressDialog.setVisible (Z)V
      // 912: aload 0
      // 913: bipush 0
      // 914: invokevirtual com/finalshell/ui/dialog/ApplyToFileAndDirDialog.setVisible (Z)V
      // 917: return
   }

   public CH3 T(CH3 var1, CH3 var2) {
      Boolean var117;
      Boolean var121;
      Boolean var124;
      Boolean var128;
      Boolean var131;
      Boolean var135;
      Boolean var138;
      Boolean var142;
      Boolean var145;
      Boolean var149;
      Boolean var152;
      Object var154;
      Boolean var156;
      Boolean var159;
      Object var161;
      Boolean var163;
      Boolean var166;
      Boolean var170;
      Boolean var173;
      Boolean var177;
      long var30;
      boolean var3;
      CH3 var4;
      label392: {
         boolean var10000 = FileBrowserAddressBar.i();
         var4 = new CH3();
         var3 = var10000;
         if (var3 && !Registry.lookupField(135675306259301826L).getBoolean(var2)) {
            Object var10002 = Registry.emptyArgs();
            long var6 = 222104419787205717L;
            Object var5 = var10002;
            var10002 = Ref.h(222104419787205717L, var5, var6);

            try {
               var117 = (Boolean)var10002;
            } catch (InvocationTargetException var115) {
               throw var115.getTargetException();
            }

            var10002 = Registry.packArgs(var117);
            long var8 = 176793472219243193L;
            Object var7 = var10002;
            Ref.h(176793472219243193L, var7, var8);

            try {
               ;
            } catch (InvocationTargetException var114) {
               throw var114.getTargetException();
            }

            if (var3) {
               break label392;
            }
         }

         Object var119 = Registry.emptyArgs();
         long var10 = 222104419787205717L;
         Object var9 = var119;
         var119 = Ref.h(222104419787205717L, var9, var10);

         try {
            var121 = (Boolean)var119;
         } catch (InvocationTargetException var113) {
            throw var113.getTargetException();
         }

         var119 = Registry.packArgs(var121);
         long var12 = 176793472219243193L;
         Object var11 = var119;
         Ref.h(176793472219243193L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var112) {
            throw var112.getTargetException();
         }
      }

      label394: {
         if (var3 && !Registry.lookupField(496696850720188296L).getBoolean(var2)) {
            Object var10004 = Registry.emptyArgs();
            long var14 = 151703521374523010L;
            Object var13 = var10004;
            var10004 = Ref.h(151703521374523010L, var13, var14);

            try {
               var124 = (Boolean)var10004;
            } catch (InvocationTargetException var111) {
               throw var111.getTargetException();
            }

            var10004 = Registry.packArgs(var124);
            long var16 = 213329561193723553L;
            Object var15 = var10004;
            Ref.h(213329561193723553L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var110) {
               throw var110.getTargetException();
            }

            if (var3) {
               break label394;
            }
         }

         Object var126 = Registry.emptyArgs();
         long var18 = 151703521374523010L;
         Object var17 = var126;
         var126 = Ref.h(151703521374523010L, var17, var18);

         try {
            var128 = (Boolean)var126;
         } catch (InvocationTargetException var109) {
            throw var109.getTargetException();
         }

         var126 = Registry.packArgs(var128);
         long var20 = 213329561193723553L;
         Object var19 = var126;
         Ref.h(213329561193723553L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var108) {
            throw var108.getTargetException();
         }
      }

      label396: {
         if (var3 && !Registry.lookupField(166894470603572211L).getBoolean(var2)) {
            Object var10006 = Registry.emptyArgs();
            long var22 = 553240027343227646L;
            Object var21 = var10006;
            var10006 = Ref.h(553240027343227646L, var21, var22);

            try {
               var131 = (Boolean)var10006;
            } catch (InvocationTargetException var107) {
               throw var107.getTargetException();
            }

            var10006 = Registry.packArgs(var131);
            long var24 = 365141742439887079L;
            Object var23 = var10006;
            Ref.h(365141742439887079L, var23, var24);

            try {
               ;
            } catch (InvocationTargetException var106) {
               throw var106.getTargetException();
            }

            if (var3) {
               break label396;
            }
         }

         Object var133 = Registry.emptyArgs();
         long var26 = 553240027343227646L;
         Object var25 = var133;
         var133 = Ref.h(553240027343227646L, var25, var26);

         try {
            var135 = (Boolean)var133;
         } catch (InvocationTargetException var105) {
            throw var105.getTargetException();
         }

         var133 = Registry.packArgs(var135);
         long var28 = 365141742439887079L;
         Object var27 = var133;
         Ref.h(365141742439887079L, var27, var28);

         try {
            ;
         } catch (InvocationTargetException var104) {
            throw var104.getTargetException();
         }
      }

      label398: {
         if (var3 && !Registry.lookupField(135367755104959231L).getBoolean(var2)) {
            Object var10008 = Registry.emptyArgs();
            var30 = 478495353062292307L;
            Object var29 = var10008;
            var10008 = Ref.h(478495353062292307L, var29, var30);

            try {
               var138 = (Boolean)var10008;
            } catch (InvocationTargetException var103) {
               throw var103.getTargetException();
            }

            var10008 = Registry.packArgs(var138);
            long var32 = 260128928137645271L;
            Object var31 = var10008;
            Ref.h(260128928137645271L, var31, var32);

            try {
               ;
            } catch (InvocationTargetException var102) {
               throw var102.getTargetException();
            }

            if (var3) {
               break label398;
            }
         }

         Object var140 = Registry.emptyArgs();
         long var34 = 478495353062292307L;
         Object var33 = var140;
         var140 = Ref.h(478495353062292307L, var33, var34);

         try {
            var142 = (Boolean)var140;
         } catch (InvocationTargetException var101) {
            throw var101.getTargetException();
         }

         var140 = Registry.packArgs(var142);
         long var36 = 260128928137645271L;
         Object var35 = var140;
         Ref.h(260128928137645271L, var35, var36);

         try {
            ;
         } catch (InvocationTargetException var100) {
            throw var100.getTargetException();
         }
      }

      label400: {
         if (var3 && !Registry.lookupField(600336899131817808L).getBoolean(var2)) {
            Object var10010 = Registry.emptyArgs();
            long var38 = 602871526512576299L;
            Object var37 = var10010;
            var10010 = Ref.h(602871526512576299L, var37, var38);

            try {
               var145 = (Boolean)var10010;
            } catch (InvocationTargetException var99) {
               throw var99.getTargetException();
            }

            var10010 = Registry.packArgs(var145);
            long var40 = 133593502820992167L;
            Object var39 = var10010;
            Ref.h(133593502820992167L, var39, var40);

            try {
               ;
            } catch (InvocationTargetException var98) {
               throw var98.getTargetException();
            }

            if (var3) {
               break label400;
            }
         }

         Object var147 = Registry.emptyArgs();
         long var42 = 602871526512576299L;
         Object var41 = var147;
         var147 = Ref.h(602871526512576299L, var41, var42);

         try {
            var149 = (Boolean)var147;
         } catch (InvocationTargetException var97) {
            throw var97.getTargetException();
         }

         var147 = Registry.packArgs(var149);
         long var44 = 133593502820992167L;
         Object var43 = var147;
         Ref.h(133593502820992167L, var43, var44);

         try {
            ;
         } catch (InvocationTargetException var96) {
            throw var96.getTargetException();
         }
      }

      label402: {
         if (var3 && !Registry.lookupField(120839537463655741L).getBoolean(var2)) {
            Object var10012 = Registry.emptyArgs();
            long var46 = 573220489640044246L;
            Object var45 = var10012;
            var10012 = Ref.h(573220489640044246L, var45, var46);

            try {
               var152 = (Boolean)var10012;
            } catch (InvocationTargetException var95) {
               throw var95.getTargetException();
            }

            var10012 = Registry.packArgs(var152);
            long var48 = 514552260056769581L;
            Object var47 = var10012;
            Ref.h(514552260056769581L, var47, var48);

            try {
               ;
            } catch (InvocationTargetException var94) {
               throw var94.getTargetException();
            }

            if (var3) {
               break label402;
            }
         }

         var154 = Registry.emptyArgs();
         long var50 = 573220489640044246L;
         Object var49 = var154;
         var154 = Ref.h(573220489640044246L, var49, var50);

         try {
            var156 = (Boolean)var154;
         } catch (InvocationTargetException var93) {
            throw var93.getTargetException();
         }

         var154 = Registry.packArgs(var156);
         long var52 = 514552260056769581L;
         Object var51 = var154;
         Ref.h(514552260056769581L, var51, var52);

         try {
            ;
         } catch (InvocationTargetException var92) {
            throw var92.getTargetException();
         }
      }

      label404: {
         if (var3 && !Registry.lookupField(431763385835130331L).getBoolean(var2)) {
            Object var10014 = Registry.emptyArgs();
            long var54 = 172398918030773532L;
            Object var53 = var10014;
            var10014 = Ref.h(172398918030773532L, var53, var54);

            try {
               var159 = (Boolean)var10014;
            } catch (InvocationTargetException var91) {
               throw var91.getTargetException();
            }

            var10014 = Registry.packArgs(var159);
            long var56 = 355183223593251548L;
            Object var55 = var10014;
            Ref.h(355183223593251548L, var55, var56);

            try {
               ;
            } catch (InvocationTargetException var90) {
               throw var90.getTargetException();
            }

            if (var3) {
               break label404;
            }
         }

         var161 = Registry.emptyArgs();
         long var58 = 172398918030773532L;
         Object var57 = var161;
         var161 = Ref.h(172398918030773532L, var57, var58);

         try {
            var163 = (Boolean)var161;
         } catch (InvocationTargetException var89) {
            throw var89.getTargetException();
         }

         var161 = Registry.packArgs(var163);
         long var60 = 355183223593251548L;
         Object var59 = var161;
         Ref.h(355183223593251548L, var59, var60);

         try {
            ;
         } catch (InvocationTargetException var88) {
            throw var88.getTargetException();
         }
      }

      label406: {
         if (var3 && !Registry.lookupField(525262672543457793L).getBoolean(var2)) {
            Object var10016 = Registry.emptyArgs();
            long var62 = 408063576801388858L;
            Object var61 = var10016;
            var10016 = Ref.h(408063576801388858L, var61, var62);

            try {
               var166 = (Boolean)var10016;
            } catch (InvocationTargetException var87) {
               throw var87.getTargetException();
            }

            var10016 = Registry.packArgs(var166);
            long var64 = 429127336507826559L;
            Object var63 = var10016;
            Ref.h(429127336507826559L, var63, var64);

            try {
               ;
            } catch (InvocationTargetException var86) {
               throw var86.getTargetException();
            }

            if (var3) {
               break label406;
            }
         }

         Object var168 = Registry.emptyArgs();
         long var66 = 408063576801388858L;
         Object var65 = var168;
         var168 = Ref.h(408063576801388858L, var65, var66);

         try {
            var170 = (Boolean)var168;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }

         var168 = Registry.packArgs(var170);
         long var68 = 429127336507826559L;
         Object var67 = var168;
         Ref.h(429127336507826559L, var67, var68);

         try {
            ;
         } catch (InvocationTargetException var84) {
            throw var84.getTargetException();
         }
      }

      label408: {
         if (var3 && !Registry.lookupField(222301949956140513L).getBoolean(var2)) {
            Object var10018 = Registry.emptyArgs();
            long var70 = 173251605037134799L;
            Object var69 = var10018;
            var10018 = Ref.h(173251605037134799L, var69, var70);

            try {
               var173 = (Boolean)var10018;
            } catch (InvocationTargetException var83) {
               throw var83.getTargetException();
            }

            var10018 = Registry.packArgs(var173);
            long var72 = 284267168157957197L;
            Object var71 = var10018;
            Ref.h(284267168157957197L, var71, var72);

            try {
               ;
            } catch (InvocationTargetException var82) {
               throw var82.getTargetException();
            }

            if (var3) {
               break label408;
            }
         }

         Object var175 = Registry.emptyArgs();
         long var74 = 173251605037134799L;
         Object var73 = var175;
         var175 = Ref.h(173251605037134799L, var73, var74);

         try {
            var177 = (Boolean)var175;
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }

         var175 = Registry.packArgs(var177);
         long var76 = 284267168157957197L;
         Object var75 = var175;
         Ref.h(284267168157957197L, var75, var76);

         try {
            ;
         } catch (InvocationTargetException var80) {
            throw var80.getTargetException();
         }
      }

      Object[] var10019 = Registry.emptyArgs();
      long var78 = 317143585080968102L;
      Object[] var77 = var10019;
      Ref.h(317143585080968102L, var77, var78);

      try {
         return var4;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }
   }

   public CH3 H() {
      long var30;
      boolean var1;
      CH3 var2;
      label209: {
         label205: {
            boolean var10000 = FileBrowserAddressBar.g();
            var2 = new CH3();
            var1 = var10000;
            if (!var1) {
               Object var3 = 457947084859654284L;
               if (((Ud2_2)Ref.g(457947084859654284L, var3)).g$Pt_2() != Pt2.mixed) {
                  break label205;
               }

               Object[] var10002 = Registry.packArgs(true);
               long var6 = 599681978132299793L;
               Object[] var5 = var10002;
               Ref.h(599681978132299793L, var5, var6);

               try {
                  ;
               } catch (InvocationTargetException var92) {
                  throw var92.getTargetException();
               }
            }

            if (!var1) {
               break label209;
            }
         }

         Object var7 = 457947084859654284L;
         Object[] var93 = Registry.packArgs(((Ud2_2)Ref.g(457947084859654284L, var7)).isSelected());
         long var10 = 176793472219243193L;
         Object[] var9 = var93;
         Ref.h(176793472219243193L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var91) {
            throw var91.getTargetException();
         }
      }

      label211: {
         Object var11 = 523871247978046775L;
         if (((Ud2_2)Ref.g(523871247978046775L, var11)).g$Pt_2() == Pt2.mixed) {
            Object[] var94 = Registry.packArgs(true);
            long var14 = 380931088466003347L;
            Object[] var13 = var94;
            Ref.h(380931088466003347L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var90) {
               throw var90.getTargetException();
            }

            if (!var1) {
               break label211;
            }
         }

         Object var15 = 523871247978046775L;
         Object[] var10003 = Registry.packArgs(((Ud2_2)Ref.g(523871247978046775L, var15)).isSelected());
         long var18 = 213329561193723553L;
         Object[] var17 = var10003;
         Ref.h(213329561193723553L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var89) {
            throw var89.getTargetException();
         }
      }

      label213: {
         Object var19 = 569451499065139968L;
         if (((Ud2_2)Ref.g(569451499065139968L, var19)).g$Pt_2() == Pt2.mixed) {
            Object[] var10005 = Registry.packArgs(true);
            long var22 = 157503679410047501L;
            Object[] var21 = var10005;
            Ref.h(157503679410047501L, var21, var22);

            try {
               ;
            } catch (InvocationTargetException var88) {
               throw var88.getTargetException();
            }

            if (!var1) {
               break label213;
            }
         }

         Object var23 = 569451499065139968L;
         Object[] var10006 = Registry.packArgs(((Ud2_2)Ref.g(569451499065139968L, var23)).isSelected());
         long var26 = 365141742439887079L;
         Object[] var25 = var10006;
         Ref.h(365141742439887079L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var87) {
            throw var87.getTargetException();
         }
      }

      label215: {
         Object var27 = 318464940548783291L;
         if (((Ud2_2)Ref.g(318464940548783291L, var27)).g$Pt_2() == Pt2.mixed) {
            Object[] var10008 = Registry.packArgs(true);
            var30 = 459066974758209809L;
            Object[] var29 = var10008;
            Ref.h(459066974758209809L, var29, var30);

            try {
               ;
            } catch (InvocationTargetException var86) {
               throw var86.getTargetException();
            }

            if (!var1) {
               break label215;
            }
         }

         Object var31 = 318464940548783291L;
         Object[] var10009 = Registry.packArgs(((Ud2_2)Ref.g(318464940548783291L, var31)).isSelected());
         long var34 = 260128928137645271L;
         Object[] var33 = var10009;
         Ref.h(260128928137645271L, var33, var34);

         try {
            ;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }
      }

      label217: {
         Object var35 = 597557982173392493L;
         if (((Ud2_2)Ref.g(597557982173392493L, var35)).g$Pt_2() == Pt2.mixed) {
            Object[] var10011 = Registry.packArgs(true);
            long var38 = 495939016008575191L;
            Object[] var37 = var10011;
            Ref.h(495939016008575191L, var37, var38);

            try {
               ;
            } catch (InvocationTargetException var84) {
               throw var84.getTargetException();
            }

            if (!var1) {
               break label217;
            }
         }

         Object var39 = 597557982173392493L;
         Object[] var10012 = Registry.packArgs(((Ud2_2)Ref.g(597557982173392493L, var39)).isSelected());
         long var42 = 133593502820992167L;
         Object[] var41 = var10012;
         Ref.h(133593502820992167L, var41, var42);

         try {
            ;
         } catch (InvocationTargetException var83) {
            throw var83.getTargetException();
         }
      }

      label219: {
         Object var43 = 143355655849149136L;
         if (((Ud2_2)Ref.g(143355655849149136L, var43)).g$Pt_2() == Pt2.mixed) {
            Object[] var10014 = Registry.packArgs(true);
            long var46 = 505709464139575556L;
            Object[] var45 = var10014;
            Ref.h(505709464139575556L, var45, var46);

            try {
               ;
            } catch (InvocationTargetException var82) {
               throw var82.getTargetException();
            }

            if (!var1) {
               break label219;
            }
         }

         Object var47 = 143355655849149136L;
         Object[] var10015 = Registry.packArgs(((Ud2_2)Ref.g(143355655849149136L, var47)).isSelected());
         long var50 = 514552260056769581L;
         Object[] var49 = var10015;
         Ref.h(514552260056769581L, var49, var50);

         try {
            ;
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }
      }

      label221: {
         Object var51 = 348771235428691169L;
         if (((Ud2_2)Ref.g(348771235428691169L, var51)).g$Pt_2() == Pt2.mixed) {
            Object[] var10017 = Registry.packArgs(true);
            long var54 = 622241417393780451L;
            Object[] var53 = var10017;
            Ref.h(622241417393780451L, var53, var54);

            try {
               ;
            } catch (InvocationTargetException var80) {
               throw var80.getTargetException();
            }

            if (!var1) {
               break label221;
            }
         }

         Object var55 = 348771235428691169L;
         Object[] var10018 = Registry.packArgs(((Ud2_2)Ref.g(348771235428691169L, var55)).isSelected());
         long var58 = 355183223593251548L;
         Object[] var57 = var10018;
         Ref.h(355183223593251548L, var57, var58);

         try {
            ;
         } catch (InvocationTargetException var79) {
            throw var79.getTargetException();
         }
      }

      label223: {
         Object var59 = 166179534613546634L;
         if (((Ud2_2)Ref.g(166179534613546634L, var59)).g$Pt_2() == Pt2.mixed) {
            Object[] var10020 = Registry.packArgs(true);
            long var62 = 398474259244545450L;
            Object[] var61 = var10020;
            Ref.h(398474259244545450L, var61, var62);

            try {
               ;
            } catch (InvocationTargetException var78) {
               throw var78.getTargetException();
            }

            if (!var1) {
               break label223;
            }
         }

         Object var63 = 166179534613546634L;
         Object[] var10021 = Registry.packArgs(((Ud2_2)Ref.g(166179534613546634L, var63)).isSelected());
         long var66 = 429127336507826559L;
         Object[] var65 = var10021;
         Ref.h(429127336507826559L, var65, var66);

         try {
            ;
         } catch (InvocationTargetException var77) {
            throw var77.getTargetException();
         }
      }

      Object var67 = 600985825617038458L;
      if (((Ud2_2)Ref.g(600985825617038458L, var67)).g$Pt_2() == Pt2.mixed) {
         Object[] var10023 = Registry.packArgs(true);
         long var70 = 583731070473542370L;
         Object[] var69 = var10023;
         Ref.h(583731070473542370L, var69, var70);

         try {
            ;
         } catch (InvocationTargetException var76) {
            throw var76.getTargetException();
         }

         if (!var1) {
            return var2;
         }
      }

      Object var71 = 600985825617038458L;
      Object[] var10024 = Registry.packArgs(((Ud2_2)Ref.g(600985825617038458L, var71)).isSelected());
      long var74 = 284267168157957197L;
      Object[] var73 = var10024;
      Ref.h(284267168157957197L, var73, var74);

      try {
         ;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }

      return var2;
   }

   public void s() {
      boolean var129;
      Boolean var131;
      boolean var134;
      Boolean var136;
      boolean var139;
      Boolean var141;
      Ud2_2 var142;
      boolean var144;
      Boolean var146;
      boolean var149;
      Boolean var151;
      Ud2_2 var152;
      boolean var154;
      Boolean var156;
      boolean var159;
      Boolean var161;
      boolean var164;
      Boolean var166;
      boolean var169;
      Boolean var171;
      boolean var1;
      label259: {
         var1 = FileBrowserAddressBar.g();
         if (!var1) {
            Object var2 = 476468811070265040L;
            Ref.g(476468811070265040L, var2);
            Object var10002 = Registry.emptyArgs();
            long var5 = 400625946768531378L;
            Object var4 = var10002;
            var10002 = Ref.h(400625946768531378L, var4, var5);

            try {
               var129 = (Boolean)var10002;
            } catch (InvocationTargetException var127) {
               throw var127.getTargetException();
            }

            if (var129) {
               Object var6 = 457947084859654284L;
               ((Ud2_2)Ref.g(457947084859654284L, var6)).X(Pt2.mixed);
               if (!var1) {
                  break label259;
               }
            }
         }

         Object var8 = 457947084859654284L;
         Ud2_2 var10001 = (Ud2_2)Ref.g(457947084859654284L, var8);
         Object var10 = 476468811070265040L;
         Object var10003 = Ref.g(476468811070265040L, var10);
         Object var10004 = Registry.emptyArgs();
         long var13 = 222104419787205717L;
         Object var12 = var10004;
         var10004 = Ref.h(222104419787205717L, var12, var13);

         try {
            var131 = (Boolean)var10004;
         } catch (InvocationTargetException var126) {
            throw var126.getTargetException();
         }

         ((Ud2_2)var10003).setSelected(var131);
      }

      label261: {
         if (!var1) {
            Object var14 = 476468811070265040L;
            Ref.g(476468811070265040L, var14);
            Object var10005 = Registry.emptyArgs();
            long var17 = 480253256074891102L;
            Object var16 = var10005;
            var10005 = Ref.h(480253256074891102L, var16, var17);

            try {
               var134 = (Boolean)var10005;
            } catch (InvocationTargetException var125) {
               throw var125.getTargetException();
            }

            if (var134) {
               Object var18 = 523871247978046775L;
               ((Ud2_2)Ref.g(523871247978046775L, var18)).X(Pt2.mixed);
               if (!var1) {
                  break label261;
               }
            }
         }

         Object var20 = 523871247978046775L;
         Ud2_2 var132 = (Ud2_2)Ref.g(523871247978046775L, var20);
         Object var22 = 476468811070265040L;
         Object var10006 = Ref.g(476468811070265040L, var22);
         Object var10007 = Registry.emptyArgs();
         long var25 = 151703521374523010L;
         Object var24 = var10007;
         var10007 = Ref.h(151703521374523010L, var24, var25);

         try {
            var136 = (Boolean)var10007;
         } catch (InvocationTargetException var124) {
            throw var124.getTargetException();
         }

         ((Ud2_2)var10006).setSelected(var136);
      }

      label263: {
         if (!var1) {
            Object var26 = 476468811070265040L;
            Ref.g(476468811070265040L, var26);
            Object var10008 = Registry.emptyArgs();
            long var29 = 199518147617190011L;
            Object var28 = var10008;
            var10008 = Ref.h(199518147617190011L, var28, var29);

            try {
               var139 = (Boolean)var10008;
            } catch (InvocationTargetException var123) {
               throw var123.getTargetException();
            }

            if (var139) {
               Object var30 = 569451499065139968L;
               ((Ud2_2)Ref.g(569451499065139968L, var30)).X(Pt2.mixed);
               if (!var1) {
                  break label263;
               }
            }
         }

         Object var32 = 569451499065139968L;
         Ud2_2 var137 = (Ud2_2)Ref.g(569451499065139968L, var32);
         Object var34 = 476468811070265040L;
         Object var10009 = Ref.g(476468811070265040L, var34);
         Object var10010 = Registry.emptyArgs();
         long var37 = 553240027343227646L;
         Object var36 = var10010;
         var10010 = Ref.h(553240027343227646L, var36, var37);

         try {
            var141 = (Boolean)var10010;
         } catch (InvocationTargetException var122) {
            throw var122.getTargetException();
         }

         ((Ud2_2)var10009).setSelected(var141);
      }

      label265: {
         if (!var1) {
            Object var38 = 476468811070265040L;
            Ref.g(476468811070265040L, var38);
            Object var10011 = Registry.emptyArgs();
            long var41 = 153061648722906139L;
            Object var40 = var10011;
            var10011 = Ref.h(153061648722906139L, var40, var41);

            try {
               var144 = (Boolean)var10011;
            } catch (InvocationTargetException var121) {
               throw var121.getTargetException();
            }

            if (var144) {
               Object var42 = 318464940548783291L;
               ((Ud2_2)Ref.g(318464940548783291L, var42)).X(Pt2.mixed);
               if (!var1) {
                  break label265;
               }
            }
         }

         Object var44 = 318464940548783291L;
         var142 = (Ud2_2)Ref.g(318464940548783291L, var44);
         Object var46 = 476468811070265040L;
         Object var10012 = Ref.g(476468811070265040L, var46);
         Object var10013 = Registry.emptyArgs();
         long var49 = 478495353062292307L;
         Object var48 = var10013;
         var10013 = Ref.h(478495353062292307L, var48, var49);

         try {
            var146 = (Boolean)var10013;
         } catch (InvocationTargetException var120) {
            throw var120.getTargetException();
         }

         ((Ud2_2)var10012).setSelected(var146);
      }

      label267: {
         if (!var1) {
            Object var50 = 476468811070265040L;
            Ref.g(476468811070265040L, var50);
            Object var10014 = Registry.emptyArgs();
            long var53 = 351760284832019771L;
            Object var52 = var10014;
            var10014 = Ref.h(351760284832019771L, var52, var53);

            try {
               var149 = (Boolean)var10014;
            } catch (InvocationTargetException var119) {
               throw var119.getTargetException();
            }

            if (var149) {
               Object var54 = 597557982173392493L;
               ((Ud2_2)Ref.g(597557982173392493L, var54)).X(Pt2.mixed);
               if (!var1) {
                  break label267;
               }
            }
         }

         Object var56 = 597557982173392493L;
         Ud2_2 var147 = (Ud2_2)Ref.g(597557982173392493L, var56);
         Object var58 = 476468811070265040L;
         Object var10015 = Ref.g(476468811070265040L, var58);
         Object var10016 = Registry.emptyArgs();
         long var61 = 602871526512576299L;
         Object var60 = var10016;
         var10016 = Ref.h(602871526512576299L, var60, var61);

         try {
            var151 = (Boolean)var10016;
         } catch (InvocationTargetException var118) {
            throw var118.getTargetException();
         }

         ((Ud2_2)var10015).setSelected(var151);
      }

      label269: {
         if (!var1) {
            Object var62 = 476468811070265040L;
            Ref.g(476468811070265040L, var62);
            Object var10017 = Registry.emptyArgs();
            long var65 = 500000619486614302L;
            Object var64 = var10017;
            var10017 = Ref.h(500000619486614302L, var64, var65);

            try {
               var154 = (Boolean)var10017;
            } catch (InvocationTargetException var117) {
               throw var117.getTargetException();
            }

            if (var154) {
               Object var66 = 143355655849149136L;
               ((Ud2_2)Ref.g(143355655849149136L, var66)).X(Pt2.mixed);
               if (!var1) {
                  break label269;
               }
            }
         }

         Object var68 = 143355655849149136L;
         var152 = (Ud2_2)Ref.g(143355655849149136L, var68);
         Object var70 = 476468811070265040L;
         Object var10018 = Ref.g(476468811070265040L, var70);
         Object var10019 = Registry.emptyArgs();
         long var73 = 573220489640044246L;
         Object var72 = var10019;
         var10019 = Ref.h(573220489640044246L, var72, var73);

         try {
            var156 = (Boolean)var10019;
         } catch (InvocationTargetException var116) {
            throw var116.getTargetException();
         }

         ((Ud2_2)var10018).setSelected(var156);
      }

      label271: {
         if (!var1) {
            Object var74 = 476468811070265040L;
            Ref.g(476468811070265040L, var74);
            Object var10020 = Registry.emptyArgs();
            long var77 = 290346416688297750L;
            Object var76 = var10020;
            var10020 = Ref.h(290346416688297750L, var76, var77);

            try {
               var159 = (Boolean)var10020;
            } catch (InvocationTargetException var115) {
               throw var115.getTargetException();
            }

            if (var159) {
               Object var78 = 348771235428691169L;
               ((Ud2_2)Ref.g(348771235428691169L, var78)).X(Pt2.mixed);
               if (!var1) {
                  break label271;
               }
            }
         }

         Object var80 = 348771235428691169L;
         Ud2_2 var157 = (Ud2_2)Ref.g(348771235428691169L, var80);
         Object var82 = 476468811070265040L;
         Object var10021 = Ref.g(476468811070265040L, var82);
         Object var10022 = Registry.emptyArgs();
         long var85 = 172398918030773532L;
         Object var84 = var10022;
         var10022 = Ref.h(172398918030773532L, var84, var85);

         try {
            var161 = (Boolean)var10022;
         } catch (InvocationTargetException var114) {
            throw var114.getTargetException();
         }

         ((Ud2_2)var10021).setSelected(var161);
      }

      label273: {
         if (!var1) {
            Object var86 = 476468811070265040L;
            Ref.g(476468811070265040L, var86);
            Object var10023 = Registry.emptyArgs();
            long var89 = 142936433350119057L;
            Object var88 = var10023;
            var10023 = Ref.h(142936433350119057L, var88, var89);

            try {
               var164 = (Boolean)var10023;
            } catch (InvocationTargetException var113) {
               throw var113.getTargetException();
            }

            if (var164) {
               Object var90 = 166179534613546634L;
               ((Ud2_2)Ref.g(166179534613546634L, var90)).X(Pt2.mixed);
               if (!var1) {
                  break label273;
               }
            }
         }

         Object var92 = 166179534613546634L;
         Ud2_2 var162 = (Ud2_2)Ref.g(166179534613546634L, var92);
         Object var94 = 476468811070265040L;
         Object var10024 = Ref.g(476468811070265040L, var94);
         Object var10025 = Registry.emptyArgs();
         long var97 = 408063576801388858L;
         Object var96 = var10025;
         var10025 = Ref.h(408063576801388858L, var96, var97);

         try {
            var166 = (Boolean)var10025;
         } catch (InvocationTargetException var112) {
            throw var112.getTargetException();
         }

         ((Ud2_2)var10024).setSelected(var166);
      }

      if (!var1) {
         Object var98 = 476468811070265040L;
         Ref.g(476468811070265040L, var98);
         Object var10026 = Registry.emptyArgs();
         long var101 = 376192789505597293L;
         Object var100 = var10026;
         var10026 = Ref.h(376192789505597293L, var100, var101);

         try {
            var169 = (Boolean)var10026;
         } catch (InvocationTargetException var111) {
            throw var111.getTargetException();
         }

         if (var169) {
            Object var102 = 600985825617038458L;
            ((Ud2_2)Ref.g(600985825617038458L, var102)).X(Pt2.mixed);
            if (!var1) {
               return;
            }
         }
      }

      Object var104 = 600985825617038458L;
      Ud2_2 var167 = (Ud2_2)Ref.g(600985825617038458L, var104);
      Object var106 = 476468811070265040L;
      Object var10027 = Ref.g(476468811070265040L, var106);
      Object var10028 = Registry.emptyArgs();
      long var109 = 173251605037134799L;
      Object var108 = var10028;
      var10028 = Ref.h(173251605037134799L, var108, var109);

      try {
         var171 = (Boolean)var10028;
      } catch (InvocationTargetException var110) {
         throw var110.getTargetException();
      }

      ((Ud2_2)var10027).setSelected(var171);
   }

   public Ud2_2 w(String var1) {
      Ud2_2 var2 = new Ud2_2(var1);
      var2.X(Pt2.mixed);
      return var2;
   }

   public FileBrowserAddressBar n() {
      Object var1 = 284106982926462996L;
      return (FileBrowserAddressBar)Ref.g(284106982926462996L, var1);
   }

   public void x(FileBrowserAddressBar var1) {
      long var3 = 284106982926462996L;
      Ref.s(284106982926462996L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -7614) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 177;
               break;
            case 1:
               var10000 = 23;
               break;
            case 2:
               var10000 = 34;
               break;
            case 3:
               var10000 = 124;
               break;
            case 4:
               var10000 = 176;
               break;
            case 5:
               var10000 = 250;
               break;
            case 6:
               var10000 = 152;
               break;
            case 7:
               var10000 = 173;
               break;
            case 8:
               var10000 = 41;
               break;
            case 9:
               var10000 = 88;
               break;
            case 10:
               var10000 = 233;
               break;
            case 11:
               var10000 = 198;
               break;
            case 12:
               var10000 = 192;
               break;
            case 13:
               var10000 = 138;
               break;
            case 14:
               var10000 = 107;
               break;
            case 15:
               var10000 = 189;
               break;
            case 16:
               var10000 = 217;
               break;
            case 17:
               var10000 = 180;
               break;
            case 18:
               var10000 = 247;
               break;
            case 19:
               var10000 = 105;
               break;
            case 20:
               var10000 = 226;
               break;
            case 21:
               var10000 = 155;
               break;
            case 22:
               var10000 = 130;
               break;
            case 23:
               var10000 = 92;
               break;
            case 24:
               var10000 = 45;
               break;
            case 25:
               var10000 = 245;
               break;
            case 26:
               var10000 = 73;
               break;
            case 27:
               var10000 = 207;
               break;
            case 28:
               var10000 = 104;
               break;
            case 29:
               var10000 = 131;
               break;
            case 30:
               var10000 = 227;
               break;
            case 31:
               var10000 = 116;
               break;
            case 32:
               var10000 = 80;
               break;
            case 33:
               var10000 = 29;
               break;
            case 34:
               var10000 = 161;
               break;
            case 35:
               var10000 = 58;
               break;
            case 36:
               var10000 = 193;
               break;
            case 37:
               var10000 = 120;
               break;
            case 38:
               var10000 = 59;
               break;
            case 39:
               var10000 = 68;
               break;
            case 40:
               var10000 = 8;
               break;
            case 41:
               var10000 = 195;
               break;
            case 42:
               var10000 = 230;
               break;
            case 43:
               var10000 = 232;
               break;
            case 44:
               var10000 = 5;
               break;
            case 45:
               var10000 = 46;
               break;
            case 46:
               var10000 = 149;
               break;
            case 47:
               var10000 = 197;
               break;
            case 48:
               var10000 = 157;
               break;
            case 49:
               var10000 = 93;
               break;
            case 50:
               var10000 = 202;
               break;
            case 51:
               var10000 = 32;
               break;
            case 52:
               var10000 = 145;
               break;
            case 53:
               var10000 = 139;
               break;
            case 54:
               var10000 = 196;
               break;
            case 55:
               var10000 = 201;
               break;
            case 56:
               var10000 = 216;
               break;
            case 57:
               var10000 = 89;
               break;
            case 58:
               var10000 = 183;
               break;
            case 59:
               var10000 = 238;
               break;
            case 60:
               var10000 = 228;
               break;
            case 61:
               var10000 = 16;
               break;
            case 62:
               var10000 = 115;
               break;
            case 63:
               var10000 = 225;
               break;
            case 64:
               var10000 = 31;
               break;
            case 65:
               var10000 = 229;
               break;
            case 66:
               var10000 = 211;
               break;
            case 67:
               var10000 = 166;
               break;
            case 68:
               var10000 = 33;
               break;
            case 69:
               var10000 = 38;
               break;
            case 70:
               var10000 = 172;
               break;
            case 71:
               var10000 = 142;
               break;
            case 72:
               var10000 = 154;
               break;
            case 73:
               var10000 = 47;
               break;
            case 74:
               var10000 = 27;
               break;
            case 75:
               var10000 = 151;
               break;
            case 76:
               var10000 = 126;
               break;
            case 77:
               var10000 = 52;
               break;
            case 78:
               var10000 = 128;
               break;
            case 79:
               var10000 = 55;
               break;
            case 80:
               var10000 = 129;
               break;
            case 81:
               var10000 = 100;
               break;
            case 82:
               var10000 = 75;
               break;
            case 83:
               var10000 = 169;
               break;
            case 84:
               var10000 = 234;
               break;
            case 85:
               var10000 = 81;
               break;
            case 86:
               var10000 = 223;
               break;
            case 87:
               var10000 = 241;
               break;
            case 88:
               var10000 = 178;
               break;
            case 89:
               var10000 = 66;
               break;
            case 90:
               var10000 = 135;
               break;
            case 91:
               var10000 = 147;
               break;
            case 92:
               var10000 = 39;
               break;
            case 93:
               var10000 = 144;
               break;
            case 94:
               var10000 = 222;
               break;
            case 95:
               var10000 = 37;
               break;
            case 96:
               var10000 = 1;
               break;
            case 97:
               var10000 = 153;
               break;
            case 98:
               var10000 = 179;
               break;
            case 99:
               var10000 = 175;
               break;
            case 100:
               var10000 = 53;
               break;
            case 101:
               var10000 = 60;
               break;
            case 102:
               var10000 = 242;
               break;
            case 103:
               var10000 = 12;
               break;
            case 104:
               var10000 = 67;
               break;
            case 105:
               var10000 = 220;
               break;
            case 106:
               var10000 = 231;
               break;
            case 107:
               var10000 = 141;
               break;
            case 108:
               var10000 = 49;
               break;
            case 109:
               var10000 = 137;
               break;
            case 110:
               var10000 = 165;
               break;
            case 111:
               var10000 = 57;
               break;
            case 112:
               var10000 = 181;
               break;
            case 113:
               var10000 = 143;
               break;
            case 114:
               var10000 = 99;
               break;
            case 115:
               var10000 = 244;
               break;
            case 116:
               var10000 = 70;
               break;
            case 117:
               var10000 = 22;
               break;
            case 118:
               var10000 = 25;
               break;
            case 119:
               var10000 = 97;
               break;
            case 120:
               var10000 = 162;
               break;
            case 121:
               var10000 = 112;
               break;
            case 122:
               var10000 = 209;
               break;
            case 123:
               var10000 = 101;
               break;
            case 124:
               var10000 = 86;
               break;
            case 125:
               var10000 = 4;
               break;
            case 126:
               var10000 = 98;
               break;
            case 127:
               var10000 = 122;
               break;
            case 128:
               var10000 = 95;
               break;
            case 129:
               var10000 = 184;
               break;
            case 130:
               var10000 = 110;
               break;
            case 131:
               var10000 = 235;
               break;
            case 132:
               var10000 = 167;
               break;
            case 133:
               var10000 = 125;
               break;
            case 134:
               var10000 = 7;
               break;
            case 135:
               var10000 = 54;
               break;
            case 136:
               var10000 = 74;
               break;
            case 137:
               var10000 = 249;
               break;
            case 138:
               var10000 = 246;
               break;
            case 139:
               var10000 = 127;
               break;
            case 140:
               var10000 = 14;
               break;
            case 141:
               var10000 = 208;
               break;
            case 142:
               var10000 = 212;
               break;
            case 143:
               var10000 = 187;
               break;
            case 144:
               var10000 = 111;
               break;
            case 145:
               var10000 = 17;
               break;
            case 146:
               var10000 = 221;
               break;
            case 147:
               var10000 = 251;
               break;
            case 148:
               var10000 = 56;
               break;
            case 149:
               var10000 = 108;
               break;
            case 150:
               var10000 = 191;
               break;
            case 151:
               var10000 = 113;
               break;
            case 152:
               var10000 = 254;
               break;
            case 153:
               var10000 = 51;
               break;
            case 154:
               var10000 = 168;
               break;
            case 155:
               var10000 = 185;
               break;
            case 156:
               var10000 = 78;
               break;
            case 157:
               var10000 = 0;
               break;
            case 158:
               var10000 = 40;
               break;
            case 159:
               var10000 = 102;
               break;
            case 160:
               var10000 = 13;
               break;
            case 161:
               var10000 = 171;
               break;
            case 162:
               var10000 = 164;
               break;
            case 163:
               var10000 = 82;
               break;
            case 164:
               var10000 = 252;
               break;
            case 165:
               var10000 = 18;
               break;
            case 166:
               var10000 = 210;
               break;
            case 167:
               var10000 = 205;
               break;
            case 168:
               var10000 = 42;
               break;
            case 169:
               var10000 = 48;
               break;
            case 170:
               var10000 = 79;
               break;
            case 171:
               var10000 = 218;
               break;
            case 172:
               var10000 = 160;
               break;
            case 173:
               var10000 = 163;
               break;
            case 174:
               var10000 = 159;
               break;
            case 175:
               var10000 = 20;
               break;
            case 176:
               var10000 = 203;
               break;
            case 177:
               var10000 = 214;
               break;
            case 178:
               var10000 = 136;
               break;
            case 179:
               var10000 = 121;
               break;
            case 180:
               var10000 = 146;
               break;
            case 181:
               var10000 = 77;
               break;
            case 182:
               var10000 = 87;
               break;
            case 183:
               var10000 = 28;
               break;
            case 184:
               var10000 = 19;
               break;
            case 185:
               var10000 = 26;
               break;
            case 186:
               var10000 = 36;
               break;
            case 187:
               var10000 = 11;
               break;
            case 188:
               var10000 = 188;
               break;
            case 189:
               var10000 = 123;
               break;
            case 190:
               var10000 = 219;
               break;
            case 191:
               var10000 = 10;
               break;
            case 192:
               var10000 = 30;
               break;
            case 193:
               var10000 = 133;
               break;
            case 194:
               var10000 = 76;
               break;
            case 195:
               var10000 = 85;
               break;
            case 196:
               var10000 = 199;
               break;
            case 197:
               var10000 = 255;
               break;
            case 198:
               var10000 = 248;
               break;
            case 199:
               var10000 = 65;
               break;
            case 200:
               var10000 = 237;
               break;
            case 201:
               var10000 = 61;
               break;
            case 202:
               var10000 = 118;
               break;
            case 203:
               var10000 = 182;
               break;
            case 204:
               var10000 = 117;
               break;
            case 205:
               var10000 = 174;
               break;
            case 206:
               var10000 = 69;
               break;
            case 207:
               var10000 = 148;
               break;
            case 208:
               var10000 = 170;
               break;
            case 209:
               var10000 = 63;
               break;
            case 210:
               var10000 = 253;
               break;
            case 211:
               var10000 = 236;
               break;
            case 212:
               var10000 = 204;
               break;
            case 213:
               var10000 = 94;
               break;
            case 214:
               var10000 = 134;
               break;
            case 215:
               var10000 = 2;
               break;
            case 216:
               var10000 = 206;
               break;
            case 217:
               var10000 = 186;
               break;
            case 218:
               var10000 = 62;
               break;
            case 219:
               var10000 = 91;
               break;
            case 220:
               var10000 = 103;
               break;
            case 221:
               var10000 = 84;
               break;
            case 222:
               var10000 = 96;
               break;
            case 223:
               var10000 = 50;
               break;
            case 224:
               var10000 = 106;
               break;
            case 225:
               var10000 = 15;
               break;
            case 226:
               var10000 = 90;
               break;
            case 227:
               var10000 = 64;
               break;
            case 228:
               var10000 = 200;
               break;
            case 229:
               var10000 = 194;
               break;
            case 230:
               var10000 = 239;
               break;
            case 231:
               var10000 = 190;
               break;
            case 232:
               var10000 = 119;
               break;
            case 233:
               var10000 = 215;
               break;
            case 234:
               var10000 = 240;
               break;
            case 235:
               var10000 = 21;
               break;
            case 236:
               var10000 = 150;
               break;
            case 237:
               var10000 = 109;
               break;
            case 238:
               var10000 = 35;
               break;
            case 239:
               var10000 = 9;
               break;
            case 240:
               var10000 = 156;
               break;
            case 241:
               var10000 = 132;
               break;
            case 242:
               var10000 = 114;
               break;
            case 243:
               var10000 = 43;
               break;
            case 244:
               var10000 = 44;
               break;
            case 245:
               var10000 = 158;
               break;
            case 246:
               var10000 = 71;
               break;
            case 247:
               var10000 = 72;
               break;
            case 248:
               var10000 = 83;
               break;
            case 249:
               var10000 = 213;
               break;
            case 250:
               var10000 = 3;
               break;
            case 251:
               var10000 = 224;
               break;
            case 252:
               var10000 = 243;
               break;
            case 253:
               var10000 = 24;
               break;
            case 254:
               var10000 = 140;
               break;
            default:
               var10000 = 6;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28778;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[28];
      int var11 = 0;
      String var10 = "\u0015\u0003J`\u0002兮冭\u0002拏袏\u0012\u001b\rD+tËIø\u00888Y\u0086kÊÔÛ\u008e#\u0011^Vÿ\u0000@¿Õ\u001bnÎGÄ\u0019ÎU\u0094ö\u0004ÕsRn\u0007遮弼謳羽寊目彋\u0002儸其\u0004數倚[\u0094\u0002披行\u000e\u009884\u008dz\u001f\u0088c z\\Ü\u009b\u0080\u0002兄丩\u0002謟匹\u000f\u0097?ÕmF\u0003\u000fàP\bRÀX\u0001 \u0014}Þ¾Q\u000eUÜªEEIVV|g\u0097\u0097¾Ê¨\u000eÛñkß\u0093ïÂ;íÚ\u009aÎê¯\u0005譣羱杖隉T\u0006厨庬疚勯瘅徊\u0002謟厔\u000eüU¸ ëªºÕæ®\u0094\u0004\u0082\u0099\b帀痼刦敹云哀盩忽\u000eßÌÜ\u0013gÌ+\u0019Ô7Ò7Jÿ\u0002十洘\u0006叩席疲募敩丯\u000e´@±\u0082Êþ\u009eXbÿ\u0004Ë\u0090%\u0006传敵斠上枵阭";
      int var12 = "\u0015\u0003J`\u0002兮冭\u0002拏袏\u0012\u001b\rD+tËIø\u00888Y\u0086kÊÔÛ\u008e#\u0011^Vÿ\u0000@¿Õ\u001bnÎGÄ\u0019ÎU\u0094ö\u0004ÕsRn\u0007遮弼謳羽寊目彋\u0002儸其\u0004數倚[\u0094\u0002披行\u000e\u009884\u008dz\u001f\u0088c z\\Ü\u009b\u0080\u0002兄丩\u0002謟匹\u000f\u0097?ÕmF\u0003\u000fàP\bRÀX\u0001 \u0014}Þ¾Q\u000eUÜªEEIVV|g\u0097\u0097¾Ê¨\u000eÛñkß\u0093ïÂ;íÚ\u009aÎê¯\u0005譣羱杖隉T\u0006厨庬疚勯瘅徊\u0002謟厔\u000eüU¸ ëªºÕæ®\u0094\u0004\u0082\u0099\b帀痼刦敹云哀盩忽\u000eßÌÜ\u0013gÌ+\u0019Ô7Ò7Jÿ\u0002十洘\u0006叩席疲募敩丯\u000e´@±\u0082Êþ\u009eXbÿ\u0004Ë\u0090%\u0006传敵斠上枵阭"
         .length();
      char var9 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 88;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var58 = 123;
                        break;
                     case 1:
                        var58 = 34;
                        break;
                     case 2:
                        var58 = 44;
                        break;
                     case 3:
                        var58 = 91;
                        break;
                     case 4:
                        var58 = 67;
                        break;
                     case 5:
                        var58 = 44;
                        break;
                     default:
                        var58 = 38;
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
                     b = new String[28];
                     long var0 = 4441847716052472236L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "QäPa\u0014\u009c\u0093ý\b\u0089gí -Gi";
                     int var5 = "QäPa\u0014\u009c\u0093ý\b\u0089gí -Gi".length();
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
                     d = new Integer[2];
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

                  var10 = "磧宸\u0003抻柎聀";
                  var12 = "磧宸\u0003抻柎聀".length();
                  var9 = 2;
                  var16 = -1;
            }

            var10000 = 83;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





