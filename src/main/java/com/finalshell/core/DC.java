package com.finalshell.core;

public final class DC {
   public static int[] M;
   static int[] b;
   int N;
   int p;
   int q;
   int J;
   int[] P;
   int[] u = new int[1];
   int[] Q;
   int[] G;
   int[] H;
   int[][] D;
   int[][] o;
   int[] y;
   int[] w;
   public final Re2 V;
   int v;
   int m;
   int t;
   int[] g;
   byte[] B;
   int Z;
   int a;
   int O;
   public boolean z;
   public final Ny2 n;
   public final Df2 h;
   public static String[] c;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   DC(Df2 var1, int var2) {
      int[] var10000 = Nm4.g();
      this.Q = new int[1];
      this.G = new int[1];
      this.H = new int[1];
      this.D = new int[1][];
      this.o = new int[1][];
      this.y = new int[1];
      int[] var3 = var10000;
      this.w = new int[1];
      this.n = new Ny2();
      this.h = var1;
      this.V = new Re2(this.h, this);
      this.g = new int[a(22997, 4523291595935445694L)];
      this.B = new byte[var2];
      this.Z = var2;
      int var10001 = var1.T.y;
      if (var3 == null) {
         var10001 = var1.T.y == 0 ? 0 : 1;
      }

      this.z = (boolean)var10001;
      this.N = 0;
      this.z();
   }

   void z() {
      DC var2;
      label36: {
         label37: {
            int[] var1 = Nm4.g();
            var10000 = this.N;
            int var10001 = 4;
            if (var1 == null) {
               if (this.N != 4 && this.N == 5) {
               }

               var10000 = this.N;
               if (var1 != null) {
                  break label37;
               }

               var10001 = a(4269, 2118151574774430715L);
            }

            if (var10000 == var10001) {
               this.V.O(this.h);
            }

            this.N = 0;
            this.m = 0;
            this.t = 0;
            this.a = this.O = 0;
            var2 = this;
            if (var1 != null) {
               break label36;
            }

            var10000 = this.z;
         }

         if (var10000 == 0) {
            return;
         }

         var2 = this;
      }

      var2.h.e.C();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   int S(int var1) {
      int[] var2;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var39;
      label714: {
         var6 = this.h.f;
         var7 = this.h.L;
         var4 = this.t;
         var5 = this.m;
         int[] var10000 = Nm4.g();
         var8 = this.O;
         var2 = var10000;
         var39 = var8;
         int var10001 = this.a;
         if (var2 == null) {
            if (var8 < this.a) {
               var39 = this.a - var8 - 1;
               break label714;
            }

            var39 = this.Z;
            var10001 = var8;
         }

         var39 -= var10001;
      }

      int var9 = var39;

      label759: {
         label794: {
            label795: {
               label796: {
                  label797: {
                     label798: {
                        label799: {
                           label800: {
                              label760: {
                                 label687:
                                 while (true) {
                                    label761: {
                                       label681: {
                                          label680:
                                          while (true) {
                                             label678:
                                             while (true) {
                                                switch (this.N) {
                                                   case 0:
                                                      while (true) {
                                                         if (var5 < 3) {
                                                            var39 = var7;
                                                            if (var2 != null) {
                                                               break;
                                                            }

                                                            if (var2 != null) {
                                                               return var7;
                                                            }

                                                            if (var7 == 0) {
                                                               this.t = var4;
                                                               this.m = var5;
                                                               this.h.L = var7;
                                                               this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                               this.h.f = var6;
                                                               this.O = var8;
                                                               return this.C(var1);
                                                            }

                                                            var1 = 0;
                                                            if (var2 != null) {
                                                               this.t = var4;
                                                               this.m = var5;
                                                               this.h.L = var7;
                                                               this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                               this.h.f = var6;
                                                               this.O = var8;
                                                               return this.C(var1);
                                                            }

                                                            var7--;
                                                            var4 |= (this.h.x[var6++] & a(18678, 3436660671119254430L)) << var5;
                                                            var5 += 8;
                                                            if (var2 == null) {
                                                               continue;
                                                            }
                                                         }

                                                         var39 = var4 & a(24432, 2353475014245184559L);
                                                         break;
                                                      }

                                                      label650: {
                                                         label649: {
                                                            label648: {
                                                               int var3 = var39;
                                                               this.v = var3 & 1;
                                                               var39 = var3 >>> 1;
                                                               if (var2 == null) {
                                                                  switch (var39) {
                                                                     case 0:
                                                                        var4 >>>= 3;
                                                                        var5 -= 3;
                                                                        var3 = var5 & a(14864, 6734652441806836052L);
                                                                        var4 >>>= var3;
                                                                        var39 = var5 - var3;
                                                                        break;
                                                                     case 1:
                                                                        break label648;
                                                                     case 2:
                                                                        break label649;
                                                                     case 3:
                                                                        break label759;
                                                                     default:
                                                                        break label650;
                                                                  }
                                                               }

                                                               var5 = var39;
                                                               this.N = 1;
                                                               if (var2 == null) {
                                                                  break label650;
                                                               }
                                                            }

                                                            Ny2.r(this.G, this.H, this.D, this.o, this.h);
                                                            this.V.m(this.G[0], this.H[0], this.D[0], 0, this.o[0], 0);
                                                            var4 >>>= 3;
                                                            var5 -= 3;
                                                            this.N = a(30862, 773978373744841679L);
                                                            if (var2 == null) {
                                                               break label650;
                                                            }
                                                         }

                                                         var4 >>>= 3;
                                                         var5 -= 3;
                                                         this.N = a(11694, 7064307950215759570L);
                                                         if (var2 != null) {
                                                            break label759;
                                                         }
                                                      }

                                                      if (var2 == null) {
                                                         continue;
                                                      }
                                                   case 1:
                                                      break;
                                                   case 2:
                                                      break label678;
                                                   case 3:
                                                      break label680;
                                                   case 4:
                                                      var39 = this.J;
                                                      break label681;
                                                   case 5:
                                                      break label761;
                                                   case 6:
                                                      this.t = var4;
                                                      this.m = var5;
                                                      this.h.L = var7;
                                                      this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                      this.h.f = var6;
                                                      this.O = var8;
                                                      var39 = var1 = this.V.Q(var1);
                                                      int var79 = 1;
                                                      if (var2 == null) {
                                                         if (var39 != 1) {
                                                            return this.C(var1);
                                                         }

                                                         var1 = 0;
                                                         this.V.O(this.h);
                                                         var6 = this.h.f;
                                                         var7 = this.h.L;
                                                         var4 = this.t;
                                                         var5 = this.m;
                                                         var8 = this.O;
                                                         var39 = var8;
                                                         var79 = this.a;
                                                      }

                                                      label430: {
                                                         if (var2 == null) {
                                                            if (var39 < var79) {
                                                               var39 = this.a - var8 - 1;
                                                               break label430;
                                                            }

                                                            var39 = this.Z;
                                                            var79 = var8;
                                                         }

                                                         var39 -= var79;
                                                      }

                                                      var9 = var39;
                                                      DC var42 = this;
                                                      if (var2 == null) {
                                                         if (this.v == 0) {
                                                            this.N = 0;
                                                            if (var2 == null) {
                                                               continue;
                                                            }
                                                         }

                                                         var42 = this;
                                                      }

                                                      var42.N = a(14864, 6734652441806836052L);
                                                   case 7:
                                                      break label687;
                                                   case 8:
                                                      break label794;
                                                   case 9:
                                                      var1 = a(14913, 857702905109352719L);
                                                      this.t = var4;
                                                      this.m = var5;
                                                      this.h.L = var7;
                                                      this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                      this.h.f = var6;
                                                      this.O = var8;
                                                      return this.C(var1);
                                                   default:
                                                      var1 = a(10007, 11645518728170615L);
                                                      this.t = var4;
                                                      this.m = var5;
                                                      this.h.L = var7;
                                                      this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                      this.h.f = var6;
                                                      this.O = var8;
                                                      return this.C(var1);
                                                }

                                                while (true) {
                                                   if (var5 < a(14721, 6868418703061717721L)) {
                                                      var39 = var7;
                                                      if (var2 != null) {
                                                         break;
                                                      }

                                                      if (var2 != null) {
                                                         return var7;
                                                      }

                                                      if (var7 == 0) {
                                                         break label795;
                                                      }

                                                      var1 = 0;
                                                      if (var2 != null) {
                                                         break label795;
                                                      }

                                                      var7--;
                                                      var4 |= (this.h.x[var6++] & a(12757, 3571799317012224677L)) << var5;
                                                      var5 += 8;
                                                      if (var2 == null) {
                                                         continue;
                                                      }
                                                   }

                                                   var39 = ~var4 >>> a(8835, 7049914514974935518L) & a(22808, 6212619223366693500L);
                                                   break;
                                                }

                                                int var80 = var4 & a(474, 4390235326533347993L);
                                                if (var2 == null) {
                                                   if (var39 != var80) {
                                                      this.N = a(9290, 5204385231924629297L);
                                                      this.h.t = a(25415, 29950);
                                                      var1 = a(14913, 857702905109352719L);
                                                      this.t = var4;
                                                      this.m = var5;
                                                      this.h.L = var7;
                                                      this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                      this.h.f = var6;
                                                      this.O = var8;
                                                      return this.C(var1);
                                                   }

                                                   this.p = var4 & a(474, 4390235326533347993L);
                                                   var39 = 0;
                                                   var80 = 0;
                                                }

                                                var5 = var80;
                                                var4 = var39;
                                                var80 = this.p;
                                                if (var2 == null) {
                                                   if (this.p != 0) {
                                                      this.N = 2;
                                                      if (var2 == null) {
                                                         continue;
                                                      }
                                                      break;
                                                   }

                                                   var80 = this.v;
                                                }

                                                if (var2 == null) {
                                                   var80 = var80 != 0 ? a(14864, 6734652441806836052L) : 0;
                                                }

                                                this.N = var80;
                                                if (var2 != null) {
                                                   break;
                                                }
                                             }

                                             var39 = var7;
                                             if (var2 == null) {
                                                if (var7 == 0) {
                                                   this.t = var4;
                                                   this.m = var5;
                                                   this.h.L = var7;
                                                   this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                   this.h.f = var6;
                                                   this.O = var8;
                                                   return this.C(var1);
                                                }

                                                var39 = var9;
                                             }

                                             label572:
                                             if (var2 == null) {
                                                if (var39 == 0) {
                                                   var39 = var8;
                                                   label557:
                                                   if (var2 == null) {
                                                      if (var8 == this.Z) {
                                                         var39 = this.a;
                                                         if (var2 != null) {
                                                            break label557;
                                                         }

                                                         if (this.a != 0) {
                                                            label562: {
                                                               var8 = 0;
                                                               var39 = var8;
                                                               int var82 = this.a;
                                                               if (var2 == null) {
                                                                  if (var8 < this.a) {
                                                                     var39 = this.a - var8 - 1;
                                                                     break label562;
                                                                  }

                                                                  var39 = this.Z;
                                                                  var82 = var8;
                                                               }

                                                               var39 -= var82;
                                                            }

                                                            var9 = var39;
                                                         }
                                                      }

                                                      var39 = var9;
                                                   }

                                                   if (var2 != null) {
                                                      break label572;
                                                   }

                                                   if (var39 == 0) {
                                                      label551: {
                                                         this.O = var8;
                                                         var1 = this.C(var1);
                                                         var8 = this.O;
                                                         var39 = var8;
                                                         int var83 = this.a;
                                                         if (var2 == null) {
                                                            if (var8 < this.a) {
                                                               var39 = this.a - var8 - 1;
                                                               break label551;
                                                            }

                                                            var39 = this.Z;
                                                            var83 = var8;
                                                         }

                                                         var39 -= var83;
                                                      }

                                                      var9 = var39;
                                                      var39 = var8;
                                                      label534:
                                                      if (var2 == null) {
                                                         if (var8 == this.Z) {
                                                            var39 = this.a;
                                                            if (var2 != null) {
                                                               break label534;
                                                            }

                                                            if (this.a != 0) {
                                                               label539: {
                                                                  var8 = 0;
                                                                  var39 = var8;
                                                                  int var84 = this.a;
                                                                  if (var2 == null) {
                                                                     if (var8 < this.a) {
                                                                        var39 = this.a - var8 - 1;
                                                                        break label539;
                                                                     }

                                                                     var39 = this.Z;
                                                                     var84 = var8;
                                                                  }

                                                                  var39 -= var84;
                                                               }

                                                               var9 = var39;
                                                            }
                                                         }

                                                         var39 = var9;
                                                      }

                                                      if (var2 != null) {
                                                         break label572;
                                                      }

                                                      if (var39 == 0) {
                                                         this.t = var4;
                                                         this.m = var5;
                                                         this.h.L = var7;
                                                         this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                         this.h.f = var6;
                                                         this.O = var8;
                                                         return this.C(var1);
                                                      }
                                                   }
                                                }

                                                var1 = 0;
                                                var39 = this.p;
                                             }

                                             int var23 = var39;
                                             var39 = var23;
                                             int var85 = var7;
                                             if (var2 == null) {
                                                if (var23 > var7) {
                                                   var23 = var7;
                                                }

                                                var39 = var23;
                                                var85 = var9;
                                             }

                                             if (var2 == null) {
                                                if (var39 > var85) {
                                                   var23 = var9;
                                                }

                                                System.arraycopy(this.h.x, var6, this.B, var8, var23);
                                                var6 += var23;
                                                var7 -= var23;
                                                var8 += var23;
                                                var39 = var9;
                                                var85 = var23;
                                             }

                                             var9 = var39 - var85;
                                             DC var55 = this;
                                             var85 = this.p - var23;
                                             if (var2 == null) {
                                                if ((this.p = var85) != 0 && var2 == null) {
                                                   continue;
                                                }

                                                var55 = this;
                                                var85 = this.v;
                                             }

                                             if (var2 == null) {
                                                var85 = var85 != 0 ? a(14864, 6734652441806836052L) : 0;
                                             }

                                             var55.N = var85;
                                             if (var2 != null) {
                                                break;
                                             }
                                          }

                                          while (true) {
                                             if (var5 < a(25037, 1492721350452923019L)) {
                                                var39 = var7;
                                                if (var2 != null) {
                                                   break;
                                                }

                                                if (var2 != null) {
                                                   return var7;
                                                }

                                                if (var7 == 0) {
                                                   break label796;
                                                }

                                                var1 = 0;
                                                if (var2 != null) {
                                                   break label796;
                                                }

                                                var7--;
                                                var4 |= (this.h.x[var6++] & a(12757, 3571799317012224677L)) << var5;
                                                var5 += 8;
                                                if (var2 == null) {
                                                   continue;
                                                }
                                             }

                                             int var24;
                                             this.q = var24 = var4 & a(12792, 1697514516235655833L);
                                             var39 = var24 & a(3854, 1447116990127645800L);
                                             if (var2 != null) {
                                                return var39;
                                             }

                                             if (var39 > a(14013, 7620670665642712532L)) {
                                                break label797;
                                             }

                                             var39 = var24 >> 5 & a(16572, 6474331508880731111L);
                                             int var87 = a(22661, 218260688106779598L);
                                             if (var2 == null) {
                                                if (var39 > var87) {
                                                   break label797;
                                                }

                                                var39 = a(24028, 8794803382669670018L) + (var24 & a(16572, 6474331508880731111L));
                                                var87 = var24 >> 5 & a(16572, 6474331508880731111L);
                                             }

                                             label394: {
                                                label732: {
                                                   label392: {
                                                      label391: {
                                                         var24 = var39 + var87;
                                                         DC var58 = this;
                                                         if (var2 == null) {
                                                            if (this.P != null) {
                                                               var39 = this.P.length;
                                                               if (var2 != null) {
                                                                  break label392;
                                                               }

                                                               if (var39 >= var24) {
                                                                  break label391;
                                                               }
                                                            }

                                                            var58 = this;
                                                         }

                                                         var58.P = new int[var24];
                                                         if (var2 == null) {
                                                            break label732;
                                                         }
                                                      }

                                                      var39 = 0;
                                                   }

                                                   int var10 = var39;

                                                   while (var10 < var24) {
                                                      this.P[var10] = 0;
                                                      var10++;
                                                      if (var2 != null) {
                                                         break label394;
                                                      }

                                                      if (var2 != null) {
                                                         break;
                                                      }
                                                   }
                                                }

                                                var4 >>>= a(29366, 4843262844623149504L);
                                                var5 -= 14;
                                                this.J = 0;
                                             }

                                             this.N = a(24433, 144612162747790344L);
                                             var39 = this.J;
                                             break;
                                          }
                                       }

                                       int var88;
                                       label607:
                                       while (true) {
                                          if (var39 >= 4 + (this.q >>> a(29534, 6640681241821370412L))) {
                                             var39 = this.J;
                                             var88 = a(10614, 3372948448106152497L);
                                             break;
                                          }

                                          while (true) {
                                             var39 = var5;
                                             var88 = 3;
                                             if (var2 != null) {
                                                break label607;
                                             }

                                             label735: {
                                                if (var5 < 3) {
                                                   if (var2 != null) {
                                                      var4 = var7;
                                                      var5 -= 3;
                                                      if (var2 == null) {
                                                         var39 = this.J;
                                                         break;
                                                      }
                                                      break label735;
                                                   }

                                                   if (var2 != null) {
                                                      return var7;
                                                   }

                                                   if (var7 == 0) {
                                                      break label798;
                                                   }

                                                   var1 = 0;
                                                   if (var2 != null) {
                                                      break label798;
                                                   }

                                                   var7--;
                                                   var4 |= (this.h.x[var6++] & a(12757, 3571799317012224677L)) << var5;
                                                   var5 += 8;
                                                   if (var2 == null) {
                                                      continue;
                                                   }
                                                }

                                                this.P[b[this.J++]] = var4 & a(14864, 6734652441806836052L);
                                                var4 >>>= 3;
                                                var5 -= 3;
                                                if (var2 == null) {
                                                   var39 = this.J;
                                                   break;
                                                }
                                             }

                                             var39 = this.J;
                                             var88 = a(10614, 3372948448106152497L);
                                             break label607;
                                          }
                                       }

                                       while (true) {
                                          label525: {
                                             if (var39 < var88) {
                                                this.P[b[this.J++]] = 0;
                                                if (var2 != null) {
                                                   break label525;
                                                }

                                                if (var2 == null) {
                                                   var39 = this.J;
                                                   var88 = a(10614, 3372948448106152497L);
                                                   continue;
                                                }
                                             }

                                             this.u[0] = a(14864, 6734652441806836052L);
                                          }

                                          int var26 = this.n.P(this.P, this.u, this.Q, this.g, this.h);
                                          if (var2 == null) {
                                             if (var26 != 0) {
                                                var39 = var26;
                                                if (var2 == null) {
                                                   if (var26 == a(14913, 857702905109352719L)) {
                                                      this.P = null;
                                                      this.N = a(9290, 5204385231924629297L);
                                                   }

                                                   this.t = var4;
                                                   this.m = var5;
                                                   this.h.L = var7;
                                                   this.h.O = this.h.O + (long)(var6 - this.h.f);
                                                   this.h.f = var6;
                                                   this.O = var8;
                                                   var39 = this.C(var26);
                                                }

                                                return var39;
                                             }

                                             this.J = 0;
                                          }

                                          this.N = a(25200, 5707485352743258372L);
                                          break;
                                       }
                                    }

                                    do {
                                       int var27;
                                       label513: {
                                          var27 = this.q;
                                          if (this.J
                                             >= a(6151, 9108551211836977986L)
                                                + (var27 & a(16572, 6474331508880731111L))
                                                + (var27 >> 5 & a(16572, 6474331508880731111L))) {
                                             if (var2 != null) {
                                                break label513;
                                             }

                                             if (var2 == null) {
                                                break;
                                             }
                                          }

                                          var27 = this.u[0];
                                       }

                                       while (true) {
                                          if (var5 < var27) {
                                             var39 = var7;
                                             if (var2 != null) {
                                                break;
                                             }

                                             if (var2 != null) {
                                                return var7;
                                             }

                                             if (var7 == 0) {
                                                break label799;
                                             }

                                             var1 = 0;
                                             if (var2 != null) {
                                                break label799;
                                             }

                                             var7--;
                                             var4 |= (this.h.x[var6++] & a(12757, 3571799317012224677L)) << var5;
                                             var5 += 8;
                                             if (var2 == null) {
                                                continue;
                                             }
                                          }

                                          var39 = this.Q[0];
                                          break;
                                       }

                                       if (var39 == -1) {
                                       }

                                       var27 = this.g[(this.Q[0] + (var4 & M[var27])) * 3 + 1];
                                       int var13 = this.g[(this.Q[0] + (var4 & M[var27])) * 3 + 2];
                                       var39 = var13;
                                       int var89 = a(32511, 1230210044097811866L);
                                       if (var2 == null) {
                                          if (var13 < var89) {
                                             var4 >>>= var27;
                                             var5 -= var27;
                                             this.P[this.J++] = var13;
                                             if (var2 == null) {
                                                continue;
                                             }
                                          }

                                          var39 = var13;
                                          var89 = a(1816, 3694444548171115625L);
                                       }

                                       label490: {
                                          if (var2 == null) {
                                             if (var39 == var89) {
                                                var39 = a(14864, 6734652441806836052L);
                                                break label490;
                                             }

                                             var39 = var13;
                                             var89 = a(29366, 4843262844623149504L);
                                          }

                                          var39 -= var89;
                                       }

                                       int var11 = var39;
                                       var39 = var13;
                                       if (var2 == null) {
                                          var39 = var13 == a(29632, 4870013022758033582L) ? a(23180, 7250323131201647103L) : 3;
                                       }

                                       int var12 = var39;

                                       label483: {
                                          while (var5 < var27 + var11) {
                                             var39 = var7;
                                             if (var2 != null) {
                                                break label483;
                                             }

                                             if (var2 != null) {
                                                return var7;
                                             }

                                             if (var7 == 0) {
                                                break label800;
                                             }

                                             var1 = 0;
                                             if (var2 != null) {
                                                break label800;
                                             }

                                             var7--;
                                             var4 |= (this.h.x[var6++] & a(12757, 3571799317012224677L)) << var5;
                                             var5 += 8;
                                             if (var2 != null) {
                                                break;
                                             }
                                          }

                                          var4 >>>= var27;
                                          var5 -= var27;
                                          var12 += var4 & M[var11];
                                          var4 >>>= var11;
                                          var5 -= var11;
                                          var11 = this.J;
                                          var27 = this.q;
                                          var39 = var11 + var12;
                                       }

                                       if (var2 != null) {
                                          return var39;
                                       }

                                       if (var39
                                          > a(6151, 9108551211836977986L)
                                             + (var27 & a(16572, 6474331508880731111L))
                                             + (var27 >> 5 & a(16572, 6474331508880731111L))) {
                                          break label760;
                                       }

                                       label471: {
                                          var39 = var13;
                                          var89 = a(32511, 1230210044097811866L);
                                          label470:
                                          if (var2 == null) {
                                             if (var13 == var89) {
                                                var39 = var11;
                                                var89 = 1;
                                                if (var2 != null) {
                                                   break label470;
                                                }

                                                if (var11 < 1) {
                                                   break label760;
                                                }
                                             }

                                             var39 = var13;
                                             if (var2 != null) {
                                                break label471;
                                             }

                                             var89 = a(32511, 1230210044097811866L);
                                          }

                                          var39 = var39 == var89 ? this.P[var11 - 1] : 0;
                                       }

                                       var13 = var39;

                                       label459:
                                       while (true) {
                                          DC var68 = this;

                                          do {
                                             var68.P[var11++] = var13;
                                             if (--var12 != 0) {
                                                continue label459;
                                             }

                                             var68 = this;
                                          } while (var2 != null);

                                          this.J = var11;
                                          break;
                                       }
                                    } while (var2 == null);

                                    this.Q[0] = -1;
                                    this.G[0] = a(9290, 5204385231924629297L);
                                    this.H[0] = a(30862, 773978373744841679L);
                                    int var29 = this.q;
                                    var29 = this.n
                                       .u(
                                          a(16993, 7630357195837401372L) + (var29 & a(16572, 6474331508880731111L)),
                                          1 + (var29 >> 5 & a(16572, 6474331508880731111L)),
                                          this.P,
                                          this.G,
                                          this.H,
                                          this.y,
                                          this.w,
                                          this.g,
                                          this.h
                                       );
                                    if (var2 == null) {
                                       if (var29 != 0) {
                                          var39 = var29;
                                          if (var2 == null) {
                                             if (var29 == a(14913, 857702905109352719L)) {
                                                this.P = null;
                                                this.N = a(9290, 5204385231924629297L);
                                             }

                                             this.t = var4;
                                             this.m = var5;
                                             this.h.L = var7;
                                             this.h.O = this.h.O + (long)(var6 - this.h.f);
                                             this.h.f = var6;
                                             this.O = var8;
                                             var39 = this.C(var29);
                                          }

                                          return var39;
                                       }

                                       this.V.m(this.G[0], this.H[0], this.g, this.y[0], this.g, this.w[0]);
                                    }

                                    this.N = a(30862, 773978373744841679L);
                                    this.t = var4;
                                    this.m = var5;
                                    this.h.L = var7;
                                    this.h.O = this.h.O + (long)(var6 - this.h.f);
                                    this.h.f = var6;
                                    this.O = var8;
                                    var39 = var1 = this.V.Q(var1);
                                    int var92 = 1;
                                    if (var2 == null) {
                                       if (var39 != 1) {
                                          return this.C(var1);
                                       }

                                       var1 = 0;
                                       this.V.O(this.h);
                                       var6 = this.h.f;
                                       var7 = this.h.L;
                                       var4 = this.t;
                                       var5 = this.m;
                                       var8 = this.O;
                                       var39 = var8;
                                       var92 = this.a;
                                    }

                                    label352: {
                                       if (var2 == null) {
                                          if (var39 < var92) {
                                             var39 = this.a - var8 - 1;
                                             break label352;
                                          }

                                          var39 = this.Z;
                                          var92 = var8;
                                       }

                                       var39 -= var92;
                                    }

                                    var9 = var39;
                                    DC var72 = this;
                                    if (var2 == null) {
                                       if (this.v == 0) {
                                          this.N = 0;
                                          if (var2 == null) {
                                             continue;
                                          }
                                       }

                                       var72 = this;
                                    }

                                    var72.N = a(14864, 6734652441806836052L);
                                    break;
                                 }

                                 label305: {
                                    this.O = var8;
                                    var1 = this.C(var1);
                                    var8 = this.O;
                                    var39 = var8;
                                    int var93 = this.a;
                                    if (var2 == null) {
                                       if (var8 < this.a) {
                                          var39 = this.a - var8 - 1;
                                          break label305;
                                       }

                                       var39 = this.Z;
                                       var93 = var8;
                                    }

                                    var39 -= var93;
                                 }

                                 DC var76 = this;
                                 if (var2 == null) {
                                    if (this.a != this.O) {
                                       this.t = var4;
                                       this.m = var5;
                                       this.h.L = var7;
                                       this.h.O = this.h.O + (long)(var6 - this.h.f);
                                       this.h.f = var6;
                                       this.O = var8;
                                       return this.C(var1);
                                    }

                                    var76 = this;
                                 }

                                 var76.N = a(25662, 5053135927995125623L);
                                 break label794;
                              }

                              this.P = null;
                              this.N = a(9290, 5204385231924629297L);
                              this.h.t = a(25414, 16936);
                              var1 = a(14913, 857702905109352719L);
                              this.t = var4;
                              this.m = var5;
                              this.h.L = var7;
                              this.h.O = this.h.O + (long)(var6 - this.h.f);
                              this.h.f = var6;
                              this.O = var8;
                              return this.C(var1);
                           }

                           this.t = var4;
                           this.m = var5;
                           this.h.L = var7;
                           this.h.O = this.h.O + (long)(var6 - this.h.f);
                           this.h.f = var6;
                           this.O = var8;
                           return this.C(var1);
                        }

                        this.t = var4;
                        this.m = var5;
                        this.h.L = var7;
                        this.h.O = this.h.O + (long)(var6 - this.h.f);
                        this.h.f = var6;
                        this.O = var8;
                        return this.C(var1);
                     }

                     this.t = var4;
                     this.m = var5;
                     this.h.L = var7;
                     this.h.O = this.h.O + (long)(var6 - this.h.f);
                     this.h.f = var6;
                     this.O = var8;
                     return this.C(var1);
                  }

                  this.N = a(9290, 5204385231924629297L);
                  this.h.t = a(25413, 30840);
                  var1 = a(14913, 857702905109352719L);
                  this.t = var4;
                  this.m = var5;
                  this.h.L = var7;
                  this.h.O = this.h.O + (long)(var6 - this.h.f);
                  this.h.f = var6;
                  this.O = var8;
                  return this.C(var1);
               }

               this.t = var4;
               this.m = var5;
               this.h.L = var7;
               this.h.O = this.h.O + (long)(var6 - this.h.f);
               this.h.f = var6;
               this.O = var8;
               return this.C(var1);
            }

            this.t = var4;
            this.m = var5;
            this.h.L = var7;
            this.h.O = this.h.O + (long)(var6 - this.h.f);
            this.h.f = var6;
            this.O = var8;
            return this.C(var1);
         }

         byte var20 = 1;
         this.t = var4;
         this.m = var5;
         this.h.L = var7;
         this.h.O = this.h.O + (long)(var6 - this.h.f);
         this.h.f = var6;
         this.O = var8;
         return this.C(var20);
      }

      var4 >>>= 3;
      var5 -= 3;
      this.N = a(8944, 2581519292372191624L);
      this.h.t = a(25412, -7535);
      var1 = a(23658, 398273062011401993L);
      this.t = var4;
      this.m = var5;
      this.h.L = var7;
      this.h.O = this.h.O + (long)(var6 - this.h.f);
      this.h.f = var6;
      this.O = var8;
      return this.C(var1);
   }

   void I() {
      this.z();
      this.B = null;
      this.g = null;
   }

   void b(byte[] var1, int var2, int var3) {
      System.arraycopy(var1, var2, this.B, 0, var3);
      this.a = this.O = var3;
   }

   int F() {
      int[] var1 = Nm4.g();
      int var10000 = this.N;
      if (var1 == null) {
         var10000 = this.N == 1 ? 1 : 0;
      }

      return var10000;
   }

   int C(int var1) {
      int var4 = this.h.V;
      int[] var10000 = Nm4.g();
      int var5 = this.a;
      int[] var2 = var10000;
      int var7 = var5;
      if (var2 == null) {
         var7 = var5 <= this.O ? this.O : this.Z;
      }

      int var3 = var7 - var5;
      int var8 = var3;
      if (var2 == null) {
         if (var3 > this.h.g) {
            var3 = this.h.g;
         }

         var8 = var3;
      }

      label100:
      if (var2 == null) {
         if (var8 != 0) {
            var8 = var1;
            if (var2 != null) {
               break label100;
            }

            if (var1 == a(547, 8414639432665573753L)) {
               var1 = 0;
            }
         }

         this.h.g -= var3;
         this.h.F += (long)var3;
         var8 = (this.z) ? 1 : 0;
      }

      label93:
      if (var2 == null) {
         if (var8 != 0) {
            var8 = var3;
            if (var2 != null) {
               break label93;
            }

            if (var3 > 0) {
               this.h.e.A(this.B, var5, var3);
            }
         }

         System.arraycopy(this.B, var5, this.h.h, var4, var3);
         var4 += var3;
         var5 += var3;
         var8 = var5;
      }

      if (var2 == null) {
         if (var8 == this.Z) {
            label107: {
               var6 = 0;
               var9 = this.O;
               int var10001 = this.Z;
               if (var2 == null) {
                  if (this.O == this.Z) {
      int[] var9;
      int[] var9;
                     this.O = 0;
                  }

                  var3 = this.O - var6;
                  var9 = var3;
                  if (var2 != null) {
                     break label107;
                  }

                  var10001 = this.h.g;
               }

               if (var9 > var10001) {
                  var3 = this.h.g;
               }

               var9 = var3;
            }

            label75:
            if (var2 == null) {
               if (var9 != 0) {
      int[] var9;
                  var9 = var1;
                  if (var2 != null) {
                     break label75;
                  }

                  if (var1 == a(18451, 8181390361273328500L)) {
                     var1 = 0;
                  }
               }

               this.h.g -= var3;
               this.h.F += (long)var3;
               var9 = this.z;
            }

            label68:
            if (var2 == null) {
               if (var9 != 0) {
      int[] var9;
                  var9 = var3;
                  if (var2 != null) {
                     break label68;
                  }

                  if (var3 > 0) {
                     this.h.e.A(this.B, var6, var3);
                  }
               }

               System.arraycopy(this.B, var6, this.h.h, var4, var3);
               var4 += var3;
               var9 = var6 + var3;
            }

            var5 = var9;
         }

         this.h.V = var4;
         this.a = var5;
         var8 = var1;
      }

      return var8;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 25413) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 229;
               break;
            case 1:
               var10000 = 52;
               break;
            case 2:
               var10000 = 125;
               break;
            case 3:
               var10000 = 210;
               break;
            case 4:
               var10000 = 67;
               break;
            case 5:
               var10000 = 173;
               break;
            case 6:
               var10000 = 254;
               break;
            case 7:
               var10000 = 22;
               break;
            case 8:
               var10000 = 252;
               break;
            case 9:
               var10000 = 202;
               break;
            case 10:
               var10000 = 126;
               break;
            case 11:
               var10000 = 189;
               break;
            case 12:
               var10000 = 43;
               break;
            case 13:
               var10000 = 19;
               break;
            case 14:
               var10000 = 171;
               break;
            case 15:
               var10000 = 83;
               break;
            case 16:
               var10000 = 230;
               break;
            case 17:
               var10000 = 169;
               break;
            case 18:
               var10000 = 150;
               break;
            case 19:
               var10000 = 192;
               break;
            case 20:
               var10000 = 179;
               break;
            case 21:
               var10000 = 244;
               break;
            case 22:
               var10000 = 142;
               break;
            case 23:
               var10000 = 101;
               break;
            case 24:
               var10000 = 141;
               break;
            case 25:
               var10000 = 214;
               break;
            case 26:
               var10000 = 89;
               break;
            case 27:
               var10000 = 98;
               break;
            case 28:
               var10000 = 119;
               break;
            case 29:
               var10000 = 30;
               break;
            case 30:
               var10000 = 77;
               break;
            case 31:
               var10000 = 191;
               break;
            case 32:
               var10000 = 80;
               break;
            case 33:
               var10000 = 239;
               break;
            case 34:
               var10000 = 227;
               break;
            case 35:
               var10000 = 64;
               break;
            case 36:
               var10000 = 221;
               break;
            case 37:
               var10000 = 95;
               break;
            case 38:
               var10000 = 195;
               break;
            case 39:
               var10000 = 228;
               break;
            case 40:
               var10000 = 91;
               break;
            case 41:
               var10000 = 72;
               break;
            case 42:
               var10000 = 122;
               break;
            case 43:
               var10000 = 253;
               break;
            case 44:
               var10000 = 21;
               break;
            case 45:
               var10000 = 144;
               break;
            case 46:
               var10000 = 219;
               break;
            case 47:
               var10000 = 127;
               break;
            case 48:
               var10000 = 240;
               break;
            case 49:
               var10000 = 158;
               break;
            case 50:
               var10000 = 249;
               break;
            case 51:
               var10000 = 41;
               break;
            case 52:
               var10000 = 15;
               break;
            case 53:
               var10000 = 154;
               break;
            case 54:
               var10000 = 174;
               break;
            case 55:
               var10000 = 48;
               break;
            case 56:
               var10000 = 225;
               break;
            case 57:
               var10000 = 250;
               break;
            case 58:
               var10000 = 232;
               break;
            case 59:
               var10000 = 128;
               break;
            case 60:
               var10000 = 103;
               break;
            case 61:
               var10000 = 11;
               break;
            case 62:
               var10000 = 14;
               break;
            case 63:
               var10000 = 112;
               break;
            case 64:
               var10000 = 136;
               break;
            case 65:
               var10000 = 194;
               break;
            case 66:
               var10000 = 182;
               break;
            case 67:
               var10000 = 118;
               break;
            case 68:
               var10000 = 199;
               break;
            case 69:
               var10000 = 13;
               break;
            case 70:
               var10000 = 242;
               break;
            case 71:
               var10000 = 104;
               break;
            case 72:
               var10000 = 114;
               break;
            case 73:
               var10000 = 40;
               break;
            case 74:
               var10000 = 251;
               break;
            case 75:
               var10000 = 212;
               break;
            case 76:
               var10000 = 71;
               break;
            case 77:
               var10000 = 184;
               break;
            case 78:
               var10000 = 180;
               break;
            case 79:
               var10000 = 56;
               break;
            case 80:
               var10000 = 197;
               break;
            case 81:
               var10000 = 109;
               break;
            case 82:
               var10000 = 31;
               break;
            case 83:
               var10000 = 187;
               break;
            case 84:
               var10000 = 236;
               break;
            case 85:
               var10000 = 115;
               break;
            case 86:
               var10000 = 157;
               break;
            case 87:
               var10000 = 110;
               break;
            case 88:
               var10000 = 223;
               break;
            case 89:
               var10000 = 193;
               break;
            case 90:
               var10000 = 138;
               break;
            case 91:
               var10000 = 220;
               break;
            case 92:
               var10000 = 63;
               break;
            case 93:
               var10000 = 186;
               break;
            case 94:
               var10000 = 26;
               break;
            case 95:
               var10000 = 237;
               break;
            case 96:
               var10000 = 209;
               break;
            case 97:
               var10000 = 0;
               break;
            case 98:
               var10000 = 60;
               break;
            case 99:
               var10000 = 84;
               break;
            case 100:
               var10000 = 8;
               break;
            case 101:
               var10000 = 12;
               break;
            case 102:
               var10000 = 233;
               break;
            case 103:
               var10000 = 161;
               break;
            case 104:
               var10000 = 100;
               break;
            case 105:
               var10000 = 106;
               break;
            case 106:
               var10000 = 166;
               break;
            case 107:
               var10000 = 38;
               break;
            case 108:
               var10000 = 137;
               break;
            case 109:
               var10000 = 3;
               break;
            case 110:
               var10000 = 78;
               break;
            case 111:
               var10000 = 73;
               break;
            case 112:
               var10000 = 49;
               break;
            case 113:
               var10000 = 121;
               break;
            case 114:
               var10000 = 34;
               break;
            case 115:
               var10000 = 92;
               break;
            case 116:
               var10000 = 167;
               break;
            case 117:
               var10000 = 76;
               break;
            case 118:
               var10000 = 245;
               break;
            case 119:
               var10000 = 218;
               break;
            case 120:
               var10000 = 206;
               break;
            case 121:
               var10000 = 58;
               break;
            case 122:
               var10000 = 99;
               break;
            case 123:
               var10000 = 7;
               break;
            case 124:
               var10000 = 57;
               break;
            case 125:
               var10000 = 175;
               break;
            case 126:
               var10000 = 16;
               break;
            case 127:
               var10000 = 59;
               break;
            case 128:
               var10000 = 25;
               break;
            case 129:
               var10000 = 170;
               break;
            case 130:
               var10000 = 66;
               break;
            case 131:
               var10000 = 10;
               break;
            case 132:
               var10000 = 105;
               break;
            case 133:
               var10000 = 143;
               break;
            case 134:
               var10000 = 94;
               break;
            case 135:
               var10000 = 204;
               break;
            case 136:
               var10000 = 54;
               break;
            case 137:
               var10000 = 32;
               break;
            case 138:
               var10000 = 62;
               break;
            case 139:
               var10000 = 124;
               break;
            case 140:
               var10000 = 74;
               break;
            case 141:
               var10000 = 90;
               break;
            case 142:
               var10000 = 79;
               break;
            case 143:
               var10000 = 33;
               break;
            case 144:
               var10000 = 42;
               break;
            case 145:
               var10000 = 155;
               break;
            case 146:
               var10000 = 216;
               break;
            case 147:
               var10000 = 53;
               break;
            case 148:
               var10000 = 172;
               break;
            case 149:
               var10000 = 177;
               break;
            case 150:
               var10000 = 146;
               break;
            case 151:
               var10000 = 217;
               break;
            case 152:
               var10000 = 87;
               break;
            case 153:
               var10000 = 159;
               break;
            case 154:
               var10000 = 131;
               break;
            case 155:
               var10000 = 28;
               break;
            case 156:
               var10000 = 45;
               break;
            case 157:
               var10000 = 108;
               break;
            case 158:
               var10000 = 151;
               break;
            case 159:
               var10000 = 134;
               break;
            case 160:
               var10000 = 2;
               break;
            case 161:
               var10000 = 207;
               break;
            case 162:
               var10000 = 29;
               break;
            case 163:
               var10000 = 165;
               break;
            case 164:
               var10000 = 139;
               break;
            case 165:
               var10000 = 181;
               break;
            case 166:
               var10000 = 61;
               break;
            case 167:
               var10000 = 17;
               break;
            case 168:
               var10000 = 113;
               break;
            case 169:
               var10000 = 1;
               break;
            case 170:
               var10000 = 24;
               break;
            case 171:
               var10000 = 6;
               break;
            case 172:
               var10000 = 211;
               break;
            case 173:
               var10000 = 133;
               break;
            case 174:
               var10000 = 148;
               break;
            case 175:
               var10000 = 65;
               break;
            case 176:
               var10000 = 44;
               break;
            case 177:
               var10000 = 201;
               break;
            case 178:
               var10000 = 111;
               break;
            case 179:
               var10000 = 75;
               break;
            case 180:
               var10000 = 241;
               break;
            case 181:
               var10000 = 156;
               break;
            case 182:
               var10000 = 152;
               break;
            case 183:
               var10000 = 18;
               break;
            case 184:
               var10000 = 226;
               break;
            case 185:
               var10000 = 224;
               break;
            case 186:
               var10000 = 5;
               break;
            case 187:
               var10000 = 200;
               break;
            case 188:
               var10000 = 160;
               break;
            case 189:
               var10000 = 222;
               break;
            case 190:
               var10000 = 246;
               break;
            case 191:
               var10000 = 23;
               break;
            case 192:
               var10000 = 123;
               break;
            case 193:
               var10000 = 234;
               break;
            case 194:
               var10000 = 243;
               break;
            case 195:
               var10000 = 190;
               break;
            case 196:
               var10000 = 176;
               break;
            case 197:
               var10000 = 50;
               break;
            case 198:
               var10000 = 70;
               break;
            case 199:
               var10000 = 82;
               break;
            case 200:
               var10000 = 93;
               break;
            case 201:
               var10000 = 208;
               break;
            case 202:
               var10000 = 149;
               break;
            case 203:
               var10000 = 129;
               break;
            case 204:
               var10000 = 102;
               break;
            case 205:
               var10000 = 37;
               break;
            case 206:
               var10000 = 132;
               break;
            case 207:
               var10000 = 4;
               break;
            case 208:
               var10000 = 188;
               break;
            case 209:
               var10000 = 107;
               break;
            case 210:
               var10000 = 248;
               break;
            case 211:
               var10000 = 86;
               break;
            case 212:
               var10000 = 235;
               break;
            case 213:
               var10000 = 147;
               break;
            case 214:
               var10000 = 88;
               break;
            case 215:
               var10000 = 162;
               break;
            case 216:
               var10000 = 39;
               break;
            case 217:
               var10000 = 178;
               break;
            case 218:
               var10000 = 97;
               break;
            case 219:
               var10000 = 205;
               break;
            case 220:
               var10000 = 196;
               break;
            case 221:
               var10000 = 163;
               break;
            case 222:
               var10000 = 247;
               break;
            case 223:
               var10000 = 36;
               break;
            case 224:
               var10000 = 164;
               break;
            case 225:
               var10000 = 81;
               break;
            case 226:
               var10000 = 215;
               break;
            case 227:
               var10000 = 145;
               break;
            case 228:
               var10000 = 51;
               break;
            case 229:
               var10000 = 185;
               break;
            case 230:
               var10000 = 120;
               break;
            case 231:
               var10000 = 130;
               break;
            case 232:
               var10000 = 255;
               break;
            case 233:
               var10000 = 20;
               break;
            case 234:
               var10000 = 9;
               break;
            case 235:
               var10000 = 135;
               break;
            case 236:
               var10000 = 68;
               break;
            case 237:
               var10000 = 46;
               break;
            case 238:
               var10000 = 231;
               break;
            case 239:
               var10000 = 203;
               break;
            case 240:
               var10000 = 55;
               break;
            case 241:
               var10000 = 168;
               break;
            case 242:
               var10000 = 153;
               break;
            case 243:
               var10000 = 183;
               break;
            case 244:
               var10000 = 116;
               break;
            case 245:
               var10000 = 140;
               break;
            case 246:
               var10000 = 47;
               break;
            case 247:
               var10000 = 96;
               break;
            case 248:
               var10000 = 69;
               break;
            case 249:
               var10000 = 35;
               break;
            case 250:
               var10000 = 27;
               break;
            case 251:
               var10000 = 238;
               break;
            case 252:
               var10000 = 85;
               break;
            case 253:
               var10000 = 213;
               break;
            case 254:
               var10000 = 117;
               break;
            default:
               var10000 = 198;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11116;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "\u0013\n«\u008a?-s\u0084ºö\u007fôxsùãiC*\t2¯!ÕÙ1Ä37lÊÐSa¡\u0012\u008d'ßO\u008aôîï\u0000é(\u001aÕVÝÀmB";
      int var12 = "\u0013\n«\u008a?-s\u0084ºö\u007fôxsùãiC*\t2¯!ÕÙ1Ä37lÊÐSa¡\u0012\u008d'ßO\u008aôîï\u0000é(\u001aÕVÝÀmB".length();
      char var9 = '#';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 85;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var41 = var10001.toCharArray();
               int var10004 = var41.length;
               int var14 = 0;
               byte var44 = var10000;
               var35 = var41;
               int var26 = var10004;
               byte var51;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               } else {
                  var44 = var10000;
                  var26 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var66 = var57[var10006];
                  byte var67;
                  switch (var14 % 7) {
                     case 0:
                        var67 = 78;
                        break;
                     case 1:
                        var67 = 76;
                        break;
                     case 2:
                        var67 = 106;
                        break;
                     case 3:
                        var67 = 31;
                        break;
                     case 4:
                        var67 = 23;
                        break;
                     case 5:
                        var67 = 37;
                        break;
                     default:
                        var67 = 39;
                  }

                  var57[var10006] = (char)(var66 ^ var51 ^ var67);
                  var14++;
                  if (var44 == 0) {
                     var10006 = var44;
                     var57 = var35;
                     var51 = var44;
                  } else {
                     if (var26 <= var14) {
                        break;
                     }

                     var57 = var35;
                     var51 = var44;
                     var10006 = var14;
                  }
               }
            }

            String var46 = new String(var35).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var46;
                  if ((var17 += var9) >= var12) {
                     c = var13;
                     d = new String[4];
                     long var0 = 8615879035741064270L;
                     long[] var6 = new long[59];
                     int var3 = 0;
                     String var4 = "¦\u009bÔîÈ\u0016na¶8ÛP\u0011bèlï.ó\u00158\u0010\u0014òÖ\u0080·# \nY<~Ê\u0089¼\u009a\u008a¯/\u0084\\/y®ËQ\u0087\u0014Ìþ\u0092$ºµú/Aú«>).\u0010,«\u0002Ï\u0004\u009cÁÍP]s}ì\u0085\u0099Ä-~d\u0088Ééh9z\u0081\u0080òºkPÁÐÁ\u0013réï¿Çé\u0006²Dä_i(w\fÐQ¶#N\u0083\u009c´}¤\u0016 Äº\u009a\u001cwA\u008d\u0080Ê\u009fÇ«]S¾/$S\u000fù\u0087AÁ©·ÇK\u001fûe\u0011ñ[Æ\u008e£Ðåû½EÏ½\u008c¶$gÜ¸Bc\u0002\u009c\u0017Ì\u0007\u000fõ\u0096\u008cZ\u0084Ö<Ãv\u00ad´TÝÚ\u0015\u0005O¥Iê¨üKýZ15Äaö\u0088\u0095\u0080Hn\u0094Ý\u001fïô\u001bÖ\u0091LmrkÖ\u0014Y<»\u0017\u0091\nà5\tþ\u00adÛ\\H\u0014h\u000e(\u009fóß\u0006½ºbiòi®éÂ%\u00162dØ©ô\u009c\u0000\u008a¦¢³\u00036\"¼\u0080N³;Ð\u0094L\"\u001a\"Q\u0017\u009fÓó\u0015ã\u0082ò'\u001cý\u00031RV\u009bç0 ¯^= c÷ö\u001d¿\u009dn\u0091Ó\u007fF\u0089Ý\u001dà\u009f2²îëþ\u000eÞ\u0002±P[w\u0086Ëj=ë÷¦\u0006NlMSÈ(âk\u009dÔ}Ä\u0011Kgñ\u009f\u0087àªó\u0095\u001c¹aþØ¦FêWp\u0019(d³JSQ¬u\u0000\u009e\u0003Vl°çE\u0080\u0005Ø¾£ìy;ÎÏ¶Õ\u001fêÃ¸fÝeoÕ\r°^·\u0087ÿ|\u00adÂ£Ò\u0097rÝr]Oí\u009aÌH\u0091\u0094\u001cùà§¶ÀÔ§\\Ë¼û¸";
                     int var5 = "¦\u009bÔîÈ\u0016na¶8ÛP\u0011bèlï.ó\u00158\u0010\u0014òÖ\u0080·# \nY<~Ê\u0089¼\u009a\u008a¯/\u0084\\/y®ËQ\u0087\u0014Ìþ\u0092$ºµú/Aú«>).\u0010,«\u0002Ï\u0004\u009cÁÍP]s}ì\u0085\u0099Ä-~d\u0088Ééh9z\u0081\u0080òºkPÁÐÁ\u0013réï¿Çé\u0006²Dä_i(w\fÐQ¶#N\u0083\u009c´}¤\u0016 Äº\u009a\u001cwA\u008d\u0080Ê\u009fÇ«]S¾/$S\u000fù\u0087AÁ©·ÇK\u001fûe\u0011ñ[Æ\u008e£Ðåû½EÏ½\u008c¶$gÜ¸Bc\u0002\u009c\u0017Ì\u0007\u000fõ\u0096\u008cZ\u0084Ö<Ãv\u00ad´TÝÚ\u0015\u0005O¥Iê¨üKýZ15Äaö\u0088\u0095\u0080Hn\u0094Ý\u001fïô\u001bÖ\u0091LmrkÖ\u0014Y<»\u0017\u0091\nà5\tþ\u00adÛ\\H\u0014h\u000e(\u009fóß\u0006½ºbiòi®éÂ%\u00162dØ©ô\u009c\u0000\u008a¦¢³\u00036\"¼\u0080N³;Ð\u0094L\"\u001a\"Q\u0017\u009fÓó\u0015ã\u0082ò'\u001cý\u00031RV\u009bç0 ¯^= c÷ö\u001d¿\u009dn\u0091Ó\u007fF\u0089Ý\u001dà\u009f2²îëþ\u000eÞ\u0002±P[w\u0086Ëj=ë÷¦\u0006NlMSÈ(âk\u009dÔ}Ä\u0011Kgñ\u009f\u0087àªó\u0095\u001c¹aþØ¦FêWp\u0019(d³JSQ¬u\u0000\u009e\u0003Vl°çE\u0080\u0005Ø¾£ìy;ÎÏ¶Õ\u001fêÃ¸fÝeoÕ\r°^·\u0087ÿ|\u00adÂ£Ò\u0097rÝr]Oí\u009aÌH\u0091\u0094\u001cùà§¶ÀÔ§\\Ë¼û¸"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var28 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var29 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var56 = var39 ^ var0;
                           switch (var47) {
                              case 0:
                                 var19[var29] = var56;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[59];
                                    int[] var20 = new int[a(26832, 4748265326764082090L)];
                                    var20[0] = 0;
                                    var20[1] = 1;
                                    var20[2] = 3;
                                    var20[3] = a(14864, 6734652441806836052L);
                                    var20[4] = a(4909, 5471805779499235418L);
                                    var20[5] = a(16572, 6474331508880731111L);
                                    var20[a(30862, 773978373744841679L)] = a(2428, 5954139560404492816L);
                                    var20[a(14864, 6734652441806836052L)] = a(4717, 6259525846662953265L);
                                    var20[a(7338, 6287363142098368510L)] = a(12757, 3571799317012224677L);
                                    var20[a(9290, 5204385231924629297L)] = a(1805, 7902106074661891151L);
                                    var20[a(15895, 6947442459787826552L)] = a(9944, 7199207393198935444L);
                                    var20[a(18513, 3728649253815608091L)] = a(11484, 4998309385252931475L);
                                    var20[a(20731, 695988018334235525L)] = a(13064, 6059802835466688631L);
                                    var20[a(10658, 3831658441717809856L)] = a(1438, 3464531462867332843L);
                                    var20[a(29366, 4843262844623149504L)] = a(11244, 6980981796817535140L);
                                    var20[a(31445, 30879635545739669L)] = a(28848, 5624076865681906653L);
                                    var20[a(32511, 1230210044097811866L)] = a(474, 4390235326533347993L);
                                    M = var20;
                                    int[] var21 = new int[a(31504, 6243033353845493853L)];
                                    var21[0] = a(32511, 1230210044097811866L);
                                    var21[1] = a(21199, 1355574930882591141L);
                                    var21[2] = a(29632, 4870013022758033582L);
                                    var21[3] = 0;
                                    var21[4] = a(7338, 6287363142098368510L);
                                    var21[5] = a(14864, 6734652441806836052L);
                                    var21[a(30862, 773978373744841679L)] = a(9290, 5204385231924629297L);
                                    var21[a(14864, 6734652441806836052L)] = a(30862, 773978373744841679L);
                                    var21[a(7338, 6287363142098368510L)] = a(15895, 6947442459787826552L);
                                    var21[a(9290, 5204385231924629297L)] = 5;
                                    var21[a(15895, 6947442459787826552L)] = a(18513, 3728649253815608091L);
                                    var21[a(18513, 3728649253815608091L)] = 4;
                                    var21[a(4883, 8764703379816790086L)] = a(4883, 8764703379816790086L);
                                    var21[a(13709, 7837418196586405588L)] = 3;
                                    var21[a(29366, 4843262844623149504L)] = a(13709, 7837418196586405588L);
                                    var21[a(31445, 30879635545739669L)] = 2;
                                    var21[a(32511, 1230210044097811866L)] = a(29366, 4843262844623149504L);
                                    var21[a(21199, 1355574930882591141L)] = 1;
                                    var21[a(29632, 4870013022758033582L)] = a(31445, 30879635545739669L);
                                    b = var21;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var29] = var56;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Þ \u0088`Ò±ô\u0004\\\u0007Ü±\u000bÉ÷³";
                                 var5 = "Þ \u0088`Ò±ô\u0004\\\u0007Ü±\u000bÉ÷³".length();
                                 var2 = 0;
                           }

                           byte var30 = var2;
                           var2 += 8;
                           var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var29 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var46;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "¿\fxË\u009f\u0085\u00ad \u0098ééñ\u0002½]\u008b^¸\r&UZ]y\u008d¼\u008aÅ\u0019\u0082\u00adßÿk\u00033ðZî\u0099ý}%Ô¼ðü\u0080P\u008a²Kô\\";
                  var12 = "¿\fxË\u009f\u0085\u00ad \u0098ééñ\u0002½]\u008b^¸\r&UZ]y\u008d¼\u008aÅ\u0019\u0082\u00adßÿk\u00033ðZî\u0099ý}%Ô¼ðü\u0080P\u008a²Kô\\"
                     .length();
                  var9 = 28;
                  var17 = -1;
            }

            var10000 = 57;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}







