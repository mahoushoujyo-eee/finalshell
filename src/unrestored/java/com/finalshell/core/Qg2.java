package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.WD3;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

public class Qg2 {
   public static Vector H;
   public static InetAddress O;
   public ConnectHost F;
   public int r;
   public int q;
   public String E;
   public InetAddress D;
   public Runnable t;
   public ServerSocket b;
   public int m = 0;
   public String n;
   public boolean Q = false;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public Qg2(ConnectHost param1, String param2, int param3, String param4, int param5, F_2_3 param6, boolean param7) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 07: aload 0
      // 08: bipush 0
      // 09: putfield com/finalshell/core/Qg2.m I
      // 0c: aload 0
      // 0d: bipush 0
      // 0e: putfield com/finalshell/core/Qg2.Q Z
      // 11: aload 0
      // 12: aload 1
      // 13: putfield com/finalshell/core/Qg2.F Lcom/finalshell/crypto/ConnectHost;
      // 16: istore 8
      // 18: aload 0
      // 19: iload 3
      // 1a: putfield com/finalshell/core/Qg2.r I
      // 1d: aload 0
      // 1e: aload 4
      // 20: putfield com/finalshell/core/Qg2.E Ljava/lang/String;
      // 23: aload 0
      // 24: iload 5
      // 26: putfield com/finalshell/core/Qg2.q I
      // 29: aload 0
      // 2a: iload 7
      // 2c: putfield com/finalshell/core/Qg2.Q Z
      // 2f: aload 0
      // 30: aload 2
      // 31: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 34: putfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // 37: aload 0
      // 38: aload 6
      // 3a: iload 8
      // 3c: ifeq 58
      // 3f: ifnonnull 56
      // 42: new java/net/ServerSocket
      // 45: dup
      // 46: iload 3
      // 47: bipush 0
      // 48: aload 0
      // 49: getfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // 4c: invokespecial java/net/ServerSocket.<init> (IILjava/net/InetAddress;)V
      // 4f: goto 63
      // 52: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 6
      // 58: iload 3
      // 59: bipush 0
      // 5a: aload 0
      // 5b: getfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // 5e: invokeinterface com/finalshell/core/F_2_3.d (IILjava/net/InetAddress;)Ljava/net/ServerSocket; 4
      // 63: putfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // 66: goto c3
      // 69: astore 9
      // 6b: aload 9
      // 6d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 70: new java/lang/StringBuilder
      // 73: dup
      // 74: invokespecial java/lang/StringBuilder.<init> ()V
      // 77: sipush 32095
      // 7a: sipush 2698
      // 7d: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: aload 2
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: ldc ":"
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: iload 3
      // 8d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 90: sipush 32068
      // 93: sipush -26351
      // 96: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 99: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9f: astore 10
      // a1: aload 9
      // a3: instanceof java/lang/Throwable
      // a6: ifeq b9
      // a9: new com/finalshell/core/Pc2
      // ac: dup
      // ad: aload 10
      // af: aload 9
      // b1: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // b4: athrow
      // b5: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: new com/finalshell/core/Pc2
      // bc: dup
      // bd: aload 10
      // bf: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // c2: athrow
      // c3: iload 3
      // c4: iload 8
      // c6: ifeq e1
      // c9: ifne f6
      // cc: goto d3
      // cf: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: aload 0
      // d4: getfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // d7: invokevirtual java/net/ServerSocket.getLocalPort ()I
      // da: goto e1
      // dd: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e0: athrow
      // e1: istore 9
      // e3: iload 9
      // e5: bipush -1
      // e6: if_icmpeq f6
      // e9: aload 0
      // ea: iload 9
      // ec: putfield com/finalshell/core/Qg2.r I
      // ef: goto f6
      // f2: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f5: athrow
      // f6: return
   }

   public static Qg2 W(ConnectHost param0, String param1, int param2, String param3, int param4, F_2_3 param5, boolean param6) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 1
      // 04: invokestatic com/finalshell/core/Qg2.t (Ljava/lang/String;)Ljava/lang/String;
      // 07: astore 1
      // 08: istore 7
      // 0a: aload 0
      // 0b: aload 1
      // 0c: iload 2
      // 0d: invokestatic com/finalshell/core/Qg2.k (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;I)Lcom/finalshell/core/Qg2;
      // 10: iload 7
      // 12: ifeq 6b
      // 15: ifnull 5a
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: new com/finalshell/core/Pc2
      // 22: dup
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: sipush 32095
      // 2d: sipush 2698
      // 30: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: aload 1
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: ldc ":"
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: iload 2
      // 40: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 43: sipush 32086
      // 46: sipush 23972
      // 49: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 55: athrow
      // 56: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: new com/finalshell/core/Qg2
      // 5d: dup
      // 5e: aload 0
      // 5f: aload 1
      // 60: iload 2
      // 61: aload 3
      // 62: iload 4
      // 64: aload 5
      // 66: iload 6
      // 68: invokespecial com/finalshell/core/Qg2.<init> (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;ILjava/lang/String;ILcom/finalshell/core/F_2_3;Z)V
      // 6b: astore 8
      // 6d: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 70: aload 8
      // 72: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 75: aload 8
      // 77: areturn
   }

   public static int X(byte[] var0) {
      DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
      int var2 = 0;

      try {
         var2 = var1.readUnsignedShort();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      try {
         var1.close();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static String S(byte[] var0, int var1) {
      StringBuffer var3;
      var3 = new StringBuffer();
      int var10000 = (Dm4.F$boolean()) ? 1 : 0;
      int var4 = 0;
      boolean var2 = (var10000) != 0;

      while (var4 < var1) {
         var10000 = var4;
         if (var2) {
            if (var4 != 0) {
               var3.append(" ");
            }

            var10000 = var0[var4];
         }

         int var5 = var10000;
         String var6 = Long.toHexString((long)var5);
         if (var2) {
            if (var6.length() == 1) {
               var6 = "0" + var6;
            }

            var3.append(var6);
            var4++;
         }

         if (!var2) {
            break;
         }
      }

      return var3.toString();
   }

   public Qg2(ConnectHost var1, String var2, int var3, String var4, F_2_3 var5) throws Pc2 {
      this.F = var1;
      this.r = var3;
      this.n = var4;
      this.t(var2, var3, var5);
   }

   public void t(String param1, int param2, F_2_3 param3) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 0a: putfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // 0d: aload 0
      // 0e: aload 3
      // 0f: iload 4
      // 11: ifne 33
      // 14: ifnonnull 32
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: new java/net/ServerSocket
      // 21: dup
      // 22: iload 2
      // 23: bipush 0
      // 24: aload 0
      // 25: getfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // 28: invokespecial java/net/ServerSocket.<init> (IILjava/net/InetAddress;)V
      // 2b: goto 3e
      // 2e: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 3
      // 33: iload 2
      // 34: bipush 0
      // 35: aload 0
      // 36: getfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // 39: invokeinterface com/finalshell/core/F_2_3.d (IILjava/net/InetAddress;)Ljava/net/ServerSocket; 4
      // 3e: putfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // 41: goto 83
      // 44: astore 5
      // 46: new java/lang/StringBuilder
      // 49: dup
      // 4a: invokespecial java/lang/StringBuilder.<init> ()V
      // 4d: sipush 32084
      // 50: sipush 10112
      // 53: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 1
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: ldc ":"
      // 5f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62: iload 2
      // 63: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 66: sipush 32093
      // 69: sipush -358
      // 6c: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 75: astore 6
      // 77: new com/finalshell/core/Pc2
      // 7a: dup
      // 7b: aload 6
      // 7d: aload 5
      // 7f: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 82: athrow
      // 83: iload 2
      // 84: iload 4
      // 86: ifne a1
      // 89: ifne b6
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: aload 0
      // 94: getfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // 97: invokevirtual java/net/ServerSocket.getLocalPort ()I
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: istore 5
      // a3: iload 5
      // a5: bipush -1
      // a6: if_icmpeq b6
      // a9: aload 0
      // aa: iload 5
      // ac: putfield com/finalshell/core/Qg2.r I
      // af: goto b6
      // b2: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: return
   }

   public static String[] a(ConnectHost var0) {
      String[] var10;
      boolean var10000 = Dm4.F$boolean();
      Vector var2 = new Vector();
      boolean var1 = var10000;
      synchronized (H) {
         int var4 = 0;

         while (var4 < H.size()) {
            Qg2 var5 = (Qg2)H.elementAt(var4);
            if (var1) {
               if (var1) {
                  if (var5.F == var0) {
                     var2.addElement(var5.r + ":" + var5.E + ":" + var5.q);
                  }

                  var4++;
               }

               if (var1) {
                  continue;
               }
            }
            break;
         }
      }

      String[] var8 = new String[var2.size()];
      int var9 = 0;

      while (true) {
         if (var9 < var2.size()) {
            var10 = var8;
            if (!var1) {
               break;
            }

            var8[var9] = (String)var2.elementAt(var9);
            var9++;
            if (var1) {
               continue;
            }
         }

         var10 = var8;
         break;
      }

      return var10;
   }

   public static Qg2 k(ConnectHost param0, String param1, int param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 3
      // 04: aload 1
      // 05: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 08: astore 4
      // 0a: goto 3f
      // 0d: astore 5
      // 0f: new com/finalshell/core/Pc2
      // 12: dup
      // 13: new java/lang/StringBuilder
      // 16: dup
      // 17: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a: sipush 32070
      // 1d: sipush 13974
      // 20: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 23: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26: aload 1
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: sipush 32089
      // 2d: sipush 30348
      // 30: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 39: aload 5
      // 3b: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3e: athrow
      // 3f: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 42: dup
      // 43: astore 5
      // 45: monitorenter
      // 46: bipush 0
      // 47: istore 6
      // 49: iload 6
      // 4b: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 4e: invokevirtual java/util/Vector.size ()I
      // 51: if_icmpge f0
      // 54: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 57: iload 6
      // 59: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 5c: checkcast com/finalshell/core/Qg2
      // 5f: astore 7
      // 61: iload 3
      // 62: ifeq ec
      // 65: aload 7
      // 67: getfield com/finalshell/core/Qg2.F Lcom/finalshell/crypto/ConnectHost;
      // 6a: aload 0
      // 6b: if_acmpne e9
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 7
      // 77: getfield com/finalshell/core/Qg2.r I
      // 7a: iload 2
      // 7b: if_icmpne e9
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: getstatic com/finalshell/core/Qg2.O Ljava/net/InetAddress;
      // 88: iload 3
      // 89: ifeq d4
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: ifnull bd
      // 96: goto 9d
      // 99: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: aload 7
      // 9f: iload 3
      // a0: ifeq e8
      // a3: goto aa
      // a6: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: getfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // ad: getstatic com/finalshell/core/Qg2.O Ljava/net/InetAddress;
      // b0: invokevirtual java/net/InetAddress.equals (Ljava/lang/Object;)Z
      // b3: ifne dc
      // b6: goto bd
      // b9: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc: athrow
      // bd: aload 7
      // bf: iload 3
      // c0: ifeq e8
      // c3: goto ca
      // c6: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: getfield com/finalshell/core/Qg2.D Ljava/net/InetAddress;
      // cd: goto d4
      // d0: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: aload 4
      // d6: invokevirtual java/net/InetAddress.equals (Ljava/lang/Object;)Z
      // d9: ifeq e9
      // dc: aload 7
      // de: aload 5
      // e0: monitorexit
      // e1: goto e8
      // e4: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e7: athrow
      // e8: areturn
      // e9: iinc 6 1
      // ec: iload 3
      // ed: ifne 49
      // f0: aconst_null
      // f1: aload 5
      // f3: monitorexit
      // f4: areturn
      // f5: astore 8
      // f7: aload 5
      // f9: monitorexit
      // fa: aload 8
      // fc: athrow
   }

   public static String t(String var0) {
      boolean var3;
      boolean var1 = Dm4.F$boolean();
      String var10000 = var0;
      if (var1) {
         label35:
         if (var0 != null) {
            label39: {
               label32: {
                  var10000 = var0;
                  if (var1) {
                     if (var0.length() != 0) {
                        var3 = var0.equals("*");
                        if (!var1) {
                           break label39;
                        }

                        if (!var3) {
                           break label32;
                        }
                     }

                     var10000 = a(32083, -28403);
                  }

                  var0 = var10000;
                  if (var1) {
                     break label35;
                  }
               }

               if (!var1) {
                  return var0;
               }

               var3 = var0.equals(a(32080, -13382));
            }

            if (var3) {
               var0 = a(32082, -27538);
            }
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static Qg2 k(ConnectHost param0, String param1, int param2, String param3, int param4, F_2_3 param5) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 1
      // 04: invokestatic com/finalshell/core/Qg2.t (Ljava/lang/String;)Ljava/lang/String;
      // 07: astore 1
      // 08: istore 6
      // 0a: aload 0
      // 0b: aload 1
      // 0c: iload 2
      // 0d: invokestatic com/finalshell/core/Qg2.k (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;I)Lcom/finalshell/core/Qg2;
      // 10: iload 6
      // 12: ifeq 69
      // 15: ifnull 5a
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: new com/finalshell/core/Pc2
      // 22: dup
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: sipush 32095
      // 2d: sipush 2698
      // 30: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: aload 1
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: ldc ":"
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: iload 2
      // 40: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 43: sipush 32087
      // 46: sipush 4275
      // 49: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 55: athrow
      // 56: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: new com/finalshell/core/Qg2
      // 5d: dup
      // 5e: aload 0
      // 5f: aload 1
      // 60: iload 2
      // 61: aload 3
      // 62: iload 4
      // 64: aload 5
      // 66: invokespecial com/finalshell/core/Qg2.<init> (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;ILjava/lang/String;ILcom/finalshell/core/F_2_3;)V
      // 69: astore 7
      // 6b: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 6e: aload 7
      // 70: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 73: aload 7
      // 75: areturn
   }

   public static void t(ConnectHost param0, String param1, int param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokestatic com/finalshell/core/Qg2.t (Ljava/lang/String;)Ljava/lang/String;
      // 04: astore 1
      // 05: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 08: aload 0
      // 09: aload 1
      // 0a: iload 2
      // 0b: invokestatic com/finalshell/core/Qg2.k (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;I)Lcom/finalshell/core/Qg2;
      // 0e: astore 4
      // 10: istore 3
      // 11: aload 4
      // 13: iload 3
      // 14: ifeq 5e
      // 17: ifnonnull 5c
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: new com/finalshell/core/Pc2
      // 24: dup
      // 25: new java/lang/StringBuilder
      // 28: dup
      // 29: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c: sipush 32095
      // 2f: sipush 2698
      // 32: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 35: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38: aload 1
      // 39: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c: ldc ":"
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: iload 2
      // 42: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 45: sipush 32092
      // 48: sipush -28391
      // 4b: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 54: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 57: athrow
      // 58: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 4
      // 5e: invokevirtual com/finalshell/core/Qg2.S ()V
      // 61: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 64: aload 4
      // 66: invokevirtual java/util/Vector.removeElement (Ljava/lang/Object;)Z
      // 69: pop
      // 6a: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void G(ConnectHost var0) {
      boolean var10000 = Dm4.F$boolean();
      Vector var2 = H;
      synchronized (H){} // $VF: monitorenter 
      boolean var1 = var10000;

      try {
         Qg2[] var3 = new Qg2[H.size()];
         int var4 = 0;
         int var5 = 0;

         label93:
         while (true) {
            if (var5 < H.size()) {
               Qg2 var6 = (Qg2)H.elementAt(var5);
               if (var1) {
                  if (var1) {
                     if (var6.F == var0) {
                        var6.S();
                        var3[var4++] = var6;
                     }

                     var5++;
                     if (var1) {
                        continue;
                     }

                     var5 = 0;
                  } else {
                     H.removeElement(var6);
                     var5++;
                     if (!var1) {
                        return;
                     }

                     if (!var1) {
                        break;
                     }
                  }
               } else {
                  if (var1) {
                     continue;
                  }

                  var5 = 0;
               }
            } else {
               var5 = 0;
            }

            while (true) {
               if (var5 >= var4) {
                  break label93;
               }

               Qg2 var11 = var3[var5];
               H.removeElement(var11);
               var5++;
               if (!var1) {
                  return;
               }

               if (!var1) {
                  break label93;
               }
            }
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public Qg2(ConnectHost var1, String var2, int var3, String var4, int var5, F_2_3 var6) throws Pc2 {
      this.F = var1;
      this.r = var3;
      this.E = var4;
      this.q = var5;
      this.t(var2, var3, var6);
   }

   public static Qg2 Y(ConnectHost param0, String param1, int param2, String param3, F_2_3 param4) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 1
      // 04: invokestatic com/finalshell/core/Qg2.t (Ljava/lang/String;)Ljava/lang/String;
      // 07: astore 6
      // 09: istore 5
      // 0b: aload 0
      // 0c: aload 6
      // 0e: iload 2
      // 0f: invokestatic com/finalshell/core/Qg2.k (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;I)Lcom/finalshell/core/Qg2;
      // 12: iload 5
      // 14: ifne 6b
      // 17: ifnull 5d
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: new com/finalshell/core/Pc2
      // 24: dup
      // 25: new java/lang/StringBuilder
      // 28: dup
      // 29: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c: sipush 32095
      // 2f: sipush 2698
      // 32: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 35: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38: aload 6
      // 3a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d: ldc ":"
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: iload 2
      // 43: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 46: sipush 32086
      // 49: sipush 23972
      // 4c: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 55: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 58: athrow
      // 59: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: new com/finalshell/core/Qg2
      // 60: dup
      // 61: aload 0
      // 62: aload 6
      // 64: iload 2
      // 65: aload 3
      // 66: aload 4
      // 68: invokespecial com/finalshell/core/Qg2.<init> (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;ILjava/lang/String;Lcom/finalshell/core/F_2_3;)V
      // 6b: astore 7
      // 6d: getstatic com/finalshell/core/Qg2.H Ljava/util/Vector;
      // 70: aload 7
      // 72: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 75: aload 7
      // 77: areturn
   }

   public void E() {
      Object[] var3;
      boolean var10000 = Dm4.F$boolean();
      this.t = this::E;
      boolean var1 = var10000;

      try {
         while (this.t != null) {
            Socket var2 = this.b.accept();

            try {
               Ref.g(388376917454860932L, null);
               Object[] var10001 = Registry.packArgs(new WD3(this, var2));
               long var4 = 434592463220957006L;
               var3 = var10001;
               Ref.h(434592463220957006L, var3, var4);

               try {
                  ;
               } catch (InvocationTargetException var5) {
                  throw new RuntimeException(var5.getTargetException());
               }

               if (!var1 || !var1) {
                  break;
               }
            } catch (Exception var6) {
               throw new RuntimeException(a(var6));
            }
         }
      } catch (Exception var7) {
      }
   }

   public void I(Socket param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 1
      // 004: bipush 1
      // 005: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 008: istore 2
      // 009: aload 1
      // 00a: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 00d: astore 3
      // 00e: aload 1
      // 00f: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 012: astore 4
      // 014: aload 0
      // 015: getfield com/finalshell/core/Qg2.n Ljava/lang/String;
      // 018: iload 2
      // 019: ifne 031
      // 01c: ifnull 08f
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 0
      // 027: getfield com/finalshell/core/Qg2.n Ljava/lang/String;
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: invokevirtual java/lang/String.length ()I
      // 034: ifle 08f
      // 037: new com/finalshell/core/DX3
      // 03a: dup
      // 03b: invokespecial com/finalshell/core/DX3.<init> ()V
      // 03e: astore 5
      // 040: aload 5
      // 042: aload 0
      // 043: getfield com/finalshell/core/Qg2.F Lcom/finalshell/crypto/ConnectHost;
      // 046: invokevirtual com/finalshell/core/DX3.D (Lcom/finalshell/crypto/ConnectHost;)V
      // 049: aload 5
      // 04b: invokevirtual com/finalshell/core/DX3.n ()V
      // 04e: aload 5
      // 050: aload 3
      // 051: invokevirtual com/finalshell/core/DX3.X (Ljava/io/InputStream;)V
      // 054: aload 5
      // 056: aload 4
      // 058: invokevirtual com/finalshell/core/DX3.D (Ljava/io/OutputStream;)V
      // 05b: aload 0
      // 05c: getfield com/finalshell/core/Qg2.F Lcom/finalshell/crypto/ConnectHost;
      // 05f: aload 5
      // 061: invokevirtual com/finalshell/crypto/ConnectHost.j (Lcom/finalshell/core/Dm4;)V
      // 064: aload 5
      // 066: aload 0
      // 067: getfield com/finalshell/core/Qg2.n Ljava/lang/String;
      // 06a: invokevirtual com/finalshell/core/DX3.E (Ljava/lang/String;)V
      // 06d: aload 5
      // 06f: aload 1
      // 070: invokevirtual java/net/Socket.getInetAddress ()Ljava/net/InetAddress;
      // 073: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 076: invokevirtual com/finalshell/core/DX3.s (Ljava/lang/String;)V
      // 079: aload 5
      // 07b: aload 1
      // 07c: invokevirtual java/net/Socket.getPort ()I
      // 07f: invokevirtual com/finalshell/core/DX3.a (I)V
      // 082: aload 5
      // 084: aload 0
      // 085: getfield com/finalshell/core/Qg2.m I
      // 088: invokevirtual com/finalshell/core/DX3.I (I)V
      // 08b: iload 2
      // 08c: ifeq 37a
      // 08f: new com/finalshell/core/DZ3
      // 092: dup
      // 093: invokespecial com/finalshell/core/DZ3.<init> ()V
      // 096: astore 5
      // 098: aload 5
      // 09a: aload 0
      // 09b: getfield com/finalshell/core/Qg2.F Lcom/finalshell/crypto/ConnectHost;
      // 09e: invokevirtual com/finalshell/core/DZ3.D (Lcom/finalshell/crypto/ConnectHost;)V
      // 0a1: aload 5
      // 0a3: invokevirtual com/finalshell/core/DZ3.n ()V
      // 0a6: aload 5
      // 0a8: aload 3
      // 0a9: invokevirtual com/finalshell/core/DZ3.X (Ljava/io/InputStream;)V
      // 0ac: aload 5
      // 0ae: aload 4
      // 0b0: invokevirtual com/finalshell/core/DZ3.D (Ljava/io/OutputStream;)V
      // 0b3: aload 0
      // 0b4: getfield com/finalshell/core/Qg2.F Lcom/finalshell/crypto/ConnectHost;
      // 0b7: aload 5
      // 0b9: invokevirtual com/finalshell/crypto/ConnectHost.j (Lcom/finalshell/core/Dm4;)V
      // 0bc: aload 0
      // 0bd: getfield com/finalshell/core/Qg2.Q Z
      // 0c0: iload 2
      // 0c1: ifne 376
      // 0c4: ifeq 341
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: new java/io/DataInputStream
      // 0d1: dup
      // 0d2: aload 1
      // 0d3: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 0d6: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 0d9: astore 6
      // 0db: sipush 10085
      // 0de: new java/io/DataOutputStream
      // 0e1: dup
      // 0e2: aload 1
      // 0e3: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 0e6: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 0e9: astore 7
      // 0eb: ldc2_w 109275185607992420
      // 0ee: invokestatic com/finalshell/core/Qg2.a (IJ)I
      // 0f1: istore 8
      // 0f3: bipush 3
      // 0f4: newarray 8
      // 0f6: astore 9
      // 0f8: bipush 0
      // 0f9: istore 10
      // 0fb: iload 8
      // 0fd: newarray 8
      // 0ff: astore 11
      // 101: bipush 0
      // 102: istore 12
      // 104: aconst_null
      // 105: astore 13
      // 107: bipush 0
      // 108: istore 14
      // 10a: aload 6
      // 10c: aload 9
      // 10e: invokevirtual java/io/DataInputStream.read ([B)I
      // 111: istore 10
      // 113: aload 7
      // 115: bipush 2
      // 116: newarray 8
      // 118: dup
      // 119: bipush 0
      // 11a: bipush 5
      // 11b: bastore
      // 11c: dup
      // 11d: bipush 1
      // 11e: bipush 0
      // 11f: bastore
      // 120: invokevirtual java/io/DataOutputStream.write ([B)V
      // 123: aload 6
      // 125: aload 11
      // 127: invokevirtual java/io/DataInputStream.read ([B)I
      // 12a: istore 12
      // 12c: bipush 0
      // 12d: istore 15
      // 12f: iload 2
      // 130: ifne 14a
      // 133: iload 12
      // 135: ifge 14b
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: aload 1
      // 140: invokevirtual java/net/Socket.close ()V
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: return
      // 14b: aload 11
      // 14d: iload 12
      // 14f: invokestatic com/finalshell/core/Qg2.S ([BI)Ljava/lang/String;
      // 152: astore 16
      // 154: aload 16
      // 156: sipush 32091
      // 159: sipush 20032
      // 15c: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 15f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 162: iload 2
      // 163: ifne 19b
      // 166: ifeq 186
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: aload 6
      // 172: aload 11
      // 174: invokevirtual java/io/DataInputStream.read ([B)I
      // 177: istore 12
      // 179: aload 11
      // 17b: iload 12
      // 17d: invokestatic com/finalshell/core/Qg2.S ([BI)Ljava/lang/String;
      // 180: astore 16
      // 182: iload 2
      // 183: ifeq 1bb
      // 186: aload 16
      // 188: sipush 32071
      // 18b: sipush 17222
      // 18e: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 191: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: iload 2
      // 19c: ifne 1c9
      // 19f: ifeq 1bb
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a8: athrow
      // 1a9: aload 6
      // 1ab: aload 11
      // 1ad: invokevirtual java/io/DataInputStream.read ([B)I
      // 1b0: istore 12
      // 1b2: aload 11
      // 1b4: iload 12
      // 1b6: invokestatic com/finalshell/core/Qg2.S ([BI)Ljava/lang/String;
      // 1b9: astore 16
      // 1bb: aload 16
      // 1bd: sipush 32085
      // 1c0: sipush 313
      // 1c3: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 1c6: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1c9: iload 2
      // 1ca: ifne 215
      // 1cd: ifeq 207
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: aload 11
      // 1d9: bipush 4
      // 1da: baload
      // 1db: istore 17
      // 1dd: new java/lang/String
      // 1e0: dup
      // 1e1: aload 11
      // 1e3: bipush 5
      // 1e4: iload 17
      // 1e6: invokespecial java/lang/String.<init> ([BII)V
      // 1e9: astore 13
      // 1eb: bipush 2
      // 1ec: newarray 8
      // 1ee: astore 18
      // 1f0: aload 11
      // 1f2: iload 12
      // 1f4: bipush 2
      // 1f5: isub
      // 1f6: aload 18
      // 1f8: bipush 0
      // 1f9: bipush 2
      // 1fa: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1fd: aload 18
      // 1ff: invokestatic com/finalshell/core/Qg2.G ([B)I
      // 202: istore 14
      // 204: goto 30a
      // 207: aload 16
      // 209: sipush 32094
      // 20c: sipush 27078
      // 20f: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 212: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 215: iload 2
      // 216: ifne 266
      // 219: ifeq 258
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: bipush 4
      // 224: newarray 8
      // 226: astore 17
      // 228: aload 11
      // 22a: bipush 4
      // 22b: aload 17
      // 22d: bipush 0
      // 22e: bipush 4
      // 22f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 232: aload 17
      // 234: invokestatic java/net/InetAddress.getByAddress ([B)Ljava/net/InetAddress;
      // 237: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 23a: astore 13
      // 23c: bipush 2
      // 23d: newarray 8
      // 23f: astore 18
      // 241: aload 11
      // 243: iload 12
      // 245: bipush 2
      // 246: isub
      // 247: aload 18
      // 249: bipush 0
      // 24a: bipush 2
      // 24b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 24e: aload 18
      // 250: invokestatic com/finalshell/core/Qg2.G ([B)I
      // 253: istore 14
      // 255: goto 30a
      // 258: aload 16
      // 25a: sipush 32088
      // 25d: sipush 29537
      // 260: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 263: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 266: iload 2
      // 267: ifne 2c7
      // 26a: ifeq 2b9
      // 26d: goto 274
      // 270: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 273: athrow
      // 274: sipush 12512
      // 277: ldc2_w 1318924485657162722
      // 27a: invokestatic com/finalshell/core/Qg2.a (IJ)I
      // 27d: newarray 8
      // 27f: astore 17
      // 281: aload 11
      // 283: bipush 4
      // 284: aload 17
      // 286: bipush 0
      // 287: sipush 3517
      // 28a: ldc2_w 2591766454367178429
      // 28d: invokestatic com/finalshell/core/Qg2.a (IJ)I
      // 290: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 293: aload 17
      // 295: invokestatic java/net/InetAddress.getByAddress ([B)Ljava/net/InetAddress;
      // 298: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 29b: astore 13
      // 29d: bipush 2
      // 29e: newarray 8
      // 2a0: astore 18
      // 2a2: aload 11
      // 2a4: iload 12
      // 2a6: bipush 2
      // 2a7: isub
      // 2a8: aload 18
      // 2aa: bipush 0
      // 2ab: bipush 2
      // 2ac: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2af: aload 18
      // 2b1: invokestatic com/finalshell/core/Qg2.G ([B)I
      // 2b4: istore 14
      // 2b6: goto 30a
      // 2b9: aload 16
      // 2bb: sipush 32081
      // 2be: sipush 6422
      // 2c1: invokestatic com/finalshell/core/Qg2.a (II)Ljava/lang/String;
      // 2c4: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2c7: iload 2
      // 2c8: ifne 2d6
      // 2cb: ifeq 30a
      // 2ce: goto 2d5
      // 2d1: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d4: athrow
      // 2d5: bipush 4
      // 2d6: newarray 8
      // 2d8: astore 17
      // 2da: aload 11
      // 2dc: bipush 4
      // 2dd: aload 17
      // 2df: bipush 0
      // 2e0: bipush 4
      // 2e1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2e4: aload 17
      // 2e6: invokestatic java/net/InetAddress.getByAddress ([B)Ljava/net/InetAddress;
      // 2e9: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 2ec: astore 13
      // 2ee: bipush 2
      // 2ef: newarray 8
      // 2f1: astore 18
      // 2f3: aload 11
      // 2f5: iload 12
      // 2f7: bipush 2
      // 2f8: isub
      // 2f9: aload 18
      // 2fb: bipush 0
      // 2fc: bipush 2
      // 2fd: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 300: aload 18
      // 302: invokestatic com/finalshell/core/Qg2.G ([B)I
      // 305: istore 14
      // 307: bipush 1
      // 308: istore 15
      // 30a: iload 15
      // 30c: ifne 32c
      // 30f: new com/finalshell/core/JX
      // 312: dup
      // 313: bipush 0
      // 314: aload 1
      // 315: invokevirtual java/net/Socket.getLocalAddress ()Ljava/net/InetAddress;
      // 318: aload 1
      // 319: invokevirtual java/net/Socket.getLocalPort ()I
      // 31c: invokespecial com/finalshell/core/JX.<init> (ILjava/net/InetAddress;I)V
      // 31f: astore 17
      // 321: aload 17
      // 323: aload 7
      // 325: invokevirtual com/finalshell/core/JX.l (Ljava/io/OutputStream;)V
      // 328: iload 2
      // 329: ifeq 335
      // 32c: aload 1
      // 32d: invokevirtual java/net/Socket.close ()V
      // 330: return
      // 331: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 334: athrow
      // 335: aload 0
      // 336: aload 13
      // 338: putfield com/finalshell/core/Qg2.E Ljava/lang/String;
      // 33b: aload 0
      // 33c: iload 14
      // 33e: putfield com/finalshell/core/Qg2.q I
      // 341: aload 5
      // 343: aload 0
      // 344: getfield com/finalshell/core/Qg2.E Ljava/lang/String;
      // 347: invokevirtual com/finalshell/core/DZ3.e (Ljava/lang/String;)V
      // 34a: aload 5
      // 34c: aload 0
      // 34d: getfield com/finalshell/core/Qg2.q I
      // 350: invokevirtual com/finalshell/core/DZ3.t (I)V
      // 353: aload 5
      // 355: aload 1
      // 356: invokevirtual java/net/Socket.getInetAddress ()Ljava/net/InetAddress;
      // 359: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 35c: invokevirtual com/finalshell/core/DZ3.s (Ljava/lang/String;)V
      // 35f: aload 5
      // 361: aload 1
      // 362: invokevirtual java/net/Socket.getPort ()I
      // 365: invokevirtual com/finalshell/core/DZ3.a (I)V
      // 368: aload 5
      // 36a: aload 0
      // 36b: getfield com/finalshell/core/Qg2.m I
      // 36e: invokevirtual com/finalshell/core/DZ3.I (I)V
      // 371: aload 5
      // 373: getfield com/finalshell/core/DZ3.d I
      // 376: bipush -1
      // 377: if_icmpeq 37a
      // 37a: return
   }

   public static int G(byte[] var0) {
      DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0));
      int var2 = 0;

      try {
         var2 = var1.readUnsignedShort();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      try {
         var1.close();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public void S() {
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
      // 04: aconst_null
      // 05: putfield com/finalshell/core/Qg2.t Ljava/lang/Runnable;
      // 08: istore 1
      // 09: aload 0
      // 0a: iload 1
      // 0b: ifne 2a
      // 0e: getfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // 11: ifnull 29
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // 1f: invokevirtual java/net/ServerSocket.close ()V
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Qg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: aconst_null
      // 2b: putfield com/finalshell/core/Qg2.b Ljava/net/ServerSocket;
      // 2e: goto 32
      // 31: astore 2
      // 32: return
   }

   public void V(int var1) {
      this.m = var1;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 32086) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 89;
               break;
            case 1:
               var10000 = 118;
               break;
            case 2:
               var10000 = 183;
               break;
            case 3:
               var10000 = 8;
               break;
            case 4:
               var10000 = 189;
               break;
            case 5:
               var10000 = 251;
               break;
            case 6:
               var10000 = 80;
               break;
            case 7:
               var10000 = 115;
               break;
            case 8:
               var10000 = 58;
               break;
            case 9:
               var10000 = 230;
               break;
            case 10:
               var10000 = 39;
               break;
            case 11:
               var10000 = 214;
               break;
            case 12:
               var10000 = 177;
               break;
            case 13:
               var10000 = 45;
               break;
            case 14:
               var10000 = 159;
               break;
            case 15:
               var10000 = 78;
               break;
            case 16:
               var10000 = 99;
               break;
            case 17:
               var10000 = 236;
               break;
            case 18:
               var10000 = 103;
               break;
            case 19:
               var10000 = 154;
               break;
            case 20:
               var10000 = 7;
               break;
            case 21:
               var10000 = 67;
               break;
            case 22:
               var10000 = 119;
               break;
            case 23:
               var10000 = 213;
               break;
            case 24:
               var10000 = 111;
               break;
            case 25:
               var10000 = 59;
               break;
            case 26:
               var10000 = 233;
               break;
            case 27:
               var10000 = 240;
               break;
            case 28:
               var10000 = 113;
               break;
            case 29:
               var10000 = 64;
               break;
            case 30:
               var10000 = 9;
               break;
            case 31:
               var10000 = 87;
               break;
            case 32:
               var10000 = 175;
               break;
            case 33:
               var10000 = 35;
               break;
            case 34:
               var10000 = 42;
               break;
            case 35:
               var10000 = 149;
               break;
            case 36:
               var10000 = 191;
               break;
            case 37:
               var10000 = 226;
               break;
            case 38:
               var10000 = 19;
               break;
            case 39:
               var10000 = 193;
               break;
            case 40:
               var10000 = 21;
               break;
            case 41:
               var10000 = 61;
               break;
            case 42:
               var10000 = 31;
               break;
            case 43:
               var10000 = 186;
               break;
            case 44:
               var10000 = 162;
               break;
            case 45:
               var10000 = 84;
               break;
            case 46:
               var10000 = 16;
               break;
            case 47:
               var10000 = 37;
               break;
            case 48:
               var10000 = 209;
               break;
            case 49:
               var10000 = 203;
               break;
            case 50:
               var10000 = 86;
               break;
            case 51:
               var10000 = 63;
               break;
            case 52:
               var10000 = 238;
               break;
            case 53:
               var10000 = 126;
               break;
            case 54:
               var10000 = 151;
               break;
            case 55:
               var10000 = 41;
               break;
            case 56:
               var10000 = 123;
               break;
            case 57:
               var10000 = 130;
               break;
            case 58:
               var10000 = 70;
               break;
            case 59:
               var10000 = 11;
               break;
            case 60:
               var10000 = 136;
               break;
            case 61:
               var10000 = 143;
               break;
            case 62:
               var10000 = 222;
               break;
            case 63:
               var10000 = 66;
               break;
            case 64:
               var10000 = 173;
               break;
            case 65:
               var10000 = 28;
               break;
            case 66:
               var10000 = 98;
               break;
            case 67:
               var10000 = 192;
               break;
            case 68:
               var10000 = 91;
               break;
            case 69:
               var10000 = 50;
               break;
            case 70:
               var10000 = 51;
               break;
            case 71:
               var10000 = 43;
               break;
            case 72:
               var10000 = 211;
               break;
            case 73:
               var10000 = 132;
               break;
            case 74:
               var10000 = 181;
               break;
            case 75:
               var10000 = 69;
               break;
            case 76:
               var10000 = 46;
               break;
            case 77:
               var10000 = 140;
               break;
            case 78:
               var10000 = 232;
               break;
            case 79:
               var10000 = 96;
               break;
            case 80:
               var10000 = 163;
               break;
            case 81:
               var10000 = 25;
               break;
            case 82:
               var10000 = 146;
               break;
            case 83:
               var10000 = 250;
               break;
            case 84:
               var10000 = 13;
               break;
            case 85:
               var10000 = 174;
               break;
            case 86:
               var10000 = 144;
               break;
            case 87:
               var10000 = 33;
               break;
            case 88:
               var10000 = 161;
               break;
            case 89:
               var10000 = 22;
               break;
            case 90:
               var10000 = 44;
               break;
            case 91:
               var10000 = 5;
               break;
            case 92:
               var10000 = 62;
               break;
            case 93:
               var10000 = 228;
               break;
            case 94:
               var10000 = 14;
               break;
            case 95:
               var10000 = 225;
               break;
            case 96:
               var10000 = 243;
               break;
            case 97:
               var10000 = 30;
               break;
            case 98:
               var10000 = 157;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 224;
               break;
            case 101:
               var10000 = 95;
               break;
            case 102:
               var10000 = 23;
               break;
            case 103:
               var10000 = 73;
               break;
            case 104:
               var10000 = 97;
               break;
            case 105:
               var10000 = 112;
               break;
            case 106:
               var10000 = 90;
               break;
            case 107:
               var10000 = 198;
               break;
            case 108:
               var10000 = 15;
               break;
            case 109:
               var10000 = 241;
               break;
            case 110:
               var10000 = 60;
               break;
            case 111:
               var10000 = 124;
               break;
            case 112:
               var10000 = 83;
               break;
            case 113:
               var10000 = 142;
               break;
            case 114:
               var10000 = 204;
               break;
            case 115:
               var10000 = 253;
               break;
            case 116:
               var10000 = 200;
               break;
            case 117:
               var10000 = 190;
               break;
            case 118:
               var10000 = 221;
               break;
            case 119:
               var10000 = 93;
               break;
            case 120:
               var10000 = 217;
               break;
            case 121:
               var10000 = 125;
               break;
            case 122:
               var10000 = 187;
               break;
            case 123:
               var10000 = 194;
               break;
            case 124:
               var10000 = 12;
               break;
            case 125:
               var10000 = 77;
               break;
            case 126:
               var10000 = 1;
               break;
            case 127:
               var10000 = 74;
               break;
            case 128:
               var10000 = 102;
               break;
            case 129:
               var10000 = 52;
               break;
            case 130:
               var10000 = 148;
               break;
            case 131:
               var10000 = 227;
               break;
            case 132:
               var10000 = 207;
               break;
            case 133:
               var10000 = 27;
               break;
            case 134:
               var10000 = 29;
               break;
            case 135:
               var10000 = 182;
               break;
            case 136:
               var10000 = 196;
               break;
            case 137:
               var10000 = 6;
               break;
            case 138:
               var10000 = 252;
               break;
            case 139:
               var10000 = 72;
               break;
            case 140:
               var10000 = 116;
               break;
            case 141:
               var10000 = 100;
               break;
            case 142:
               var10000 = 56;
               break;
            case 143:
               var10000 = 129;
               break;
            case 144:
               var10000 = 120;
               break;
            case 145:
               var10000 = 131;
               break;
            case 146:
               var10000 = 32;
               break;
            case 147:
               var10000 = 82;
               break;
            case 148:
               var10000 = 0;
               break;
            case 149:
               var10000 = 201;
               break;
            case 150:
               var10000 = 133;
               break;
            case 151:
               var10000 = 141;
               break;
            case 152:
               var10000 = 3;
               break;
            case 153:
               var10000 = 199;
               break;
            case 154:
               var10000 = 205;
               break;
            case 155:
               var10000 = 234;
               break;
            case 156:
               var10000 = 244;
               break;
            case 157:
               var10000 = 128;
               break;
            case 158:
               var10000 = 106;
               break;
            case 159:
               var10000 = 24;
               break;
            case 160:
               var10000 = 212;
               break;
            case 161:
               var10000 = 176;
               break;
            case 162:
               var10000 = 38;
               break;
            case 163:
               var10000 = 219;
               break;
            case 164:
               var10000 = 178;
               break;
            case 165:
               var10000 = 18;
               break;
            case 166:
               var10000 = 122;
               break;
            case 167:
               var10000 = 197;
               break;
            case 168:
               var10000 = 216;
               break;
            case 169:
               var10000 = 168;
               break;
            case 170:
               var10000 = 152;
               break;
            case 171:
               var10000 = 36;
               break;
            case 172:
               var10000 = 40;
               break;
            case 173:
               var10000 = 220;
               break;
            case 174:
               var10000 = 109;
               break;
            case 175:
               var10000 = 92;
               break;
            case 176:
               var10000 = 237;
               break;
            case 177:
               var10000 = 223;
               break;
            case 178:
               var10000 = 184;
               break;
            case 179:
               var10000 = 231;
               break;
            case 180:
               var10000 = 206;
               break;
            case 181:
               var10000 = 121;
               break;
            case 182:
               var10000 = 48;
               break;
            case 183:
               var10000 = 169;
               break;
            case 184:
               var10000 = 153;
               break;
            case 185:
               var10000 = 160;
               break;
            case 186:
               var10000 = 145;
               break;
            case 187:
               var10000 = 137;
               break;
            case 188:
               var10000 = 49;
               break;
            case 189:
               var10000 = 179;
               break;
            case 190:
               var10000 = 110;
               break;
            case 191:
               var10000 = 138;
               break;
            case 192:
               var10000 = 108;
               break;
            case 193:
               var10000 = 20;
               break;
            case 194:
               var10000 = 242;
               break;
            case 195:
               var10000 = 65;
               break;
            case 196:
               var10000 = 117;
               break;
            case 197:
               var10000 = 26;
               break;
            case 198:
               var10000 = 134;
               break;
            case 199:
               var10000 = 85;
               break;
            case 200:
               var10000 = 210;
               break;
            case 201:
               var10000 = 139;
               break;
            case 202:
               var10000 = 55;
               break;
            case 203:
               var10000 = 195;
               break;
            case 204:
               var10000 = 71;
               break;
            case 205:
               var10000 = 215;
               break;
            case 206:
               var10000 = 255;
               break;
            case 207:
               var10000 = 10;
               break;
            case 208:
               var10000 = 150;
               break;
            case 209:
               var10000 = 94;
               break;
            case 210:
               var10000 = 254;
               break;
            case 211:
               var10000 = 76;
               break;
            case 212:
               var10000 = 147;
               break;
            case 213:
               var10000 = 88;
               break;
            case 214:
               var10000 = 229;
               break;
            case 215:
               var10000 = 170;
               break;
            case 216:
               var10000 = 79;
               break;
            case 217:
               var10000 = 171;
               break;
            case 218:
               var10000 = 155;
               break;
            case 219:
               var10000 = 104;
               break;
            case 220:
               var10000 = 34;
               break;
            case 221:
               var10000 = 185;
               break;
            case 222:
               var10000 = 158;
               break;
            case 223:
               var10000 = 167;
               break;
            case 224:
               var10000 = 246;
               break;
            case 225:
               var10000 = 247;
               break;
            case 226:
               var10000 = 101;
               break;
            case 227:
               var10000 = 114;
               break;
            case 228:
               var10000 = 239;
               break;
            case 229:
               var10000 = 235;
               break;
            case 230:
               var10000 = 188;
               break;
            case 231:
               var10000 = 81;
               break;
            case 232:
               var10000 = 164;
               break;
            case 233:
               var10000 = 107;
               break;
            case 234:
               var10000 = 208;
               break;
            case 235:
               var10000 = 218;
               break;
            case 236:
               var10000 = 245;
               break;
            case 237:
               var10000 = 165;
               break;
            case 238:
               var10000 = 249;
               break;
            case 239:
               var10000 = 105;
               break;
            case 240:
               var10000 = 166;
               break;
            case 241:
               var10000 = 202;
               break;
            case 242:
               var10000 = 2;
               break;
            case 243:
               var10000 = 248;
               break;
            case 244:
               var10000 = 135;
               break;
            case 245:
               var10000 = 172;
               break;
            case 246:
               var10000 = 156;
               break;
            case 247:
               var10000 = 57;
               break;
            case 248:
               var10000 = 127;
               break;
            case 249:
               var10000 = 75;
               break;
            case 250:
               var10000 = 4;
               break;
            case 251:
               var10000 = 54;
               break;
            case 252:
               var10000 = 180;
               break;
            case 253:
               var10000 = 68;
               break;
            case 254:
               var10000 = 53;
               break;
            default:
               var10000 = 17;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3;
      var3 = var0 ^ (int)(var1 & 32767L) ^ 17152;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      int var3;
      char[] var32;
      String[] var13 = new String[19];
      int var11 = 0;
      var10 = "\u009aöd{×½E²P\u009bÿ\u009cARòOÆ\u0018\u0087\u0011ÜûÙ\u0017§eÃ\t#óÛ{\u0083¢\u0085»\u000e¶\u001bÓû\u008b c(µG\u001c\u0091kzZ\u0012D>ü?\u0014\u000fðý½Ñ£¿¤\u009b\u008c\u0010sÊ\u009fÓØ\u0016\u0087\u000biú[=Y+\u008cð\"x\u0092\tó¸>\u008c\u0001Î¦\u009dv\u0007R¦,Ð¤E\u0012\tE9J\u0005\r\u001f¯t¦\u000bÃ«\u000e\u0017ñnÛXÈmÍ\u000b£k\u0002\u000frmé8\u008ea\u0005\u001cN\u009f\u0081Äm\u0097Ñ\u0086Â[°\u0019\n\u0080/\u0004`P`\u0012o %å.\u0097©n\u0013e:\u009bâ'\u008d³\u0092[sñé\\\u008dr\u009c\u0082\n\u0090\u0011\u000f\u009eÄs\u009c8Ä$¥¥{8¾Üº\u0081º\u0007:Ó!~\u0005\u0090&\u0005ÌÑïÜÌ\u000bIT_èÙ\u0091\u009c§ \u0092Õ\u000b\u001d6\u0097\u007fÈÕð\u0016t\u0082¨!\u0015äê«\u0000z|;wì\u0006ïÜ^õß;.\nm\u0003øáú\u0099ñé\u0097&Úë g";
      int var12 = "\u009aöd{×½E²P\u009bÿ\u009cARòOÆ\u0018\u0087\u0011ÜûÙ\u0017§eÃ\t#óÛ{\u0083¢\u0085»\u000e¶\u001bÓû\u008b c(µG\u001c\u0091kzZ\u0012D>ü?\u0014\u000fðý½Ñ£¿¤\u009b\u008c\u0010sÊ\u009fÓØ\u0016\u0087\u000biú[=Y+\u008cð\"x\u0092\tó¸>\u008c\u0001Î¦\u009dv\u0007R¦,Ð¤E\u0012\tE9J\u0005\r\u001f¯t¦\u000bÃ«\u000e\u0017ñnÛXÈmÍ\u000b£k\u0002\u000frmé8\u008ea\u0005\u001cN\u009f\u0081Äm\u0097Ñ\u0086Â[°\u0019\n\u0080/\u0004`P`\u0012o %å.\u0097©n\u0013e:\u009bâ'\u008d³\u0092[sñé\\\u008dr\u009c\u0082\n\u0090\u0011\u000f\u009eÄs\u009c8Ä$¥¥{8¾Üº\u0081º\u0007:Ó!~\u0005\u0090&\u0005ÌÑïÜÌ\u000bIT_èÙ\u0091\u009c§ \u0092Õ\u000b\u001d6\u0097\u007fÈÕð\u0016t\u0082¨!\u0015äê«\u0000z|;wì\u0006ïÜ^õß;.\nm\u0003øáú\u0099ñé\u0097&Úë g"
         .length();
      char var9 = 23;
      int var18 = -1;

      label72:
      while (true) {
         byte var10000 = 65;
         String var10001 = var10.substring(++var18, var18 + var9);
         byte var10002 = -1;

         while (true) {
            label67: {
               char[] var36 = var10001.toCharArray();
               int var10004 = var36.length;
               int var14 = 0;
               byte var39 = var10000;
               var32 = var36;
               int var24 = var10004;
               byte var45;
               char[] var50;
               int var10006;
               if (var10004 <= 1) {
                  var50 = var36;
                  var45 = var10000;
                  var10006 = var14;
               } else {
                  var39 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label67;
                  }

                  var50 = var36;
                  var45 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var59 = var50[var10006];
                  byte var60;
                  switch (var14 % 7) {
                     case 0:
                        var60 = 2;
                        break;
                     case 1:
                        var60 = 108;
                        break;
                     case 2:
                        var60 = 73;
                        break;
                     case 3:
                        var60 = 37;
                        break;
                     case 4:
                        var60 = 103;
                        break;
                     case 5:
                        var60 = 87;
                        break;
                     default:
                        var60 = 5;
                  }

                  var50[var10006] = (char)(var59 ^ var45 ^ var60);
                  var14++;
                  if (var39 == 0) {
                     var10006 = var39;
                     var50 = var32;
                     var45 = var39;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var50 = var32;
                     var45 = var39;
                     var10006 = var14;
                  }
               }
            }

            String var41 = new String(var32).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var41;
                  if ((var18 += var9) >= var12) {
                     a = var13;
                     c = new String[19];
                     long var0 = 1159073172608816424L;
                     long[] var6 = new long[3];
                     var3 = 0;
                     String var4 = "D\u0086½q\u0017\\Û\u0085ñ\n¸|\u001eíqL\u0099;.\u001e? fÚ";
                     int var5 = "D\u0086½q\u0017\\Û\u0085ñ\n¸|\u001eíqL\u0099;.\u001e? fÚ".length();
                     byte var2 = 0;

                     do {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        int var27 = var3++;
                        long var49 = (
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
                        byte var42 = -1;
                        var6[var27] = var49;
                     } while (var2 < var5);

                     d = var6;
                     e = new Integer[3];
                     H = new Vector();
                     O = null;

                     try {
                        O = InetAddress.getByName(a(32090, 19910));
                     } catch (UnknownHostException var16) {
                     }

                     return;
                  }

                  var9 = var10.charAt(var18);
                  break;
               default:
                  var13[var11++] = var41;
                  if ((var18 += var9) < var12) {
                     var9 = var10.charAt(var18);
                     continue label72;
                  }

                  var10 = "\u0090á\u0011é|cT\u0013§N¬\u008fÏE\u000e\u0002aVM\\";
                  var12 = "\u0090á\u0011é|cT\u0013§N¬\u008fÏE\u000e\u0002aVM\\".length();
                  var9 = 2;
                  var18 = -1;
            }

            var10000 = 16;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }
}





