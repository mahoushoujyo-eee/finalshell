package com.finalshell.core;

import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

public class Wf4 extends TransferHandler {
   public final BX N;
   public final com.finalshell.ui.panel.Hd2 I;
   public int g = -1;
   public At2 P = null;
   public static long[] a;
   public static Integer[] b;

   public Wf4(BX var1) {
      this.N = var1;
      this.I = var1.D();
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 2;
   }

   @Override
   public void exportAsDrag(JComponent var1, InputEvent var2, int var3) {
      String[] var4 = BX.B$arrString();
      int var10000 = (var2 instanceof MouseEvent) ? 1 : 0;
      if (var4 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var3;
      }

      if (var10000 == 2) {
         MouseEvent var5 = (MouseEvent)var2;
         int var6 = this.I.indexAtLocation(var5.getX(), var5.getY());
         if (var6 != -1) {
            At2 var7 = this.N.x(var6);
            if (var4 == null) {
               if (!var7.K()) {
                  return;
               }

               this.g = var6;
               this.P = var7;
               super.exportAsDrag(var1, var2, var3);
            }

            this.N.z$QL().u();
         }
      }
   }

   @Override
   public Transferable createTransferable(JComponent var1) {
      String[] var2 = BX.B$arrString();
      Wf4 var10000 = this;
      if (var2 == null) {
         if (this.P == null) {
            return null;
         }

         var10000 = this;
      }

      var10000.N.x(this.P);
      return new LL3(this.P);
   }

   @Override
   public void exportDone(JComponent var1, Transferable var2, int var3) {
      Wf4 var7;
      label25: {
         String[] var10000 = BX.B$arrString();
         com.finalshell.ui.panel.QL var5 = this.N.z$QL();
         String[] var4 = var10000;
         int var6 = (var5.V()) ? 1 : 0;
         if (var4 == null) {
            if (var6 == 0 && var5.c(this.P.B()) == null) {
               this.N.J(this.P, this.g);
               this.N.q$void(this.P);
            }

            var7 = this;
            if (var4 != null) {
               break label25;
            }

            var6 = this.N.o();
         }

         if (var6 == 0) {
            this.N.z$QL().Z(this.N);
         }

         this.g = -1;
         var7 = this;
      }

      var7.P = null;
   }

   @Override
   public boolean canImport(TransferSupport param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BX.B$arrString ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 08: getstatic com/finalshell/core/LL3.q Ljava/awt/datatransfer/DataFlavor;
      // 0b: aload 2
      // 0c: ifnonnull 2c
      // 0f: invokeinterface java/awt/datatransfer/Transferable.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z 2
      // 14: ifeq 3c
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 22: getstatic com/finalshell/core/LL3.q Ljava/awt/datatransfer/DataFlavor;
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 31: ifnull 3c
      // 34: bipush 1
      // 35: goto 3d
      // 38: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: ireturn
      // 3e: astore 3
      // 3f: aload 0
      // 40: aload 3
      // 41: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 44: bipush 0
      // 45: ireturn
   }

   @Override
   public boolean importData(TransferSupport param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/BX.B$arrString ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 008: getstatic com/finalshell/core/LL3.q Ljava/awt/datatransfer/DataFlavor;
      // 00b: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 010: astore 3
      // 011: aload 3
      // 012: checkcast com/finalshell/core/At2
      // 015: astore 4
      // 017: aload 1
      // 018: invokevirtual javax/swing/TransferHandler$TransferSupport.getDropLocation ()Ljavax/swing/TransferHandler$DropLocation;
      // 01b: invokevirtual javax/swing/TransferHandler$DropLocation.getDropPoint ()Ljava/awt/Point;
      // 01e: astore 5
      // 020: aload 1
      // 021: invokevirtual javax/swing/TransferHandler$TransferSupport.getComponent ()Ljava/awt/Component;
      // 024: checkcast com/finalshell/ui/panel/Hd2
      // 027: astore 6
      // 029: aload 6
      // 02b: aload 5
      // 02d: invokevirtual com/finalshell/ui/panel/Hd2.N (Ljava/awt/Point;)I
      // 030: istore 7
      // 032: iload 7
      // 034: aload 2
      // 035: ifnonnull 0a3
      // 038: bipush -1
      // 039: if_icmpeq 09b
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 6
      // 045: iload 7
      // 047: invokevirtual com/finalshell/ui/panel/Hd2.getBoundsAt (I)Ljava/awt/Rectangle;
      // 04a: astore 8
      // 04c: aload 5
      // 04e: getfield java/awt/Point.x I
      // 051: aload 8
      // 053: getfield java/awt/Rectangle.x I
      // 056: aload 8
      // 058: getfield java/awt/Rectangle.width I
      // 05b: bipush 2
      // 05c: idiv
      // 05d: iadd
      // 05e: aload 2
      // 05f: ifnonnull 078
      // 062: if_icmpge 075
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: iload 7
      // 06e: goto 079
      // 071: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: iload 7
      // 077: bipush 1
      // 078: iadd
      // 079: istore 9
      // 07b: aload 0
      // 07c: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 07f: aload 4
      // 081: iload 9
      // 083: invokevirtual com/finalshell/core/BX.J (Lcom/finalshell/core/At2;I)V
      // 086: aload 0
      // 087: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 08a: aload 4
      // 08c: invokevirtual com/finalshell/core/BX.q$void (Lcom/finalshell/core/At2;)V
      // 08f: aload 0
      // 090: aload 0
      // 091: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 094: invokevirtual com/finalshell/core/Wf4.e (Lcom/finalshell/core/BX;)V
      // 097: aload 2
      // 098: ifnull 25b
      // 09b: bipush -1
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: istore 8
      // 0a5: aload 0
      // 0a6: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 0a9: invokevirtual com/finalshell/core/BX.z$QL ()Lcom/finalshell/ui/panel/QL;
      // 0ac: invokevirtual com/finalshell/ui/panel/QL.X ()Z
      // 0af: aload 2
      // 0b0: ifnonnull 211
      // 0b3: ifeq 20f
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 6
      // 0bf: invokevirtual com/finalshell/ui/panel/Hd2.getTabCount ()I
      // 0c2: aload 2
      // 0c3: ifnonnull 211
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: ifle 20f
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 6
      // 0d9: invokevirtual com/finalshell/ui/panel/Hd2.getTabPlacement ()I
      // 0dc: istore 9
      // 0de: aload 6
      // 0e0: invokevirtual com/finalshell/ui/panel/Hd2.getWidth ()I
      // 0e3: istore 10
      // 0e5: aload 6
      // 0e7: invokevirtual com/finalshell/ui/panel/Hd2.getHeight ()I
      // 0ea: istore 11
      // 0ec: iload 9
      // 0ee: bipush 1
      // 0ef: aload 2
      // 0f0: ifnonnull 135
      // 0f3: if_icmpeq 12b
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: new java/awt/Rectangle
      // 100: dup
      // 101: bipush 0
      // 102: bipush 0
      // 103: iload 10
      // 105: sipush 1079
      // 108: ldc2_w 5403612209355369773
      // 10b: invokestatic com/finalshell/core/Wf4.a (IJ)I
      // 10e: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 111: aload 5
      // 113: invokevirtual java/awt/Rectangle.contains (Ljava/awt/Point;)Z
      // 116: aload 2
      // 117: ifnonnull 134
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: ifeq 12b
      // 124: bipush 1
      // 125: istore 8
      // 127: aload 2
      // 128: ifnull 20f
      // 12b: iload 9
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 133: athrow
      // 134: bipush 3
      // 135: aload 2
      // 136: ifnonnull 186
      // 139: if_icmpeq 17c
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: new java/awt/Rectangle
      // 146: dup
      // 147: bipush 0
      // 148: iload 11
      // 14a: sipush 10401
      // 14d: ldc2_w 5928364134527926714
      // 150: invokestatic com/finalshell/core/Wf4.a (IJ)I
      // 153: isub
      // 154: iload 10
      // 156: sipush 10401
      // 159: ldc2_w 5928364134527926714
      // 15c: invokestatic com/finalshell/core/Wf4.a (IJ)I
      // 15f: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 162: aload 5
      // 164: invokevirtual java/awt/Rectangle.contains (Ljava/awt/Point;)Z
      // 167: aload 2
      // 168: ifnonnull 185
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: ifeq 17c
      // 175: bipush 3
      // 176: istore 8
      // 178: aload 2
      // 179: ifnull 20f
      // 17c: iload 9
      // 17e: goto 185
      // 181: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 184: athrow
      // 185: bipush 2
      // 186: aload 2
      // 187: ifnonnull 1cc
      // 18a: if_icmpeq 1c2
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: new java/awt/Rectangle
      // 197: dup
      // 198: bipush 0
      // 199: bipush 0
      // 19a: sipush 10401
      // 19d: ldc2_w 5928364134527926714
      // 1a0: invokestatic com/finalshell/core/Wf4.a (IJ)I
      // 1a3: iload 11
      // 1a5: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 1a8: aload 5
      // 1aa: invokevirtual java/awt/Rectangle.contains (Ljava/awt/Point;)Z
      // 1ad: aload 2
      // 1ae: ifnonnull 1cb
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: ifeq 1c2
      // 1bb: bipush 2
      // 1bc: istore 8
      // 1be: aload 2
      // 1bf: ifnull 20f
      // 1c2: iload 9
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: bipush 4
      // 1cc: aload 2
      // 1cd: ifnonnull 212
      // 1d0: if_icmpeq 20f
      // 1d3: goto 1da
      // 1d6: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d9: athrow
      // 1da: new java/awt/Rectangle
      // 1dd: dup
      // 1de: iload 10
      // 1e0: sipush 10401
      // 1e3: ldc2_w 5928364134527926714
      // 1e6: invokestatic com/finalshell/core/Wf4.a (IJ)I
      // 1e9: isub
      // 1ea: bipush 0
      // 1eb: sipush 10401
      // 1ee: ldc2_w 5928364134527926714
      // 1f1: invokestatic com/finalshell/core/Wf4.a (IJ)I
      // 1f4: iload 11
      // 1f6: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 1f9: aload 5
      // 1fb: invokevirtual java/awt/Rectangle.contains (Ljava/awt/Point;)Z
      // 1fe: aload 2
      // 1ff: ifnonnull 211
      // 202: goto 209
      // 205: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: ifeq 20f
      // 20c: bipush 4
      // 20d: istore 8
      // 20f: iload 8
      // 211: bipush -1
      // 212: if_icmpeq 23a
      // 215: aload 0
      // 216: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 219: invokevirtual com/finalshell/core/BX.z$QL ()Lcom/finalshell/ui/panel/QL;
      // 21c: aload 0
      // 21d: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 220: aload 4
      // 222: iload 8
      // 224: invokevirtual com/finalshell/ui/panel/QL.e (Lcom/finalshell/core/BX;Lcom/finalshell/core/At2;I)Lcom/finalshell/core/BX;
      // 227: astore 9
      // 229: aload 9
      // 22b: aload 4
      // 22d: invokevirtual com/finalshell/core/BX.q$void (Lcom/finalshell/core/At2;)V
      // 230: aload 0
      // 231: aload 9
      // 233: invokevirtual com/finalshell/core/Wf4.e (Lcom/finalshell/core/BX;)V
      // 236: aload 2
      // 237: ifnull 25b
      // 23a: aload 0
      // 23b: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 23e: aload 4
      // 240: invokevirtual com/finalshell/core/BX.O (Lcom/finalshell/core/At2;)V
      // 243: aload 0
      // 244: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 247: aload 4
      // 249: invokevirtual com/finalshell/core/BX.q$void (Lcom/finalshell/core/At2;)V
      // 24c: aload 0
      // 24d: aload 0
      // 24e: getfield com/finalshell/core/Wf4.N Lcom/finalshell/core/BX;
      // 251: invokevirtual com/finalshell/core/Wf4.e (Lcom/finalshell/core/BX;)V
      // 254: goto 25b
      // 257: invokestatic com/finalshell/core/Wf4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: bipush 1
      // 25c: ireturn
      // 25d: astore 3
      // 25e: aload 0
      // 25f: aload 3
      // 260: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 263: bipush 0
      // 264: ireturn
   }

   public void e(BX var1) {
      SwingUtilities.invokeLater(new com.finalshell.task.Hu2(this, var1));
   }

   public static void V(BX var0) {
      com.finalshell.ui.panel.Hd2 var1 = var0.D();
      com.finalshell.ui.listener.Ao2 var2 = new com.finalshell.ui.listener.Ao2(var0, var1);
      var1.addMouseListener(var2);
      var1.addMouseMotionListener(var2);
      var1.setTransferHandler(new Wf4(var0));
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10523;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5516352564975145700L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ol\u009e\u009e\u0012\u009c\u0093vè?\u008e\u0013\u0091¿¿á";
      int var5 = "Ol\u009e\u009e\u0012\u009c\u0093vè?\u008e\u0013\u0091¿¿á".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





