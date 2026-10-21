package com.finalshell.ui.model;

import com.finalshell.core.AL_2;
import com.finalshell.core.YF_2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@XStreamAlias("ValuesTable")
@XStreamConverter(YF_2.class)
public class U0 implements Serializable {
   protected List l;
   protected List I;
   protected Map b;
   protected Map n;
   public static String[] A;
   public static String[] c;
   public static String[] d;
   public static long a;

   public U0() {
      this((int)a);
   }

   public U0(int var1) {
      this.l = new ArrayList(var1);
      this.I = new ArrayList(var1);
      this.b = new HashMap(var1);
      this.n = new HashMap(var1);
   }

   public List e() {
      return AL_2.J((Collection)this.l);
   }

   public List U() {
      return AL_2.J((Collection)this.I);
   }

   public void w(Map var1) {
      this.d(var1);
   }

   public void d(Map var1) {
      String[] var10000 = P();
      Iterator var3 = var1.entrySet().iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.A(var4.getKey(), var4.getValue());
         if (var2 == null) {
            break;
         }
      }
   }

   public void e(U0 var1) {
      this.u(var1);
   }

   public void u(U0 var1) {
      String[] var10000 = P();
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.v()) {
         this.A(var1.K(var3), var1.o(var3));
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void X(Object var1, Object var2) {
      this.A(var1, var2);
   }

   public void A(Object var1, Object var2) {
      this.V(this.v(), var1, var2);
   }

   public void U(int var1, Object var2, Object var3) {
      this.V(var1, var2, var3);
   }

   public void V(int param1, Object param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush -1
      // 001: istore 4
      // 003: aload 0
      // 004: aload 2
      // 005: invokevirtual com/finalshell/ui/model/U0.d (Ljava/lang/Object;)Z
      // 008: ifeq 012
      // 00b: aload 0
      // 00c: aload 2
      // 00d: invokevirtual com/finalshell/ui/model/U0.H$int (Ljava/lang/Object;)I
      // 010: istore 4
      // 012: bipush -1
      // 013: istore 5
      // 015: aload 0
      // 016: aload 3
      // 017: invokevirtual com/finalshell/ui/model/U0.A$boolean (Ljava/lang/Object;)Z
      // 01a: ifeq 024
      // 01d: aload 0
      // 01e: aload 3
      // 01f: invokevirtual com/finalshell/ui/model/U0.o$int (Ljava/lang/Object;)I
      // 022: istore 5
      // 024: iload 4
      // 026: bipush -1
      // 027: if_icmpne 037
      // 02a: iload 5
      // 02c: bipush -1
      // 02d: if_icmpeq 098
      // 030: goto 037
      // 033: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 036: athrow
      // 037: iload 4
      // 039: iload 5
      // 03b: if_icmple 072
      // 03e: goto 045
      // 041: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 044: athrow
      // 045: iload 4
      // 047: bipush -1
      // 048: if_icmpeq 05f
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 051: athrow
      // 052: aload 0
      // 053: iload 4
      // 055: invokevirtual com/finalshell/ui/model/U0.Y (I)V
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 05e: athrow
      // 05f: iload 5
      // 061: bipush -1
      // 062: if_icmpeq 098
      // 065: aload 0
      // 066: iload 5
      // 068: invokevirtual com/finalshell/ui/model/U0.Y (I)V
      // 06b: goto 098
      // 06e: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 071: athrow
      // 072: iload 5
      // 074: bipush -1
      // 075: if_icmpeq 085
      // 078: aload 0
      // 079: iload 5
      // 07b: invokevirtual com/finalshell/ui/model/U0.Y (I)V
      // 07e: goto 085
      // 081: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 084: athrow
      // 085: iload 4
      // 087: bipush -1
      // 088: if_icmpeq 098
      // 08b: aload 0
      // 08c: iload 4
      // 08e: invokevirtual com/finalshell/ui/model/U0.Y (I)V
      // 091: goto 098
      // 094: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 097: athrow
      // 098: iload 4
      // 09a: bipush -1
      // 09b: if_icmpeq 0cf
      // 09e: iload 4
      // 0a0: iload 1
      // 0a1: if_icmpge 0cf
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0aa: athrow
      // 0ab: iload 5
      // 0ad: bipush -1
      // 0ae: if_icmpeq 0cf
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0b7: athrow
      // 0b8: iload 5
      // 0ba: iload 1
      // 0bb: if_icmpge 0cf
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0c4: athrow
      // 0c5: iinc 1 -2
      // 0c8: goto 106
      // 0cb: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ce: athrow
      // 0cf: iload 4
      // 0d1: bipush -1
      // 0d2: if_icmpeq 0e2
      // 0d5: iload 4
      // 0d7: iload 1
      // 0d8: if_icmplt 0fc
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0e1: athrow
      // 0e2: iload 5
      // 0e4: bipush -1
      // 0e5: if_icmpeq 106
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ee: athrow
      // 0ef: iload 5
      // 0f1: iload 1
      // 0f2: if_icmpge 106
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0fb: athrow
      // 0fc: iinc 1 -1
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 105: athrow
      // 106: aload 0
      // 107: iload 1
      // 108: aload 2
      // 109: aload 3
      // 10a: invokespecial com/finalshell/ui/model/U0.M (ILjava/lang/Object;Ljava/lang/Object;)V
      // 10d: return
   }

   public void T(Object var1) {
      this.F(var1);
   }

   public void F(Object var1) {
      this.f(this.H$int(var1));
   }

   public void o$void(Object var1) {
      this.f(this.o$int(var1));
   }

   public void f(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/U0.P ()[Ljava/lang/String;
      // 03: astore 2
      // 04: iload 1
      // 05: aload 2
      // 06: ifnull 14
      // 09: iflt 30
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 12: athrow
      // 13: iload 1
      // 14: aload 0
      // 15: getfield com/finalshell/ui/model/U0.l Ljava/util/List;
      // 18: invokeinterface java/util/List.size ()I 1
      // 1d: if_icmpge 30
      // 20: aload 0
      // 21: iload 1
      // 22: invokevirtual com/finalshell/ui/model/U0.Y (I)V
      // 25: aload 2
      // 26: ifnonnull 41
      // 29: goto 30
      // 2c: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2f: athrow
      // 30: new java/lang/IndexOutOfBoundsException
      // 33: dup
      // 34: aload 0
      // 35: iload 1
      // 36: invokevirtual com/finalshell/ui/model/U0.A (I)Ljava/lang/String;
      // 39: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic com/finalshell/ui/model/U0.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 40: athrow
      // 41: return
   }

   public void M(int var1, Object var2, Object var3) {
      this.l.add(var1, var2);
      this.I.add(var1, var3);
      this.b.put(var2, var3);
      this.n.put(var3, var2);
   }

   protected void Y(int var1) {
      Object var2 = this.l.remove(var1);
      Object var3 = this.I.remove(var1);
      this.b.remove(var2);
      this.n.remove(var3);
   }

   public Object y(int var1) {
      return this.o(var1);
   }

   public Object o(int var1) {
      return this.I.get(var1);
   }

   public Object K(int var1) {
      return this.l.get(var1);
   }

   public Object Q$Object(Object var1) {
      return this.c(var1);
   }

   public Object c(Object var1) {
      return this.b.get(var1);
   }

   public Object A$Object(Object var1) {
      return this.n.get(var1);
   }

   public boolean H$boolean(Object var1) {
      return this.b.containsKey(var1);
   }

   public boolean d(Object var1) {
      return this.b.containsKey(var1);
   }

   public boolean A$boolean(Object var1) {
      return this.n.containsKey(var1);
   }

   public int Q$int(Object var1) {
      return this.H$int(var1);
   }

   public int H$int(Object var1) {
      return this.l.indexOf(var1);
   }

   public int o$int(Object var1) {
      return this.I.indexOf(var1);
   }

   public int v() {
      return this.l.size();
   }

   protected String A(int var1) {
      return a(16687, 32083) + var1 + a(16686, 28605) + this.v();
   }

   public static void B(String[] var0) {
      A = var0;
   }

   public static String[] P() {
      return A;
   }

   public static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16687) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 54;
               break;
            case 1:
               var10000 = 224;
               break;
            case 2:
               var10000 = 202;
               break;
            case 3:
               var10000 = 130;
               break;
            case 4:
               var10000 = 80;
               break;
            case 5:
               var10000 = 205;
               break;
            case 6:
               var10000 = 52;
               break;
            case 7:
               var10000 = 85;
               break;
            case 8:
               var10000 = 155;
               break;
            case 9:
               var10000 = 25;
               break;
            case 10:
               var10000 = 225;
               break;
            case 11:
               var10000 = 83;
               break;
            case 12:
               var10000 = 124;
               break;
            case 13:
               var10000 = 22;
               break;
            case 14:
               var10000 = 106;
               break;
            case 15:
               var10000 = 120;
               break;
            case 16:
               var10000 = 238;
               break;
            case 17:
               var10000 = 93;
               break;
            case 18:
               var10000 = 46;
               break;
            case 19:
               var10000 = 74;
               break;
            case 20:
               var10000 = 43;
               break;
            case 21:
               var10000 = 24;
               break;
            case 22:
               var10000 = 214;
               break;
            case 23:
               var10000 = 62;
               break;
            case 24:
               var10000 = 90;
               break;
            case 25:
               var10000 = 147;
               break;
            case 26:
               var10000 = 242;
               break;
            case 27:
               var10000 = 11;
               break;
            case 28:
               var10000 = 181;
               break;
            case 29:
               var10000 = 235;
               break;
            case 30:
               var10000 = 200;
               break;
            case 31:
               var10000 = 65;
               break;
            case 32:
               var10000 = 30;
               break;
            case 33:
               var10000 = 231;
               break;
            case 34:
               var10000 = 244;
               break;
            case 35:
               var10000 = 139;
               break;
            case 36:
               var10000 = 131;
               break;
            case 37:
               var10000 = 246;
               break;
            case 38:
               var10000 = 254;
               break;
            case 39:
               var10000 = 56;
               break;
            case 40:
               var10000 = 28;
               break;
            case 41:
               var10000 = 8;
               break;
            case 42:
               var10000 = 210;
               break;
            case 43:
               var10000 = 248;
               break;
            case 44:
               var10000 = 123;
               break;
            case 45:
               var10000 = 119;
               break;
            case 46:
               var10000 = 157;
               break;
            case 47:
               var10000 = 208;
               break;
            case 48:
               var10000 = 143;
               break;
            case 49:
               var10000 = 218;
               break;
            case 50:
               var10000 = 168;
               break;
            case 51:
               var10000 = 73;
               break;
            case 52:
               var10000 = 70;
               break;
            case 53:
               var10000 = 174;
               break;
            case 54:
               var10000 = 7;
               break;
            case 55:
               var10000 = 63;
               break;
            case 56:
               var10000 = 16;
               break;
            case 57:
               var10000 = 64;
               break;
            case 58:
               var10000 = 170;
               break;
            case 59:
               var10000 = 48;
               break;
            case 60:
               var10000 = 87;
               break;
            case 61:
               var10000 = 31;
               break;
            case 62:
               var10000 = 167;
               break;
            case 63:
               var10000 = 39;
               break;
            case 64:
               var10000 = 251;
               break;
            case 65:
               var10000 = 197;
               break;
            case 66:
               var10000 = 199;
               break;
            case 67:
               var10000 = 169;
               break;
            case 68:
               var10000 = 44;
               break;
            case 69:
               var10000 = 144;
               break;
            case 70:
               var10000 = 13;
               break;
            case 71:
               var10000 = 32;
               break;
            case 72:
               var10000 = 89;
               break;
            case 73:
               var10000 = 232;
               break;
            case 74:
               var10000 = 234;
               break;
            case 75:
               var10000 = 88;
               break;
            case 76:
               var10000 = 116;
               break;
            case 77:
               var10000 = 5;
               break;
            case 78:
               var10000 = 156;
               break;
            case 79:
               var10000 = 69;
               break;
            case 80:
               var10000 = 134;
               break;
            case 81:
               var10000 = 96;
               break;
            case 82:
               var10000 = 140;
               break;
            case 83:
               var10000 = 255;
               break;
            case 84:
               var10000 = 102;
               break;
            case 85:
               var10000 = 68;
               break;
            case 86:
               var10000 = 252;
               break;
            case 87:
               var10000 = 4;
               break;
            case 88:
               var10000 = 136;
               break;
            case 89:
               var10000 = 109;
               break;
            case 90:
               var10000 = 233;
               break;
            case 91:
               var10000 = 79;
               break;
            case 92:
               var10000 = 18;
               break;
            case 93:
               var10000 = 41;
               break;
            case 94:
               var10000 = 239;
               break;
            case 95:
               var10000 = 226;
               break;
            case 96:
               var10000 = 166;
               break;
            case 97:
               var10000 = 34;
               break;
            case 98:
               var10000 = 142;
               break;
            case 99:
               var10000 = 177;
               break;
            case 100:
               var10000 = 207;
               break;
            case 101:
               var10000 = 191;
               break;
            case 102:
               var10000 = 110;
               break;
            case 103:
               var10000 = 240;
               break;
            case 104:
               var10000 = 49;
               break;
            case 105:
               var10000 = 153;
               break;
            case 106:
               var10000 = 33;
               break;
            case 107:
               var10000 = 241;
               break;
            case 108:
               var10000 = 78;
               break;
            case 109:
               var10000 = 213;
               break;
            case 110:
               var10000 = 29;
               break;
            case 111:
               var10000 = 245;
               break;
            case 112:
               var10000 = 237;
               break;
            case 113:
               var10000 = 15;
               break;
            case 114:
               var10000 = 58;
               break;
            case 115:
               var10000 = 76;
               break;
            case 116:
               var10000 = 173;
               break;
            case 117:
               var10000 = 180;
               break;
            case 118:
               var10000 = 72;
               break;
            case 119:
               var10000 = 185;
               break;
            case 120:
               var10000 = 192;
               break;
            case 121:
               var10000 = 227;
               break;
            case 122:
               var10000 = 220;
               break;
            case 123:
               var10000 = 128;
               break;
            case 124:
               var10000 = 137;
               break;
            case 125:
               var10000 = 179;
               break;
            case 126:
               var10000 = 19;
               break;
            case 127:
               var10000 = 86;
               break;
            case 128:
               var10000 = 175;
               break;
            case 129:
               var10000 = 95;
               break;
            case 130:
               var10000 = 216;
               break;
            case 131:
               var10000 = 1;
               break;
            case 132:
               var10000 = 162;
               break;
            case 133:
               var10000 = 249;
               break;
            case 134:
               var10000 = 133;
               break;
            case 135:
               var10000 = 148;
               break;
            case 136:
               var10000 = 152;
               break;
            case 137:
               var10000 = 164;
               break;
            case 138:
               var10000 = 94;
               break;
            case 139:
               var10000 = 111;
               break;
            case 140:
               var10000 = 126;
               break;
            case 141:
               var10000 = 184;
               break;
            case 142:
               var10000 = 82;
               break;
            case 143:
               var10000 = 141;
               break;
            case 144:
               var10000 = 247;
               break;
            case 145:
               var10000 = 228;
               break;
            case 146:
               var10000 = 138;
               break;
            case 147:
               var10000 = 121;
               break;
            case 148:
               var10000 = 221;
               break;
            case 149:
               var10000 = 212;
               break;
            case 150:
               var10000 = 23;
               break;
            case 151:
               var10000 = 20;
               break;
            case 152:
               var10000 = 182;
               break;
            case 153:
               var10000 = 176;
               break;
            case 154:
               var10000 = 81;
               break;
            case 155:
               var10000 = 250;
               break;
            case 156:
               var10000 = 103;
               break;
            case 157:
               var10000 = 171;
               break;
            case 158:
               var10000 = 243;
               break;
            case 159:
               var10000 = 183;
               break;
            case 160:
               var10000 = 75;
               break;
            case 161:
               var10000 = 198;
               break;
            case 162:
               var10000 = 158;
               break;
            case 163:
               var10000 = 253;
               break;
            case 164:
               var10000 = 105;
               break;
            case 165:
               var10000 = 84;
               break;
            case 166:
               var10000 = 107;
               break;
            case 167:
               var10000 = 71;
               break;
            case 168:
               var10000 = 186;
               break;
            case 169:
               var10000 = 99;
               break;
            case 170:
               var10000 = 193;
               break;
            case 171:
               var10000 = 36;
               break;
            case 172:
               var10000 = 209;
               break;
            case 173:
               var10000 = 196;
               break;
            case 174:
               var10000 = 26;
               break;
            case 175:
               var10000 = 135;
               break;
            case 176:
               var10000 = 40;
               break;
            case 177:
               var10000 = 154;
               break;
            case 178:
               var10000 = 178;
               break;
            case 179:
               var10000 = 160;
               break;
            case 180:
               var10000 = 122;
               break;
            case 181:
               var10000 = 163;
               break;
            case 182:
               var10000 = 27;
               break;
            case 183:
               var10000 = 112;
               break;
            case 184:
               var10000 = 38;
               break;
            case 185:
               var10000 = 230;
               break;
            case 186:
               var10000 = 189;
               break;
            case 187:
               var10000 = 203;
               break;
            case 188:
               var10000 = 55;
               break;
            case 189:
               var10000 = 204;
               break;
            case 190:
               var10000 = 3;
               break;
            case 191:
               var10000 = 190;
               break;
            case 192:
               var10000 = 115;
               break;
            case 193:
               var10000 = 100;
               break;
            case 194:
               var10000 = 101;
               break;
            case 195:
               var10000 = 77;
               break;
            case 196:
               var10000 = 118;
               break;
            case 197:
               var10000 = 222;
               break;
            case 198:
               var10000 = 236;
               break;
            case 199:
               var10000 = 211;
               break;
            case 200:
               var10000 = 92;
               break;
            case 201:
               var10000 = 125;
               break;
            case 202:
               var10000 = 57;
               break;
            case 203:
               var10000 = 194;
               break;
            case 204:
               var10000 = 223;
               break;
            case 205:
               var10000 = 0;
               break;
            case 206:
               var10000 = 219;
               break;
            case 207:
               var10000 = 146;
               break;
            case 208:
               var10000 = 108;
               break;
            case 209:
               var10000 = 42;
               break;
            case 210:
               var10000 = 113;
               break;
            case 211:
               var10000 = 117;
               break;
            case 212:
               var10000 = 59;
               break;
            case 213:
               var10000 = 215;
               break;
            case 214:
               var10000 = 98;
               break;
            case 215:
               var10000 = 14;
               break;
            case 216:
               var10000 = 47;
               break;
            case 217:
               var10000 = 206;
               break;
            case 218:
               var10000 = 45;
               break;
            case 219:
               var10000 = 67;
               break;
            case 220:
               var10000 = 97;
               break;
            case 221:
               var10000 = 104;
               break;
            case 222:
               var10000 = 195;
               break;
            case 223:
               var10000 = 145;
               break;
            case 224:
               var10000 = 217;
               break;
            case 225:
               var10000 = 61;
               break;
            case 226:
               var10000 = 114;
               break;
            case 227:
               var10000 = 149;
               break;
            case 228:
               var10000 = 9;
               break;
            case 229:
               var10000 = 127;
               break;
            case 230:
               var10000 = 17;
               break;
            case 231:
               var10000 = 150;
               break;
            case 232:
               var10000 = 159;
               break;
            case 233:
               var10000 = 6;
               break;
            case 234:
               var10000 = 12;
               break;
            case 235:
               var10000 = 51;
               break;
            case 236:
               var10000 = 151;
               break;
            case 237:
               var10000 = 187;
               break;
            case 238:
               var10000 = 91;
               break;
            case 239:
               var10000 = 2;
               break;
            case 240:
               var10000 = 50;
               break;
            case 241:
               var10000 = 165;
               break;
            case 242:
               var10000 = 35;
               break;
            case 243:
               var10000 = 60;
               break;
            case 244:
               var10000 = 201;
               break;
            case 245:
               var10000 = 229;
               break;
            case 246:
               var10000 = 21;
               break;
            case 247:
               var10000 = 53;
               break;
            case 248:
               var10000 = 10;
               break;
            case 249:
               var10000 = 66;
               break;
            case 250:
               var10000 = 188;
               break;
            case 251:
               var10000 = 132;
               break;
            case 252:
               var10000 = 37;
               break;
            case 253:
               var10000 = 161;
               break;
            case 254:
               var10000 = 172;
               break;
            default:
               var10000 = 129;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[2];
      int var5 = 0;
      String[] var10000 = new String[3];
      String var4 = "¾HsÖdá\u008c\bx)UqsÇ6P";
      int var6 = "¾HsÖdá\u008c\bx)UqsÇ6P".length();
      B(var10000);
      char var3 = 7;
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 35;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 35;
               var10006 = var8;
            } else {
               var17 = 35;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 35;
               var10006 = var8;
            }

            while (true) {
               char var32 = var10005[var10006];
               byte var33;
               switch (var8 % 7) {
                  case 0:
                     var33 = 14;
                     break;
                  case 1:
                     var33 = 1;
                     break;
                  case 2:
                     var33 = 38;
                     break;
                  case 3:
                     var33 = 126;
                     break;
                  case 4:
                     var33 = 25;
                     break;
                  case 5:
                     var33 = 64;
                     break;
                  default:
                     var33 = 51;
               }

               var10005[var10006] = (char)(var32 ^ var20 ^ var33);
               var8++;
               if (var17 == 0) {
                  var10006 = var17;
                  var10005 = var10002;
                  var20 = var17;
               } else {
                  if (var10 <= var8) {
                     break;
                  }

                  var10005 = var10002;
                  var20 = var17;
                  var10006 = var8;
               }
            }
         }

         String var19 = new String(var10002).intern();
         byte var12 = -1;
         var7[var5++] = var19;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[2];
            long var0 = 426869414588772901L;
            long var16 = -6879280327147458001L ^ var0;
            var12 = -1;
            a = var16;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





