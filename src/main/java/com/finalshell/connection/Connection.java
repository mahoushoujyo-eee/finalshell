package com.finalshell.connection;

import com.finalshell.core.BN;
import com.finalshell.core.Cs2;
import com.finalshell.core.FG3;
import com.finalshell.core.Fr2;
import com.finalshell.core.Qm2;
import com.finalshell.core.Rdp2;
import com.finalshell.core.Tz4;
import com.finalshell.core.VK;
import com.finalshell.core.Vm2;
import com.finalshell.core.Vt2;
import com.finalshell.core.Vw2;
import com.finalshell.core.Ym4_2;
import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;

public class Connection {
   Qm2 I;
   Rdp2 q;
   public InetAddress g;
   public int U;
   HashMap t = new HashMap();
   int w = -1;
   int G = -1;
   Object k = new Object();
   boolean y = false;
   Object Y = new Object();
   byte[] h = new byte[4];
   int z = 0;
   int n;
   int F;
   Tz4 V;
   float m;
   int l;
   int D;
   boolean v;
   boolean b;
   static int x;
   static int W;
   boolean Z;
   public int H;
   long S;
   public static String[] a;
   public static String[] c;
   public static long d;

   static {
      __vfClinit__();
   }

   Connection(Qm2 var1) {
      this.n = (int)d;
      this.F = -1;
      this.m = (float)Cs2.r;
      this.v = false;
      this.b = false;
      this.Z = false;
      this.I = var1;
      this.V = new Tz4(var1);
      this.q = var1.J;
      this.g = var1.c;
      this.U = var1.i;
   }

   public byte[] e() throws FG3 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 2
      // 005: astore 1
      // 006: aload 0
      // 007: getfield com/finalshell/connection/Connection.I Lcom/finalshell/core/Qm2;
      // 00a: aload 1
      // 00b: ifnull 032
      // 00e: invokevirtual com/finalshell/core/Qm2.Z ()Z
      // 011: ifeq 076
      // 014: goto 01b
      // 017: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield com/finalshell/connection/Connection.t Ljava/util/HashMap;
      // 01f: aload 0
      // 020: getfield com/finalshell/connection/Connection.w I
      // 023: bipush 1
      // 024: iadd
      // 025: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 028: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: checkcast com/finalshell/core/Vw2
      // 035: astore 2
      // 036: aload 0
      // 037: getfield com/finalshell/connection/Connection.k Ljava/lang/Object;
      // 03a: dup
      // 03b: astore 3
      // 03c: monitorenter
      // 03d: aload 2
      // 03e: aload 1
      // 03f: ifnull 06f
      // 042: ifnonnull 06e
      // 045: aload 0
      // 046: getfield com/finalshell/connection/Connection.k Ljava/lang/Object;
      // 049: invokevirtual java/lang/Object.wait ()V
      // 04c: goto 05a
      // 04f: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: astore 4
      // 055: aload 4
      // 057: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 05a: aload 0
      // 05b: getfield com/finalshell/connection/Connection.t Ljava/util/HashMap;
      // 05e: aload 0
      // 05f: getfield com/finalshell/connection/Connection.w I
      // 062: bipush 1
      // 063: iadd
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06a: checkcast com/finalshell/core/Vw2
      // 06d: astore 2
      // 06e: aload 3
      // 06f: monitorexit
      // 070: goto 087
      // 073: aload 3
      // 074: monitorexit
      // 075: athrow
      // 076: new com/finalshell/core/FG3
      // 079: dup
      // 07a: sipush 16698
      // 07d: sipush -32603
      // 080: invokestatic com/finalshell/connection/Connection.a (II)Ljava/lang/String;
      // 083: invokespecial com/finalshell/core/FG3.<init> (Ljava/lang/String;)V
      // 086: athrow
      // 087: aload 0
      // 088: aload 1
      // 089: ifnull 0a1
      // 08c: getfield com/finalshell/connection/Connection.v Z
      // 08f: ifne 10e
      // 092: goto 099
      // 095: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 0
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: invokevirtual com/finalshell/connection/Connection.M ()V
      // 0a4: aload 2
      // 0a5: aload 1
      // 0a6: ifnull 0f3
      // 0a9: ifnonnull 0c8
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: new com/finalshell/core/FG3
      // 0b6: dup
      // 0b7: sipush 16696
      // 0ba: sipush 21314
      // 0bd: invokestatic com/finalshell/connection/Connection.a (II)Ljava/lang/String;
      // 0c0: invokespecial com/finalshell/core/FG3.<init> (Ljava/lang/String;)V
      // 0c3: athrow
      // 0c4: invokestatic com/finalshell/connection/Connection.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/connection/Connection.I Lcom/finalshell/core/Qm2;
      // 0cc: getfield com/finalshell/core/Qm2.J Lcom/finalshell/core/Rdp2;
      // 0cf: invokevirtual com/finalshell/core/Rdp2.S ()V
      // 0d2: aload 0
      // 0d3: dup
      // 0d4: getfield com/finalshell/connection/Connection.w I
      // 0d7: bipush 1
      // 0d8: iadd
      // 0d9: putfield com/finalshell/connection/Connection.w I
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/connection/Connection.k Ljava/lang/Object;
      // 0e0: dup
      // 0e1: astore 3
      // 0e2: monitorenter
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/connection/Connection.t Ljava/util/HashMap;
      // 0e7: aload 2
      // 0e8: invokevirtual com/finalshell/core/Vw2.N ()I
      // 0eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ee: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f1: pop
      // 0f2: aload 3
      // 0f3: monitorexit
      // 0f4: goto 0fa
      // 0f7: aload 3
      // 0f8: monitorexit
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: dup
      // 0fc: getfield com/finalshell/connection/Connection.S J
      // 0ff: aload 2
      // 100: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 103: arraylength
      // 104: i2l
      // 105: ladd
      // 106: putfield com/finalshell/connection/Connection.S J
      // 109: aload 2
      // 10a: invokevirtual com/finalshell/core/Vw2.q ()[B
      // 10d: areturn
      // 10e: new com/finalshell/core/FG3
      // 111: dup
      // 112: sipush 16699
      // 115: sipush 17290
      // 118: invokestatic com/finalshell/connection/Connection.a (II)Ljava/lang/String;
      // 11b: invokespecial com/finalshell/core/FG3.<init> (Ljava/lang/String;)V
      // 11e: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void t(DatagramPacket var1) {
      Ky4[] var2 = Qm2.J();
      if (var1 != null) {
         int var10000 = (this.I.Z()) ? 1 : 0;
         if (var2 != null) {
            if (var10000 == 0) {
               return;
            }

            var10000 = Ym4_2.i(var1);
         }

         int var4 = var10000;
         int var5 = Ym4_2.y(var1);
         var10000 = var4;
         short var10001 = Cs2.a;
         if (var2 != null) {
            if (var4 != Cs2.a) {
               return;
            }

            this.I.T();
            var10000 = var5;
            var10001 = BN.B;
         }

         if (var2 != null) {
            if (var10000 == var10001) {
               Vw2 var3 = new Vw2(var1);
               int var14 = var3.o();
               Fr2 var16 = (Fr2)this.I.d.X.get(var14);
               Fr2 var28 = var16;
               if (var2 != null) {
                  if (var16 == null) {
                     var16 = new Fr2();
                     var16.H(var14);
                     this.I.d.X.put(var14, var16);
                  }

                  var28 = var16;
               }

               var28.A(var3.q().length);
               var10000 = var14;
               if (var2 != null) {
                  if (var14 > this.l) {
                     this.l = var14;
                  }

                  var10000 = var3.N();
               }

               int var17 = var10000;
               Object var30 = this.I.J;
               Object var32 = var3;
               if (var2 != null) {
                  this.I.J.w(var3.N());
                  if (var17 <= this.w) {
                     return;
                  }

                  var30 = this.k;
                  var32 = this.k;
               }

               Object var19 = var32;
               synchronized (var30) {
                  this.t.put(var17, var3);
                  Object var31 = this.t;
                  if (var2 != null) {
                     if (this.t.containsKey(this.w + 1)) {
                        this.k.notify();
                     }

                     var31 = var19;
                  }

                  // $VF: monitorexit
                  return;
               }
            }

            var10000 = var5;
            var10001 = BN.D;
         }

         if (var2 != null) {
            if (var10000 == var10001) {
               Vt2 var6 = new Vt2(var1);
               int var7 = var6.n();
               if (var7 > this.F) {
                  this.F = var7;
               }

               ArrayList var8 = var6.t();
               int var9 = 0;
               if (var2 == null) {
                  int var10 = (Integer)var8.get(var9);
                  this.I.J.a(var10);
                  var9++;
               }

               while (true) {
                  Object var23;
                  if (var9 >= var8.size()) {
                     var23 = this.I.d.A(var6.W());
                     if (var2 != null) {
                        Object var18 = var23;
                        Object var24 = var18;
                        if (var2 != null) {
                           if (var18 != null && var6.L() > ((Fr2)var18).o()) {
                              ((Fr2)var18).C(var6.L());
                           }

                           var24 = this.I.d.A(var6.r());
                        }

                        Object var20 = var24;
                        Object var25 = var20;
                        if (var2 != null) {
                           if (var20 != null && var6.N() > ((Fr2)var20).o()) {
                              ((Fr2)var20).C(var6.N());
                           }

                           var25 = this.I.d.A(var6.O());
                        }

                        label162: {
                           label163: {
                              Object var11 = var25;
                              if (var11 != null) {
                                 var10000 = var6.Z();
                                 if (var2 == null) {
                                    break label163;
                                 }

                                 if (var10000 > ((Fr2)var11).o()) {
                                    ((Fr2)var11).C(var6.Z());
                                 }
                              }

                              var27 = this;
                              if (var2 == null) {
                                 break label162;
                              }

                              var10000 = (this.Q()) ? 1 : 0;
                           }

                           if (var10000 == 0) {
                              return;
                           }

                           var27 = this;
                        }

                        var27.I.J.H();
                        if (var2 != null) {
                           return;
                        }
                        break;
                     }
                  } else {
                     var23 = var8.get(var9);
                  }

                  int var21 = (Integer)var23;
                  this.I.J.a(var21);
                  var9++;
               }
            }

            var10000 = var5;
            var10001 = BN.Y;
         }

         if (var2 != null) {
            if (var10000 == var10001) {
               Vm2 var13 = new Vm2(var1);
               this.b = true;
               int var15 = var13.v();
               this.A(var15);
               if (var2 != null) {
                  return;
               }
            }

            var10000 = var5;
            var10001 = BN.f;
         }

         if (var10000 == var10001) {
            new VK(var1);
            this.I.N();
         }
      }
   }

   public void J$void() {
      synchronized (this.k) {
         this.t.clear();
      }
   }

   boolean Q() {
      Ky4[] var10000 = Qm2.J();
      this.H = this.I.J.B - this.F;
      Ky4[] var1 = var10000;
      byte var2 = 0;
      float var4;
      int var3 = (var4 = (float)this.H - this.m) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var1 != null) {
         if (var3 < 0) {
            var2 = 1;
         }

         var3 = var2;
      }

      return var3 != 0;
   }

   void A(int var1) {
      Ky4[] var10000 = Qm2.J();
      this.D = var1;
      Ky4[] var2 = var10000;
      Connection var3 = this;
      if (var2 != null) {
         if (this.v) {
            return;
         }

         var3 = this;
      }

      var3.M();
   }

   void M() {
      Ky4[] var1 = Qm2.J();
      int var10000 = (this.v) ? 1 : 0;
      if (var1 != null) {
         if (this.v) {
            return;
         }

         var10000 = (this.b) ? 1 : 0;
      }

      label43: {
         if (var1 != null) {
            if (var10000 == 0) {
               return;
            }

            var4 = this;
            if (var1 == null) {
               break label43;
            }

            var10000 = this.w;
         }

         if (var10000 < this.D - 1) {
            return;
         }

         this.v = true;
         var4 = this.k;
      }

      synchronized (var4) {
         this.k.notifyAll();
      }

      this.I.J.N();
   }

   void g() {
      Ky4[] var1 = Qm2.J();
      int var10000 = (this.v) ? 1 : 0;
      if (var1 != null) {
         if (this.v) {
            return;
         }

         var10000 = W + 1;
      }

      W = var10000;
      this.v = true;
      synchronized (this.k) {
         this.k.notifyAll();
      }

      this.I.J.O();
   }

   public int C() {
      return this.l;
   }

   public void B(int var1) {
      this.l = var1;
   }

   public int J$int() {
      return this.D;
   }

   public void o(int var1) {
      this.D = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16698) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 11;
            case 1 -> 91;
            case 2 -> 32;
            case 3 -> 103;
            case 4 -> 131;
            case 5 -> 197;
            case 6 -> 205;
            case 7 -> 240;
            case 8 -> 54;
            case 9 -> 89;
            case 10 -> 34;
            case 11 -> 165;
            case 12 -> 212;
            case 13 -> 15;
            case 14 -> 213;
            case 15 -> 244;
            case 16 -> 116;
            case 17 -> 108;
            case 18 -> 6;
            case 19 -> 49;
            case 20 -> 107;
            case 21 -> 79;
            case 22 -> 95;
            case 23 -> 36;
            case 24 -> 113;
            case 25 -> 245;
            case 26 -> 223;
            case 27 -> 160;
            case 28 -> 247;
            case 29 -> 166;
            case 30 -> 55;
            case 31 -> 10;
            case 32 -> 224;
            case 33 -> 226;
            case 34 -> 225;
            case 35 -> 241;
            case 36 -> 236;
            case 37 -> 178;
            case 38 -> 145;
            case 39 -> 137;
            case 40 -> 80;
            case 41 -> 70;
            case 42 -> 227;
            case 43 -> 254;
            case 44 -> 201;
            case 45 -> 132;
            case 46 -> 35;
            case 47 -> 82;
            case 48 -> 192;
            case 49 -> 207;
            case 50 -> 56;
            case 51 -> 21;
            case 52 -> 3;
            case 53 -> 105;
            case 54 -> 84;
            case 55 -> 177;
            case 56 -> 58;
            case 57 -> 211;
            case 58 -> 203;
            case 59 -> 48;
            case 60 -> 93;
            case 61 -> 243;
            case 62 -> 196;
            case 63 -> 157;
            case 64 -> 175;
            case 65 -> 200;
            case 66 -> 189;
            case 67 -> 122;
            case 68 -> 51;
            case 69 -> 174;
            case 70 -> 69;
            case 71 -> 77;
            case 72 -> 135;
            case 73 -> 13;
            case 74 -> 143;
            case 75 -> 90;
            case 76 -> 26;
            case 77 -> 126;
            case 78 -> 156;
            case 79 -> 50;
            case 80 -> 163;
            case 81 -> 161;
            case 82 -> 42;
            case 83 -> 25;
            case 84 -> 195;
            case 85 -> 41;
            case 86 -> 248;
            case 87 -> 216;
            case 88 -> 120;
            case 89 -> 45;
            case 90 -> 233;
            case 91 -> 46;
            case 92 -> 134;
            case 93 -> 104;
            case 94 -> 17;
            case 95 -> 154;
            case 96 -> 9;
            case 97 -> 139;
            case 98 -> 167;
            case 99 -> 43;
            case 100 -> 168;
            case 101 -> 78;
            case 102 -> 16;
            case 103 -> 60;
            case 104 -> 117;
            case 105 -> 209;
            case 106 -> 232;
            case 107 -> 210;
            case 108 -> 29;
            case 109 -> 251;
            case 110 -> 181;
            case 111 -> 176;
            case 112 -> 73;
            case 113 -> 222;
            case 114 -> 76;
            case 115 -> 33;
            case 116 -> 149;
            case 117 -> 159;
            case 118 -> 96;
            case 119 -> 229;
            case 120 -> 172;
            case 121 -> 124;
            case 122 -> 2;
            case 123 -> 164;
            case 124 -> 31;
            case 125 -> 246;
            case 126 -> 202;
            case 127 -> 115;
            case 128 -> 194;
            case 129 -> 150;
            case 130 -> 47;
            case 131 -> 112;
            case 132 -> 198;
            case 133 -> 102;
            case 134 -> 14;
            case 135 -> 66;
            case 136 -> 180;
            case 137 -> 138;
            case 138 -> 250;
            case 139 -> 99;
            case 140 -> 8;
            case 141 -> 24;
            case 142 -> 64;
            case 143 -> 228;
            case 144 -> 147;
            case 145 -> 230;
            case 146 -> 220;
            case 147 -> 231;
            case 148 -> 234;
            case 149 -> 100;
            case 150 -> 146;
            case 151 -> 39;
            case 152 -> 52;
            case 153 -> 128;
            case 154 -> 86;
            case 155 -> 237;
            case 156 -> 19;
            case 157 -> 57;
            case 158 -> 83;
            case 159 -> 38;
            case 160 -> 53;
            case 161 -> 74;
            case 162 -> 152;
            case 163 -> 151;
            case 164 -> 4;
            case 165 -> 158;
            case 166 -> 87;
            case 167 -> 255;
            case 168 -> 75;
            case 169 -> 94;
            case 170 -> 23;
            case 171 -> 215;
            case 172 -> 68;
            case 173 -> 133;
            case 174 -> 106;
            case 175 -> 190;
            case 176 -> 121;
            case 177 -> 62;
            case 178 -> 155;
            case 179 -> 85;
            case 180 -> 0;
            case 181 -> 101;
            case 182 -> 199;
            case 183 -> 12;
            case 184 -> 188;
            case 185 -> 136;
            case 186 -> 98;
            case 187 -> 169;
            case 188 -> 110;
            case 189 -> 7;
            case 190 -> 5;
            case 191 -> 125;
            case 192 -> 20;
            case 193 -> 185;
            case 194 -> 238;
            case 195 -> 109;
            case 196 -> 140;
            case 197 -> 204;
            case 198 -> 127;
            case 199 -> 239;
            case 200 -> 170;
            case 201 -> 71;
            case 202 -> 141;
            case 203 -> 37;
            case 204 -> 249;
            case 205 -> 67;
            case 206 -> 217;
            case 207 -> 183;
            case 208 -> 111;
            case 209 -> 235;
            case 210 -> 81;
            case 211 -> 114;
            case 212 -> 129;
            case 213 -> 218;
            case 214 -> 182;
            case 215 -> 144;
            case 216 -> 214;
            case 217 -> 97;
            case 218 -> 72;
            case 219 -> 153;
            case 220 -> 206;
            case 221 -> 44;
            case 222 -> 61;
            case 223 -> 63;
            case 224 -> 130;
            case 225 -> 186;
            case 226 -> 221;
            case 227 -> 92;
            case 228 -> 148;
            case 229 -> 187;
            case 230 -> 219;
            case 231 -> 208;
            case 232 -> 40;
            case 233 -> 30;
            case 234 -> 27;
            case 235 -> 179;
            case 236 -> 242;
            case 237 -> 171;
            case 238 -> 191;
            case 239 -> 28;
            case 240 -> 193;
            case 241 -> 59;
            case 242 -> 123;
            case 243 -> 173;
            case 244 -> 253;
            case 245 -> 142;
            case 246 -> 18;
            case 247 -> 65;
            case 248 -> 22;
            case 249 -> 119;
            case 250 -> 184;
            case 251 -> 162;
            case 252 -> 252;
            case 253 -> 118;
            case 254 -> 1;
            default -> 88;
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
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "輵挩柼广穧\u0005迸捔嶝文彃\f輫捝巧斦弌\u001fH÷oç0Ì";
      int var6 = "輵挩柼广穧\u0005迸捔嶝文彃\f輫捝巧斦弌\u001fH÷oç0Ì".length();
      char var3 = 5;
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 111;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 111;
               var10006 = var8;
            } else {
               var17 = 111;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 111;
               var10006 = var8;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var20 ^ switch (var8 % 7) {
                  case 0 -> 84;
                  case 1 -> 72;
                  case 2 -> 125;
                  case 3 -> 58;
                  case 4 -> 113;
                  case 5 -> 117;
                  default -> 6;
               });
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
            a = var7;
            c = new String[3];
            long var0 = 5167279490983469835L;
            long var16 = 4292586453142807297L ^ var0;
            var12 = -1;
            d = var16;
            x = 0;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





