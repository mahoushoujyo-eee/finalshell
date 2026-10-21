package com.finalshell.connection;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Wh2;
import com.finalshell.ui.model.BS;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Mapping {
   public ArrayList G;
   public HashMap n;
   public String v;
   public static String[] a;
   public static String[] b;

   public Mapping() {
      ArrayList var10001 = new ArrayList();
      long var2 = 412877864063167168L;
      ArrayList var1 = var10001;
      Ref.s(412877864063167168L, var1, var2);
      HashMap var10002 = new HashMap();
      long var4 = 152539223357988449L;
      HashMap var3 = var10002;
      Ref.s(152539223357988449L, var3, var4);
      String var10003 = a(-20563, 22538);
      long var6 = 247733725710088078L;
      String var5 = var10003;
      Ref.s(247733725710088078L, var5, var6);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 324984652407838076L;
      Object[] var7 = var10004;
      Ref.h(324984652407838076L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void S(BS var1) throws Exception {
      try {
         Object var5 = 512189539626964799L;
         BS var10002 = (BS)(Registry.packArgs(Ref.g(512189539626964799L, var5)));
         long var8 = 259463774993718064L;
         Object[] var7 = var10002;
         var10002 = Ref.h(259463774993718064L, var7, var8);

         try {
            var10002 = (BS)var10002;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }

         if (var10002 != null) {
            Exception var43;
            StringBuilder var47 = new StringBuilder().append(a(-20564, 7141));
            Object var9 = 512189539626964799L;
var47 = new ArrayList(var1.append((String)Ref.g(512189539626964799L, var9)).append(a(-20562, -3586)).toString());
            throw var43;
         }
      } catch (IOException var38) {
         throw a(var38);
      }

      Object var2 = null;

      try {
         ServerSocket var10003;
         Object[] var10005 = Registry.emptyArgs();
         long var12 = 483561374199476750L;
         Object[] var11 = var10005;
         var10005 = Ref.h(483561374199476750L, var11, var12);

         try {
            var49 = (Integer)var10005;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

var1 = new ArrayList(var49);
         var2 = var10003;
         Object[] var46 = Registry.packArgs(var2);
         long var14 = 288445759195044409L;
         Object[] var13 = var46;
         Ref.h(288445759195044409L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         Object var15 = 412877864063167168L;
         ((ArrayList)Ref.g(412877864063167168L, var15)).add(var1);
         Object var17 = 152539223357988449L;
         ((HashMap)Ref.g(152539223357988449L, var17)).put(Registry.lookupField(152188236116144859L).getInt(var1), var1);
         Object[] var10007 = Registry.emptyArgs();
         long var20 = 130949687237917904L;
         Object[] var19 = var10007;
         Ref.h(130949687237917904L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      } catch (IOException var35) {
         Exception var10001;
         StringBuilder var42 = new StringBuilder().append(a(-20556, -29051));
         Object[] var10004 = Registry.emptyArgs();
         long var22 = 483561374199476750L;
         Object[] var21 = var10004;
         var10004 = Ref.h(483561374199476750L, var21, var22);

         try {
            var45 = (Integer)var10004;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

var42 = new ArrayList(var1.append(var45).append(a(-20560, -20007)).toString());
         throw var10001;
      } finally {
         ;
      }
   }

   public void Y(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/BS.t ()I
      // 03: aload 0
      // 04: aload 1
      // 05: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08: ldc2_w 259463774993718064
      // 0b: astore 6
      // 0d: astore 5
      // 0f: ldc2_w 259463774993718064
      // 12: aload 5
      // 14: aload 6
      // 16: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19: checkcast com/finalshell/ui/model/BS
      // 1c: goto 23
      // 1f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22: athrow
      // 23: astore 3
      // 24: istore 2
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 80
      // 2a: ifnull d8
      // 2d: goto 34
      // 30: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: ldc2_w 412877864063167168
      // 38: astore 7
      // 3a: ldc2_w 412877864063167168
      // 3d: aload 7
      // 3f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 42: checkcast java/util/ArrayList
      // 45: aload 3
      // 46: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 49: pop
      // 4a: aload 0
      // 4b: ldc2_w 152539223357988449
      // 4e: astore 9
      // 50: ldc2_w 152539223357988449
      // 53: aload 9
      // 55: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 58: checkcast java/util/HashMap
      // 5b: aload 3
      // 5c: ldc2_w 152188236116144859
      // 5f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 62: swap
      // 63: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 66: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 69: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 6c: pop
      // 6d: iload 2
      // 6e: ifne ce
      // 71: goto 78
      // 74: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: aload 3
      // 79: goto 80
      // 7c: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: ldc2_w 412375118191449651
      // 83: astore 11
      // 85: ldc2_w 412375118191449651
      // 88: aload 11
      // 8a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 8d: checkcast java/net/ServerSocket
      // 90: ifnull b1
      // 93: aload 3
      // 94: ldc2_w 412375118191449651
      // 97: astore 13
      // 99: ldc2_w 412375118191449651
      // 9c: aload 13
      // 9e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a1: checkcast java/net/ServerSocket
      // a4: invokevirtual java/net/ServerSocket.close ()V
      // a7: goto b1
      // aa: astore 4
      // ac: aload 4
      // ae: invokevirtual java/io/IOException.printStackTrace ()V
      // b1: aload 0
      // b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // b5: ldc2_w 130949687237917904
      // b8: astore 16
      // ba: astore 15
      // bc: ldc2_w 130949687237917904
      // bf: aload 15
      // c1: aload 16
      // c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // c6: pop
      // c7: goto ce
      // ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // cd: athrow
      // ce: goto d8
      // d1: astore 4
      // d3: aload 4
      // d5: invokevirtual java/lang/Exception.printStackTrace ()V
      // d8: return
   }

   public void b(BS param1, BS param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/BS.t ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 2
      // 006: ldc2_w 512189539626964799
      // 009: astore 7
      // 00b: ldc2_w 512189539626964799
      // 00e: aload 7
      // 010: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 013: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 016: ldc2_w 259463774993718064
      // 019: astore 10
      // 01b: astore 9
      // 01d: ldc2_w 259463774993718064
      // 020: aload 9
      // 022: aload 10
      // 024: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 027: checkcast com/finalshell/ui/model/BS
      // 02a: goto 031
      // 02d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 030: athrow
      // 031: iload 3
      // 032: ifne 040
      // 035: ifnull 0a9
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: aload 1
      // 040: ldc2_w 512189539626964799
      // 043: astore 11
      // 045: ldc2_w 512189539626964799
      // 048: aload 11
      // 04a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04d: checkcast java/lang/String
      // 050: aload 2
      // 051: ldc2_w 512189539626964799
      // 054: astore 13
      // 056: ldc2_w 512189539626964799
      // 059: aload 13
      // 05b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05e: checkcast java/lang/String
      // 061: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 064: ifne 0a9
      // 067: new java/lang/Exception
      // 06a: dup
      // 06b: new java/lang/StringBuilder
      // 06e: dup
      // 06f: invokespecial java/lang/StringBuilder.<init> ()V
      // 072: sipush -20559
      // 075: sipush -10660
      // 078: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07e: aload 2
      // 07f: ldc2_w 512189539626964799
      // 082: astore 15
      // 084: ldc2_w 512189539626964799
      // 087: aload 15
      // 089: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08c: checkcast java/lang/String
      // 08f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 092: sipush -20573
      // 095: sipush -27056
      // 098: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a1: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 0a4: athrow
      // 0a5: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aconst_null
      // 0aa: astore 4
      // 0ac: aload 1
      // 0ad: ldc2_w 152188236116144859
      // 0b0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b3: swap
      // 0b4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0b7: aload 2
      // 0b8: ldc2_w 152188236116144859
      // 0bb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0be: swap
      // 0bf: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0c2: if_icmpeq 20a
      // 0c5: new java/net/ServerSocket
      // 0c8: dup
      // 0c9: aload 2
      // 0ca: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0cd: ldc2_w 483561374199476750
      // 0d0: astore 18
      // 0d2: astore 17
      // 0d4: ldc2_w 483561374199476750
      // 0d7: aload 17
      // 0d9: aload 18
      // 0db: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0de: checkcast java/lang/Integer
      // 0e1: invokevirtual java/lang/Integer.intValue ()I
      // 0e4: goto 0eb
      // 0e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: invokespecial java/net/ServerSocket.<init> (I)V
      // 0ee: astore 4
      // 0f0: aload 0
      // 0f1: aload 4
      // 0f3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f6: ldc2_w 288445759195044409
      // 0f9: astore 20
      // 0fb: astore 19
      // 0fd: ldc2_w 288445759195044409
      // 100: aload 19
      // 102: aload 20
      // 104: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 107: pop
      // 108: goto 10f
      // 10b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: aload 1
      // 110: bipush 0
      // 111: ldc2_w 119164611987165839
      // 114: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 117: dup_x2
      // 118: pop
      // 119: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 11c: aload 1
      // 11d: ldc2_w 412375118191449651
      // 120: astore 21
      // 122: ldc2_w 412375118191449651
      // 125: aload 21
      // 127: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast java/net/ServerSocket
      // 12d: iload 3
      // 12e: ifne 1b0
      // 131: ifnull 156
      // 134: goto 13b
      // 137: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: aload 1
      // 13c: ldc2_w 412375118191449651
      // 13f: astore 23
      // 141: ldc2_w 412375118191449651
      // 144: aload 23
      // 146: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 149: checkcast java/net/ServerSocket
      // 14c: invokevirtual java/net/ServerSocket.close ()V
      // 14f: goto 156
      // 152: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 1
      // 157: aload 4
      // 159: ldc2_w 412375118191449651
      // 15c: astore 26
      // 15e: astore 25
      // 160: ldc2_w 412375118191449651
      // 163: aload 25
      // 165: aload 26
      // 167: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 16a: aload 0
      // 16b: ldc2_w 152539223357988449
      // 16e: astore 27
      // 170: ldc2_w 152539223357988449
      // 173: aload 27
      // 175: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 178: checkcast java/util/HashMap
      // 17b: aload 1
      // 17c: ldc2_w 152188236116144859
      // 17f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 182: swap
      // 183: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 186: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 189: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 18c: pop
      // 18d: aload 0
      // 18e: ldc2_w 152539223357988449
      // 191: astore 29
      // 193: ldc2_w 152539223357988449
      // 196: aload 29
      // 198: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19b: checkcast java/util/HashMap
      // 19e: aload 2
      // 19f: ldc2_w 152188236116144859
      // 1a2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1a5: swap
      // 1a6: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ac: aload 2
      // 1ad: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1b0: pop
      // 1b1: goto 20a
      // 1b4: astore 5
      // 1b6: new java/lang/Exception
      // 1b9: dup
      // 1ba: new java/lang/StringBuilder
      // 1bd: dup
      // 1be: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c1: sipush -20574
      // 1c4: sipush 29391
      // 1c7: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: aload 2
      // 1ce: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d1: ldc2_w 483561374199476750
      // 1d4: astore 32
      // 1d6: astore 31
      // 1d8: ldc2_w 483561374199476750
      // 1db: aload 31
      // 1dd: aload 32
      // 1df: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e2: checkcast java/lang/Integer
      // 1e5: invokevirtual java/lang/Integer.intValue ()I
      // 1e8: goto 1ef
      // 1eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f2: sipush -20571
      // 1f5: sipush 9625
      // 1f8: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 1fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 201: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 204: athrow
      // 205: astore 6
      // 207: aload 6
      // 209: athrow
      // 20a: aload 1
      // 20b: aload 2
      // 20c: ldc2_w 512189539626964799
      // 20f: astore 33
      // 211: ldc2_w 512189539626964799
      // 214: aload 33
      // 216: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 219: ldc2_w 512189539626964799
      // 21c: astore 36
      // 21e: astore 35
      // 220: ldc2_w 512189539626964799
      // 223: aload 35
      // 225: aload 36
      // 227: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 22a: aload 1
      // 22b: aload 2
      // 22c: ldc2_w 152188236116144859
      // 22f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 232: swap
      // 233: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 236: ldc2_w 152188236116144859
      // 239: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 241: aload 1
      // 242: aload 2
      // 243: ldc2_w 611732392331370513
      // 246: astore 37
      // 248: ldc2_w 611732392331370513
      // 24b: aload 37
      // 24d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 250: ldc2_w 611732392331370513
      // 253: astore 40
      // 255: astore 39
      // 257: ldc2_w 611732392331370513
      // 25a: aload 39
      // 25c: aload 40
      // 25e: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 261: aload 1
      // 262: aload 2
      // 263: ldc2_w 624294956745947517
      // 266: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 269: swap
      // 26a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 26d: ldc2_w 624294956745947517
      // 270: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 273: dup_x2
      // 274: pop
      // 275: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 278: aload 0
      // 279: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 27c: ldc2_w 130949687237917904
      // 27f: astore 42
      // 281: astore 41
      // 283: ldc2_w 130949687237917904
      // 286: aload 41
      // 288: aload 42
      // 28a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 28d: pop
      // 28e: goto 295
      // 291: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 294: athrow
      // 295: return
   }

   public void B() throws Exception {
      O0 var2 = new O0();
      int var10000 = BS.t();
      Oc2 var3 = new Oc2();
      int var1 = var10000;
      var2.C(a(-20575, -5969), var3);
      Object var7 = 412877864063167168L;
      if (((ArrayList)Ref.g(412877864063167168L, var7)).size() == 0) {
      }

      Object var9 = 412877864063167168L;
      Iterator var4 = ((ArrayList)Ref.g(412877864063167168L, var9)).iterator();

      while (true) {
         if (var4.hasNext()) {
            BS var5 = (BS)var4.next();
            O0 var6 = new O0();

            try {
               String var10003 = a(-20576, 6075);
               Object var11 = 512189539626964799L;
               var10003.C(var5, (String)Ref.g(512189539626964799L, var11));
               var6.C(a(-20558, 25774), Registry.lookupField(152188236116144859L).getInt(var5));
               String var10004 = a(-20566, 18742);
               Object var13 = 611732392331370513L;
               var10004.C(var5, (String)Ref.g(611732392331370513L, var13));
               var6.C(a(-20567, -13162), Registry.lookupField(624294956745947517L).getInt(var5));
               var3.add(var6);
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (UnsupportedEncodingException var22) {
               throw a(var22);
            }
         }

         try {
            var2.V().getBytes(a(-20569, -13049));
            Object var15 = 247733725710088078L;
            Object[] var23 = Registry.packArgs(this, Ref.g(247733725710088078L, var15));
            long var18 = 203407378861453377L;
            Object[] var17 = var23;
            Ref.h(203407378861453377L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }
         } catch (UnsupportedEncodingException var20) {
            var20.printStackTrace();
         } catch (Exception var21) {
            var21.printStackTrace();
            throw new Exception(a(-20565, 667));
         }
         break;
      }
   }

   public void y() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/BS.s ()I
      // 003: aconst_null
      // 004: astore 3
      // 005: istore 1
      // 006: aload 0
      // 007: ldc2_w 247733725710088078
      // 00a: astore 10
      // 00c: ldc2_w 247733725710088078
      // 00f: aload 10
      // 011: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 014: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 017: ldc2_w 505581813060275329
      // 01a: astore 12
      // 01c: ldc2_w 505581813060275329
      // 01f: aload 12
      // 021: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 024: checkcast java/lang/String
      // 027: goto 02e
      // 02a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: astore 2
      // 02f: aload 2
      // 030: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 033: astore 3
      // 034: goto 039
      // 037: astore 4
      // 039: aload 3
      // 03a: iload 1
      // 03b: ifeq 049
      // 03e: ifnull 1cf
      // 041: goto 048
      // 044: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 3
      // 049: sipush -20555
      // 04c: sipush 16198
      // 04f: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 052: iload 1
      // 053: ifeq 074
      // 056: invokevirtual com/finalshell/ui/model/O0.containsKey (Ljava/lang/Object;)Z
      // 059: ifeq 1cf
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aload 3
      // 064: sipush -20555
      // 067: sipush 16198
      // 06a: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 06d: goto 074
      // 070: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: invokevirtual com/finalshell/ui/model/O0.J (Ljava/lang/String;)Lcom/finalshell/ui/model/Oc2;
      // 077: astore 4
      // 079: bipush 0
      // 07a: istore 5
      // 07c: iload 5
      // 07e: aload 4
      // 080: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 083: if_icmpge 1cf
      // 086: aload 4
      // 088: iload 5
      // 08a: invokevirtual com/finalshell/ui/model/Oc2.get (I)Ljava/lang/Object;
      // 08d: checkcast com/finalshell/ui/model/O0
      // 090: astore 6
      // 092: new com/finalshell/ui/model/BS
      // 095: dup
      // 096: invokespecial com/finalshell/ui/model/BS.<init> ()V
      // 099: astore 7
      // 09b: aload 7
      // 09d: aload 6
      // 09f: sipush -20561
      // 0a2: sipush -17690
      // 0a5: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 0a8: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 0ab: ldc2_w 512189539626964799
      // 0ae: astore 15
      // 0b0: astore 14
      // 0b2: ldc2_w 512189539626964799
      // 0b5: aload 14
      // 0b7: aload 15
      // 0b9: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0bc: aload 7
      // 0be: aload 6
      // 0c0: sipush -20572
      // 0c3: sipush -22553
      // 0c6: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 0c9: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 0cc: ldc2_w 152188236116144859
      // 0cf: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 0d7: aload 7
      // 0d9: aload 6
      // 0db: sipush -20568
      // 0de: sipush 14838
      // 0e1: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 0e4: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 0e7: ldc2_w 611732392331370513
      // 0ea: astore 17
      // 0ec: astore 16
      // 0ee: ldc2_w 611732392331370513
      // 0f1: aload 16
      // 0f3: aload 17
      // 0f5: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0f8: aload 7
      // 0fa: aload 6
      // 0fc: sipush -20557
      // 0ff: sipush 10430
      // 102: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 105: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 108: ldc2_w 624294956745947517
      // 10b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 10e: dup_x2
      // 10f: pop
      // 110: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 113: aload 0
      // 114: ldc2_w 412877864063167168
      // 117: astore 18
      // 119: ldc2_w 412877864063167168
      // 11c: aload 18
      // 11e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 121: checkcast java/util/ArrayList
      // 124: aload 7
      // 126: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 129: pop
      // 12a: new java/net/ServerSocket
      // 12d: dup
      // 12e: aload 7
      // 130: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 133: ldc2_w 483561374199476750
      // 136: astore 21
      // 138: astore 20
      // 13a: ldc2_w 483561374199476750
      // 13d: aload 20
      // 13f: aload 21
      // 141: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 144: checkcast java/lang/Integer
      // 147: invokevirtual java/lang/Integer.intValue ()I
      // 14a: goto 151
      // 14d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 150: athrow
      // 151: invokespecial java/net/ServerSocket.<init> (I)V
      // 154: astore 8
      // 156: aload 0
      // 157: aload 8
      // 159: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 15c: ldc2_w 288445759195044409
      // 15f: astore 23
      // 161: astore 22
      // 163: ldc2_w 288445759195044409
      // 166: aload 22
      // 168: aload 23
      // 16a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16d: pop
      // 16e: goto 175
      // 171: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 174: athrow
      // 175: aload 7
      // 177: aload 8
      // 179: ldc2_w 412375118191449651
      // 17c: astore 25
      // 17e: astore 24
      // 180: ldc2_w 412375118191449651
      // 183: aload 24
      // 185: aload 25
      // 187: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 18a: goto 1a2
      // 18d: astore 9
      // 18f: aload 7
      // 191: bipush 1
      // 192: ldc2_w 119164611987165839
      // 195: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 198: dup_x2
      // 199: pop
      // 19a: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 19d: aload 9
      // 19f: invokevirtual java/io/IOException.printStackTrace ()V
      // 1a2: aload 0
      // 1a3: ldc2_w 152539223357988449
      // 1a6: astore 26
      // 1a8: ldc2_w 152539223357988449
      // 1ab: aload 26
      // 1ad: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b0: checkcast java/util/HashMap
      // 1b3: aload 7
      // 1b5: ldc2_w 152188236116144859
      // 1b8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1bb: swap
      // 1bc: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c2: aload 7
      // 1c4: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1c7: pop
      // 1c8: iinc 5 1
      // 1cb: iload 1
      // 1cc: ifne 07c
      // 1cf: return
   }

   public BS U(String var1) {
      BS var3 = null;
      BS.s();
      Object var6 = 412877864063167168L;
      Iterator var4 = ((ArrayList)Ref.g(412877864063167168L, var6)).iterator();
      Mapping var2 = this;

      while (var4.hasNext()) {
         BS var5 = (BS)var4.next();
         if (var2 == null) {
            String var10002 = (String)(Registry.emptyArgs());
            long var9 = 597157388012521283L;
            Object[] var8 = var10002;
            var10002 = Ref.h(597157388012521283L, var8, var9);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (!var10002.equals(var1)) {
               continue;
            }
         }

         var3 = var5;
         break;
      }

      return var3;
   }

   public ArrayList Y() {
      Object var1 = 412877864063167168L;
      return (ArrayList)Ref.g(412877864063167168L, var1);
   }

   public void F(ArrayList var1) {
      long var3 = 412877864063167168L;
      Ref.s(412877864063167168L, var1, var3);
   }

   public void s(ServerSocket var1) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Wh2(this, var1));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void q(byte[] var1, String var2) throws Exception {
      int var10000 = BS.t();
      FileOutputStream var4 = null;
      int var3 = var10000;
      boolean var10 = false /* VF: Semaphore variable */;

      try {
         var10 = true;
         var4 = new FileOutputStream(var2);
         var4.write(var1);
         var10 = false;
      } catch (Exception var11) {
         throw var11;
      } finally {
         if (var10) {
      long var16;
            label58: {
               label57: {
                  try {
                     var16 = var4;
                     if (var3 != 0) {
                        break label57;
                     }

                     if (var4 == null) {
                        break label58;
                     }
                  } catch (Exception var12) {
                     throw a(var12);
                  }

                  var16 = var4;
               }

               var16.close();
            }
         }
      }

      FileOutputStream var17 = var4;
      if (var3 == 0) {
         if (var4 == null) {
            return;
         }

         var17 = var4;
      }

      var17.close();
   }

   public static String G(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/BS.t ()I
      // 03: aconst_null
      // 04: astore 2
      // 05: aconst_null
      // 06: astore 3
      // 07: istore 1
      // 08: aconst_null
      // 09: astore 4
      // 0b: new java/io/File
      // 0e: dup
      // 0f: aload 0
      // 10: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 13: astore 5
      // 15: aload 5
      // 17: invokevirtual java/io/File.length ()J
      // 1a: l2i
      // 1b: istore 6
      // 1d: iload 6
      // 1f: newarray 8
      // 21: astore 7
      // 23: new java/io/FileInputStream
      // 26: dup
      // 27: aload 5
      // 29: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 2c: astore 3
      // 2d: new java/io/DataInputStream
      // 30: dup
      // 31: aload 3
      // 32: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 35: astore 4
      // 37: aload 4
      // 39: aload 7
      // 3b: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 3e: new java/lang/String
      // 41: dup
      // 42: aload 7
      // 44: sipush -20570
      // 47: sipush 6623
      // 4a: invokestatic com/finalshell/connection/Mapping.a (II)Ljava/lang/String;
      // 4d: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 50: astore 2
      // 51: aload 3
      // 52: iload 1
      // 53: ifne 61
      // 56: ifnull 6e
      // 59: goto 60
      // 5c: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 3
      // 61: invokevirtual java/io/FileInputStream.close ()V
      // 64: goto 6e
      // 67: astore 5
      // 69: aload 5
      // 6b: invokevirtual java/io/IOException.printStackTrace ()V
      // 6e: aload 4
      // 70: iload 1
      // 71: ifne 80
      // 74: ifnull d6
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: aload 4
      // 80: invokevirtual java/io/DataInputStream.close ()V
      // 83: goto d6
      // 86: astore 5
      // 88: aload 5
      // 8a: invokevirtual java/io/IOException.printStackTrace ()V
      // 8d: goto d6
      // 90: astore 5
      // 92: aload 5
      // 94: athrow
      // 95: astore 8
      // 97: aload 3
      // 98: iload 1
      // 99: ifne a7
      // 9c: ifnull b4
      // 9f: goto a6
      // a2: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5: athrow
      // a6: aload 3
      // a7: invokevirtual java/io/FileInputStream.close ()V
      // aa: goto b4
      // ad: astore 9
      // af: aload 9
      // b1: invokevirtual java/io/IOException.printStackTrace ()V
      // b4: aload 4
      // b6: iload 1
      // b7: ifne c6
      // ba: ifnull d3
      // bd: goto c4
      // c0: invokestatic com/finalshell/connection/Mapping.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3: athrow
      // c4: aload 4
      // c6: invokevirtual java/io/DataInputStream.close ()V
      // c9: goto d3
      // cc: astore 9
      // ce: aload 9
      // d0: invokevirtual java/io/IOException.printStackTrace ()V
      // d3: aload 8
      // d5: athrow
      // d6: aload 2
      // d7: areturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -20576) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 165;
               break;
            case 1:
               var10000 = 159;
               break;
            case 2:
               var10000 = 228;
               break;
            case 3:
               var10000 = 79;
               break;
            case 4:
               var10000 = 173;
               break;
            case 5:
               var10000 = 192;
               break;
            case 6:
               var10000 = 130;
               break;
            case 7:
               var10000 = 169;
               break;
            case 8:
               var10000 = 212;
               break;
            case 9:
               var10000 = 42;
               break;
            case 10:
               var10000 = 244;
               break;
            case 11:
               var10000 = 148;
               break;
            case 12:
               var10000 = 121;
               break;
            case 13:
               var10000 = 30;
               break;
            case 14:
               var10000 = 28;
               break;
            case 15:
               var10000 = 203;
               break;
            case 16:
               var10000 = 193;
               break;
            case 17:
               var10000 = 181;
               break;
            case 18:
               var10000 = 53;
               break;
            case 19:
               var10000 = 218;
               break;
            case 20:
               var10000 = 151;
               break;
            case 21:
               var10000 = 190;
               break;
            case 22:
               var10000 = 247;
               break;
            case 23:
               var10000 = 227;
               break;
            case 24:
               var10000 = 185;
               break;
            case 25:
               var10000 = 160;
               break;
            case 26:
               var10000 = 103;
               break;
            case 27:
               var10000 = 124;
               break;
            case 28:
               var10000 = 105;
               break;
            case 29:
               var10000 = 242;
               break;
            case 30:
               var10000 = 146;
               break;
            case 31:
               var10000 = 49;
               break;
            case 32:
               var10000 = 0;
               break;
            case 33:
               var10000 = 150;
               break;
            case 34:
               var10000 = 111;
               break;
            case 35:
               var10000 = 15;
               break;
            case 36:
               var10000 = 198;
               break;
            case 37:
               var10000 = 249;
               break;
            case 38:
               var10000 = 63;
               break;
            case 39:
               var10000 = 75;
               break;
            case 40:
               var10000 = 250;
               break;
            case 41:
               var10000 = 210;
               break;
            case 42:
               var10000 = 236;
               break;
            case 43:
               var10000 = 99;
               break;
            case 44:
               var10000 = 104;
               break;
            case 45:
               var10000 = 147;
               break;
            case 46:
               var10000 = 57;
               break;
            case 47:
               var10000 = 65;
               break;
            case 48:
               var10000 = 69;
               break;
            case 49:
               var10000 = 215;
               break;
            case 50:
               var10000 = 80;
               break;
            case 51:
               var10000 = 243;
               break;
            case 52:
               var10000 = 122;
               break;
            case 53:
               var10000 = 48;
               break;
            case 54:
               var10000 = 219;
               break;
            case 55:
               var10000 = 252;
               break;
            case 56:
               var10000 = 129;
               break;
            case 57:
               var10000 = 97;
               break;
            case 58:
               var10000 = 222;
               break;
            case 59:
               var10000 = 120;
               break;
            case 60:
               var10000 = 174;
               break;
            case 61:
               var10000 = 50;
               break;
            case 62:
               var10000 = 123;
               break;
            case 63:
               var10000 = 78;
               break;
            case 64:
               var10000 = 157;
               break;
            case 65:
               var10000 = 47;
               break;
            case 66:
               var10000 = 70;
               break;
            case 67:
               var10000 = 230;
               break;
            case 68:
               var10000 = 37;
               break;
            case 69:
               var10000 = 35;
               break;
            case 70:
               var10000 = 68;
               break;
            case 71:
               var10000 = 170;
               break;
            case 72:
               var10000 = 144;
               break;
            case 73:
               var10000 = 14;
               break;
            case 74:
               var10000 = 216;
               break;
            case 75:
               var10000 = 154;
               break;
            case 76:
               var10000 = 149;
               break;
            case 77:
               var10000 = 98;
               break;
            case 78:
               var10000 = 217;
               break;
            case 79:
               var10000 = 86;
               break;
            case 80:
               var10000 = 12;
               break;
            case 81:
               var10000 = 29;
               break;
            case 82:
               var10000 = 153;
               break;
            case 83:
               var10000 = 191;
               break;
            case 84:
               var10000 = 128;
               break;
            case 85:
               var10000 = 84;
               break;
            case 86:
               var10000 = 164;
               break;
            case 87:
               var10000 = 117;
               break;
            case 88:
               var10000 = 234;
               break;
            case 89:
               var10000 = 133;
               break;
            case 90:
               var10000 = 233;
               break;
            case 91:
               var10000 = 59;
               break;
            case 92:
               var10000 = 188;
               break;
            case 93:
               var10000 = 9;
               break;
            case 94:
               var10000 = 83;
               break;
            case 95:
               var10000 = 24;
               break;
            case 96:
               var10000 = 16;
               break;
            case 97:
               var10000 = 187;
               break;
            case 98:
               var10000 = 26;
               break;
            case 99:
               var10000 = 183;
               break;
            case 100:
               var10000 = 19;
               break;
            case 101:
               var10000 = 3;
               break;
            case 102:
               var10000 = 62;
               break;
            case 103:
               var10000 = 223;
               break;
            case 104:
               var10000 = 90;
               break;
            case 105:
               var10000 = 46;
               break;
            case 106:
               var10000 = 94;
               break;
            case 107:
               var10000 = 205;
               break;
            case 108:
               var10000 = 163;
               break;
            case 109:
               var10000 = 20;
               break;
            case 110:
               var10000 = 166;
               break;
            case 111:
               var10000 = 197;
               break;
            case 112:
               var10000 = 238;
               break;
            case 113:
               var10000 = 51;
               break;
            case 114:
               var10000 = 162;
               break;
            case 115:
               var10000 = 118;
               break;
            case 116:
               var10000 = 10;
               break;
            case 117:
               var10000 = 45;
               break;
            case 118:
               var10000 = 232;
               break;
            case 119:
               var10000 = 17;
               break;
            case 120:
               var10000 = 125;
               break;
            case 121:
               var10000 = 207;
               break;
            case 122:
               var10000 = 72;
               break;
            case 123:
               var10000 = 41;
               break;
            case 124:
               var10000 = 22;
               break;
            case 125:
               var10000 = 175;
               break;
            case 126:
               var10000 = 172;
               break;
            case 127:
               var10000 = 2;
               break;
            case 128:
               var10000 = 38;
               break;
            case 129:
               var10000 = 44;
               break;
            case 130:
               var10000 = 237;
               break;
            case 131:
               var10000 = 156;
               break;
            case 132:
               var10000 = 61;
               break;
            case 133:
               var10000 = 21;
               break;
            case 134:
               var10000 = 246;
               break;
            case 135:
               var10000 = 6;
               break;
            case 136:
               var10000 = 67;
               break;
            case 137:
               var10000 = 71;
               break;
            case 138:
               var10000 = 64;
               break;
            case 139:
               var10000 = 11;
               break;
            case 140:
               var10000 = 143;
               break;
            case 141:
               var10000 = 231;
               break;
            case 142:
               var10000 = 178;
               break;
            case 143:
               var10000 = 138;
               break;
            case 144:
               var10000 = 171;
               break;
            case 145:
               var10000 = 7;
               break;
            case 146:
               var10000 = 4;
               break;
            case 147:
               var10000 = 255;
               break;
            case 148:
               var10000 = 141;
               break;
            case 149:
               var10000 = 137;
               break;
            case 150:
               var10000 = 88;
               break;
            case 151:
               var10000 = 226;
               break;
            case 152:
               var10000 = 81;
               break;
            case 153:
               var10000 = 167;
               break;
            case 154:
               var10000 = 221;
               break;
            case 155:
               var10000 = 158;
               break;
            case 156:
               var10000 = 161;
               break;
            case 157:
               var10000 = 135;
               break;
            case 158:
               var10000 = 93;
               break;
            case 159:
               var10000 = 180;
               break;
            case 160:
               var10000 = 109;
               break;
            case 161:
               var10000 = 132;
               break;
            case 162:
               var10000 = 107;
               break;
            case 163:
               var10000 = 56;
               break;
            case 164:
               var10000 = 74;
               break;
            case 165:
               var10000 = 202;
               break;
            case 166:
               var10000 = 177;
               break;
            case 167:
               var10000 = 142;
               break;
            case 168:
               var10000 = 211;
               break;
            case 169:
               var10000 = 134;
               break;
            case 170:
               var10000 = 240;
               break;
            case 171:
               var10000 = 136;
               break;
            case 172:
               var10000 = 206;
               break;
            case 173:
               var10000 = 189;
               break;
            case 174:
               var10000 = 43;
               break;
            case 175:
               var10000 = 196;
               break;
            case 176:
               var10000 = 208;
               break;
            case 177:
               var10000 = 85;
               break;
            case 178:
               var10000 = 8;
               break;
            case 179:
               var10000 = 54;
               break;
            case 180:
               var10000 = 201;
               break;
            case 181:
               var10000 = 182;
               break;
            case 182:
               var10000 = 112;
               break;
            case 183:
               var10000 = 36;
               break;
            case 184:
               var10000 = 184;
               break;
            case 185:
               var10000 = 87;
               break;
            case 186:
               var10000 = 253;
               break;
            case 187:
               var10000 = 209;
               break;
            case 188:
               var10000 = 23;
               break;
            case 189:
               var10000 = 194;
               break;
            case 190:
               var10000 = 76;
               break;
            case 191:
               var10000 = 152;
               break;
            case 192:
               var10000 = 195;
               break;
            case 193:
               var10000 = 66;
               break;
            case 194:
               var10000 = 213;
               break;
            case 195:
               var10000 = 92;
               break;
            case 196:
               var10000 = 155;
               break;
            case 197:
               var10000 = 200;
               break;
            case 198:
               var10000 = 186;
               break;
            case 199:
               var10000 = 245;
               break;
            case 200:
               var10000 = 239;
               break;
            case 201:
               var10000 = 95;
               break;
            case 202:
               var10000 = 89;
               break;
            case 203:
               var10000 = 77;
               break;
            case 204:
               var10000 = 145;
               break;
            case 205:
               var10000 = 225;
               break;
            case 206:
               var10000 = 126;
               break;
            case 207:
               var10000 = 58;
               break;
            case 208:
               var10000 = 34;
               break;
            case 209:
               var10000 = 91;
               break;
            case 210:
               var10000 = 96;
               break;
            case 211:
               var10000 = 229;
               break;
            case 212:
               var10000 = 33;
               break;
            case 213:
               var10000 = 251;
               break;
            case 214:
               var10000 = 27;
               break;
            case 215:
               var10000 = 119;
               break;
            case 216:
               var10000 = 1;
               break;
            case 217:
               var10000 = 52;
               break;
            case 218:
               var10000 = 108;
               break;
            case 219:
               var10000 = 18;
               break;
            case 220:
               var10000 = 139;
               break;
            case 221:
               var10000 = 254;
               break;
            case 222:
               var10000 = 5;
               break;
            case 223:
               var10000 = 114;
               break;
            case 224:
               var10000 = 224;
               break;
            case 225:
               var10000 = 204;
               break;
            case 226:
               var10000 = 101;
               break;
            case 227:
               var10000 = 40;
               break;
            case 228:
               var10000 = 127;
               break;
            case 229:
               var10000 = 113;
               break;
            case 230:
               var10000 = 13;
               break;
            case 231:
               var10000 = 55;
               break;
            case 232:
               var10000 = 82;
               break;
            case 233:
               var10000 = 73;
               break;
            case 234:
               var10000 = 168;
               break;
            case 235:
               var10000 = 116;
               break;
            case 236:
               var10000 = 115;
               break;
            case 237:
               var10000 = 248;
               break;
            case 238:
               var10000 = 131;
               break;
            case 239:
               var10000 = 100;
               break;
            case 240:
               var10000 = 25;
               break;
            case 241:
               var10000 = 60;
               break;
            case 242:
               var10000 = 39;
               break;
            case 243:
               var10000 = 102;
               break;
            case 244:
               var10000 = 140;
               break;
            case 245:
               var10000 = 235;
               break;
            case 246:
               var10000 = 241;
               break;
            case 247:
               var10000 = 199;
               break;
            case 248:
               var10000 = 176;
               break;
            case 249:
               var10000 = 179;
               break;
            case 250:
               var10000 = 214;
               break;
            case 251:
               var10000 = 220;
               break;
            case 252:
               var10000 = 31;
               break;
            case 253:
               var10000 = 110;
               break;
            case 254:
               var10000 = 106;
               break;
            default:
               var10000 = 32;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "*ç\u0086\u0005\b_<VDZ¦ÃÂ\u0003稨县:\u000b'嶉宕坤O讥侴斢哉禷e\u000b´×\t\u001bÛ\u0004÷uD¯¯\u00076嵶縠蠘叐甆M\u0005\u0085h\u0000\u000b\u0010\u0005Ú7ëàm\u000b['úwFÍû\u0005\u0093â\u0019\b¤£\u0005ç¨Ô\u0003J\u000bâüÍ\f ¢'è\b_j\u0005侁寍奪贞ù\u0003昍山¨\tõ§\u009dO\u0010¹\u0080Y\u0002\u000b-崤寔埑g謓侱整呩祭q\u0004q¤ím\u0007\u0011巍组衯卌痨Þ\u0003晪岖D\u000b:SØ\u008bá\u0016°7¬ç²\b1\u009a·Àþ0ÉÖ";
      int var4 = "*ç\u0086\u0005\b_<VDZ¦ÃÂ\u0003稨县:\u000b'嶉宕坤O讥侴斢哉禷e\u000b´×\t\u001bÛ\u0004÷uD¯¯\u00076嵶縠蠘叐甆M\u0005\u0085h\u0000\u000b\u0010\u0005Ú7ëàm\u000b['úwFÍû\u0005\u0093â\u0019\b¤£\u0005ç¨Ô\u0003J\u000bâüÍ\f ¢'è\b_j\u0005侁寍奪贞ù\u0003昍山¨\tõ§\u009dO\u0010¹\u0080Y\u0002\u000b-崤寔埑g謓侱整呩祭q\u0004q¤ím\u0007\u0011巍组衯卌痨Þ\u0003晪岖D\u000b:SØ\u008bá\u0016°7¬ç²\b1\u009a·Àþ0ÉÖ"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 36;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 44;
                        break;
                     case 1:
                        var46 = 10;
                        break;
                     case 2:
                        var46 = 40;
                        break;
                     case 3:
                        var46 = 48;
                        break;
                     case 4:
                        var46 = 39;
                        break;
                     case 5:
                        var46 = 85;
                        break;
                     default:
                        var46 = 94;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[22];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "窮卽;\b§\u0096\u0098ÀRç\u0013;";
                  var4 = "窮卽;\b§\u0096\u0098ÀRç\u0013;".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 19;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





