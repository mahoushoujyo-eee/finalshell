package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import org.apache.hc.client5.http.classic.HttpClient;

public class XI_2 {
   public boolean U;
   public String S;
   public int H;
   public Object M;
   public long A;
   public Di4_2 I;
   public String T;
   public String m;
   public Qa2 P;
   public Random b;
   public String z;
   public boolean E;
   public static ThreadLocal w;
   public static DS3_2 u;
   public int t;
   public boolean G;
   public boolean x;
   public int v;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;
   public static long f;

   public XI_2() {
      Registry.lookupField(318642663468302761L).setBoolean(this, false);
      long var2 = 624390254942000691L;
      String var1 = "n";
      Ref.s(624390254942000691L, var1, var2);
      Registry.lookupField(426255559882959583L).setInt(this, -1);
      Object var10002 = new Object();
      long var4 = 379008967375307550L;
      Object var3 = var10002;
      Ref.s(379008967375307550L, var3, var4);
      Registry.lookupField(487668349011926705L).setLong(this, 0L);
      Gt2_2 var10003 = new Gt2_2();
      long var6 = 481825716116789638L;
      Gt2_2 var5 = var10003;
      Ref.s(481825716116789638L, var5, var6);
      long var8 = 423755784183676232L;
      Object var7 = null;
      Ref.s(423755784183676232L, var7, var8);
      long var10 = 350567557010530924L;
      String var9 = "b";
      Ref.s(350567557010530924L, var9, var10);
      Random var10006 = new Random();
      long var12 = 347100956794561926L;
      Random var11 = var10006;
      Ref.s(347100956794561926L, var11, var12);
      Registry.lookupField(146857788364870390L).setBoolean(this, false);
      Registry.lookupField(188763312753619335L).setInt(this, 0);
      Registry.lookupField(515196784670439221L).setBoolean(this, false);
      Registry.lookupField(272512613072180701L).setBoolean(this, false);
      Registry.lookupField(147397002770458699L).setInt(this, a(9449, 3311697008381964381L));
   }

   public void V() {
      Registry.lookupField(134126643734273122L).get(null);
      Object[] var10001 = Registry.packArgs(this);
      long var2 = 598842964693432527L;
      Object[] var1 = var10001;
      Ref.h(598842964693432527L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void m() {
      Registry.lookupField(134126643734273122L).get(null);
      Object[] var10001 = Registry.packArgs(this);
      long var2 = 272886822917181303L;
      Object[] var1 = var10001;
      Ref.h(272886822917181303L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public String y() {
      Object var1 = 146403695651422135L;
      return (String)Ref.g(146403695651422135L, var1);
   }

   public int P() {
      return a(31061, 4234996349394054626L);
   }

   public String t() {
      return "d";
   }

   public int C(int var1) {
      return var1 * a(1134, 6567794848407818461L);
   }

   public static void O() {
   }

   public static String C(byte[] var0) {
      Ky4[] var10000 = YT3_2.c();
      StringBuilder var2 = new StringBuilder("");
      Ky4[] var1 = var10000;
      byte[] var6 = var0;
      if (var1 != null) {
         if (var0 == null) {
            return null;
         }

         var6 = var0;
      }

      int var7 = var6.length;
      if (var1 != null) {
         if (var7 <= 0) {
            return null;
         }

         var7 = 0;
      }

      int var3 = var7;

      while (true) {
         if (var3 < var0.length) {
            int var4 = var0[var3] & a(20361, 5892623593343310655L);
            String var5 = Integer.toHexString(var4);
            if (var1 != null) {
      Gt2_2 var8;
               var8 = var5;
               if (var1 == null) {
                  break;
               }

               if (var5.length() < 2) {
                  var2.append(0);
               }

               var2.append(var5);
               var3++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var8 = var2.toString();
         break;
      }

      return var8;
   }

   public static byte[] r(int var0) {
      int var2 = a(4624, 7771378535212254882L) + new Random().nextInt(var0 - a(31910, 2002742202344564758L));
      byte[] var3 = new byte[var2];
      Ky4[] var10000 = YT3_2.c();
      int var4 = 0;
      Ky4[] var1 = var10000;

      while (true) {
         if (var4 < var2) {
      Object var5;
            var5 = var3;
            if (var1 == null) {
               break;
            }

            var3[var4] = (byte)new Random().nextInt(a(4123, 8383944650225616046L));
            var4++;
            if (var1 != null) {
               continue;
            }
         }

         var5 = var3;
         break;
      }

      return var5;
   }

   public Qa2 I() {
      Object var1 = 391553316134424004L;
      return (Qa2)Ref.g(391553316134424004L, var1);
   }

   public void g(Qa2 var1) {
      long var3 = 391553316134424004L;
      Ref.s(391553316134424004L, var1, var3);
   }

   public O0 u(O0 param1, String param2, HttpClient param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 5
      // 003: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 006: aconst_null
      // 007: astore 6
      // 009: astore 4
      // 00b: bipush 0
      // 00c: istore 7
      // 00e: iload 5
      // 010: aload 4
      // 012: ifnull 1b7
      // 015: aload 0
      // 016: ldc2_w 147397002770458699
      // 019: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01c: swap
      // 01d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 020: if_icmpge 1b5
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/XI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: iinc 5 1
      // 02d: new org/apache/hc/client5/http/classic/methods/HttpPost
      // 030: dup
      // 031: aload 2
      // 032: invokespecial org/apache/hc/client5/http/classic/methods/HttpPost.<init> (Ljava/lang/String;)V
      // 035: astore 8
      // 037: aconst_null
      // 038: astore 9
      // 03a: aload 1
      // 03b: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 03e: sipush -4662
      // 041: sipush 19629
      // 044: invokestatic com/finalshell/core/XI_2.a (II)Ljava/lang/String;
      // 047: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 04a: astore 10
      // 04c: sipush 10091
      // 04f: aload 10
      // 051: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 054: ldc2_w 129862144128276763
      // 057: astore 23
      // 059: ldc2_w 129862144128276763
      // 05c: aload 23
      // 05e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 061: checkcast [B
      // 064: goto 06b
      // 067: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: astore 10
      // 06d: ldc2_w 3532296241344558042
      // 070: new org/apache/hc/core5/http/io/entity/ByteArrayEntity
      // 073: dup
      // 074: aload 10
      // 076: getstatic org/apache/hc/core5/http/ContentType.DEFAULT_BINARY Lorg/apache/hc/core5/http/ContentType;
      // 079: invokespecial org/apache/hc/core5/http/io/entity/ByteArrayEntity.<init> ([BLorg/apache/hc/core5/http/ContentType;)V
      // 07c: astore 11
      // 07e: aload 8
      // 080: aload 11
      // 082: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.setEntity (Lorg/apache/hc/core5/http/HttpEntity;)V
      // 085: aload 3
      // 086: aload 8
      // 088: invokeinterface org/apache/hc/client5/http/classic/HttpClient.execute (Lorg/apache/hc/core5/http/ClassicHttpRequest;)Lorg/apache/hc/core5/http/HttpResponse; 2
      // 08d: checkcast org/apache/hc/client5/http/impl/classic/CloseableHttpResponse
      // 090: astore 12
      // 092: aload 12
      // 094: invokevirtual org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.getEntity ()Lorg/apache/hc/core5/http/HttpEntity;
      // 097: astore 13
      // 099: aload 13
      // 09b: invokeinterface org/apache/hc/core5/http/HttpEntity.getContent ()Ljava/io/InputStream; 1
      // 0a0: astore 14
      // 0a2: new java/io/DataInputStream
      // 0a5: dup
      // 0a6: aload 14
      // 0a8: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 0ab: astore 9
      // 0ad: new java/io/ByteArrayOutputStream
      // 0b0: dup
      // 0b1: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 0b4: astore 15
      // 0b6: bipush 0
      // 0b7: istore 16
      // 0b9: invokestatic com/finalshell/core/XI_2.a (IJ)I
      // 0bc: newarray 8
      // 0be: astore 17
      // 0c0: aload 14
      // 0c2: aload 17
      // 0c4: invokevirtual java/io/InputStream.read ([B)I
      // 0c7: dup
      // 0c8: istore 16
      // 0ca: bipush -1
      // 0cb: if_icmple 0e9
      // 0ce: aload 15
      // 0d0: aload 17
      // 0d2: bipush 0
      // 0d3: iload 16
      // 0d5: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 0d8: aload 4
      // 0da: ifnull 1b5
      // 0dd: aload 4
      // 0df: ifnonnull 0c0
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/XI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: aload 15
      // 0eb: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 0ee: astore 18
      // 0f0: aload 15
      // 0f2: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 0f5: aload 18
      // 0f7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fa: ldc2_w 356223458641838477
      // 0fd: astore 25
      // 0ff: ldc2_w 356223458641838477
      // 102: aload 25
      // 104: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 107: checkcast [B
      // 10a: goto 111
      // 10d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 110: athrow
      // 111: astore 18
      // 113: new java/lang/String
      // 116: dup
      // 117: aload 18
      // 119: sipush -4661
      // 11c: sipush 10690
      // 11f: invokestatic com/finalshell/core/XI_2.a (II)Ljava/lang/String;
      // 122: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 125: astore 19
      // 127: aload 19
      // 129: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 12c: astore 6
      // 12e: bipush 1
      // 12f: aload 4
      // 131: ifnull 1b7
      // 134: istore 7
      // 136: aload 9
      // 138: ifnull 1b5
      // 13b: aload 9
      // 13d: invokevirtual java/io/DataInputStream.close ()V
      // 140: goto 1b5
      // 143: invokestatic com/finalshell/core/XI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: astore 20
      // 149: aload 20
      // 14b: invokevirtual java/io/IOException.printStackTrace ()V
      // 14e: goto 1b5
      // 151: astore 10
      // 153: aload 10
      // 155: invokevirtual java/lang/Exception.printStackTrace ()V
      // 158: getstatic com/finalshell/core/XI_2.f J
      // 15b: invokestatic java/lang/Thread.sleep (J)V
      // 15e: goto 168
      // 161: astore 11
      // 163: aload 11
      // 165: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 168: aload 9
      // 16a: aload 4
      // 16c: ifnull 17b
      // 16f: ifnull 1b0
      // 172: goto 179
      // 175: invokestatic com/finalshell/core/XI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: aload 9
      // 17b: invokevirtual java/io/DataInputStream.close ()V
      // 17e: goto 1b0
      // 181: astore 10
      // 183: aload 10
      // 185: invokevirtual java/io/IOException.printStackTrace ()V
      // 188: goto 1b0
      // 18b: astore 21
      // 18d: aload 9
      // 18f: aload 4
      // 191: ifnull 1a0
      // 194: ifnull 1ad
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/core/XI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: aload 9
      // 1a0: invokevirtual java/io/DataInputStream.close ()V
      // 1a3: goto 1ad
      // 1a6: astore 22
      // 1a8: aload 22
      // 1aa: invokevirtual java/io/IOException.printStackTrace ()V
      // 1ad: aload 21
      // 1af: athrow
      // 1b0: aload 4
      // 1b2: ifnonnull 00e
      // 1b5: iload 7
      // 1b7: ifne 1e9
      // 1ba: new java/lang/Exception
      // 1bd: dup
      // 1be: sipush -4663
      // 1c1: sipush -4093
      // 1c4: invokestatic com/finalshell/core/XI_2.a (II)Ljava/lang/String;
      // 1c7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ca: ldc2_w 517287540690064504
      // 1cd: astore 27
      // 1cf: ldc2_w 517287540690064504
      // 1d2: aload 27
      // 1d4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d7: checkcast java/lang/String
      // 1da: goto 1e1
      // 1dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e0: athrow
      // 1e1: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 1e4: athrow
      // 1e5: invokestatic com/finalshell/core/XI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: aload 6
      // 1eb: areturn
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4661) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 171;
               break;
            case 1:
               var10000 = 116;
               break;
            case 2:
               var10000 = 185;
               break;
            case 3:
               var10000 = 215;
               break;
            case 4:
               var10000 = 158;
               break;
            case 5:
               var10000 = 89;
               break;
            case 6:
               var10000 = 26;
               break;
            case 7:
               var10000 = 162;
               break;
            case 8:
               var10000 = 6;
               break;
            case 9:
               var10000 = 50;
               break;
            case 10:
               var10000 = 253;
               break;
            case 11:
               var10000 = 18;
               break;
            case 12:
               var10000 = 60;
               break;
            case 13:
               var10000 = 38;
               break;
            case 14:
               var10000 = 28;
               break;
            case 15:
               var10000 = 125;
               break;
            case 16:
               var10000 = 190;
               break;
            case 17:
               var10000 = 94;
               break;
            case 18:
               var10000 = 9;
               break;
            case 19:
               var10000 = 160;
               break;
            case 20:
               var10000 = 170;
               break;
            case 21:
               var10000 = 139;
               break;
            case 22:
               var10000 = 244;
               break;
            case 23:
               var10000 = 131;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 193;
               break;
            case 26:
               var10000 = 163;
               break;
            case 27:
               var10000 = 49;
               break;
            case 28:
               var10000 = 184;
               break;
            case 29:
               var10000 = 180;
               break;
            case 30:
               var10000 = 24;
               break;
            case 31:
               var10000 = 107;
               break;
            case 32:
               var10000 = 146;
               break;
            case 33:
               var10000 = 58;
               break;
            case 34:
               var10000 = 74;
               break;
            case 35:
               var10000 = 7;
               break;
            case 36:
               var10000 = 43;
               break;
            case 37:
               var10000 = 210;
               break;
            case 38:
               var10000 = 183;
               break;
            case 39:
               var10000 = 149;
               break;
            case 40:
               var10000 = 251;
               break;
            case 41:
               var10000 = 205;
               break;
            case 42:
               var10000 = 209;
               break;
            case 43:
               var10000 = 57;
               break;
            case 44:
               var10000 = 108;
               break;
            case 45:
               var10000 = 35;
               break;
            case 46:
               var10000 = 103;
               break;
            case 47:
               var10000 = 248;
               break;
            case 48:
               var10000 = 188;
               break;
            case 49:
               var10000 = 33;
               break;
            case 50:
               var10000 = 90;
               break;
            case 51:
               var10000 = 198;
               break;
            case 52:
               var10000 = 85;
               break;
            case 53:
               var10000 = 75;
               break;
            case 54:
               var10000 = 129;
               break;
            case 55:
               var10000 = 63;
               break;
            case 56:
               var10000 = 110;
               break;
            case 57:
               var10000 = 21;
               break;
            case 58:
               var10000 = 206;
               break;
            case 59:
               var10000 = 164;
               break;
            case 60:
               var10000 = 134;
               break;
            case 61:
               var10000 = 105;
               break;
            case 62:
               var10000 = 202;
               break;
            case 63:
               var10000 = 19;
               break;
            case 64:
               var10000 = 152;
               break;
            case 65:
               var10000 = 211;
               break;
            case 66:
               var10000 = 227;
               break;
            case 67:
               var10000 = 111;
               break;
            case 68:
               var10000 = 254;
               break;
            case 69:
               var10000 = 192;
               break;
            case 70:
               var10000 = 151;
               break;
            case 71:
               var10000 = 96;
               break;
            case 72:
               var10000 = 23;
               break;
            case 73:
               var10000 = 65;
               break;
            case 74:
               var10000 = 36;
               break;
            case 75:
               var10000 = 29;
               break;
            case 76:
               var10000 = 223;
               break;
            case 77:
               var10000 = 67;
               break;
            case 78:
               var10000 = 135;
               break;
            case 79:
               var10000 = 247;
               break;
            case 80:
               var10000 = 222;
               break;
            case 81:
               var10000 = 70;
               break;
            case 82:
               var10000 = 237;
               break;
            case 83:
               var10000 = 243;
               break;
            case 84:
               var10000 = 31;
               break;
            case 85:
               var10000 = 121;
               break;
            case 86:
               var10000 = 91;
               break;
            case 87:
               var10000 = 52;
               break;
            case 88:
               var10000 = 54;
               break;
            case 89:
               var10000 = 56;
               break;
            case 90:
               var10000 = 71;
               break;
            case 91:
               var10000 = 123;
               break;
            case 92:
               var10000 = 27;
               break;
            case 93:
               var10000 = 200;
               break;
            case 94:
               var10000 = 140;
               break;
            case 95:
               var10000 = 83;
               break;
            case 96:
               var10000 = 113;
               break;
            case 97:
               var10000 = 241;
               break;
            case 98:
               var10000 = 0;
               break;
            case 99:
               var10000 = 59;
               break;
            case 100:
               var10000 = 98;
               break;
            case 101:
               var10000 = 124;
               break;
            case 102:
               var10000 = 8;
               break;
            case 103:
               var10000 = 34;
               break;
            case 104:
               var10000 = 219;
               break;
            case 105:
               var10000 = 4;
               break;
            case 106:
               var10000 = 229;
               break;
            case 107:
               var10000 = 159;
               break;
            case 108:
               var10000 = 119;
               break;
            case 109:
               var10000 = 39;
               break;
            case 110:
               var10000 = 73;
               break;
            case 111:
               var10000 = 252;
               break;
            case 112:
               var10000 = 231;
               break;
            case 113:
               var10000 = 115;
               break;
            case 114:
               var10000 = 242;
               break;
            case 115:
               var10000 = 142;
               break;
            case 116:
               var10000 = 240;
               break;
            case 117:
               var10000 = 191;
               break;
            case 118:
               var10000 = 41;
               break;
            case 119:
               var10000 = 44;
               break;
            case 120:
               var10000 = 48;
               break;
            case 121:
               var10000 = 189;
               break;
            case 122:
               var10000 = 217;
               break;
            case 123:
               var10000 = 88;
               break;
            case 124:
               var10000 = 13;
               break;
            case 125:
               var10000 = 51;
               break;
            case 126:
               var10000 = 207;
               break;
            case 127:
               var10000 = 97;
               break;
            case 128:
               var10000 = 100;
               break;
            case 129:
               var10000 = 225;
               break;
            case 130:
               var10000 = 46;
               break;
            case 131:
               var10000 = 99;
               break;
            case 132:
               var10000 = 169;
               break;
            case 133:
               var10000 = 203;
               break;
            case 134:
               var10000 = 245;
               break;
            case 135:
               var10000 = 101;
               break;
            case 136:
               var10000 = 157;
               break;
            case 137:
               var10000 = 136;
               break;
            case 138:
               var10000 = 22;
               break;
            case 139:
               var10000 = 249;
               break;
            case 140:
               var10000 = 216;
               break;
            case 141:
               var10000 = 45;
               break;
            case 142:
               var10000 = 12;
               break;
            case 143:
               var10000 = 250;
               break;
            case 144:
               var10000 = 161;
               break;
            case 145:
               var10000 = 167;
               break;
            case 146:
               var10000 = 126;
               break;
            case 147:
               var10000 = 77;
               break;
            case 148:
               var10000 = 133;
               break;
            case 149:
               var10000 = 143;
               break;
            case 150:
               var10000 = 118;
               break;
            case 151:
               var10000 = 78;
               break;
            case 152:
               var10000 = 221;
               break;
            case 153:
               var10000 = 112;
               break;
            case 154:
               var10000 = 201;
               break;
            case 155:
               var10000 = 238;
               break;
            case 156:
               var10000 = 127;
               break;
            case 157:
               var10000 = 104;
               break;
            case 158:
               var10000 = 199;
               break;
            case 159:
               var10000 = 155;
               break;
            case 160:
               var10000 = 106;
               break;
            case 161:
               var10000 = 226;
               break;
            case 162:
               var10000 = 214;
               break;
            case 163:
               var10000 = 208;
               break;
            case 164:
               var10000 = 82;
               break;
            case 165:
               var10000 = 93;
               break;
            case 166:
               var10000 = 148;
               break;
            case 167:
               var10000 = 234;
               break;
            case 168:
               var10000 = 76;
               break;
            case 169:
               var10000 = 132;
               break;
            case 170:
               var10000 = 87;
               break;
            case 171:
               var10000 = 173;
               break;
            case 172:
               var10000 = 228;
               break;
            case 173:
               var10000 = 172;
               break;
            case 174:
               var10000 = 176;
               break;
            case 175:
               var10000 = 68;
               break;
            case 176:
               var10000 = 177;
               break;
            case 177:
               var10000 = 92;
               break;
            case 178:
               var10000 = 42;
               break;
            case 179:
               var10000 = 16;
               break;
            case 180:
               var10000 = 166;
               break;
            case 181:
               var10000 = 232;
               break;
            case 182:
               var10000 = 128;
               break;
            case 183:
               var10000 = 196;
               break;
            case 184:
               var10000 = 187;
               break;
            case 185:
               var10000 = 80;
               break;
            case 186:
               var10000 = 114;
               break;
            case 187:
               var10000 = 66;
               break;
            case 188:
               var10000 = 37;
               break;
            case 189:
               var10000 = 153;
               break;
            case 190:
               var10000 = 47;
               break;
            case 191:
               var10000 = 235;
               break;
            case 192:
               var10000 = 175;
               break;
            case 193:
               var10000 = 182;
               break;
            case 194:
               var10000 = 246;
               break;
            case 195:
               var10000 = 102;
               break;
            case 196:
               var10000 = 72;
               break;
            case 197:
               var10000 = 62;
               break;
            case 198:
               var10000 = 218;
               break;
            case 199:
               var10000 = 178;
               break;
            case 200:
               var10000 = 197;
               break;
            case 201:
               var10000 = 53;
               break;
            case 202:
               var10000 = 239;
               break;
            case 203:
               var10000 = 130;
               break;
            case 204:
               var10000 = 233;
               break;
            case 205:
               var10000 = 32;
               break;
            case 206:
               var10000 = 81;
               break;
            case 207:
               var10000 = 179;
               break;
            case 208:
               var10000 = 224;
               break;
            case 209:
               var10000 = 79;
               break;
            case 210:
               var10000 = 30;
               break;
            case 211:
               var10000 = 122;
               break;
            case 212:
               var10000 = 109;
               break;
            case 213:
               var10000 = 213;
               break;
            case 214:
               var10000 = 117;
               break;
            case 215:
               var10000 = 64;
               break;
            case 216:
               var10000 = 181;
               break;
            case 217:
               var10000 = 194;
               break;
            case 218:
               var10000 = 141;
               break;
            case 219:
               var10000 = 154;
               break;
            case 220:
               var10000 = 17;
               break;
            case 221:
               var10000 = 186;
               break;
            case 222:
               var10000 = 95;
               break;
            case 223:
               var10000 = 25;
               break;
            case 224:
               var10000 = 40;
               break;
            case 225:
               var10000 = 10;
               break;
            case 226:
               var10000 = 156;
               break;
            case 227:
               var10000 = 120;
               break;
            case 228:
               var10000 = 150;
               break;
            case 229:
               var10000 = 236;
               break;
            case 230:
               var10000 = 69;
               break;
            case 231:
               var10000 = 2;
               break;
            case 232:
               var10000 = 145;
               break;
            case 233:
               var10000 = 84;
               break;
            case 234:
               var10000 = 1;
               break;
            case 235:
               var10000 = 11;
               break;
            case 236:
               var10000 = 165;
               break;
            case 237:
               var10000 = 204;
               break;
            case 238:
               var10000 = 255;
               break;
            case 239:
               var10000 = 138;
               break;
            case 240:
               var10000 = 195;
               break;
            case 241:
               var10000 = 55;
               break;
            case 242:
               var10000 = 174;
               break;
            case 243:
               var10000 = 144;
               break;
            case 244:
               var10000 = 137;
               break;
            case 245:
               var10000 = 86;
               break;
            case 246:
               var10000 = 147;
               break;
            case 247:
               var10000 = 220;
               break;
            case 248:
               var10000 = 14;
               break;
            case 249:
               var10000 = 230;
               break;
            case 250:
               var10000 = 61;
               break;
            case 251:
               var10000 = 5;
               break;
            case 252:
               var10000 = 3;
               break;
            case 253:
               var10000 = 212;
               break;
            case 254:
               var10000 = 15;
               break;
            default:
               var10000 = 20;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5299;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[3];
      int var13 = 0;
      String var12 = "0\u008fkN°\u0005¼;úØ\u0082 Õ\u0000#¥~TÖ>Ús\u009ab|1ÅèÑBÑÙ\u008dÆD\u0017\u0005\u008a ñ\u0004\u001b\u00006";
      int var14 = "0\u008fkN°\u0005¼;úØ\u0082 Õ\u0000#¥~TÖ>Ús\u009ab|1ÅèÑBÑÙ\u008dÆD\u0017\u0005\u008a ñ\u0004\u001b\u00006".length();
      char var11 = 5;
      int var10 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var31 = 7;
            var10002 = var10003;
            int var19 = var10004;
            byte var36;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var36 = 7;
               var10006 = var16;
            } else {
               var31 = 7;
               var19 = var10004;
               if (var10004 <= var16) {
                  break label56;
               }

               var10005 = var10003;
               var36 = 7;
               var10006 = var16;
            }

            while (true) {
               char var50 = var10005[var10006];
               byte var51;
               switch (var16 % 7) {
                  case 0:
                     var51 = 25;
                     break;
                  case 1:
                     var51 = 62;
                     break;
                  case 2:
                     var51 = 20;
                     break;
                  case 3:
                     var51 = 72;
                     break;
                  case 4:
                     var51 = 42;
                     break;
                  case 5:
                     var51 = 7;
                     break;
                  default:
                     var51 = 79;
               }

               var10005[var10006] = (char)(var50 ^ var36 ^ var51);
               var16++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var36 = var31;
               } else {
                  if (var19 <= var16) {
                     break;
                  }

                  var10005 = var10002;
                  var36 = var31;
                  var10006 = var16;
               }
            }
         }

         String var33 = new String(var10002).intern();
         int var21 = -1;
         var15[var13++] = var33;
         if ((var10 += var11) >= var14) {
            a = var15;
            c = new String[3];
            long var2 = 3310962280269704858L;
            long[] var8 = new long[8];
            int var5 = 0;
            String var6 = "xæ¥\u0084$Ì~o\u0090¯z3º]h2æ·Ë\t¦û^¨ÁÀ\u0010Nß_\u0006\u0086\u0006Ô\u0000}2\u0084\u0003D¨Ðß\u0019Øa5Z";
            int var7 = "xæ¥\u0084$Ì~o\u0090¯z3º]h2æ·Ë\t¦û^¨ÁÀ\u0010Nß_\u0006\u0086\u0006Ô\u0000}2\u0084\u0003D¨Ðß\u0019Øa5Z".length();
            byte var4 = 0;

            label40:
            while (true) {
               var21 = var4;
               var4 += 8;
               byte[] var9 = var6.substring(var21, var4).getBytes("ISO-8859-1");
               long[] var10000 = var8;
               var21 = var5++;
               long var28 = ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L;
               byte var34 = -1;

               while (true) {
                  long var41 = var28 ^ var2;
                  switch (var34) {
                     case 0:
                        var10000[var21] = var41;
                        if (var4 >= var7) {
                           d = var8;
                           e = new Integer[8];
                           long var0 = 7241270162829169876L;
                           long var30 = 7241270162829169840L ^ var0;
                           byte var25 = -1;
                           f = var30;
                           w = new ThreadLocal();
                           return;
                        }
                        break;
                     default:
                        var10000[var21] = var41;
                        if (var4 < var7) {
                           continue label40;
                        }

                        var6 = "\u0093R\u008b+\u0091\rjKn «\nØeÞÄ";
                        var7 = "\u0093R\u008b+\u0091\rjKn «\nØeÞÄ".length();
                        var4 = 0;
                  }

                  byte var24 = var4;
                  var4 += 8;
                  var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  var10000 = var8;
                  var21 = var5++;
                  var28 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  var34 = 0;
               }
            }
         }

         var11 = var12.charAt(var10);
      }
   }
}






