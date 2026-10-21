package com.finalshell.core;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class OA3 extends PlainDocument {
   public final int Z;
   public final boolean H;

   public OA3() {
      this.Z = 0;
      this.H = false;
   }

   public OA3(int var1) {
      this.Z = var1;
      this.H = false;
   }

   public OA3(int var1, boolean var2) {
      this.Z = var1;
      this.H = var2;
   }

   public int r() {
      return this.Z;
   }

   public boolean V() {
      return this.H;
   }

   @Override
   public void insertString(int param1, String param2, AttributeSet param3) throws BadLocationException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/WC_2.V ()[I
      // 03: astore 4
      // 05: aload 2
      // 06: ifnonnull 0e
      // 09: return
      // 0a: invokestatic com/finalshell/core/OA3.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d: athrow
      // 0e: aload 0
      // 0f: invokevirtual com/finalshell/core/OA3.r ()I
      // 12: aload 4
      // 14: ifnonnull 31
      // 17: ifle 6a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/OA3.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual com/finalshell/core/OA3.getLength ()I
      // 25: aload 2
      // 26: invokevirtual java/lang/String.length ()I
      // 29: iadd
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/OA3.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 30: athrow
      // 31: aload 4
      // 33: ifnonnull 5b
      // 36: aload 0
      // 37: invokevirtual com/finalshell/core/OA3.r ()I
      // 3a: if_icmpgt 6a
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/OA3.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 43: athrow
      // 44: aload 0
      // 45: aload 4
      // 47: ifnonnull 64
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/OA3.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 50: athrow
      // 51: invokevirtual com/finalshell/core/OA3.V ()Z
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/OA3.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 5a: athrow
      // 5b: ifeq 63
      // 5e: aload 2
      // 5f: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 62: astore 2
      // 63: aload 0
      // 64: iload 1
      // 65: aload 2
      // 66: aload 3
      // 67: invokespecial javax/swing/text/PlainDocument.insertString (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
      // 6a: return
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }
}





