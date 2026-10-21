package com.finalshell.ui.listener;

import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.text.BadLocationException;

public class XS implements KeyListener {
   public final boolean K;
   public final ClearListDialog I;
   public static long[] a;
   public static Integer[] b;

   public XS(ClearListDialog var1, boolean var2) {
      this.I = var1;
      this.K = var2;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      Object var2;
      L1 var4;
      label76: {
         ClearListDialog.i$arrString();
         Object var6 = 385041577063464455L;
         Object var10002 = Ref.g(385041577063464455L, var6);
         Object var8 = 618427502576624312L;
         Object var3 = ((Tq4)Ref.g(618427502576624312L, var8)).getSelectedRow();
         var2 = var10002;
         var4 = null;
         var10002 = var3;
         if (var2 == null) {
            if (!(var3 > -1)) {
               break label76;
            }

            var10002 = this;
            Object var10 = 385041577063464455L;
            Ref.g(385041577063464455L, var10);
            Object var12 = 598800499692003827L;
            Ref.g(598800499692003827L, var12);
            Object[] var10005 = Registry.emptyArgs();
            long var15 = 212159027199041724L;
            Object[] var14 = var10005;
            var10005 = Ref.h(212159027199041724L, var14, var15);

            try {
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }
         }

         if (var2 == null) {
            if (!(var10002 > 0)) {
               break label76;
            }

            var10002 = this;
            Object var16 = 385041577063464455L;
            Ref.g(385041577063464455L, var16);
            Object var18 = 618427502576624312L;
            ((Tq4)Ref.g(618427502576624312L, var18)).convertRowIndexToModel((int)var3);
         }

         XS var5 = (XS)var10002;
         Object var20 = 385041577063464455L;
         Ref.g(385041577063464455L, var20);
         Object var22 = 598800499692003827L;
         Ref.g(598800499692003827L, var22);
         Object[] var34 = Registry.packArgs((int)var5, 0);
         long var25 = 130061847059020450L;
         Object[] var24 = var34;
         var4 = (L1)Ref.h(130061847059020450L, var24, var25);
      }

      int var35 = var1.getKeyCode();
      if (var2 == null) {
         if (var35 == a(30132, 5192752616744954874L) && var4 != null) {
         }

         var35 = var1.getModifiers();
      }

      label79: {
         label59:
         if (var2 == null) {
            if (var35 == 0) {
               var35 = var1.getKeyCode();
               if (var2 != null) {
                  break label59;
               }

               if (var35 == a(12472, 440002088538533620L)) {
                  break label79;
               }
            }

            var35 = var1.getModifiers();
         }

         if (var2 == null) {
            if (var35 != 0) {
               return;
            }

            var35 = var1.getKeyCode();
         }

         if (var35 != a(9149, 6823313546869210614L)) {
            return;
         }
      }

      Object var26 = 385041577063464455L;
      Ref.g(385041577063464455L, var26);
      Object[] var10007 = Registry.emptyArgs();
      long var29 = 496821856781947383L;
      Object[] var28 = var10007;
      Ref.h(496821856781947383L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: aconst_null
      // 0001: astore 3
      // 0002: invokestatic com/finalshell/ui/dialog/ClearListDialog.i$arrString ()[Ljava/lang/String;
      // 0005: aload 0
      // 0006: ldc2_w 385041577063464455
      // 0009: astore 8
      // 000b: ldc2_w 385041577063464455
      // 000e: aload 8
      // 0010: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0013: bipush 1
      // 0014: ldc2_w 600941127808801108
      // 0017: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 001a: dup_x2
      // 001b: pop
      // 001c: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 001f: astore 2
      // 0020: bipush 0
      // 0021: istore 4
      // 0023: aload 0
      // 0024: ldc2_w 385041577063464455
      // 0027: astore 10
      // 0029: ldc2_w 385041577063464455
      // 002c: aload 10
      // 002e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0031: bipush 0
      // 0032: ldc2_w 461146548297071424
      // 0035: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0038: dup_x2
      // 0039: pop
      // 003a: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 003d: aload 1
      // 003e: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0041: sipush 31750
      // 0044: ldc2_w 5018494235787207234
      // 0047: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 004a: aload 2
      // 004b: ifnonnull 0941
      // 004e: if_icmpne 0934
      // 0051: goto 0058
      // 0054: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0057: athrow
      // 0058: aload 0
      // 0059: ldc2_w 603047907484873769
      // 005c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 005f: swap
      // 0060: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0063: aload 2
      // 0064: ifnonnull 06e5
      // 0067: goto 006e
      // 006a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 006d: athrow
      // 006e: ifne 06d1
      // 0071: goto 0078
      // 0074: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0077: athrow
      // 0078: aload 0
      // 0079: ldc2_w 385041577063464455
      // 007c: astore 12
      // 007e: ldc2_w 385041577063464455
      // 0081: aload 12
      // 0083: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0086: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0089: invokevirtual com/finalshell/ui/dialog/ClearListDialog.isVisible ()Z
      // 008c: aload 2
      // 008d: ifnonnull 00c9
      // 0090: goto 0097
      // 0093: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0096: athrow
      // 0097: ifeq 02e1
      // 009a: goto 00a1
      // 009d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 00a0: athrow
      // 00a1: aload 0
      // 00a2: ldc2_w 385041577063464455
      // 00a5: astore 14
      // 00a7: ldc2_w 385041577063464455
      // 00aa: aload 14
      // 00ac: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00af: ldc2_w 618427502576624312
      // 00b2: astore 16
      // 00b4: ldc2_w 618427502576624312
      // 00b7: aload 16
      // 00b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00bc: checkcast com/finalshell/core/Tq4
      // 00bf: invokevirtual com/finalshell/core/Tq4.getSelectedRow ()I
      // 00c2: goto 00c9
      // 00c5: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 00c8: athrow
      // 00c9: istore 5
      // 00cb: iload 5
      // 00cd: aload 2
      // 00ce: ifnonnull 0106
      // 00d1: bipush -1
      // 00d2: if_icmple 0145
      // 00d5: goto 00dc
      // 00d8: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 00db: athrow
      // 00dc: aload 0
      // 00dd: ldc2_w 385041577063464455
      // 00e0: astore 18
      // 00e2: ldc2_w 385041577063464455
      // 00e5: aload 18
      // 00e7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00ea: ldc2_w 618427502576624312
      // 00ed: astore 20
      // 00ef: ldc2_w 618427502576624312
      // 00f2: aload 20
      // 00f4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00f7: checkcast com/finalshell/core/Tq4
      // 00fa: iload 5
      // 00fc: invokevirtual com/finalshell/core/Tq4.convertRowIndexToModel (I)I
      // 00ff: goto 0106
      // 0102: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0105: athrow
      // 0106: istore 6
      // 0108: aload 0
      // 0109: ldc2_w 385041577063464455
      // 010c: astore 22
      // 010e: ldc2_w 385041577063464455
      // 0111: aload 22
      // 0113: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0116: ldc2_w 598800499692003827
      // 0119: astore 24
      // 011b: ldc2_w 598800499692003827
      // 011e: aload 24
      // 0120: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0123: iload 6
      // 0125: bipush 0
      // 0126: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0129: ldc2_w 130061847059020450
      // 012c: astore 27
      // 012e: astore 26
      // 0130: ldc2_w 130061847059020450
      // 0133: aload 26
      // 0135: aload 27
      // 0137: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 013a: goto 0141
      // 013d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0140: athrow
      // 0141: checkcast com/finalshell/core/L1
      // 0144: astore 3
      // 0145: aload 0
      // 0146: ldc2_w 385041577063464455
      // 0149: astore 28
      // 014b: ldc2_w 385041577063464455
      // 014e: aload 28
      // 0150: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0153: ldc2_w 618427502576624312
      // 0156: astore 30
      // 0158: ldc2_w 618427502576624312
      // 015b: aload 30
      // 015d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0160: checkcast com/finalshell/core/Tq4
      // 0163: iload 5
      // 0165: invokevirtual com/finalshell/core/Tq4.convertRowIndexToModel (I)I
      // 0168: istore 6
      // 016a: aload 0
      // 016b: ldc2_w 385041577063464455
      // 016e: astore 32
      // 0170: ldc2_w 385041577063464455
      // 0173: aload 32
      // 0175: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0178: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 017b: aload 0
      // 017c: ldc2_w 385041577063464455
      // 017f: astore 34
      // 0181: ldc2_w 385041577063464455
      // 0184: aload 34
      // 0186: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0189: ldc2_w 618427502576624312
      // 018c: astore 36
      // 018e: ldc2_w 618427502576624312
      // 0191: aload 36
      // 0193: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0196: checkcast com/finalshell/core/Tq4
      // 0199: invokevirtual com/finalshell/core/Tq4.getRowCount ()I
      // 019c: iload 6
      // 019e: isub
      // 019f: aload 2
      // 01a0: ifnonnull 01bf
      // 01a3: ldc2_w 231094135750452722
      // 01a6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01a9: aconst_null
      // 01aa: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 01ad: if_icmpge 01c2
      // 01b0: goto 01b7
      // 01b3: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 01b6: athrow
      // 01b7: bipush 1
      // 01b8: goto 01bf
      // 01bb: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 01be: athrow
      // 01bf: goto 01c3
      // 01c2: bipush 0
      // 01c3: ldc2_w 461146548297071424
      // 01c6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01c9: dup_x2
      // 01ca: pop
      // 01cb: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 01ce: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01d1: ldc2_w 270389152141252877
      // 01d4: astore 38
      // 01d6: ldc2_w 270389152141252877
      // 01d9: aload 38
      // 01db: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 01de: goto 01e5
      // 01e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01e4: athrow
      // 01e5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01e8: ldc2_w 163462326892114024
      // 01eb: astore 41
      // 01ed: astore 40
      // 01ef: ldc2_w 163462326892114024
      // 01f2: aload 40
      // 01f4: aload 41
      // 01f6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01f9: goto 0200
      // 01fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01ff: athrow
      // 0200: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0203: ldc2_w 633712494917113170
      // 0206: astore 43
      // 0208: astore 42
      // 020a: ldc2_w 633712494917113170
      // 020d: aload 42
      // 020f: aload 43
      // 0211: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0214: checkcast java/lang/Boolean
      // 0217: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 021a: goto 0221
      // 021d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0220: athrow
      // 0221: aload 2
      // 0222: ifnonnull 0268
      // 0225: ifne 02c2
      // 0228: goto 022f
      // 022b: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 022e: athrow
      // 022f: aload 0
      // 0230: ldc2_w 385041577063464455
      // 0233: astore 44
      // 0235: ldc2_w 385041577063464455
      // 0238: aload 44
      // 023a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 023d: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0240: aload 2
      // 0241: ifnonnull 028d
      // 0244: goto 024b
      // 0247: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 024a: athrow
      // 024b: ldc2_w 618427502576624312
      // 024e: astore 46
      // 0250: ldc2_w 618427502576624312
      // 0253: aload 46
      // 0255: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0258: checkcast com/finalshell/core/Tq4
      // 025b: invokevirtual com/finalshell/core/Tq4.getRowCount ()I
      // 025e: iload 6
      // 0260: isub
      // 0261: goto 0268
      // 0264: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0267: athrow
      // 0268: ldc2_w 231094135750452722
      // 026b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 026e: aconst_null
      // 026f: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0272: if_icmple 02c2
      // 0275: aload 0
      // 0276: ldc2_w 385041577063464455
      // 0279: astore 48
      // 027b: ldc2_w 385041577063464455
      // 027e: aload 48
      // 0280: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0283: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0286: goto 028d
      // 0289: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 028c: athrow
      // 028d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0290: ldc2_w 496821856781947383
      // 0293: astore 51
      // 0295: astore 50
      // 0297: ldc2_w 496821856781947383
      // 029a: aload 50
      // 029c: aload 51
      // 029e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02a1: pop
      // 02a2: goto 02a9
      // 02a5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02a8: athrow
      // 02a9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02ac: ldc2_w 128283426706089385
      // 02af: astore 52
      // 02b1: ldc2_w 128283426706089385
      // 02b4: aload 52
      // 02b6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 02b9: pop
      // 02ba: goto 02c1
      // 02bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02c0: athrow
      // 02c1: return
      // 02c2: aload 3
      // 02c3: ifnull 02e1
      // 02c6: iload 5
      // 02c8: aload 2
      // 02c9: ifnonnull 037c
      // 02cc: goto 02d3
      // 02cf: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 02d2: athrow
      // 02d3: bipush -1
      // 02d4: if_icmple 02e1
      // 02d7: goto 02de
      // 02da: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 02dd: athrow
      // 02de: bipush 1
      // 02df: istore 4
      // 02e1: aload 0
      // 02e2: ldc2_w 385041577063464455
      // 02e5: astore 54
      // 02e7: ldc2_w 385041577063464455
      // 02ea: aload 54
      // 02ec: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02ef: bipush 1
      // 02f0: ldc2_w 278860969542151097
      // 02f3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02f6: dup_x2
      // 02f7: pop
      // 02f8: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 02fb: aload 0
      // 02fc: ldc2_w 385041577063464455
      // 02ff: astore 56
      // 0301: ldc2_w 385041577063464455
      // 0304: aload 56
      // 0306: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0309: ldc2_w 334241381080505095
      // 030c: astore 58
      // 030e: ldc2_w 334241381080505095
      // 0311: aload 58
      // 0313: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0316: checkcast com/finalshell/core/Dv2
      // 0319: aload 0
      // 031a: ldc2_w 385041577063464455
      // 031d: astore 60
      // 031f: ldc2_w 385041577063464455
      // 0322: aload 60
      // 0324: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0327: ldc2_w 334241381080505095
      // 032a: astore 62
      // 032c: ldc2_w 334241381080505095
      // 032f: aload 62
      // 0331: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0334: checkcast com/finalshell/core/Dv2
      // 0337: invokevirtual com/finalshell/core/Dv2.getDocument ()Ljavax/swing/text/Document;
      // 033a: invokeinterface javax/swing/text/Document.getLength ()I 1
      // 033f: invokevirtual com/finalshell/core/Dv2.setCaretPosition (I)V
      // 0342: aload 0
      // 0343: ldc2_w 385041577063464455
      // 0346: astore 64
      // 0348: ldc2_w 385041577063464455
      // 034b: aload 64
      // 034d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0350: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0353: aload 2
      // 0354: ifnonnull 0610
      // 0357: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 035a: ldc2_w 496821856781947383
      // 035d: astore 67
      // 035f: astore 66
      // 0361: ldc2_w 496821856781947383
      // 0364: aload 66
      // 0366: aload 67
      // 0368: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 036b: pop
      // 036c: goto 0373
      // 036f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0372: athrow
      // 0373: iload 4
      // 0375: goto 037c
      // 0378: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 037b: athrow
      // 037c: ifeq 05f8
      // 037f: aload 0
      // 0380: ldc2_w 385041577063464455
      // 0383: astore 68
      // 0385: ldc2_w 385041577063464455
      // 0388: aload 68
      // 038a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 038d: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0390: aload 2
      // 0391: ifnonnull 05d7
      // 0394: goto 039b
      // 0397: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 039a: athrow
      // 039b: ldc2_w 308394982418497131
      // 039e: astore 70
      // 03a0: ldc2_w 308394982418497131
      // 03a3: aload 70
      // 03a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03a8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03ab: ldc2_w 128612327342760354
      // 03ae: astore 73
      // 03b0: astore 72
      // 03b2: ldc2_w 128612327342760354
      // 03b5: aload 72
      // 03b7: aload 73
      // 03b9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03bc: checkcast java/lang/Boolean
      // 03bf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c2: goto 03c9
      // 03c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03c8: athrow
      // 03c9: ifeq 05bf
      // 03cc: goto 03d3
      // 03cf: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 03d2: athrow
      // 03d3: aload 0
      // 03d4: ldc2_w 385041577063464455
      // 03d7: astore 74
      // 03d9: ldc2_w 385041577063464455
      // 03dc: aload 74
      // 03de: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03e1: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 03e4: aload 2
      // 03e5: ifnonnull 05d7
      // 03e8: goto 03ef
      // 03eb: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 03ee: athrow
      // 03ef: ldc2_w 308394982418497131
      // 03f2: astore 76
      // 03f4: ldc2_w 308394982418497131
      // 03f7: aload 76
      // 03f9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03ff: ldc2_w 240084053221484174
      // 0402: astore 79
      // 0404: astore 78
      // 0406: ldc2_w 240084053221484174
      // 0409: aload 78
      // 040b: aload 79
      // 040d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0410: checkcast java/lang/Integer
      // 0413: invokevirtual java/lang/Integer.intValue ()I
      // 0416: goto 041d
      // 0419: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 041c: athrow
      // 041d: bipush -1
      // 041e: if_icmple 05bf
      // 0421: goto 0428
      // 0424: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0427: athrow
      // 0428: aload 0
      // 0429: ldc2_w 385041577063464455
      // 042c: astore 80
      // 042e: ldc2_w 385041577063464455
      // 0431: aload 80
      // 0433: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0436: ldc2_w 308394982418497131
      // 0439: astore 82
      // 043b: ldc2_w 308394982418497131
      // 043e: aload 82
      // 0440: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0443: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0446: ldc2_w 380754648370853748
      // 0449: astore 85
      // 044b: astore 84
      // 044d: ldc2_w 380754648370853748
      // 0450: aload 84
      // 0452: aload 85
      // 0454: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0457: checkcast java/lang/String
      // 045a: goto 0461
      // 045d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0460: athrow
      // 0461: astore 5
      // 0463: aload 5
      // 0465: ifnull 05bb
      // 0468: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 046b: ldc2_w 270389152141252877
      // 046e: astore 86
      // 0470: ldc2_w 270389152141252877
      // 0473: aload 86
      // 0475: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0478: goto 047f
      // 047b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 047e: athrow
      // 047f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0482: ldc2_w 163462326892114024
      // 0485: astore 89
      // 0487: astore 88
      // 0489: ldc2_w 163462326892114024
      // 048c: aload 88
      // 048e: aload 89
      // 0490: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0493: goto 049a
      // 0496: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0499: athrow
      // 049a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 049d: ldc2_w 133802226692684648
      // 04a0: astore 91
      // 04a2: astore 90
      // 04a4: ldc2_w 133802226692684648
      // 04a7: aload 90
      // 04a9: aload 91
      // 04ab: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04ae: checkcast java/lang/Boolean
      // 04b1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04b4: goto 04bb
      // 04b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04ba: athrow
      // 04bb: ifne 050c
      // 04be: goto 04c5
      // 04c1: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 04c4: athrow
      // 04c5: aload 0
      // 04c6: ldc2_w 385041577063464455
      // 04c9: astore 92
      // 04cb: ldc2_w 385041577063464455
      // 04ce: aload 92
      // 04d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04d3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04d6: ldc2_w 496821856781947383
      // 04d9: astore 95
      // 04db: astore 94
      // 04dd: ldc2_w 496821856781947383
      // 04e0: aload 94
      // 04e2: aload 95
      // 04e4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04e7: pop
      // 04e8: goto 04ef
      // 04eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04ee: athrow
      // 04ef: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04f2: ldc2_w 128283426706089385
      // 04f5: astore 96
      // 04f7: ldc2_w 128283426706089385
      // 04fa: aload 96
      // 04fc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 04ff: pop
      // 0500: goto 0507
      // 0503: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0506: athrow
      // 0507: return
      // 0508: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 050b: athrow
      // 050c: aload 0
      // 050d: ldc2_w 385041577063464455
      // 0510: astore 98
      // 0512: ldc2_w 385041577063464455
      // 0515: aload 98
      // 0517: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 051a: ldc2_w 334241381080505095
      // 051d: astore 100
      // 051f: ldc2_w 334241381080505095
      // 0522: aload 100
      // 0524: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0527: checkcast com/finalshell/core/Dv2
      // 052a: invokevirtual com/finalshell/core/Dv2.getDocument ()Ljavax/swing/text/Document;
      // 052d: astore 6
      // 052f: aload 6
      // 0531: aload 0
      // 0532: ldc2_w 385041577063464455
      // 0535: astore 102
      // 0537: ldc2_w 385041577063464455
      // 053a: aload 102
      // 053c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 053f: ldc2_w 151984047746765220
      // 0542: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0545: swap
      // 0546: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0549: aload 5
      // 054b: aconst_null
      // 054c: invokeinterface javax/swing/text/Document.insertString (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V 4
      // 0551: aload 0
      // 0552: ldc2_w 385041577063464455
      // 0555: astore 104
      // 0557: ldc2_w 385041577063464455
      // 055a: aload 104
      // 055c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 055f: ldc2_w 334241381080505095
      // 0562: astore 106
      // 0564: ldc2_w 334241381080505095
      // 0567: aload 106
      // 0569: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 056c: checkcast com/finalshell/core/Dv2
      // 056f: aload 0
      // 0570: ldc2_w 385041577063464455
      // 0573: astore 108
      // 0575: ldc2_w 385041577063464455
      // 0578: aload 108
      // 057a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 057d: ldc2_w 151984047746765220
      // 0580: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0583: swap
      // 0584: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0587: aload 5
      // 0589: invokevirtual java/lang/String.length ()I
      // 058c: iadd
      // 058d: invokevirtual com/finalshell/core/Dv2.setCaretPosition (I)V
      // 0590: goto 059a
      // 0593: astore 7
      // 0595: aload 7
      // 0597: invokevirtual javax/swing/text/BadLocationException.printStackTrace ()V
      // 059a: aload 0
      // 059b: ldc2_w 385041577063464455
      // 059e: astore 110
      // 05a0: ldc2_w 385041577063464455
      // 05a3: aload 110
      // 05a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05a8: ldc2_w 334241381080505095
      // 05ab: astore 112
      // 05ad: ldc2_w 334241381080505095
      // 05b0: aload 112
      // 05b2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05b5: checkcast com/finalshell/core/Dv2
      // 05b8: invokevirtual com/finalshell/core/Dv2.requestFocus ()V
      // 05bb: aload 2
      // 05bc: ifnull 1469
      // 05bf: aload 0
      // 05c0: ldc2_w 385041577063464455
      // 05c3: astore 114
      // 05c5: ldc2_w 385041577063464455
      // 05c8: aload 114
      // 05ca: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05cd: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 05d0: goto 05d7
      // 05d3: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 05d6: athrow
      // 05d7: aload 3
      // 05d8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05db: ldc2_w 345502075173010592
      // 05de: astore 117
      // 05e0: astore 116
      // 05e2: ldc2_w 345502075173010592
      // 05e5: aload 116
      // 05e7: aload 117
      // 05e9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05ec: pop
      // 05ed: goto 05f4
      // 05f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05f3: athrow
      // 05f4: aload 2
      // 05f5: ifnull 1469
      // 05f8: aload 0
      // 05f9: ldc2_w 385041577063464455
      // 05fc: astore 118
      // 05fe: ldc2_w 385041577063464455
      // 0601: aload 118
      // 0603: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0606: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0609: goto 0610
      // 060c: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 060f: athrow
      // 0610: ldc2_w 334241381080505095
      // 0613: astore 120
      // 0615: ldc2_w 334241381080505095
      // 0618: aload 120
      // 061a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 061d: checkcast com/finalshell/core/Dv2
      // 0620: invokevirtual com/finalshell/core/Dv2.getText ()Ljava/lang/String;
      // 0623: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0626: astore 5
      // 0628: aload 0
      // 0629: ldc2_w 385041577063464455
      // 062c: astore 122
      // 062e: ldc2_w 385041577063464455
      // 0631: aload 122
      // 0633: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0636: ldc2_w 618427502576624312
      // 0639: astore 124
      // 063b: ldc2_w 618427502576624312
      // 063e: aload 124
      // 0640: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0643: checkcast com/finalshell/core/Tq4
      // 0646: invokevirtual com/finalshell/core/Tq4.getSelectedRow ()I
      // 0649: istore 6
      // 064b: aload 5
      // 064d: ldc ""
      // 064f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0652: aload 2
      // 0653: ifnonnull 0662
      // 0656: ifne 06ce
      // 0659: goto 0660
      // 065c: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 065f: athrow
      // 0660: iload 6
      // 0662: aload 2
      // 0663: ifnonnull 069e
      // 0666: bipush -1
      // 0667: if_icmple 06ce
      // 066a: goto 0671
      // 066d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0670: athrow
      // 0671: aload 0
      // 0672: ldc2_w 385041577063464455
      // 0675: astore 126
      // 0677: ldc2_w 385041577063464455
      // 067a: aload 126
      // 067c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 067f: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0682: aload 2
      // 0683: ifnonnull 06b9
      // 0686: goto 068d
      // 0689: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 068c: athrow
      // 068d: ldc2_w 162130310027014887
      // 0690: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0693: swap
      // 0694: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0697: goto 069e
      // 069a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 069d: athrow
      // 069e: ifeq 06ce
      // 06a1: aload 0
      // 06a2: ldc2_w 385041577063464455
      // 06a5: astore 128
      // 06a7: ldc2_w 385041577063464455
      // 06aa: aload 128
      // 06ac: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06af: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 06b2: goto 06b9
      // 06b5: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 06b8: athrow
      // 06b9: ldc2_w 334241381080505095
      // 06bc: astore 130
      // 06be: ldc2_w 334241381080505095
      // 06c1: aload 130
      // 06c3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06c6: checkcast com/finalshell/core/Dv2
      // 06c9: ldc ""
      // 06cb: invokevirtual com/finalshell/core/Dv2.setText (Ljava/lang/String;)V
      // 06ce: goto 1469
      // 06d1: aload 0
      // 06d2: ldc2_w 385041577063464455
      // 06d5: astore 132
      // 06d7: ldc2_w 385041577063464455
      // 06da: aload 132
      // 06dc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06df: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 06e2: invokevirtual com/finalshell/ui/dialog/ClearListDialog.isVisible ()Z
      // 06e5: aload 2
      // 06e6: ifnonnull 071b
      // 06e9: ifeq 080d
      // 06ec: goto 06f3
      // 06ef: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 06f2: athrow
      // 06f3: aload 0
      // 06f4: ldc2_w 385041577063464455
      // 06f7: astore 134
      // 06f9: ldc2_w 385041577063464455
      // 06fc: aload 134
      // 06fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0701: ldc2_w 369475678680292668
      // 0704: astore 136
      // 0706: ldc2_w 369475678680292668
      // 0709: aload 136
      // 070b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 070e: checkcast org/jdesktop/swingx/JXList
      // 0711: invokevirtual org/jdesktop/swingx/JXList.getSelectedIndex ()I
      // 0714: goto 071b
      // 0717: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 071a: athrow
      // 071b: istore 5
      // 071d: iload 5
      // 071f: aload 2
      // 0720: ifnonnull 0771
      // 0723: bipush -1
      // 0724: if_icmple 07e7
      // 0727: goto 072e
      // 072a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 072d: athrow
      // 072e: aload 0
      // 072f: ldc2_w 385041577063464455
      // 0732: astore 138
      // 0734: ldc2_w 385041577063464455
      // 0737: aload 138
      // 0739: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 073c: ldc2_w 627738372728753803
      // 073f: astore 140
      // 0741: ldc2_w 627738372728753803
      // 0744: aload 140
      // 0746: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0749: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 074c: ldc2_w 253718301466496149
      // 074f: astore 143
      // 0751: astore 142
      // 0753: ldc2_w 253718301466496149
      // 0756: aload 142
      // 0758: aload 143
      // 075a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 075d: checkcast java/lang/Integer
      // 0760: invokevirtual java/lang/Integer.intValue ()I
      // 0763: goto 076a
      // 0766: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0769: athrow
      // 076a: goto 0771
      // 076d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0770: athrow
      // 0771: aload 2
      // 0772: ifnonnull 07a9
      // 0775: ifle 07e7
      // 0778: goto 077f
      // 077b: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 077e: athrow
      // 077f: aload 0
      // 0780: ldc2_w 385041577063464455
      // 0783: astore 144
      // 0785: ldc2_w 385041577063464455
      // 0788: aload 144
      // 078a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 078d: ldc2_w 369475678680292668
      // 0790: astore 146
      // 0792: ldc2_w 369475678680292668
      // 0795: aload 146
      // 0797: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 079a: checkcast org/jdesktop/swingx/JXList
      // 079d: iload 5
      // 079f: invokevirtual org/jdesktop/swingx/JXList.convertIndexToModel (I)I
      // 07a2: goto 07a9
      // 07a5: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 07a8: athrow
      // 07a9: istore 6
      // 07ab: aload 0
      // 07ac: ldc2_w 385041577063464455
      // 07af: astore 148
      // 07b1: ldc2_w 385041577063464455
      // 07b4: aload 148
      // 07b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07b9: ldc2_w 627738372728753803
      // 07bc: astore 150
      // 07be: ldc2_w 627738372728753803
      // 07c1: aload 150
      // 07c3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07c6: iload 6
      // 07c8: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 07cb: ldc2_w 430610060651646114
      // 07ce: astore 153
      // 07d0: astore 152
      // 07d2: ldc2_w 430610060651646114
      // 07d5: aload 152
      // 07d7: aload 153
      // 07d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07dc: checkcast com/finalshell/core/L1
      // 07df: goto 07e6
      // 07e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07e5: athrow
      // 07e6: astore 3
      // 07e7: aload 3
      // 07e8: ifnull 080d
      // 07eb: iload 5
      // 07ed: aload 2
      // 07ee: ifnonnull 080b
      // 07f1: goto 07f8
      // 07f4: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 07f7: athrow
      // 07f8: bipush -1
      // 07f9: if_icmple 080d
      // 07fc: goto 0803
      // 07ff: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0802: athrow
      // 0803: bipush 1
      // 0804: goto 080b
      // 0807: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 080a: athrow
      // 080b: istore 4
      // 080d: aload 0
      // 080e: ldc2_w 385041577063464455
      // 0811: astore 154
      // 0813: ldc2_w 385041577063464455
      // 0816: aload 154
      // 0818: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 081b: bipush 1
      // 081c: ldc2_w 278860969542151097
      // 081f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0822: dup_x2
      // 0823: pop
      // 0824: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 0827: aload 0
      // 0828: ldc2_w 385041577063464455
      // 082b: astore 156
      // 082d: ldc2_w 385041577063464455
      // 0830: aload 156
      // 0832: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0835: ldc2_w 265132846717086219
      // 0838: astore 158
      // 083a: ldc2_w 265132846717086219
      // 083d: aload 158
      // 083f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0842: checkcast com/finalshell/core/Dv2
      // 0845: invokevirtual com/finalshell/core/Dv2.getText ()Ljava/lang/String;
      // 0848: astore 5
      // 084a: aload 5
      // 084c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 084f: ldc2_w 330094358428833085
      // 0852: astore 160
      // 0854: ldc2_w 330094358428833085
      // 0857: aload 160
      // 0859: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 085c: checkcast java/lang/Boolean
      // 085f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0862: goto 0869
      // 0865: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0868: athrow
      // 0869: aload 2
      // 086a: ifnonnull 08c7
      // 086d: ifne 08c5
      // 0870: goto 0877
      // 0873: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0876: athrow
      // 0877: aload 0
      // 0878: ldc2_w 385041577063464455
      // 087b: astore 162
      // 087d: ldc2_w 385041577063464455
      // 0880: aload 162
      // 0882: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0885: ldc2_w 334241381080505095
      // 0888: astore 164
      // 088a: ldc2_w 334241381080505095
      // 088d: aload 164
      // 088f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0892: checkcast com/finalshell/core/Dv2
      // 0895: aload 0
      // 0896: ldc2_w 385041577063464455
      // 0899: astore 166
      // 089b: ldc2_w 385041577063464455
      // 089e: aload 166
      // 08a0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08a3: ldc2_w 334241381080505095
      // 08a6: astore 168
      // 08a8: ldc2_w 334241381080505095
      // 08ab: aload 168
      // 08ad: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08b0: checkcast com/finalshell/core/Dv2
      // 08b3: invokevirtual com/finalshell/core/Dv2.getDocument ()Ljavax/swing/text/Document;
      // 08b6: invokeinterface javax/swing/text/Document.getLength ()I 1
      // 08bb: invokevirtual com/finalshell/core/Dv2.setCaretPosition (I)V
      // 08be: goto 08c5
      // 08c1: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 08c4: athrow
      // 08c5: iload 4
      // 08c7: ifeq 0900
      // 08ca: aload 0
      // 08cb: ldc2_w 385041577063464455
      // 08ce: astore 170
      // 08d0: ldc2_w 385041577063464455
      // 08d3: aload 170
      // 08d5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08d8: aload 3
      // 08d9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08dc: ldc2_w 345502075173010592
      // 08df: astore 173
      // 08e1: astore 172
      // 08e3: ldc2_w 345502075173010592
      // 08e6: aload 172
      // 08e8: aload 173
      // 08ea: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08ed: pop
      // 08ee: goto 08f5
      // 08f1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f4: athrow
      // 08f5: aload 2
      // 08f6: ifnull 0931
      // 08f9: goto 0900
      // 08fc: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 08ff: athrow
      // 0900: aload 0
      // 0901: ldc2_w 385041577063464455
      // 0904: astore 174
      // 0906: ldc2_w 385041577063464455
      // 0909: aload 174
      // 090b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 090e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0911: ldc2_w 206894218749981611
      // 0914: astore 177
      // 0916: astore 176
      // 0918: ldc2_w 206894218749981611
      // 091b: aload 176
      // 091d: aload 177
      // 091f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0922: pop
      // 0923: goto 092a
      // 0926: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0929: athrow
      // 092a: goto 0931
      // 092d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0930: athrow
      // 0931: goto 1469
      // 0934: aload 1
      // 0935: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0938: sipush 20226
      // 093b: ldc2_w 1188350688712233287
      // 093e: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 0941: aload 2
      // 0942: ifnonnull 0998
      // 0945: if_icmpne 0984
      // 0948: goto 094f
      // 094b: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 094e: athrow
      // 094f: aload 0
      // 0950: ldc2_w 385041577063464455
      // 0953: astore 178
      // 0955: ldc2_w 385041577063464455
      // 0958: aload 178
      // 095a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 095d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0960: ldc2_w 496821856781947383
      // 0963: astore 181
      // 0965: astore 180
      // 0967: ldc2_w 496821856781947383
      // 096a: aload 180
      // 096c: aload 181
      // 096e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0971: pop
      // 0972: goto 0979
      // 0975: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0978: athrow
      // 0979: aload 2
      // 097a: ifnull 1469
      // 097d: goto 0984
      // 0980: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0983: athrow
      // 0984: aload 1
      // 0985: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0988: sipush 16788
      // 098b: ldc2_w 3608317187452346329
      // 098e: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 0991: goto 0998
      // 0994: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0997: athrow
      // 0998: aload 2
      // 0999: ifnonnull 0a50
      // 099c: if_icmpne 0a3c
      // 099f: goto 09a6
      // 09a2: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 09a5: athrow
      // 09a6: aload 0
      // 09a7: ldc2_w 385041577063464455
      // 09aa: astore 182
      // 09ac: ldc2_w 385041577063464455
      // 09af: aload 182
      // 09b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09b4: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 09b7: invokevirtual com/finalshell/ui/dialog/ClearListDialog.isVisible ()Z
      // 09ba: aload 2
      // 09bb: ifnonnull 0a04
      // 09be: goto 09c5
      // 09c1: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 09c4: athrow
      // 09c5: ifne 0a00
      // 09c8: goto 09cf
      // 09cb: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 09ce: athrow
      // 09cf: aload 0
      // 09d0: ldc2_w 385041577063464455
      // 09d3: astore 184
      // 09d5: ldc2_w 385041577063464455
      // 09d8: aload 184
      // 09da: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09dd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09e0: ldc2_w 306221011327708335
      // 09e3: astore 187
      // 09e5: astore 186
      // 09e7: ldc2_w 306221011327708335
      // 09ea: aload 186
      // 09ec: aload 187
      // 09ee: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09f1: pop
      // 09f2: goto 09f9
      // 09f5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09f8: athrow
      // 09f9: goto 0a00
      // 09fc: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 09ff: athrow
      // 0a00: aload 1
      // 0a01: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0a04: ifne 1469
      // 0a07: aload 0
      // 0a08: ldc2_w 385041577063464455
      // 0a0b: astore 188
      // 0a0d: ldc2_w 385041577063464455
      // 0a10: aload 188
      // 0a12: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a15: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a18: ldc2_w 179083204588400440
      // 0a1b: astore 191
      // 0a1d: astore 190
      // 0a1f: ldc2_w 179083204588400440
      // 0a22: aload 190
      // 0a24: aload 191
      // 0a26: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a29: pop
      // 0a2a: goto 0a31
      // 0a2d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a30: athrow
      // 0a31: aload 2
      // 0a32: ifnull 1469
      // 0a35: goto 0a3c
      // 0a38: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0a3b: athrow
      // 0a3c: aload 1
      // 0a3d: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0a40: sipush 28805
      // 0a43: ldc2_w 1492044526203317967
      // 0a46: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 0a49: goto 0a50
      // 0a4c: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0a4f: athrow
      // 0a50: aload 2
      // 0a51: ifnonnull 0b5d
      // 0a54: if_icmpne 0b49
      // 0a57: goto 0a5e
      // 0a5a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0a5d: athrow
      // 0a5e: aload 0
      // 0a5f: ldc2_w 385041577063464455
      // 0a62: astore 192
      // 0a64: ldc2_w 385041577063464455
      // 0a67: aload 192
      // 0a69: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a6c: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0a6f: aload 2
      // 0a70: ifnonnull 0b29
      // 0a73: goto 0a7a
      // 0a76: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0a79: athrow
      // 0a7a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a7d: ldc2_w 257476172962055898
      // 0a80: astore 195
      // 0a82: astore 194
      // 0a84: ldc2_w 257476172962055898
      // 0a87: aload 194
      // 0a89: aload 195
      // 0a8b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a8e: checkcast java/lang/Boolean
      // 0a91: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a94: goto 0a9b
      // 0a97: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a9a: athrow
      // 0a9b: ifne 0b11
      // 0a9e: goto 0aa5
      // 0aa1: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0aa4: athrow
      // 0aa5: aload 0
      // 0aa6: ldc2_w 385041577063464455
      // 0aa9: astore 196
      // 0aab: ldc2_w 385041577063464455
      // 0aae: aload 196
      // 0ab0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ab3: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0ab6: invokevirtual com/finalshell/ui/dialog/ClearListDialog.isVisible ()Z
      // 0ab9: aload 2
      // 0aba: ifnonnull 0ad9
      // 0abd: goto 0ac4
      // 0ac0: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ac3: athrow
      // 0ac4: ifeq 1469
      // 0ac7: goto 0ace
      // 0aca: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0acd: athrow
      // 0ace: aload 1
      // 0acf: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0ad2: goto 0ad9
      // 0ad5: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ad8: athrow
      // 0ad9: ifne 1469
      // 0adc: aload 0
      // 0add: ldc2_w 385041577063464455
      // 0ae0: astore 198
      // 0ae2: ldc2_w 385041577063464455
      // 0ae5: aload 198
      // 0ae7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0aea: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0aed: ldc2_w 373518020463529124
      // 0af0: astore 201
      // 0af2: astore 200
      // 0af4: ldc2_w 373518020463529124
      // 0af7: aload 200
      // 0af9: aload 201
      // 0afb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0afe: pop
      // 0aff: goto 0b06
      // 0b02: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b05: athrow
      // 0b06: aload 2
      // 0b07: ifnull 1469
      // 0b0a: goto 0b11
      // 0b0d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0b10: athrow
      // 0b11: aload 0
      // 0b12: ldc2_w 385041577063464455
      // 0b15: astore 202
      // 0b17: ldc2_w 385041577063464455
      // 0b1a: aload 202
      // 0b1c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b1f: checkcast com/finalshell/ui/dialog/ClearListDialog
      // 0b22: goto 0b29
      // 0b25: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0b28: athrow
      // 0b29: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b2c: ldc2_w 373518020463529124
      // 0b2f: astore 205
      // 0b31: astore 204
      // 0b33: ldc2_w 373518020463529124
      // 0b36: aload 204
      // 0b38: aload 205
      // 0b3a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b3d: pop
      // 0b3e: goto 0b45
      // 0b41: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b44: athrow
      // 0b45: aload 2
      // 0b46: ifnull 1469
      // 0b49: aload 1
      // 0b4a: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0b4d: sipush 15874
      // 0b50: ldc2_w 1362405595735351370
      // 0b53: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 0b56: goto 0b5d
      // 0b59: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0b5c: athrow
      // 0b5d: aload 2
      // 0b5e: ifnonnull 0b7b
      // 0b61: if_icmpne 0b6e
      // 0b64: goto 0b6b
      // 0b67: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0b6a: athrow
      // 0b6b: goto 1469
      // 0b6e: aload 1
      // 0b6f: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0b72: sipush 11439
      // 0b75: ldc2_w 6713159034709308134
      // 0b78: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 0b7b: aload 2
      // 0b7c: ifnonnull 0ffa
      // 0b7f: if_icmpne 0fdb
      // 0b82: goto 0b89
      // 0b85: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0b88: athrow
      // 0b89: aload 1
      // 0b8a: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 0b8d: aload 2
      // 0b8e: ifnonnull 0bae
      // 0b91: goto 0b98
      // 0b94: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0b97: athrow
      // 0b98: ifeq 0ba3
      // 0b9b: goto 0ba2
      // 0b9e: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ba1: athrow
      // 0ba2: return
      // 0ba3: aload 0
      // 0ba4: ldc2_w 603047907484873769
      // 0ba7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0baa: swap
      // 0bab: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0bae: aload 2
      // 0baf: ifnonnull 0cce
      // 0bb2: ifne 0c57
      // 0bb5: goto 0bbc
      // 0bb8: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0bbb: athrow
      // 0bbc: aload 0
      // 0bbd: ldc2_w 385041577063464455
      // 0bc0: astore 206
      // 0bc2: ldc2_w 385041577063464455
      // 0bc5: aload 206
      // 0bc7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bca: ldc2_w 618427502576624312
      // 0bcd: astore 208
      // 0bcf: ldc2_w 618427502576624312
      // 0bd2: aload 208
      // 0bd4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bd7: checkcast com/finalshell/core/Tq4
      // 0bda: invokevirtual com/finalshell/core/Tq4.getSelectedRow ()I
      // 0bdd: istore 5
      // 0bdf: aload 2
      // 0be0: ifnonnull 0c2e
      // 0be3: iload 5
      // 0be5: bipush -1
      // 0be6: if_icmple 0c53
      // 0be9: goto 0bf0
      // 0bec: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0bef: athrow
      // 0bf0: aload 0
      // 0bf1: ldc2_w 385041577063464455
      // 0bf4: astore 210
      // 0bf6: ldc2_w 385041577063464455
      // 0bf9: aload 210
      // 0bfb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bfe: ldc2_w 308394982418497131
      // 0c01: astore 212
      // 0c03: ldc2_w 308394982418497131
      // 0c06: aload 212
      // 0c08: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c0b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c0e: ldc2_w 355015458569368047
      // 0c11: astore 215
      // 0c13: astore 214
      // 0c15: ldc2_w 355015458569368047
      // 0c18: aload 214
      // 0c1a: aload 215
      // 0c1c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c1f: pop
      // 0c20: goto 0c27
      // 0c23: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c26: athrow
      // 0c27: goto 0c2e
      // 0c2a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0c2d: athrow
      // 0c2e: aload 0
      // 0c2f: ldc2_w 385041577063464455
      // 0c32: astore 216
      // 0c34: ldc2_w 385041577063464455
      // 0c37: aload 216
      // 0c39: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c3c: ldc2_w 598800499692003827
      // 0c3f: astore 218
      // 0c41: ldc2_w 598800499692003827
      // 0c44: aload 218
      // 0c46: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c49: checkcast com/finalshell/ui/model/FT
      // 0c4c: iload 5
      // 0c4e: iload 5
      // 0c50: invokevirtual com/finalshell/ui/model/FT.fireTableRowsUpdated (II)V
      // 0c53: aload 2
      // 0c54: ifnull 1469
      // 0c57: aload 0
      // 0c58: ldc2_w 385041577063464455
      // 0c5b: astore 220
      // 0c5d: ldc2_w 385041577063464455
      // 0c60: aload 220
      // 0c62: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c65: ldc2_w 369475678680292668
      // 0c68: astore 222
      // 0c6a: ldc2_w 369475678680292668
      // 0c6d: aload 222
      // 0c6f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c72: checkcast org/jdesktop/swingx/JXList
      // 0c75: new java/awt/Point
      // 0c78: dup
      // 0c79: aload 0
      // 0c7a: ldc2_w 385041577063464455
      // 0c7d: astore 224
      // 0c7f: ldc2_w 385041577063464455
      // 0c82: aload 224
      // 0c84: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c87: ldc2_w 369475678680292668
      // 0c8a: astore 226
      // 0c8c: ldc2_w 369475678680292668
      // 0c8f: aload 226
      // 0c91: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c94: checkcast org/jdesktop/swingx/JXList
      // 0c97: invokevirtual org/jdesktop/swingx/JXList.getVisibleRect ()Ljava/awt/Rectangle;
      // 0c9a: getfield java/awt/Rectangle.x I
      // 0c9d: aload 0
      // 0c9e: ldc2_w 385041577063464455
      // 0ca1: astore 228
      // 0ca3: ldc2_w 385041577063464455
      // 0ca6: aload 228
      // 0ca8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cab: ldc2_w 369475678680292668
      // 0cae: astore 230
      // 0cb0: ldc2_w 369475678680292668
      // 0cb3: aload 230
      // 0cb5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cb8: checkcast org/jdesktop/swingx/JXList
      // 0cbb: invokevirtual org/jdesktop/swingx/JXList.getVisibleRect ()Ljava/awt/Rectangle;
      // 0cbe: getfield java/awt/Rectangle.y I
      // 0cc1: invokespecial java/awt/Point.<init> (II)V
      // 0cc4: invokevirtual org/jdesktop/swingx/JXList.locationToIndex (Ljava/awt/Point;)I
      // 0cc7: goto 0cce
      // 0cca: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ccd: athrow
      // 0cce: istore 5
      // 0cd0: aload 0
      // 0cd1: ldc2_w 385041577063464455
      // 0cd4: astore 232
      // 0cd6: ldc2_w 385041577063464455
      // 0cd9: aload 232
      // 0cdb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cde: ldc2_w 369475678680292668
      // 0ce1: astore 234
      // 0ce3: ldc2_w 369475678680292668
      // 0ce6: aload 234
      // 0ce8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ceb: checkcast org/jdesktop/swingx/JXList
      // 0cee: invokevirtual org/jdesktop/swingx/JXList.getSelectedIndex ()I
      // 0cf1: istore 5
      // 0cf3: bipush 0
      // 0cf4: istore 6
      // 0cf6: iload 5
      // 0cf8: bipush -1
      // 0cf9: aload 2
      // 0cfa: ifnonnull 0d43
      // 0cfd: if_icmple 0fa6
      // 0d00: goto 0d07
      // 0d03: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d06: athrow
      // 0d07: iload 5
      // 0d09: aload 0
      // 0d0a: ldc2_w 385041577063464455
      // 0d0d: astore 236
      // 0d0f: ldc2_w 385041577063464455
      // 0d12: aload 236
      // 0d14: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d17: ldc2_w 467422017983063981
      // 0d1a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d1d: swap
      // 0d1e: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0d21: bipush 2
      // 0d22: isub
      // 0d23: aload 0
      // 0d24: ldc2_w 385041577063464455
      // 0d27: astore 238
      // 0d29: ldc2_w 385041577063464455
      // 0d2c: aload 238
      // 0d2e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d31: ldc2_w 607893582657885022
      // 0d34: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d37: swap
      // 0d38: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0d3b: imul
      // 0d3c: goto 0d43
      // 0d3f: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d42: athrow
      // 0d43: aload 2
      // 0d44: ifnonnull 0e9e
      // 0d47: if_icmplt 0e79
      // 0d4a: goto 0d51
      // 0d4d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d50: athrow
      // 0d51: iload 5
      // 0d53: aload 0
      // 0d54: ldc2_w 385041577063464455
      // 0d57: astore 240
      // 0d59: ldc2_w 385041577063464455
      // 0d5c: aload 240
      // 0d5e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d61: ldc2_w 467422017983063981
      // 0d64: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d67: swap
      // 0d68: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0d6b: bipush 1
      // 0d6c: isub
      // 0d6d: aload 0
      // 0d6e: ldc2_w 385041577063464455
      // 0d71: astore 242
      // 0d73: ldc2_w 385041577063464455
      // 0d76: aload 242
      // 0d78: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d7b: ldc2_w 607893582657885022
      // 0d7e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d81: swap
      // 0d82: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0d85: imul
      // 0d86: aload 2
      // 0d87: ifnonnull 0e1c
      // 0d8a: goto 0d91
      // 0d8d: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d90: athrow
      // 0d91: if_icmplt 0dbe
      // 0d94: goto 0d9b
      // 0d97: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d9a: athrow
      // 0d9b: iload 5
      // 0d9d: bipush 1
      // 0d9e: iadd
      // 0d9f: aload 0
      // 0da0: ldc2_w 385041577063464455
      // 0da3: astore 244
      // 0da5: ldc2_w 385041577063464455
      // 0da8: aload 244
      // 0daa: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0dad: ldc2_w 607893582657885022
      // 0db0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0db3: swap
      // 0db4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0db7: irem
      // 0db8: istore 6
      // 0dba: aload 2
      // 0dbb: ifnull 0ea1
      // 0dbe: iload 5
      // 0dc0: aload 0
      // 0dc1: ldc2_w 385041577063464455
      // 0dc4: astore 246
      // 0dc6: ldc2_w 385041577063464455
      // 0dc9: aload 246
      // 0dcb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0dce: ldc2_w 607893582657885022
      // 0dd1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0dd4: swap
      // 0dd5: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0dd8: iadd
      // 0dd9: aload 0
      // 0dda: ldc2_w 385041577063464455
      // 0ddd: astore 248
      // 0ddf: ldc2_w 385041577063464455
      // 0de2: aload 248
      // 0de4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0de7: ldc2_w 627738372728753803
      // 0dea: astore 250
      // 0dec: ldc2_w 627738372728753803
      // 0def: aload 250
      // 0df1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0df4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0df7: ldc2_w 253718301466496149
      // 0dfa: astore 253
      // 0dfc: astore 252
      // 0dfe: ldc2_w 253718301466496149
      // 0e01: aload 252
      // 0e03: aload 253
      // 0e05: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e08: checkcast java/lang/Integer
      // 0e0b: invokevirtual java/lang/Integer.intValue ()I
      // 0e0e: goto 0e15
      // 0e11: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e14: athrow
      // 0e15: goto 0e1c
      // 0e18: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0e1b: athrow
      // 0e1c: aload 2
      // 0e1d: ifnonnull 0e72
      // 0e20: if_icmpge 0e4b
      // 0e23: goto 0e2a
      // 0e26: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0e29: athrow
      // 0e2a: iload 5
      // 0e2c: aload 0
      // 0e2d: ldc2_w 385041577063464455
      // 0e30: astore 254
      // 0e32: ldc2_w 385041577063464455
      // 0e35: aload 254
      // 0e37: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e3a: ldc2_w 607893582657885022
      // 0e3d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e40: swap
      // 0e41: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e44: iadd
      // 0e45: istore 6
      // 0e47: aload 2
      // 0e48: ifnull 0ea1
      // 0e4b: iload 5
      // 0e4d: bipush 1
      // 0e4e: iadd
      // 0e4f: aload 0
      // 0e50: ldc2_w 385041577063464455
      // 0e53: wide astore 256
      // 0e57: ldc2_w 385041577063464455
      // 0e5a: wide aload 256
      // 0e5e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e61: ldc2_w 607893582657885022
      // 0e64: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e67: swap
      // 0e68: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e6b: goto 0e72
      // 0e6e: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0e71: athrow
      // 0e72: irem
      // 0e73: istore 6
      // 0e75: aload 2
      // 0e76: ifnull 0ea1
      // 0e79: iload 5
      // 0e7b: aload 0
      // 0e7c: ldc2_w 385041577063464455
      // 0e7f: wide astore 258
      // 0e83: ldc2_w 385041577063464455
      // 0e86: wide aload 258
      // 0e8a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e8d: ldc2_w 132462760774120245
      // 0e90: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e93: swap
      // 0e94: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e97: goto 0e9e
      // 0e9a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0e9d: athrow
      // 0e9e: iadd
      // 0e9f: istore 6
      // 0ea1: iload 6
      // 0ea3: aload 0
      // 0ea4: ldc2_w 385041577063464455
      // 0ea7: wide astore 260
      // 0eab: ldc2_w 385041577063464455
      // 0eae: wide aload 260
      // 0eb2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0eb5: ldc2_w 627738372728753803
      // 0eb8: wide astore 262
      // 0ebc: ldc2_w 627738372728753803
      // 0ebf: wide aload 262
      // 0ec3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ec6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ec9: ldc2_w 253718301466496149
      // 0ecc: wide astore 265
      // 0ed0: wide astore 264
      // 0ed4: ldc2_w 253718301466496149
      // 0ed7: wide aload 264
      // 0edb: wide aload 265
      // 0edf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ee2: checkcast java/lang/Integer
      // 0ee5: invokevirtual java/lang/Integer.intValue ()I
      // 0ee8: goto 0eef
      // 0eeb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0eee: athrow
      // 0eef: if_icmpge 0fd7
      // 0ef2: aload 0
      // 0ef3: ldc2_w 385041577063464455
      // 0ef6: wide astore 266
      // 0efa: ldc2_w 385041577063464455
      // 0efd: wide aload 266
      // 0f01: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f04: ldc2_w 369475678680292668
      // 0f07: wide astore 268
      // 0f0b: ldc2_w 369475678680292668
      // 0f0e: wide aload 268
      // 0f12: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f15: checkcast org/jdesktop/swingx/JXList
      // 0f18: iload 6
      // 0f1a: iload 6
      // 0f1c: invokevirtual org/jdesktop/swingx/JXList.getCellBounds (II)Ljava/awt/Rectangle;
      // 0f1f: astore 7
      // 0f21: aload 0
      // 0f22: ldc2_w 385041577063464455
      // 0f25: wide astore 270
      // 0f29: ldc2_w 385041577063464455
      // 0f2c: wide aload 270
      // 0f30: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f33: ldc2_w 369475678680292668
      // 0f36: wide astore 272
      // 0f3a: ldc2_w 369475678680292668
      // 0f3d: wide aload 272
      // 0f41: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f44: checkcast org/jdesktop/swingx/JXList
      // 0f47: iload 6
      // 0f49: invokevirtual org/jdesktop/swingx/JXList.setSelectedIndex (I)V
      // 0f4c: aload 0
      // 0f4d: ldc2_w 385041577063464455
      // 0f50: wide astore 274
      // 0f54: ldc2_w 385041577063464455
      // 0f57: wide aload 274
      // 0f5b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f5e: ldc2_w 369475678680292668
      // 0f61: wide astore 276
      // 0f65: ldc2_w 369475678680292668
      // 0f68: wide aload 276
      // 0f6c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f6f: checkcast org/jdesktop/swingx/JXList
      // 0f72: aload 7
      // 0f74: invokevirtual org/jdesktop/swingx/JXList.scrollRectToVisible (Ljava/awt/Rectangle;)V
      // 0f77: aload 0
      // 0f78: ldc2_w 385041577063464455
      // 0f7b: wide astore 278
      // 0f7f: ldc2_w 385041577063464455
      // 0f82: wide aload 278
      // 0f86: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f89: ldc2_w 123884418036416875
      // 0f8c: wide astore 280
      // 0f90: ldc2_w 123884418036416875
      // 0f93: wide aload 280
      // 0f97: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f9a: checkcast javax/swing/JScrollPane
      // 0f9d: aload 7
      // 0f9f: invokevirtual javax/swing/JScrollPane.scrollRectToVisible (Ljava/awt/Rectangle;)V
      // 0fa2: aload 2
      // 0fa3: ifnull 0fd7
      // 0fa6: aload 0
      // 0fa7: ldc2_w 385041577063464455
      // 0faa: wide astore 282
      // 0fae: ldc2_w 385041577063464455
      // 0fb1: wide aload 282
      // 0fb5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fb8: ldc2_w 369475678680292668
      // 0fbb: wide astore 284
      // 0fbf: ldc2_w 369475678680292668
      // 0fc2: wide aload 284
      // 0fc6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fc9: checkcast org/jdesktop/swingx/JXList
      // 0fcc: bipush 0
      // 0fcd: invokevirtual org/jdesktop/swingx/JXList.setSelectedIndex (I)V
      // 0fd0: goto 0fd7
      // 0fd3: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0fd6: athrow
      // 0fd7: aload 2
      // 0fd8: ifnull 1469
      // 0fdb: aload 1
      // 0fdc: invokevirtual java/awt/event/KeyEvent.getKeyCode ()I
      // 0fdf: aload 2
      // 0fe0: ifnonnull 1008
      // 0fe3: goto 0fea
      // 0fe6: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0fe9: athrow
      // 0fea: sipush 32082
      // 0fed: ldc2_w 562566081126081309
      // 0ff0: invokestatic com/finalshell/ui/listener/XS.a (IJ)I
      // 0ff3: goto 0ffa
      // 0ff6: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ff9: athrow
      // 0ffa: if_icmpne 1469
      // 0ffd: aload 1
      // 0ffe: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 1001: goto 1008
      // 1004: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 1007: athrow
      // 1008: aload 2
      // 1009: ifnonnull 1022
      // 100c: ifeq 1017
      // 100f: goto 1016
      // 1012: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 1015: athrow
      // 1016: return
      // 1017: aload 0
      // 1018: ldc2_w 603047907484873769
      // 101b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 101e: swap
      // 101f: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1022: aload 2
      // 1023: ifnonnull 117a
      // 1026: ifne 10eb
      // 1029: goto 1030
      // 102c: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 102f: athrow
      // 1030: aload 0
      // 1031: ldc2_w 385041577063464455
      // 1034: wide astore 286
      // 1038: ldc2_w 385041577063464455
      // 103b: wide aload 286
      // 103f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1042: ldc2_w 618427502576624312
      // 1045: wide astore 288
      // 1049: ldc2_w 618427502576624312
      // 104c: wide aload 288
      // 1050: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1053: checkcast com/finalshell/core/Tq4
      // 1056: invokevirtual com/finalshell/core/Tq4.getSelectedRow ()I
      // 1059: istore 5
      // 105b: aload 2
      // 105c: ifnonnull 10ba
      // 105f: iload 5
      // 1061: bipush -1
      // 1062: if_icmple 10e7
      // 1065: goto 106c
      // 1068: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 106b: athrow
      // 106c: aload 0
      // 106d: ldc2_w 385041577063464455
      // 1070: wide astore 290
      // 1074: ldc2_w 385041577063464455
      // 1077: wide aload 290
      // 107b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 107e: ldc2_w 308394982418497131
      // 1081: wide astore 292
      // 1085: ldc2_w 308394982418497131
      // 1088: wide aload 292
      // 108c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 108f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1092: ldc2_w 120912390291105160
      // 1095: wide astore 295
      // 1099: wide astore 294
      // 109d: ldc2_w 120912390291105160
      // 10a0: wide aload 294
      // 10a4: wide aload 295
      // 10a8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10ab: pop
      // 10ac: goto 10b3
      // 10af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10b2: athrow
      // 10b3: goto 10ba
      // 10b6: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 10b9: athrow
      // 10ba: aload 0
      // 10bb: ldc2_w 385041577063464455
      // 10be: wide astore 296
      // 10c2: ldc2_w 385041577063464455
      // 10c5: wide aload 296
      // 10c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10cc: ldc2_w 598800499692003827
      // 10cf: wide astore 298
      // 10d3: ldc2_w 598800499692003827
      // 10d6: wide aload 298
      // 10da: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10dd: checkcast com/finalshell/ui/model/FT
      // 10e0: iload 5
      // 10e2: iload 5
      // 10e4: invokevirtual com/finalshell/ui/model/FT.fireTableRowsUpdated (II)V
      // 10e7: aload 2
      // 10e8: ifnull 1469
      // 10eb: aload 0
      // 10ec: ldc2_w 385041577063464455
      // 10ef: wide astore 300
      // 10f3: ldc2_w 385041577063464455
      // 10f6: wide aload 300
      // 10fa: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10fd: ldc2_w 369475678680292668
      // 1100: wide astore 302
      // 1104: ldc2_w 369475678680292668
      // 1107: wide aload 302
      // 110b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 110e: checkcast org/jdesktop/swingx/JXList
      // 1111: new java/awt/Point
      // 1114: dup
      // 1115: aload 0
      // 1116: ldc2_w 385041577063464455
      // 1119: wide astore 304
      // 111d: ldc2_w 385041577063464455
      // 1120: wide aload 304
      // 1124: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1127: ldc2_w 369475678680292668
      // 112a: wide astore 306
      // 112e: ldc2_w 369475678680292668
      // 1131: wide aload 306
      // 1135: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1138: checkcast org/jdesktop/swingx/JXList
      // 113b: invokevirtual org/jdesktop/swingx/JXList.getVisibleRect ()Ljava/awt/Rectangle;
      // 113e: getfield java/awt/Rectangle.x I
      // 1141: aload 0
      // 1142: ldc2_w 385041577063464455
      // 1145: wide astore 308
      // 1149: ldc2_w 385041577063464455
      // 114c: wide aload 308
      // 1150: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1153: ldc2_w 369475678680292668
      // 1156: wide astore 310
      // 115a: ldc2_w 369475678680292668
      // 115d: wide aload 310
      // 1161: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1164: checkcast org/jdesktop/swingx/JXList
      // 1167: invokevirtual org/jdesktop/swingx/JXList.getVisibleRect ()Ljava/awt/Rectangle;
      // 116a: getfield java/awt/Rectangle.y I
      // 116d: invokespecial java/awt/Point.<init> (II)V
      // 1170: invokevirtual org/jdesktop/swingx/JXList.locationToIndex (Ljava/awt/Point;)I
      // 1173: goto 117a
      // 1176: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 1179: athrow
      // 117a: istore 5
      // 117c: aload 0
      // 117d: ldc2_w 385041577063464455
      // 1180: wide astore 312
      // 1184: ldc2_w 385041577063464455
      // 1187: wide aload 312
      // 118b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 118e: ldc2_w 369475678680292668
      // 1191: wide astore 314
      // 1195: ldc2_w 369475678680292668
      // 1198: wide aload 314
      // 119c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 119f: checkcast org/jdesktop/swingx/JXList
      // 11a2: aload 2
      // 11a3: ifnonnull 1465
      // 11a6: invokevirtual org/jdesktop/swingx/JXList.getSelectedIndex ()I
      // 11a9: istore 5
      // 11ab: iload 5
      // 11ad: bipush -1
      // 11ae: if_icmple 1438
      // 11b1: bipush 0
      // 11b2: istore 6
      // 11b4: iload 5
      // 11b6: aload 0
      // 11b7: ldc2_w 385041577063464455
      // 11ba: wide astore 316
      // 11be: ldc2_w 385041577063464455
      // 11c1: wide aload 316
      // 11c5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11c8: ldc2_w 607893582657885022
      // 11cb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 11ce: swap
      // 11cf: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 11d2: aload 2
      // 11d3: ifnonnull 137b
      // 11d6: if_icmpge 1356
      // 11d9: goto 11e0
      // 11dc: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 11df: athrow
      // 11e0: aload 0
      // 11e1: ldc2_w 385041577063464455
      // 11e4: wide astore 318
      // 11e8: ldc2_w 385041577063464455
      // 11eb: wide aload 318
      // 11ef: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11f2: ldc2_w 467422017983063981
      // 11f5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 11f8: swap
      // 11f9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 11fc: bipush 1
      // 11fd: isub
      // 11fe: aload 0
      // 11ff: ldc2_w 385041577063464455
      // 1202: wide astore 320
      // 1206: ldc2_w 385041577063464455
      // 1209: wide aload 320
      // 120d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1210: ldc2_w 132462760774120245
      // 1213: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1216: swap
      // 1217: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 121a: imul
      // 121b: iload 5
      // 121d: iadd
      // 121e: bipush 1
      // 121f: isub
      // 1220: istore 6
      // 1222: iload 6
      // 1224: aload 2
      // 1225: ifnonnull 12c2
      // 1228: aload 0
      // 1229: ldc2_w 385041577063464455
      // 122c: wide astore 322
      // 1230: ldc2_w 385041577063464455
      // 1233: wide aload 322
      // 1237: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 123a: ldc2_w 627738372728753803
      // 123d: wide astore 324
      // 1241: ldc2_w 627738372728753803
      // 1244: wide aload 324
      // 1248: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 124b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 124e: ldc2_w 253718301466496149
      // 1251: wide astore 327
      // 1255: wide astore 326
      // 1259: ldc2_w 253718301466496149
      // 125c: wide aload 326
      // 1260: wide aload 327
      // 1264: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1267: checkcast java/lang/Integer
      // 126a: invokevirtual java/lang/Integer.intValue ()I
      // 126d: goto 1274
      // 1270: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1273: athrow
      // 1274: if_icmplt 12c0
      // 1277: goto 127e
      // 127a: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 127d: athrow
      // 127e: aload 0
      // 127f: ldc2_w 385041577063464455
      // 1282: wide astore 328
      // 1286: ldc2_w 385041577063464455
      // 1289: wide aload 328
      // 128d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1290: ldc2_w 467422017983063981
      // 1293: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1296: swap
      // 1297: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 129a: bipush 2
      // 129b: isub
      // 129c: aload 0
      // 129d: ldc2_w 385041577063464455
      // 12a0: wide astore 330
      // 12a4: ldc2_w 385041577063464455
      // 12a7: wide aload 330
      // 12ab: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12ae: ldc2_w 132462760774120245
      // 12b1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12b4: swap
      // 12b5: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 12b8: imul
      // 12b9: iload 5
      // 12bb: iadd
      // 12bc: bipush 1
      // 12bd: isub
      // 12be: istore 6
      // 12c0: iload 5
      // 12c2: aload 2
      // 12c3: ifnonnull 1380
      // 12c6: ifne 137e
      // 12c9: goto 12d0
      // 12cc: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 12cf: athrow
      // 12d0: aload 0
      // 12d1: ldc2_w 385041577063464455
      // 12d4: wide astore 332
      // 12d8: ldc2_w 385041577063464455
      // 12db: wide aload 332
      // 12df: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12e2: ldc2_w 467422017983063981
      // 12e5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12e8: swap
      // 12e9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 12ec: bipush 1
      // 12ed: aload 2
      // 12ee: ifnonnull 1381
      // 12f1: goto 12f8
      // 12f4: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 12f7: athrow
      // 12f8: if_icmpne 137e
      // 12fb: goto 1302
      // 12fe: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 1301: athrow
      // 1302: aload 0
      // 1303: ldc2_w 385041577063464455
      // 1306: wide astore 334
      // 130a: ldc2_w 385041577063464455
      // 130d: wide aload 334
      // 1311: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1314: ldc2_w 627738372728753803
      // 1317: wide astore 336
      // 131b: ldc2_w 627738372728753803
      // 131e: wide aload 336
      // 1322: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1325: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1328: ldc2_w 253718301466496149
      // 132b: wide astore 339
      // 132f: wide astore 338
      // 1333: ldc2_w 253718301466496149
      // 1336: wide aload 338
      // 133a: wide aload 339
      // 133e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1341: checkcast java/lang/Integer
      // 1344: invokevirtual java/lang/Integer.intValue ()I
      // 1347: goto 134e
      // 134a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 134d: athrow
      // 134e: bipush 1
      // 134f: isub
      // 1350: istore 6
      // 1352: aload 2
      // 1353: ifnull 137e
      // 1356: iload 5
      // 1358: aload 0
      // 1359: ldc2_w 385041577063464455
      // 135c: wide astore 340
      // 1360: ldc2_w 385041577063464455
      // 1363: wide aload 340
      // 1367: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 136a: ldc2_w 132462760774120245
      // 136d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1370: swap
      // 1371: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1374: goto 137b
      // 1377: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 137a: athrow
      // 137b: isub
      // 137c: istore 6
      // 137e: iload 6
      // 1380: bipush -1
      // 1381: if_icmple 1434
      // 1384: aload 0
      // 1385: ldc2_w 385041577063464455
      // 1388: wide astore 342
      // 138c: ldc2_w 385041577063464455
      // 138f: wide aload 342
      // 1393: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1396: ldc2_w 369475678680292668
      // 1399: wide astore 344
      // 139d: ldc2_w 369475678680292668
      // 13a0: wide aload 344
      // 13a4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13a7: checkcast org/jdesktop/swingx/JXList
      // 13aa: iload 6
      // 13ac: iload 6
      // 13ae: invokevirtual org/jdesktop/swingx/JXList.getCellBounds (II)Ljava/awt/Rectangle;
      // 13b1: astore 7
      // 13b3: aload 0
      // 13b4: ldc2_w 385041577063464455
      // 13b7: wide astore 346
      // 13bb: ldc2_w 385041577063464455
      // 13be: wide aload 346
      // 13c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13c5: ldc2_w 369475678680292668
      // 13c8: wide astore 348
      // 13cc: ldc2_w 369475678680292668
      // 13cf: wide aload 348
      // 13d3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13d6: checkcast org/jdesktop/swingx/JXList
      // 13d9: iload 6
      // 13db: invokevirtual org/jdesktop/swingx/JXList.setSelectedIndex (I)V
      // 13de: aload 0
      // 13df: ldc2_w 385041577063464455
      // 13e2: wide astore 350
      // 13e6: ldc2_w 385041577063464455
      // 13e9: wide aload 350
      // 13ed: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13f0: ldc2_w 369475678680292668
      // 13f3: wide astore 352
      // 13f7: ldc2_w 369475678680292668
      // 13fa: wide aload 352
      // 13fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1401: checkcast org/jdesktop/swingx/JXList
      // 1404: aload 7
      // 1406: invokevirtual org/jdesktop/swingx/JXList.scrollRectToVisible (Ljava/awt/Rectangle;)V
      // 1409: aload 0
      // 140a: ldc2_w 385041577063464455
      // 140d: wide astore 354
      // 1411: ldc2_w 385041577063464455
      // 1414: wide aload 354
      // 1418: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 141b: ldc2_w 123884418036416875
      // 141e: wide astore 356
      // 1422: ldc2_w 123884418036416875
      // 1425: wide aload 356
      // 1429: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 142c: checkcast javax/swing/JScrollPane
      // 142f: aload 7
      // 1431: invokevirtual javax/swing/JScrollPane.scrollRectToVisible (Ljava/awt/Rectangle;)V
      // 1434: aload 2
      // 1435: ifnull 1469
      // 1438: aload 0
      // 1439: ldc2_w 385041577063464455
      // 143c: wide astore 358
      // 1440: ldc2_w 385041577063464455
      // 1443: wide aload 358
      // 1447: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 144a: ldc2_w 369475678680292668
      // 144d: wide astore 360
      // 1451: ldc2_w 369475678680292668
      // 1454: wide aload 360
      // 1458: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 145b: checkcast org/jdesktop/swingx/JXList
      // 145e: goto 1465
      // 1461: invokestatic com/finalshell/ui/listener/XS.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 1464: athrow
      // 1465: bipush 0
      // 1466: invokevirtual org/jdesktop/swingx/JXList.setSelectedIndex (I)V
      // 1469: aload 0
      // 146a: ldc2_w 385041577063464455
      // 146d: wide astore 362
      // 1471: ldc2_w 385041577063464455
      // 1474: wide aload 362
      // 1478: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 147b: aload 1
      // 147c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 147f: ldc2_w 451698290930462362
      // 1482: wide astore 365
      // 1486: wide astore 364
      // 148a: ldc2_w 451698290930462362
      // 148d: wide aload 364
      // 1491: wide aload 365
      // 1495: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1498: pop
      // 1499: goto 14a0
      // 149c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 149f: athrow
      // 14a0: return
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24141;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3882419036546259550L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "\u0004ã\u0013ûu\u0085E¡l\u00000\u001cMI4¸]rå\u001fò¹ùf\u009dÖ\u0080*!\u001dñ´>©jê6\u0000¨\u009f\u000f>ð:óBº\u001d\u0082tÿiÎ²'¡¨Ü§»Sçô¹";
      int var5 = "\u0004ã\u0013ûu\u0085E¡l\u00000\u001cMI4¸]rå\u001fò¹ùf\u009dÖ\u0080*!\u001dñ´>©jê6\u0000¨\u009f\u000f>ð:óBº\u001d\u0082tÿiÎ²'¡¨Ü§»Sçô¹"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u008b,Ã\u0012\u008bÅK\u0002\u0010\u009b\u000eå!üø\u0016";
                  var5 = "\u008b,Ã\u0012\u008bÅK\u0002\u0010\u009b\u000eå!üø\u0016".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





