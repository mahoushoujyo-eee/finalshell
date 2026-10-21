package com.finalshell.core;

import java.io.File;
import java.io.IOException;

public class Ja2 {
   public static long a;

   public static void M(File param0, File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/D52_2.k ()Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 3
      // 005: astore 2
      // 006: aconst_null
      // 007: astore 4
      // 009: new java/io/File
      // 00c: dup
      // 00d: aload 1
      // 00e: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 011: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 014: astore 5
      // 016: aload 5
      // 018: invokevirtual java/io/File.exists ()Z
      // 01b: aload 2
      // 01c: ifnonnull 03a
      // 01f: ifne 036
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 028: athrow
      // 029: aload 5
      // 02b: invokevirtual java/io/File.mkdirs ()Z
      // 02e: pop
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 035: athrow
      // 036: aload 1
      // 037: invokevirtual java/io/File.createNewFile ()Z
      // 03a: pop
      // 03b: new java/io/FileOutputStream
      // 03e: dup
      // 03f: aload 1
      // 040: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 043: astore 3
      // 044: new java/io/FileInputStream
      // 047: dup
      // 048: aload 0
      // 049: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 04c: astore 4
      // 04e: getstatic com/finalshell/core/Ja2.a J
      // 051: l2i
      // 052: newarray 8
      // 054: astore 6
      // 056: bipush 0
      // 057: istore 7
      // 059: aload 2
      // 05a: ifnull 06d
      // 05d: aload 3
      // 05e: aload 6
      // 060: bipush 0
      // 061: iload 7
      // 063: invokevirtual java/io/FileOutputStream.write ([BII)V
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 06c: athrow
      // 06d: aload 4
      // 06f: aload 6
      // 071: invokevirtual java/io/FileInputStream.read ([B)I
      // 074: dup
      // 075: istore 7
      // 077: bipush -1
      // 078: if_icmpne 05d
      // 07b: goto 0c4
      // 07e: astore 5
      // 080: aload 5
      // 082: athrow
      // 083: astore 8
      // 085: aload 3
      // 086: aload 2
      // 087: ifnonnull 095
      // 08a: ifnull 0a2
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 093: athrow
      // 094: aload 3
      // 095: invokevirtual java/io/FileOutputStream.close ()V
      // 098: goto 0a2
      // 09b: astore 9
      // 09d: aload 9
      // 09f: invokevirtual java/io/IOException.printStackTrace ()V
      // 0a2: aload 4
      // 0a4: aload 2
      // 0a5: ifnonnull 0b4
      // 0a8: ifnull 0c1
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b1: athrow
      // 0b2: aload 4
      // 0b4: invokevirtual java/io/FileInputStream.close ()V
      // 0b7: goto 0c1
      // 0ba: astore 9
      // 0bc: aload 9
      // 0be: invokevirtual java/io/IOException.printStackTrace ()V
      // 0c1: aload 8
      // 0c3: athrow
      // 0c4: aload 3
      // 0c5: aload 2
      // 0c6: ifnonnull 0d4
      // 0c9: ifnull 0e1
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d2: athrow
      // 0d3: aload 3
      // 0d4: invokevirtual java/io/FileOutputStream.close ()V
      // 0d7: goto 0e1
      // 0da: astore 9
      // 0dc: aload 9
      // 0de: invokevirtual java/io/IOException.printStackTrace ()V
      // 0e1: aload 4
      // 0e3: aload 2
      // 0e4: ifnonnull 0f3
      // 0e7: ifnull 100
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Ja2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f0: athrow
      // 0f1: aload 4
      // 0f3: invokevirtual java/io/FileInputStream.close ()V
      // 0f6: goto 100
      // 0f9: astore 9
      // 0fb: aload 9
      // 0fd: invokevirtual java/io/IOException.printStackTrace ()V
      // 100: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8671268578712264213L;
      long var10002 = 8155544737058065941L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





