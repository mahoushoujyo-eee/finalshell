package com.finalshell.core;

import java.util.Vector;

public class KL implements Cv4 {
   public int m = 0;
   public Dl2_2 k;
   public int F;
   public int Y;
   public int d = 0;
   public Vector[] V;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public KL() {
      String[] var10000 = W5.q();
      this.P(a(900, 4535833093299473375L));
      this.V = new Vector[a(30636, 6252617079038705658L)];
      int var2 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var2 < a(6307, 1435175586872922363L)) {
            this.V[var2] = new Vector();
            var2++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         this.k = new Dl2_2(this);
         break;
      }
   }

   @Override
   public void P(int var1) {
      this.Y = var1;
      this.F = Math.max(a(13887, 1094504594273549932L), var1 * 2);
   }

   @Override
   public void p(int[] var1, int var2, int var3) {
      String[] var10000 = W5.q();
      int var5 = 0;
      String[] var4 = var10000;

      while (var5 < var3) {
         this.e(var1[var5 + var2]);
         if (var4 != null) {
            if (this.d > this.F) {
               this.N(this.F);
            }

            var5++;
         }

         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public int k(int var1) {
      int var11;
      Dl2_2 var6;
      int var3 = var1 >> a(28431, 2962714523201726293L) & a(17218, 8006683838712597275L);
      int var4 = var1 >> a(2622, 1779180797538861675L) & a(11760, 1976203159395706273L);
      int var5 = var1 & a(11760, 1976203159395706273L);
      String[] var10000 = W5.q();
      var6 = this.k;
      String[] var2 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 <= 5) {
            int var9 = a(10498, 7631759602586198366L) >> var7;
            int var10 = 0;
            var11 = var3 & var9;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               if (var11 != 0) {
                  var10 += 4;
               }

               var11 = var4 & var9;
            }

            if (var2 != null) {
               if (var11 != 0) {
                  var10 += 2;
               }

               var11 = var5 & var9;
            }

            if (var11 != 0) {
               var10++;
            }

            Dl2_2 var8 = var6.e[var10];
            Dl2_2 var12 = var8;
            if (var2 != null) {
               if (var8 == null) {
                  return var6.F;
               }

               var12 = var8;
            }

            if (var2 != null) {
               if (var12.S) {
                  return var8.F;
               }

               var12 = var8;
            }

            var6 = var12;
            var7++;
            if (var2 != null) {
               continue;
            }
         }

         System.out.println(a(-278, 32395));
         var11 = 0;
         break;
      }

      return var11;
   }

   public void e(int var1) {
      int var11;
      Dl2_2 var6;
      String[] var10000 = W5.q();
      int var3 = var1 >> a(28431, 2962714523201726293L) & a(11760, 1976203159395706273L);
      String[] var2 = var10000;
      int var4 = var1 >> a(2622, 1779180797538861675L) & a(11760, 1976203159395706273L);
      int var5 = var1 & a(11760, 1976203159395706273L);
      var6 = this.k;
      int var7 = 0;

      while (true) {
         if (var7 <= 5) {
            int var9 = a(4469, 1124828224193698087L) >> var7;
            int var10 = 0;
            if (var2 == null) {
               break;
            }

            var11 = var3 & var9;
            if (var2 != null) {
               if (var11 != 0) {
                  var10 += 4;
               }

               var11 = var4 & var9;
            }

            if (var2 != null) {
               if (var11 != 0) {
                  var10 += 2;
               }

               var11 = var5 & var9;
            }

            if (var11 != 0) {
               var10++;
            }

            label69: {
               Dl2_2 var8 = var6.e[var10];
               Dl2_2 var12 = var8;
               if (var2 != null) {
                  if (var8 == null) {
                     var6.r++;
                     var8 = new Dl2_2(this);
                     var8.j = var6;
                     var6.e[var10] = var8;
                     var6.S = false;
                     this.m++;
                     this.V[var7].addElement(var8);
                     if (var2 != null) {
                        if (var7 == 5) {
                           var8.S = true;
                           var8.x = 1;
                           var8.n = var3;
                           var8.h = var4;
                           var8.U = var5;
                           var8.u = var7;
                           this.d++;
                           return;
                        }

                        var6 = var8;
                     }

                     if (var2 != null) {
                        break label69;
                     }
                  }

                  var12 = var8;
               }

               if (var2 != null) {
                  if (var12.S) {
                     var8.x++;
                     var8.n += var3;
                     var8.h += var4;
                     var8.U += var5;
                     return;
                  }

                  var12 = var8;
               }

               var6 = var12;
            }

            var7++;
            if (var2 != null) {
               continue;
            }
         }

         System.out.println(a(-277, 2322));
         break;
      }
   }

   public void N(int var1) {
      Dl2_2 var11;
      Dl2_2 var6;
      String[] var10000 = W5.q();
      int var3 = 4;
      String[] var2 = var10000;

      label95:
      while (true) {
         int var9 = var3;

         label92:
         while (var9 >= 0) {
            Vector var4 = this.V[var3];
            if (var2 == null) {
               return;
            }

            if (var2 != null) {
               label61:
               if (var4 != null) {
                  int var10 = var4.size();
                  if (var2 != null) {
                     if (var10 <= 0) {
                        break label61;
                     }

                     var10 = 0;
                  }

                  int var5 = var10;

                  while (var5 < var4.size()) {
                     var6 = (Dl2_2)var4.elementAt(var5);
                     label66:
                     if (var2 != null) {
                        var9 = var6.r;
                        if (var2 == null) {
                           continue label92;
                        }

                        if (var6.r > 0) {
                           int var7 = 0;

                           label79: {
                              while (var7 < a(2622, 1779180797538861675L)) {
                                 Dl2_2 var8 = var6.e[var7];
                                 if (var2 != null) {
                                    var11 = var8;
                                    if (var2 == null) {
                                       break label79;
                                    }

                                    if (var8 != null && var2 != null) {
                                       if (!var8.S) {
                                          System.out.println(a(-279, -29525));
                                       }

                                       var6.x = var6.x + var8.x;
                                       var6.n = var6.n + var8.n;
                                       var6.h = var6.h + var8.h;
                                       var6.U = var6.U + var8.U;
                                       var6.e[var7] = null;
                                       var6.r--;
                                       this.d--;
                                       this.m--;
                                       this.V[var3 + 1].removeElement(var8);
                                    }

                                    var7++;
                                 }

                                 if (var2 == null) {
                                    break;
                                 }
                              }

                              var11 = var6;
                           }

                           var11.S = true;
                           this.d++;
                           if (var2 == null) {
                              break label66;
                           }

                           if (this.d <= var1) {
                              return;
                           }
                        }

                        var5++;
                     }

                     if (var2 == null) {
                        break;
                     }
                  }
               }

               var3--;
            }

            if (var2 != null) {
               continue label95;
            }
            break;
         }

         System.out.println(a(-280, 5095));
         return;
      }
   }

   @Override
   public int[] D() {
      int[] var1 = new int[this.d];
      this.T(this.k, var1, 0);
      return var1;
   }

   public void t(int[] var1, int[] var2) {
      String[] var10000 = W5.q();
      int var4 = var1.length;
      String[] var3 = var10000;
      this.Y = var2.length;
      int var5 = 0;

      int var10001;
      while (true) {
         if (var5 < var4) {
            this.e(var1[var5]);
            if (var3 != null) {
               var6 = this.d;
               var10001 = this.F;
               if (var3 == null) {
                  break;
               }

               if (this.d > this.F) {
                  this.N(this.F);
               }

               var5++;
            }

            if (var3 != null) {
               continue;
            }
         }

         var6 = this.d;
         if (var3 == null) {
            return;
         }

         var10001 = this.Y;
         break;
      }

      if (var6 > var10001) {
         this.N(this.Y);
      }

      this.T(this.k, var2, 0);
   }

   public int T(Dl2_2 var1, int[] var2, int var3) {
      int var6;
      String[] var4 = W5.q();
      int var10000 = this.d;
      if (var4 != null) {
         if (this.d > this.Y) {
            this.N(this.Y);
         }

         var10000 = (var1.S) ? 1 : 0;
      }

      if (var4 != null) {
         if (var10000 != 0) {
            int var5 = var1.x;
            var2[var3] = a(14990, 2914029435741811417L)
               | var1.n / var5 << a(7570, 3013210731957294534L)
               | var1.h / var5 << a(26408, 4477361745077923704L)
               | var1.U / var5;
            var1.F = var3++;
            if (var4 != null) {
               return var3;
            }
         }

         var10000 = 0;
      }

      var6 = var10000;

      while (var6 < a(2622, 1779180797538861675L)) {
         label31: {
            Dl2_2 var7 = var1.e[var6];
            if (var4 != null) {
               if (var7 == null) {
                  break label31;
               }

               var7 = var1;
            }

            var7.F = var3;
            var3 = this.T(var1.e[var6], var2, var3);
         }

         var6++;
         if (var4 == null) {
            break;
         }
      }

      return var3;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var6;
      int var2 = (var0 ^ -279) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 39;
               break;
            case 1:
               var10000 = 177;
               break;
            case 2:
               var10000 = 181;
               break;
            case 3:
               var10000 = 92;
               break;
            case 4:
               var10000 = 116;
               break;
            case 5:
               var10000 = 65;
               break;
            case 6:
               var10000 = 54;
               break;
            case 7:
               var10000 = 25;
               break;
            case 8:
               var10000 = 153;
               break;
            case 9:
               var10000 = 151;
               break;
            case 10:
               var10000 = 188;
               break;
            case 11:
               var10000 = 210;
               break;
            case 12:
               var10000 = 106;
               break;
            case 13:
               var10000 = 132;
               break;
            case 14:
               var10000 = 66;
               break;
            case 15:
               var10000 = 64;
               break;
            case 16:
               var10000 = 224;
               break;
            case 17:
               var10000 = 196;
               break;
            case 18:
               var10000 = 105;
               break;
            case 19:
               var10000 = 84;
               break;
            case 20:
               var10000 = 166;
               break;
            case 21:
               var10000 = 223;
               break;
            case 22:
               var10000 = 81;
               break;
            case 23:
               var10000 = 10;
               break;
            case 24:
               var10000 = 200;
               break;
            case 25:
               var10000 = 101;
               break;
            case 26:
               var10000 = 20;
               break;
            case 27:
               var10000 = 130;
               break;
            case 28:
               var10000 = 216;
               break;
            case 29:
               var10000 = 154;
               break;
            case 30:
               var10000 = 96;
               break;
            case 31:
               var10000 = 235;
               break;
            case 32:
               var10000 = 56;
               break;
            case 33:
               var10000 = 147;
               break;
            case 34:
               var10000 = 42;
               break;
            case 35:
               var10000 = 107;
               break;
            case 36:
               var10000 = 205;
               break;
            case 37:
               var10000 = 23;
               break;
            case 38:
               var10000 = 77;
               break;
            case 39:
               var10000 = 98;
               break;
            case 40:
               var10000 = 211;
               break;
            case 41:
               var10000 = 112;
               break;
            case 42:
               var10000 = 174;
               break;
            case 43:
               var10000 = 176;
               break;
            case 44:
               var10000 = 70;
               break;
            case 45:
               var10000 = 22;
               break;
            case 46:
               var10000 = 201;
               break;
            case 47:
               var10000 = 108;
               break;
            case 48:
               var10000 = 91;
               break;
            case 49:
               var10000 = 247;
               break;
            case 50:
               var10000 = 165;
               break;
            case 51:
               var10000 = 137;
               break;
            case 52:
               var10000 = 43;
               break;
            case 53:
               var10000 = 243;
               break;
            case 54:
               var10000 = 237;
               break;
            case 55:
               var10000 = 180;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 119;
               break;
            case 58:
               var10000 = 250;
               break;
            case 59:
               var10000 = 58;
               break;
            case 60:
               var10000 = 75;
               break;
            case 61:
               var10000 = 121;
               break;
            case 62:
               var10000 = 48;
               break;
            case 63:
               var10000 = 197;
               break;
            case 64:
               var10000 = 12;
               break;
            case 65:
               var10000 = 18;
               break;
            case 66:
               var10000 = 113;
               break;
            case 67:
               var10000 = 239;
               break;
            case 68:
               var10000 = 47;
               break;
            case 69:
               var10000 = 68;
               break;
            case 70:
               var10000 = 124;
               break;
            case 71:
               var10000 = 187;
               break;
            case 72:
               var10000 = 41;
               break;
            case 73:
               var10000 = 60;
               break;
            case 74:
               var10000 = 168;
               break;
            case 75:
               var10000 = 95;
               break;
            case 76:
               var10000 = 63;
               break;
            case 77:
               var10000 = 127;
               break;
            case 78:
               var10000 = 191;
               break;
            case 79:
               var10000 = 118;
               break;
            case 80:
               var10000 = 167;
               break;
            case 81:
               var10000 = 253;
               break;
            case 82:
               var10000 = 109;
               break;
            case 83:
               var10000 = 220;
               break;
            case 84:
               var10000 = 35;
               break;
            case 85:
               var10000 = 94;
               break;
            case 86:
               var10000 = 86;
               break;
            case 87:
               var10000 = 27;
               break;
            case 88:
               var10000 = 207;
               break;
            case 89:
               var10000 = 82;
               break;
            case 90:
               var10000 = 172;
               break;
            case 91:
               var10000 = 198;
               break;
            case 92:
               var10000 = 160;
               break;
            case 93:
               var10000 = 227;
               break;
            case 94:
               var10000 = 248;
               break;
            case 95:
               var10000 = 49;
               break;
            case 96:
               var10000 = 202;
               break;
            case 97:
               var10000 = 122;
               break;
            case 98:
               var10000 = 33;
               break;
            case 99:
               var10000 = 212;
               break;
            case 100:
               var10000 = 232;
               break;
            case 101:
               var10000 = 163;
               break;
            case 102:
               var10000 = 97;
               break;
            case 103:
               var10000 = 131;
               break;
            case 104:
               var10000 = 73;
               break;
            case 105:
               var10000 = 233;
               break;
            case 106:
               var10000 = 209;
               break;
            case 107:
               var10000 = 7;
               break;
            case 108:
               var10000 = 148;
               break;
            case 109:
               var10000 = 0;
               break;
            case 110:
               var10000 = 85;
               break;
            case 111:
               var10000 = 252;
               break;
            case 112:
               var10000 = 45;
               break;
            case 113:
               var10000 = 142;
               break;
            case 114:
               var10000 = 125;
               break;
            case 115:
               var10000 = 234;
               break;
            case 116:
               var10000 = 182;
               break;
            case 117:
               var10000 = 193;
               break;
            case 118:
               var10000 = 218;
               break;
            case 119:
               var10000 = 5;
               break;
            case 120:
               var10000 = 178;
               break;
            case 121:
               var10000 = 28;
               break;
            case 122:
               var10000 = 141;
               break;
            case 123:
               var10000 = 31;
               break;
            case 124:
               var10000 = 195;
               break;
            case 125:
               var10000 = 52;
               break;
            case 126:
               var10000 = 140;
               break;
            case 127:
               var10000 = 100;
               break;
            case 128:
               var10000 = 143;
               break;
            case 129:
               var10000 = 159;
               break;
            case 130:
               var10000 = 204;
               break;
            case 131:
               var10000 = 32;
               break;
            case 132:
               var10000 = 175;
               break;
            case 133:
               var10000 = 144;
               break;
            case 134:
               var10000 = 186;
               break;
            case 135:
               var10000 = 55;
               break;
            case 136:
               var10000 = 183;
               break;
            case 137:
               var10000 = 194;
               break;
            case 138:
               var10000 = 78;
               break;
            case 139:
               var10000 = 199;
               break;
            case 140:
               var10000 = 99;
               break;
            case 141:
               var10000 = 51;
               break;
            case 142:
               var10000 = 114;
               break;
            case 143:
               var10000 = 255;
               break;
            case 144:
               var10000 = 136;
               break;
            case 145:
               var10000 = 34;
               break;
            case 146:
               var10000 = 179;
               break;
            case 147:
               var10000 = 251;
               break;
            case 148:
               var10000 = 145;
               break;
            case 149:
               var10000 = 215;
               break;
            case 150:
               var10000 = 230;
               break;
            case 151:
               var10000 = 241;
               break;
            case 152:
               var10000 = 244;
               break;
            case 153:
               var10000 = 117;
               break;
            case 154:
               var10000 = 57;
               break;
            case 155:
               var10000 = 69;
               break;
            case 156:
               var10000 = 3;
               break;
            case 157:
               var10000 = 40;
               break;
            case 158:
               var10000 = 87;
               break;
            case 159:
               var10000 = 134;
               break;
            case 160:
               var10000 = 158;
               break;
            case 161:
               var10000 = 115;
               break;
            case 162:
               var10000 = 37;
               break;
            case 163:
               var10000 = 170;
               break;
            case 164:
               var10000 = 231;
               break;
            case 165:
               var10000 = 184;
               break;
            case 166:
               var10000 = 242;
               break;
            case 167:
               var10000 = 50;
               break;
            case 168:
               var10000 = 192;
               break;
            case 169:
               var10000 = 80;
               break;
            case 170:
               var10000 = 29;
               break;
            case 171:
               var10000 = 129;
               break;
            case 172:
               var10000 = 225;
               break;
            case 173:
               var10000 = 11;
               break;
            case 174:
               var10000 = 149;
               break;
            case 175:
               var10000 = 238;
               break;
            case 176:
               var10000 = 208;
               break;
            case 177:
               var10000 = 83;
               break;
            case 178:
               var10000 = 254;
               break;
            case 179:
               var10000 = 246;
               break;
            case 180:
               var10000 = 8;
               break;
            case 181:
               var10000 = 169;
               break;
            case 182:
               var10000 = 26;
               break;
            case 183:
               var10000 = 135;
               break;
            case 184:
               var10000 = 1;
               break;
            case 185:
               var10000 = 173;
               break;
            case 186:
               var10000 = 44;
               break;
            case 187:
               var10000 = 217;
               break;
            case 188:
               var10000 = 245;
               break;
            case 189:
               var10000 = 90;
               break;
            case 190:
               var10000 = 155;
               break;
            case 191:
               var10000 = 111;
               break;
            case 192:
               var10000 = 189;
               break;
            case 193:
               var10000 = 164;
               break;
            case 194:
               var10000 = 89;
               break;
            case 195:
               var10000 = 120;
               break;
            case 196:
               var10000 = 123;
               break;
            case 197:
               var10000 = 214;
               break;
            case 198:
               var10000 = 67;
               break;
            case 199:
               var10000 = 229;
               break;
            case 200:
               var10000 = 162;
               break;
            case 201:
               var10000 = 185;
               break;
            case 202:
               var10000 = 156;
               break;
            case 203:
               var10000 = 110;
               break;
            case 204:
               var10000 = 139;
               break;
            case 205:
               var10000 = 19;
               break;
            case 206:
               var10000 = 72;
               break;
            case 207:
               var10000 = 15;
               break;
            case 208:
               var10000 = 9;
               break;
            case 209:
               var10000 = 30;
               break;
            case 210:
               var10000 = 138;
               break;
            case 211:
               var10000 = 6;
               break;
            case 212:
               var10000 = 74;
               break;
            case 213:
               var10000 = 171;
               break;
            case 214:
               var10000 = 146;
               break;
            case 215:
               var10000 = 222;
               break;
            case 216:
               var10000 = 14;
               break;
            case 217:
               var10000 = 157;
               break;
            case 218:
               var10000 = 203;
               break;
            case 219:
               var10000 = 103;
               break;
            case 220:
               var10000 = 17;
               break;
            case 221:
               var10000 = 62;
               break;
            case 222:
               var10000 = 150;
               break;
            case 223:
               var10000 = 71;
               break;
            case 224:
               var10000 = 53;
               break;
            case 225:
               var10000 = 152;
               break;
            case 226:
               var10000 = 38;
               break;
            case 227:
               var10000 = 79;
               break;
            case 228:
               var10000 = 24;
               break;
            case 229:
               var10000 = 221;
               break;
            case 230:
               var10000 = 16;
               break;
            case 231:
               var10000 = 36;
               break;
            case 232:
               var10000 = 226;
               break;
            case 233:
               var10000 = 104;
               break;
            case 234:
               var10000 = 133;
               break;
            case 235:
               var10000 = 219;
               break;
            case 236:
               var10000 = 4;
               break;
            case 237:
               var10000 = 236;
               break;
            case 238:
               var10000 = 206;
               break;
            case 239:
               var10000 = 249;
               break;
            case 240:
               var10000 = 46;
               break;
            case 241:
               var10000 = 93;
               break;
            case 242:
               var10000 = 128;
               break;
            case 243:
               var10000 = 76;
               break;
            case 244:
               var10000 = 88;
               break;
            case 245:
               var10000 = 59;
               break;
            case 246:
               var10000 = 228;
               break;
            case 247:
               var10000 = 126;
               break;
            case 248:
               var10000 = 2;
               break;
            case 249:
               var10000 = 13;
               break;
            case 250:
               var10000 = 240;
               break;
            case 251:
               var10000 = 161;
               break;
            case 252:
               var10000 = 21;
               break;
            case 253:
               var10000 = 190;
               break;
            case 254:
               var10000 = 61;
               break;
            default:
               var10000 = 213;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2128;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      char[] var33;
      long[] var6;
      String[] var13 = new String[4];
      var11 = 0;
      String var10 = "'\u0019(]»4Üé\u000f\u0089Q\u001c\u0014_\u0007öä\u000e×R¥\u008b\u0098\u0015Ð\u0094¿8Ãf\u0011Èí±îÿZRk\u0099";
      int var12 = "'\u0019(]»4Üé\u000f\u0089Q\u001c\u0014_\u0007öä\u000e×R¥\u008b\u0098\u0015Ð\u0094¿8Ãf\u0011Èí±îÿZRk\u0099".length();
      char var9 = 11;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 73;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 73;
                        break;
                     case 1:
                        var65 = 21;
                        break;
                     case 2:
                        var65 = 82;
                        break;
                     case 3:
                        var65 = 30;
                        break;
                     case 4:
                        var65 = 15;
                        break;
                     case 5:
                        var65 = 56;
                        break;
                     default:
                        var65 = 11;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[4];
                     long var0 = 3331610212621504399L;
                     var6 = new long[13];
                     int var3 = 0;
                     String var4 = "Ûõ\u0082|Ï\u0014 ÿÊ¸7~¢\u0097jÑÏ\u001dÔzE8V(Ïöæ7\u001fësãX\t×Ô\u001aëÚYczÙ\u0094qÞMìÂbº÷=ú0s\u008bZUWì2}V\u00876\u0099i\u0090\u0081ßr>ûb¸\u0086\r\u0004kÜµXOS\n(Ê";
                     int var5 = "Ûõ\u0082|Ï\u0014 ÿÊ¸7~¢\u0097jÑÏ\u001dÔzE8V(Ïöæ7\u001fësãX\t×Ô\u001aëÚYczÙ\u0094qÞMìÂbº÷=ú0s\u008bZUWì2}V\u00876\u0099i\u0090\u0081ßr>ûb¸\u0086\r\u0004kÜµXOS\n(Ê"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    e = new Integer[13];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "oBÒ¾«ÍÅPQs\u000bHN\rîQ";
                                 var5 = "oBÒ¾«ÍÅPQs\u000bHN\rîQ".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "w'\u008a¶S¸×äá\";\u008bîöx£}e\u0017ù¨\u0093\u0001\u008b÷u\b}JÇåx9\u0084èaÓ\u0004jc\nµ";
                  var12 = "w'\u008a¶S¸×äá\";\u008bîöx£}e\u0017ù¨\u0093\u0001\u008b÷u\b}JÇåx9\u0084èaÓ\u0004jc\nµ".length();
                  var9 = 18;
                  var17 = -1;
            }

            var10000 = 9;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





