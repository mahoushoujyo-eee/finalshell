package com;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ke_4 extends PlainDocument {
   private int T;

   public ke_4(int var1) {
      this.T = var1;
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
      // 00: invokestatic com/Cn_2.Q ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 2
      // 06: ifnonnull 0e
      // 09: return
      // 0a: invokestatic com/ke_4.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0d: athrow
      // 0e: aload 0
      // 0f: aload 4
      // 11: ifnull 32
      // 14: invokevirtual com/ke_4.getLength ()I
      // 17: aload 2
      // 18: invokevirtual java/lang/String.length ()I
      // 1b: iadd
      // 1c: aload 0
      // 1d: getfield com/ke_4.T I
      // 20: if_icmpgt 38
      // 23: goto 2a
      // 26: invokestatic com/ke_4.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 32
      // 2e: invokestatic com/ke_4.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 31: athrow
      // 32: iload 1
      // 33: aload 2
      // 34: aload 3
      // 35: invokespecial javax/swing/text/PlainDocument.insertString (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
      // 38: return
   }

   private static BadLocationException a(BadLocationException var0) {
      return var0;
   }
}





