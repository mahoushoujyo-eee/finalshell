package com.finalshell.core;

import com.finalshell.connection.Connection;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Rdp2 {
   Vw2 f;
   public int M;
   int Q;
   Qm2 p;
   Connection K;
   boolean U;
   Object x;
   boolean k;
   public HashMap L;
   boolean T;
   Object z;
   Object H;
   public InetAddress G;
   public int V;
   public int s;
   int B;
   boolean r;
   int I;
   int A;
   int g;
   int F;
   CU e;
   int D;
   static Random R;
   long J;
   boolean W;
   boolean Z;
   static int Y;
   Object a;
   HashMap j;
   public static String[] b;
   public static String[] c;
   public static long d;
   public static long h;

   static {
      __vfClinit__();
   }

   Rdp2(Qm2 var1) {
      Ky4[] var10000 = Qm2.J();
      this.f = null;
      this.M = 0;
      this.Q = (int)d;
      this.K = null;
      this.U = false;
      this.x = new Object();
      this.k = false;
      this.L = new HashMap();
      this.T = false;
      this.z = new Object();
      Ky4[] var2 = var10000;
      this.H = new Object();
      this.s = 0;
      this.B = -1;
      this.r = false;
      this.I = 0;
      this.A = -1;
      this.g = 0;
      this.F = 0;
      this.D = 0;
      this.J = h;
      this.W = false;
      this.Z = false;
      this.a = new Object();
      this.j = new HashMap();
      this.p = var1;
      this.e = new CU(var1);
      this.K = var1.j;
      this.G = var1.c;
      this.V = var1.i;
      if (var2 == null) {
         Ky4.K(new String[4]);
      }
   }

   void V(byte[] param1, int param2, int param3) throws FG3, InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/finalshell/core/Cs2.k I
      // 03: istore 5
      // 05: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 08: iload 3
      // 09: iload 5
      // 0b: idiv
      // 0c: istore 6
      // 0e: astore 4
      // 10: iload 3
      // 11: iload 5
      // 13: irem
      // 14: aload 4
      // 16: ifnull 28
      // 19: ifeq 26
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: iinc 6 1
      // 26: iload 6
      // 28: aload 4
      // 2a: ifnull 3c
      // 2d: ifne 3a
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: bipush 1
      // 38: istore 6
      // 3a: iload 5
      // 3c: istore 7
      // 3e: iload 3
      // 3f: aload 4
      // 41: ifnull 7f
      // 44: iload 7
      // 46: if_icmpgt 77
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 0
      // 51: dup
      // 52: getfield com/finalshell/core/Rdp2.D I
      // 55: bipush 1
      // 56: iadd
      // 57: putfield com/finalshell/core/Rdp2.D I
      // 5a: aload 0
      // 5b: aload 1
      // 5c: bipush 0
      // 5d: iload 3
      // 5e: invokevirtual com/finalshell/core/Rdp2.m ([BII)V
      // 61: aload 0
      // 62: dup
      // 63: getfield com/finalshell/core/Rdp2.D I
      // 66: bipush 1
      // 67: isub
      // 68: putfield com/finalshell/core/Rdp2.D I
      // 6b: aload 4
      // 6d: ifnonnull ce
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: bipush 0
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: istore 8
      // 81: aload 4
      // 83: ifnonnull c7
      // 86: iload 7
      // 88: newarray 8
      // 8a: astore 9
      // 8c: aload 1
      // 8d: iload 2
      // 8e: aload 9
      // 90: bipush 0
      // 91: iload 7
      // 93: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 96: aload 0
      // 97: aload 9
      // 99: bipush 0
      // 9a: aload 9
      // 9c: arraylength
      // 9d: invokevirtual com/finalshell/core/Rdp2.m ([BII)V
      // a0: iload 2
      // a1: iload 5
      // a3: iadd
      // a4: istore 2
      // a5: iload 2
      // a6: iload 7
      // a8: iadd
      // a9: iload 3
      // aa: aload 4
      // ac: ifnull c1
      // af: if_icmple c4
      // b2: iload 3
      // b3: iload 6
      // b5: bipush 1
      // b6: isub
      // b7: iload 5
      // b9: imul
      // ba: goto c1
      // bd: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: isub
      // c2: istore 7
      // c4: iinc 8 1
      // c7: iload 8
      // c9: iload 6
      // cb: if_icmplt 86
      // ce: return
   }

   void m(byte[] param1, int param2, int param3) throws FG3, InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/core/Rdp2.W Z
      // 009: aload 4
      // 00b: ifnull 023
      // 00e: ifne 15f
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: getfield com/finalshell/core/Rdp2.Z Z
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: ifne 14a
      // 026: new com/finalshell/core/Vw2
      // 029: dup
      // 02a: aload 0
      // 02b: getfield com/finalshell/core/Rdp2.s I
      // 02e: aload 1
      // 02f: bipush 0
      // 030: iload 3
      // 031: i2s
      // 032: aload 0
      // 033: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 036: getfield com/finalshell/core/Qm2.W I
      // 039: aload 0
      // 03a: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 03d: getfield com/finalshell/core/Qm2.u Lcom/finalshell/core/LA3;
      // 040: getfield com/finalshell/core/LA3.K I
      // 043: invokespecial com/finalshell/core/Vw2.<init> (I[BISII)V
      // 046: astore 5
      // 048: aload 5
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/Rdp2.G Ljava/net/InetAddress;
      // 04e: invokevirtual com/finalshell/core/Vw2.D (Ljava/net/InetAddress;)V
      // 051: aload 5
      // 053: aload 0
      // 054: getfield com/finalshell/core/Rdp2.V I
      // 057: invokevirtual com/finalshell/core/Vw2.A (I)V
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/Rdp2.a Ljava/lang/Object;
      // 05e: dup
      // 05f: astore 6
      // 061: monitorenter
      // 062: aload 0
      // 063: getfield com/finalshell/core/Rdp2.L Ljava/util/HashMap;
      // 066: aload 5
      // 068: invokevirtual com/finalshell/core/Vw2.N ()I
      // 06b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06e: aload 5
      // 070: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 073: pop
      // 074: aload 6
      // 076: monitorexit
      // 077: goto 07e
      // 07a: aload 6
      // 07c: monitorexit
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/Rdp2.H Ljava/lang/Object;
      // 082: dup
      // 083: astore 6
      // 085: monitorenter
      // 086: aload 0
      // 087: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 08a: getfield com/finalshell/core/Qm2.j Lcom/finalshell/connection/Connection;
      // 08d: aload 4
      // 08f: ifnull 0ad
      // 092: invokevirtual com/finalshell/connection/Connection.Q ()Z
      // 095: ifne 0ab
      // 098: aload 0
      // 099: getfield com/finalshell/core/Rdp2.H Ljava/lang/Object;
      // 09c: invokevirtual java/lang/Object.wait ()V
      // 09f: goto 0ab
      // 0a2: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: astore 7
      // 0a8: aload 7
      // 0aa: athrow
      // 0ab: aload 6
      // 0ad: monitorexit
      // 0ae: goto 0b5
      // 0b1: aload 6
      // 0b3: monitorexit
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: istore 6
      // 0b8: getstatic com/finalshell/core/Cs2.D Z
      // 0bb: aload 4
      // 0bd: ifnull 0d0
      // 0c0: ifeq 0cd
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: bipush 1
      // 0cb: istore 6
      // 0cd: getstatic com/finalshell/core/Cs2.Q Z
      // 0d0: aload 4
      // 0d2: ifnull 123
      // 0d5: ifeq 0fe
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 5
      // 0e1: invokevirtual com/finalshell/core/Vw2.N ()I
      // 0e4: bipush 5
      // 0e5: aload 4
      // 0e7: ifnull 122
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: if_icmpgt 0fe
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: bipush 1
      // 0fc: istore 6
      // 0fe: aload 0
      // 0ff: aload 5
      // 101: bipush 0
      // 102: iload 6
      // 104: bipush 1
      // 105: invokevirtual com/finalshell/core/Rdp2.E (Lcom/finalshell/core/Vw2;ZZZ)V
      // 108: aload 0
      // 109: invokestatic java/lang/System.currentTimeMillis ()J
      // 10c: putfield com/finalshell/core/Rdp2.J J
      // 10f: aload 0
      // 110: dup
      // 111: getfield com/finalshell/core/Rdp2.B I
      // 114: bipush 1
      // 115: iadd
      // 116: putfield com/finalshell/core/Rdp2.B I
      // 119: getstatic com/finalshell/core/Rdp2.Y I
      // 11c: aload 5
      // 11e: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 121: arraylength
      // 122: iadd
      // 123: putstatic com/finalshell/core/Rdp2.Y I
      // 126: aload 0
      // 127: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 12a: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 12d: getfield com/finalshell/core/F92.z Lcom/finalshell/task/Tb2;
      // 130: aload 0
      // 131: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 134: aload 0
      // 135: getfield com/finalshell/core/Rdp2.s I
      // 138: invokevirtual com/finalshell/task/Tb2.x (Lcom/finalshell/core/Qm2;I)V
      // 13b: aload 0
      // 13c: dup
      // 13d: getfield com/finalshell/core/Rdp2.s I
      // 140: bipush 1
      // 141: iadd
      // 142: putfield com/finalshell/core/Rdp2.s I
      // 145: aload 4
      // 147: ifnonnull 170
      // 14a: new com/finalshell/core/FG3
      // 14d: dup
      // 14e: sipush -3288
      // 151: sipush -14969
      // 154: invokestatic com/finalshell/core/Rdp2.a (II)Ljava/lang/String;
      // 157: invokespecial com/finalshell/core/FG3.<init> (Ljava/lang/String;)V
      // 15a: athrow
      // 15b: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: new com/finalshell/core/FG3
      // 162: dup
      // 163: sipush -3287
      // 166: sipush 26134
      // 169: invokestatic com/finalshell/core/Rdp2.a (II)Ljava/lang/String;
      // 16c: invokespecial com/finalshell/core/FG3.<init> (Ljava/lang/String;)V
      // 16f: athrow
      // 170: return
   }

   public void O() {
      Rdp2 var2;
      label24: {
         Ky4[] var1 = Qm2.J();
         boolean var10000 = this.Z;
         if (var1 != null) {
            if (this.Z) {
               return;
            }

            this.Z = true;
            this.p.j.g();
            var2 = this;
            if (var1 == null) {
               break label24;
            }

            var10000 = this.p.Q;
         }

         if (var10000) {
            return;
         }

         var2 = this;
      }

      var2.h();
   }

   public void N() {
      Ky4[] var1 = Qm2.J();
      Rdp2 var10000 = this;
      if (var1 != null) {
         if (this.Z) {
            return;
         }

         var10000 = this;
      }

      var10000.Z = true;
   }

   void E(Vw2 param1, boolean param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 007: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 00a: invokevirtual com/finalshell/core/F92.V ()Ljava/lang/Object;
      // 00d: dup
      // 00e: astore 6
      // 010: monitorenter
      // 011: astore 5
      // 013: invokestatic java/lang/System.nanoTime ()J
      // 016: lstore 7
      // 018: invokestatic java/lang/System.currentTimeMillis ()J
      // 01b: lstore 9
      // 01d: aload 0
      // 01e: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 021: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 024: aload 0
      // 025: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 028: invokevirtual com/finalshell/core/F92.W (Lcom/finalshell/core/Qm2;)V
      // 02b: aload 0
      // 02c: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 02f: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 032: invokevirtual com/finalshell/core/F92.M ()I
      // 035: istore 11
      // 037: aload 1
      // 038: iload 11
      // 03a: invokevirtual com/finalshell/core/Vw2.Q (I)V
      // 03d: aload 0
      // 03e: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 041: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 044: iload 11
      // 046: invokevirtual com/finalshell/core/F92.A (I)Lcom/finalshell/core/Fr2;
      // 049: astore 12
      // 04b: aload 5
      // 04d: ifnull 083
      // 050: iload 2
      // 051: ifne 088
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: aload 1
      // 05c: iload 11
      // 05e: invokevirtual com/finalshell/core/Vw2.w (I)V
      // 061: aload 1
      // 062: invokestatic java/lang/System.currentTimeMillis ()J
      // 065: invokevirtual com/finalshell/core/Vw2.a (J)V
      // 068: aload 12
      // 06a: aload 1
      // 06b: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 06e: arraylength
      // 06f: invokevirtual com/finalshell/core/Fr2.q (I)V
      // 072: aload 12
      // 074: aload 1
      // 075: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 078: arraylength
      // 079: invokevirtual com/finalshell/core/Fr2.A (I)V
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: aload 5
      // 085: ifnonnull 0ac
      // 088: aload 0
      // 089: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 08c: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 08f: aload 1
      // 090: invokevirtual com/finalshell/core/Vw2.c ()I
      // 093: invokevirtual com/finalshell/core/F92.A (I)Lcom/finalshell/core/Fr2;
      // 096: astore 13
      // 098: aload 13
      // 09a: aload 1
      // 09b: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 09e: arraylength
      // 09f: invokevirtual com/finalshell/core/Fr2.h (I)V
      // 0a2: aload 12
      // 0a4: aload 1
      // 0a5: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 0a8: arraylength
      // 0a9: invokevirtual com/finalshell/core/Fr2.A (I)V
      // 0ac: aload 0
      // 0ad: dup
      // 0ae: getfield com/finalshell/core/Rdp2.g I
      // 0b1: bipush 1
      // 0b2: iadd
      // 0b3: putfield com/finalshell/core/Rdp2.g I
      // 0b6: aload 0
      // 0b7: dup
      // 0b8: getfield com/finalshell/core/Rdp2.M I
      // 0bb: bipush 1
      // 0bc: iadd
      // 0bd: putfield com/finalshell/core/Rdp2.M I
      // 0c0: aload 0
      // 0c1: dup
      // 0c2: getfield com/finalshell/core/Rdp2.A I
      // 0c5: bipush 1
      // 0c6: iadd
      // 0c7: putfield com/finalshell/core/Rdp2.A I
      // 0ca: invokestatic java/lang/System.currentTimeMillis ()J
      // 0cd: lstore 13
      // 0cf: aload 0
      // 0d0: aload 1
      // 0d1: invokevirtual com/finalshell/core/Vw2.S ()Ljava/net/DatagramPacket;
      // 0d4: invokevirtual com/finalshell/core/Rdp2.W (Ljava/net/DatagramPacket;)V
      // 0d7: iload 3
      // 0d8: aload 5
      // 0da: ifnull 0f8
      // 0dd: ifeq 0f6
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: aload 1
      // 0e9: invokevirtual com/finalshell/core/Vw2.S ()Ljava/net/DatagramPacket;
      // 0ec: invokevirtual com/finalshell/core/Rdp2.W (Ljava/net/DatagramPacket;)V
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: iload 4
      // 0f8: ifeq 113
      // 0fb: aload 0
      // 0fc: getfield com/finalshell/core/Rdp2.p Lcom/finalshell/core/Qm2;
      // 0ff: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // 102: lload 7
      // 104: aload 1
      // 105: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 108: arraylength
      // 109: invokevirtual com/finalshell/core/F92.l (JI)V
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Rdp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: new com/finalshell/core/Cr4
      // 116: dup
      // 117: ldc_w ""
      // 11a: getstatic com/finalshell/core/Rdp2.R Ljava/util/Random;
      // 11d: invokevirtual java/util/Random.nextLong ()J
      // 120: aload 1
      // 121: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 124: arraylength
      // 125: getstatic com/finalshell/core/Cr4.i I
      // 128: invokespecial com/finalshell/core/Cr4.<init> (Ljava/lang/String;JII)V
      // 12b: astore 15
      // 12d: aload 15
      // 12f: invokestatic com/finalshell/core/LA3.F (Lcom/finalshell/core/Cr4;)V
      // 132: goto 13c
      // 135: astore 13
      // 137: aload 13
      // 139: invokevirtual java/io/IOException.printStackTrace ()V
      // 13c: aload 6
      // 13e: monitorexit
      // 13f: goto 146
      // 142: aload 6
      // 144: monitorexit
      // 145: athrow
      // 146: return
   }

   void w(int var1) {
      this.p.u.x.S(this.p, var1);
   }

   void S() {
      this.p.u.x.e(this.p);
   }

   Vw2 Y(int var1) {
      return (Vw2)this.L.get(var1);
   }

   public void T(int var1, int var2) {
      Ky4[] var3 = Qm2.J();
      HashMap var10000 = this.L;
      Integer var10001 = var1;
      if (var3 != null) {
         if (!var10000.containsKey(var10001)) {
            return;
         }

         var10000 = this.L;
         var10001 = var1;
      }

      Vw2 var4 = (Vw2)var10000.get(var10001);
      if (var4 != null) {
         this.E(var4, true, false, true);
      }
   }

   public void I() {
      synchronized (this.a) {
         this.L.clear();
      }
   }

   void a(int var1) {
      synchronized (this.a) {
         Vw2 var3 = (Vw2)this.L.remove(var1);
      }
   }

   void H() {
      synchronized (this.H) {
         this.H.notifyAll();
      }
   }

   void y() {
      synchronized (this.H) {
         this.W = true;
         this.H.notifyAll();
      }
   }

   void h() {
      Vm2 var1 = new Vm2(this.p.W, this.p.u.K, this.s);
      var1.D(this.G);
      var1.A(this.V);

      try {
         this.W(var1.S());
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      try {
         this.W(var1.S());
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   void l() {
      VK var1 = new VK(this.p.W, this.p.u.K);
      var1.D(this.G);
      var1.A(this.V);

      try {
         this.W(var1.S());
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      try {
         this.W(var1.S());
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   void Y(ArrayList var1) {
      int var2 = this.p.j.C();
      Vt2 var3 = new Vt2(this.p.n, var1, this.p.j.w, this.p.d.X, var2, this.p.W, this.p.u.K);
      var3.D(this.G);
      var3.A(this.V);

      try {
         this.W(var3.S());
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   void W(DatagramPacket var1) throws IOException {
      this.M(var1, this.p.W);
   }

   public void M(DatagramPacket var1, Integer var2) throws IOException {
      this.p.d.l(var1);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3287) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 128;
            case 1 -> 34;
            case 2 -> 150;
            case 3 -> 217;
            case 4 -> 32;
            case 5 -> 196;
            case 6 -> 157;
            case 7 -> 254;
            case 8 -> 72;
            case 9 -> 214;
            case 10 -> 47;
            case 11 -> 185;
            case 12 -> 64;
            case 13 -> 239;
            case 14 -> 211;
            case 15 -> 163;
            case 16 -> 80;
            case 17 -> 56;
            case 18 -> 248;
            case 19 -> 189;
            case 20 -> 130;
            case 21 -> 186;
            case 22 -> 124;
            case 23 -> 152;
            case 24 -> 212;
            case 25 -> 209;
            case 26 -> 219;
            case 27 -> 190;
            case 28 -> 164;
            case 29 -> 24;
            case 30 -> 153;
            case 31 -> 70;
            case 32 -> 245;
            case 33 -> 77;
            case 34 -> 110;
            case 35 -> 154;
            case 36 -> 54;
            case 37 -> 207;
            case 38 -> 112;
            case 39 -> 198;
            case 40 -> 66;
            case 41 -> 242;
            case 42 -> 246;
            case 43 -> 122;
            case 44 -> 20;
            case 45 -> 2;
            case 46 -> 142;
            case 47 -> 29;
            case 48 -> 179;
            case 49 -> 16;
            case 50 -> 17;
            case 51 -> 172;
            case 52 -> 0;
            case 53 -> 187;
            case 54 -> 99;
            case 55 -> 135;
            case 56 -> 91;
            case 57 -> 115;
            case 58 -> 53;
            case 59 -> 88;
            case 60 -> 141;
            case 61 -> 195;
            case 62 -> 222;
            case 63 -> 31;
            case 64 -> 8;
            case 65 -> 197;
            case 66 -> 181;
            case 67 -> 134;
            case 68 -> 241;
            case 69 -> 104;
            case 70 -> 113;
            case 71 -> 89;
            case 72 -> 158;
            case 73 -> 173;
            case 74 -> 184;
            case 75 -> 180;
            case 76 -> 40;
            case 77 -> 139;
            case 78 -> 73;
            case 79 -> 42;
            case 80 -> 149;
            case 81 -> 232;
            case 82 -> 201;
            case 83 -> 147;
            case 84 -> 137;
            case 85 -> 129;
            case 86 -> 151;
            case 87 -> 10;
            case 88 -> 33;
            case 89 -> 13;
            case 90 -> 200;
            case 91 -> 45;
            case 92 -> 138;
            case 93 -> 39;
            case 94 -> 199;
            case 95 -> 25;
            case 96 -> 238;
            case 97 -> 133;
            case 98 -> 85;
            case 99 -> 162;
            case 100 -> 230;
            case 101 -> 116;
            case 102 -> 221;
            case 103 -> 57;
            case 104 -> 236;
            case 105 -> 111;
            case 106 -> 26;
            case 107 -> 6;
            case 108 -> 86;
            case 109 -> 120;
            case 110 -> 231;
            case 111 -> 41;
            case 112 -> 233;
            case 113 -> 192;
            case 114 -> 48;
            case 115 -> 208;
            case 116 -> 251;
            case 117 -> 131;
            case 118 -> 252;
            case 119 -> 160;
            case 120 -> 229;
            case 121 -> 225;
            case 122 -> 35;
            case 123 -> 169;
            case 124 -> 228;
            case 125 -> 176;
            case 126 -> 101;
            case 127 -> 240;
            case 128 -> 193;
            case 129 -> 82;
            case 130 -> 126;
            case 131 -> 44;
            case 132 -> 100;
            case 133 -> 51;
            case 134 -> 71;
            case 135 -> 106;
            case 136 -> 127;
            case 137 -> 97;
            case 138 -> 30;
            case 139 -> 84;
            case 140 -> 22;
            case 141 -> 11;
            case 142 -> 165;
            case 143 -> 52;
            case 144 -> 140;
            case 145 -> 81;
            case 146 -> 227;
            case 147 -> 87;
            case 148 -> 224;
            case 149 -> 159;
            case 150 -> 5;
            case 151 -> 23;
            case 152 -> 61;
            case 153 -> 103;
            case 154 -> 36;
            case 155 -> 168;
            case 156 -> 177;
            case 157 -> 237;
            case 158 -> 167;
            case 159 -> 220;
            case 160 -> 117;
            case 161 -> 3;
            case 162 -> 119;
            case 163 -> 136;
            case 164 -> 76;
            case 165 -> 178;
            case 166 -> 105;
            case 167 -> 37;
            case 168 -> 59;
            case 169 -> 213;
            case 170 -> 79;
            case 171 -> 92;
            case 172 -> 202;
            case 173 -> 118;
            case 174 -> 94;
            case 175 -> 102;
            case 176 -> 210;
            case 177 -> 93;
            case 178 -> 175;
            case 179 -> 125;
            case 180 -> 191;
            case 181 -> 58;
            case 182 -> 4;
            case 183 -> 49;
            case 184 -> 226;
            case 185 -> 171;
            case 186 -> 15;
            case 187 -> 218;
            case 188 -> 27;
            case 189 -> 204;
            case 190 -> 223;
            case 191 -> 182;
            case 192 -> 96;
            case 193 -> 215;
            case 194 -> 247;
            case 195 -> 145;
            case 196 -> 1;
            case 197 -> 75;
            case 198 -> 18;
            case 199 -> 65;
            case 200 -> 205;
            case 201 -> 161;
            case 202 -> 9;
            case 203 -> 255;
            case 204 -> 83;
            case 205 -> 68;
            case 206 -> 170;
            case 207 -> 155;
            case 208 -> 143;
            case 209 -> 95;
            case 210 -> 132;
            case 211 -> 235;
            case 212 -> 46;
            case 213 -> 55;
            case 214 -> 174;
            case 215 -> 206;
            case 216 -> 203;
            case 217 -> 166;
            case 218 -> 38;
            case 219 -> 194;
            case 220 -> 7;
            case 221 -> 108;
            case 222 -> 244;
            case 223 -> 146;
            case 224 -> 156;
            case 225 -> 216;
            case 226 -> 90;
            case 227 -> 98;
            case 228 -> 78;
            case 229 -> 183;
            case 230 -> 43;
            case 231 -> 234;
            case 232 -> 63;
            case 233 -> 121;
            case 234 -> 107;
            case 235 -> 243;
            case 236 -> 28;
            case 237 -> 12;
            case 238 -> 21;
            case 239 -> 67;
            case 240 -> 123;
            case 241 -> 62;
            case 242 -> 60;
            case 243 -> 188;
            case 244 -> 14;
            case 245 -> 109;
            case 246 -> 74;
            case 247 -> 50;
            case 248 -> 144;
            case 249 -> 148;
            case 250 -> 114;
            case 251 -> 253;
            case 252 -> 19;
            case 253 -> 250;
            case 254 -> 69;
            default -> 249;
         };
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u00adDó轆挊崐纡凋閕\u0010\u0010çD輲揼嶞攝彩²Fùî÷jP\u001b";
      int var8 = "\u00adDó轆挊崐纡凋閕\u0010\u0010çD輲揼嶞攝彩²Fùî÷jP\u001b".length();
      char var5 = '\t';
      int var4 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var6.substring(++var4, var4 + var5).toCharArray();
            int var10004 = var10003.length;
            int var10 = 0;
            byte var21 = 118;
            var10002 = var10003;
            int var12 = var10004;
            byte var24;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var24 = 118;
               var10006 = var10;
            } else {
               var21 = 118;
               var12 = var10004;
               if (var10004 <= var10) {
                  break label38;
               }

               var10005 = var10003;
               var24 = 118;
               var10006 = var10;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var24 ^ switch (var10 % 7) {
                  case 0 -> 108;
                  case 1 -> 67;
                  case 2 -> 59;
                  case 3 -> 12;
                  case 4 -> 84;
                  case 5 -> 22;
                  default -> 12;
               });
               var10++;
               if (var21 == 0) {
                  var10006 = var21;
                  var10005 = var10002;
                  var24 = var21;
               } else {
                  if (var12 <= var10) {
                     break;
                  }

                  var10005 = var10002;
                  var24 = var21;
                  var10006 = var10;
               }
            }
         }

         String var23 = new String(var10002).intern();
         byte var14 = -1;
         var9[var7++] = var23;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            long var2 = 6739097583063211750L;
            long var19 = -3984705395860103550L ^ var2;
            var14 = -1;
            d = var19;
            long var0 = 2408091182883050072L;
            long var20 = -2408091182883050073L ^ var0;
            var14 = -1;
            h = var20;
            R = new Random();
            Y = 0;
            return;
         }

         var5 = var6.charAt(var4);
      }
   }
}





