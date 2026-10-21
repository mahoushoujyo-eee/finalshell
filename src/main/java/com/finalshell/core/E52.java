package com.finalshell.core;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class E52 extends PlainDocument {
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
      // 0a: invokestatic com/finalshell/core/E52.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0d: athrow
      // 0e: aload 0
      // 0f: invokevirtual com/finalshell/core/E52.getLength ()I
      // 12: istore 5
      // 14: iload 5
      // 16: aload 2
      // 17: invokevirtual java/lang/String.length ()I
      // 1a: iadd
      // 1b: bipush 5
      // 1c: if_icmpgt 88
      // 1f: aload 0
      // 20: bipush 0
      // 21: iload 5
      // 23: invokevirtual com/finalshell/core/E52.getText (II)Ljava/lang/String;
      // 26: astore 6
      // 28: new java/lang/StringBuilder
      // 2b: dup
      // 2c: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f: aload 6
      // 31: bipush 0
      // 32: iload 1
      // 33: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39: aload 2
      // 3a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d: aload 6
      // 3f: iload 1
      // 40: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49: astore 7
      // 4b: aload 0
      // 4c: new java/lang/StringBuilder
      // 4f: dup
      // 50: invokespecial java/lang/StringBuilder.<init> ()V
      // 53: aload 7
      // 55: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58: ldc "0"
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 63: aload 4
      // 65: ifnonnull 7e
      // 68: invokevirtual com/finalshell/core/E52.e (I)Z
      // 6b: ifeq 83
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/E52.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 74: athrow
      // 75: aload 0
      // 76: iload 1
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/E52.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7d: athrow
      // 7e: aload 2
      // 7f: aload 3
      // 80: invokespecial javax/swing/text/PlainDocument.insertString (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
      // 83: goto 88
      // 86: astore 8
      // 88: return
   }

   protected boolean e(int var1) {
      return true;
   }

   public static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}





