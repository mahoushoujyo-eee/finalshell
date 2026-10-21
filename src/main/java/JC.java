class JC implements Runnable {
   final String O;
   final String y;
   final boolean T;
   final String J;

   JC(String var1, String var2, boolean var3, String var4) {
      this.O = var1;
      this.y = var2;
      this.T = var3;
      this.J = var4;
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
      // 000: invokestatic yT_3.c ()[Lcom/ky_4;
      // 003: astore 1
      // 004: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 007: aload 0
      // 008: ldc2_w 185597772799427172
      // 00b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00e: swap
      // 00f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast java/lang/String
      // 015: aload 0
      // 016: ldc2_w 277030627230132155
      // 019: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 01c: swap
      // 01d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 020: checkcast java/lang/String
      // 023: invokestatic com/sun/jna/platform/win32/Advapi32Util.registryValueExists (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;)Z
      // 026: istore 2
      // 027: aload 0
      // 028: ldc2_w 469365993697885048
      // 02b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 02e: swap
      // 02f: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 032: aload 1
      // 033: ifnull 101
      // 036: ifeq 0f9
      // 039: goto 040
      // 03c: invokestatic JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: iload 2
      // 041: ifne 086
      // 044: goto 04b
      // 047: invokestatic JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 04e: aload 0
      // 04f: ldc2_w 185597772799427172
      // 052: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 055: swap
      // 056: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 059: checkcast java/lang/String
      // 05c: aload 0
      // 05d: ldc2_w 277030627230132155
      // 060: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 063: swap
      // 064: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 067: checkcast java/lang/String
      // 06a: aload 0
      // 06b: ldc2_w 336914095224314325
      // 06e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 071: swap
      // 072: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 075: checkcast java/lang/String
      // 078: invokestatic com/sun/jna/platform/win32/Advapi32Util.registrySetStringValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 07b: aload 1
      // 07c: ifnonnull 12d
      // 07f: goto 086
      // 082: invokestatic JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 089: aload 0
      // 08a: ldc2_w 185597772799427172
      // 08d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 090: swap
      // 091: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 094: checkcast java/lang/String
      // 097: aload 0
      // 098: ldc2_w 277030627230132155
      // 09b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 09e: swap
      // 09f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a2: checkcast java/lang/String
      // 0a5: invokestatic com/sun/jna/platform/win32/Advapi32Util.registryGetStringValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0a8: astore 3
      // 0a9: aload 3
      // 0aa: aload 0
      // 0ab: ldc2_w 336914095224314325
      // 0ae: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0b1: swap
      // 0b2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b5: checkcast java/lang/String
      // 0b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bb: ifne 0f5
      // 0be: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 0c1: aload 0
      // 0c2: ldc2_w 185597772799427172
      // 0c5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c8: swap
      // 0c9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0cc: checkcast java/lang/String
      // 0cf: aload 0
      // 0d0: ldc2_w 277030627230132155
      // 0d3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0d6: swap
      // 0d7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0da: checkcast java/lang/String
      // 0dd: aload 0
      // 0de: ldc2_w 336914095224314325
      // 0e1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0e4: swap
      // 0e5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e8: checkcast java/lang/String
      // 0eb: invokestatic com/sun/jna/platform/win32/Advapi32Util.registrySetStringValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0ee: goto 0f5
      // 0f1: invokestatic JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aload 1
      // 0f6: ifnonnull 12d
      // 0f9: iload 2
      // 0fa: goto 101
      // 0fd: invokestatic JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: ifeq 12d
      // 104: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 107: aload 0
      // 108: ldc2_w 185597772799427172
      // 10b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 10e: swap
      // 10f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 112: checkcast java/lang/String
      // 115: aload 0
      // 116: ldc2_w 277030627230132155
      // 119: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 11c: swap
      // 11d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 120: checkcast java/lang/String
      // 123: invokestatic com/sun/jna/platform/win32/Advapi32Util.registryDeleteValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;)V
      // 126: goto 12d
      // 129: invokestatic JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: goto 135
      // 130: astore 2
      // 131: aload 2
      // 132: invokevirtual java/lang/Exception.printStackTrace ()V
      // 135: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





