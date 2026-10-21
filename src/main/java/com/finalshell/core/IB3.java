package com.finalshell.core;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;

public class IB3 implements Db2 {
   public final User32 h;
   public final Kernel32 d;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;
   public static long[] f;
   public static Long[] g;

   public IB3() throws C_Y {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: istore 1
      // 08: iload 1
      // 09: ifne 53
      // 0c: sipush 4699
      // 0f: sipush -1087
      // 12: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 15: ldc ""
      // 17: invokestatic com/finalshell/core/E8.V (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 1a: sipush 4689
      // 1d: sipush 7955
      // 20: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 23: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 26: ifne 45
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: new com/finalshell/core/C_Y
      // 33: dup
      // 34: sipush 4700
      // 37: sipush -31459
      // 3a: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 3d: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 40: athrow
      // 41: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: getstatic com/sun/jna/platform/win32/User32.INSTANCE Lcom/sun/jna/platform/win32/User32;
      // 49: putfield com/finalshell/core/IB3.h Lcom/sun/jna/platform/win32/User32;
      // 4c: aload 0
      // 4d: getstatic com/sun/jna/platform/win32/Kernel32.INSTANCE Lcom/sun/jna/platform/win32/Kernel32;
      // 50: putfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 53: goto 64
      // 56: astore 2
      // 57: new com/finalshell/core/C_Y
      // 5a: dup
      // 5b: aload 2
      // 5c: invokevirtual java/lang/LinkageError.toString ()Ljava/lang/String;
      // 5f: aload 2
      // 60: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 63: athrow
      // 64: return
   }

   @Override
   public String B() {
      return a(4692, 15263);
   }

   @Override
   public boolean x() {
      return this.h.FindWindow(a(4701, 10894), a(4694, 12740)) != null;
   }

   @Override
   public void Z(UJ param1) throws C_Y {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual com/finalshell/core/UJ.P ()I
      // 008: sipush 15310
      // 00b: ldc2_w 8167174058287312919
      // 00e: invokestatic com/finalshell/core/IB3.a (IJ)I
      // 011: if_icmple 029
      // 014: new com/finalshell/core/C_Y
      // 017: dup
      // 018: sipush 4702
      // 01b: sipush -8549
      // 01e: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 021: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 024: athrow
      // 025: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield com/finalshell/core/IB3.h Lcom/sun/jna/platform/win32/User32;
      // 02d: sipush 4694
      // 030: sipush 12740
      // 033: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 036: sipush 4694
      // 039: sipush 12740
      // 03c: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 03f: invokeinterface com/sun/jna/platform/win32/User32.FindWindow (Ljava/lang/String;Ljava/lang/String;)Lcom/sun/jna/platform/win32/WinDef$HWND; 3
      // 044: astore 3
      // 045: aload 3
      // 046: ifnonnull 05e
      // 049: new com/finalshell/core/C_Y
      // 04c: dup
      // 04d: sipush 4696
      // 050: sipush -5290
      // 053: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 056: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 059: athrow
      // 05a: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: sipush 4688
      // 061: sipush 31953
      // 064: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 067: bipush 1
      // 068: anewarray 4
      // 06b: dup
      // 06c: bipush 0
      // 06d: aload 0
      // 06e: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 071: invokeinterface com/sun/jna/platform/win32/Kernel32.GetCurrentThreadId ()I 1
      // 076: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 079: aastore
      // 07a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 07d: astore 4
      // 07f: aconst_null
      // 080: astore 5
      // 082: aconst_null
      // 083: astore 6
      // 085: aconst_null
      // 086: astore 7
      // 088: aload 0
      // 089: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 08c: getstatic com/sun/jna/platform/win32/WinBase.INVALID_HANDLE_VALUE Lcom/sun/jna/platform/win32/WinNT$HANDLE;
      // 08f: aload 7
      // 091: bipush 4
      // 092: bipush 0
      // 093: sipush 19280
      // 096: ldc2_w 4701741163533648008
      // 099: invokestatic com/finalshell/core/IB3.a (IJ)I
      // 09c: aload 4
      // 09e: invokeinterface com/sun/jna/platform/win32/Kernel32.CreateFileMapping (Lcom/sun/jna/platform/win32/WinNT$HANDLE;Lcom/sun/jna/platform/win32/WinBase$SECURITY_ATTRIBUTES;IIILjava/lang/String;)Lcom/sun/jna/platform/win32/WinNT$HANDLE; 7
      // 0a3: astore 5
      // 0a5: aload 5
      // 0a7: iload 2
      // 0a8: ifne 0b7
      // 0ab: ifnull 0bd
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: aload 5
      // 0b7: getstatic com/sun/jna/platform/win32/WinBase.INVALID_HANDLE_VALUE Lcom/sun/jna/platform/win32/WinNT$HANDLE;
      // 0ba: if_acmpne 0d2
      // 0bd: new com/finalshell/core/C_Y
      // 0c0: dup
      // 0c1: sipush 4695
      // 0c4: sipush -24469
      // 0c7: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 0ca: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 0cd: athrow
      // 0ce: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 0d6: aload 5
      // 0d8: bipush 2
      // 0d9: bipush 0
      // 0da: bipush 0
      // 0db: bipush 0
      // 0dc: invokeinterface com/sun/jna/platform/win32/Kernel32.MapViewOfFile (Lcom/sun/jna/platform/win32/WinNT$HANDLE;IIII)Lcom/sun/jna/Pointer; 6
      // 0e1: astore 6
      // 0e3: aload 6
      // 0e5: iload 2
      // 0e6: ifne 10a
      // 0e9: ifnonnull 108
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: new com/finalshell/core/C_Y
      // 0f6: dup
      // 0f7: sipush 4703
      // 0fa: sipush -9221
      // 0fd: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 100: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 103: athrow
      // 104: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 6
      // 10a: lconst_0
      // 10b: aload 1
      // 10c: getfield com/finalshell/core/UJ.g [B
      // 10f: bipush 0
      // 110: aload 1
      // 111: invokevirtual com/finalshell/core/UJ.P ()I
      // 114: invokevirtual com/sun/jna/Pointer.write (J[BII)V
      // 117: aload 4
      // 119: invokestatic com/finalshell/core/IB3.u (Ljava/lang/String;)Lcom/sun/jna/platform/win32/WinUser$COPYDATASTRUCT;
      // 11c: astore 8
      // 11e: aload 0
      // 11f: aload 3
      // 120: aload 8
      // 122: invokevirtual com/finalshell/core/IB3.Z (Lcom/sun/jna/platform/win32/WinDef$HWND;Lcom/sun/jna/platform/win32/WinUser$COPYDATASTRUCT;)J
      // 125: lstore 9
      // 127: aload 8
      // 129: getfield com/sun/jna/platform/win32/WinUser$COPYDATASTRUCT.dwData Lcom/sun/jna/platform/win32/BaseTSD$ULONG_PTR;
      // 12c: invokevirtual com/sun/jna/platform/win32/BaseTSD$ULONG_PTR.longValue ()J
      // 12f: lstore 11
      // 131: aload 1
      // 132: invokevirtual com/finalshell/core/UJ.a ()V
      // 135: lload 9
      // 137: lconst_0
      // 138: lcmp
      // 139: iload 2
      // 13a: ifne 15e
      // 13d: ifeq 1c8
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: aload 6
      // 149: lconst_0
      // 14a: aload 1
      // 14b: getfield com/finalshell/core/UJ.g [B
      // 14e: bipush 0
      // 14f: bipush 4
      // 150: invokevirtual com/sun/jna/Pointer.read (J[BII)V
      // 153: aload 1
      // 154: invokevirtual com/finalshell/core/UJ.d ()I
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: istore 13
      // 160: iload 13
      // 162: iload 2
      // 163: ifne 172
      // 166: ifle 17e
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: iload 13
      // 172: sipush 24136
      // 175: ldc2_w 8962438291225073042
      // 178: invokestatic com/finalshell/core/IB3.a (IJ)I
      // 17b: if_icmple 1a5
      // 17e: new com/finalshell/core/C_Y
      // 181: dup
      // 182: new java/lang/StringBuilder
      // 185: dup
      // 186: invokespecial java/lang/StringBuilder.<init> ()V
      // 189: sipush 4693
      // 18c: sipush 25612
      // 18f: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 195: iload 13
      // 197: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 19a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19d: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 1a0: athrow
      // 1a1: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: aload 1
      // 1a6: invokevirtual com/finalshell/core/UJ.a ()V
      // 1a9: aload 1
      // 1aa: iload 13
      // 1ac: invokevirtual com/finalshell/core/UJ.X (I)V
      // 1af: aload 6
      // 1b1: sipush 22578
      // 1b4: ldc2_w 1709190237613560372
      // 1b7: invokestatic com/finalshell/core/IB3.b (IJ)J
      // 1ba: aload 1
      // 1bb: getfield com/finalshell/core/UJ.g [B
      // 1be: bipush 0
      // 1bf: iload 13
      // 1c1: invokevirtual com/sun/jna/Pointer.read (J[BII)V
      // 1c4: iload 2
      // 1c5: ifeq 1f2
      // 1c8: new com/finalshell/core/C_Y
      // 1cb: dup
      // 1cc: new java/lang/StringBuilder
      // 1cf: dup
      // 1d0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d3: sipush 4697
      // 1d6: sipush -12232
      // 1d9: invokestatic com/finalshell/core/IB3.a (II)Ljava/lang/String;
      // 1dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1df: lload 11
      // 1e1: invokestatic java/lang/Long.toHexString (J)Ljava/lang/String;
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ea: invokespecial com/finalshell/core/C_Y.<init> (Ljava/lang/String;)V
      // 1ed: athrow
      // 1ee: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: aload 6
      // 1f4: ifnull 20a
      // 1f7: aload 0
      // 1f8: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 1fb: aload 6
      // 1fd: invokeinterface com/sun/jna/platform/win32/Kernel32.UnmapViewOfFile (Lcom/sun/jna/Pointer;)Z 2
      // 202: pop
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: aload 5
      // 20c: ifnull 257
      // 20f: aload 0
      // 210: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 213: aload 5
      // 215: invokeinterface com/sun/jna/platform/win32/Kernel32.CloseHandle (Lcom/sun/jna/platform/win32/WinNT$HANDLE;)Z 2
      // 21a: pop
      // 21b: goto 257
      // 21e: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: astore 14
      // 224: aload 6
      // 226: ifnull 23c
      // 229: aload 0
      // 22a: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 22d: aload 6
      // 22f: invokeinterface com/sun/jna/platform/win32/Kernel32.UnmapViewOfFile (Lcom/sun/jna/Pointer;)Z 2
      // 234: pop
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23b: athrow
      // 23c: aload 5
      // 23e: ifnull 254
      // 241: aload 0
      // 242: getfield com/finalshell/core/IB3.d Lcom/sun/jna/platform/win32/Kernel32;
      // 245: aload 5
      // 247: invokeinterface com/sun/jna/platform/win32/Kernel32.CloseHandle (Lcom/sun/jna/platform/win32/WinNT$HANDLE;)Z 2
      // 24c: pop
      // 24d: goto 254
      // 250: invokestatic com/finalshell/core/IB3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: aload 14
      // 256: athrow
      // 257: return
   }

   public static WinUser.COPYDATASTRUCT u(String var0) {
      Memory var1 = new Memory((long)(var0.length() + 1));
      var1.setString(0L, var0, a(4698, -15794));
      WinUser.COPYDATASTRUCT var2 = new WinUser.COPYDATASTRUCT();
      var2.dwData = new BaseTSD.ULONG_PTR(b(15321, 1005935216389583326L));
      var2.cbData = (int)var1.size();
      var2.lpData = var1;
      var2.write();
      return var2;
   }

   public long Z(WinDef.HWND var1, WinUser.COPYDATASTRUCT var2) {
      WinDef.LPARAM var3 = new WinDef.LPARAM(Pointer.nativeValue(var2.getPointer()));
      WinDef.LRESULT var4 = this.h.SendMessage(var1, a(31717, 3260472462419095614L), null, var3);
      return var4.longValue();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 4701) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 18;
               break;
            case 1:
               var10000 = 204;
               break;
            case 2:
               var10000 = 249;
               break;
            case 3:
               var10000 = 229;
               break;
            case 4:
               var10000 = 159;
               break;
            case 5:
               var10000 = 219;
               break;
            case 6:
               var10000 = 124;
               break;
            case 7:
               var10000 = 7;
               break;
            case 8:
               var10000 = 233;
               break;
            case 9:
               var10000 = 230;
               break;
            case 10:
               var10000 = 57;
               break;
            case 11:
               var10000 = 132;
               break;
            case 12:
               var10000 = 80;
               break;
            case 13:
               var10000 = 34;
               break;
            case 14:
               var10000 = 113;
               break;
            case 15:
               var10000 = 206;
               break;
            case 16:
               var10000 = 246;
               break;
            case 17:
               var10000 = 227;
               break;
            case 18:
               var10000 = 96;
               break;
            case 19:
               var10000 = 184;
               break;
            case 20:
               var10000 = 157;
               break;
            case 21:
               var10000 = 176;
               break;
            case 22:
               var10000 = 70;
               break;
            case 23:
               var10000 = 235;
               break;
            case 24:
               var10000 = 216;
               break;
            case 25:
               var10000 = 49;
               break;
            case 26:
               var10000 = 87;
               break;
            case 27:
               var10000 = 185;
               break;
            case 28:
               var10000 = 156;
               break;
            case 29:
               var10000 = 234;
               break;
            case 30:
               var10000 = 0;
               break;
            case 31:
               var10000 = 93;
               break;
            case 32:
               var10000 = 134;
               break;
            case 33:
               var10000 = 253;
               break;
            case 34:
               var10000 = 155;
               break;
            case 35:
               var10000 = 168;
               break;
            case 36:
               var10000 = 48;
               break;
            case 37:
               var10000 = 95;
               break;
            case 38:
               var10000 = 236;
               break;
            case 39:
               var10000 = 138;
               break;
            case 40:
               var10000 = 148;
               break;
            case 41:
               var10000 = 210;
               break;
            case 42:
               var10000 = 251;
               break;
            case 43:
               var10000 = 75;
               break;
            case 44:
               var10000 = 11;
               break;
            case 45:
               var10000 = 88;
               break;
            case 46:
               var10000 = 165;
               break;
            case 47:
               var10000 = 43;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 52;
               break;
            case 50:
               var10000 = 217;
               break;
            case 51:
               var10000 = 146;
               break;
            case 52:
               var10000 = 39;
               break;
            case 53:
               var10000 = 67;
               break;
            case 54:
               var10000 = 149;
               break;
            case 55:
               var10000 = 239;
               break;
            case 56:
               var10000 = 133;
               break;
            case 57:
               var10000 = 76;
               break;
            case 58:
               var10000 = 207;
               break;
            case 59:
               var10000 = 244;
               break;
            case 60:
               var10000 = 64;
               break;
            case 61:
               var10000 = 29;
               break;
            case 62:
               var10000 = 107;
               break;
            case 63:
               var10000 = 189;
               break;
            case 64:
               var10000 = 228;
               break;
            case 65:
               var10000 = 248;
               break;
            case 66:
               var10000 = 100;
               break;
            case 67:
               var10000 = 108;
               break;
            case 68:
               var10000 = 167;
               break;
            case 69:
               var10000 = 139;
               break;
            case 70:
               var10000 = 178;
               break;
            case 71:
               var10000 = 223;
               break;
            case 72:
               var10000 = 190;
               break;
            case 73:
               var10000 = 142;
               break;
            case 74:
               var10000 = 242;
               break;
            case 75:
               var10000 = 129;
               break;
            case 76:
               var10000 = 131;
               break;
            case 77:
               var10000 = 199;
               break;
            case 78:
               var10000 = 28;
               break;
            case 79:
               var10000 = 1;
               break;
            case 80:
               var10000 = 65;
               break;
            case 81:
               var10000 = 143;
               break;
            case 82:
               var10000 = 163;
               break;
            case 83:
               var10000 = 90;
               break;
            case 84:
               var10000 = 194;
               break;
            case 85:
               var10000 = 128;
               break;
            case 86:
               var10000 = 136;
               break;
            case 87:
               var10000 = 25;
               break;
            case 88:
               var10000 = 174;
               break;
            case 89:
               var10000 = 161;
               break;
            case 90:
               var10000 = 127;
               break;
            case 91:
               var10000 = 173;
               break;
            case 92:
               var10000 = 115;
               break;
            case 93:
               var10000 = 66;
               break;
            case 94:
               var10000 = 147;
               break;
            case 95:
               var10000 = 175;
               break;
            case 96:
               var10000 = 225;
               break;
            case 97:
               var10000 = 192;
               break;
            case 98:
               var10000 = 205;
               break;
            case 99:
               var10000 = 2;
               break;
            case 100:
               var10000 = 61;
               break;
            case 101:
               var10000 = 125;
               break;
            case 102:
               var10000 = 9;
               break;
            case 103:
               var10000 = 77;
               break;
            case 104:
               var10000 = 238;
               break;
            case 105:
               var10000 = 111;
               break;
            case 106:
               var10000 = 162;
               break;
            case 107:
               var10000 = 212;
               break;
            case 108:
               var10000 = 183;
               break;
            case 109:
               var10000 = 140;
               break;
            case 110:
               var10000 = 16;
               break;
            case 111:
               var10000 = 182;
               break;
            case 112:
               var10000 = 137;
               break;
            case 113:
               var10000 = 35;
               break;
            case 114:
               var10000 = 22;
               break;
            case 115:
               var10000 = 89;
               break;
            case 116:
               var10000 = 6;
               break;
            case 117:
               var10000 = 177;
               break;
            case 118:
               var10000 = 135;
               break;
            case 119:
               var10000 = 3;
               break;
            case 120:
               var10000 = 62;
               break;
            case 121:
               var10000 = 37;
               break;
            case 122:
               var10000 = 112;
               break;
            case 123:
               var10000 = 179;
               break;
            case 124:
               var10000 = 120;
               break;
            case 125:
               var10000 = 164;
               break;
            case 126:
               var10000 = 40;
               break;
            case 127:
               var10000 = 145;
               break;
            case 128:
               var10000 = 247;
               break;
            case 129:
               var10000 = 72;
               break;
            case 130:
               var10000 = 81;
               break;
            case 131:
               var10000 = 158;
               break;
            case 132:
               var10000 = 50;
               break;
            case 133:
               var10000 = 54;
               break;
            case 134:
               var10000 = 19;
               break;
            case 135:
               var10000 = 91;
               break;
            case 136:
               var10000 = 30;
               break;
            case 137:
               var10000 = 98;
               break;
            case 138:
               var10000 = 232;
               break;
            case 139:
               var10000 = 63;
               break;
            case 140:
               var10000 = 56;
               break;
            case 141:
               var10000 = 195;
               break;
            case 142:
               var10000 = 250;
               break;
            case 143:
               var10000 = 213;
               break;
            case 144:
               var10000 = 24;
               break;
            case 145:
               var10000 = 222;
               break;
            case 146:
               var10000 = 187;
               break;
            case 147:
               var10000 = 172;
               break;
            case 148:
               var10000 = 14;
               break;
            case 149:
               var10000 = 114;
               break;
            case 150:
               var10000 = 197;
               break;
            case 151:
               var10000 = 20;
               break;
            case 152:
               var10000 = 31;
               break;
            case 153:
               var10000 = 53;
               break;
            case 154:
               var10000 = 79;
               break;
            case 155:
               var10000 = 102;
               break;
            case 156:
               var10000 = 188;
               break;
            case 157:
               var10000 = 226;
               break;
            case 158:
               var10000 = 23;
               break;
            case 159:
               var10000 = 84;
               break;
            case 160:
               var10000 = 170;
               break;
            case 161:
               var10000 = 45;
               break;
            case 162:
               var10000 = 141;
               break;
            case 163:
               var10000 = 104;
               break;
            case 164:
               var10000 = 78;
               break;
            case 165:
               var10000 = 32;
               break;
            case 166:
               var10000 = 202;
               break;
            case 167:
               var10000 = 106;
               break;
            case 168:
               var10000 = 44;
               break;
            case 169:
               var10000 = 122;
               break;
            case 170:
               var10000 = 208;
               break;
            case 171:
               var10000 = 169;
               break;
            case 172:
               var10000 = 231;
               break;
            case 173:
               var10000 = 21;
               break;
            case 174:
               var10000 = 47;
               break;
            case 175:
               var10000 = 160;
               break;
            case 176:
               var10000 = 144;
               break;
            case 177:
               var10000 = 245;
               break;
            case 178:
               var10000 = 94;
               break;
            case 179:
               var10000 = 203;
               break;
            case 180:
               var10000 = 117;
               break;
            case 181:
               var10000 = 74;
               break;
            case 182:
               var10000 = 12;
               break;
            case 183:
               var10000 = 154;
               break;
            case 184:
               var10000 = 103;
               break;
            case 185:
               var10000 = 119;
               break;
            case 186:
               var10000 = 200;
               break;
            case 187:
               var10000 = 8;
               break;
            case 188:
               var10000 = 211;
               break;
            case 189:
               var10000 = 105;
               break;
            case 190:
               var10000 = 252;
               break;
            case 191:
               var10000 = 51;
               break;
            case 192:
               var10000 = 110;
               break;
            case 193:
               var10000 = 186;
               break;
            case 194:
               var10000 = 59;
               break;
            case 195:
               var10000 = 241;
               break;
            case 196:
               var10000 = 60;
               break;
            case 197:
               var10000 = 41;
               break;
            case 198:
               var10000 = 92;
               break;
            case 199:
               var10000 = 193;
               break;
            case 200:
               var10000 = 82;
               break;
            case 201:
               var10000 = 121;
               break;
            case 202:
               var10000 = 85;
               break;
            case 203:
               var10000 = 243;
               break;
            case 204:
               var10000 = 71;
               break;
            case 205:
               var10000 = 237;
               break;
            case 206:
               var10000 = 180;
               break;
            case 207:
               var10000 = 36;
               break;
            case 208:
               var10000 = 198;
               break;
            case 209:
               var10000 = 254;
               break;
            case 210:
               var10000 = 218;
               break;
            case 211:
               var10000 = 152;
               break;
            case 212:
               var10000 = 109;
               break;
            case 213:
               var10000 = 83;
               break;
            case 214:
               var10000 = 99;
               break;
            case 215:
               var10000 = 181;
               break;
            case 216:
               var10000 = 101;
               break;
            case 217:
               var10000 = 171;
               break;
            case 218:
               var10000 = 196;
               break;
            case 219:
               var10000 = 151;
               break;
            case 220:
               var10000 = 255;
               break;
            case 221:
               var10000 = 86;
               break;
            case 222:
               var10000 = 38;
               break;
            case 223:
               var10000 = 166;
               break;
            case 224:
               var10000 = 209;
               break;
            case 225:
               var10000 = 224;
               break;
            case 226:
               var10000 = 42;
               break;
            case 227:
               var10000 = 27;
               break;
            case 228:
               var10000 = 13;
               break;
            case 229:
               var10000 = 69;
               break;
            case 230:
               var10000 = 55;
               break;
            case 231:
               var10000 = 153;
               break;
            case 232:
               var10000 = 221;
               break;
            case 233:
               var10000 = 26;
               break;
            case 234:
               var10000 = 73;
               break;
            case 235:
               var10000 = 191;
               break;
            case 236:
               var10000 = 15;
               break;
            case 237:
               var10000 = 118;
               break;
            case 238:
               var10000 = 4;
               break;
            case 239:
               var10000 = 5;
               break;
            case 240:
               var10000 = 17;
               break;
            case 241:
               var10000 = 58;
               break;
            case 242:
               var10000 = 123;
               break;
            case 243:
               var10000 = 116;
               break;
            case 244:
               var10000 = 46;
               break;
            case 245:
               var10000 = 220;
               break;
            case 246:
               var10000 = 215;
               break;
            case 247:
               var10000 = 130;
               break;
            case 248:
               var10000 = 240;
               break;
            case 249:
               var10000 = 10;
               break;
            case 250:
               var10000 = 126;
               break;
            case 251:
               var10000 = 214;
               break;
            case 252:
               var10000 = 201;
               break;
            case 253:
               var10000 = 68;
               break;
            case 254:
               var10000 = 150;
               break;
            default:
               var10000 = 97;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3032;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18950) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[14];
      int var19 = 0;
      String var18 = "yå¬1iÔÙ+ÝM8$ûv\u008b.\u008e>\u0098\u0017\u0086\u0092°°\nà\u001d§´5ËJð\u008ej9Îl,é5\"É°\u001e{Fµ\u0002\u008a÷%\u000f\u001dÁÇ\u000fæía\u009cH×IÅ¹\u0005uÄ±Â\u001f\u0082Ëb.g\u009e\u007f?.)>0ìD@«ï\u0010d\u000e,Í#ð\u008bU\u008e¶\u009a\u0085\u0095Wë%1L\u009b\u00ad¹Yl\u009dªW¼âo\u0084·*à\u0081\u0091\u0085\u0087p\u008e%'½zWÛ-øÃ¾/ÏÅÕ\b\u0002ä*\u000fñ}øé\u0002\u0007Õ@\u0018\u0018»\u0080úì\u00adi6Ô/[\u0080u\n\f£n\u0083nèÊÐ\u0010)\u0007y&=\u0012;Ù\u0082\bî}±rû1ÂD\u0010\u001c\u009812¶»ü\u001ax¼%/&Ë\u0004V\u0007\"^ãF\u0080:ä%W*Ê!n:Áú\u0019;g'ÓtÇÌ\u009c\u0086Éùã\u0017NµâíÏQ8äü\u0089´sKM\u008e\u0007Àk\u009bà\u008fî\u0005";
      int var20 = "yå¬1iÔÙ+ÝM8$ûv\u008b.\u008e>\u0098\u0017\u0086\u0092°°\nà\u001d§´5ËJð\u008ej9Îl,é5\"É°\u001e{Fµ\u0002\u008a÷%\u000f\u001dÁÇ\u000fæía\u009cH×IÅ¹\u0005uÄ±Â\u001f\u0082Ëb.g\u009e\u007f?.)>0ìD@«ï\u0010d\u000e,Í#ð\u008bU\u008e¶\u009a\u0085\u0095Wë%1L\u009b\u00ad¹Yl\u009dªW¼âo\u0084·*à\u0081\u0091\u0085\u0087p\u008e%'½zWÛ-øÃ¾/ÏÅÕ\b\u0002ä*\u000fñ}øé\u0002\u0007Õ@\u0018\u0018»\u0080úì\u00adi6Ô/[\u0080u\n\f£n\u0083nèÊÐ\u0010)\u0007y&=\u0012;Ù\u0082\bî}±rû1ÂD\u0010\u001c\u009812¶»ü\u001ax¼%/&Ë\u0004V\u0007\"^ãF\u0080:ä%W*Ê!n:Áú\u0019;g'ÓtÇÌ\u009c\u0086Éùã\u0017NµâíÏQ8äü\u0089´sKM\u008e\u0007Àk\u009bà\u008fî\u0005"
         .length();
      char var17 = 7;
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 55;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var43;
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 24;
                        break;
                     case 1:
                        var77 = 17;
                        break;
                     case 2:
                        var77 = 108;
                        break;
                     case 3:
                        var77 = 86;
                        break;
                     case 4:
                        var77 = 74;
                        break;
                     case 5:
                        var77 = 78;
                        break;
                     default:
                        var77 = 85;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     a = var21;
                     b = new String[14];
                     long var8 = 8807840377652517790L;
                     long[] var14 = new long[4];
                     int var11 = 0;
                     String var12 = "-²gu2\u0017[\u00162¿Ó#\u0087V+\u0089";
                     int var13 = "-²gu2\u0017[\u00162¿Ó#\u0087V+\u0089".length();
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        long[] var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           long var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    c = var14;
                                    e = new Integer[4];
                                    long var0 = 950789062543319799L;
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "\u001a\u0089¢êO½0Ç\u0000Ä-\"\u000e\u0082\u0003\u0093";
                                    int var5 = "\u001a\u0089¢êO½0Ç\u0000Ä-\"\u000e\u0082\u0003\u0093".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
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
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    f = var6;
                                    g = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "\u0080çDìY\u0085±ðI^3Å^<ëê";
                                 var13 = "\u0080çDìY\u0085±ðI^3Å^<ëê".length();
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = "\u001cß\u0096\u0006prJ\u0012I\u0084ÒeÞ&WMg\u0006\u008d\u00944\u009aÆ\u008b§â";
                  var20 = "\u001cß\u0096\u0006prJ\u0012I\u0084ÒeÞ&WMg\u0006\u008d\u00944\u009aÆ\u008b§â".length();
                  var17 = 7;
                  var25 = -1;
            }

            var10000 = 44;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}





