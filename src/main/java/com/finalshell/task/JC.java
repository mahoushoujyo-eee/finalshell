package com.finalshell.task;

public class JC implements Runnable {
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
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 007: aload 0
      // 008: ldc2_w 185597772799427172
      // 00b: astore 4
      // 00d: ldc2_w 185597772799427172
      // 010: aload 4
      // 012: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 015: checkcast java/lang/String
      // 018: aload 0
      // 019: ldc2_w 277030627230132155
      // 01c: astore 6
      // 01e: ldc2_w 277030627230132155
      // 021: aload 6
      // 023: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 026: checkcast java/lang/String
      // 029: invokestatic com/sun/jna/platform/win32/Advapi32Util.registryValueExists (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;)Z
      // 02c: istore 2
      // 02d: aload 0
      // 02e: ldc2_w 469365993697885048
      // 031: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 034: swap
      // 035: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 038: aload 1
      // 039: ifnull 122
      // 03c: ifeq 11a
      // 03f: goto 046
      // 042: invokestatic com/finalshell/task/JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: iload 2
      // 047: ifne 095
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/task/JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 054: aload 0
      // 055: ldc2_w 185597772799427172
      // 058: astore 8
      // 05a: ldc2_w 185597772799427172
      // 05d: aload 8
      // 05f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 062: checkcast java/lang/String
      // 065: aload 0
      // 066: ldc2_w 277030627230132155
      // 069: astore 10
      // 06b: ldc2_w 277030627230132155
      // 06e: aload 10
      // 070: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 073: checkcast java/lang/String
      // 076: aload 0
      // 077: ldc2_w 336914095224314325
      // 07a: astore 12
      // 07c: ldc2_w 336914095224314325
      // 07f: aload 12
      // 081: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 084: checkcast java/lang/String
      // 087: invokestatic com/sun/jna/platform/win32/Advapi32Util.registrySetStringValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 08a: aload 1
      // 08b: ifnonnull 154
      // 08e: goto 095
      // 091: invokestatic com/finalshell/task/JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 098: aload 0
      // 099: ldc2_w 185597772799427172
      // 09c: astore 14
      // 09e: ldc2_w 185597772799427172
      // 0a1: aload 14
      // 0a3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a6: checkcast java/lang/String
      // 0a9: aload 0
      // 0aa: ldc2_w 277030627230132155
      // 0ad: astore 16
      // 0af: ldc2_w 277030627230132155
      // 0b2: aload 16
      // 0b4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b7: checkcast java/lang/String
      // 0ba: invokestatic com/sun/jna/platform/win32/Advapi32Util.registryGetStringValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0bd: astore 3
      // 0be: aload 3
      // 0bf: aload 0
      // 0c0: ldc2_w 336914095224314325
      // 0c3: astore 18
      // 0c5: ldc2_w 336914095224314325
      // 0c8: aload 18
      // 0ca: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cd: checkcast java/lang/String
      // 0d0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d3: ifne 116
      // 0d6: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 0d9: aload 0
      // 0da: ldc2_w 185597772799427172
      // 0dd: astore 20
      // 0df: ldc2_w 185597772799427172
      // 0e2: aload 20
      // 0e4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e7: checkcast java/lang/String
      // 0ea: aload 0
      // 0eb: ldc2_w 277030627230132155
      // 0ee: astore 22
      // 0f0: ldc2_w 277030627230132155
      // 0f3: aload 22
      // 0f5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f8: checkcast java/lang/String
      // 0fb: aload 0
      // 0fc: ldc2_w 336914095224314325
      // 0ff: astore 24
      // 101: ldc2_w 336914095224314325
      // 104: aload 24
      // 106: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 109: checkcast java/lang/String
      // 10c: invokestatic com/sun/jna/platform/win32/Advapi32Util.registrySetStringValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 10f: goto 116
      // 112: invokestatic com/finalshell/task/JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 1
      // 117: ifnonnull 154
      // 11a: iload 2
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/task/JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: ifeq 154
      // 125: getstatic com/sun/jna/platform/win32/WinReg.HKEY_CURRENT_USER Lcom/sun/jna/platform/win32/WinReg$HKEY;
      // 128: aload 0
      // 129: ldc2_w 185597772799427172
      // 12c: astore 26
      // 12e: ldc2_w 185597772799427172
      // 131: aload 26
      // 133: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 136: checkcast java/lang/String
      // 139: aload 0
      // 13a: ldc2_w 277030627230132155
      // 13d: astore 28
      // 13f: ldc2_w 277030627230132155
      // 142: aload 28
      // 144: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 147: checkcast java/lang/String
      // 14a: invokestatic com/sun/jna/platform/win32/Advapi32Util.registryDeleteValue (Lcom/sun/jna/platform/win32/WinReg$HKEY;Ljava/lang/String;Ljava/lang/String;)V
      // 14d: goto 154
      // 150: invokestatic com/finalshell/task/JC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: goto 15c
      // 157: astore 2
      // 158: aload 2
      // 159: invokevirtual java/lang/Exception.printStackTrace ()V
      // 15c: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





