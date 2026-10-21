package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;

public class Connect2 {
   public UR r;
   public Rdp g;
   public InetAddress O;
   public int U;
   public HashMap x = new HashMap();
   public int k = -1;
   public int i = -1;
   public Object G = new Object();
   public boolean D = false;
   public Object u = new Object();
   public byte[] S = new byte[4];
   public int Y = 0;
   public int h;
   public int A;
   public Br4 n;
   public float M;
   public int Z;
   public int J;
   public boolean d;
   public boolean c;
   public static int q;
   public static int W;
   public boolean C;
   public int T;
   public long V;
   public static String[] a;
   public static String[] b;
   public static long e;

   static {
      __vfClinit__();
   }

   public Connect2(UR var1) {
      this.h = (int)e;
      this.A = -1;
      this.M = (float)Yh2.D;
      this.d = false;
      this.c = false;
      this.C = false;
      this.r = var1;
      this.n = new Br4(var1);
      this.g = var1.z;
      this.O = var1.s;
      this.U = var1.f;
   }

   public byte[] n() throws PV {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 2
      // 005: astore 1
      // 006: aload 0
      // 007: getfield com/finalshell/core/Connect2.r Lcom/finalshell/core/UR;
      // 00a: aload 1
      // 00b: ifnull 032
      // 00e: invokevirtual com/finalshell/core/UR.V ()Z
      // 011: ifeq 076
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield com/finalshell/core/Connect2.x Ljava/util/HashMap;
      // 01f: aload 0
      // 020: getfield com/finalshell/core/Connect2.k I
      // 023: bipush 1
      // 024: iadd
      // 025: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 028: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: checkcast com/finalshell/core/WI
      // 035: astore 2
      // 036: aload 0
      // 037: getfield com/finalshell/core/Connect2.G Ljava/lang/Object;
      // 03a: dup
      // 03b: astore 3
      // 03c: monitorenter
      // 03d: aload 2
      // 03e: aload 1
      // 03f: ifnull 06f
      // 042: ifnonnull 06e
      // 045: aload 0
      // 046: getfield com/finalshell/core/Connect2.G Ljava/lang/Object;
      // 049: invokevirtual java/lang/Object.wait ()V
      // 04c: goto 05a
      // 04f: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: astore 4
      // 055: aload 4
      // 057: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/Connect2.x Ljava/util/HashMap;
      // 05e: aload 0
      // 05f: getfield com/finalshell/core/Connect2.k I
      // 062: bipush 1
      // 063: iadd
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06a: checkcast com/finalshell/core/WI
      // 06d: astore 2
      // 06e: aload 3
      // 06f: monitorexit
      // 070: goto 087
      // 073: aload 3
      // 074: monitorexit
      // 075: athrow
      // 076: new com/finalshell/core/PV
      // 079: dup
      // 07a: sipush 26692
      // 07d: sipush -13740
      // 080: invokestatic com/finalshell/core/Connect2.a (II)Ljava/lang/String;
      // 083: invokespecial com/finalshell/core/PV.<init> (Ljava/lang/String;)V
      // 086: athrow
      // 087: aload 0
      // 088: aload 1
      // 089: ifnull 0a1
      // 08c: getfield com/finalshell/core/Connect2.d Z
      // 08f: ifne 10e
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 0
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: invokevirtual com/finalshell/core/Connect2.Z ()V
      // 0a4: aload 2
      // 0a5: aload 1
      // 0a6: ifnull 0f3
      // 0a9: ifnonnull 0c8
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: new com/finalshell/core/PV
      // 0b6: dup
      // 0b7: sipush 26693
      // 0ba: sipush 21179
      // 0bd: invokestatic com/finalshell/core/Connect2.a (II)Ljava/lang/String;
      // 0c0: invokespecial com/finalshell/core/PV.<init> (Ljava/lang/String;)V
      // 0c3: athrow
      // 0c4: invokestatic com/finalshell/core/Connect2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/core/Connect2.r Lcom/finalshell/core/UR;
      // 0cc: getfield com/finalshell/core/UR.z Lcom/finalshell/core/Rdp;
      // 0cf: invokevirtual com/finalshell/core/Rdp.N ()V
      // 0d2: aload 0
      // 0d3: dup
      // 0d4: getfield com/finalshell/core/Connect2.k I
      // 0d7: bipush 1
      // 0d8: iadd
      // 0d9: putfield com/finalshell/core/Connect2.k I
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/core/Connect2.G Ljava/lang/Object;
      // 0e0: dup
      // 0e1: astore 3
      // 0e2: monitorenter
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/core/Connect2.x Ljava/util/HashMap;
      // 0e7: aload 2
      // 0e8: invokevirtual com/finalshell/core/WI.D ()I
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
      // 0fc: getfield com/finalshell/core/Connect2.V J
      // 0ff: aload 2
      // 100: invokevirtual com/finalshell/core/WI.G ()[B
      // 103: arraylength
      // 104: i2l
      // 105: ladd
      // 106: putfield com/finalshell/core/Connect2.V J
      // 109: aload 2
      // 10a: invokevirtual com/finalshell/core/WI.G ()[B
      // 10d: areturn
      // 10e: new com/finalshell/core/PV
      // 111: dup
      // 112: sipush 26694
      // 115: sipush 8968
      // 118: invokestatic com/finalshell/core/Connect2.a (II)Ljava/lang/String;
      // 11b: invokespecial com/finalshell/core/PV.<init> (Ljava/lang/String;)V
      // 11e: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void s(DatagramPacket var1) {
      String[] var2 = PingMessageR.N();
      if (var1 != null) {
         int var10000 = (this.r.V()) ? 1 : 0;
         if (var2 != null) {
            if (var10000 == 0) {
               return;
            }

            var10000 = CA3.I(var1);
         }

         int var4 = var10000;
         int var5 = CA3.m(var1);
         var10000 = var4;
         short var10001 = Yh2.i;
         if (var2 != null) {
            if (var4 != Yh2.i) {
               return;
            }

            this.r.g();
            var10000 = var5;
            var10001 = D6.nu;
         }

         if (var2 != null) {
            if (var10000 == var10001) {
               WI var3 = new WI(var1);
               int var16 = var3.D();
               Object var22 = this.r.z;
               Object var24 = var3;
               if (var2 != null) {
                  this.r.z.e$void(var3.D());
                  if (var16 <= this.k) {
                     return;
                  }

                  var22 = this.G;
                  var24 = this.G;
               }

               Object var17 = var24;
               synchronized (var22) {
                  this.x.put(var16, var3);
                  Object var23 = this.x;
                  if (var2 != null) {
                     if (this.x.containsKey(this.k + 1)) {
                        this.G.notify();
                     }

                     var23 = var17;
                  }

                  // $VF: monitorexit
                  return;
               }
            }

            var10000 = var5;
            var10001 = D6.f;
         }

         if (var2 != null) {
            if (var10000 == var10001) {
               long var6 = System.currentTimeMillis();
               W0 var8 = new W0(var1);
               int var9 = var8.H();
               if (var9 > this.A) {
                  this.A = var9;
               }

               ArrayList var10 = var8.D();
               int var11 = 0;
               if (var2 == null) {
                  int var12 = (Integer)var10.get(var11);
                  this.r.z.b(var12);
                  var11++;
               }

               while (true) {
                  if (var11 >= var10.size()) {
                     var10000 = (this.E()) ? 1 : 0;
                     if (var2 != null) {
                        if (var10000 == 0) {
                           return;
                        }

                        long var18 = System.currentTimeMillis();
                        this.r.z.h();
                        int var13 = (int)(System.currentTimeMillis() - var18);
                        if (var2 != null) {
                           return;
                        }
                        break;
                     }
                  } else {
                     var10000 = (Integer)var10.get(var11);
                  }

                  int var19 = var10000;
                  this.r.z.b(var19);
                  var11++;
               }
            }

            var10000 = var5;
            var10001 = D6.nD;
         }

         if (var2 != null) {
            if (var10000 == var10001) {
               W3 var15 = new W3(var1);
               this.c = true;
               int var7 = var15.r();
               this.V(var7);
               if (var2 != null) {
                  return;
               }
            }

            var10000 = var5;
            var10001 = D6.X;
         }

         if (var10000 == var10001) {
            new WJ(var1);
            this.r.d();
         }
      }
   }

   public void J() {
      synchronized (this.G) {
         this.x.clear();
      }
   }

   public boolean E() {
      String[] var10000 = PingMessageR.N();
      this.T = this.r.z.K - this.A;
      String[] var1 = var10000;
      byte var2 = 0;
      float var4;
      int var3 = (var4 = (float)this.T - this.M) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var1 != null) {
         if (var3 < 0) {
            var2 = 1;
         }

         var3 = var2;
      }

      return var3 != 0;
   }

   public void V(int var1) {
      String[] var10000 = PingMessageR.N();
      this.J = var1;
      String[] var2 = var10000;
      Connect2 var3 = this;
      if (var2 != null) {
         if (this.d) {
            return;
         }

         var3 = this;
      }

      var3.Z();
   }

   public void Z() {
      String[] var1 = PingMessageR.N();
      int var10000 = (this.d) ? 1 : 0;
      if (var1 != null) {
         if (this.d) {
            return;
         }

         var10000 = (this.c) ? 1 : 0;
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

            var10000 = this.k;
         }

         if (var10000 < this.J - 1) {
            return;
         }

         this.d = true;
         var4 = this.G;
      }

      synchronized (var4) {
         this.G.notifyAll();
      }

      this.r.z.d();
   }

   public void F() {
      String[] var1 = PingMessageR.N();
      int var10000 = (this.d) ? 1 : 0;
      if (var1 != null) {
         if (this.d) {
            return;
         }

         var10000 = W + 1;
      }

      W = var10000;
      this.d = true;
      synchronized (this.G) {
         this.G.notifyAll();
      }

      this.r.z.z();
   }

   public int R() {
      return this.Z;
   }

   public void A(int var1) {
      this.Z = var1;
   }

   public int e() {
      return this.J;
   }

   public void E(int var1) {
      this.J = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 26692) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 12;
               break;
            case 1:
               var10000 = 96;
               break;
            case 2:
               var10000 = 251;
               break;
            case 3:
               var10000 = 149;
               break;
            case 4:
               var10000 = 158;
               break;
            case 5:
               var10000 = 226;
               break;
            case 6:
               var10000 = 127;
               break;
            case 7:
               var10000 = 170;
               break;
            case 8:
               var10000 = 228;
               break;
            case 9:
               var10000 = 87;
               break;
            case 10:
               var10000 = 234;
               break;
            case 11:
               var10000 = 224;
               break;
            case 12:
               var10000 = 43;
               break;
            case 13:
               var10000 = 63;
               break;
            case 14:
               var10000 = 14;
               break;
            case 15:
               var10000 = 145;
               break;
            case 16:
               var10000 = 129;
               break;
            case 17:
               var10000 = 246;
               break;
            case 18:
               var10000 = 131;
               break;
            case 19:
               var10000 = 163;
               break;
            case 20:
               var10000 = 221;
               break;
            case 21:
               var10000 = 73;
               break;
            case 22:
               var10000 = 133;
               break;
            case 23:
               var10000 = 0;
               break;
            case 24:
               var10000 = 172;
               break;
            case 25:
               var10000 = 48;
               break;
            case 26:
               var10000 = 218;
               break;
            case 27:
               var10000 = 227;
               break;
            case 28:
               var10000 = 19;
               break;
            case 29:
               var10000 = 117;
               break;
            case 30:
               var10000 = 196;
               break;
            case 31:
               var10000 = 33;
               break;
            case 32:
               var10000 = 46;
               break;
            case 33:
               var10000 = 24;
               break;
            case 34:
               var10000 = 70;
               break;
            case 35:
               var10000 = 239;
               break;
            case 36:
               var10000 = 230;
               break;
            case 37:
               var10000 = 242;
               break;
            case 38:
               var10000 = 8;
               break;
            case 39:
               var10000 = 201;
               break;
            case 40:
               var10000 = 65;
               break;
            case 41:
               var10000 = 125;
               break;
            case 42:
               var10000 = 212;
               break;
            case 43:
               var10000 = 167;
               break;
            case 44:
               var10000 = 245;
               break;
            case 45:
               var10000 = 123;
               break;
            case 46:
               var10000 = 197;
               break;
            case 47:
               var10000 = 135;
               break;
            case 48:
               var10000 = 200;
               break;
            case 49:
               var10000 = 23;
               break;
            case 50:
               var10000 = 162;
               break;
            case 51:
               var10000 = 44;
               break;
            case 52:
               var10000 = 45;
               break;
            case 53:
               var10000 = 202;
               break;
            case 54:
               var10000 = 179;
               break;
            case 55:
               var10000 = 130;
               break;
            case 56:
               var10000 = 219;
               break;
            case 57:
               var10000 = 175;
               break;
            case 58:
               var10000 = 144;
               break;
            case 59:
               var10000 = 205;
               break;
            case 60:
               var10000 = 241;
               break;
            case 61:
               var10000 = 235;
               break;
            case 62:
               var10000 = 112;
               break;
            case 63:
               var10000 = 165;
               break;
            case 64:
               var10000 = 62;
               break;
            case 65:
               var10000 = 81;
               break;
            case 66:
               var10000 = 229;
               break;
            case 67:
               var10000 = 216;
               break;
            case 68:
               var10000 = 54;
               break;
            case 69:
               var10000 = 40;
               break;
            case 70:
               var10000 = 6;
               break;
            case 71:
               var10000 = 59;
               break;
            case 72:
               var10000 = 210;
               break;
            case 73:
               var10000 = 146;
               break;
            case 74:
               var10000 = 122;
               break;
            case 75:
               var10000 = 58;
               break;
            case 76:
               var10000 = 61;
               break;
            case 77:
               var10000 = 66;
               break;
            case 78:
               var10000 = 75;
               break;
            case 79:
               var10000 = 237;
               break;
            case 80:
               var10000 = 118;
               break;
            case 81:
               var10000 = 243;
               break;
            case 82:
               var10000 = 49;
               break;
            case 83:
               var10000 = 238;
               break;
            case 84:
               var10000 = 143;
               break;
            case 85:
               var10000 = 39;
               break;
            case 86:
               var10000 = 138;
               break;
            case 87:
               var10000 = 15;
               break;
            case 88:
               var10000 = 204;
               break;
            case 89:
               var10000 = 95;
               break;
            case 90:
               var10000 = 42;
               break;
            case 91:
               var10000 = 108;
               break;
            case 92:
               var10000 = 60;
               break;
            case 93:
               var10000 = 164;
               break;
            case 94:
               var10000 = 86;
               break;
            case 95:
               var10000 = 168;
               break;
            case 96:
               var10000 = 32;
               break;
            case 97:
               var10000 = 189;
               break;
            case 98:
               var10000 = 80;
               break;
            case 99:
               var10000 = 156;
               break;
            case 100:
               var10000 = 100;
               break;
            case 101:
               var10000 = 105;
               break;
            case 102:
               var10000 = 26;
               break;
            case 103:
               var10000 = 113;
               break;
            case 104:
               var10000 = 13;
               break;
            case 105:
               var10000 = 120;
               break;
            case 106:
               var10000 = 124;
               break;
            case 107:
               var10000 = 132;
               break;
            case 108:
               var10000 = 231;
               break;
            case 109:
               var10000 = 244;
               break;
            case 110:
               var10000 = 29;
               break;
            case 111:
               var10000 = 192;
               break;
            case 112:
               var10000 = 199;
               break;
            case 113:
               var10000 = 84;
               break;
            case 114:
               var10000 = 102;
               break;
            case 115:
               var10000 = 109;
               break;
            case 116:
               var10000 = 111;
               break;
            case 117:
               var10000 = 194;
               break;
            case 118:
               var10000 = 136;
               break;
            case 119:
               var10000 = 18;
               break;
            case 120:
               var10000 = 7;
               break;
            case 121:
               var10000 = 209;
               break;
            case 122:
               var10000 = 85;
               break;
            case 123:
               var10000 = 233;
               break;
            case 124:
               var10000 = 20;
               break;
            case 125:
               var10000 = 41;
               break;
            case 126:
               var10000 = 4;
               break;
            case 127:
               var10000 = 126;
               break;
            case 128:
               var10000 = 119;
               break;
            case 129:
               var10000 = 2;
               break;
            case 130:
               var10000 = 187;
               break;
            case 131:
               var10000 = 188;
               break;
            case 132:
               var10000 = 71;
               break;
            case 133:
               var10000 = 99;
               break;
            case 134:
               var10000 = 16;
               break;
            case 135:
               var10000 = 55;
               break;
            case 136:
               var10000 = 250;
               break;
            case 137:
               var10000 = 93;
               break;
            case 138:
               var10000 = 217;
               break;
            case 139:
               var10000 = 10;
               break;
            case 140:
               var10000 = 37;
               break;
            case 141:
               var10000 = 79;
               break;
            case 142:
               var10000 = 5;
               break;
            case 143:
               var10000 = 182;
               break;
            case 144:
               var10000 = 141;
               break;
            case 145:
               var10000 = 191;
               break;
            case 146:
               var10000 = 11;
               break;
            case 147:
               var10000 = 115;
               break;
            case 148:
               var10000 = 186;
               break;
            case 149:
               var10000 = 152;
               break;
            case 150:
               var10000 = 50;
               break;
            case 151:
               var10000 = 190;
               break;
            case 152:
               var10000 = 220;
               break;
            case 153:
               var10000 = 77;
               break;
            case 154:
               var10000 = 74;
               break;
            case 155:
               var10000 = 255;
               break;
            case 156:
               var10000 = 151;
               break;
            case 157:
               var10000 = 173;
               break;
            case 158:
               var10000 = 76;
               break;
            case 159:
               var10000 = 35;
               break;
            case 160:
               var10000 = 254;
               break;
            case 161:
               var10000 = 148;
               break;
            case 162:
               var10000 = 90;
               break;
            case 163:
               var10000 = 208;
               break;
            case 164:
               var10000 = 157;
               break;
            case 165:
               var10000 = 28;
               break;
            case 166:
               var10000 = 114;
               break;
            case 167:
               var10000 = 57;
               break;
            case 168:
               var10000 = 171;
               break;
            case 169:
               var10000 = 181;
               break;
            case 170:
               var10000 = 207;
               break;
            case 171:
               var10000 = 211;
               break;
            case 172:
               var10000 = 9;
               break;
            case 173:
               var10000 = 222;
               break;
            case 174:
               var10000 = 223;
               break;
            case 175:
               var10000 = 128;
               break;
            case 176:
               var10000 = 101;
               break;
            case 177:
               var10000 = 153;
               break;
            case 178:
               var10000 = 169;
               break;
            case 179:
               var10000 = 3;
               break;
            case 180:
               var10000 = 53;
               break;
            case 181:
               var10000 = 64;
               break;
            case 182:
               var10000 = 252;
               break;
            case 183:
               var10000 = 232;
               break;
            case 184:
               var10000 = 193;
               break;
            case 185:
               var10000 = 21;
               break;
            case 186:
               var10000 = 240;
               break;
            case 187:
               var10000 = 206;
               break;
            case 188:
               var10000 = 103;
               break;
            case 189:
               var10000 = 25;
               break;
            case 190:
               var10000 = 249;
               break;
            case 191:
               var10000 = 195;
               break;
            case 192:
               var10000 = 92;
               break;
            case 193:
               var10000 = 52;
               break;
            case 194:
               var10000 = 78;
               break;
            case 195:
               var10000 = 116;
               break;
            case 196:
               var10000 = 213;
               break;
            case 197:
               var10000 = 34;
               break;
            case 198:
               var10000 = 107;
               break;
            case 199:
               var10000 = 67;
               break;
            case 200:
               var10000 = 150;
               break;
            case 201:
               var10000 = 139;
               break;
            case 202:
               var10000 = 104;
               break;
            case 203:
               var10000 = 38;
               break;
            case 204:
               var10000 = 174;
               break;
            case 205:
               var10000 = 225;
               break;
            case 206:
               var10000 = 56;
               break;
            case 207:
               var10000 = 17;
               break;
            case 208:
               var10000 = 247;
               break;
            case 209:
               var10000 = 88;
               break;
            case 210:
               var10000 = 178;
               break;
            case 211:
               var10000 = 248;
               break;
            case 212:
               var10000 = 68;
               break;
            case 213:
               var10000 = 137;
               break;
            case 214:
               var10000 = 69;
               break;
            case 215:
               var10000 = 142;
               break;
            case 216:
               var10000 = 166;
               break;
            case 217:
               var10000 = 176;
               break;
            case 218:
               var10000 = 106;
               break;
            case 219:
               var10000 = 110;
               break;
            case 220:
               var10000 = 180;
               break;
            case 221:
               var10000 = 91;
               break;
            case 222:
               var10000 = 159;
               break;
            case 223:
               var10000 = 155;
               break;
            case 224:
               var10000 = 134;
               break;
            case 225:
               var10000 = 98;
               break;
            case 226:
               var10000 = 160;
               break;
            case 227:
               var10000 = 253;
               break;
            case 228:
               var10000 = 47;
               break;
            case 229:
               var10000 = 83;
               break;
            case 230:
               var10000 = 214;
               break;
            case 231:
               var10000 = 22;
               break;
            case 232:
               var10000 = 82;
               break;
            case 233:
               var10000 = 89;
               break;
            case 234:
               var10000 = 147;
               break;
            case 235:
               var10000 = 30;
               break;
            case 236:
               var10000 = 183;
               break;
            case 237:
               var10000 = 215;
               break;
            case 238:
               var10000 = 154;
               break;
            case 239:
               var10000 = 72;
               break;
            case 240:
               var10000 = 236;
               break;
            case 241:
               var10000 = 185;
               break;
            case 242:
               var10000 = 177;
               break;
            case 243:
               var10000 = 94;
               break;
            case 244:
               var10000 = 184;
               break;
            case 245:
               var10000 = 51;
               break;
            case 246:
               var10000 = 198;
               break;
            case 247:
               var10000 = 1;
               break;
            case 248:
               var10000 = 36;
               break;
            case 249:
               var10000 = 203;
               break;
            case 250:
               var10000 = 121;
               break;
            case 251:
               var10000 = 27;
               break;
            case 252:
               var10000 = 31;
               break;
            case 253:
               var10000 = 97;
               break;
            case 254:
               var10000 = 140;
               break;
            default:
               var10000 = 161;
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
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "迦挒朜带竤\f輫授嵽攢忀L¬_Sh\u0089¢\u0005迭捂嶥敻忛";
      int var6 = "迦挒朜带竤\f輫授嵽攢忀L¬_Sh\u0089¢\u0005迭捂嶥敻忛".length();
      char var3 = 5;
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 93;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 93;
               var10006 = var8;
            } else {
               var17 = 93;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 93;
               var10006 = var8;
            }

            while (true) {
               char var32 = var10005[var10006];
               byte var33;
               switch (var8 % 7) {
                  case 0:
                     var33 = 1;
                     break;
                  case 1:
                     var33 = 48;
                     break;
                  case 2:
                     var33 = 57;
                     break;
                  case 3:
                     var33 = 127;
                     break;
                  case 4:
                     var33 = 18;
                     break;
                  case 5:
                     var33 = 106;
                     break;
                  default:
                     var33 = 99;
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
            a = var7;
            b = new String[3];
            long var0 = 6405138812213857662L;
            long var16 = 8905028834702855540L ^ var0;
            var12 = -1;
            e = var16;
            q = 0;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





